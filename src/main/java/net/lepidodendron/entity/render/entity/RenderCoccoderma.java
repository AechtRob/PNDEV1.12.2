package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCoccoderma;
import net.lepidodendron.entity.model.entity.ModelCoccoderma;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCoccoderma extends RenderLiving<EntityPrehistoricFloraCoccoderma> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/coccoderma.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderCoccoderma(RenderManager mgr) {
        super(mgr, new ModelCoccoderma(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCoccoderma entity) {
        return RenderCoccoderma.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCoccoderma entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCoccoderma entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();;
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}