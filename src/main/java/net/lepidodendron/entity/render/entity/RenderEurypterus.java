package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEurypterus;
import net.lepidodendron.entity.model.entity.ModelEurypterus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEurypterus extends RenderLiving<EntityPrehistoricFloraEurypterus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eurypterus.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eurypterus_baby.png");
    public static final ModelBase MODEL_BASE = new ModelEurypterus();

    public RenderEurypterus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEurypterus entity) {
        float scale = entity.getAgeScale();
        if (entity.isSmall()) {
            return RenderEurypterus.TEXTURE_BABY;
        }
        return RenderEurypterus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEurypterus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEurypterus entity, float f) {
        float scale = entity.getAgeScale();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.45F;
    }

}