package com.github.teamhungry22.addcrop.core.objects.action.actions;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.config.data.CropEntityData;
import com.github.teamhungry22.addcrop.core.objects.action.Action;
import com.github.teamhungry22.addcrop.core.objects.action.ActionManager;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

public class CropSummonAction implements Action {
    public CropSummonAction(ActionManager am, Player player, Location location, CropEntityData cropEntityData) {
        throw new AddCropNotFoundException();
    }

    public void execute() {
        throw new AddCropNotFoundException();
    }

    private boolean spawnCrop(String modelId) {
        throw new AddCropNotFoundException();
    }

    private void executeBigCrop(Entity entity, String modelId, String state, double size, boolean glow, String color, String time) {
        throw new AddCropNotFoundException();
    }

    private void executeSkill(Entity entity, String skill, String modelId, String state, double size, boolean glow, String color, String time) {
        throw new AddCropNotFoundException();
    }
}
