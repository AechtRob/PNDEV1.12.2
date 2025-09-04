package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHuanghelepis;
import net.lepidodendron.entity.model.entity.ModelHuanghelepis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHuanhelepis extends RenderLivingBaseWithBook<EntityPrehistoricFloraHuanghelepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/huanghelepis.png");

    public static float getScaler() {
        return 0.19F;
    }
    public RenderHuanhelepis(RenderManager mgr) {
        super(mgr, new ModelHuanghelepis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHuanghelepis entity) {
        return RenderHuanhelepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHuanghelepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHuanghelepis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}