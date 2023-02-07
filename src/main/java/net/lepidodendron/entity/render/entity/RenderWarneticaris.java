package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraWarneticaris;
import net.lepidodendron.entity.model.entity.ModelWarneticaris;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWarneticaris extends RenderLiving<EntityPrehistoricFloraWarneticaris> {
    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/warneticaris.png");
    public static float getScaler() {
        return 0.7F * 0.7F;
    }
    public RenderWarneticaris(RenderManager mgr) {
        super(mgr, new ModelWarneticaris(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraWarneticaris entity) {
        return RenderWarneticaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraWarneticaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraWarneticaris entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}