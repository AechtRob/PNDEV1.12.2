package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPoposaurus;
import net.lepidodendron.entity.model.entity.ModelPoposaurus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;

public class RenderPoposaurus extends RenderLiving<EntityPrehistoricFloraPoposaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/poposaurus.png");
    private static final ResourceLocation TEXTURE_POPO = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/poposaurus_popo.png");
    public static final ModelBase MODEL_BASE = new ModelPoposaurus();

    public RenderPoposaurus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.5f);
    }
    public static float getScaler() {
        return 0.785F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPoposaurus entity) {
        String s = TextFormatting.getTextWithoutFormattingCodes(entity.getName());
        if (s != null && ("Popo".equalsIgnoreCase(s)))
        {
            return RenderPoposaurus.TEXTURE_POPO;
        }
        return RenderPoposaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPoposaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPoposaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.42F;
    }

}