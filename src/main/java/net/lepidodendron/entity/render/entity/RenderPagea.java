package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPagea;
import net.lepidodendron.entity.model.entity.ModelPagea;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPagea extends RenderLiving<EntityPrehistoricFloraPagea> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pagea.png");
    private static final ResourceLocation TEXTURE_YOUNG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pagea_young.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pagea_baby.png");

    public RenderPagea(RenderManager mgr) {
        super(mgr, new ModelPagea(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPagea entity) {
        float scale = entity.getAgeScale();
        //System.err.println("AgeScale: " + scale);
        if (scale < 0.4F) {
            return RenderPagea.TEXTURE_BABY;
        }
        else if (scale < 0.7F) {
            return RenderPagea.TEXTURE_YOUNG;
        }
        return RenderPagea.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPagea entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPagea entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}