package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBrachiosaurus;
import net.lepidodendron.entity.model.entity.ModelBrachiosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBrachiosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraBrachiosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/brachiosaurus.png");

    public RenderBrachiosaurus(RenderManager mgr) {
        super(mgr, new ModelBrachiosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.8F;
    }
    
    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBrachiosaurus entity) {
        return RenderBrachiosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBrachiosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBrachiosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.80F;
    }

}