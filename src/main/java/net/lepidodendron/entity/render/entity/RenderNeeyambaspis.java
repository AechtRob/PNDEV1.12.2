package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraNeeyambaspis;
import net.lepidodendron.entity.model.entity.ModelNeeyambaspis;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderNeeyambaspis extends RenderLivingBaseWithBook<EntityPrehistoricFloraNeeyambaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/neeyambaspis.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderNeeyambaspis(RenderManager mgr) {
        super(mgr, new ModelNeeyambaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraNeeyambaspis entity) {
        return RenderNeeyambaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraNeeyambaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraNeeyambaspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}