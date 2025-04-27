package com.github.teamhungry22.addcrop.core.command;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginManager;

import java.util.List;

public class InfoCommand implements BaseCommand {
    public InfoCommand(PluginManager pluginManager) {
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

    private String getCustomItemPlugin() {
        throw new AddCropNotFoundException();
    }
}