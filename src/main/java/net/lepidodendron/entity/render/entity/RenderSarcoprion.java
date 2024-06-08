package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraSarcoprion;
import net.lepidodendron.entity.model.entity.ModelSarcoprion;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderSarcoprion extends RenderLiving<EntityPrehistoricFloraSarcoprion> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sarcoprion.png");
    public static final ResourceLocation TEXTURE_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sarcoprion_f.png");

    public RenderSarcoprion(RenderManager mgr) {
        super(mgr, new ModelSarcoprion(), 0.0f);
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraSarcoprion entity) {
        if (entity.getPNType() == EntityPrehistoricFloraSarcoprion.Type.FEMALE) {
            return RenderSarcoprion.TEXTURE_F;
        }
        return RenderSarcoprion.TEXTURE;
    }

    public static float getScaler() {
        return 1F;
    }

    @Override
    public void doRender(EntityPrehistoricFloraSarcoprion entity, double x, double y, double z, float entityYaw, float partialTicks) {
        try {
            StackTraceElement[] elements = new Throwable().getStackTrace();
            String  callerClass = elements[4].getClassName();
            if (callerClass.equalsIgnoreCase("vazkii.patchouli.client.book.page.PageEntity")) {
                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableAlpha();
                boolean flag = this.setDoRenderBrightness(entity, partialTicks);
                if (!this.bindEntityTexture(entity))
                {
                    return;
                }
                RenderDisplays.modelSarcoprionBook.renderStaticBook(this.prepareScale(entity, partialTicks));
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
    protected void applyRotations(EntityPrehistoricFloraSarcoprion entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);
    }

    protected void preRenderCallback(EntityPrehistoricFloraSarcoprion entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        if (entity.getPNType() == EntityPrehistoricFloraSarcoprion.Type.FEMALE) {
            scale = scale * 0.8F;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.00F;
    }

}