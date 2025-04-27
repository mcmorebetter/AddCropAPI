package com.github.teamhungry22.addcrop.core.compatibility.mythicmobs;

import com.github.teamhungry22.addcrop.api.AddCropNotFoundException;
import io.lumine.mythic.api.mobs.MythicMob;
import io.lumine.mythic.api.skills.SkillMetadata;
import io.lumine.mythic.bukkit.BukkitAPIHelper;
import io.lumine.mythic.bukkit.MythicBukkit;
import io.lumine.mythic.core.items.ItemExecutor;
import io.lumine.mythic.core.items.MythicItem;
import io.lumine.mythic.core.mobs.ActiveMob;
import io.lumine.mythic.core.mobs.MobExecutor;
import io.lumine.mythic.core.skills.SkillExecutor;
import io.lumine.mythic.core.skills.placeholders.PlaceholderExecutor;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.inventory.ItemStack;

import java.util.Optional;
import java.util.function.Consumer;

public class MythicUtils {
    public static MythicBukkit getMMBukkit() {
        throw new AddCropNotFoundException();
    }

    public static BukkitAPIHelper getMMAPI() {
        throw new AddCropNotFoundException();
    }

    public static MobExecutor getMobManager() {
        throw new AddCropNotFoundException();
    }

    public static ItemExecutor getItemManager() {
        throw new AddCropNotFoundException();
    }

    public static SkillExecutor getSkillManager() {
        throw new AddCropNotFoundException();
    }

    public static PlaceholderExecutor getPlaceholderManager() {
        throw new AddCropNotFoundException();
    }

    public static boolean hasMythicMob(String mobName) {
        throw new AddCropNotFoundException();
    }

    public static boolean hasMythicSkill(String skillName) {
        throw new AddCropNotFoundException();
    }

    public static MythicMob getMythicMob(String mythicMobName) {
        throw new AddCropNotFoundException();
    }

    public static ActiveMob getActiveMob(Object obj) {
        throw new AddCropNotFoundException();
    }

    public static boolean isMythicItem(ItemStack itemStack) {
        throw new AddCropNotFoundException();
    }

    public static Optional<MythicItem> getMythicItem(Object obj) {
        throw new AddCropNotFoundException();
    }

    public static String getMythicItemID(ItemStack itemStack) {
        throw new AddCropNotFoundException();
    }

    public static void spawnMythicMob(String mobName, Location location) {
        throw new AddCropNotFoundException();
    }

    public static void useSkill(Entity entity, String skillName) {
        throw new AddCropNotFoundException();
    }

    public static void useSkill(Entity entity, String skillName, Consumer<SkillMetadata> metadata) {
        throw new AddCropNotFoundException();
    }

    public static void useSkill(Entity entity, String skillName, Location loc, Consumer<SkillMetadata> metadata) {
        throw new AddCropNotFoundException();
    }
}
