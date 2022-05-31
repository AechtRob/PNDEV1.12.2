package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFurcaster;
import net.lepidodendron.entity.model.entity.ModelFurcaster;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFurcaster extends RenderLiving<EntityPrehistoricFloraFurcaster> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/furcaster.png");

    public RenderFurcaster(RenderManager mgr) {
        super(mgr, new ModelFurcaster(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFurcaster entity) {
        return RenderFurcaster.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFurcaster entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}