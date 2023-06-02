package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTrachymetopon;
import net.lepidodendron.entity.model.entity.ModelTrachymetopon;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTrachymetopon extends RenderLiving<EntityPrehistoricFloraTrachymetopon> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trachymetopon.png");

    public static float getScaler() {
        return 0.9F;
    }
    public RenderTrachymetopon(RenderManager mgr) {
        super(mgr, new ModelTrachymetopon(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTrachymetopon entity) {
        return RenderTrachymetopon.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTrachymetopon entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTrachymetopon entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}