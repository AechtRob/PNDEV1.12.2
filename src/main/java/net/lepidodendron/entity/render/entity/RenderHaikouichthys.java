package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraHaikouichthys;
import net.lepidodendron.entity.model.entity.ModelHaikouichthys;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderHaikouichthys extends RenderLivingBaseWithBook<EntityPrehistoricFloraHaikouichthys> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/haikouichthys.png");

    public static float getScaler() {return 0.15F;}

    public RenderHaikouichthys(RenderManager mgr) {
        super(mgr, new ModelHaikouichthys(), 0.0f);
        this.addLayer(new LayerHaikouichthysFins(this));
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraHaikouichthys entity) {
        return RenderHaikouichthys.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraHaikouichthys entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }
    protected void preRenderCallback(EntityPrehistoricFloraHaikouichthys entity, float f) {
        float scale = this.getScaler();
//        if (scale < 0.1f) {
//            scale = 0.1f;
//        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;
    }

    @Override
    public void doRender(EntityPrehistoricFloraHaikouichthys entity, double x, double y, double z, float entityYaw, float partialTicks) {
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
                this.bindTexture(LayerHaikouichthysFins.TEXTURE);
                GlStateManager.pushMatrix();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.85F);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                this.bookModel.renderStaticBook(scale);
                GlStateManager.disableBlend();
                GlStateManager.disableNormalize();
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