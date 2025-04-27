package com.github.teamhungry22.addcrop.core.objects.item;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class WaterItem extends AddCropItem {
    public WaterItem(ItemStack itemStack, String id, boolean infinite, List<String> permissionList, int costAmount, String amount, int range) {
        super(itemStack, "water", id, infinite, permissionList);
        throw new AddCropNotFoundException();
    }

    public int getCostAmount() {
        throw new AddCropNotFoundException();
    }

    public String getAmount() {
        throw new AddCropNotFoundException();
    }

    public int getRange() {
        throw new AddCropNotFoundException();
    }
}
