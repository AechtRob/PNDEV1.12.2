package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMarmorerpeton;
import net.lepidodendron.entity.model.entity.ModelMarmorerpeton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMarmorerpeton extends RenderLiving<EntityPrehistoricFloraMarmorerpeton> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/marmorerpeton.png");

    public static float getScaler() {
        return 0.7F * 0.4F;
    }
    public RenderMarmorerpeton(RenderManager mgr) {
        super(mgr, new ModelMarmorerpeton(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMarmorerpeton entity) {
        return RenderMarmorerpeton.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMarmorerpeton entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMarmorerpeton entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}