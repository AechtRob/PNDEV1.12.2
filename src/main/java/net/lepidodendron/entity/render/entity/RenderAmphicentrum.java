package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAmphicentrum;
import net.lepidodendron.entity.model.entity.ModelAmphicentrum;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAmphicentrum extends RenderLivingBaseWithBook<EntityPrehistoricFloraAmphicentrum> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/amphicentrum.png");

    public static float getScaler() {
        return 0.7F * 0.4F;
    }
    public RenderAmphicentrum(RenderManager mgr) {
        super(mgr, new ModelAmphicentrum(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAmphicentrum entity) {
        return RenderAmphicentrum.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAmphicentrum entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAmphicentrum entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}