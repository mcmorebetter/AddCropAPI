package com.github.teamhungry22.addcrop.core.config.manager;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.config.YamlConfigLoader;
import com.github.teamhungry22.addcrop.core.config.data.MessageData;
import org.bukkit.configuration.file.YamlConfiguration;

import java.util.Map;

public class MessageConfigManager {
    public MessageConfigManager(AddCrop plugin, YamlConfigLoader loader, YamlConfiguration config) {
        throw new AddCropNotFoundException();
    }

    public void load() {
        throw new AddCropNotFoundException();
    }

    public void clear() {
        throw new AddCropNotFoundException();
    }

    public Map<String, MessageData> getMessageMap() {
        throw new AddCropNotFoundException();
    }
}
