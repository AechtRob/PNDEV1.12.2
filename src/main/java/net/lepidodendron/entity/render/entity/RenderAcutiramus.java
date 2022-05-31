package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAcutiramus;
import net.lepidodendron.entity.model.entity.ModelAcutiramus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAcutiramus extends RenderLiving<EntityPrehistoricFloraAcutiramus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acutiramus.png");
    private static final ResourceLocation TEXTURE_YOUNG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acutiramus_young.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acutiramus_baby.png");

    public RenderAcutiramus(RenderManager mgr) {
        super(mgr, new ModelAcutiramus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAcutiramus entity) {
        float scale = entity.getAgeScale();
        //System.err.println("AgeScale: " + scale);
        if (scale < 0.4F) {
            return RenderAcutiramus.TEXTURE_BABY;
        }
        else if (scale < 0.7F) {
            return RenderAcutiramus.TEXTURE_YOUNG;
        }
        return RenderAcutiramus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAcutiramus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAcutiramus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}