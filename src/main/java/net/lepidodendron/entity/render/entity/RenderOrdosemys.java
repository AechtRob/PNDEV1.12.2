package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOrdosemys;
import net.lepidodendron.entity.model.entity.ModelOrdosemys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOrdosemys extends RenderLivingBaseWithBook<EntityPrehistoricFloraOrdosemys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ordosemys.png");

    public RenderOrdosemys(RenderManager mgr) {
        super(mgr, new ModelOrdosemys(), 0.3f);
    }

    public static float getScaler() {
        return 0.23F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOrdosemys entity) {
        return RenderOrdosemys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOrdosemys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOrdosemys entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.80F;
    }

}