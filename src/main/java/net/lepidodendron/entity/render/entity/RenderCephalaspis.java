package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCephalaspis;
import net.lepidodendron.entity.model.entity.ModelCephalaspis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCephalaspis extends RenderLiving<EntityPrehistoricFloraCephalaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cephalaspis.png");

    public static float getScaler() {return 0.29F;}
    public RenderCephalaspis(RenderManager mgr) {
        super(mgr, new ModelCephalaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCephalaspis entity) {
        return RenderCephalaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCephalaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCephalaspis entity, float f) {
        float scale = getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.45F;
    }
}