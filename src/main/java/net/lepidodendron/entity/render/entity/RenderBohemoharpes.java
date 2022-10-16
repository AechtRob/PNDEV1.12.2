package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBohemoharpes;
import net.lepidodendron.entity.model.entity.ModelBohemoharpes;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBohemoharpes extends RenderLiving<EntityPrehistoricFloraBohemoharpes> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bohemoharpes.png");

    public RenderBohemoharpes(RenderManager mgr) {
        super(mgr, new ModelBohemoharpes(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBohemoharpes entity) {
        return RenderBohemoharpes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBohemoharpes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBohemoharpes entity, float f) {
        float scale = 0.65F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}