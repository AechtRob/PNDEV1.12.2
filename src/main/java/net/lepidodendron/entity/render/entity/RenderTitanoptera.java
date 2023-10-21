package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTitanoptera;
import net.lepidodendron.entity.model.entity.ModelTitanoptera;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTitanoptera extends RenderLiving<EntityPrehistoricFloraTitanoptera> {
    public static final ResourceLocation TEXTURE_CLATROTITAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_clatrotitan.png");
    public static final ResourceLocation TEXTURE_GIGATITAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_gigatitan.png");
    public static final ResourceLocation TEXTURE_MESOTITAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_mesotitan.png");

    public RenderTitanoptera(RenderManager mgr) {
        super(mgr, new ModelTitanoptera(), 0.0f);
        this.addLayer(new LayerTitanopteraWing(this));
    }

    public static float getScaler() {return 0.180f;}

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTitanoptera entity) {
        switch (entity.getPNType()) {
            case CLATROTITAN: default:
                return TEXTURE_CLATROTITAN;

            case GIGATITAN:
                return TEXTURE_GIGATITAN;

            case MESOTITAN:
                return TEXTURE_MESOTITAN;

        }
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTitanoptera entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTitanoptera entity, float f) {
        float scaler = this.getScaler();
        switch (entity.getPNType()) {
            case CLATROTITAN: default:
                scaler = 0.255F;
                break;

            case GIGATITAN:
                scaler = 0.280F;
                break;

            case MESOTITAN:
                scaler = 0.270F;
                break;
        }
        float scale = 1.0F * scaler;
//        if (entity.world.getBlockState(entity.getPosition()).getBlock() == BlockGlassJar.block) {
//            scale = Math.min() 0.8F * scaler;
//        }
        GlStateManager.scale(scale, scale, scale);
    }

}