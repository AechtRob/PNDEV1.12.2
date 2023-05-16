package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraChinlea;
import net.lepidodendron.entity.model.entity.ModelChinlea;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChinlea extends RenderLiving<EntityPrehistoricFloraChinlea> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/chinlea.png");
    public static final ModelBase MODEL_BASE = new ModelChinlea();

    public static float getScaler() {return 0.29F;}
    public RenderChinlea(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraChinlea entity) {
        return RenderChinlea.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraChinlea entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraChinlea entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.45F;
    }


}



