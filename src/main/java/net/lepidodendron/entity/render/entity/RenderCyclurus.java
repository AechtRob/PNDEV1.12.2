package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCyclurus;
import net.lepidodendron.entity.model.entity.ModelCyclurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCyclurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraCyclurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cyclurus.png");

    public RenderCyclurus(RenderManager mgr) {
        super(mgr, new ModelCyclurus(), 0.0f);
    }

    public static float getScaler() {return 0.3096F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCyclurus entity) {
        return RenderCyclurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCyclurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraCyclurus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}