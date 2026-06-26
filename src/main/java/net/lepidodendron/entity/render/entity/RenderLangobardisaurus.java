package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLangobardisaurus;
import net.lepidodendron.entity.model.entity.ModelLangobardisaurus;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLangobardisaurus extends RenderLivingBaseWithBook<EntityPrehistoricFloraLangobardisaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/langobardisaurus.png");

    public static float getScaler() {return 0.3f;}
    public RenderLangobardisaurus(RenderManager mgr) {
        super(mgr, new ModelLangobardisaurus(), 0.3f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLangobardisaurus entity) {
        return RenderLangobardisaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLangobardisaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLangobardisaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

}