package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBrannerion;
import net.lepidodendron.entity.model.entity.ModelBrannerion;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBrannerion extends RenderLivingBaseWithBook<EntityPrehistoricFloraBrannerion> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/brannerion.png");

    public static float getScaler() {
        return 0.25F;
    }
    public RenderBrannerion(RenderManager mgr) {
        super(mgr, new ModelBrannerion(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBrannerion entity) {
        return RenderBrannerion.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBrannerion entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBrannerion entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}