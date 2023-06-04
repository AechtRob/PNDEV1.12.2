package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLaidleria;
import net.lepidodendron.entity.model.entity.ModelLaidleria;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLaidleria extends RenderLiving<EntityPrehistoricFloraLaidleria> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/laidleria.png");

    public static float getScaler() {
        return 0.7F * 0.44F;
    }
    public RenderLaidleria(RenderManager mgr) {
        super(mgr, new ModelLaidleria(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLaidleria entity) {
        return RenderLaidleria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLaidleria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLaidleria entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}