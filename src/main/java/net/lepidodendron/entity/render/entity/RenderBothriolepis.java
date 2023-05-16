package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBothriolepis;
import net.lepidodendron.entity.model.entity.ModelBothriolepis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBothriolepis extends RenderLiving<EntityPrehistoricFloraBothriolepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bothriolepis.png");
    public static final ModelBase MODEL_BASE = new ModelBothriolepis();

    public RenderBothriolepis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBothriolepis entity) {
        return RenderBothriolepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBothriolepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBothriolepis entity, float f) {
        float scale = entity.getAgeScale();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3f;
    }
    
}