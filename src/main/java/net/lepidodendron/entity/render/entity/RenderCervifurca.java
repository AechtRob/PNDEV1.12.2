package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCervifurca;
import net.lepidodendron.entity.model.entity.ModelCervifurca;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCervifurca extends RenderLiving<EntityPrehistoricFloraCervifurca> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cervifurca.png");

    public static float getScaler() {
        return 0.7F * 0.5F;
    }
    public RenderCervifurca(RenderManager mgr) {
        super(mgr, new ModelCervifurca(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCervifurca entity) {
        return RenderCervifurca.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCervifurca entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCervifurca entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}