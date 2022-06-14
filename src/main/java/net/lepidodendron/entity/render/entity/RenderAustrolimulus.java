package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAustrolimulus;
import net.lepidodendron.entity.model.entity.ModelAustrolimulus;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAustrolimulus extends RenderLiving<EntityPrehistoricFloraAustrolimulus> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/austrolimulus.png");

    public RenderAustrolimulus(RenderManager mgr) {
        super(mgr, new ModelAustrolimulus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAustrolimulus entity) {
        return RenderAustrolimulus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAustrolimulus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}





















































































