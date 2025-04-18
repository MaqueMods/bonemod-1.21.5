package net.maque.bonemod.client.renderer.entity;

import net.maque.bonemod.Bonemod;
import net.maque.bonemod.entity.projectile.BoneTomahawkEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.client.render.entity.state.ArrowEntityRenderState;
import net.minecraft.util.Identifier;

public class BoneTomahawkRenderer extends ProjectileEntityRenderer<BoneTomahawkEntity, ArrowEntityRenderState> {
    public final Identifier arrowTexture;

    public BoneTomahawkRenderer(EntityRendererFactory.Context context, Identifier arrowTexture) {
        super(context);
        this.arrowTexture = arrowTexture;
    }

    @Override
    public ArrowEntityRenderState createRenderState() {
        return new ArrowEntityRenderState();
    }

    @Override
    protected Identifier getTexture(ArrowEntityRenderState state) {
        return arrowTexture;
    }

    public static Identifier getTextureLocation(String textureName) {
        return Identifier.of(Bonemod.MOD_ID, "textures/item/bone_tomahawk.png");
    }
}