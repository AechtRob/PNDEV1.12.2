package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraThelodus;
import net.lepidodendron.entity.model.entity.ModelThelodus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderThelodus extends RenderLiving<EntityPrehistoricFloraThelodus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/thelodus.png");

    public RenderThelodus(RenderManager mgr) {
        super(mgr, new ModelThelodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraThelodus entity) {
        return RenderThelodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraThelodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}