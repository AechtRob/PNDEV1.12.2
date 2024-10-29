package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTesnusocaris;
import net.lepidodendron.entity.model.entity.ModelTesnusocaris;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTesnusocaris extends RenderLivingBaseWithBook<EntityPrehistoricFloraTesnusocaris> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tesnusocaris.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderTesnusocaris(RenderManager mgr) {
        super(mgr, new ModelTesnusocaris(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTesnusocaris entity) {
        return RenderTesnusocaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTesnusocaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTesnusocaris entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}