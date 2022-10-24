package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCheirurus;
import net.lepidodendron.entity.EntityPrehistoricFloraChotecops;
import net.lepidodendron.entity.model.entity.ModelChotecops;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChotecops extends RenderLiving<EntityPrehistoricFloraChotecops> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/chotecops.png");

    public RenderChotecops(RenderManager mgr) {
        super(mgr, new ModelChotecops(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraChotecops entity) {
        return RenderChotecops.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraChotecops entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraChotecops entity, float f) {
        float scale = 0.9F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }
}

