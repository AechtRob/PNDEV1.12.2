package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCiurcopterus;
import net.lepidodendron.entity.model.entity.ModelCiurcopterus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCiurcopterus extends RenderLiving<EntityPrehistoricFloraCiurcopterus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ciurcopterus.png");
    public static float getScaler() {
        return 0.5F;
    }
    public RenderCiurcopterus(RenderManager mgr) {
        super(mgr, new ModelCiurcopterus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCiurcopterus entity) {
        return RenderCiurcopterus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCiurcopterus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCiurcopterus entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}