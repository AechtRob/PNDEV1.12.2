package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAntineosteus;
import net.lepidodendron.entity.model.entity.ModelAntineosteus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAntineosteus extends RenderLiving<EntityPrehistoricFloraAntineosteus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/antineosteus.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/antineosteus_baby.png");

    public RenderAntineosteus(RenderManager mgr) {
        super(mgr, new ModelAntineosteus(), 0.25f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAntineosteus entity) {
        float scale = entity.getAgeScale();
        //System.err.println("AgeScale: " + scale);
        if (scale < 0.2F) {
            return RenderAntineosteus.TEXTURE_BABY;
        }
        return RenderAntineosteus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAntineosteus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAntineosteus entity, float f) {
        float scale = entity.getAgeScale();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.18F;
    }

}