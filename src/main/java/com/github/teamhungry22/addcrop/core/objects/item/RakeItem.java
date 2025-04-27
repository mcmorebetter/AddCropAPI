package com.github.teamhungry22.addcrop.core.objects.item;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class RakeItem extends AddCropItem {
    public RakeItem(ItemStack itemStack, String id, String toolType, boolean infinite, List<String> permissionList, int range, int durabilityAmount) {
        super(itemStack, toolType, id, infinite, permissionList);
        throw new AddCropNotFoundException();
    }

    public int getRange() {
        throw new AddCropNotFoundException();
    }

    public int getDurabilityAmount() {
        throw new AddCropNotFoundException();
    }
}
