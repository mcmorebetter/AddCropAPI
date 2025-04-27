package com.github.teamhungry22.addcrop.core.compatibility.placeholderapi;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.entity.Player;

import java.util.Map;

public class PAPIUtils {
    public static boolean containsPAPI(String input) {
        throw new AddCropNotFoundException();
    }

    public static boolean containsPAPI(Map<String, String> stringMap) {
        throw new AddCropNotFoundException();
    }

    public static Map<String, String> getStringMap(Player player, Map<String, String> stringMap) {
        throw new AddCropNotFoundException();
    }

    public static String getString(Player player, String text) {
        throw new AddCropNotFoundException();
    }
}
