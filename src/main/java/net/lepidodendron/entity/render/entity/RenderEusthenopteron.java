package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEusthenopteron;
import net.lepidodendron.entity.model.entity.ModelEusthenopteron;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEusthenopteron extends RenderLiving<EntityPrehistoricFloraEusthenopteron> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eusthenopteron.png");

    public RenderEusthenopteron(RenderManager mgr) {
        super(mgr, new ModelEusthenopteron(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEusthenopteron entity) {
        return RenderEusthenopteron.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEusthenopteron entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}