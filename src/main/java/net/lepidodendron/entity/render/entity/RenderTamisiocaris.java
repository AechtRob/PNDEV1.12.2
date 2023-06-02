package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraTamisiocaris;
import net.lepidodendron.entity.model.entity.ModelTamisiocaris;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderTamisiocaris extends RenderLiving<EntityPrehistoricFloraTamisiocaris> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tamisiocaris.png");

    public static float getScaler() {
        return 0.3F;
    }

    public RenderTamisiocaris(RenderManager mgr) {
        super(mgr, new ModelTamisiocaris(), 0.2f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraTamisiocaris entity) {
        return RenderTamisiocaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraTamisiocaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraTamisiocaris entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.38F;
    }

}