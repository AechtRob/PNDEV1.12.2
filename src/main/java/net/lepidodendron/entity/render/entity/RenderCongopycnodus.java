package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCongopycnodus;
import net.lepidodendron.entity.model.entity.ModelCongopycnodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCongopycnodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraCongopycnodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/congopycnodus.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderCongopycnodus(RenderManager mgr) {
        super(mgr, new ModelCongopycnodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCongopycnodus entity) {
        return RenderCongopycnodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCongopycnodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCongopycnodus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}