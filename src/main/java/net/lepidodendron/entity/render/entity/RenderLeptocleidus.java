package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLeptocleidus;
import net.lepidodendron.entity.model.entity.ModelLeptocleidus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLeptocleidus extends RenderLivingBaseWithBook<EntityPrehistoricFloraLeptocleidus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/leptocleidus.png");

    public static float getScaler() {
        return 0.68F;
    }
    public RenderLeptocleidus(RenderManager mgr) {
        super(mgr, new ModelLeptocleidus(), 1.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLeptocleidus entity) {
        return RenderLeptocleidus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLeptocleidus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLeptocleidus entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}