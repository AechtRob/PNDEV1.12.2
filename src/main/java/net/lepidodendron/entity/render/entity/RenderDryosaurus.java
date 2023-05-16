package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDryosaurus;
import net.lepidodendron.entity.model.entity.ModelDryosaurus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDryosaurus extends RenderLiving<EntityPrehistoricFloraDryosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dryosaurus.png");
    public static final ModelBase MODEL_BASE = new ModelDryosaurus();

    public RenderDryosaurus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.3f);
    }

    public static float getScaler() {
        return 0.53F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDryosaurus entity) {
        return RenderDryosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDryosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDryosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}