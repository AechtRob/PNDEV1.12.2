package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraThrinacodus;
import net.lepidodendron.entity.model.entity.ModelThrinacodus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderThrinacodus extends RenderLiving<EntityPrehistoricFloraThrinacodus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/thrinacodus.png");

    public RenderThrinacodus(RenderManager mgr) {
        super(mgr, new ModelThrinacodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraThrinacodus entity) {
        return RenderThrinacodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraThrinacodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}





