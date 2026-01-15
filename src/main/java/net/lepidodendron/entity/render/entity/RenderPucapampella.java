package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPucapampella;
import net.lepidodendron.entity.model.entity.ModelPucapampella;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPucapampella extends RenderLivingBaseWithBook<EntityPrehistoricFloraPucapampella> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pucapampella.png");

    public static float getScaler() {
        return 0.24F;
    }
    public RenderPucapampella(RenderManager mgr) {
        super(mgr, new ModelPucapampella(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPucapampella entity) {
        return RenderPucapampella.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPucapampella entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPucapampella entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}