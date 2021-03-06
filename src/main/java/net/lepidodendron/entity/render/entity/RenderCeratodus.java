package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCeratodus;
import net.lepidodendron.entity.model.entity.ModelCeratodus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCeratodus extends RenderLiving<EntityPrehistoricFloraCeratodus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ceratodus.png");

    public RenderCeratodus(RenderManager mgr) {
        super(mgr, new ModelCeratodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCeratodus entity) {
        return RenderCeratodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCeratodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}