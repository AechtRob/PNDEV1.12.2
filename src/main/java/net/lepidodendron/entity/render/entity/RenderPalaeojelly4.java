package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJellyfish_Palaeo4;
import net.lepidodendron.entity.model.entity.ModelPalaeoJelly4;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPalaeojelly4 extends RenderLiving<EntityPrehistoricFloraJellyfish_Palaeo4> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeojelly4.png");

    public RenderPalaeojelly4(RenderManager mgr) {
        super(mgr, new ModelPalaeoJelly4(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJellyfish_Palaeo4 entity) {
        return RenderPalaeojelly4.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJellyfish_Palaeo4 entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}