package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBatrachotomus;
import net.lepidodendron.entity.model.entity.ModelBatrachotomus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBatrachotomus extends RenderLiving<EntityPrehistoricFloraBatrachotomus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/batrachotomus.png");

    public RenderBatrachotomus(RenderManager mgr) {
        super(mgr, new ModelBatrachotomus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBatrachotomus entity) {
        return RenderBatrachotomus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBatrachotomus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}

