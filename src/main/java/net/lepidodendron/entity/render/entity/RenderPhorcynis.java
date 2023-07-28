package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPhorcynis;
import net.lepidodendron.entity.model.entity.ModelPhorcynis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPhorcynis extends RenderLiving<EntityPrehistoricFloraPhorcynis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phorcynis.png");

    public static float getScaler() {
        return 0.7F * 0.43F;
    }
    public RenderPhorcynis(RenderManager mgr) {
        super(mgr, new ModelPhorcynis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPhorcynis entity) {
        return RenderPhorcynis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPhorcynis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPhorcynis entity, float f) {
        float scale = this.getScaler() * entity.getAgeScale();
        if (entity.getPNType() == EntityPrehistoricFloraPhorcynis.Type.FEMALE) {
            scale = this.getScaler() * 0.85F;
        }
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}