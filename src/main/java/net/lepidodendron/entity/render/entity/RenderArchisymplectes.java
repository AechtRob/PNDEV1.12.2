package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArchisymplectes;
import net.lepidodendron.entity.model.entity.ModelArchisymplectes;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderArchisymplectes extends RenderLivingBaseWithBook<EntityPrehistoricFloraArchisymplectes> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archisymplectes.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderArchisymplectes(RenderManager mgr) {
        super(mgr, new ModelArchisymplectes(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArchisymplectes entity) {
        return RenderArchisymplectes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArchisymplectes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraArchisymplectes entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}