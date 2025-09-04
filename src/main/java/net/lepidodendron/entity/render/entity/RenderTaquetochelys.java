package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTaquetochelys;
import net.lepidodendron.entity.model.entity.ModelTaquetochelys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTaquetochelys extends RenderLivingBaseWithBook<EntityPrehistoricFloraTaquetochelys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/taquetochelys.png");


    public RenderTaquetochelys(RenderManager mgr) {
        super(mgr, new ModelTaquetochelys(), 0.3f);
    }

    public static float getScaler() {
        return 0.24F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTaquetochelys entity) {
        return RenderTaquetochelys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTaquetochelys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTaquetochelys entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.80F;
    }

}