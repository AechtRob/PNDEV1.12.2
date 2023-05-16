package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeocidaris;
import net.lepidodendron.entity.model.entity.ModelArchaeocidaris;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArchaeocidaris extends RenderLiving<EntityPrehistoricFloraArchaeocidaris> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archaeocidaris.png");
    public static final ModelBase MODEL_BASE = new ModelArchaeocidaris();

    public RenderArchaeocidaris(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArchaeocidaris entity) {
        return RenderArchaeocidaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArchaeocidaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraArchaeocidaris entity, float f) {
        float scale =  0.22F;
        GlStateManager.scale(scale, scale, scale);
    }
}