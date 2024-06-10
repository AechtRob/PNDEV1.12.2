package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPlatylomaspis;
import net.lepidodendron.entity.model.entity.ModelPlatylomaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPlatylomaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraPlatylomaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/platylomaspis.png");
    public static float getScaler() {
        return 0.165F;
    }

    public RenderPlatylomaspis(RenderManager mgr) {
        super(mgr, new ModelPlatylomaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPlatylomaspis entity) {
        return RenderPlatylomaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPlatylomaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPlatylomaspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}