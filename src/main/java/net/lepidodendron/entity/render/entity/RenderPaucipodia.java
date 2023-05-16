package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPaucipodia;
import net.lepidodendron.entity.model.entity.ModelPaucipodia;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPaucipodia extends RenderLiving<EntityPrehistoricFloraPaucipodia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paucipodia.png");
    public static final ModelBase MODEL_BASE = new ModelPaucipodia();

    public RenderPaucipodia(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPaucipodia entity) {
        return RenderPaucipodia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPaucipodia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPaucipodia entity, float f) {
        GlStateManager.scale(0.65, 0.65, 0.65);
    }

}