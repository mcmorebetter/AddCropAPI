package com.github.teamhungry22.addcrop.core.config.manager;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.config.YamlConfigLoader;
import com.github.teamhungry22.addcrop.core.objects.item.AddCropItem;
import com.github.teamhungry22.addcrop.core.objects.item.MealItem;
import com.github.teamhungry22.addcrop.core.objects.item.SeedPackItem;
import com.github.teamhungry22.addcrop.core.objects.item.WaterItem;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.Map;

public class ItemConfigManager {
    public ItemConfigManager(AddCrop plugin, YamlConfigLoader loader, YamlConfiguration config) {
        throw new AddCropNotFoundException();
    }

    public void load(String path) {
        throw new AddCropNotFoundException();
    }

    public void loadItemConfig(YamlConfiguration yaml, String filePath) {
        throw new AddCropNotFoundException();
    }

    public void setSeedPackItem(ConfigurationSection section, String id, String itemPath) {
        throw new AddCropNotFoundException();
    }

    public void setMealItem(ConfigurationSection section, String id, String itemPath) {
        throw new AddCropNotFoundException();
    }

    public void setWaterItem(ConfigurationSection section, String id, String itemPath) {
        throw new AddCropNotFoundException();
    }

    public void clear() {
        throw new AddCropNotFoundException();
    }

    public Map<String, SeedPackItem> getSeedPackMap() {
        throw new AddCropNotFoundException();
    }

    public Map<String, MealItem> getMealMap() {
        throw new AddCropNotFoundException();
    }

    public Map<String, WaterItem> getWaterMap() {
        throw new AddCropNotFoundException();
    }

    public Map<String, AddCropItem> getItemMap() {
        throw new AddCropNotFoundException();
    }
}
