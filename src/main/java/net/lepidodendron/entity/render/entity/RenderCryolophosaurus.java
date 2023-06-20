package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCryolophosaurus;
import net.lepidodendron.entity.model.entity.ModelCryolophosaurus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCryolophosaurus extends RenderLiving<EntityPrehistoricFloraCryolophosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cryolophosaurus.png");

    public RenderCryolophosaurus(RenderManager mgr) {
        super(mgr, new ModelCryolophosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.8F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCryolophosaurus entity) {
        return RenderCryolophosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCryolophosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCryolophosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}