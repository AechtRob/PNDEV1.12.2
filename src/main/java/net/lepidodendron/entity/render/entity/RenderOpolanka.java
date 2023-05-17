package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOpolanka;
import net.lepidodendron.entity.model.entity.ModelOpolanka;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOpolanka extends RenderLiving<EntityPrehistoricFloraOpolanka> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/opolanka.png");

    public RenderOpolanka(RenderManager mgr) {
        super(mgr, new ModelOpolanka(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOpolanka entity) {
        return RenderOpolanka.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOpolanka entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}


