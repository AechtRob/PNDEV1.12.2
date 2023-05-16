package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJellyfish_Palaeo2;
import net.lepidodendron.entity.model.entity.ModelPalaeoJelly2;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeojelly2 extends RenderLiving<EntityPrehistoricFloraJellyfish_Palaeo2> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeojelly2.png");
    public static final ModelBase MODEL_BASE = new ModelPalaeoJelly2();

    public RenderPalaeojelly2(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJellyfish_Palaeo2 entity) {
        return RenderPalaeojelly2.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJellyfish_Palaeo2 entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}