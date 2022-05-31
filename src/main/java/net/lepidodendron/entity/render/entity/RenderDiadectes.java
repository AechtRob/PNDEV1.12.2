package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDiadectes;
import net.lepidodendron.entity.model.entity.ModelDiadectes;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDiadectes extends RenderLiving<EntityPrehistoricFloraDiadectes> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diadectes.png");

    public RenderDiadectes(RenderManager mgr) {
        super(mgr, new ModelDiadectes(), 0.4f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDiadectes entity) {
        return RenderDiadectes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDiadectes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDiadectes entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}