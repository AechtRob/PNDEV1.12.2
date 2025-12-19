package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBajadasaurus;
import net.lepidodendron.entity.model.entity.ModelBajadasaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBajadasaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraBajadasaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bajadasaurus.png");

    public RenderBajadasaurus(RenderManager mgr) {
        super(mgr, new ModelBajadasaurus(), 0.2f);
    }

    public static float getScaler() {
        return 1.0F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBajadasaurus entity) {
        return RenderBajadasaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBajadasaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBajadasaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}