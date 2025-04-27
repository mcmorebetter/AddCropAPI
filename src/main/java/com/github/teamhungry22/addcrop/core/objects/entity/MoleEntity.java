package com.github.teamhungry22.addcrop.core.objects.entity;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.entity.Entity;

public class MoleEntity extends AddCropEntity {
    public MoleEntity(Entity entity, String id, int stack) {
        super(entity, "MOLE");
        throw new AddCropNotFoundException();
    }

    public String getId() {
        throw new AddCropNotFoundException();
    }

    public int getStack() {
        throw new AddCropNotFoundException();
    }
}
