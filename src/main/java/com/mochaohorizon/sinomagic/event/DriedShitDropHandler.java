package com.mochaohorizon.sinomagic.event;

import com.mochaohorizon.sinomagic.Config;
import com.mochaohorizon.sinomagic.SinoMagic;
import com.mochaohorizon.sinomagic.registry.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;

/**
 * 饥饿或中毒的玩家会周期性掉落「史」。
 *
 * <p>计时存在玩家的持久化数据里（{@code Entity#getPersistentData()}），记录的是「下次该掉落的游戏刻」，
 * 因此会随实体一起存档；时间基准取世界的 {@code getGameTime()}，跨会话连续。
 *
 * <p>节奏由 {@link Config} 的 {@code driedShit} 一组参数控制。速度倍率 = 效果类型倍率 × (1 + 每级加成 × 效果等级)，
 * 同时持有两种效果时取较快的一方，不叠加。
 */
@EventBusSubscriber(modid = SinoMagic.MOD_ID)
public class DriedShitDropHandler {
    /** 玩家持久化数据里的键，值为「下次该掉落的游戏刻」 */
    private static final String NEXT_TICK_KEY = "sinomagic:next_dried_shit_tick";

    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {
        if (!(event.getEntity() instanceof ServerPlayer player)) return;

        if (!Config.SHIT_ENABLED.get()) {
            // 关掉时顺手清掉计时，避免下次重新开启时立刻掉落一个
            player.getPersistentData().remove(NEXT_TICK_KEY);
            return;
        }

        double speed = Math.max(
                speedOf(player, MobEffects.POISON, Config.SHIT_POISON_SPEED_FACTOR.get()),
                speedOf(player, MobEffects.HUNGER, Config.SHIT_HUNGER_SPEED_FACTOR.get()));

        CompoundTag data = player.getPersistentData();
        if (speed <= 0.0D) {
            // 身上没有这两种效果，停止计时
            data.remove(NEXT_TICK_KEY);
            return;
        }

        long now = player.level().getGameTime();
        long interval = Math.max(1L, Math.round(Config.SHIT_BASE_INTERVAL.get() / speed));

        if (!data.contains(NEXT_TICK_KEY)) {
            // 首次进入该状态：只安排一个短延迟，不立刻掉落
            data.putLong(NEXT_TICK_KEY, now + firstDelay(interval));
            return;
        }

        long next = data.getLong(NEXT_TICK_KEY);
        if (now - next > interval * 2L) {
            // 带着效果退出过游戏，计时已失效，重新起算
            data.putLong(NEXT_TICK_KEY, now + firstDelay(interval));
            return;
        }
        if (now < next) return;

        // 不用 Player#drop —— 它会从眼睛高度生成并按视线方向抛出初速度，站着不动时可能够不着。
        // 直接造实体放在玩家脚下，只留一点拾取延迟。
        ItemEntity dropped = new ItemEntity(player.level(), player.getX(), player.getY(), player.getZ(),
                new ItemStack(ModItems.DRIED_SHIT.get()));
        dropped.setPickUpDelay(10);
        player.level().addFreshEntity(dropped);
        playDropFeedback(player);
        data.putLong(NEXT_TICK_KEY, now + nextInterval(player, interval));
    }

    /** 某个效果对应的速度倍率；未持有该效果时返回 0 */
    private static double speedOf(ServerPlayer player, Holder<MobEffect> effect, double factor) {
        MobEffectInstance instance = player.getEffect(effect);
        if (instance == null) return 0.0D;
        return factor * (1.0D + Config.SHIT_LEVEL_SPEED_PER_AMP.get() * instance.getAmplifier());
    }

    /** 首次掉落的延迟，取基础间隔的一个比例 */
    private static long firstDelay(long interval) {
        return Math.max(1L, Math.round(interval * Config.SHIT_FIRST_DELAY_RATIO.get()));
    }

    /** 下一次掉落的间隔，带随机抖动 */
    private static long nextInterval(ServerPlayer player, long interval) {
        double jitter = Config.SHIT_JITTER.get();
        double factor = 1.0D + (player.getRandom().nextDouble() * 2.0D - 1.0D) * jitter;
        return Math.max(1L, Math.round(interval * factor));
    }

    /** 掉落反馈的接入点；音效与粒子素材就绪后再实现 */
    private static void playDropFeedback(ServerPlayer player) {
        // TODO 音效 / 粒子
    }
}
