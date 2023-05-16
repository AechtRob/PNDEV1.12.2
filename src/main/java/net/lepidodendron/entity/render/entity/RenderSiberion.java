package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSiberion;
import net.lepidodendron.entity.model.entity.ModelSiberion;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSiberion extends RenderLiving<EntityPrehistoricFloraSiberion> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/siberion.png");
    public static final ModelBase MODEL_BASE = new ModelSiberion();

    public RenderSiberion(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSiberion entity) {
        return RenderSiberion.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSiberion entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}