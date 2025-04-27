package com.github.teamhungry22.addcrop.core.objects.gui;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.Collection;

public class ItemListInventory implements InventoryHolder {
    public ItemListInventory(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    public void loadItems(String type, boolean isReset) {
        throw new AddCropNotFoundException();
    }

    public void setPage(Integer page, boolean isForce) {
        throw new AddCropNotFoundException();
    }

    @NotNull
    @Override
    public Inventory getInventory() {
        throw new AddCropNotFoundException();
    }

    public String getType() {
        throw new AddCropNotFoundException();
    }

    private <T> void getItemList(Collection<T> collection) {
        throw new AddCropNotFoundException();
    }

    private void loadPageIcon() {
        throw new AddCropNotFoundException();
    }

    private ItemStack getIcon(String name, int size) {
        throw new AddCropNotFoundException();
    }

    private ItemStack getPageIcon(String pageType, Integer page) {
        throw new AddCropNotFoundException();
    }

    private int getSize() {
        throw new AddCropNotFoundException();
    }
}

