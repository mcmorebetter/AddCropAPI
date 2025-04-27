package com.github.teamhungry22.addcrop.core.listener.nexo;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.nexomc.nexo.api.events.NexoItemsLoadedEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class NexoLoadListener implements Listener {
    public NexoLoadListener(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    @EventHandler
    public void onNexoItemLoadEvent(NexoItemsLoadedEvent event) {
        throw new AddCropNotFoundException();
    }
}