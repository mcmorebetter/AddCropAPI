package com.github.teamhungry22.addcrop.core.compatibility.modelengine;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.ticxo.modelengine.api.model.ActiveModel;
import com.ticxo.modelengine.api.model.ModeledEntity;
import org.bukkit.entity.Entity;

import java.util.Map;
import java.util.Optional;

public class ModelUtils {
    public static boolean hasBBModel(String modelName) {
        throw new AddCropNotFoundException();
    }

    public static ModeledEntity getModeledEntity(Entity entity) {
        throw new AddCropNotFoundException();
    }

    public static Optional<ActiveModel> getActiveModel(Entity entity, String modelId) {
        throw new AddCropNotFoundException();
    }

    public static Map<String, ActiveModel> getActiveModels(Entity entity) {
        throw new AddCropNotFoundException();
    }
}
