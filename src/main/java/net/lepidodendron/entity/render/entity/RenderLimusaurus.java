package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraLimusaurus;
import net.lepidodendron.entity.model.entity.ModelLimusaurus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderLimusaurus extends RenderLiving<EntityPrehistoricFloraLimusaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/limusaurus.png");

    public RenderLimusaurus(RenderManager mgr) {
        super(mgr, new ModelLimusaurus(), 0.3f);
    }

    public static float getScaler() {
        return 0.3636F;
    }
    @Override
    public void doRender(EntityPrehistoricFloraLimusaurus entity, double x, double y, double z, float entityYaw, float partialTicks) {
        try {
            @SuppressWarnings("deprecation")
            Class clazz = sun.reflect.Reflection.getCallerClass(4);
        if (clazz.getName().equalsIgnoreCase("vazkii.patchouli.client.book.page.PageEntity")) {
            GlStateManager.pushMatrix();
            GlStateManager.disableCull();
            GlStateManager.enableAlpha();
            boolean flag = this.setDoRenderBrightness(entity, partialTicks);
            if (!this.bindEntityTexture(entity))
            {
                return;
            }
            RenderDisplays.modelLimusaurus.renderStaticBook(this.prepareScale(entity, partialTicks));
            if (flag)
            {
                this.unsetBrightness();
            }
            GlStateManager.depthMask(true);
            GlStateManager.disableRescaleNormal();
            GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
            GlStateManager.enableTexture2D();
            GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
            GlStateManager.enableCull();
            GlStateManager.popMatrix();
        }
        else {
            super.doRender(entity, x, y, z, entityYaw, partialTicks);
        }
        }
        catch (Exception e)
        {
            //Do nothing
        }
    }
    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraLimusaurus entity) {
        return RenderLimusaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraLimusaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraLimusaurus entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (scale < 0.1f) {scale = 0.1f;}
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.35F;
    }

}