package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCheirurus;
import net.lepidodendron.entity.model.entity.ModelCheirurus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCheirurus extends RenderLiving<EntityPrehistoricFloraCheirurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cheirurus.png");

    public RenderCheirurus(RenderManager mgr) {
        super(mgr, new ModelCheirurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCheirurus entity) {
        return RenderCheirurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCheirurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}