package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSibyrhynchus;
import net.lepidodendron.entity.model.entity.ModelSibyrhynchus;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSibyrhynchus extends RenderLiving<EntityPrehistoricFloraSibyrhynchus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sibyrhynchus.png");

    public static float getScaler() {
        return 0.7F * 0.42F;
    }
    public RenderSibyrhynchus(RenderManager mgr) {
        super(mgr, new ModelSibyrhynchus(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSibyrhynchus entity) {
        return RenderSibyrhynchus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSibyrhynchus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    @Override
    protected void preRenderCallback(EntityPrehistoricFloraSibyrhynchus entity, float f) {
        float scale = this.getScaler();
        if (scale < 0.1f) {
            scale = 0.1f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}