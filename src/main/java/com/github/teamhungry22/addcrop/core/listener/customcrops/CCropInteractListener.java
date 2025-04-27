package com.github.teamhungry22.addcrop.core.listener.customcrops;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import net.momirealms.customcrops.api.event.CropInteractEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class CCropInteractListener implements Listener {
    public CCropInteractListener(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    @EventHandler
    public void onCustomCropInteractEvent(CropInteractEvent event) {
        throw new AddCropNotFoundException();
    }
}