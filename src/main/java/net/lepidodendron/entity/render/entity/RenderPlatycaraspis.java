package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPlatycaraspis;
import net.lepidodendron.entity.model.entity.ModelPlatycaraspis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPlatycaraspis extends RenderLiving<EntityPrehistoricFloraPlatycaraspis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/platycaraspis.png");

    public RenderPlatycaraspis(RenderManager mgr) {
        super(mgr, new ModelPlatycaraspis(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPlatycaraspis entity) {
        return RenderPlatycaraspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPlatycaraspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}