package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCrotalocephalus;
import net.lepidodendron.entity.model.entity.ModelCrotalocephalus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCrotalocephalus extends RenderLiving<EntityPrehistoricFloraCrotalocephalus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/crotalocephalus.png");

    public RenderCrotalocephalus(RenderManager mgr) {
        super(mgr, new ModelCrotalocephalus(), 0.00f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCrotalocephalus entity) {
        return RenderCrotalocephalus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCrotalocephalus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}