package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPanguraptor;
import net.lepidodendron.entity.model.entity.ModelPanguraptor;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class RenderPanguraptor extends RenderLivingBaseWithBook<EntityPrehistoricFloraPanguraptor> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/panguraptor.png");
    public static final ResourceLocation TEXTURE_PINGU = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pinguraptor.png");

    public RenderPanguraptor(RenderManager mgr) {
        super(mgr, new ModelPanguraptor(), 0.5f);
    }

    public static float getScaler() {return 0.495f * 0.7F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPanguraptor entity) {
        String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());
        if (s != null &&
                (("pinguraptor".equalsIgnoreCase(s)) || ("pingu".equalsIgnoreCase(s)))
        ) {
            return RenderPanguraptor.TEXTURE_PINGU;
        }
        return RenderPanguraptor.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPanguraptor entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPanguraptor entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.38F;
    }

}