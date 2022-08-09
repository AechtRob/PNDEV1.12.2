package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFadeniaCarboniferous;
import net.lepidodendron.entity.model.entity.ModelFadenia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFadeniaCarboniferous extends RenderLiving<EntityPrehistoricFloraFadeniaCarboniferous> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/fadenia_carboniferous.png");

    public RenderFadeniaCarboniferous(RenderManager mgr) {
        super(mgr, new ModelFadenia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFadeniaCarboniferous entity) {
        return RenderFadeniaCarboniferous.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFadeniaCarboniferous entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}



