package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAsteracanthus;
import net.lepidodendron.entity.model.entity.ModelAsteracanthus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAsteracanthus extends RenderLivingBaseWithBook<EntityPrehistoricFloraAsteracanthus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/asteracanthus.png");

    public static float getScaler() {
        return 0.8F;
    }
    public RenderAsteracanthus(RenderManager mgr) {
        super(mgr, new ModelAsteracanthus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAsteracanthus entity) {
        return RenderAsteracanthus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAsteracanthus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAsteracanthus entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}