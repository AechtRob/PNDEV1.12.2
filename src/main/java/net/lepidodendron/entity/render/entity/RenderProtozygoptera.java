package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraProtozygoptera;
import net.lepidodendron.entity.model.entity.ModelProtozygoptera;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderProtozygoptera extends RenderLiving<EntityPrehistoricFloraProtozygoptera> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/protozygoptera.png");

    public RenderProtozygoptera(RenderManager mgr) {
        super(mgr, new ModelProtozygoptera(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraProtozygoptera entity) {
        return RenderProtozygoptera.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraProtozygoptera entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}