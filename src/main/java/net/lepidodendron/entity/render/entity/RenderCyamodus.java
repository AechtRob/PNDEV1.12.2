package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCyamodus;
import net.lepidodendron.entity.model.entity.ModelCyamodus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCyamodus extends RenderLiving<EntityPrehistoricFloraCyamodus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cyamodus.png");

    public RenderCyamodus(RenderManager mgr) {
        super(mgr, new ModelCyamodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCyamodus entity) {
        return RenderCyamodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCyamodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}






































































