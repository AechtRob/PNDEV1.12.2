package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraChasmataspis;
import net.lepidodendron.entity.model.entity.ModelChasmataspis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChasmataspis extends RenderLiving<EntityPrehistoricFloraChasmataspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/chasmataspis.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderChasmataspis(RenderManager mgr) {
        super(mgr, new ModelChasmataspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraChasmataspis entity) {
        return RenderChasmataspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraChasmataspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraChasmataspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}