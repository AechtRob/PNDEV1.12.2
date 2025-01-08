package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEzkutuberezi;
import net.lepidodendron.entity.model.entity.ModelEzkutuberezi;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEzkutuberezi extends RenderLivingBaseWithBook<EntityPrehistoricFloraEzkutuberezi> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ezkutuberezi.png");

    public static float getScaler() {
        return 0.2F;
    }
    public RenderEzkutuberezi(RenderManager mgr) {
        super(mgr, new ModelEzkutuberezi(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEzkutuberezi entity) {
        return RenderEzkutuberezi.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEzkutuberezi entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEzkutuberezi entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}