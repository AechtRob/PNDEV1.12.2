package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAstraspis;
import net.lepidodendron.entity.model.entity.ModelAstraspis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAstraspis extends RenderLiving<EntityPrehistoricFloraAstraspis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/astraspis.png");

    public RenderAstraspis(RenderManager mgr) {
        super(mgr, new ModelAstraspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAstraspis entity) {
        return RenderAstraspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAstraspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}

