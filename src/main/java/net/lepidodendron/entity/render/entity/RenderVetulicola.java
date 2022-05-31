package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraVetulicola;
import net.lepidodendron.entity.model.entity.ModelVetulicola;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderVetulicola extends RenderLiving<EntityPrehistoricFloraVetulicola> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vetulicola.png");

    public RenderVetulicola(RenderManager mgr) {
        super(mgr, new ModelVetulicola(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraVetulicola entity) {
        return RenderVetulicola.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraVetulicola entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}