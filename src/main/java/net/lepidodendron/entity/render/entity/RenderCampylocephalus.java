package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCampylocephalus;
import net.lepidodendron.entity.EntityPrehistoricFloraHibbertopterus;
import net.lepidodendron.entity.model.entity.ModelCampylocephalus;
import net.lepidodendron.entity.model.entity.ModelHibbertopterus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCampylocephalus extends RenderLivingBaseWithBook<EntityPrehistoricFloraCampylocephalus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/campylocephalus.png");
    public static float getScaler() {
        return 0.5F;
    }

    public RenderCampylocephalus(RenderManager mgr) {
        super(mgr, new ModelCampylocephalus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCampylocephalus entity) {
        return RenderCampylocephalus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCampylocephalus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCampylocephalus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}