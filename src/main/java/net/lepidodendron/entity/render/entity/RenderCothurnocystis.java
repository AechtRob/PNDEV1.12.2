package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCothurnocystis;
import net.lepidodendron.entity.model.entity.ModelCothurnocystis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCothurnocystis extends RenderLiving<EntityPrehistoricFloraCothurnocystis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cothurnocystis.png");

    public RenderCothurnocystis(RenderManager mgr) {
        super(mgr, new ModelCothurnocystis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCothurnocystis entity) {
        return RenderCothurnocystis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCothurnocystis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}