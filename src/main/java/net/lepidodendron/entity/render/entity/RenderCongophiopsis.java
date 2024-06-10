package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCongophiopsis;
import net.lepidodendron.entity.model.entity.ModelCongophiopsis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCongophiopsis extends RenderLivingBaseWithBook<EntityPrehistoricFloraCongophiopsis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/congophiopsis.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderCongophiopsis(RenderManager mgr) {
        super(mgr, new ModelCongophiopsis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCongophiopsis entity) {
        return RenderCongophiopsis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCongophiopsis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCongophiopsis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}