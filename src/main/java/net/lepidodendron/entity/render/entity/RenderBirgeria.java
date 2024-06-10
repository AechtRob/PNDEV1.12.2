package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBirgeria;
import net.lepidodendron.entity.model.entity.ModelBirgeria;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBirgeria extends RenderLivingBaseWithBook<EntityPrehistoricFloraBirgeria> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/birgeria.png");

    public RenderBirgeria(RenderManager mgr) {
        super(mgr, new ModelBirgeria(), 0.0f);
    }

    public static float getScaler() {return 0.5F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBirgeria entity) {
        return RenderBirgeria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBirgeria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraBirgeria entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}