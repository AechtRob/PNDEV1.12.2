package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEosinopteryx;
import net.lepidodendron.entity.model.entity.ModelEosinopteryx;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEosinopteryx extends RenderLivingBaseWithBook<EntityPrehistoricFloraEosinopteryx> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eosinopteryx.png");

    public RenderEosinopteryx(RenderManager mgr) {
        super(mgr, new ModelEosinopteryx(), 0.3f);
    }

    public static float getScaler() {
        return 0.25F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEosinopteryx entity) {
        return RenderEosinopteryx.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEosinopteryx entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEosinopteryx entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}