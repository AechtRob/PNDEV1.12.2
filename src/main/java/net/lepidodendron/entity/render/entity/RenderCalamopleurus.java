package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCalamopleurus;
import net.lepidodendron.entity.model.entity.ModelCalamopleurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCalamopleurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraCalamopleurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/calamopleurus.png");

    public RenderCalamopleurus(RenderManager mgr) {
        super(mgr, new ModelCalamopleurus(), 0.0f);
    }

    public static float getScaler() {return 0.51F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCalamopleurus entity) {
        return RenderCalamopleurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCalamopleurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraCalamopleurus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}