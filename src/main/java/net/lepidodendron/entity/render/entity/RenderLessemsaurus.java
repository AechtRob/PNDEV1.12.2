package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLessemsaurus;
import net.lepidodendron.entity.model.entity.ModelLessemsaurus;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLessemsaurus extends RenderLiving<EntityPrehistoricFloraLessemsaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lessemsaurus.png");
    public static final ModelBase MODEL_BASE = new ModelLessemsaurus();

    public static float getScaler() {
        return 1.00f;
    }

    public RenderLessemsaurus(RenderManager mgr) {
        super(mgr, MODEL_BASE, 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLessemsaurus entity) {
        return RenderLessemsaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLessemsaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLessemsaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 1.0F;
    }

}