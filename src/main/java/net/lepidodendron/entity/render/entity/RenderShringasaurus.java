package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraShringasaurus;
import net.lepidodendron.entity.model.entity.ModelShringasaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderShringasaurus extends RenderLiving<EntityPrehistoricFloraShringasaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/shringasaurus_m.png");
    private static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/shringasaurus_f.png");
    public static float getScaler() {
        return 0.617f;
    }

    public RenderShringasaurus(RenderManager mgr) {
        super(mgr, new ModelShringasaurus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraShringasaurus entity) {
        if (entity.getIsFemale()) {
            return RenderShringasaurus.TEXTURE_F;
        }
        return RenderShringasaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraShringasaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraShringasaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        if (entity.getIsFemale()) {
            scale = scale * 0.85F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}