package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJellyfish_Palaeo3;
import net.lepidodendron.entity.model.entity.ModelPalaeoJelly3;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeojelly3 extends RenderLiving<EntityPrehistoricFloraJellyfish_Palaeo3> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeojelly3.png");

    public RenderPalaeojelly3(RenderManager mgr) {
        super(mgr, new ModelPalaeoJelly3(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJellyfish_Palaeo3 entity) {
        return RenderPalaeojelly3.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJellyfish_Palaeo3 entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}