package com.github.teamhungry22.addcrop.core.objects.action.actions;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.objects.action.Action;
import com.github.teamhungry22.addcrop.core.objects.action.ActionManager;
import com.github.teamhungry22.addcrop.core.objects.item.SeedPackItem;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class SeedPackUseAction implements Action {
    public SeedPackUseAction(ActionManager am, Player player, SeedPackItem seedPackItem, Location location) {
        throw new AddCropNotFoundException();
    }

    public void execute() {
        throw new AddCropNotFoundException();
    }

    private void seedPackUse(Player player, Location location, int x, int z, String cropId, String stage) {
        throw new AddCropNotFoundException();
    }
}
