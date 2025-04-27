package com.github.teamhungry22.addcrop.core.config.data;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;

import java.util.List;

public class CropEntityData extends EntityData {
    public CropEntityData(String id, String type, String model, List<String> spawnStateList, List<String> boomStateList, String amount, double time, String size, boolean naturalDrop, boolean glowEnabled, String glowColor, double boomChance, List<String> entityList, boolean cancelDrop, int stack, List<String> resultList) {
        super(id, type, amount, 1000, 0, time, resultList);
        throw new AddCropNotFoundException();
    }

    public CropType getCropType() {
        throw new AddCropNotFoundException();
    }

    public String getModel() {
        throw new AddCropNotFoundException();
    }

    public List<String> getSpawnStateList() {
        throw new AddCropNotFoundException();
    }

    public List<String> getBoomStateList() {
        throw new AddCropNotFoundException();
    }

    public String getSize() {
        throw new AddCropNotFoundException();
    }

    public boolean isGlowEnabled() {
        throw new AddCropNotFoundException();
    }

    public String getGlowColor() {
        throw new AddCropNotFoundException();
    }

    public double getBoomChance() {
        throw new AddCropNotFoundException();
    }

    public List<String> getEntityList() {
        throw new AddCropNotFoundException();
    }

    public boolean isCancelDrop() {
        throw new AddCropNotFoundException();
    }

    public boolean isNaturalDrop() {
        throw new AddCropNotFoundException();
    }

    public int getStack() {
        throw new AddCropNotFoundException();
    }
}
