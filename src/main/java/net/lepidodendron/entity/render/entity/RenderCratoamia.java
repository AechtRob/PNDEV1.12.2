package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCratoamia;
import net.lepidodendron.entity.model.entity.ModelCratoamia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCratoamia extends RenderLivingBaseWithBook<EntityPrehistoricFloraCratoamia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cratoamia.png");

    public RenderCratoamia(RenderManager mgr) {
        super(mgr, new ModelCratoamia(), 0.0f);
    }

    public static float getScaler() {return 0.43F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCratoamia entity) {
        return RenderCratoamia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCratoamia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraCratoamia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}