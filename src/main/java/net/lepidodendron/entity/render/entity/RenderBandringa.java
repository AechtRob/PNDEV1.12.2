package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBandringa;
import net.lepidodendron.entity.model.entity.ModelBandringa;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBandringa extends RenderLiving<EntityPrehistoricFloraBandringa> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bandringa.png");

    public RenderBandringa(RenderManager mgr) {
        super(mgr, new ModelBandringa(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBandringa entity) {
        return RenderBandringa.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBandringa entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}