package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTessarolax;
import net.lepidodendron.entity.model.entity.ModelTessarolax;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTessarolax extends RenderLivingBaseWithBook<EntityPrehistoricFloraTessarolax> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tessarolax.png");

    public static float getScaler() {
        return 0.25F;
    }
    public RenderTessarolax(RenderManager mgr) {
        super(mgr, new ModelTessarolax(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTessarolax entity) {
        return RenderTessarolax.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTessarolax entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTessarolax entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}