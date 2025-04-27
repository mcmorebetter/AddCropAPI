package com.github.teamhungry22.addcrop.core.line.lines;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.line.Line;
import com.github.teamhungry22.addcrop.core.line.LineType;
import org.bukkit.Location;
import org.bukkit.entity.Entity;

import java.util.List;
import java.util.Map;

public class LineList implements Line {
    public LineList(List<Line> lines) {
        throw new AddCropNotFoundException();
    }

    @Override
    public Map<String, String> getMap() {
        throw new AddCropNotFoundException();
    }

    @Override
    public void setMap(Map<String, String> stringMap) {}

    @Override
    public String getRepeat() {
        throw new AddCropNotFoundException();
    }

    @Override
    public void setRepeat(String repeat) {}

    @Override
    public Double getChance() {
        throw new AddCropNotFoundException();
    }

    @Override
    public void setChance(Double chance) {}

    @Override
    public String getTag() {
        throw new AddCropNotFoundException();
    }

    @Override
    public void setTag(String tag) {}

    @Override
    public boolean isForce() {
        throw new AddCropNotFoundException();
    }

    @Override
    public void setForce(boolean force) {}

    @Override
    public boolean isContainsPAPI() {
        throw new AddCropNotFoundException();
    }

    @Override
    public void execute(Entity entity, Location location, boolean alreadyParsed) {
        throw new AddCropNotFoundException();
    }

    @Override
    public LineType getType() {
        throw new AddCropNotFoundException();
    }
}
