package com.github.teamhungry22.addcrop.core.objects.action.actions;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.objects.action.ActionManager;
import com.github.teamhungry22.addcrop.core.objects.item.RakeItem;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class RakeUseAction {
    public RakeUseAction(ActionManager am, Player player, RakeItem rakeItem, Location location) {
        throw new AddCropNotFoundException();
    }

    public void execute() {
        throw new AddCropNotFoundException();
    }
}

