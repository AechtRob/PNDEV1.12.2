package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBertratis;
import net.lepidodendron.entity.model.entity.ModelBertratis;
import net.lepidodendron.entity.model.entity.ModelCambrianJelly;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBertratis extends RenderLiving<EntityPrehistoricFloraBertratis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bertratis.png");

    public RenderBertratis(RenderManager mgr) {
        super(mgr, new ModelBertratis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBertratis entity) {
        return RenderBertratis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBertratis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBertratis entity, float f) {
        float scale = 0.2F;
        GlStateManager.scale(scale, scale, scale);
    }

}