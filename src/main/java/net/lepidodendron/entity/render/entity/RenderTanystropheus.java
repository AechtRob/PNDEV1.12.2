package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTanystropheus;
import net.lepidodendron.entity.model.entity.ModelTanystropheus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTanystropheus extends RenderLiving<EntityPrehistoricFloraTanystropheus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tanystropheus.png");

    public RenderTanystropheus(RenderManager mgr) {
        super(mgr, new ModelTanystropheus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTanystropheus entity) {
        return RenderTanystropheus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTanystropheus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}

















