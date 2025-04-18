package net.maque.bonemod.entity;

import net.maque.bonemod.Bonemod;
import net.maque.bonemod.entity.projectile.BoneTomahawkEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModEntityType {
    public static final EntityType<BoneTomahawkEntity> BONE_TOMAHAWK = registerArrow("bone_tomahawk");

    public static EntityType<BoneTomahawkEntity> registerArrow(String name) {
        RegistryKey<EntityType<?>> key = RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(Bonemod.MOD_ID, name));

        return Registry.register(Registries.ENTITY_TYPE, key,
                EntityType.Builder.<BoneTomahawkEntity>create(BoneTomahawkEntity::new, SpawnGroup.MISC)
                        .dimensions(2.5F, 2.5F)
                        .build(key));
    }

}