package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTartuosteus;
import net.lepidodendron.entity.model.entity.ModelTartuosteus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTartuosteus extends RenderLiving<EntityPrehistoricFloraTartuosteus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tartuosteus.png");

    public RenderTartuosteus(RenderManager mgr) {
        super(mgr, new ModelTartuosteus(), 0.05f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTartuosteus entity) {
        return RenderTartuosteus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTartuosteus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTartuosteus entity, float f) {
        float scale =  1.5F;
        GlStateManager.scale(scale, scale, scale);
    }

}