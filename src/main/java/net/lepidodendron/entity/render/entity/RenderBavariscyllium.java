package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBavariscyllium;
import net.lepidodendron.entity.model.entity.ModelBavariscyllium;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBavariscyllium extends RenderLiving<EntityPrehistoricFloraBavariscyllium> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bavariscyllium.png");

    public static float getScaler() {
        return 0.8F * 0.2F;
    }
    public RenderBavariscyllium(RenderManager mgr) {
        super(mgr, new ModelBavariscyllium(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBavariscyllium entity) {
        return RenderBavariscyllium.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBavariscyllium entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBavariscyllium entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();

        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}