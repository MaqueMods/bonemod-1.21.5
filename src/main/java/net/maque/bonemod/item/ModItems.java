package net.maque.bonemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.maque.bonemod.Bonemod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BONE_SHARD=registerItem("bone_shard",new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bonemod.MOD_ID,"bone_shard")))));
    public static final Item BONE_TOMAHAWK=registerItem("bone_tomahawk",new BoneTomahawkItem((new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Bonemod.MOD_ID,"bone_tomahawk"))))));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Bonemod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Bonemod.LOGGER.info("Registering Mod Items for " + Bonemod.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BONE_SHARD);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(BONE_TOMAHAWK);
        });
    }
}