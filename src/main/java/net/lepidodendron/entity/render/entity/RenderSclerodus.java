package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSclerodus;
import net.lepidodendron.entity.model.entity.ModelSclerodus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSclerodus extends RenderLivingBaseWithBook<EntityPrehistoricFloraSclerodus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sclerodus.png");

    public static float getScaler() {
        return 0.6F * 0.295F;
    }
    public RenderSclerodus(RenderManager mgr) {
        super(mgr, new ModelSclerodus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSclerodus entity) {
        return RenderSclerodus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSclerodus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSclerodus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}