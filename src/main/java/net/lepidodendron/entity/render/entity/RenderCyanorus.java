package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCyanorus;
import net.lepidodendron.entity.model.entity.ModelCyanorus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCyanorus extends RenderLivingBaseWithBook<EntityPrehistoricFloraCyanorus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cyanorus_internal.png");
    public static float getScaler() {
        return 0.35F;
    }

    public RenderCyanorus(RenderManager mgr) {
        super(mgr, new ModelCyanorus(), 0.0f);
        this.addLayer(new LayerCyanorusBody(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCyanorus entity) {
        return RenderCyanorus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCyanorus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraCyanorus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}