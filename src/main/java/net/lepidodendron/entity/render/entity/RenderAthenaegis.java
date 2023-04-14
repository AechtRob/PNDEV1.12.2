package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAthenaegis;
import net.lepidodendron.entity.model.entity.ModelAthenaegis;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAthenaegis extends RenderLiving<EntityPrehistoricFloraAthenaegis> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/athenaegis.png");
    public static float getScaler() {
        return 0.7F * 0.2F;
    }
    public RenderAthenaegis(RenderManager mgr) {
        super(mgr, new ModelAthenaegis(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAthenaegis entity) {
        return RenderAthenaegis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAthenaegis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAthenaegis entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}