package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPentameroceras;
import net.lepidodendron.entity.model.entity.ModelPentameroceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPentameroceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraPentameroceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pentameroceras.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderPentameroceras(RenderManager mgr) {
        super(mgr, new ModelPentameroceras(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPentameroceras entity) {
        return RenderPentameroceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPentameroceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPentameroceras entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0.01F;
    }

}