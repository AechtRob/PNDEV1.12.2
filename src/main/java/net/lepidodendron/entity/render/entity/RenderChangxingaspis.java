package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraChangxingaspis;
import net.lepidodendron.entity.model.entity.ModelChangxingaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderChangxingaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraChangxingaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/changxingaspis.png");

    public static float getScaler() {
        return 0.7F * 0.28F;
    }
    public RenderChangxingaspis(RenderManager mgr) {
        super(mgr, new ModelChangxingaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraChangxingaspis entity) {
        return RenderChangxingaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraChangxingaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraChangxingaspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}