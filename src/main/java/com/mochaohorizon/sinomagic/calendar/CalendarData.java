package com.mochaohorizon.sinomagic.util;

import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.saveddata.SavedData;

public class CalendarData extends SavedData {
    //初始化
    //100s 20min 10h 5d
    public int shichen = 1, day = 1, month = 1, year = 0, jieqi = 1, season = 1;
    public long totalSeconds = 0L;
    public long lastRunMillis = 0L;

    public CalendarData() {}

    public static CalendarData load(CompoundTag tag, HolderLookup.Provider p) {
        CalendarData d = new CalendarData();
        d.year = tag.getInt("year");
        d.month = tag.getInt("month");
        d.day = tag.getInt("day");
        d.shichen = tag.getInt("shichen");
        d.season = tag.getInt("season");
        d.jieqi = tag.getInt("jieqi");
        d.totalSeconds = tag.getLong("totalSeconds");
        d.lastRunMillis = tag.getLong("lastRunMillis");
        return d;
    }

    @Override
    public CompoundTag save(CompoundTag tag, HolderLookup.Provider p) {
        tag.putInt("year", year);
        tag.putInt("month", month);
        tag.putInt("day", day);
        tag.putInt("shichen", shichen);
        tag.putInt("season", season);
        tag.putInt("jieqi", jieqi);
        tag.putLong("totalSeconds", totalSeconds);
        tag.putLong("lastRunMillis", lastRunMillis);
        return tag;
    }

    public static final SavedData.Factory<CalendarData> FACTORY =
            new SavedData.Factory<>(CalendarData::new, CalendarData::load, null);
}