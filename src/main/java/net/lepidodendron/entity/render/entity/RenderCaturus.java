package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCaturus;
import net.lepidodendron.entity.model.entity.ModelCaturus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCaturus extends RenderLiving<EntityPrehistoricFloraCaturus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/strobilodus.png");

    public RenderCaturus(RenderManager mgr) {
        super(mgr, new ModelCaturus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCaturus entity) {
        return RenderCaturus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCaturus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}




