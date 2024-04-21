package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDebeerius;
import net.lepidodendron.entity.model.entity.ModelDebeerius;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDebeerius extends RenderLiving<EntityPrehistoricFloraDebeerius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/debeerius.png");

    public RenderDebeerius(RenderManager mgr) {
        super(mgr, new ModelDebeerius(), 0.5f);
    }
    public static float getScaler() {
        return 0.3F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDebeerius entity) {
        return RenderDebeerius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDebeerius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDebeerius entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}