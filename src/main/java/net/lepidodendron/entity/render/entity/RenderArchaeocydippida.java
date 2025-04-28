package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraArchaeocydippida;
import net.lepidodendron.entity.model.entity.ModelArchaeocydippida;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderArchaeocydippida extends RenderLivingBaseWithBook<EntityPrehistoricFloraArchaeocydippida> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archaeocydippida.png");

   public static float getScaler() {return 0.3F;}

    public RenderArchaeocydippida(RenderManager mgr) {
        super(mgr, new ModelArchaeocydippida(), 0.0f);
        this.addLayer(new LayerArchaeocydippidaBody(this));
        this.addLayer(new LayerArchaeocydippidaEmissive(this));

    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraArchaeocydippida entity) {
        return RenderArchaeocydippida.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraArchaeocydippida entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraArchaeocydippida entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
        //this.shadowSize = entity.width * scale * 0.50F;
    }
    
    @Override
    public void doRender(EntityPrehistoricFloraArchaeocydippida entity, double x, double y, double z, float entityYaw, float partialTicks) {
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
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                this.bookModel.renderStaticBook(scale);
                GlStateManager.disableBlend();
                //Layer1:
                this.bindTexture(LayerArchaeocydippidaBody.TEXTURE);
                GlStateManager.pushMatrix();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.95F);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                this.bookModel.renderStaticBook(scale);
                GlStateManager.disableBlend();
                GlStateManager.disableNormalize();
                GlStateManager.popMatrix();
                //Layer2 (emissive):
                this.bindTexture(LayerArchaeocydippidaEmissive.TEXTURE);
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
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
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