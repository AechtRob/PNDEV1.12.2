package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJellyfish6;
import net.lepidodendron.entity.model.entity.ModelJellyfish;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJellyfish6 extends RenderLiving<EntityPrehistoricFloraJellyfish6> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jellyfish_6.png");
    public static final ModelBase MODEL_BASE = new ModelJellyfish();

    public RenderJellyfish6(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJellyfish6 entity) {
        return RenderJellyfish6.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJellyfish6 entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}