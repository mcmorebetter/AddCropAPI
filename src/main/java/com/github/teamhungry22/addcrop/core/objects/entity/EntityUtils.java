package com.github.teamhungry22.addcrop.core.objects.entity;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.entity.Entity;

public class EntityUtils {
    public static Entity getEntityFromUUIDString(String uuidStr) {
        throw new AddCropNotFoundException();
    }

    public static <T> T loadPDC(Entity entity, String key, T defValue, String type) {
        throw new AddCropNotFoundException();
    }

    public static <T> T loadOrCreatePDC(Entity entity, String key, T defValue, String type) {
        throw new AddCropNotFoundException();
    }
}
