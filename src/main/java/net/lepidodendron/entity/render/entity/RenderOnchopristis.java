package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraOnchopristis;
import net.lepidodendron.entity.model.entity.ModelOnchopristis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderOnchopristis extends RenderLivingBaseWithBook<EntityPrehistoricFloraOnchopristis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/onchopristis.png");

    public static float getScaler() {return 1f;}
    public RenderOnchopristis(RenderManager mgr) {
        super(mgr, new ModelOnchopristis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraOnchopristis entity) {
        return RenderOnchopristis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraOnchopristis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraOnchopristis entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}
