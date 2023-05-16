package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPlatypeltoides;
import net.lepidodendron.entity.model.entity.ModelPlatypeltoides;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPlatypeltoides extends RenderLiving<EntityPrehistoricFloraPlatypeltoides> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/platypeltoides.png");
    public static final ModelBase MODEL_BASE = new ModelPlatypeltoides();

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderPlatypeltoides(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPlatypeltoides entity) {
        return RenderPlatypeltoides.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPlatypeltoides entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPlatypeltoides entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}