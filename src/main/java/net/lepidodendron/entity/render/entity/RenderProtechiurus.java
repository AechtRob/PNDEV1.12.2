package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProtechiurus;
import net.lepidodendron.entity.model.entity.ModelProtechiurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProtechiurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraProtechiurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/protechiurus.png");
    public static float getScaler() {
        return 0.35F;
    }

    public RenderProtechiurus(RenderManager mgr) {
        super(mgr, new ModelProtechiurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProtechiurus entity) {
        return RenderProtechiurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProtechiurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraProtechiurus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}