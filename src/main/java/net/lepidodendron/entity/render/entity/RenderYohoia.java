package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYohoia;
import net.lepidodendron.entity.model.entity.ModelYohoia;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderYohoia extends RenderLiving<EntityPrehistoricFloraYohoia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yohoia.png");

    public static float getScaler() {return 0.16F;}

    public RenderYohoia(RenderManager mgr) {
        super(mgr, new ModelYohoia(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYohoia entity) {
        return RenderYohoia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYohoia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraYohoia entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}