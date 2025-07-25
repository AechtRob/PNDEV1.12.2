package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSigmapycnodus;
import net.lepidodendron.entity.model.entity.ModelSigmapycnodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSigmapycnodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraSigmapycnodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sigmapycnodus.png");

    public RenderSigmapycnodus(RenderManager mgr) {
        super(mgr, new ModelSigmapycnodus(), 0.0f);
    }

    public static float getScaler() {return 0.5F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSigmapycnodus entity) {
        return RenderSigmapycnodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSigmapycnodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSigmapycnodus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





