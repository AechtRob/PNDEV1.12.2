package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMicrobrachis;
import net.lepidodendron.entity.model.entity.ModelMicrobrachis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMicrobrachis extends RenderLivingBaseWithBook<EntityPrehistoricFloraMicrobrachis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/microbrachis.png");

    public static float getScaler() {return 0.18f;}

    public RenderMicrobrachis(RenderManager mgr) {
        super(mgr, new ModelMicrobrachis(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMicrobrachis entity) {
        return RenderMicrobrachis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMicrobrachis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMicrobrachis entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.4F;
    }

}