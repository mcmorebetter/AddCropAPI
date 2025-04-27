package com.github.teamhungry22.addcrop.core.line.lines;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.line.AbstractLine;
import com.github.teamhungry22.addcrop.core.line.Line;
import com.github.teamhungry22.addcrop.core.line.LineType;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.Map;

public class LineSound extends AbstractLine {
    public LineSound(Map<String, String> stringMap, boolean containsPAPI) {
        super(stringMap, containsPAPI);
        throw new AddCropNotFoundException();
    }

    public static LineSound build(Map<String, String> stringMap) {
        throw new AddCropNotFoundException();
    }

    private static LineSound parseLine(Map<String, String> stringMap) {
        throw new AddCropNotFoundException();
    }

    @Override
    public Line parsedPAPILine(Player player) {
        throw new AddCropNotFoundException();
    }

    @Override
    protected void lineMap(Map<String, Object> lineMap) {
        throw new AddCropNotFoundException();
    }

    @Override
    protected void run(Entity entity, Location location, Map<String, Object> lineMap) {
        throw new AddCropNotFoundException();
    }

    @Override
    public LineType getType() {
        throw new AddCropNotFoundException();
    }

    public String getSound() {
        throw new AddCropNotFoundException();
    }

    public void setSound(String sound) {
        throw new AddCropNotFoundException();
    }

    public String getVolume() {
        throw new AddCropNotFoundException();
    }

    public void setVolume(String volume) {
        throw new AddCropNotFoundException();
    }

    public String getPitch() {
        throw new AddCropNotFoundException();
    }

    public void setPitch(String pitch) {
        throw new AddCropNotFoundException();
    }
}
