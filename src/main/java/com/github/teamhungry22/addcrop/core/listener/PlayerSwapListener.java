package com.github.teamhungry22.addcrop.core.listener;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

public class PlayerSwapListener implements Listener {
    public PlayerSwapListener(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    @EventHandler
    public void onPlayerSwapEvent(PlayerSwapHandItemsEvent event) {
        throw new AddCropNotFoundException();
    }
}
