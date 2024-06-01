package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraEramoscorpius;
import net.lepidodendron.entity.EntityPrehistoricFloraLeedsichthys;
import net.lepidodendron.entity.model.entity.ModelEramoscorpius;
import net.lepidodendron.entity.model.entity.ModelScorpion;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderEramoscorpius extends RenderLiving<EntityPrehistoricFloraEramoscorpius> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eramoscorpius.png");
    private static final ResourceLocation TEXTURE_WITH_BABIES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eramoscorpius_withbaby.png");
    private static final ResourceLocation TEXTURE_BABY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eramoscorpius_baby.png");

    public RenderEramoscorpius(RenderManager mgr) {
        super(mgr, new ModelEramoscorpius(), 0.0f);
    }

    public static float getScaler() {
        return 0.14F;
    }
    @Override
    public void doRender(EntityPrehistoricFloraEramoscorpius entity, double x, double y, double z, float entityYaw, float partialTicks) {
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
                RenderDisplays.modelEramoscorpiusBook.renderStaticBook(this.prepareScale(entity, partialTicks));
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
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraEramoscorpius entity) {
        if (entity.getIsBaby()) {
            return RenderEramoscorpius.TEXTURE_BABY;
        }
        else if (entity.getBabies()) {
            return RenderEramoscorpius.TEXTURE_WITH_BABIES;
        }
        return RenderEramoscorpius.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraEramoscorpius entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

    }

    @Override
    protected void preRenderCallback(EntityPrehistoricFloraEramoscorpius entity, float f) {
        float scale = this.getScaler();
        if (entity.getIsBaby()) {
            scale = 0.05f;
        }
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = 0;

    }

}