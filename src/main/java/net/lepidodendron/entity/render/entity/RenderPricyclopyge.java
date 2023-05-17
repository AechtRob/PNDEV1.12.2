package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPricyclopyge;
import net.lepidodendron.entity.model.entity.ModelPricyclopyge;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPricyclopyge extends RenderLiving<EntityPrehistoricFloraPricyclopyge> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pricyclopyge.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }

    public RenderPricyclopyge(RenderManager mgr) {
        super(mgr, new ModelPricyclopyge(), 0.0f);
        this.addLayer(new LayerPricyclopygeEmissive(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPricyclopyge entity) {
        return RenderPricyclopyge.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPricyclopyge entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPricyclopyge entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}