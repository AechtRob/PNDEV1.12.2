package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPhacops;
import net.lepidodendron.entity.model.entity.ModelChotecops;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPhacops extends RenderLiving<EntityPrehistoricFloraPhacops> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phacops.png");

    public RenderPhacops(RenderManager mgr) {
        super(mgr, new ModelChotecops(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPhacops entity) {
        return RenderPhacops.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPhacops entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPhacops entity, float f) {
        float scale = 0.9F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }
}

