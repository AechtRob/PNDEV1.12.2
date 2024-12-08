package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCladocyclus;
import net.lepidodendron.entity.model.entity.ModelCladocyclus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCladocyclus extends RenderLivingBaseWithBook<EntityPrehistoricFloraCladocyclus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cladocyclus.png");

    public static float getScaler() {
        return 0.454F;
    }
    public RenderCladocyclus(RenderManager mgr) {
        super(mgr, new ModelCladocyclus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCladocyclus entity) {
        return RenderCladocyclus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCladocyclus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCladocyclus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler() ;
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}