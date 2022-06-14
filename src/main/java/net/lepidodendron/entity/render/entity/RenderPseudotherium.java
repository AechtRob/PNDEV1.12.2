package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPseudotherium;
import net.lepidodendron.entity.model.entity.ModelPseudotherium;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPseudotherium extends RenderLiving<EntityPrehistoricFloraPseudotherium> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pseudotherium.png");

    public RenderPseudotherium(RenderManager mgr) {
        super(mgr, new ModelPseudotherium(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPseudotherium entity) {
        return RenderPseudotherium.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPseudotherium entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

}





























