package com.github.teamhungry22.addcrop.core.line.lines;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.line.AbstractLine;
import com.github.teamhungry22.addcrop.core.line.Line;
import com.github.teamhungry22.addcrop.core.line.LineType;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.Map;

public class LineSummon extends AbstractLine {
    public LineSummon(Map<String, String> stringMap, boolean containsPAPI) {
        super(stringMap, containsPAPI);
        throw new AddCropNotFoundException();
    }

    public static LineSummon build(Map<String, String> stringMap) {
        throw new AddCropNotFoundException();
    }

    private static LineSummon parseLine(Map<String, String> stringMap) {
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

    private void summon(Entity owner, Location location) {
        throw new AddCropNotFoundException();
    }

    private void vanillaSummon(String entityName, Location location) {
        throw new AddCropNotFoundException();
    }

    private void addCropSummon(Entity entity, String mobName, Location location) {
        throw new AddCropNotFoundException();
    }

    private Location loadLocation(Entity entity, String locationLine) {
        throw new AddCropNotFoundException();
    }

    @Override
    public LineType getType() {
        throw new AddCropNotFoundException();
    }

    public String getEntity() {
        throw new AddCropNotFoundException();
    }

    public void setEntity(String entity) {
        throw new AddCropNotFoundException();
    }

    public String getAmount() {
        throw new AddCropNotFoundException();
    }

    public void setAmount(String amount) {
        throw new AddCropNotFoundException();
    }

    public String getLocationType() {
        throw new AddCropNotFoundException();
    }

    public void setLocationType(String locationType) {
        throw new AddCropNotFoundException();
    }
}
