package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAscoceras;
import net.lepidodendron.entity.model.entity.ModelAscoceras;
import net.lepidodendron.entity.model.entity.ModelAscocerasBaby;
import net.lepidodendron.entity.render.RenderLivingBaseVariantModels;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAscoceras extends RenderLivingBaseVariantModels<EntityPrehistoricFloraAscoceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ascoceras_adult.png");
    public static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ascoceras_baby.png");

    public RenderAscoceras(RenderManager mgr) {
        super(mgr, new ModelAscoceras(), new ModelBase[]{new ModelAscoceras(), new ModelAscocerasBaby()}, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAscoceras entity) {
        if (entity.isBaby()) {
            return RenderAscoceras.TEXTURE_BABY;
        }
        return RenderAscoceras.TEXTURE;
    }

    @Override
    public ModelBase getModelFromArray(EntityPrehistoricFloraAscoceras entity) {
        if (entity.isBaby()) {
            return this.mainModelArray[1];
        }
        return this.mainModelArray[0];
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAscoceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAscoceras entity, float f) {
        float scale = entity.getAgeScale() * 0.85F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}


