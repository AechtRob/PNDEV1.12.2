package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPseudodiscophyllum;
import net.lepidodendron.entity.model.entity.ModelCambrianJelly;
import net.lepidodendron.entity.model.entity.ModelPseudodiscophyllum;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPseudodiscophyllum extends RenderLiving<EntityPrehistoricFloraPseudodiscophyllum> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pseudodiscophyllum.png");

    public RenderPseudodiscophyllum(RenderManager mgr) {
        super(mgr, new ModelPseudodiscophyllum(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPseudodiscophyllum entity) {
        return RenderPseudodiscophyllum.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPseudodiscophyllum entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPseudodiscophyllum entity, float f) {
        float scale = 0.2F;
        GlStateManager.scale(scale, scale, scale);
    }

}