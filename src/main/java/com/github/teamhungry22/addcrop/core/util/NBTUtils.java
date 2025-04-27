package com.github.teamhungry22.addcrop.core.util;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import de.tr7zw.changeme.nbtapi.iface.ReadWriteNBT;
import de.tr7zw.changeme.nbtapi.iface.ReadableNBT;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

import java.util.function.Consumer;
import java.util.function.Function;

public class NBTUtils {
    public static boolean hasNBT(ItemStack itemStack, String key) {
        throw new AddCropNotFoundException();
    }

    public static <T> T getNBT(ItemStack itemStack, String key, String type) {
        throw new AddCropNotFoundException();
    }

    public static void setNBT(ItemStack itemStack, String key, Object value, String type) {
        throw new AddCropNotFoundException();
    }

    public static boolean hasPDC(ItemStack itemStack, String key) {
        throw new AddCropNotFoundException();
    }

    public static <T> T getPDC(ItemStack itemStack, String key, String type) {
        throw new AddCropNotFoundException();
    }

    public static void setPDC(ItemStack itemStack, String key, Object value, String type) {
        throw new AddCropNotFoundException();
    }

    public static boolean hasPDC(Entity entity, String key) {
        throw new AddCropNotFoundException();
    }

    public static <T> T getPDC(Entity entity, String key, String type) {
        throw new AddCropNotFoundException();
    }

    public static void setPDC(Entity entity, String key, Object value, String type) {
        throw new AddCropNotFoundException();
    }

    public static <T> T getItemPDC(ItemStack itemStack, Function<ReadableNBT, T> getter) {
        throw new AddCropNotFoundException();
    }

    private static void modifyItemPDC(ItemStack itemStack, Consumer<ReadWriteNBT> consumer) {
        throw new AddCropNotFoundException();
    }

    private static <T> T getValue(ReadableNBT nbt, String key, String type) {
        throw new AddCropNotFoundException();
    }

    private static void setCompound(ReadWriteNBT nbt, String key, Object value, String type) {
        throw new AddCropNotFoundException();
    }

    private static void setValue(ReadWriteNBT nbt, String key, Object value, String type) {
        throw new AddCropNotFoundException();
    }
}
