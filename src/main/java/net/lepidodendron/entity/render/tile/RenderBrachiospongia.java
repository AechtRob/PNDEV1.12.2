package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockBrachiospongia;
import net.lepidodendron.entity.model.tile.ModelBrachiospongia;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderBrachiospongia extends TileEntitySpecialRenderer<BlockBrachiospongia.TileEntityCustom> {

    private final ModelBrachiospongia brachiospongia;
    private static final ResourceLocation TEXTURE_BRACHIOSPONGIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/brachiospongia.png");
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderBrachiospongia() {
        this.brachiospongia = new ModelBrachiospongia();
    }

    @Override
    public void render(BlockBrachiospongia.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockBrachiospongia.block) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);

            int rotation = 0;
            TileEntity tileEntity = entity.getWorld().getTileEntity(entity.getPos());
            if (tileEntity != null) {
                if (tileEntity.getTileData().hasKey("rotation")) {
                    rotation = tileEntity.getTileData().getInteger("rotation");
                }
            }
            Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_BRACHIOSPONGIA);

            GlStateManager.enableRescaleNormal();
            GlStateManager.alphaFunc(516, 0.1f);
            GlStateManager.enableBlend();
            RenderHelper.enableStandardItemLighting();
            GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
            GlStateManager.pushMatrix();
            if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                GlStateManager.translate(x + 0.5, y + 1.4, z + 0.5);
            }
            if (facing == EnumFacing.EAST) {
                GlStateManager.translate(x + 1.4, y + 0.4, z + 0.5);
                GlStateManager.rotate(90, 1F, 0F, 0F);
                GlStateManager.rotate(90, 0F, 0F, 1F);
            }
            if (facing == EnumFacing.WEST) {
                GlStateManager.translate(x - 0.4, y + 0.4, z + 0.5);
                GlStateManager.rotate(90, 1F, 0F, 0F);
                GlStateManager.rotate(270, 0F, 0F, 1F);
            }
            if (facing == EnumFacing.NORTH) {
                GlStateManager.translate(x + 0.5, y + 0.4, z - 0.4);
                GlStateManager.rotate(90, 1F, 0F, 0F);
            }
            if (facing == EnumFacing.SOUTH) {
                GlStateManager.translate(x + 0.5, y + 0.4, z + 1.4);
                GlStateManager.rotate(270, 1F, 0F, 0F);
            }

            if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                GlStateManager.rotate(180, 0F, 0F, 1F);
            }
            if (rotation == 1) {
                GlStateManager.rotate(15, 0F, 1F, 0F);
            }
            if (rotation == 2) {
                GlStateManager.rotate(30, 0F, 1F, 0F);
            }
            if (rotation == 3) {
                GlStateManager.rotate(45, 0F, 1F, 0F);
            }
            GlStateManager.scale(0.575F, 0.575F, 0.575F);
            this.brachiospongia.renderAll(Minecraft.getMinecraft().player.ticksExisted);
            GlStateManager.popMatrix();
            GlStateManager.disableRescaleNormal();
            GlStateManager.disableBlend();
        }
    }
}