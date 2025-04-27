package com.github.teamhungry22.addcrop.api.event;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.line.LineResult;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.util.Map;

public class LineEvent extends Event implements Cancellable {
    public LineEvent(Entity entity, Location location, LineResult lineResult, Map<String, Object> line) {
        throw new AddCropNotFoundException();
    }

    public Entity getEntity() {
        throw new AddCropNotFoundException();
    }

    public Location getLocation() {
        throw new AddCropNotFoundException();
    }

    public LineResult getLineResult() {
        throw new AddCropNotFoundException();
    }

    public Map<String, Object> getLine() {
        throw new AddCropNotFoundException();
    }

    @Override
    public boolean isCancelled() {
        throw new AddCropNotFoundException();
    }

    @Override
    public void setCancelled(boolean cancel) {
        throw new  AddCropNotFoundException();
    }

    @Override
    public HandlerList getHandlers() {
        throw new AddCropNotFoundException();
    }

    public static HandlerList getHandlerList() {
        throw new AddCropNotFoundException();
    }
}