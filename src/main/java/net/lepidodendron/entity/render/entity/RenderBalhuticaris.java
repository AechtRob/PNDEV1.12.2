package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraBalhuticaris;
import net.lepidodendron.entity.model.entity.ModelBalhuticaris;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderBalhuticaris extends RenderLiving<EntityPrehistoricFloraBalhuticaris> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/balhuticaris.png");

    public static float getScaler() {
        return 0.3F * 0.5F;
    }
    public RenderBalhuticaris(RenderManager mgr) {
        super(mgr, new ModelBalhuticaris(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraBalhuticaris entity) {
        return RenderBalhuticaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraBalhuticaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraBalhuticaris entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}