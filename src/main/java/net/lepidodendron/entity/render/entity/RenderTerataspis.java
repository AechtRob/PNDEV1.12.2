package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTerataspis;
import net.lepidodendron.entity.model.entity.ModelTerataspis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTerataspis extends RenderLiving<EntityPrehistoricFloraTerataspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/terataspis.png");
    public static final ModelBase MODEL_BASE = new ModelTerataspis();

    public RenderTerataspis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTerataspis entity) {
        return RenderTerataspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTerataspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}