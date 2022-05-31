package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPteraspis;
import net.lepidodendron.entity.model.entity.ModelPteraspis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPteraspis extends RenderLiving<EntityPrehistoricFloraPteraspis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pteraspis.png");

    public RenderPteraspis(RenderManager mgr) {
        super(mgr, new ModelPteraspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPteraspis entity) {
        return RenderPteraspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPteraspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}