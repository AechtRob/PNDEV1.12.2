package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAnchura;
import net.lepidodendron.entity.model.entity.ModelAnchura;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAnchura extends RenderLivingBaseWithBook<EntityPrehistoricFloraAnchura> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anchura.png");

    public static float getScaler() {
        return 0.25F;
    }
    public RenderAnchura(RenderManager mgr) {
        super(mgr, new ModelAnchura(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAnchura entity) {
        return RenderAnchura.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAnchura entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAnchura entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}