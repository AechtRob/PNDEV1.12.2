package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJellyfish5;
import net.lepidodendron.entity.model.entity.ModelJellyfish;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJellyfish5 extends RenderLiving<EntityPrehistoricFloraJellyfish5> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jellyfish_5.png");
    public static final ModelBase MODEL_BASE = new ModelJellyfish();

    public RenderJellyfish5(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJellyfish5 entity) {
        return RenderJellyfish5.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJellyfish5 entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}