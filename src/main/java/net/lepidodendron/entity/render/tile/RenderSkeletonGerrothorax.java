package net.lepidodendron.entity.render.tile;

import net.lepidodendron.ClientProxyLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockSkeletonGerrothorax;
import net.lepidodendron.entity.model.tile.ModelSkeletonGerrothorax;
import net.lepidodendron.entity.render.entity.RenderGerrothorax;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderSkeletonGerrothorax extends TileEntitySpecialRenderer<BlockSkeletonGerrothorax.TileEntitySkeletonGerrothorax> {

    private static final ResourceLocation TEXTURE1 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/gerrothorax_stage1.png");
    private static final ResourceLocation TEXTURE2 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/gerrothorax_stage2.png");
    private static final ResourceLocation TEXTURE3 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/gerrothorax_stage3.png");
    private static final ResourceLocation TEXTURE4 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/gerrothorax_stage4.png");
    private static final ResourceLocation TEXTURE5 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/gerrothorax_stage5.png");
    private final ModelSkeletonGerrothorax modelSkeleton;

    public RenderSkeletonGerrothorax() {
        this.modelSkeleton = new ModelSkeletonGerrothorax();
    }

    @Override
    public void render(BlockSkeletonGerrothorax.TileEntitySkeletonGerrothorax entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {

        int currentRotation = 0;
        int currentStage = 0;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
            currentStage = entity.getTileData().getInteger("stage");
        }
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        switch (currentStage) {

            case 1: default:
                this.bindTexture(TEXTURE1);
                break;

            case 2:
                this.bindTexture(TEXTURE2);
                break;

            case 3:
                this.bindTexture(TEXTURE3);
                break;

            case 4:
                this.bindTexture(TEXTURE4);
                break;

            case 5:
                this.bindTexture(TEXTURE5);
                break;
        }

        GlStateManager.enableAlpha();
        ModelSkeletonGerrothorax modelSkeleton = this.modelSkeleton;
        double scale = RenderGerrothorax.getScaler() * RenderDisplayWallMount.scaler;

        GlStateManager.translate(x + 0.5, y + 0.7, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);

        modelSkeleton.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();

        //Arrow to show location:
        if (ClientProxyLepidodendronMod.keyB.isKeyDown()) {
            GL11.glPushMatrix();
            GL11.glLineWidth(12);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glColor3ub((byte) 255, (byte) 0, (byte) 0);
            GL11.glBegin(GL11.GL_LINES);
            GL11.glVertex3f((float) x + 0.5F, (float) y + 1.125F, (float) z + 0.5F);
            GL11.glVertex3f((float) x + 0.5F, (float) y + 2.5F, (float) z + 0.5F);
            GL11.glEnd();
            GL11.glBegin(GL11.GL_LINES);
            GL11.glVertex3f((float) x + 0.5F, (float) y + 1.125F, (float) z + 0.5F);
            GL11.glVertex3f((float) x + 0.5F + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
            GL11.glEnd();
            GL11.glBegin(GL11.GL_LINES);
            GL11.glVertex3f((float) x + 0.5F, (float) y + 1.125F, (float) z + 0.5F);
            GL11.glVertex3f((float) x + 0.5F - 0.5F, (float) y + 1.5F, (float) z + 0.5F);
            GL11.glEnd();
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glPopMatrix();
        }
    }
}