package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBuchanosteus;
import net.lepidodendron.entity.model.entity.ModelBuchanosteus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBuchanosteus extends RenderLivingBaseWithBook<EntityPrehistoricFloraBuchanosteus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/buchanosteus.png");

    public static float getScaler() {
        return 0.35F;
    }
    public RenderBuchanosteus(RenderManager mgr) {
        super(mgr, new ModelBuchanosteus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBuchanosteus entity) {
        return RenderBuchanosteus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBuchanosteus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBuchanosteus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}