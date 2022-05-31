package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLaccognathus;
import net.lepidodendron.entity.model.entity.ModelLaccognathus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLaccognathus extends RenderLiving<EntityPrehistoricFloraLaccognathus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/laccognathus.png");

    public RenderLaccognathus(RenderManager mgr) {
        super(mgr, new ModelLaccognathus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLaccognathus entity) {
        return RenderLaccognathus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLaccognathus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}