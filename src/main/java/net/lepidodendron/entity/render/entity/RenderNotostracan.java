package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNotostracan;
import net.lepidodendron.entity.model.entity.ModelNotostracan;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNotostracan extends RenderLiving<EntityPrehistoricFloraNotostracan> {
    public static final ResourceLocation TEXTURE_STRUDOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/strudops.png");
    public static final ResourceLocation TEXTURE_TRIOPS1 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/triops1.png");
    public static final ResourceLocation TEXTURE_TRIOPS2 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/triops2.png");
    public static final ResourceLocation TEXTURE_TRIOPS3 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/triops3.png");


    public RenderNotostracan(RenderManager mgr) {
        super(mgr, new ModelNotostracan(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNotostracan entity) {
        switch (entity.getPNType()) {
            case STRUDOPS: default:
                return TEXTURE_STRUDOPS;

            case TRIOPS1:
                return TEXTURE_TRIOPS1;

            case TRIOPS2:
                return TEXTURE_TRIOPS2;

            case TRIOPS3:
                return TEXTURE_TRIOPS3;
        }
    }


    @Override
    protected void applyRotations(EntityPrehistoricFloraNotostracan entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    public static float getScaler(EntityPrehistoricFloraNotostracan.Type variant) {
        switch (variant) {
            case STRUDOPS:
            default:
                return 0.22F;

            case TRIOPS1:
                return 0.29F;

            case TRIOPS2:
                return 0.2F;

            case TRIOPS3:
                return 0.23F;
        }
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNotostracan entity, float f) {
        float scale = 1.0F * getScaler(entity.getPNType());
        GlStateManager.scale(scale, scale, scale);
    }

}