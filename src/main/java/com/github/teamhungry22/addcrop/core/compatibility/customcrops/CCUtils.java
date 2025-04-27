package com.github.teamhungry22.addcrop.core.compatibility.customcrops;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import net.momirealms.customcrops.api.BukkitCustomCropsPlugin;
import net.momirealms.customcrops.api.CustomCropsAPI;
import net.momirealms.customcrops.api.core.SynchronizedCompoundMap;
import net.momirealms.customcrops.api.core.block.CustomCropsBlock;
import net.momirealms.customcrops.api.core.mechanic.crop.CropConfig;
import net.momirealms.customcrops.api.core.mechanic.pot.PotConfig;
import net.momirealms.customcrops.api.core.world.CustomCropsBlockState;
import net.momirealms.customcrops.api.core.world.CustomCropsWorld;
import net.momirealms.customcrops.api.core.world.Pos3;
import org.bukkit.Location;

public class CCUtils {
    public static BukkitCustomCropsPlugin CCBukkit() {
        throw new AddCropNotFoundException();
    }

    public static CustomCropsAPI CCAPI() {
        throw new AddCropNotFoundException();
    }

    public static boolean hasCrop(String cropId) {
        throw new AddCropNotFoundException();
    }

    public static boolean hasPot(String potId) {
        throw new AddCropNotFoundException();
    }

    public static CropConfig getCropConfig(String cropId) {
        throw new AddCropNotFoundException();
    }

    public static PotConfig getPotConfig(String potId) {
        throw new AddCropNotFoundException();
    }

    public static Pos3 getPos3(Location location) {
        throw new AddCropNotFoundException();
    }

    public static String getAnyId(Location location) {
        throw new AddCropNotFoundException();
    }

    public static CustomCropsWorld <?> getCCWorld(Location location) {
        throw new AddCropNotFoundException();
    }

    public static CustomCropsBlock getCCBlock(Location location) {
        throw new AddCropNotFoundException();
    }

    public static CustomCropsBlockState getCCBlockState(Location location) {
        throw new AddCropNotFoundException();
    }

    public static SynchronizedCompoundMap getPotMap(CustomCropsBlockState potState, Location location) {
        throw new AddCropNotFoundException();
    }

    public static int getChunkCropAmount(Location location) {
        throw new AddCropNotFoundException();
    }

    public static int getWorldCropLimit(Location location) {
        throw new AddCropNotFoundException();
    }
}
