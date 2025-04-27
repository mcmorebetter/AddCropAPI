package com.github.teamhungry22.addcrop.core.util;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import com.github.teamhungry22.addcrop.core.config.data.MessageData;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MessageUtils {
    public static void send(CommandSender sender, String text) {
        throw new AddCropNotFoundException();
    }

    public static void send(CommandSender sender, String[] arr) {
        throw new AddCropNotFoundException();
    }

    public static void send(Player player, MessageData messageData) {
        throw new AddCropNotFoundException();
    }

    public static void logInfo(String text) {
        throw new AddCropNotFoundException();
    }

    public static void logWarning(String text) {
        throw new AddCropNotFoundException();
    }

    public static void broadcast(String text) {
        throw new AddCropNotFoundException();
    }
}
