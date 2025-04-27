package com.github.teamhungry22.addcrop.core.listener.mythicmobs;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import io.lumine.mythic.bukkit.events.MythicReloadedEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class MMReloadListener implements Listener {
    public MMReloadListener(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    @EventHandler
    public void onMythicMobsReload(MythicReloadedEvent event) {
        throw new AddCropNotFoundException();
    }

    private void loadPlaceholders() {
        throw new AddCropNotFoundException();
    }

    private void registerPlaceholders() {
        throw new AddCropNotFoundException();
    }
}

