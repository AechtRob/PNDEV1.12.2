package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeoisopus;
import net.lepidodendron.entity.model.entity.ModelPalaeoisopus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeoisopus extends RenderLiving<EntityPrehistoricFloraPalaeoisopus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeoisopus.png");
    public static final ModelBase MODEL_BASE = new ModelPalaeoisopus();

    public RenderPalaeoisopus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
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