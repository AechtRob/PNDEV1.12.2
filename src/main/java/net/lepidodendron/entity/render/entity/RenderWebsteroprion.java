package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWebsteroprion;
import net.lepidodendron.entity.model.entity.ModelWebsteroprion;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWebsteroprion extends RenderLiving<EntityPrehistoricFloraWebsteroprion> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/websteroprion.png");

    public RenderWebsteroprion(RenderManager mgr) {
        super(mgr, new ModelWebsteroprion(), 0.1f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWebsteroprion entity) {
        return RenderWebsteroprion.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWebsteroprion entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}