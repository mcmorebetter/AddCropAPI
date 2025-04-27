package com.github.teamhungry22.addcrop.core.listener.itemsadder;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import dev.lone.itemsadder.api.Events.ItemsAdderLoadDataEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class ItemsAdderLoadListener implements Listener {
    public ItemsAdderLoadListener(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    @EventHandler
    public void onItemsAdderLoadEvent(ItemsAdderLoadDataEvent event) {
        throw new AddCropNotFoundException();
    }
}
