package com.github.teamhungry22.addcrop.api.event;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.objects.entity.AddCropEntity;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class ACropEntitySpawnEvent extends Event implements Cancellable {
    public ACropEntitySpawnEvent(Player player, AddCropEntity addCropEntity) {
        throw new AddCropNotFoundException();
    }

    public Player getPlayer() {
        throw new AddCropNotFoundException();
    }

    public Entity getEntity() {
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
