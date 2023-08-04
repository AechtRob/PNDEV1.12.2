package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraCalvapilosa;
import net.lepidodendron.entity.EntityPrehistoricFloraTurboscinetes;
import net.lepidodendron.entity.model.entity.ModelCalvapilosa;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderCalvapilosa extends RenderLiving<EntityPrehistoricFloraCalvapilosa> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/calvapilosa.png");
    public static float getScaler() {
        return 0.15F;
    }

    public RenderCalvapilosa(RenderManager mgr) {
        super(mgr, new ModelCalvapilosa(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraCalvapilosa entity) {
        return RenderCalvapilosa.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraCalvapilosa entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraCalvapilosa entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }
}




