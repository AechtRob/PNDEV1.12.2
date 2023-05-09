package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCeratosaurus;
import net.lepidodendron.entity.model.entity.ModelCeratosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCeratosaurus extends RenderLiving<EntityPrehistoricFloraCeratosaurus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ceratosaurus.png");

    public RenderCeratosaurus(RenderManager mgr) {
        super(mgr, new ModelCeratosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.83F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCeratosaurus entity) {
        return RenderCeratosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCeratosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCeratosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}