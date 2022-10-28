package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAscoceras_Baby;
import net.lepidodendron.entity.model.entity.ModelAscocerasBaby;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAscoceras_Baby extends RenderLiving<EntityPrehistoricFloraAscoceras_Baby> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ascoceras_baby.png");

    public RenderAscoceras_Baby(RenderManager mgr) {
        super(mgr, new ModelAscocerasBaby(), 0.1f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAscoceras_Baby entity) {
        return RenderAscoceras_Baby.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAscoceras_Baby entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAscoceras_Baby entity, float f) {
        float scale = entity.getAgeScale() * 0.85F * 1.65F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}