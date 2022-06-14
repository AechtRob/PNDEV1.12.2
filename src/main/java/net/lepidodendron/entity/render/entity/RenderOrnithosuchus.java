package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOrnithosuchus;
import net.lepidodendron.entity.model.entity.ModelOrnithosuchus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOrnithosuchus extends RenderLiving<EntityPrehistoricFloraOrnithosuchus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ornithosuchus.png");

    public RenderOrnithosuchus(RenderManager mgr) {
        super(mgr, new ModelOrnithosuchus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOrnithosuchus entity) {
        return RenderOrnithosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOrnithosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}


































