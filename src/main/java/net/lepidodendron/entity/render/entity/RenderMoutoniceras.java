package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMoutoniceras;
import net.lepidodendron.entity.model.entity.ModelMoutoniceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class RenderMoutoniceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraMoutoniceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/moutoniceras.png");
    private static final ResourceLocation TEXTURE_2 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/moutoniceras_poly.png");

    public static float getScaler() {
        return 0.6F;
    }
    public RenderMoutoniceras(RenderManager mgr) {
        super(mgr, new ModelMoutoniceras(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMoutoniceras entity) {
        String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());
        if (s != null && ("Saxophone".equalsIgnoreCase(s)))
        {
            return RenderMoutoniceras.TEXTURE_2;
        }
        return RenderMoutoniceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMoutoniceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMoutoniceras entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}