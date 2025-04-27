package com.github.teamhungry22.addcrop.core.listener;

import com.destroystokyo.paper.event.entity.EntityRemoveFromWorldEvent;
import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.line.Line;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.List;

public class EntityRemoveListener implements Listener {
    public EntityRemoveListener(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    @EventHandler
    public void onEntityRemoveEvent(EntityRemoveFromWorldEvent event) {
        throw new AddCropNotFoundException();
    }

    private void executeLine(Entity killer, List<Line> lineList, Location location) {
        throw new AddCropNotFoundException();
    }
}
