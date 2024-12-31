package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHyphalosaurus;
import net.lepidodendron.entity.model.entity.ModelHyphalosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class RenderHyphalosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraHyphalosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hyphalosaurus.png");
    private static final ResourceLocation TEXTURE_POLY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hyphalosaurus_poly.png");

    public RenderHyphalosaurus(RenderManager mgr) {
        super(mgr, new ModelHyphalosaurus(), 0.5f);
    }
    public static float getScaler() {
        return 0.4F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHyphalosaurus entity) {
        String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());
        if (s != null && ("Polycephaly".equalsIgnoreCase(s)))
        {
            return RenderHyphalosaurus.TEXTURE_POLY;
        }
        return RenderHyphalosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHyphalosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHyphalosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.42F;
    }

}