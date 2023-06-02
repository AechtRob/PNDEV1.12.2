package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraPhytophilaspis;
import net.lepidodendron.entity.model.entity.ModelPhytophilaspis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderPhytophilaspis extends RenderLiving<EntityPrehistoricFloraPhytophilaspis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phytophilaspis.png");

    public static float getScaler() {
        return 0.7F * 0.395F;
    }
    public RenderPhytophilaspis(RenderManager mgr) {
        super(mgr, new ModelPhytophilaspis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPhytophilaspis entity) {
        return RenderPhytophilaspis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPhytophilaspis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPhytophilaspis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0.01F;
    }

}