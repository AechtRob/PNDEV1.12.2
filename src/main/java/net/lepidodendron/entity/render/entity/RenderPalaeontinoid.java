package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeontinoid;
import net.lepidodendron.entity.model.entity.ModelPalaeontinoid;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeontinoid extends RenderLiving<EntityPrehistoricFloraPalaeontinoid> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeontinoid.png");

    public RenderPalaeontinoid(RenderManager mgr) {
        super(mgr, new ModelPalaeontinoid(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPalaeontinoid entity) {
        return RenderPalaeontinoid.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPalaeontinoid entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}