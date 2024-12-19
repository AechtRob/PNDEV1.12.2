package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraKoonwarria;
import net.lepidodendron.entity.model.entity.ModelKoonwarria;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderKoonwarria extends RenderLivingBaseWithBook<EntityPrehistoricFloraKoonwarria> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/koonwarria.png");

    public static float getScaler() {
        return 0.7F * 0.4F;
    }
    public RenderKoonwarria(RenderManager mgr) {
        super(mgr, new ModelKoonwarria(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraKoonwarria entity) {
        return RenderKoonwarria.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraKoonwarria entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraKoonwarria entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}