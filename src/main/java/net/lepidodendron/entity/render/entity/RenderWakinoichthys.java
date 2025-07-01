package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWakinoichthys;
import net.lepidodendron.entity.model.entity.ModelWakinoichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWakinoichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraWakinoichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/wakinoichthys.png");

    public static float getScaler() {
        return 0.17F;
    }
    public RenderWakinoichthys(RenderManager mgr) {
        super(mgr, new ModelWakinoichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWakinoichthys entity) {
        return RenderWakinoichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWakinoichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraWakinoichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}