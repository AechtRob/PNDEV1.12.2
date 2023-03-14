package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLimulid;
import net.lepidodendron.entity.EntityPrehistoricFloraMegalosaurus;
import net.lepidodendron.entity.model.entity.ModelLimulid;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLimulid extends RenderLiving<EntityPrehistoricFloraLimulid> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/limulid.png");
    public static float getScaler() {
        return 0.775F;
    }

    public RenderLimulid(RenderManager mgr) {
        super(mgr, new ModelLimulid(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLimulid entity) {
        return RenderLimulid.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLimulid entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLimulid entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0F;
    }

}
