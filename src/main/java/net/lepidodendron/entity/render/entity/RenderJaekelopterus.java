package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraJaekelopterus;
import net.lepidodendron.entity.model.entity.ModelJaekelopterus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderJaekelopterus extends RenderLivingBaseWithBook<EntityPrehistoricFloraJaekelopterus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jaekelopterus.png");
    private static final ResourceLocation TEXTURE_YOUNG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jaekelopterus_young.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jaekelopterus_baby.png");
    public static float getScaler() {
        return 0.8F;
    }

    public RenderJaekelopterus(RenderManager mgr) {
        super(mgr, new ModelJaekelopterus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraJaekelopterus entity) {
        float scale = entity.getAgeScale();
        //System.err.println("AgeScale: " + scale);
        if (entity.isSmall()) {
            return RenderJaekelopterus.TEXTURE_BABY;
        }
        else if (scale < 0.7F) {
            return RenderJaekelopterus.TEXTURE_YOUNG;
        }
        return RenderJaekelopterus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraJaekelopterus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraJaekelopterus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}