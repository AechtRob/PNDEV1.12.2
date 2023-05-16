package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWebsteroprion;
import net.lepidodendron.entity.model.entity.ModelWebsteroprion;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWebsteroprion extends RenderLiving<EntityPrehistoricFloraWebsteroprion> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/websteroprion.png");
    public static final ModelBase MODEL_BASE = new ModelWebsteroprion();

    public RenderWebsteroprion(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.1f);
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