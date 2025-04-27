package com.github.teamhungry22.addcrop.api.event;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

public class ScytheUseEvent extends Event implements Cancellable {
    public ScytheUseEvent(Player player, Location location, ItemStack itemStack, int range) {
        throw new AddCropNotFoundException();
    }

    public Player getPlayer() {
        throw new AddCropNotFoundException();
    }

    public Location getLocation() {
        throw new AddCropNotFoundException();
    }

    public ItemStack getItemStack() {
        throw new AddCropNotFoundException();
    }

    public int getRange() {
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
