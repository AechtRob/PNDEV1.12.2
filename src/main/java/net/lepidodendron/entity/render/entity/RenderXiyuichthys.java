package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraXiyuichthys;
import net.lepidodendron.entity.model.entity.ModelXiyuichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderXiyuichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraXiyuichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/xiyuichthys.png");

    public static float getScaler() {
        return 0.8F * 0.3F;
    }
    public RenderXiyuichthys(RenderManager mgr) {
        super(mgr, new ModelXiyuichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraXiyuichthys entity) {
        return RenderXiyuichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraXiyuichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraXiyuichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}