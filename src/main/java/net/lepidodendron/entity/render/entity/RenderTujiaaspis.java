package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTujiaaspis;
import net.lepidodendron.entity.model.entity.ModelTujiaaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTujiaaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraTujiaaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tujiaaspis.png");

    public static float getScaler() {
        return 0.7F * 0.28F;
    }
    public RenderTujiaaspis(RenderManager mgr) {
        super(mgr, new ModelTujiaaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTujiaaspis entity) {
        return RenderTujiaaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTujiaaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTujiaaspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}