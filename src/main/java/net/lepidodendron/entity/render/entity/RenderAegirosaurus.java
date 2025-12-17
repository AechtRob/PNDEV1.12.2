package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAegirosaurus;
import net.lepidodendron.entity.model.entity.ModelAegirosaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAegirosaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraAegirosaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aegirosaurus.png");

    public static float getScaler() {
        return 0.77F;
    }
    public RenderAegirosaurus(RenderManager mgr) {
        super(mgr, new ModelAegirosaurus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAegirosaurus entity) {
        return RenderAegirosaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAegirosaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAegirosaurus entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}