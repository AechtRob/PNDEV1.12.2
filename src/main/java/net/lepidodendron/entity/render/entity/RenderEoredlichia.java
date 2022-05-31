package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEoredlichia;
import net.lepidodendron.entity.model.entity.ModelEoredlichia;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEoredlichia extends RenderLiving<EntityPrehistoricFloraEoredlichia> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eoredlichia.png");

    public RenderEoredlichia(RenderManager mgr) {
        super(mgr, new ModelEoredlichia(), 0.00f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEoredlichia entity) {
        return RenderEoredlichia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEoredlichia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}