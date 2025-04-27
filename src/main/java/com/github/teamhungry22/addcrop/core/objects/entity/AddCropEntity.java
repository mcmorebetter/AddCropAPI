package com.github.teamhungry22.addcrop.core.objects.entity;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import io.lumine.mythic.core.mobs.ActiveMob;
import org.bukkit.entity.Entity;

public class AddCropEntity {
    public AddCropEntity(Entity entity, String entityType) {
        throw new AddCropNotFoundException();
    }

    public Entity getEntity() {
        throw new AddCropNotFoundException();
    }

    public void setEntity(Entity entity) {
        throw new AddCropNotFoundException();
    }

    public ActiveMob getActiveMob() {
        throw new AddCropNotFoundException();
    }

    public void setActiveMob(ActiveMob activeMob) {
        throw new AddCropNotFoundException();
    }

    public EntityType getEntityType() {
        throw new AddCropNotFoundException();
    }

    public void setEntityType(EntityType entityType) {
        throw new AddCropNotFoundException();
    }
}
