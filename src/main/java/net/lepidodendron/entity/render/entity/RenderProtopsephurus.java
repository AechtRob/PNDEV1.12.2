package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProtopsephurus;
import net.lepidodendron.entity.model.entity.ModelProtopsephurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProtopsephurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraProtopsephurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/protopsephurus.png");

    public static float getScaler() {
        return 0.7F * 0.7F;
    }
    public RenderProtopsephurus(RenderManager mgr) {
        super(mgr, new ModelProtopsephurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProtopsephurus entity) {
        return RenderProtopsephurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProtopsephurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraProtopsephurus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}