package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFadeniaCarboniferous;
import net.lepidodendron.entity.model.entity.ModelFadenia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFadeniaCarboniferous extends RenderLiving<EntityPrehistoricFloraFadeniaCarboniferous> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/fadenia_carboniferous.png");

    public RenderFadeniaCarboniferous(RenderManager mgr) {
        super(mgr, new ModelFadenia(), 0.5f);
    }

    public static float getScaler() {
        return 1.125F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFadeniaCarboniferous entity) {
        return RenderFadeniaCarboniferous.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFadeniaCarboniferous entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraFadeniaCarboniferous entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.75F;
    }

}