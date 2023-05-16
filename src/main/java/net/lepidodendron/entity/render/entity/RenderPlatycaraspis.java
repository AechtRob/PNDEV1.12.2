package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPlatycaraspis;
import net.lepidodendron.entity.model.entity.ModelPlatycaraspis;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPlatycaraspis extends RenderLiving<EntityPrehistoricFloraPlatycaraspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/platycaraspis.png");
    public static final ModelBase MODEL_BASE = new ModelPlatycaraspis();

    public RenderPlatycaraspis(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.3f);
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