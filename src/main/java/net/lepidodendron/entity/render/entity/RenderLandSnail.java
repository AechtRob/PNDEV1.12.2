package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLandSnail;
import net.lepidodendron.entity.model.entity.ModelLandSnail;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLandSnail extends RenderLiving<EntityPrehistoricFloraLandSnail> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/snail_land.png");

    public RenderLandSnail(RenderManager mgr) {
        super(mgr, new ModelLandSnail(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLandSnail entity) {
        return RenderLandSnail.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLandSnail entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}