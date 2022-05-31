package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDorypterus;
import net.lepidodendron.entity.model.entity.ModelDorypterus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDorypterus extends RenderLiving<EntityPrehistoricFloraDorypterus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dorypterus.png");

    public RenderDorypterus(RenderManager mgr) {
        super(mgr, new ModelDorypterus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDorypterus entity) {
        return RenderDorypterus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDorypterus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}