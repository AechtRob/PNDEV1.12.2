package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAnoualerpeton;
import net.lepidodendron.entity.model.entity.ModelAnoualerpeton;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAnoualerpeton extends RenderLivingBaseWithBook<EntityPrehistoricFloraAnoualerpeton> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anoualerpeton.png");

    public static float getScaler() {return 0.16f;}
    public RenderAnoualerpeton(RenderManager mgr) {
        super(mgr, new ModelAnoualerpeton(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAnoualerpeton entity) {
        return RenderAnoualerpeton.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAnoualerpeton entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAnoualerpeton entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}