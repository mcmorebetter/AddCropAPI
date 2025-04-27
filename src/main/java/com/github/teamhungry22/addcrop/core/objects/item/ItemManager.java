package com.github.teamhungry22.addcrop.core.objects.item;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.inventory.ItemStack;

import java.util.Optional;

public class ItemManager {
    public ItemManager(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    public Optional<AddCropItem> item(Object obj) {
        throw new AddCropNotFoundException();
    }

    public Optional<AddCropItem> loadItem(ItemStack itemStack) {
        throw new AddCropNotFoundException();
    }

    public Optional<AddCropItem> getItem(String itemName) {
        throw new AddCropNotFoundException();
    }

    private AddCropItem getAddCropItem(String type, String id) {
        throw new AddCropNotFoundException();
    }
}
