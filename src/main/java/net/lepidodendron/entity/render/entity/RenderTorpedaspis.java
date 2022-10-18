package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTorpedaspis;
import net.lepidodendron.entity.model.entity.ModelTorpedaspis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTorpedaspis extends RenderLiving<EntityPrehistoricFloraTorpedaspis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/torpedaspis.png");

    public RenderTorpedaspis(RenderManager mgr) {
        super(mgr, new ModelTorpedaspis(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTorpedaspis entity) {
        return RenderTorpedaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTorpedaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTorpedaspis entity, float f) {
        float scale = 0.7F;
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
    
}