package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAetheolepis;
import net.lepidodendron.entity.model.entity.ModelAetheolepis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAetheolepis extends RenderLivingBaseWithBook<EntityPrehistoricFloraAetheolepis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aetheolepis.png");

    public static float getScaler() {
        return 0.35F;
    }
    public RenderAetheolepis(RenderManager mgr) {
        super(mgr, new ModelAetheolepis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAetheolepis entity) {
        return RenderAetheolepis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAetheolepis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAetheolepis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}