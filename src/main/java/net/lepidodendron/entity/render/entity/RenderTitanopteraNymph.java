package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTitanopteraNymph;
import net.lepidodendron.entity.model.entity.ModelTitanoptera;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTitanopteraNymph extends RenderLiving<EntityPrehistoricFloraTitanopteraNymph> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_nymph.png");

    public RenderTitanopteraNymph(RenderManager mgr) {
        super(mgr, new ModelTitanoptera(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTitanopteraNymph entity) {
        return RenderTitanopteraNymph.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTitanopteraNymph entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTitanopteraNymph entity, float f) {
        GlStateManager.scale(0.7F, 0.7F, 0.7F);
    }

}