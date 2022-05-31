package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBelantsea;
import net.lepidodendron.entity.model.entity.ModelBelantsea;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBelantsea extends RenderLiving<EntityPrehistoricFloraBelantsea> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/belantsea.png");

    public RenderBelantsea(RenderManager mgr) {
        super(mgr, new ModelBelantsea(), 0.05f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBelantsea entity) {
        return RenderBelantsea.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBelantsea entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}