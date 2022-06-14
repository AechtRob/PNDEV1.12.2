package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHolonema;
import net.lepidodendron.entity.model.entity.ModelHolonema;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHolonema extends RenderLiving<EntityPrehistoricFloraHolonema> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/holonema.png");

    public RenderHolonema(RenderManager mgr) {
        super(mgr, new ModelHolonema(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHolonema entity) {
        return RenderHolonema.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHolonema entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}














































































































