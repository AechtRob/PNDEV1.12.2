package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraClimacograptus;
import net.lepidodendron.entity.model.entity.ModelClimacograptus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderClimacograptus extends RenderLiving<EntityPrehistoricFloraClimacograptus> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/climacograptus.png");
    public static float getScaler() {
        return 0.25F;
    }

    public RenderClimacograptus(RenderManager mgr) {
        super(mgr, new ModelClimacograptus(), 0.0f);
    }

    @Override
    public void doRender(EntityPrehistoricFloraClimacograptus entity, double x, double y, double z, float entityYaw, float partialTicks) {
        try {
            StackTraceElement[] elements = new Throwable().getStackTrace();
            String  callerClass = elements[4].getClassName();
            if (callerClass.equalsIgnoreCase("vazkii.patchouli.client.book.page.PageEntity")) {
                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableAlpha();
                boolean flag = this.setDoRenderBrightness(entity, partialTicks);
                if (!this.bindEntityTexture(entity)) {
                    return;
                }
                RenderDisplays.modelClimacograptusBook.renderStaticBook(this.prepareScale(entity, partialTicks));
                if (flag) {
                    this.unsetBrightness();
                }
                GlStateManager.depthMask(true);
                GlStateManager.disableRescaleNormal();
                GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
                GlStateManager.enableTexture2D();
                GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
                GlStateManager.enableCull();
                GlStateManager.popMatrix();
            } else {
                super.doRender(entity, x, y, z, entityYaw, partialTicks);
            }
        }
        catch (Exception e ) {
            //Do nothing
        }
    }
    
    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraClimacograptus entity) {
        return RenderClimacograptus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraClimacograptus entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraClimacograptus entity, float f) {
        float scale = this.getScaler();
        GlStateManager.scale(scale, scale, scale);
    }

}