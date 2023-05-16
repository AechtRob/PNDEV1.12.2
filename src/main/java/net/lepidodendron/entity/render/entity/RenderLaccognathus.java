package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLaccognathus;
import net.lepidodendron.entity.model.entity.ModelLaccognathus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLaccognathus extends RenderLiving<EntityPrehistoricFloraLaccognathus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/laccognathus.png");
    public static final ModelBase MODEL_BASE = new ModelLaccognathus();

    public RenderLaccognathus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLaccognathus entity) {
        return RenderLaccognathus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLaccognathus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLaccognathus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}