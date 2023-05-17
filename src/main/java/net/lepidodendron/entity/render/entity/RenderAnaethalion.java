package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAnaethalion;
import net.lepidodendron.entity.model.entity.ModelAnaethalion;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAnaethalion extends RenderLiving<EntityPrehistoricFloraAnaethalion> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anaethalion.png");

    public static float getScaler() {
        return 0.55F * 0.25F;
    }
    public RenderAnaethalion(RenderManager mgr) {
        super(mgr, new ModelAnaethalion(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAnaethalion entity) {
        return RenderAnaethalion.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAnaethalion entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAnaethalion entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}