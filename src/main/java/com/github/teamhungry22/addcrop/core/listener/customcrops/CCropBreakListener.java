package com.github.teamhungry22.addcrop.core.listener.customcrops;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.config.data.CropData;
import com.github.teamhungry22.addcrop.core.objects.item.ScytheItem;
import net.momirealms.customcrops.api.event.CropBreakEvent;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.List;

public class CCropBreakListener implements Listener {
    public CCropBreakListener(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }
    
    @EventHandler
    public void onCustomCropBreakEvent(CropBreakEvent event) {
        throw new AddCropNotFoundException();
    }

    private void BreakCrop(Player player, Location location, CropData cropData, List<String> randomList) {
        throw new AddCropNotFoundException();
    }

    private ScytheItem getScythe(Player player) {
        throw new AddCropNotFoundException();
    }
}