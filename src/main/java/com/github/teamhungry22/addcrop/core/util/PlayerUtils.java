package com.github.teamhungry22.addcrop.core.util;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public class PlayerUtils {
    public static void updatePlayerInventory(Player player) {
        throw new AddCropNotFoundException();
    }

    public static void updatePlayerInventory(Player player, ItemStack itemStack) {
        throw new AddCropNotFoundException();
    }

    public static void updatePlayerInventory(Player player, ItemStack itemStack, int amount) {
        throw new AddCropNotFoundException();
    }

    public static void updateItemDurability(Player player, int amount) {
        throw new AddCropNotFoundException();
    }

    public static boolean hasPermission(Player player, List<String> permissionList) {
        throw new AddCropNotFoundException();
    }

    public static void addPermission(Player player, String permission) {
        throw new AddCropNotFoundException();
    }

    public static void removePermission(Player player, String permission) {
        throw new AddCropNotFoundException();
    }
}
