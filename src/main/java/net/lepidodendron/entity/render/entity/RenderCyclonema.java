package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCyclonema;
import net.lepidodendron.entity.model.entity.ModelCyclonema;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCyclonema extends RenderLiving<EntityPrehistoricFloraCyclonema> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cyclonema.png");
    public static final ModelBase MODEL_BASE = new ModelCyclonema();

    public RenderCyclonema(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCyclonema entity) {
        return RenderCyclonema.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCyclonema entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}