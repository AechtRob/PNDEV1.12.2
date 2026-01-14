package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMotlayoichthys;
import net.lepidodendron.entity.model.entity.ModelMotlayoichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMotlayoichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraMotlayoichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/motlayoichthys.png");

    public static float getScaler() {
        return 0.36F;
    }
    public RenderMotlayoichthys(RenderManager mgr) {
        super(mgr, new ModelMotlayoichthys(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMotlayoichthys entity) {
        return RenderMotlayoichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraMotlayoichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMotlayoichthys entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}