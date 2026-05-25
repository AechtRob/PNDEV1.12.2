package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEpipetalichthys;
import net.lepidodendron.entity.model.entity.ModelEpipetalichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEpipetalichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraEpipetalichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/epipetalichthys.png");

    public static float getScaler() {
        return 0.43F;
    }
    public RenderEpipetalichthys(RenderManager mgr) {
        super(mgr, new ModelEpipetalichthys(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEpipetalichthys entity) {
        return RenderEpipetalichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEpipetalichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEpipetalichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3f;
    }

}