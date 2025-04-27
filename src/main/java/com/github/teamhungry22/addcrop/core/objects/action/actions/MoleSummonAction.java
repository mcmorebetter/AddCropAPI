package com.github.teamhungry22.addcrop.core.objects.action.actions;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.config.data.MoleData;
import com.github.teamhungry22.addcrop.core.objects.action.Action;
import com.github.teamhungry22.addcrop.core.objects.action.ActionManager;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public class MoleSummonAction implements Action {
    public MoleSummonAction(ActionManager am, Player player, Location location, MoleData moleData) {
        throw new AddCropNotFoundException();
    }

    public void execute() {
        throw new AddCropNotFoundException();
    }

    private boolean spawnMole() {
        throw new AddCropNotFoundException();
    }
}
