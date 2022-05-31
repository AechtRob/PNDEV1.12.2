package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTrimerus;
import net.lepidodendron.entity.model.entity.ModelTrimerus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTrimerus extends RenderLiving<EntityPrehistoricFloraTrimerus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trimerus.png");

    public RenderTrimerus(RenderManager mgr) {
        super(mgr, new ModelTrimerus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTrimerus entity) {
        return RenderTrimerus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTrimerus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}