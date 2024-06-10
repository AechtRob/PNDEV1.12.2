package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMussaurus;
import net.lepidodendron.entity.model.entity.ModelMussaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMussaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMussaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mussaurus.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mussaurus_baby.png");

    public RenderMussaurus(RenderManager mgr) {
        super(mgr, new ModelMussaurus(), 0.5f);
    }

    public static float getScaler() {
        return 0.82f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMussaurus entity) {
        if (entity.getJuvenile()) {
            return RenderMussaurus.TEXTURE_BABY;
        }
        return RenderMussaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMussaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMussaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}