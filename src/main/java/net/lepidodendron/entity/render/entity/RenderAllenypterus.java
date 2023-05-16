package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAllenypterus;
import net.lepidodendron.entity.model.entity.ModelAllenypterus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAllenypterus extends RenderLiving<EntityPrehistoricFloraAllenypterus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/allenypterus.png");
    public static final ModelBase MODEL_BASE = new ModelAllenypterus();

    public RenderAllenypterus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAllenypterus entity) {
        return RenderAllenypterus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAllenypterus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}