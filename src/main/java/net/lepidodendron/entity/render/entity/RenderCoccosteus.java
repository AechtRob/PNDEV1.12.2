package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCoccosteus;
import net.lepidodendron.entity.model.entity.ModelCoccosteus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCoccosteus extends RenderLiving<EntityPrehistoricFloraCoccosteus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/coccosteus.png");

    public RenderCoccosteus(RenderManager mgr) {
        super(mgr, new ModelCoccosteus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCoccosteus entity) {
        return RenderCoccosteus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCoccosteus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}