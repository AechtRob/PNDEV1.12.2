package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNerepisacanthus;
import net.lepidodendron.entity.model.entity.ModelNerepisacanthus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNerepisacanthus extends RenderLivingBaseWithBook<EntityPrehistoricFloraNerepisacanthus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nerepisacanthus.png");

    public static float getScaler() {
        return 0.18F;
    }
    public RenderNerepisacanthus(RenderManager mgr) {
        super(mgr, new ModelNerepisacanthus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNerepisacanthus entity) {
        return RenderNerepisacanthus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNerepisacanthus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNerepisacanthus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}