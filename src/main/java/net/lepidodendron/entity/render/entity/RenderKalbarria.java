package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKalbarria;
import net.lepidodendron.entity.model.entity.ModelKalbarria;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKalbarria extends RenderLiving<EntityPrehistoricFloraKalbarria> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kalbarria.png");

    public RenderKalbarria(RenderManager mgr) {
        super(mgr, new ModelKalbarria(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKalbarria entity) {
        return RenderKalbarria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKalbarria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}