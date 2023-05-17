package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLochmanolenellus;
import net.lepidodendron.entity.model.entity.ModelLochmanolenellus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLochmanolenellus extends RenderLiving<EntityPrehistoricFloraLochmanolenellus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lochmanolenellus.png");

    public RenderLochmanolenellus(RenderManager mgr) {
        super(mgr, new ModelLochmanolenellus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLochmanolenellus entity) {
        return RenderLochmanolenellus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLochmanolenellus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}

