package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHypophylloceras;
import net.lepidodendron.entity.model.entity.ModelHypophylloceras;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderHypophylloceras extends RenderLivingBaseWithBook<EntityPrehistoricFloraHypophylloceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hypophylloceras.png");

    public static float getScaler() {
        return 0.295F;
    }

    public RenderHypophylloceras(RenderManager mgr) {
        super(mgr, new ModelHypophylloceras(), 0.0f);
        this.addLayer(new LayerHypophyllocerasEmissive(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHypophylloceras entity) {
        return RenderHypophylloceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHypophylloceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraHypophylloceras entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}