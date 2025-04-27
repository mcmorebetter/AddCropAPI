package com.github.teamhungry22.addcrop.core.listener.customcrops;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import net.momirealms.customcrops.api.event.PotInteractEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class CCPotInteractListener implements Listener {
    public CCPotInteractListener(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    @EventHandler
    public void onCustomCropPotInteractEvent(PotInteractEvent event) {
        throw new AddCropNotFoundException();
    }
}
