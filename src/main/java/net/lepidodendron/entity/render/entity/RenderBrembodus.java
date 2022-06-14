package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBrembodus;
import net.lepidodendron.entity.model.entity.ModelBrembodus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBrembodus extends RenderLiving<EntityPrehistoricFloraBrembodus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/brembodus.png");

    public RenderBrembodus(RenderManager mgr) {
        super(mgr, new ModelBrembodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBrembodus entity) {
        return RenderBrembodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBrembodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}


















































































