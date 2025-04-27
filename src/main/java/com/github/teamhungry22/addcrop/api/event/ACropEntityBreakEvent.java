package com.github.teamhungry22.addcrop.api.event;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.line.Line;
import com.github.teamhungry22.addcrop.core.objects.entity.AddCropEntity;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ACropEntityBreakEvent extends Event implements Cancellable {
    public ACropEntityBreakEvent(Entity killer, AddCropEntity addCropEntity, List<Line> lineList) {
        throw new AddCropNotFoundException();
    }

    public Entity getKiller() {
        throw new AddCropNotFoundException();
    }

    public Entity getEntity() {
        throw new AddCropNotFoundException();
    }

    public List<Line> getLineList() {
        throw new AddCropNotFoundException();
    }

    public Location getLocation() {
        throw new AddCropNotFoundException();
    }

    public AddCropEntity getAddCropEntity() {
        throw new AddCropNotFoundException();
    }

    @Override
    public boolean isCancelled() {
        throw new AddCropNotFoundException();
    }

    @Override
    public void setCancelled(boolean cancel) {
        throw new AddCropNotFoundException();
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        throw new AddCropNotFoundException();
    }

    public static HandlerList getHandlerList() {
        throw new AddCropNotFoundException();
    }
}
