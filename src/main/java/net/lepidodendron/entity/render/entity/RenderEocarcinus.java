package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEocarcinus;
import net.lepidodendron.entity.model.entity.ModelEocarcinus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEocarcinus extends RenderLiving<EntityPrehistoricFloraEocarcinus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eocarcinus.png");

    public static float getScaler() {
        return 0.7F * 0.33F;
    }

    public RenderEocarcinus(RenderManager mgr) {
        super(mgr, new ModelEocarcinus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEocarcinus entity) {
        return RenderEocarcinus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEocarcinus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEocarcinus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}