package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPholiderpeton;
import net.lepidodendron.entity.model.entity.ModelPholiderpeton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPholiderpeton extends RenderLiving<EntityPrehistoricFloraPholiderpeton> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pholiderpeton.png");

    public RenderPholiderpeton(RenderManager mgr) {
        super(mgr, new ModelPholiderpeton(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPholiderpeton entity) {
        return RenderPholiderpeton.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPholiderpeton entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPholiderpeton entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.4F;
    }

}