package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTitanopteraClatrotitan;
import net.lepidodendron.entity.model.entity.ModelTitanoptera;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTitanopteraClatrotitan extends RenderLiving<EntityPrehistoricFloraTitanopteraClatrotitan> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_clatrotitan.png");

    public RenderTitanopteraClatrotitan(RenderManager mgr) {
        super(mgr, new ModelTitanoptera(), 0.0f);
        this.addLayer(new LayerTitanopteraClatrotitanWing(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTitanopteraClatrotitan entity) {
        return RenderTitanopteraClatrotitan.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTitanopteraClatrotitan entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}