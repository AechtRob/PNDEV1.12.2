package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDaidal;
import net.lepidodendron.entity.model.entity.ModelDaidal;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDaidal extends RenderLivingBaseWithBook<EntityPrehistoricFloraDaidal> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/daidal.png");

    public static float getScaler() {
        return 0.7F * 0.17F;
    }
    public RenderDaidal(RenderManager mgr) {
        super(mgr, new ModelDaidal(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDaidal entity) {
        return RenderDaidal.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDaidal entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDaidal entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}