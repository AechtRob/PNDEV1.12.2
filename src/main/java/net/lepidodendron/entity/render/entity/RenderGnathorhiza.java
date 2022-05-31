package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGnathorhiza;
import net.lepidodendron.entity.model.entity.ModelGnathorhiza;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGnathorhiza extends RenderLiving<EntityPrehistoricFloraGnathorhiza> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gnathorhiza.png");

    public RenderGnathorhiza(RenderManager mgr) {
        super(mgr, new ModelGnathorhiza(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGnathorhiza entity) {
        return RenderGnathorhiza.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGnathorhiza entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}