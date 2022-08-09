package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDoswellia;
import net.lepidodendron.entity.model.entity.ModelDoswellia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDoswellia extends RenderLiving<EntityPrehistoricFloraDoswellia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/doswellia.png");

    public RenderDoswellia(RenderManager mgr) {
        super(mgr, new ModelDoswellia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDoswellia entity) {
        return RenderDoswellia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDoswellia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}



