package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNematoptychius;
import net.lepidodendron.entity.model.entity.ModelNematoptychius;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNematoptychius extends RenderLivingBaseWithBook<EntityPrehistoricFloraNematoptychius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nematoptychius.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderNematoptychius(RenderManager mgr) {
        super(mgr, new ModelNematoptychius(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNematoptychius entity) {
        return RenderNematoptychius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNematoptychius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNematoptychius entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}