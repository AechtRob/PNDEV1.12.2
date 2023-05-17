package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOphthalmosaurus;
import net.lepidodendron.entity.model.entity.ModelOphthalmosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOphthalmosaurus extends RenderLiving<EntityPrehistoricFloraOphthalmosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ophthalmosaurus.png");

    public static float getScaler() {
        return 0.7F;
    }

    public RenderOphthalmosaurus(RenderManager mgr) {
        super(mgr, new ModelOphthalmosaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOphthalmosaurus entity) {
        return RenderOphthalmosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOphthalmosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOphthalmosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}




