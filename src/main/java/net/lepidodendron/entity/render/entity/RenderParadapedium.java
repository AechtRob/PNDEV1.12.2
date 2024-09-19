package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParadapedium;
import net.lepidodendron.entity.model.entity.ModelParadapedium;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParadapedium extends RenderLivingBaseWithBook<EntityPrehistoricFloraParadapedium> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paradapedium.png");

    public static float getScaler() {
        return 0.29F;
    }
    public RenderParadapedium(RenderManager mgr) {
        super(mgr, new ModelParadapedium(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParadapedium entity) {
        return RenderParadapedium.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParadapedium entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraParadapedium entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}