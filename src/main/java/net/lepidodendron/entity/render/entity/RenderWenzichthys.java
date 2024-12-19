package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWenzichthys;
import net.lepidodendron.entity.model.entity.ModelWenzichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWenzichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraWenzichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/wenzichthys.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderWenzichthys(RenderManager mgr) {
        super(mgr, new ModelWenzichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWenzichthys entity) {
        return RenderWenzichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWenzichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraWenzichthys entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}