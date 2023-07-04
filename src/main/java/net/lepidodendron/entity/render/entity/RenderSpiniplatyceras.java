package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSpiniplatyceras;
import net.lepidodendron.entity.model.entity.ModelSpiniplatyceras;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSpiniplatyceras extends RenderLiving<EntityPrehistoricFloraSpiniplatyceras> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/spiniplatyceras.png");

    public static float getScaler() {
        return 0.2F;
    }

    public RenderSpiniplatyceras(RenderManager mgr) {
        super(mgr, new ModelSpiniplatyceras(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSpiniplatyceras entity) {
        return RenderSpiniplatyceras.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSpiniplatyceras entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSpiniplatyceras entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.2f) {
            scale = 0.2f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}