package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCaerorhachis;
import net.lepidodendron.entity.model.entity.ModelCaerorhachis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCaerorhachis extends RenderLivingBaseWithBook<EntityPrehistoricFloraCaerorhachis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/caerorhachis.png");

    public static float getScaler() {return 0.26f;}

    public RenderCaerorhachis(RenderManager mgr) {
        super(mgr, new ModelCaerorhachis(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCaerorhachis entity) {
        return RenderCaerorhachis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCaerorhachis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCaerorhachis entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}