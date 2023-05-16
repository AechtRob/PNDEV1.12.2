package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSpinoaequalis;
import net.lepidodendron.entity.model.entity.ModelSpinoaequalis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSpinoaequalis extends RenderLiving<EntityPrehistoricFloraSpinoaequalis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/spinoaequalis.png");
    public static final ModelBase MODEL_BASE = new ModelSpinoaequalis();

    public RenderSpinoaequalis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSpinoaequalis entity) {
        return RenderSpinoaequalis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSpinoaequalis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}