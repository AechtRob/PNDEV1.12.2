package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDidymograptus;
import net.lepidodendron.entity.model.entity.ModelDidymograptus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDidymograptus extends RenderLiving<EntityPrehistoricFloraDidymograptus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/didymograptus.png");

    public RenderDidymograptus(RenderManager mgr) {
        super(mgr, new ModelDidymograptus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDidymograptus entity) {
        return RenderDidymograptus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDidymograptus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}