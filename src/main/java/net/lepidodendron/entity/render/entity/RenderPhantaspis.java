package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPhantaspis;
import net.lepidodendron.entity.model.entity.ModelPhantaspis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPhantaspis extends RenderLiving<EntityPrehistoricFloraPhantaspis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phantaspis.png");

    public RenderPhantaspis(RenderManager mgr) {
        super(mgr, new ModelPhantaspis(), 0.00f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPhantaspis entity) {
        return RenderPhantaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPhantaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}