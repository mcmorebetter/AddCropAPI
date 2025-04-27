package com.github.teamhungry22.addcrop.core.objects.item;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class SeedPackItem extends AddCropItem {
    public SeedPackItem(ItemStack itemStack, String id, boolean infinite, List<String> permissionList, int costAmount, int range) {
        super(itemStack, "seed_pack", id, infinite, permissionList);
        throw new AddCropNotFoundException();
    }

    public int getCostAmount() {
        throw new AddCropNotFoundException();
    }

    public int getRange() {
        throw new AddCropNotFoundException();
    }

    public String getCrop() {
        throw new AddCropNotFoundException();
    }

    public void setCrop(String crop) {
        throw new AddCropNotFoundException();
    }

    public String getStage() {
        throw new AddCropNotFoundException();
    }

    public void setStage(String stage) {
        throw new AddCropNotFoundException();
    }
}
