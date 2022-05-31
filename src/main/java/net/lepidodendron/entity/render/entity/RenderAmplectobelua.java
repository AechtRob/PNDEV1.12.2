package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAmplectobelua;
import net.lepidodendron.entity.model.entity.ModelAmplectobelua;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAmplectobelua extends RenderLiving<EntityPrehistoricFloraAmplectobelua> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/amplectobelua.png");

    public RenderAmplectobelua(RenderManager mgr) {
        super(mgr, new ModelAmplectobelua(), 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAmplectobelua entity) {
        return RenderAmplectobelua.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAmplectobelua entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}