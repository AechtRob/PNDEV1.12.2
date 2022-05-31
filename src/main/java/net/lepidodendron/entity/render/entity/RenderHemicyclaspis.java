package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHemicyclaspis;
import net.lepidodendron.entity.model.entity.ModelHemicyclaspis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHemicyclaspis extends RenderLiving<EntityPrehistoricFloraHemicyclaspis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hemicyclaspis.png");

    public RenderHemicyclaspis(RenderManager mgr) {
        super(mgr, new ModelHemicyclaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHemicyclaspis entity) {
        return RenderHemicyclaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHemicyclaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}