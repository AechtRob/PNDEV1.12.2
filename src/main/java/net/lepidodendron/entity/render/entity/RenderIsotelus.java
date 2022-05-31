package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIsotelus;
import net.lepidodendron.entity.model.entity.ModelIsotelus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIsotelus extends RenderLiving<EntityPrehistoricFloraIsotelus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/isotelus.png");

    public RenderIsotelus(RenderManager mgr) {
        super(mgr, new ModelIsotelus(), 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIsotelus entity) {
        return RenderIsotelus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIsotelus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}