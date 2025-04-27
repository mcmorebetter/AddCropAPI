package com.github.teamhungry22.addcrop.core.listener.addcrop;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.objects.entity.CropEntity;
import com.github.teamhungry22.addcrop.core.objects.item.RakeItem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import java.util.UUID;

public class ACropInteractListener implements Listener {
    public ACropInteractListener(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    @EventHandler
    public void onInteractEvent(PlayerInteractEntityEvent event) {
        throw new AddCropNotFoundException();
    }

    @EventHandler
    public void onDamageEvent(EntityDamageByEntityEvent event) {
        throw new AddCropNotFoundException();
    }

    private void breakAddCrop(CropEntity cropEntity, UUID killerUUID, boolean cancelDrop) {
        throw new AddCropNotFoundException();
    }

    private RakeItem getRake(Player player) {
        throw new AddCropNotFoundException();
    }
}
