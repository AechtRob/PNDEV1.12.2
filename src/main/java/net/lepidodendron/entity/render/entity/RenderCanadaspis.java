package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCanadaspis;
import net.lepidodendron.entity.model.entity.ModelCanadaspis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCanadaspis extends RenderLiving<EntityPrehistoricFloraCanadaspis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/canadaspis.png");

    public RenderCanadaspis(RenderManager mgr) {
        super(mgr, new ModelCanadaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCanadaspis entity) {
        return RenderCanadaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCanadaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}