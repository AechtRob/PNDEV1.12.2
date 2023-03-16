package net.lepidodendron.entity.render.tile;

import net.lepidodendron.ClientProxyLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockSkeletonAnteosaurus;
import net.lepidodendron.entity.model.tile.ModelSkeletonAnteosaurus;
import net.lepidodendron.entity.render.entity.RenderAnteosaurus;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderSkeletonAnteosaurus extends TileEntitySpecialRenderer<BlockSkeletonAnteosaurus.TileEntitySkeletonAnteosaurus> {

    private static final ResourceLocation TEXTURE1 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage1.png");
    private static final ResourceLocation TEXTURE2 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage2.png");
    private static final ResourceLocation TEXTURE3 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage3.png");
    private static final ResourceLocation TEXTURE4 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage4.png");
    private static final ResourceLocation TEXTURE5 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage5.png");
    private static final ResourceLocation TEXTURE6 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage6.png");
    private static final ResourceLocation TEXTURE7 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage7.png");
    private static final ResourceLocation TEXTURE8 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage8.png");
    private static final ResourceLocation TEXTURE9 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage9.png");
    private static final ResourceLocation TEXTURE10 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage10.png");
    private static final ResourceLocation TEXTURE11 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage11.png");
    private static final ResourceLocation TEXTURE12 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage12.png");
    private static final ResourceLocation TEXTURE13 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage13.png");
    private static final ResourceLocation TEXTURE14 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage14.png");
    private static final ResourceLocation TEXTURE15 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage15.png");
    private static final ResourceLocation TEXTURE16 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage16.png");
    private static final ResourceLocation TEXTURE17 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage17.png");
    private static final ResourceLocation TEXTURE18 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage18.png");
    private static final ResourceLocation TEXTURE19 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage19.png");
    private static final ResourceLocation TEXTURE20 = new ResourceLocation(LepidodendronMod.MODID + ":textures/skeletons/anteosaurus_stage20.png");

    private final ModelSkeletonAnteosaurus modelSkeleton;

    public RenderSkeletonAnteosaurus() {
        this.modelSkeleton = new ModelSkeletonAnteosaurus();
    }

    @Override
    public void render(BlockSkeletonAnteosaurus.TileEntitySkeletonAnteosaurus entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
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
            case 6:
                this.bindTexture(TEXTURE6);
                break;
            case 7:
                this.bindTexture(TEXTURE7);
                break;
            case 8:
                this.bindTexture(TEXTURE8);
                break;
            case 9:
                this.bindTexture(TEXTURE9);
                break;
            case 10:
                this.bindTexture(TEXTURE10);
                break;
            case 11:
                this.bindTexture(TEXTURE11);
                break;
            case 12:
                this.bindTexture(TEXTURE12);
                break;
            case 13:
                this.bindTexture(TEXTURE13);
                break;
            case 14:
                this.bindTexture(TEXTURE14);
                break;
            case 15:
                this.bindTexture(TEXTURE15);
                break;
            case 16:
                this.bindTexture(TEXTURE16);
                break;
            case 17:
                this.bindTexture(TEXTURE17);
                break;
            case 18:
                this.bindTexture(TEXTURE18);
                break;
            case 19:
                this.bindTexture(TEXTURE19);
                break;
            case 20:
                this.bindTexture(TEXTURE20);
                break;
        }

        GlStateManager.enableAlpha();
        ModelSkeletonAnteosaurus modelSkeleton = this.modelSkeleton;
        double scale = RenderAnteosaurus.getScaler() * RenderDisplayWallMount.scaler;

        GlStateManager.translate(x + 0.5, y + 1.55, z + 0.5);
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