package com.github.teamhungry22.addcrop.core.line.lines;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.line.AbstractLine;
import com.github.teamhungry22.addcrop.core.line.Line;
import com.github.teamhungry22.addcrop.core.line.LineType;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Map;

public class LineDrop extends AbstractLine {
    public LineDrop(Map<String, String> stringMap, boolean containsPAPI, String configDropType) {
        super(stringMap, containsPAPI);
        throw new AddCropNotFoundException();
    }

    public static LineDrop build(Map<String, String> stringMap, String configDropType) {
        throw new AddCropNotFoundException();
    }

    private static LineDrop parseLine(Map<String, String> stringMap, String configDropType) {
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

    public ItemStack getItemStack() {
        throw new AddCropNotFoundException();
    }

    public void setItemStack(ItemStack itemStack) {
        throw new AddCropNotFoundException();
    }

    public String getAmount() {
        throw new AddCropNotFoundException();
    }

    public void setAmount(String amount) {
        throw new AddCropNotFoundException();
    }

    public String getDropType() {
        throw new AddCropNotFoundException();
    }

    public void setDropType(String dropType) {
        throw new AddCropNotFoundException();
    }

    public String getConfigDropType() {
        throw new AddCropNotFoundException();
    }
}
