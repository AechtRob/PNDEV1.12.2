package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCumnoria;
import net.lepidodendron.entity.model.entity.ModelCumnoria;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCumnoria extends RenderLivingBaseWithBook<EntityPrehistoricFloraCumnoria> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cumnoria.png");

    public static float getScaler() {
        return 0.625f;
    }

    public RenderCumnoria(RenderManager mgr) {
        super(mgr, new ModelCumnoria(), RenderDisplays.modelCumnoria, 0.80F);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCumnoria entity) {
        return RenderCumnoria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCumnoria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCumnoria entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.80F;
    }

}