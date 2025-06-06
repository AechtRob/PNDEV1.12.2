package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraShirerpeton;
import net.lepidodendron.entity.model.entity.ModelShirerpeton;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderShirerpeton extends RenderLivingBaseWithBook<EntityPrehistoricFloraShirerpeton> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/shirerpeton.png");

    public RenderShirerpeton(RenderManager mgr) {
        super(mgr, new ModelShirerpeton(), 0.3f);
    }

    public static float getScaler() {
        return 0.17f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraShirerpeton entity) {
        return RenderShirerpeton.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraShirerpeton entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraShirerpeton entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}