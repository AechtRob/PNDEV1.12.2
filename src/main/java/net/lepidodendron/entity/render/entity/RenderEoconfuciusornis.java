package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEoconfuciusornis;
import net.lepidodendron.entity.model.entity.ModelEoconfuciusornis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEoconfuciusornis extends RenderLivingBaseWithBook<EntityPrehistoricFloraEoconfuciusornis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eoconfuciusornis_male.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eoconfuciusornis_female.png");

    public static float getScaler() {
        return 0.12f;
    }

    public RenderEoconfuciusornis(RenderManager mgr) {
        super(mgr, new ModelEoconfuciusornis(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEoconfuciusornis entity) {
        if (entity.getPNType() == EntityPrehistoricFloraEoconfuciusornis.Type.FEMALE) {
            return RenderEoconfuciusornis.TEXTURE_F;
        }
        return RenderEoconfuciusornis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEoconfuciusornis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEoconfuciusornis entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        if (entity.getPNType() == EntityPrehistoricFloraEoconfuciusornis.Type.FEMALE) {
            scale = scale * 0.85F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.50F;
    }

}