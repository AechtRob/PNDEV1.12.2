package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDendrocystites;
import net.lepidodendron.entity.model.entity.ModelDendrocystites;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDendrocystites extends RenderLivingBaseWithBook<EntityPrehistoricFloraDendrocystites> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dendrocystites.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderDendrocystites(RenderManager mgr) {
        super(mgr, new ModelDendrocystites(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDendrocystites entity) {
        return RenderDendrocystites.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDendrocystites entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDendrocystites entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}