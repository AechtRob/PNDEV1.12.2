package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSasayamamylos;
import net.lepidodendron.entity.model.entity.ModelSasayamamylos;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSasayamamylos extends RenderLivingBaseWithBook<EntityPrehistoricFloraSasayamamylos> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sasayamamylos.png");

    public RenderSasayamamylos(RenderManager mgr) {
        super(mgr, new ModelSasayamamylos(), 0.3f);
    }

    public static float getScaler() {
        return 0.21F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSasayamamylos entity) {
        return RenderSasayamamylos.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSasayamamylos entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSasayamamylos entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}