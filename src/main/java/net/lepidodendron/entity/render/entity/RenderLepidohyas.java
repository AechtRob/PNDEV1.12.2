package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLepidohyas;
import net.lepidodendron.entity.model.entity.ModelLepidohyas;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLepidohyas extends RenderLivingBaseWithBook<EntityPrehistoricFloraLepidohyas> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lepidohyas.png");

    public static float getScaler() {
        return 0.2F;
    }
    public RenderLepidohyas(RenderManager mgr) {
        super(mgr, new ModelLepidohyas(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLepidohyas entity) {
        return RenderLepidohyas.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLepidohyas entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLepidohyas entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}