package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTiktaalik;
import net.lepidodendron.entity.model.entity.ModelTiktaalik;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTiktaalik extends RenderLiving<EntityPrehistoricFloraTiktaalik> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tiktaalik.png");

    public RenderTiktaalik(RenderManager mgr) {
        super(mgr, new ModelTiktaalik(), 0.4f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTiktaalik entity) {
        return RenderTiktaalik.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTiktaalik entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTiktaalik entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.275F;
    }

}