package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYawunik;
import net.lepidodendron.entity.model.entity.ModelYawunik;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderYawunik extends RenderLiving<EntityPrehistoricFloraYawunik> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yawunik.png");

    public RenderYawunik(RenderManager mgr) {
        super(mgr, new ModelYawunik(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYawunik entity) {
        return RenderYawunik.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYawunik entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}