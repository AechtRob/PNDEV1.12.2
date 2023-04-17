package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEunotosaurus;
import net.lepidodendron.entity.model.entity.ModelEunotosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEunotosaurus extends RenderLiving<EntityPrehistoricFloraEunotosaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eunotosaurus.png");
    public static float getScaler() {
        return 0.7F * 0.34F;
    }
    public RenderEunotosaurus(RenderManager mgr) {
        super(mgr, new ModelEunotosaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEunotosaurus entity) {
        return RenderEunotosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEunotosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEunotosaurus entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}