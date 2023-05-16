package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCamuropiscis;
import net.lepidodendron.entity.model.entity.ModelCamuropiscis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCamuropiscis extends RenderLiving<EntityPrehistoricFloraCamuropiscis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/camuropiscis.png");
    public static final ModelBase MODEL_BASE = new ModelCamuropiscis();

    public static float getScaler() {
        return 0.7F * 0.495F *0.9F;
    }
    public RenderCamuropiscis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCamuropiscis entity) {
        return RenderCamuropiscis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCamuropiscis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCamuropiscis entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}