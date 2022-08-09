package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRutiodon;
import net.lepidodendron.entity.model.entity.ModelRutiodon;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRutiodon extends RenderLiving<EntityPrehistoricFloraRutiodon> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rutiodon.png");

    public RenderRutiodon(RenderManager mgr) {
        super(mgr, new ModelRutiodon(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRutiodon entity) {
        return RenderRutiodon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRutiodon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}



