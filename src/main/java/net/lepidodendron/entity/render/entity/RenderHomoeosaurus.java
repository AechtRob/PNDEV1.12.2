package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHomoeosaurus;
import net.lepidodendron.entity.model.entity.ModelHomoeosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHomoeosaurus extends RenderLiving<EntityPrehistoricFloraHomoeosaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/homoeosaurus.png");
    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderHomoeosaurus(RenderManager mgr) {
        super(mgr, new ModelHomoeosaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHomoeosaurus entity) {
        return RenderHomoeosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHomoeosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHomoeosaurus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}