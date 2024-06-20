package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBunostegos;
import net.lepidodendron.entity.model.entity.ModelBunostegos;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBunostegos extends RenderLivingBaseWithBook<EntityPrehistoricFloraBunostegos> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bunostegos.png");

    public static float getScaler() {return 0.90f;}

    public RenderBunostegos(RenderManager mgr) {
        super(mgr, new ModelBunostegos(), 0.5F);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBunostegos entity) {
        return RenderBunostegos.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBunostegos entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBunostegos entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}