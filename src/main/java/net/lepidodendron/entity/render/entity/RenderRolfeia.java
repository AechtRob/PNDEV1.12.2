package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRolfeia;
import net.lepidodendron.entity.model.entity.ModelRolfeia;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRolfeia extends RenderLivingBaseWithBook<EntityPrehistoricFloraRolfeia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rolfeia.png");

    public static float getScaler() {
        return 0.7F * 0.3F;
    }
    public RenderRolfeia(RenderManager mgr) {
        super(mgr, new ModelRolfeia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRolfeia entity) {
        return RenderRolfeia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraRolfeia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRolfeia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}