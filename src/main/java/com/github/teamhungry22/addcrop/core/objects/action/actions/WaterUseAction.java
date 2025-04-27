package com.github.teamhungry22.addcrop.core.objects.action.actions;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.objects.action.Action;
import com.github.teamhungry22.addcrop.core.objects.item.WaterItem;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class WaterUseAction implements Action {
    public WaterUseAction(Player player, WaterItem waterItem, Location location) {
        throw new AddCropNotFoundException();
    }

    public void execute() {
        throw new AddCropNotFoundException();
    }

    private void waterUse(int x, int z, String amount) {
        throw new AddCropNotFoundException();
    }
}
