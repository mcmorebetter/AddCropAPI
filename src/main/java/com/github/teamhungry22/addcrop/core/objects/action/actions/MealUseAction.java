package com.github.teamhungry22.addcrop.core.objects.action.actions;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.config.data.CropData;
import com.github.teamhungry22.addcrop.core.objects.action.Action;
import com.github.teamhungry22.addcrop.core.objects.item.MealItem;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class MealUseAction implements Action {
    public MealUseAction(Player player, MealItem mealItem, Location location, CropData cropData) {
        throw new AddCropNotFoundException();
    }

    public void execute() {
        throw new AddCropNotFoundException();
    }

    private void mealUse(int x, int z, String growStage) {
        throw new AddCropNotFoundException();
    }
}
