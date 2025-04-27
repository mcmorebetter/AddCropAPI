package com.github.teamhungry22.addcrop.core.config.manager;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.config.YamlConfigLoader;
import com.github.teamhungry22.addcrop.core.objects.item.AddCropItem;
import com.github.teamhungry22.addcrop.core.objects.item.RakeItem;
import com.github.teamhungry22.addcrop.core.objects.item.ScytheItem;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.Map;

public class ToolConfigManager {
    public ToolConfigManager(AddCrop plugin, YamlConfigLoader loader, YamlConfiguration config) {
        throw new AddCropNotFoundException();
    }

    public void load(String path) {
        throw new AddCropNotFoundException();
    }

    public void loadToolConfig(YamlConfiguration yaml, String filePath) {
        throw new AddCropNotFoundException();
    }

    public void setScytheItem(ConfigurationSection section, ConfigurationSection toolSection, String toolType, String id, String itemPath) {
        throw new AddCropNotFoundException();
    }

    public void setRakeItem(ConfigurationSection section, ConfigurationSection toolSection, String toolType, String id, String itemPath) {
        throw new AddCropNotFoundException();
    }

    public void clear() {
        throw new AddCropNotFoundException();
    }

    public Map<String, ScytheItem> getScytheMap() {
        throw new AddCropNotFoundException();
    }

    public Map<String, RakeItem> getRakeMap() {
        throw new AddCropNotFoundException();
    }

    public Map<String, AddCropItem> getToolMap() {
        throw new AddCropNotFoundException();
    }
}
