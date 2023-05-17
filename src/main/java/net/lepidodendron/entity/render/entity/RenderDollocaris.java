package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraDollocaris;
import net.lepidodendron.entity.model.entity.ModelDollocaris;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDollocaris extends RenderLiving<EntityPrehistoricFloraDollocaris> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dollocaris.png");

    public static float getScaler() {
        return 0.7F * 0.4F;
    }
    public RenderDollocaris(RenderManager mgr) {
        super(mgr, new ModelDollocaris(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraDollocaris entity) {
        return RenderDollocaris.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraDollocaris entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraDollocaris entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}