package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMonograptus;
import net.lepidodendron.entity.model.entity.ModelMonograptus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMonograptus extends RenderLiving<EntityPrehistoricFloraMonograptus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/monograptus.png");

    public RenderMonograptus(RenderManager mgr) {
        super(mgr, new ModelMonograptus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMonograptus entity) {
        return RenderMonograptus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMonograptus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}