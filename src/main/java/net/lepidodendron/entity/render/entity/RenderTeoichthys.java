package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTeoichthys;
import net.lepidodendron.entity.model.entity.ModelTeoichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTeoichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraTeoichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/teoichthys.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderTeoichthys(RenderManager mgr) {
        super(mgr, new ModelTeoichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTeoichthys entity) {
        return RenderTeoichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTeoichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTeoichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}