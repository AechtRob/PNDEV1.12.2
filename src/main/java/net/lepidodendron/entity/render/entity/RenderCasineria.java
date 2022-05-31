package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCasineria;
import net.lepidodendron.entity.model.entity.ModelCasineria;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCasineria extends RenderLiving<EntityPrehistoricFloraCasineria> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/casineria.png");

    public RenderCasineria(RenderManager mgr) {
        super(mgr, new ModelCasineria(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCasineria entity) {
        return RenderCasineria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCasineria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}