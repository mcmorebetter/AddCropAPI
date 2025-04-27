package com.github.teamhungry22.addcrop.core.objects.action;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.config.ConfigManager;
import com.github.teamhungry22.addcrop.core.config.data.*;
import com.github.teamhungry22.addcrop.core.objects.entity.EntityManager;
import com.github.teamhungry22.addcrop.core.objects.item.*;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.List;
import java.util.Map;

public class ActionManager {
    public ActionManager(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    public void executeCropSummon(Player player, Location location, String cropId) {
        throw new AddCropNotFoundException();
    }

    public void executeSummon(Player player, Location location, List<String> entityList) {
        throw new AddCropNotFoundException();
    }

    public void executeCropSummon(Player player, Location location, CropEntityData cropEntityData) {
        throw new AddCropNotFoundException();
    }

    public void executeMoleSummon(Player player, Location location, String moleId) {
        throw new AddCropNotFoundException();
    }

    public void executeMoleSummon(Player player, Location location, MoleData moleData) {
        throw new AddCropNotFoundException();
    }

    public void executeMealUse(Player player, MealItem mealItem, Location location, String cropId) {
        throw new AddCropNotFoundException();
    }

    public void executeMealUse(Player player, MealItem mealItem, Location location, CropData cropData) {
        throw new AddCropNotFoundException();
    }

    public void executeSeedPackUse(Player player, SeedPackItem seedPackItem, Location location) {
        throw new AddCropNotFoundException();
    }

    public void executeVanillaSeedPackUse(Player player, SeedPackItem seedPackItem, Location location) {
        throw new AddCropNotFoundException();
    }

    public void executeWaterUse(Player player, WaterItem waterItem, Location location) {
        throw new AddCropNotFoundException();
    }

    public void executeScytheUse(Player player, ScytheItem scytheItem, Location location) {
        throw new AddCropNotFoundException();
    }

    public void executeRakeUse(Player player, RakeItem rakeItem, Location location) {
        throw new AddCropNotFoundException();
    }

    public AddCrop getPlugin() {
        throw new AddCropNotFoundException();
    }

    public ConfigManager getConfigManager() {
        throw new AddCropNotFoundException();
    }

    public EntityManager getEntityManager() {
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

    public Map<String, MessageData> getMessageMap() {
        throw new AddCropNotFoundException();
    }
}
