package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGerarusInsect;

import net.lepidodendron.entity.model.entity.ModelGerarus;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderGerarus extends RenderLiving<EntityPrehistoricFloraGerarusInsect> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerarus.png");
    public static final ResourceLocation TEXTURE_BOOK = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerarus_book.png");

    public RenderGerarus(RenderManager mgr) {
        super(mgr, new ModelGerarus(), 0.0f);
        this.addLayer(new LayerGerarusWing(this));
    }

    public static float getScaler() {
        return 0.240f;
    }

    @Override
    public void doRender(EntityPrehistoricFloraGerarusInsect entity, double x, double y, double z, float entityYaw, float partialTicks) {
        @SuppressWarnings("deprecation")
        Class clazz = sun.reflect.Reflection.getCallerClass(4);
        if (clazz.getName().equalsIgnoreCase("vazkii.patchouli.client.book.page.PageEntity")) {
            GlStateManager.pushMatrix();
            GlStateManager.disableCull();
            GlStateManager.enableAlpha();
            boolean flag = this.setDoRenderBrightness(entity, partialTicks);
            this.bindTexture(TEXTURE_BOOK);
            RenderDisplays.modelGerarus.renderStaticBook(this.prepareScale(entity, partialTicks));
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

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraGerarusInsect entity) {
        return RenderGerarus.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraGerarusInsect entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraGerarusInsect entity, float f) {
        float scale = getScaler();
        GlStateManager.scale(scale, scale, scale);
    }

}