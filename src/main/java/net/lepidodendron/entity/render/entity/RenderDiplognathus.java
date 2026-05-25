package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDiplognathus;
import net.lepidodendron.entity.model.entity.ModelDiplognathus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDiplognathus extends RenderLivingBaseWithBook<EntityPrehistoricFloraDiplognathus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diplognathus.png");

    public static float getScaler() {
        return 0.8F;
    }
    public RenderDiplognathus(RenderManager mgr) {
        super(mgr, new ModelDiplognathus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDiplognathus entity) {
        return RenderDiplognathus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDiplognathus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDiplognathus entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}