package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEgertonodus;
import net.lepidodendron.entity.model.entity.ModelParhybodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEgertonodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraEgertonodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/egertonodus.png");

    public static float getScaler() {
        return 0.58F;
    }
    public RenderEgertonodus(RenderManager mgr) {
        super(mgr, new ModelParhybodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEgertonodus entity) {
        return RenderEgertonodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEgertonodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEgertonodus entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}