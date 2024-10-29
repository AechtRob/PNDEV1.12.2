package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraScrebinodus;
import net.lepidodendron.entity.model.entity.ModelScrebinodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderScrebinodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraScrebinodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/screbinodus.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderScrebinodus(RenderManager mgr) {
        super(mgr, new ModelScrebinodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraScrebinodus entity) {
        return RenderScrebinodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraScrebinodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraScrebinodus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0.01F;
    }

}