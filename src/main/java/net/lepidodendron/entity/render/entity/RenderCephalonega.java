package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCephalonega;
import net.lepidodendron.entity.model.entity.ModelCephalonega;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCephalonega extends RenderLivingBaseWithBook<EntityPrehistoricFloraCephalonega> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/Cephalonega.png");
    public static float getScaler() {
        return 0.25F;
    }

    public RenderCephalonega(RenderManager mgr) {
        super(mgr, new ModelCephalonega(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCephalonega entity) {
        return RenderCephalonega.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCephalonega entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraCephalonega entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}