package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDimetrodon;
import net.lepidodendron.entity.model.entity.ModelDimetrodon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDimetrodon extends RenderLiving<EntityPrehistoricFloraDimetrodon> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dimetrodon.png");

    public RenderDimetrodon(RenderManager mgr) {
        super(mgr, new ModelDimetrodon(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDimetrodon entity) {
        return RenderDimetrodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDimetrodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDimetrodon entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.350F;
    }

}