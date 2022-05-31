package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLungmenshanaspis;
import net.lepidodendron.entity.model.entity.ModelLungmenshanaspis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLungmenshanaspis extends RenderLiving<EntityPrehistoricFloraLungmenshanaspis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lungmenshanaspis.png");

    public RenderLungmenshanaspis(RenderManager mgr) {
        super(mgr, new ModelLungmenshanaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLungmenshanaspis entity) {
        return RenderLungmenshanaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLungmenshanaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}