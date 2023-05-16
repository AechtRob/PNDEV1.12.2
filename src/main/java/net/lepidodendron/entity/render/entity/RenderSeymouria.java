package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSeymouria;
import net.lepidodendron.entity.model.entity.ModelSeymouria;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSeymouria extends RenderLiving<EntityPrehistoricFloraSeymouria> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/seymouria.png");
    public static final ModelBase MODEL_BASE = new ModelSeymouria();

    public RenderSeymouria(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSeymouria entity) {
        return RenderSeymouria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSeymouria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}