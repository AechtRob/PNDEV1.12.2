package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHibernaspis;
import net.lepidodendron.entity.model.entity.ModelHibernaspis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHibernaspis extends RenderLiving<EntityPrehistoricFloraHibernaspis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hibernaspis.png");

    public RenderHibernaspis(RenderManager mgr) {
        super(mgr, new ModelHibernaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHibernaspis entity) {
        return RenderHibernaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHibernaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}