package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGabreyaspis;
import net.lepidodendron.entity.model.entity.ModelGabreyaspis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGabreyaspis extends RenderLiving<EntityPrehistoricFloraGabreyaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gabreyaspis.png");
    public static final ModelBase MODEL_BASE = new ModelGabreyaspis();

    public RenderGabreyaspis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGabreyaspis entity) {
        return RenderGabreyaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGabreyaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}