package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMillerosteus;
import net.lepidodendron.entity.model.entity.ModelMillerosteus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMillerosteus extends RenderLivingBaseWithBook<EntityPrehistoricFloraMillerosteus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/millerosteus.png");

    public static float getScaler() {
        return 0.15F;
    }
    public RenderMillerosteus(RenderManager mgr) {
        super(mgr, new ModelMillerosteus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMillerosteus entity) {
        return RenderMillerosteus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMillerosteus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMillerosteus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}