package com.github.teamhungry22.addcrop.core.listener;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.objects.gui.ItemListInventory;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class PlayerInventoryListener implements Listener {
    @EventHandler
    public void onPlayerInventoryClick(InventoryClickEvent event) {
        throw new AddCropNotFoundException();
    }

    private void handleItemListInventory(InventoryClickEvent event, Player player, ItemListInventory itemListInventory) {
        throw new AddCropNotFoundException();
    }

    private boolean isPlayerInventory(InventoryClickEvent event, Player player) {
        throw new AddCropNotFoundException();
    }

    private void changePage(ItemListInventory itemListInventory, int value) {
        throw new AddCropNotFoundException();
    }

    private void giveItem(InventoryClickEvent event, Player player) {
        throw new AddCropNotFoundException();
    }
}
