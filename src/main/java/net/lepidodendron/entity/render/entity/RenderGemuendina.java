package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGemuendina;
import net.lepidodendron.entity.model.entity.ModelGemuendina;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGemuendina extends RenderLiving<EntityPrehistoricFloraGemuendina> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gemuendina.png");

    public RenderGemuendina(RenderManager mgr) {
        super(mgr, new ModelGemuendina(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGemuendina entity) {
        return RenderGemuendina.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGemuendina entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}