package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraYiQi;
import net.lepidodendron.entity.model.entity.ModelYiQi;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderYiQi extends RenderLiving<EntityPrehistoricFloraYiQi> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yiqi.png");

    public static float getScaler() {
        return 0.185f;
    }

    public RenderYiQi(RenderManager mgr) {
        super(mgr, new ModelYiQi(), 0.0f);
    }

    @Override
    public void doRender(EntityPrehistoricFloraYiQi entity, double x, double y, double z, float entityYaw, float partialTicks) {
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
            RenderDisplays.modelYiQi.renderStaticBook(this.prepareScale(entity, partialTicks));
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
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraYiQi entity) {
        return RenderYiQi.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraYiQi entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entityLiving, ageInTicks, rotationYaw, partialTicks);

        switch (entityLiving.getClimbFacing()) {
            case DOWN:
            default:
                break;

            case EAST: case SOUTH: case WEST: case NORTH:
                GlStateManager.translate(0.0F, 0.05F, -0.1775F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                break;

            case UP:
                GlStateManager.translate(0.0F, 0.5F, 0.0F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        }

    }


    @Override
    protected void preRenderCallback(EntityPrehistoricFloraYiQi entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}