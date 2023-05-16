package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCyamodus;
import net.lepidodendron.entity.model.entity.ModelCyamodus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCyamodus extends RenderLiving<EntityPrehistoricFloraCyamodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cyamodus.png");
    public static final ModelBase MODEL_BASE = new ModelCyamodus();

    public static float getScaler() {
        return 0.42f;
    }

    public RenderCyamodus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCyamodus entity) {
        return RenderCyamodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCyamodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCyamodus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.35F;
    }

}





