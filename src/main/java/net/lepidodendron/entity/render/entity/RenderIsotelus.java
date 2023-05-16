package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraIsotelus;
import net.lepidodendron.entity.model.entity.ModelIsotelus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderIsotelus extends RenderLiving<EntityPrehistoricFloraIsotelus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/isotelus.png");
    public static final ModelBase MODEL_BASE = new ModelIsotelus();

    public RenderIsotelus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraIsotelus entity) {
        return RenderIsotelus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraIsotelus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraIsotelus entity, float f) {
        float scale = 0.8F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }
}