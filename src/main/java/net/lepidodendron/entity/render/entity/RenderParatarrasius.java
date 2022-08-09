package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParatarrasius;
import net.lepidodendron.entity.model.entity.ModelParatarrasius;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParatarrasius extends RenderLiving<EntityPrehistoricFloraParatarrasius> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paratarrasius.png");

    public RenderParatarrasius(RenderManager mgr) {
        super(mgr, new ModelParatarrasius(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParatarrasius entity) {
        return RenderParatarrasius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParatarrasius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraParatarrasius entity, float f) {
        float scale = 1.3F;
        GlStateManager.scale(scale, scale, scale);
    }

}
