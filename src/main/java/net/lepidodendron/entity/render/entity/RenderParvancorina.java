package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraParvancorina;
import net.lepidodendron.entity.model.entity.ModelParvancorina;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderParvancorina extends RenderLiving<EntityPrehistoricFloraParvancorina> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parvancorina.png");
    public static final ModelBase MODEL_BASE = new ModelParvancorina();

    public RenderParvancorina(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraParvancorina entity) {
        return RenderParvancorina.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraParvancorina entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}