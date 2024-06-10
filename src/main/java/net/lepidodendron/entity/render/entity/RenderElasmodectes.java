package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraElasmodectes;
import net.lepidodendron.entity.model.entity.ModelElasmodectes;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderElasmodectes extends RenderLivingBaseWithBook<EntityPrehistoricFloraElasmodectes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/elasmodectes.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderElasmodectes(RenderManager mgr) {
        super(mgr, new ModelElasmodectes(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraElasmodectes entity) {
        return RenderElasmodectes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraElasmodectes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraElasmodectes entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}