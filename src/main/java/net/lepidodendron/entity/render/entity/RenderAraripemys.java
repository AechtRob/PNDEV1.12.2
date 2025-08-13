package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAraripemys;
import net.lepidodendron.entity.model.entity.ModelAraripemys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class RenderAraripemys extends RenderLivingBaseWithBook<EntityPrehistoricFloraAraripemys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/araripemys.png");
    public static final ResourceLocation TEXTURE_SLINKY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/araripemys_slinky.png");

    public RenderAraripemys(RenderManager mgr) {
        super(mgr, new ModelAraripemys(), 0.3f);
    }

    public static float getScaler() {
        return 0.24F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAraripemys entity) {
        String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());
        if (s != null &&
                (("slinky".equalsIgnoreCase(s)))
        ) {
            return RenderAraripemys.TEXTURE_SLINKY;
        }
        return RenderAraripemys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAraripemys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAraripemys entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.80F;
    }

}