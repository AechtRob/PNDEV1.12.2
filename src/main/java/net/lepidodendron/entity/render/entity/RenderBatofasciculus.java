package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBatofasciculus;
import net.lepidodendron.entity.model.entity.ModelCombJelly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBatofasciculus extends RenderLiving<EntityPrehistoricFloraBatofasciculus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/batofasciculus.png");

    public RenderBatofasciculus(RenderManager mgr) {
        super(mgr, new ModelCombJelly(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBatofasciculus entity) {
        return RenderBatofasciculus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBatofasciculus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}