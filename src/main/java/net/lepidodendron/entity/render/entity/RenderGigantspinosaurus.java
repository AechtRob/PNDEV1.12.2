package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGigantspinosaurus;
import net.lepidodendron.entity.model.entity.ModelGigantspinosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGigantspinosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraGigantspinosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gigantspinosaurus.png");

    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gigantspinosaurus_baby.png");

    public RenderGigantspinosaurus(RenderManager mgr) {
        super(mgr, new ModelGigantspinosaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.95F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGigantspinosaurus entity) {
        float scale = entity.getAgeScale();
        if (scale < 0.6F) {
            return RenderGigantspinosaurus.TEXTURE_BABY;
        }
        return RenderGigantspinosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGigantspinosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGigantspinosaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.6F;
    }

}