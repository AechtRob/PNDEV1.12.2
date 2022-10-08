package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSkeemella;
import net.lepidodendron.entity.model.entity.ModelSkeemella;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSkeemella extends RenderLiving<EntityPrehistoricFloraSkeemella> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/skeemella.png");

    public RenderSkeemella(RenderManager mgr) {
        super(mgr, new ModelSkeemella(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSkeemella entity) {
        return RenderSkeemella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSkeemella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}