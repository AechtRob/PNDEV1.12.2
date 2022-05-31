package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJellyfish_Palaeo1;
import net.lepidodendron.entity.model.entity.ModelPalaeoJelly1;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeojelly1 extends RenderLiving<EntityPrehistoricFloraJellyfish_Palaeo1> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeojelly1.png");

    public RenderPalaeojelly1(RenderManager mgr) {
        super(mgr, new ModelPalaeoJelly1(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJellyfish_Palaeo1 entity) {
        return RenderPalaeojelly1.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJellyfish_Palaeo1 entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}