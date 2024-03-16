package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraRobertia;
import net.lepidodendron.entity.model.entity.ModelRobertia;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderRobertia extends RenderLiving<EntityPrehistoricFloraRobertia> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/robertia.png");

    public static float getScaler() {
        return 0.7F * 0.30f;
    }

    public RenderRobertia(RenderManager mgr) {
        super(mgr, new ModelRobertia(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraRobertia entity) {
        return RenderRobertia.TEXTURE;
    }
    @Override
    public void doRender(EntityPrehistoricFloraRobertia entity, double x, double y, double z, float entityYaw, float partialTicks) {
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
            RenderDisplays.modelRobertiaBook.renderStaticBook(this.prepareScale(entity, partialTicks));
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
    protected void applyRotations(EntityPrehistoricFloraRobertia entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraRobertia entity, float f) {
        float scale = entity.getAgeScale() * getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}