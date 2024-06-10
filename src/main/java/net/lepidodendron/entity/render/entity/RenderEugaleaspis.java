package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEugaleaspis;
import net.lepidodendron.entity.model.entity.ModelEugaleaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEugaleaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraEugaleaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eugaleaspis.png");

    public static float getScaler() {
        return 0.33F;
    }
    public RenderEugaleaspis(RenderManager mgr) {
        super(mgr, new ModelEugaleaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEugaleaspis entity) {
        return RenderEugaleaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEugaleaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEugaleaspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}