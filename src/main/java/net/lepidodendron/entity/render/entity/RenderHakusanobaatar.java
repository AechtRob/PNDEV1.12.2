package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHakusanobaatar;
import net.lepidodendron.entity.model.entity.ModelHakusanobaatar;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHakusanobaatar extends RenderLivingBaseWithBook<EntityPrehistoricFloraHakusanobaatar> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hakusanobaatar.png");

    public RenderHakusanobaatar(RenderManager mgr) {
        super(mgr, new ModelHakusanobaatar(), 0.3f);
    }

    public static float getScaler() {
        return 0.2F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHakusanobaatar entity) {
        return RenderHakusanobaatar.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHakusanobaatar entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHakusanobaatar entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}