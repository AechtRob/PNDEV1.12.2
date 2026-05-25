package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAntarctaspis;
import net.lepidodendron.entity.model.entity.ModelAntarctaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAntarctaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraAntarctaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/antarctaspis.png");

    public static float getScaler() {
        return 0.28F;
    }
    public RenderAntarctaspis(RenderManager mgr) {
        super(mgr, new ModelAntarctaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAntarctaspis entity) {
        return RenderAntarctaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAntarctaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAntarctaspis entity, float f) {
        float scale = this.getScaler()*entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}