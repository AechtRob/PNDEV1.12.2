package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTemnoxa;
import net.lepidodendron.entity.model.entity.ModelTemnoxa;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTemnoxa extends RenderLivingBaseWithBook<EntityPrehistoricFloraTemnoxa> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/temnoxa.png");
    public static float getScaler() {
        return 0.35F;
    }

    public RenderTemnoxa(RenderManager mgr) {
        super(mgr, new ModelTemnoxa(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTemnoxa entity) {
        return RenderTemnoxa.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTemnoxa entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraTemnoxa entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}