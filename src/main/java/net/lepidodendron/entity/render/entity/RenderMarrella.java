package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMarrella;
import net.lepidodendron.entity.model.entity.ModelMarrella;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMarrella extends RenderLiving<EntityPrehistoricFloraMarrella> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/marrella.png");

    public RenderMarrella(RenderManager mgr) {
        super(mgr, new ModelMarrella(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMarrella entity) {
        return RenderMarrella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMarrella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}