package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNipponomaria;
import net.lepidodendron.entity.model.entity.ModelNipponomaria;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNipponomaria extends RenderLiving<EntityPrehistoricFloraNipponomaria> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nipponomaria.png");

    public RenderNipponomaria(RenderManager mgr) {
        super(mgr, new ModelNipponomaria(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNipponomaria entity) {
        return RenderNipponomaria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNipponomaria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}