package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMooreodontus;
import net.lepidodendron.entity.model.entity.ModelMooreodontus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMooreodontus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMooreodontus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mooreodontus.png");
    public static float getScaler() {
        return 0.73f;
    }
    public RenderMooreodontus(RenderManager mgr) {
        super(mgr, new ModelMooreodontus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMooreodontus entity) {
        return RenderMooreodontus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMooreodontus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMooreodontus entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}