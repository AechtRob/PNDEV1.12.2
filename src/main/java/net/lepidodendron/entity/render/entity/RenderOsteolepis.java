package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOsteolepis;
import net.lepidodendron.entity.model.entity.ModelOsteolepis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOsteolepis extends RenderLiving<EntityPrehistoricFloraOsteolepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/osteolepis.png");
    public static final ModelBase MODEL_BASE = new ModelOsteolepis();

    public RenderOsteolepis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOsteolepis entity) {
        return RenderOsteolepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOsteolepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}