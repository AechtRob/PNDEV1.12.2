package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeoisopus;
import net.lepidodendron.entity.model.entity.ModelPalaeoisopus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeoisopus extends RenderLiving<EntityPrehistoricFloraPalaeoisopus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeoisopus.png");

    public RenderPalaeoisopus(RenderManager mgr) {
        super(mgr, new ModelPalaeoisopus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPalaeoisopus entity) {
        return RenderPalaeoisopus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPalaeoisopus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}