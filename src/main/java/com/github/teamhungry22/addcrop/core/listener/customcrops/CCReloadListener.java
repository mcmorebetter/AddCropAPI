package com.github.teamhungry22.addcrop.core.listener.customcrops;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import net.momirealms.customcrops.api.event.CustomCropsReloadEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class CCReloadListener implements Listener {
    public CCReloadListener(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    @EventHandler
    public void onCustomCropReloadEvent(CustomCropsReloadEvent event) {
        throw new AddCropNotFoundException();
    }
}
