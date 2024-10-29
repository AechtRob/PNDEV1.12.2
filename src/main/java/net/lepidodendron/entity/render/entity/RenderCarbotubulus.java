package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCarbotubulus;
import net.lepidodendron.entity.model.entity.ModelCarbotubulus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCarbotubulus extends RenderLivingBaseWithBook<EntityPrehistoricFloraCarbotubulus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/carbotubulus.png");

    public static float getScaler() {
        return 0.7F * 0.2F;
    }
    public RenderCarbotubulus(RenderManager mgr) {
        super(mgr, new ModelCarbotubulus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCarbotubulus entity) {
        return RenderCarbotubulus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCarbotubulus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCarbotubulus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}