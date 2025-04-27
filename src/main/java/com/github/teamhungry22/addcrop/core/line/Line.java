package com.github.teamhungry22.addcrop.core.line;

import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.Map;

public interface Line {
    Map<String, String> getMap();
    void setMap(Map<String, String> stringMap);

    String getRepeat();
    void setRepeat(String repeat);

    Double getChance();
    void setChance(Double chance);

    String getTag();
    void setTag(String tag);

    boolean isForce();
    void setForce(boolean force);

    LineType getType();
    boolean isContainsPAPI();

    default Line parsedPAPILine(Player player) {
        return this;
    }

    void execute(Entity entity, Location location, boolean alreadyParsed);
}
