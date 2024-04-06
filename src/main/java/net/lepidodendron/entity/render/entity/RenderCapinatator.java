package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCapinatator;
import net.lepidodendron.entity.model.entity.ModelCapinatator;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCapinatator extends RenderLiving<EntityPrehistoricFloraCapinatator> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/capinatator.png");
    public static float getScaler() {
        return 0.18F;
    }

    public RenderCapinatator(RenderManager mgr) {
        super(mgr, new ModelCapinatator(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCapinatator entity) {
        return RenderCapinatator.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCapinatator entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCapinatator entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}
