package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAustelliscus;
import net.lepidodendron.entity.model.entity.ModelAustelliscus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAustelliscus extends RenderLivingBaseWithBook<EntityPrehistoricFloraAustelliscus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/austelliscus.png");

    public static float getScaler() {
        return 0.43F;
    }
    public RenderAustelliscus(RenderManager mgr) {
        super(mgr, new ModelAustelliscus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAustelliscus entity) {
        return RenderAustelliscus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAustelliscus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAustelliscus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}