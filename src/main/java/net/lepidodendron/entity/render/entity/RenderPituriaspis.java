package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPituriaspis;
import net.lepidodendron.entity.model.entity.ModelPituriaspis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPituriaspis extends RenderLiving<EntityPrehistoricFloraPituriaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pituriaspis.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderPituriaspis(RenderManager mgr) {
        super(mgr, new ModelPituriaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPituriaspis entity) {
        return RenderPituriaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPituriaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPituriaspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}