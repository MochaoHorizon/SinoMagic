# SinoMagic

*「七月流火，九月授衣，春日载阳，有鸣仓庚」*

[English](README_en.md) | [简体中文](README.md)

**中华魔法** —— 一个以中国传统饮食文化为主题的 **Minecraft 1.21.1 (NeoForge)** 模组，基于 **Farmer's Delight** 构建。

> **开发状态：早期开发中。** 模组已可构建并运行 —— 物品、方块、作物、世界生成、石磨机器与唱片均已实现；纹理与翻译仍在补充中。

## 内容范围

- 大豆加工链：大豆 → 豆荚 → 毛豆 → 大豆粉 → 豆浆 → 豆腐 → 毛豆腐／臭豆腐／烤豆腐／豆干 → 辣条
- 调味与液体：盐矿石 → 盐 → 卤汁 → 酱油 → 大豆油
- **石磨** 机器方块，用于把原料研磨成粉（GeckoLib 动画）
- 作物与世界生成：大豆、辣椒、盐矿石及其野生变种
- 配方：原版工作台、Farmer's Delight 的锅与菜板，以及可选的 **Create** 加工
- 用中文曲目替换原版背景音乐，另有 20 首唱片

## 运行需求

| 组件 | 版本 |
|---|---|
| Minecraft | 1.21.1 |
| NeoForge | 21.1.219 或更高 |
| Java | 21 |
| Farmer's Delight | 1.3.2 或更高 —— 运行时必需 |
| GeckoLib | 4.8.3 或更高 —— 运行时必需 |
| Create | 6.0.10 或更高 —— 可选 |

## 构建

```sh
./gradlew build        # 产物 -> build/libs/sinomagic-0.1.2.jar
./gradlew runClient    # 启动已加载本模组的开发客户端
./gradlew runData      # 重新生成物品模型与配方
```

用 IntelliJ IDEA 以 Gradle 项目方式打开本目录，即可获得 Minecraft 与 NeoForge 类的代码补全。

## 模组信息

| | |
|---|---|
| 显示名 | SinoMagic（中文名：中华魔法） |
| Mod ID | `sinomagic` |
| 包名 | `com.mochaohorizon.sinomagic` |
| 产物 | `sinomagic-0.1.2.jar` |

## 制作人员

- 一只带明球 (DMHR114514)
- 荧惑启明 (ExTetragon)
- 克劳德 (Cloud1232534)
- 之一

## 许可证

MIT —— 见 [LICENSE](LICENSE)。
