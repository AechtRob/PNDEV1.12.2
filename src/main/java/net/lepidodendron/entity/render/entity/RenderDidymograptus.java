package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDidymograptus;
import net.lepidodendron.entity.model.entity.ModelDidymograptus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDidymograptus extends RenderLivingBaseWithBook<EntityPrehistoricFloraDidymograptus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/didymograptus.png");
    public static float getScaler() {
        return 0.36F;
    }

    public RenderDidymograptus(RenderManager mgr) {
        super(mgr, new ModelDidymograptus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDidymograptus entity) {
        return RenderDidymograptus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDidymograptus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDidymograptus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}