package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCampbellodus;
import net.lepidodendron.entity.model.entity.ModelCampbellodus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCampbellodus extends RenderLiving<EntityPrehistoricFloraCampbellodus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/campbellodus.png");

    public RenderCampbellodus(RenderManager mgr) {
        super(mgr, new ModelCampbellodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCampbellodus entity) {
        return RenderCampbellodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCampbellodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}