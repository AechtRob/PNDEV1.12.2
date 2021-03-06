package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraReticulolepis;
import net.lepidodendron.entity.model.entity.ModelAcrolepis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderReticulolepis extends RenderLiving<EntityPrehistoricFloraReticulolepis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/reticulolepis.png");

    public RenderReticulolepis(RenderManager mgr) {
        super(mgr, new ModelAcrolepis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraReticulolepis entity) {
        return RenderReticulolepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraReticulolepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraReticulolepis entity, float f) {
        GlStateManager.scale(0.92F, 0.92F, 0.92F);
    }

}