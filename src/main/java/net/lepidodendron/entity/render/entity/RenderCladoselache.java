package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCladoselache;
import net.lepidodendron.entity.model.entity.ModelCladoselache;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCladoselache extends RenderLiving<EntityPrehistoricFloraCladoselache> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cladoselache.png");

    public RenderCladoselache(RenderManager mgr) {
        super(mgr, new ModelCladoselache(), 0.32f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCladoselache entity) {
        return RenderCladoselache.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCladoselache entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCladoselache entity, float f) {
        float scale = entity.getAgeScale();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}