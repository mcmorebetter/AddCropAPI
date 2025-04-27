package com.github.teamhungry22.addcrop.core.compatibility.itemsadder;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import dev.lone.itemsadder.api.CustomStack;
import org.bukkit.inventory.ItemStack;

public class IAUtils {
    public static CustomStack getCustomStack(String namespaceID) {
        throw new AddCropNotFoundException();
    }

    public static CustomStack getCustomStack(ItemStack itemStack) {
        throw new AddCropNotFoundException();
    }

    public static ItemStack getItemsAdderItem(String namespaceID) {
        throw new AddCropNotFoundException();
    }
}
