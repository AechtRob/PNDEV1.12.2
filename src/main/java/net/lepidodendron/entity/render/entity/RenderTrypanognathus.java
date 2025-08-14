package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTrypanognathus;
import net.lepidodendron.entity.model.entity.ModelTrypanognathus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTrypanognathus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTrypanognathus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trypanognathus.png");

    public static float getScaler() {return 0.3F;}

    public RenderTrypanognathus(RenderManager mgr) {
        super(mgr, new ModelTrypanognathus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTrypanognathus entity) {
        return RenderTrypanognathus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTrypanognathus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTrypanognathus entity, float f) {
        float scale = entity.getAgeScale() * 0.3F;
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}