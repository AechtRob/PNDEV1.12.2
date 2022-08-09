package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLagosuchus;
import net.lepidodendron.entity.model.entity.ModelLagosuchus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLagosuchus extends RenderLiving<EntityPrehistoricFloraLagosuchus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lagosuchus.png");

    public RenderLagosuchus(RenderManager mgr) {
        super(mgr, new ModelLagosuchus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLagosuchus entity) {
        return RenderLagosuchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLagosuchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}
