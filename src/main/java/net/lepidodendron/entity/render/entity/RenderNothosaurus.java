package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNothosaurus;
import net.lepidodendron.entity.model.entity.ModelNothosaurus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNothosaurus extends RenderLiving<EntityPrehistoricFloraNothosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nothosaurus.png");
    public static final ModelBase MODEL_BASE = new ModelNothosaurus();

    public RenderNothosaurus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }
    public static float getScaler() {
        return 0.6f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNothosaurus entity) {
        return RenderNothosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNothosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraNothosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}



