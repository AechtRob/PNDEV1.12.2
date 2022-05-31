package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraFeroxichthys;
import net.lepidodendron.entity.model.entity.ModelFeroxichthys;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderFeroxichthys extends RenderLiving<EntityPrehistoricFloraFeroxichthys> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/feroxichthys.png");

    public RenderFeroxichthys(RenderManager mgr) {
        super(mgr, new ModelFeroxichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraFeroxichthys entity) {
        return RenderFeroxichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraFeroxichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}