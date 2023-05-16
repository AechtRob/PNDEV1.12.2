package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWalliserops;
import net.lepidodendron.entity.model.entity.ModelWalliserops;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWalliserops extends RenderLiving<EntityPrehistoricFloraWalliserops> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/walliserops.png");
    public static final ModelBase MODEL_BASE = new ModelWalliserops();

    public static float getScaler() {
        return  0.38F;
    }

    public RenderWalliserops(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWalliserops entity) {
        return RenderWalliserops.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWalliserops entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraWalliserops entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }

}