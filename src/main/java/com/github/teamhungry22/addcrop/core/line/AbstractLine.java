package com.github.teamhungry22.addcrop.core.line;

import com.github.teamhungry22.addcrop.api.event.LineEvent;
import com.github.teamhungry22.addcrop.core.line.lines.LineDrop;
import com.github.teamhungry22.addcrop.core.line.lines.LineExp;
import com.github.teamhungry22.addcrop.core.line.lines.LineSound;
import com.github.teamhungry22.addcrop.core.line.lines.LineSummon;
import com.github.teamhungry22.addcrop.core.util.MathUtils;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

public abstract class AbstractLine implements Line {
    protected Map<String, String> stringMap;
    protected String repeat = "1";
    protected Double chance = 100.0;
    protected String tag = "null";
    protected boolean force = false;
    protected final boolean containsPAPI;

    protected AbstractLine(Map<String, String> stringMap, boolean containsPAPI) {
        this.stringMap = stringMap;
        this.containsPAPI = containsPAPI;
    }

    @Override
    public Map<String, String> getMap() {
        return stringMap;
    }

    @Override
    public void setMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
    }

    @Override
    public String getRepeat() {
        return repeat;
    }

    @Override
    public void setRepeat(String repeat) {
        this.repeat = repeat;
    }

    @Override
    public Double getChance() {
        return chance;
    }

    @Override
    public void setChance(Double chance) {
        this.chance = chance;
    }

    @Override
    public String getTag() {
        return tag;
    }

    @Override
    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public boolean isForce() {
        return force;
    }

    @Override
    public void setForce(boolean force) {
        this.force = force;
    }

    @Override
    public boolean isContainsPAPI() {
        return containsPAPI;
    }

    @Override
    public void execute(Entity entity, Location location, boolean alreadyParsed) {
        AbstractLine line = (containsPAPI && entity instanceof Player player && !alreadyParsed) ? (AbstractLine) parsedPAPILine(player) : this;

        boolean success = line.isForce() || MathUtils.getChance(line.chance);
        LineResult lineResult = success ? LineResult.SUCCESS : LineResult.FAIL;

        int resultRepeat = success ? MathUtils.getRangeToInt(line.repeat, "-", 1) : 0;

        Map<String, Object> lineMap = loadLineMap(line, resultRepeat);
        line.lineMap(lineMap);

        LineEvent customEvent = new LineEvent(entity, location, lineResult, lineMap);
        Bukkit.getPluginManager().callEvent(customEvent);

        if (customEvent.isCancelled() || lineResult == LineResult.FAIL) {
            return;
        }

        line.run(entity, location, lineMap);
    }

    protected void lineMap(Map<String, Object> lineMap) {}
    protected abstract void run(Entity entity, Location location, Map<String, Object> lineMap);

    private Map<String, Object> loadLineMap(AbstractLine line, int resultRepeat) {
        Map<String, Object> lineMap = new HashMap<>();
        lineMap.put("line", line);
        lineMap.put("repeat", resultRepeat);
        lineMap.put("tag", tag);

        switch (line.getType()) {
            case DROP -> {
                int resultAmount = MathUtils.getRangeToInt(((LineDrop) line).getAmount(), "-", 1);
                lineMap.put("amount", resultAmount);
            }
            case EXP -> {
                Double resultAmount = MathUtils.getRangeToDouble(((LineExp) line).getAmount(), "-", 1.0);
                double resultAmount2 = Math.round(resultAmount * 10) / 10.0;
                lineMap.put("amount", resultAmount2);
            }
            case SOUND -> {
                float resultVolume = MathUtils.getRangeToFloat(((LineSound) line).getVolume(), "-", 1.0f);
                float resultPitch = MathUtils.getRangeToFloat(((LineSound) line).getPitch(), "-", 1.0f);
                lineMap.put("volume", resultVolume);
                lineMap.put("pitch", resultPitch);
            }
            case SUMMON -> {
                int resultAmount = MathUtils.getRangeToInt(((LineSummon) line).getAmount(), "-", 1);
                lineMap.put("amount", resultAmount);
            }
        }

        return lineMap;
    }
}
