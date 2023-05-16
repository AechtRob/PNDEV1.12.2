package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCothurnocystis;
import net.lepidodendron.entity.model.entity.ModelCothurnocystis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCothurnocystis extends RenderLiving<EntityPrehistoricFloraCothurnocystis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cothurnocystis.png");
    public static final ModelBase MODEL_BASE = new ModelCothurnocystis();

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderCothurnocystis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCothurnocystis entity) {
        return RenderCothurnocystis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCothurnocystis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCothurnocystis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}