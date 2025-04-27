package com.github.teamhungry22.addcrop.core.objects.entity;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.entity.Entity;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class EntityManager {
    public EntityManager(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    public Optional<AddCropEntity> entity(Object obj) {
        throw new AddCropNotFoundException();
    }

    public Optional<AddCropEntity> loadEntity(Entity entity) {
        throw new AddCropNotFoundException();
    }

    public Optional<AddCropEntity> getEntity(UUID uuid) {
        throw new AddCropNotFoundException();
    }

    public void registerEntity(AddCropEntity entity) {
        throw new AddCropNotFoundException();
    }

    public void unregisterEntity(AddCropEntity entity, boolean suicide) {
        throw new AddCropNotFoundException();
    }

    public Map<UUID, AddCropEntity> getEntityMap() {
        throw new AddCropNotFoundException();
    }
}
