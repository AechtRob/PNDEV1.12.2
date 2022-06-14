package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVancleava;
import net.lepidodendron.entity.model.entity.ModelVancleava;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVancleava extends RenderLiving<EntityPrehistoricFloraVancleava> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vancleava.png");

    public RenderVancleava(RenderManager mgr) {
        super(mgr, new ModelVancleava(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVancleava entity) {
        return RenderVancleava.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVancleava entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}













