package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCarcinosoma;
import net.lepidodendron.entity.model.entity.ModelCarcinosoma;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCarcinosoma extends RenderLiving<EntityPrehistoricFloraCarcinosoma> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/carcinosoma.png");
    private static final ResourceLocation TEXTURE_YOUNG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/carcinosoma_young.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/carcinosoma_baby.png");

    public RenderCarcinosoma(RenderManager mgr) {
        super(mgr, new ModelCarcinosoma(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCarcinosoma entity) {
        float scale = entity.getAgeScale();
        //System.err.println("AgeScale: " + scale);
        if (scale < 0.4F) {
            return RenderCarcinosoma.TEXTURE_BABY;
        }
        else if (scale < 0.7F) {
            return RenderCarcinosoma.TEXTURE_YOUNG;
        }
        return RenderCarcinosoma.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCarcinosoma entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCarcinosoma entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}