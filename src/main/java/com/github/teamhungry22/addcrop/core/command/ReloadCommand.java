package com.github.teamhungry22.addcrop.core.command;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.config.ConfigManager;
import org.bukkit.command.CommandSender;

import java.util.List;

public class ReloadCommand implements BaseCommand {
    public ReloadCommand(ConfigManager configManager) {
        throw new AddCropNotFoundException();
    }

    @Override
    public boolean onCommand(CommandSender sender, String[] args) {
        throw new AddCropNotFoundException();
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, String[] args) {
        throw new AddCropNotFoundException();
    }
}