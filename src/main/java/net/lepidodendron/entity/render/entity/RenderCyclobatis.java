package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCyclobatis;
import net.lepidodendron.entity.model.entity.ModelCyclobatis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCyclobatis extends RenderLivingBaseWithBook<EntityPrehistoricFloraCyclobatis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cyclobatis.png");

    public RenderCyclobatis(RenderManager mgr) {
        super(mgr, new ModelCyclobatis(), 0.0f);
    }

    public static float getScaler() {return 0.3F; }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCyclobatis entity) {
        return RenderCyclobatis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCyclobatis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCyclobatis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.0F;
    }

}





