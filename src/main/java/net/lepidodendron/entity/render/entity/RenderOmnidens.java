package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOmnidens;
import net.lepidodendron.entity.model.entity.ModelOmnidens;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOmnidens extends RenderLiving<EntityPrehistoricFloraOmnidens> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/omnidens.png");
    private static final ResourceLocation TEXTURE_YOUNG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/omnidens_young.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/omnidens_baby.png");

    public RenderOmnidens(RenderManager mgr) {
        super(mgr, new ModelOmnidens(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOmnidens entity) {
        float scale = entity.getAgeScale();
        //System.err.println("AgeScale: " + scale);
        if (scale < 0.4F) {
            return RenderOmnidens.TEXTURE_BABY;
        }
        else if (scale < 0.7F) {
            return RenderOmnidens.TEXTURE_YOUNG;
        }
        return RenderOmnidens.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOmnidens entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOmnidens entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}