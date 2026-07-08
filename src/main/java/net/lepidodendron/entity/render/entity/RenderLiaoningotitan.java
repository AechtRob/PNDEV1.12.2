package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLiaoningotitan;
import net.lepidodendron.entity.model.entity.ModelLiaoningotitan;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLiaoningotitan extends RenderLivingBaseWithBook<EntityPrehistoricFloraLiaoningotitan> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/liaoningotitan.png");

    public RenderLiaoningotitan(RenderManager mgr) {
        super(mgr, new ModelLiaoningotitan(), 0.2f);
    }

    public static float getScaler() {
        return 1.0F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLiaoningotitan entity) {
        return RenderLiaoningotitan.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLiaoningotitan entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLiaoningotitan entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}