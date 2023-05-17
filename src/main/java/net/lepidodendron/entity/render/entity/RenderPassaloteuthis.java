package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPassaloteuthis;
import net.lepidodendron.entity.model.entity.ModelPassaloteuthis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPassaloteuthis extends RenderLiving<EntityPrehistoricFloraPassaloteuthis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/passaloteuthis.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderPassaloteuthis(RenderManager mgr) {
        super(mgr,  new ModelPassaloteuthis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPassaloteuthis entity) {
        return RenderPassaloteuthis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPassaloteuthis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPassaloteuthis entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}