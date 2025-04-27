package com.github.teamhungry22.addcrop.core.objects.action.actions;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.objects.action.Action;
import com.github.teamhungry22.addcrop.core.objects.action.ActionManager;
import com.github.teamhungry22.addcrop.core.objects.item.ScytheItem;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class ScytheUseAction implements Action {
    public ScytheUseAction(ActionManager am, Player player, ScytheItem scytheItem, Location location) {
        throw new AddCropNotFoundException();
    }

    public void execute() {
        throw new AddCropNotFoundException();
    }

    private void scytheUse(int x, int z) {
        throw new AddCropNotFoundException();
    }
}
