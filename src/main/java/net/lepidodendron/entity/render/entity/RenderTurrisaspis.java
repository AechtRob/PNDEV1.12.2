package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTurrisaspis;
import net.lepidodendron.entity.model.entity.ModelTurrisaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTurrisaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraTurrisaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/turrisaspis.png");
    public static float getScaler() {
        return 0.5F * 0.275F;
    }
    public RenderTurrisaspis(RenderManager mgr) {
        super(mgr, new ModelTurrisaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTurrisaspis entity) {
        return RenderTurrisaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTurrisaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTurrisaspis entity, float f) {
        float scale = entity.getAgeScale();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.3f;
    }

}