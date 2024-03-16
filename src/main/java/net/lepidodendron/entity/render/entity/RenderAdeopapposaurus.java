package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAdeopapposaurus;
import net.lepidodendron.entity.model.entity.ModelAdeopapposaurus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAdeopapposaurus extends RenderLiving<EntityPrehistoricFloraAdeopapposaurus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/adeopapposaurus.png");

    public static float getScaler() {return 0.55F;}

    public RenderAdeopapposaurus(RenderManager mgr) {
        super(mgr, new ModelAdeopapposaurus(), 0.5f);
    }

    @Override
    public void doRender(EntityPrehistoricFloraAdeopapposaurus entity, double x, double y, double z, float entityYaw, float partialTicks) {
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
            RenderDisplays.modelAdeopapposaurus.renderStaticBook(this.prepareScale(entity, partialTicks));
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
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAdeopapposaurus entity) {
        return RenderAdeopapposaurus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAdeopapposaurus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraAdeopapposaurus entity, float f) {
        float scale = entity.getAgeScale()*getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.40F;
    }

}