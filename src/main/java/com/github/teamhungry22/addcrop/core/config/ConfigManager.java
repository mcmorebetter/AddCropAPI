package com.github.teamhungry22.addcrop.core.config;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.command.ReloadType;
import com.github.teamhungry22.addcrop.core.config.data.*;
import com.github.teamhungry22.addcrop.core.config.manager.*;
import com.github.teamhungry22.addcrop.core.objects.item.*;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.List;
import java.util.Map;

public class ConfigManager {
    public ConfigManager(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    public void firstLoad() {
        throw new AddCropNotFoundException();
    }

    public void reload(ReloadType reloadType) {
        throw new AddCropNotFoundException();
    }

    private void loadCropCacheList() {
        throw new AddCropNotFoundException();
    }

    private void clearData() {
        throw new AddCropNotFoundException();
    }

    private void createFiles() {
        throw new AddCropNotFoundException();
    }

    private void reloadMessage() {
        throw new AddCropNotFoundException();
    }

    public YamlConfigLoader getLoader() {
        throw new AddCropNotFoundException();
    }

    public YamlConfiguration getConfig() {
        throw new AddCropNotFoundException();
    }

    public YamlConfiguration getMessageConfig() {
        throw new AddCropNotFoundException();
    }

    public MessageConfigManager getMessageManager() {
        throw new AddCropNotFoundException();
    }

    public CropConfigManager getCropManager() {
        throw new AddCropNotFoundException();
    }

    public EntityConfigManager getEntityManager() {
        throw new AddCropNotFoundException();
    }

    public ItemConfigManager getItemManager() {
        throw new AddCropNotFoundException();
    }

    public ToolConfigManager getToolManager() {
        throw new AddCropNotFoundException();
    }

    public Map<String, MessageData> getMessageMap() {
        throw new AddCropNotFoundException();
    }

    public Map<String, CropData> getCropMap() {
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

    public Map<String, ScytheItem> getScytheMap() {
        throw new AddCropNotFoundException();
    }

    public Map<String, RakeItem> getRakeMap() {
        throw new AddCropNotFoundException();
    }

    public Map<String, AddCropItem> getToolMap() {
        throw new AddCropNotFoundException();
    }

    public List<String> getCropCacheList() {
        throw new AddCropNotFoundException();
    }

    public boolean isAutoReload() {
        throw new AddCropNotFoundException();
    }

    public String getDropType() {
        throw new AddCropNotFoundException();
    }

    public List<String> getCropRandomList() {
        throw new AddCropNotFoundException();
    }

    public List<String> getPotRandomList() {
        throw new AddCropNotFoundException();
    }
}
