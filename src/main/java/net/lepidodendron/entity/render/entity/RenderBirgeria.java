package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBirgeria;
import net.lepidodendron.entity.model.entity.ModelBirgeria;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBirgeria extends RenderLiving<EntityPrehistoricFloraBirgeria> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/birgeria.png");

    public RenderBirgeria(RenderManager mgr) {
        super(mgr, new ModelBirgeria(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBirgeria entity) {
        return RenderBirgeria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBirgeria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}