package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAnomalocaris;
import net.lepidodendron.entity.model.entity.ModelAnomalocaris;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAnomalocaris extends RenderLiving<EntityPrehistoricFloraAnomalocaris> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anomalocaris.png");

    public RenderAnomalocaris(RenderManager mgr) {
        super(mgr, new ModelAnomalocaris(), 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAnomalocaris entity) {
        return RenderAnomalocaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAnomalocaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAnomalocaris entity, float f) {
        GlStateManager.scale(1.4, 1.4, 1.4);
    }

}