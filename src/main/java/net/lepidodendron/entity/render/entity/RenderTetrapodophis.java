package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTetrapodophis;
import net.lepidodendron.entity.model.entity.ModelTetrapodophis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTetrapodophis extends RenderLivingBaseWithBook<EntityPrehistoricFloraTetrapodophis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tetrapodophis.png");

    public static float getScaler() {return 0.19f;}

    public RenderTetrapodophis(RenderManager mgr) {
        super(mgr, new ModelTetrapodophis(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTetrapodophis entity) {
        return RenderTetrapodophis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTetrapodophis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTetrapodophis entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

}