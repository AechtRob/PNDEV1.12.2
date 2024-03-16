package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraAnchiornis;
import net.lepidodendron.entity.model.entity.ModelAnchiornis;
import net.lepidodendron.entity.render.tile.RenderDisplays;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderAnchiornis extends RenderLiving<EntityPrehistoricFloraAnchiornis> {
    public static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anchiornis.png");

    public static float getScaler() {
        return 0.185f;
    }

    public RenderAnchiornis(RenderManager mgr) {
        super(mgr, new ModelAnchiornis(), 0.0f);
    }

    @Override
    public void doRender(EntityPrehistoricFloraAnchiornis entity, double x, double y, double z, float entityYaw, float partialTicks) {
        try {
            @SuppressWarnings("deprecation")
            Class clazz = sun.reflect.Reflection.getCallerClass(4);
            if (clazz.getName().equalsIgnoreCase("vazkii.patchouli.client.book.page.PageEntity")) {
                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableAlpha();
                boolean flag = this.setDoRenderBrightness(entity, partialTicks);
                if (!this.bindEntityTexture(entity)) {
                    return;
                }
                RenderDisplays.modelAnchiornisBook.renderStaticBook(this.prepareScale(entity, partialTicks));
                if (flag) {
                    this.unsetBrightness();
                }
                GlStateManager.depthMask(true);
                GlStateManager.disableRescaleNormal();
                GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
                GlStateManager.enableTexture2D();
                GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
                GlStateManager.enableCull();
                GlStateManager.popMatrix();
            } else {
                super.doRender(entity, x, y, z, entityYaw, partialTicks);
            }
        }
        catch (Exception e ) {
            //Do nothing
        }
    }

    @Override
    public ResourceLocation getEntityTexture(EntityPrehistoricFloraAnchiornis entity) {
        return RenderAnchiornis.TEXTURE;
    }

    @Override
    protected void applyRotations(EntityPrehistoricFloraAnchiornis entityLiving, float ageInTicks, float rotationYaw, float partialTicks) {
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
    protected void preRenderCallback(EntityPrehistoricFloraAnchiornis entity, float f) {
        float scale = entity.getAgeScale() * this.getScaler();
        GlStateManager.scale(scale, scale, scale);
        this.shadowSize = entity.width * scale * 0.15F;
    }

}