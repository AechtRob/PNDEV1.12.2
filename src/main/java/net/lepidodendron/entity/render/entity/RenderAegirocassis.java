package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAegirocassis;
import net.lepidodendron.entity.model.entity.ModelAegirocassis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAegirocassis extends RenderLivingBaseWithBook<EntityPrehistoricFloraAegirocassis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aegirocassis.png");
    private static final ResourceLocation TEXTURE_YOUNG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aegirocassis_young.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aegirocassis_baby.png");

    public RenderAegirocassis(RenderManager mgr) {
        super(mgr, new ModelAegirocassis(), 0.5f);
    }
    public static float getScaler() {return 0.55F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAegirocassis entity) {
        float scale = entity.getAgeScale();
        //System.err.println("AgeScale: " + scale);
        if (entity.isSmall()) {
            return RenderAegirocassis.TEXTURE_BABY;
        }
        else if (scale < 0.7F) {
            return RenderAegirocassis.TEXTURE_YOUNG;
        }
        return RenderAegirocassis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAegirocassis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAegirocassis entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}