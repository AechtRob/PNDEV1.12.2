package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraStrobilopterus;
import net.lepidodendron.entity.model.entity.ModelStrobilopterus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderStrobilopterus extends RenderLivingBaseWithBook<EntityPrehistoricFloraStrobilopterus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/strobilopterus.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderStrobilopterus(RenderManager mgr) {
        super(mgr, new ModelStrobilopterus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraStrobilopterus entity) {
        return RenderStrobilopterus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraStrobilopterus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraStrobilopterus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}