package com.github.teamhungry22.addcrop.core.line.lines;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.line.AbstractLine;
import com.github.teamhungry22.addcrop.core.line.Line;
import com.github.teamhungry22.addcrop.core.line.LineType;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Map;

public class LineSkill extends AbstractLine {
    public LineSkill(Map<String, String> stringMap, boolean containsPAPI) {
        super(stringMap, containsPAPI);
        throw new AddCropNotFoundException();
    }

    public static LineSkill build(Map<String, String> stringMap) {
        throw new AddCropNotFoundException();
    }

    private static LineSkill parseLine(Map<String, String> stringMap) {
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

    public String getSkill() {
        throw new AddCropNotFoundException();
    }

    public void setSkill(String skill) {
        throw new AddCropNotFoundException();
    }

    public List<String> getParameters() {
        throw new AddCropNotFoundException();
    }

    public void setParameters(List<String> parameters) {
        throw new AddCropNotFoundException();
    }
}
