package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraMymoorapelta;
import net.lepidodendron.entity.EntityPrehistoricFloraPlateosaurus;
import net.lepidodendron.entity.model.entity.ModelMymoorapelta;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderMymoorapelta extends RenderLiving<EntityPrehistoricFloraMymoorapelta> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mymoorapelta.png");

    public RenderMymoorapelta(RenderManager mgr) {
        super(mgr, new ModelMymoorapelta(), 0.3f);
    }

    public static float getScaler() {
        return 0.7F;
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraMymoorapelta entity) {
        return RenderMymoorapelta.TEXTURE;
    }
    @Override
    public void doRender(EntityPrehistoricFloraMymoorapelta entity, double x, double y, double z, float entityYaw, float partialTicks) {
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
            RenderDisplays.modelMymoorapelta.renderStaticBook(this.prepareScale(entity, partialTicks));
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
    protected void applyRotations(EntityPrehistoricFloraMymoorapelta entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraMymoorapelta entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.3F;
    }

}