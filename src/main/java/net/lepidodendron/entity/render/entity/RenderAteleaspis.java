package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAteleaspis;
import net.lepidodendron.entity.model.entity.ModelAteleaspis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAteleaspis extends RenderLiving<EntityPrehistoricFloraAteleaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ateleaspis.png");
    public static final ModelBase MODEL_BASE = new ModelAteleaspis();

    public RenderAteleaspis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAteleaspis entity) {
        return RenderAteleaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAteleaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}