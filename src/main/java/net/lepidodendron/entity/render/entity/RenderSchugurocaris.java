package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSchugurocaris;
import net.lepidodendron.entity.model.entity.ModelSchugurocaris;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSchugurocaris extends RenderLiving<EntityPrehistoricFloraSchugurocaris> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/schugurocaris.png");

    public static float getScaler() {
        return 0.7F * 0.4F;
    }
    public RenderSchugurocaris(RenderManager mgr) {
        super(mgr, new ModelSchugurocaris(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSchugurocaris entity) {
        return RenderSchugurocaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSchugurocaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSchugurocaris entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}