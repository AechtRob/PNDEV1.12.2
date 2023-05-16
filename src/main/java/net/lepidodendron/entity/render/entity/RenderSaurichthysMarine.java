package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSaurichthysMarine;
import net.lepidodendron.entity.model.entity.ModelSaurichthys;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSaurichthysMarine extends RenderLiving<EntityPrehistoricFloraSaurichthysMarine> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/saurichthys_marine.png");
    public static final ModelBase MODEL_BASE = new ModelSaurichthys();

    public RenderSaurichthysMarine(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSaurichthysMarine entity) {
        return RenderSaurichthysMarine.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSaurichthysMarine entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSaurichthysMarine entity, float f) {
        float scale = 2.3F; //Marine variant is up to 1.6m, others are c.80cm
        GlStateManager.scale(scale, scale, scale);
    }

}