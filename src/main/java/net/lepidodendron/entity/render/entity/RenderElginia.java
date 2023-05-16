package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraElginia;
import net.lepidodendron.entity.model.entity.ModelElginia;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderElginia extends RenderLiving<EntityPrehistoricFloraElginia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/elginia.png");
    public static final ModelBase MODEL_BASE = new ModelElginia();

    public RenderElginia(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.325f);
    }
    public static float getScaler() {
        return 0.42f;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraElginia entity) {
        return RenderElginia.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraElginia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraElginia entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.325F;
    }

}