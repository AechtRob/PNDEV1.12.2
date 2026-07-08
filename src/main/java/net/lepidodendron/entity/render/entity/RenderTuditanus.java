package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTuditanus;
import net.lepidodendron.entity.model.entity.ModelTuditanus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTuditanus extends RenderLivingBaseWithBook<EntityPrehistoricFloraTuditanus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tuditanus.png");

    public static float getScaler() {return 0.175F;}

    public RenderTuditanus(RenderManager mgr) {
        super(mgr, new ModelTuditanus(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTuditanus entity) {
        return RenderTuditanus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTuditanus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTuditanus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}