package net.maque.bonemod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.maque.bonemod.client.renderer.entity.BoneTomahawkRenderer;
import net.maque.bonemod.entity.ModEntityType;

public class BonemodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntityType.BONE_TOMAHAWK, context -> new BoneTomahawkRenderer(context, BoneTomahawkRenderer.getTextureLocation("bone_tomahawk")));
    }
}
