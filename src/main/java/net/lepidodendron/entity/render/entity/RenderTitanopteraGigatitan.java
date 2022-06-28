package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTitanopteraGigatitan;
import net.lepidodendron.entity.model.entity.ModelTitanoptera;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTitanopteraGigatitan extends RenderLiving<EntityPrehistoricFloraTitanopteraGigatitan> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_gigatitan.png");

    public RenderTitanopteraGigatitan(RenderManager mgr) {
        super(mgr, new ModelTitanoptera(), 0.0f);
        this.addLayer(new LayerTitanopteraGigatitanWing(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTitanopteraGigatitan entity) {
        return RenderTitanopteraGigatitan.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTitanopteraGigatitan entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}