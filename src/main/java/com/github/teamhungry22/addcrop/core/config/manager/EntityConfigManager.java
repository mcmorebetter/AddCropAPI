package com.github.teamhungry22.addcrop.core.config.manager;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.config.YamlConfigLoader;
import com.github.teamhungry22.addcrop.core.config.data.CropEntityData;
import com.github.teamhungry22.addcrop.core.config.data.EntityData;
import com.github.teamhungry22.addcrop.core.config.data.MoleData;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.Map;

public class EntityConfigManager {
    public EntityConfigManager(AddCrop plugin, YamlConfigLoader loader, YamlConfiguration config) {
        throw new AddCropNotFoundException();
    }

    public void load(String path) {
        throw new AddCropNotFoundException();
    }

    public void loadEntityConfig(YamlConfiguration yaml, String filePath) {
        throw new AddCropNotFoundException();
    }

    public void setCropEntityData(ConfigurationSection section, String id, String itemPath) {
        throw new AddCropNotFoundException();
    }

    public void setMoleData(ConfigurationSection section, String id, String itemPath) {
        throw new AddCropNotFoundException();
    }

    public void clear() {
        throw new AddCropNotFoundException();
    }

    public Map<String, CropEntityData> getCropEntityMap() {
        throw new AddCropNotFoundException();
    }

    public Map<String, MoleData> getMoleMap() {
        throw new AddCropNotFoundException();
    }

    public Map<String, EntityData> getEntityMap() {
        throw new AddCropNotFoundException();
    }
}
