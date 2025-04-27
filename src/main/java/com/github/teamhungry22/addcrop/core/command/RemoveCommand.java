package com.github.teamhungry22.addcrop.core.command;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.command.CommandSender;

import java.util.List;

public class RemoveCommand implements BaseCommand {
    @Override
    public boolean onCommand(CommandSender sender, String[] args) {
        throw new AddCropNotFoundException();
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, String[] args) {
        throw new AddCropNotFoundException();
    }

    private void removeCommandGuide(CommandSender sender) {
        throw new AddCropNotFoundException();
    }
}