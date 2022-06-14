package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPlacodus;
import net.lepidodendron.entity.model.entity.ModelPlacodus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPlacodus extends RenderLiving<EntityPrehistoricFloraPlacodus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/placodus.png");

    public RenderPlacodus(RenderManager mgr) {
        super(mgr, new ModelPlacodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPlacodus entity) {
        return RenderPlacodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPlacodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}




























































