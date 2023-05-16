package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCampbellodus;
import net.lepidodendron.entity.model.entity.ModelCampbellodus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCampbellodus extends RenderLiving<EntityPrehistoricFloraCampbellodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/campbellodus.png");
    public static final ModelBase MODEL_BASE = new ModelCampbellodus();

    public static float getScaler() {
        return 0.15F;
    }

    public RenderCampbellodus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCampbellodus entity) {
        return RenderCampbellodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCampbellodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCampbellodus entity, float f) {
        float scale = entity.getAgeScale()*this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.3f;
    }

}