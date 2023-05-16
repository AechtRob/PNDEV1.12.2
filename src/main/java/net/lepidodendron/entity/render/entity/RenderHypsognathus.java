package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHypsognathus;
import net.lepidodendron.entity.model.entity.ModelHypsognathus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHypsognathus extends RenderLiving<EntityPrehistoricFloraHypsognathus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hypsognathus.png");
    public static final ModelBase MODEL_BASE = new ModelHypsognathus();

    public RenderHypsognathus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHypsognathus entity) {
        return RenderHypsognathus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHypsognathus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHypsognathus entity, float f) {
        float scale = entity.getAgeScale() * 1.125F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.1F;
    }

}