package com.github.teamhungry22.addcrop.core.command;

import com.github.teamhungry22.addcrop.AddCrop;
import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;
import java.util.Optional;

public class ItemCommand implements BaseCommand {
    public ItemCommand(AddCrop plugin) {
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

    private boolean isList(String type, String id) {
        throw new AddCropNotFoundException();
    }

    private ItemStack getItem(String type, String id) {
        throw new AddCropNotFoundException();
    }

    private Optional<Player> getPlayer(CommandSender sender, String playerName) {
        throw new AddCropNotFoundException();
    }

    private void itemCommandGuide(CommandSender sender) {
        throw new AddCropNotFoundException();
    }
}