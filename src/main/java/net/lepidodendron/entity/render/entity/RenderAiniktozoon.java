package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAiniktozoon;
import net.lepidodendron.entity.EntityPrehistoricFloraTurboscinetes;
import net.lepidodendron.entity.model.entity.ModelAiniktozoon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAiniktozoon extends RenderLiving<EntityPrehistoricFloraAiniktozoon> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ainiktozoon.png");
    public static float getScaler() {
        return 0.33F;
    }

    public RenderAiniktozoon(RenderManager mgr) {
        super(mgr, new ModelAiniktozoon(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAiniktozoon entity) {
        return RenderAiniktozoon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAiniktozoon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAiniktozoon entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}