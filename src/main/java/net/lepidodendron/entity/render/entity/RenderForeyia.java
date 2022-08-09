package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraForeyia;
import net.lepidodendron.entity.model.entity.ModelForeyia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderForeyia extends RenderLiving<EntityPrehistoricFloraForeyia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/foreyia.png");

    public RenderForeyia(RenderManager mgr) {
        super(mgr, new ModelForeyia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraForeyia entity) {
        return RenderForeyia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraForeyia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}

