package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTitanopteraMesotitan;
import net.lepidodendron.entity.model.entity.ModelTitanoptera;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTitanopteraMesotitan extends RenderLiving<EntityPrehistoricFloraTitanopteraMesotitan> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_mesotitan.png");

    public RenderTitanopteraMesotitan(RenderManager mgr) {
        super(mgr, new ModelTitanoptera(), 0.0f);
        this.addLayer(new LayerTitanopteraMesotitanWing(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTitanopteraMesotitan entity) {
        return RenderTitanopteraMesotitan.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTitanopteraMesotitan entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}