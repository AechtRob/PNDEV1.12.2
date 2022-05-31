package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMicrodictyon;
import net.lepidodendron.entity.model.entity.ModelMicrodictyon;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMicrodictyon extends RenderLiving<EntityPrehistoricFloraMicrodictyon> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/microdictyon.png");

    public RenderMicrodictyon(RenderManager mgr) {
        super(mgr, new ModelMicrodictyon(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMicrodictyon entity) {
        return RenderMicrodictyon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMicrodictyon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}