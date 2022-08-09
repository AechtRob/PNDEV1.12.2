package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEretmorhipis;
import net.lepidodendron.entity.model.entity.ModelEretmorhipis;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEretmorhipis extends RenderLiving<EntityPrehistoricFloraEretmorhipis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eretmorhipis.png");

    public RenderEretmorhipis(RenderManager mgr) {
        super(mgr, new ModelEretmorhipis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEretmorhipis entity) {
        return RenderEretmorhipis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEretmorhipis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}


