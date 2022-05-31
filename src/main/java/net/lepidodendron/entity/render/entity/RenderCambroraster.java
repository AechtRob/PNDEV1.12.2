package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCambroraster;
import net.lepidodendron.entity.model.entity.ModelCambroraster;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCambroraster extends RenderLiving<EntityPrehistoricFloraCambroraster> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cambroraster.png");

    public RenderCambroraster(RenderManager mgr) {
        super(mgr, new ModelCambroraster(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCambroraster entity) {
        return RenderCambroraster.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCambroraster entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}