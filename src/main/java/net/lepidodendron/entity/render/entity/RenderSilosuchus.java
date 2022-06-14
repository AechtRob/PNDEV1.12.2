package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSilosuchus;
import net.lepidodendron.entity.model.entity.ModelSilosuchus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSilosuchus extends RenderLiving<EntityPrehistoricFloraSilosuchus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/silosuchus.png");

    public RenderSilosuchus(RenderManager mgr) {
        super(mgr, new ModelSilosuchus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSilosuchus entity) {
        return RenderSilosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSilosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}























