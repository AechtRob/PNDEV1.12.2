package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeoctenophora;
import net.lepidodendron.entity.model.entity.ModelPalaeoctenophora;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeoctenophora extends RenderLiving<EntityPrehistoricFloraPalaeoctenophora> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeoctenophora.png");

    public static float getScaler() {return 0.5F;}

    public RenderPalaeoctenophora(RenderManager mgr) {
        super(mgr, new ModelPalaeoctenophora(), 0.0f);
        this.addLayer(new LayerPalaeoctenophoraBody(this));
        this.addLayer(new LayerPalaeoctenophoraEmissive(this));

    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPalaeoctenophora entity) {
        return RenderPalaeoctenophora.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPalaeoctenophora entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPalaeoctenophora entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}