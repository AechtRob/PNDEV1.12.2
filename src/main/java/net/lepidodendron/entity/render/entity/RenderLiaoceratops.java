package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLiaoceratops;
import net.lepidodendron.entity.model.entity.ModelLiaoceratops;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLiaoceratops extends RenderLivingBaseWithBook<EntityPrehistoricFloraLiaoceratops> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/liaoceratops.png");

    public RenderLiaoceratops(RenderManager mgr) {
        super(mgr, new ModelLiaoceratops(), 0.3f);
    }

    public static float getScaler() {
        return 0.35F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLiaoceratops entity) {
        return RenderLiaoceratops.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLiaoceratops entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLiaoceratops entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}