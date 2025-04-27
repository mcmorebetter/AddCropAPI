package com.github.teamhungry22.addcrop.core.objects.item;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class MealItem extends AddCropItem {
    public MealItem(ItemStack itemStack, String id, boolean infinite, List<String> permissionList, int costAmount, String stage, int range) {
        super(itemStack, "meal", id, infinite, permissionList);
        throw new AddCropNotFoundException();
    }

    public int getCostAmount() {
        throw new AddCropNotFoundException();
    }

    public String getStage() {
        throw new AddCropNotFoundException();
    }

    public int getRange() {
        throw new AddCropNotFoundException();
    }
}
