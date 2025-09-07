package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSynophalos;
import net.lepidodendron.entity.model.entity.ModelSynophalos;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderSynophalos extends RenderLivingBaseWithBook<EntityPrehistoricFloraSynophalos> {
    public static final ResourceLocation TEXTURE1 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/synophalos_1.png");
    public static final ResourceLocation TEXTURE2 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/synophalos_2.png");
    public static final ResourceLocation TEXTURE4 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/synophalos_4.png");
    public static final ResourceLocation TEXTURE8 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/synophalos_8.png");
    public static final ResourceLocation TEXTURE16 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/synophalos_16.png");

    public RenderSynophalos(RenderManager mgr) {
        super(mgr, new ModelSynophalos(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSynophalos entity) {
        if (entity.getChain() == 16) {
            return RenderSynophalos.TEXTURE16;
        }
        if (entity.getChain() == 8) {
            return RenderSynophalos.TEXTURE8;
        }
        if (entity.getChain() == 4) {
            return RenderSynophalos.TEXTURE4;
        }
        if (entity.getChain() == 2) {
            return RenderSynophalos.TEXTURE2;
        }
        return RenderSynophalos.TEXTURE1;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraSynophalos entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    public void doRender(EntityPrehistoricFloraSynophalos entity, double x, double y, double z, float entityYaw, float partialTicks) {
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
                this.bindTexture(TEXTURE8);
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                this.bookModel.renderStaticBook(scale);
                GlStateManager.disableBlend();
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