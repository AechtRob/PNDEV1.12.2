package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDickinsonia;
import net.lepidodendron.entity.model.entity.ModelDickinsonia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class RenderDickinsonia extends RenderLivingBaseWithBook<EntityPrehistoricFloraDickinsonia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dickinsonia.png");
    private static final ResourceLocation TEXTURE_PANCAKE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dickinsonia_pancake.png");
    private static final ResourceLocation TEXTURE_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dickinsonia_egg.png");
    public static float getScaler() {
        return 0.785F;
    }

    public RenderDickinsonia(RenderManager mgr) {
        super(mgr, new ModelDickinsonia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDickinsonia entity) {
        String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());
        if (s != null &&
                ("Pancake".equalsIgnoreCase(s)))
        {
            return RenderDickinsonia.TEXTURE_PANCAKE;
        }
        else if (s != null &&
                ("Egg".equalsIgnoreCase(s)))
        {
            return RenderDickinsonia.TEXTURE_EGG;
        }
        return RenderDickinsonia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDickinsonia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraDickinsonia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}