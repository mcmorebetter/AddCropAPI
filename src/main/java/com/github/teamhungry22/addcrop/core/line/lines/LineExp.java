package com.github.teamhungry22.addcrop.core.line.lines;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.line.AbstractLine;
import com.github.teamhungry22.addcrop.core.line.Line;
import com.github.teamhungry22.addcrop.core.line.LineType;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.Map;

public class LineExp extends AbstractLine {
    public LineExp(Map<String, String> stringMap, boolean containsPAPI) {
        super(stringMap, containsPAPI);
        throw new AddCropNotFoundException();
    }

    public static LineExp build(Map<String, String> stringMap) {
        throw new AddCropNotFoundException();
    }

    private static LineExp parseLine(Map<String, String> stringMap) {
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

    public String getExp() {
        throw new AddCropNotFoundException();
    }

    public void setExp(String exp) {
        throw new AddCropNotFoundException();
    }

    public String getGiveType() {
        throw new AddCropNotFoundException();
    }

    public void setGiveType(String giveType) {
        throw new AddCropNotFoundException();
    }

    public String getExpForm() {
        throw new AddCropNotFoundException();
    }

    public void setExpForm(String expForm) {
        throw new AddCropNotFoundException();
    }

    public String getAmount() {
        throw new AddCropNotFoundException();
    }

    public void setAmount(String amount) {
        throw new AddCropNotFoundException();
    }
}
