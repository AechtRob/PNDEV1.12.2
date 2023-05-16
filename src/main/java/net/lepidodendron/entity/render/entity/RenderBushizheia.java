package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBushizheia;
import net.lepidodendron.entity.model.entity.ModelBushizheia;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBushizheia extends RenderLiving<EntityPrehistoricFloraBushizheia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bushizheia.png");
    public static final ModelBase MODEL_BASE = new ModelBushizheia();

    public RenderBushizheia(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.00f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBushizheia entity) {
        return RenderBushizheia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBushizheia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}