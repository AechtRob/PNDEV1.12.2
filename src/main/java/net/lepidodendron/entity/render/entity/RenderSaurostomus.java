package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSaurostomus;
import net.lepidodendron.entity.model.entity.ModelSaurostomus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSaurostomus extends RenderLiving<EntityPrehistoricFloraSaurostomus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/saurostomus.png");

    public static float getScaler() {
        return 0.55F;
    }
    public RenderSaurostomus(RenderManager mgr) {
        super(mgr, new ModelSaurostomus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSaurostomus entity) {
        return RenderSaurostomus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSaurostomus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSaurostomus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}