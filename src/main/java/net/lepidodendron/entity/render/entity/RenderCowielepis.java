package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCowielepis;
import net.lepidodendron.entity.model.entity.ModelCowielepis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCowielepis extends RenderLiving<EntityPrehistoricFloraCowielepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cowielepis.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderCowielepis(RenderManager mgr) {
        super(mgr, new ModelCowielepis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCowielepis entity) {
        return RenderCowielepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCowielepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCowielepis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}