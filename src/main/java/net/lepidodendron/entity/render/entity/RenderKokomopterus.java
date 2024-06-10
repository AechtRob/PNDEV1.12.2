package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKokomopterus;
import net.lepidodendron.entity.model.entity.ModelKokomopterus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKokomopterus extends RenderLivingBaseWithBook<EntityPrehistoricFloraKokomopterus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kokomopterus.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kokomopterus_baby.png");

    public RenderKokomopterus(RenderManager mgr) {
        super(mgr, new ModelKokomopterus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKokomopterus entity) {
        float scale = entity.getAgeScale();
        if (entity.isSmall()) {
            return RenderKokomopterus.TEXTURE_BABY;
        }
        return RenderKokomopterus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKokomopterus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKokomopterus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}