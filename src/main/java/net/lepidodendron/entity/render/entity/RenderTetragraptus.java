package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTetragraptus;
import net.lepidodendron.entity.model.entity.ModelTetragraptus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTetragraptus extends RenderLiving<EntityPrehistoricFloraTetragraptus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tetragraptus.png");

    public RenderTetragraptus(RenderManager mgr) {
        super(mgr, new ModelTetragraptus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTetragraptus entity) {
        return RenderTetragraptus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTetragraptus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}