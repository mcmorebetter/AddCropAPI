package com.github.teamhungry22.addcrop.core.command;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.command.CommandSender;

import java.util.List;

public class WorldEditCommand implements BaseCommand {

    @Override
    public boolean onCommand(CommandSender sender, String[] args) {
        throw new AddCropNotFoundException();
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, String[] args) {
        throw new AddCropNotFoundException();
    }

    private List<String> getCropList(String arg) {
        throw new AddCropNotFoundException();
    }

    private List<String> getPotList(String arg) {
        throw new AddCropNotFoundException();
    }

    private void worldEditCommandGuide(CommandSender sender) {
        throw new AddCropNotFoundException();
    }
}
