package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBobosaurus;
import net.lepidodendron.entity.model.entity.ModelBobosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBobosaurus extends RenderLiving<EntityPrehistoricFloraBobosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bobosaurus.png");

    public RenderBobosaurus(RenderManager mgr) {
        super(mgr, new ModelBobosaurus(), 0.0f);
    }
    public static float getScaler() {
        return 0.85f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBobosaurus entity) {
        return RenderBobosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBobosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraBobosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}



