package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAquilops;
import net.lepidodendron.entity.model.entity.ModelAquilops;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAquilops extends RenderLivingBaseWithBook<EntityPrehistoricFloraAquilops> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aquilops.png");

    public RenderAquilops(RenderManager mgr) {
        super(mgr, new ModelAquilops(), 0.3f);
    }

    public static float getScaler() {
        return 0.35F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAquilops entity) {
        return RenderAquilops.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAquilops entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAquilops entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}