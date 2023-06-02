package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVachonisia;
import net.lepidodendron.entity.model.entity.ModelVachonisia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVachonisia extends RenderLiving<EntityPrehistoricFloraVachonisia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vachonisia.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderVachonisia(RenderManager mgr) {
        super(mgr, new ModelVachonisia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVachonisia entity) {
        return RenderVachonisia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVachonisia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraVachonisia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}