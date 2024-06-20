package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTuojiangosaurus;
import net.lepidodendron.entity.model.entity.ModelTuojiangosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTuojiangosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTuojiangosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tuojiangosaurus.png");

    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tuojiangosaurus_baby.png");

    public RenderTuojiangosaurus(RenderManager mgr) {
        super(mgr, new ModelTuojiangosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.95F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTuojiangosaurus entity) {
        float scale = entity.getAgeScale();
        if (scale < 0.6F) {
            return RenderTuojiangosaurus.TEXTURE_BABY;
        }
        return RenderTuojiangosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTuojiangosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTuojiangosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}