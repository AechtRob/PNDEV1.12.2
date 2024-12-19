package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraUighuroniscus;
import net.lepidodendron.entity.model.entity.ModelUighuroniscus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUighuroniscus extends RenderLivingBaseWithBook<EntityPrehistoricFloraUighuroniscus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/uighuroniscus.png");

    public static float getScaler() {
        return 0.16F;
    }
    public RenderUighuroniscus(RenderManager mgr) {
        super(mgr, new ModelUighuroniscus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraUighuroniscus entity) {
        return RenderUighuroniscus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraUighuroniscus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraUighuroniscus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}