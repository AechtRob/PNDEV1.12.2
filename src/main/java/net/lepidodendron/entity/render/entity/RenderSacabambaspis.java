package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSacabambaspis;
import net.lepidodendron.entity.model.entity.ModelSacabambaspis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSacabambaspis extends RenderLiving<EntityPrehistoricFloraSacabambaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sacabambaspis.png");
    public static final ModelBase MODEL_BASE = new ModelSacabambaspis();

    public RenderSacabambaspis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSacabambaspis entity) {
        return RenderSacabambaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSacabambaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}