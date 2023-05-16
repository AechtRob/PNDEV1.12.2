package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBalanerpeton;
import net.lepidodendron.entity.model.entity.ModelBalanerpeton;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBalanerpeton extends RenderLiving<EntityPrehistoricFloraBalanerpeton> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/balanerpeton.png");
    public static final ModelBase MODEL_BASE = new ModelBalanerpeton();

    public RenderBalanerpeton(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.25F);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBalanerpeton entity) {
        return RenderBalanerpeton.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBalanerpeton entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBalanerpeton entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.2F;
    }

}