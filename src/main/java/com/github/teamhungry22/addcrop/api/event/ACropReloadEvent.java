package com.github.teamhungry22.addcrop.api.event;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.command.ReloadType;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class ACropReloadEvent extends Event implements Cancellable {
    public ACropReloadEvent(ReloadType reloadType) {
        throw new AddCropNotFoundException();
    }

    public ReloadType getReloadType() {
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
