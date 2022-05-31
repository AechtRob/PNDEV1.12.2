package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBothriolepis;
import net.lepidodendron.entity.model.entity.ModelBothriolepis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBothriolepis extends RenderLiving<EntityPrehistoricFloraBothriolepis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bothriolepis.png");

    public RenderBothriolepis(RenderManager mgr) {
        super(mgr, new ModelBothriolepis(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBothriolepis entity) {
        return RenderBothriolepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBothriolepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}