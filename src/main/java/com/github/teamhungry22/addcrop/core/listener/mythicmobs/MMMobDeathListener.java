package com.github.teamhungry22.addcrop.core.listener.mythicmobs;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.line.Line;
import io.lumine.mythic.bukkit.events.MythicMobDeathEvent;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.List;

public class MMMobDeathListener implements Listener {
    public MMMobDeathListener(AddCrop plugin) {
        throw new AddCropNotFoundException();
    }

    @EventHandler
    public void onMythicMobDeathEvent(MythicMobDeathEvent event) {
        throw new AddCropNotFoundException();
    }

    private void executeLine(Player player, List<Line> lineList, Location location) {
        throw new AddCropNotFoundException();
    }
}