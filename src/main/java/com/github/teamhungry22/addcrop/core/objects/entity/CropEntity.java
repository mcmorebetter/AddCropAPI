package com.github.teamhungry22.addcrop.core.objects.entity;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.entity.Entity;

public class CropEntity extends AddCropEntity {
    public CropEntity(Entity entity, String crop, String modelId, boolean cancelDrop, boolean naturalDrop, int stack) {
        super(entity, "CROP");
        throw new AddCropNotFoundException();
    }

    public void addStack(int add) {
        throw new AddCropNotFoundException();
    }

    public String getCrop() {
        throw new AddCropNotFoundException();
    }

    public String getModelId() {
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

    public int getMaxStack() {
        throw new AddCropNotFoundException();
    }
}
