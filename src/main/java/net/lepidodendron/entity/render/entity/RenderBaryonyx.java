package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBaryonyx;
import net.lepidodendron.entity.model.entity.ModelBaryonyx;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBaryonyx extends RenderLivingBaseWithBook<EntityPrehistoricFloraBaryonyx> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/baryonyx.png");

    public static float getScaler() {return 1F;}

    public RenderBaryonyx(RenderManager mgr) {
        super(mgr, new ModelBaryonyx(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBaryonyx entity) {
        return RenderBaryonyx.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBaryonyx entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBaryonyx entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}