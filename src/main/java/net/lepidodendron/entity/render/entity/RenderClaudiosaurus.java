package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraClaudiosaurus;
import net.lepidodendron.entity.model.entity.ModelClaudiosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderClaudiosaurus extends RenderLiving<EntityPrehistoricFloraClaudiosaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/claudiosaurus.png");

    public RenderClaudiosaurus(RenderManager mgr) {
        super(mgr, new ModelClaudiosaurus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraClaudiosaurus entity) {
        return RenderClaudiosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraClaudiosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraClaudiosaurus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.18F;
    }

}