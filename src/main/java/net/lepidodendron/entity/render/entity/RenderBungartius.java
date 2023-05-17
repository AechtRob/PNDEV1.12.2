package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBungartius;
import net.lepidodendron.entity.model.entity.ModelBungartius;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBungartius extends RenderLiving<EntityPrehistoricFloraBungartius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bungartius.png");

    public static float getScaler() {
        return 0.85F;
    }
    public RenderBungartius(RenderManager mgr) {
        super(mgr, new ModelBungartius(), 1.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBungartius entity) {
        float scale = entity.getAgeScale();
        //System.err.println("AgeScale: " + scale);
        return RenderBungartius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBungartius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBungartius entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}