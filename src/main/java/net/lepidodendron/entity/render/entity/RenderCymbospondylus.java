package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCymbospondylus;
import net.lepidodendron.entity.model.entity.ModelCymbospondylus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCymbospondylus extends RenderLiving<EntityPrehistoricFloraCymbospondylus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cymbospondylus.png");

    public RenderCymbospondylus(RenderManager mgr) {
        super(mgr, new ModelCymbospondylus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCymbospondylus entity) {
        return RenderCymbospondylus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCymbospondylus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}





































































