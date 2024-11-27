package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTuzoia;
import net.lepidodendron.entity.model.entity.ModelTuzoia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTuzoia extends RenderLivingBaseWithBook<EntityPrehistoricFloraTuzoia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/Tuzoia.png");

    public static float getScaler() {
        return 0.2F;
    }
    public RenderTuzoia(RenderManager mgr) {
        super(mgr, new ModelTuzoia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTuzoia entity) {
        return RenderTuzoia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTuzoia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTuzoia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}