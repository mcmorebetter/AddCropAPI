package com.github.teamhungry22.addcrop.core.config.manager;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.config.YamlConfigLoader;
import com.github.teamhungry22.addcrop.core.config.data.CropData;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.Map;

public class CropConfigManager {
    public CropConfigManager(AddCrop plugin, YamlConfigLoader loader, YamlConfiguration config) {
        throw new AddCropNotFoundException();
    }

    public void load(String path) {
        throw new AddCropNotFoundException();
    }

    public void loadCropConfig(YamlConfiguration yaml, String filePath) {
        throw new AddCropNotFoundException();
    }

    public void setCropData(ConfigurationSection section, String id, String itemPath) {
        throw new AddCropNotFoundException();
    }

    public void clear() {
        throw new AddCropNotFoundException();
    }

    public Map<String, CropData> getCropMap() {
        throw new AddCropNotFoundException();
    }
}
