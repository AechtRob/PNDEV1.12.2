package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCameroceras;
import net.lepidodendron.entity.model.entity.ModelCameroceras;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCameroceras extends RenderLiving<EntityPrehistoricFloraCameroceras> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cameroceras.png");

    public RenderCameroceras(RenderManager mgr) {
        super(mgr, new ModelCameroceras(), 0.6f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCameroceras entity) {
        return RenderCameroceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCameroceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCameroceras entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}