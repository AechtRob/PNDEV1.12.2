package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraChinlea;
import net.lepidodendron.entity.model.entity.ModelChinlea;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChinlea extends RenderLiving<EntityPrehistoricFloraChinlea> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/chinlea.png");

    public RenderChinlea(RenderManager mgr) {
        super(mgr, new ModelChinlea(), 0.0f);
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
        float scale = 0.8F;
        GlStateManager.scale(scale, scale, scale);
    }


}
















































































