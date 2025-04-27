package com.github.teamhungry22.addcrop.core.compatibility.customcrops;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.sk89q.worldedit.LocalSession;
import com.sk89q.worldedit.regions.Region;
import org.bukkit.entity.Player;

public class CCWorldEdit {
    public static void worldEditCropPlace(Player player, String cropID, Integer stage) {
        throw new AddCropNotFoundException();
    }

    public static void worldEditPotPlace(Player player, String potID) {
        throw new AddCropNotFoundException();
    }

    public static void worldEditGreenHousePlace(Player player) {
        throw new AddCropNotFoundException();
    }

    public static void worldEditRemove(Player player) {
        throw new AddCropNotFoundException();
    }

    private static LocalSession getLocalSession(Player player) {
        throw new AddCropNotFoundException();
    }

    private static Region getRegion(LocalSession localSession) {
        throw new AddCropNotFoundException();
    }
}
