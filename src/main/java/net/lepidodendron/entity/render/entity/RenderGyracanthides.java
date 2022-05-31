package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGyracanthides;
import net.lepidodendron.entity.model.entity.ModelGyracanthides;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGyracanthides extends RenderLiving<EntityPrehistoricFloraGyracanthides> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gyracanthides.png");

    public RenderGyracanthides(RenderManager mgr) {
        super(mgr, new ModelGyracanthides(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGyracanthides entity) {
        return RenderGyracanthides.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGyracanthides entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}