package com.github.teamhungry22.addcrop.core.objects.action.actions;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.objects.action.Action;
import com.github.teamhungry22.addcrop.core.objects.item.SeedPackItem;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class VanillaSeedPackUseAction implements Action {
    public VanillaSeedPackUseAction(Player player, SeedPackItem seedPackItem, Location location) {
        throw new AddCropNotFoundException();
    }

    public void execute() {
        throw new AddCropNotFoundException();
    }

    private void seedPackUse(int x, int z, String cropId, String stage) {
        throw new AddCropNotFoundException();
    }
}
