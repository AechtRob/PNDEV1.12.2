package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPanderodus;
import net.lepidodendron.entity.model.entity.ModelPanderodus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPanderodus extends RenderLiving<EntityPrehistoricFloraPanderodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/panderodus.png");
    public static final ModelBase MODEL_BASE = new ModelPanderodus();

    public RenderPanderodus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPanderodus entity) {
        return RenderPanderodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPanderodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}
