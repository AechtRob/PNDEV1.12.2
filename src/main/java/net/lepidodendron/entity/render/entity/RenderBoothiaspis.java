package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBoothiaspis;
import net.lepidodendron.entity.model.entity.ModelBoothiaspis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBoothiaspis extends RenderLiving<EntityPrehistoricFloraBoothiaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/boothiaspis.png");
    public static final ModelBase MODEL_BASE = new ModelBoothiaspis();

    public RenderBoothiaspis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBoothiaspis entity) {
        return RenderBoothiaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBoothiaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}



