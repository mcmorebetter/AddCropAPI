package com.github.teamhungry22.addcrop.core.config;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.List;

public class ConfigUtils {
    public static List<String> getOnlyStringList(ConfigurationSection section, Object id) {
        throw new AddCropNotFoundException();
    }

    public static List<String> getOnlyStringList(YamlConfiguration yaml, Object id) {
        throw new AddCropNotFoundException();
    }

    public static void replaceKey(File file, String target, String replaceText) {
        throw new AddCropNotFoundException();
    }
}
