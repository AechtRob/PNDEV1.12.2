package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFalcatus;
import net.lepidodendron.entity.model.entity.ModelFalcatus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFalcatus extends RenderLiving<EntityPrehistoricFloraFalcatus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/falcatus.png");

    public RenderFalcatus(RenderManager mgr) {
        super(mgr, new ModelFalcatus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFalcatus entity) {
        return RenderFalcatus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFalcatus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}


































































































