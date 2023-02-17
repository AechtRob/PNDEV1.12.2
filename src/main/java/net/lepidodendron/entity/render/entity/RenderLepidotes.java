package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLepidotes;
import net.lepidodendron.entity.model.entity.ModelLepidotes;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLepidotes extends RenderLiving<EntityPrehistoricFloraLepidotes> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lepidotes.png");
    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderLepidotes(RenderManager mgr) {
        super(mgr, new ModelLepidotes(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLepidotes entity) {
        return RenderLepidotes.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLepidotes entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLepidotes entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}