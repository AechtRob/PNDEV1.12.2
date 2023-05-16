package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRebellatrix;
import net.lepidodendron.entity.model.entity.ModelRebellatrix;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRebellatrix extends RenderLiving<EntityPrehistoricFloraRebellatrix> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rebellatrix.png");
    public static final ModelBase MODEL_BASE = new ModelRebellatrix();

    public RenderRebellatrix(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRebellatrix entity) {
        return RenderRebellatrix.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRebellatrix entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}