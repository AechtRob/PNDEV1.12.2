package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWaagenella;
import net.lepidodendron.entity.model.entity.ModelWaagenella;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWaagenella extends RenderLivingBaseWithBook<EntityPrehistoricFloraWaagenella> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/waagenella.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderWaagenella(RenderManager mgr) {
        super(mgr, new ModelWaagenella(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWaagenella entity) {
        return RenderWaagenella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWaagenella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraWaagenella entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}