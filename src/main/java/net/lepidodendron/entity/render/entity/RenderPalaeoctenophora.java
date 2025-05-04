package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEoandromeda;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeoctenophora;
import net.lepidodendron.entity.model.entity.ModelPalaeoctenophora;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderPalaeoctenophora extends RenderLivingBaseWithBook<EntityPrehistoricFloraPalaeoctenophora> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeoctenophora.png");

    public static float getScaler() {return 0.35F;}

    public RenderPalaeoctenophora(RenderManager mgr) {
        super(mgr, new ModelPalaeoctenophora(), 0.0f);
        this.addLayer(new LayerPalaeoctenophoraBody(this));
        this.addLayer(new LayerPalaeoctenophoraEmissive(this));

    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraPalaeoctenophora entity) {
        return RenderPalaeoctenophora.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraPalaeoctenophora entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraPalaeoctenophora entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0F;
    }

    @Override
    public void doRender(EntityPrehistoricFloraPalaeoctenophora entity, double x, double y, double z, float entityYaw, float partialTicks) {
        try {
            StackTraceElement[] elements = new Throwable().getStackTrace();
            String  callerClass = elements[4].getClassName();
            if (callerClass.equalsIgnoreCase("vazkii.patchouli.client.book.page.PageEntity")) {
                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableAlpha();
                boolean flag = this.setDoRenderBrightness(entity, partialTicks);
                //Start of renders
                float scale = this.prepareScale(entity, partialTicks);
                //Main model
                this.bindTexture(TEXTURE);
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
                this.bookModel.renderStaticBook(scale);
                GlStateManager.disableBlend();
                //Layer1 (Body:
                this.bindTexture(LayerPalaeoctenophoraBody.TEXTURE);
                GlStateManager.pushMatrix();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                this.bookModel.renderStaticBook(scale);
                GlStateManager.disableBlend();
                GlStateManager.disableNormalize();
                GlStateManager.popMatrix();
                //Layer2 (Emissive):
                this.bindTexture(LayerPalaeoctenophoraEmissive.TEXTURE);
                GlStateManager.pushMatrix();
                GlStateManager.enableBlend();
                GlStateManager.disableAlpha();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
                if (entity.isInvisible())
                {
                    GlStateManager.depthMask(false);
                }
                else
                {
                    GlStateManager.depthMask(true);
                }

                int i = 61680;
                int j = i % 65536;
                int k = i / 65536;
                OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
                GlStateManager.color(0.2F, 0.2F, 0.2F, 1.0F);
                Minecraft.getMinecraft().entityRenderer.setupFogColor(true);
                this.bookModel.setModelAttributes(this.bookModel);
                this.bookModel.renderStaticBook(scale);
                Minecraft.getMinecraft().entityRenderer.setupFogColor(false);
                i = entity.getBrightnessForRender();
                j = i % 65536;
                k = i / 65536;
                OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, (float)j, (float)k);
                this.setLightmap(entity);
                GlStateManager.disableBlend();
                GlStateManager.enableAlpha();
                GlStateManager.popMatrix();
                //End of renders
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
                //End of renders
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

}