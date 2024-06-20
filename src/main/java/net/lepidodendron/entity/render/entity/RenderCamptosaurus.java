package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCamptosaurus;
import net.lepidodendron.entity.model.entity.ModelCamptosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCamptosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraCamptosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/camptosaurus.png");

    public static float getScaler() {
        return 0.65f;
    }

    public RenderCamptosaurus(RenderManager mgr) {
        super(mgr, new ModelCamptosaurus(),0.9f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCamptosaurus entity) {
        return RenderCamptosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCamptosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCamptosaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.90F;
    }

}