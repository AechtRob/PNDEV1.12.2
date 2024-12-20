package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGoldringia;
import net.lepidodendron.entity.model.entity.ModelGoldringia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGoldringia extends RenderLivingBaseWithBook<EntityPrehistoricFloraGoldringia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/goldringia.png");

    public static float getScaler() {
        return 0.7F * 0.2F;
    }
    public RenderGoldringia(RenderManager mgr) {
        super(mgr, new ModelGoldringia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGoldringia entity) {
        return RenderGoldringia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGoldringia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGoldringia entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}