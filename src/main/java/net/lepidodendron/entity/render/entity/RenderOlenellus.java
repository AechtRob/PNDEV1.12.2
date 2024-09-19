package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOlenellus;
import net.lepidodendron.entity.model.entity.ModelOlenellus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOlenellus extends RenderLivingBaseWithBook<EntityPrehistoricFloraOlenellus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/olenellus.png");

    public static float getScaler() {
        return 0.32F;
    }
    public RenderOlenellus(RenderManager mgr) {
        super(mgr, new ModelOlenellus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOlenellus entity) {
        return RenderOlenellus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOlenellus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOlenellus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}