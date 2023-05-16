package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCassinoceras;
import net.lepidodendron.entity.model.entity.ModelCassinoceras;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCassinoceras extends RenderLiving<EntityPrehistoricFloraCassinoceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cassinoceras.png");
    public static final ModelBase MODEL_BASE = new ModelCassinoceras();

    public RenderCassinoceras(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.1f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCassinoceras entity) {
        return RenderCassinoceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCassinoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCassinoceras entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.25F;
    }

}