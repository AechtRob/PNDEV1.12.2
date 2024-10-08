package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockHerpetogaster;
import net.lepidodendron.entity.model.tile.ModelHerpetogaster;
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

public class RenderHerpetogaster extends TileEntitySpecialRenderer<BlockHerpetogaster.TileEntityCustom> {

    private final ModelHerpetogaster herpetogaster;
    private static final ResourceLocation TEXTURE_HERPETOGASTER = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/herpetogaster.png");
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderHerpetogaster() {
        this.herpetogaster = new ModelHerpetogaster();
    }

    @Override
    public void render(BlockHerpetogaster.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockHerpetogaster.block) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);

            int rotation = 0;
            TileEntity tileEntity = entity.getWorld().getTileEntity(entity.getPos());
            if (tileEntity != null) {
                if (tileEntity.getTileData().hasKey("rotation")) {
                    rotation = tileEntity.getTileData().getInteger("rotation");
                }
            }
            Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_HERPETOGASTER);

            GlStateManager.enableRescaleNormal();
            GlStateManager.alphaFunc(516, 0.1f);
            GlStateManager.enableBlend();
            RenderHelper.enableStandardItemLighting();
            GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
            GlStateManager.pushMatrix();
            if (facing == EnumFacing.DOWN) {
                //Impossible to place like this but anyway.....
                GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
            }
            if (facing == EnumFacing.EAST) {
                GlStateManager.translate(x + 0.0, y + 0.7 + (rotation * 0.1), z + 0.5);
            }
            if (facing == EnumFacing.WEST) {
                GlStateManager.translate(x + 1.0, y + 0.7 + (rotation * 0.1), z + 0.5);
            }
            if (facing == EnumFacing.NORTH) {
                GlStateManager.translate(x + 0.5, y + 0.7 + (rotation * 0.1), z + 1.0);
            }
            if (facing == EnumFacing.SOUTH) {
                GlStateManager.translate(x + 0.5, y + 0.7 + (rotation * 0.1), z + 0.0);
            }
            if (facing == EnumFacing.UP) {
                GlStateManager.translate(x + 0.5, y + 0.4, z + 0.5);
            }

            GlStateManager.rotate(180, 0F, 0F, 1F);
            if (facing == EnumFacing.DOWN) {
                if (rotation == 1) {
                    GlStateManager.rotate(90, 0F, 1F, 0F);
                }
                if (rotation == 2) {
                    GlStateManager.rotate(180, 0F, 1F, 0F);
                }
                if (rotation == 3) {
                    GlStateManager.rotate(270, 0F, 1F, 0F);
                }
            }
            if (facing == EnumFacing.EAST) {
                GlStateManager.rotate(90, 0F, 1F, 0F);
            }
            if (facing == EnumFacing.WEST) {
                GlStateManager.rotate(270, 0F, 1F, 0F);
            }
            if (facing == EnumFacing.NORTH) {
                //GlStateManager.rotate(270, 0F, 1F, 0F);
            }
            if (facing == EnumFacing.SOUTH) {
                GlStateManager.rotate(180, 0F, 1F, 0F);
            }
            if (facing == EnumFacing.UP) {
                if (rotation == 1) {
                    GlStateManager.rotate(90, 0F, 1F, 0F);
                }
                if (rotation == 2) {
                    GlStateManager.rotate(180, 0F, 1F, 0F);
                }
                if (rotation == 3) {
                    GlStateManager.rotate(270, 0F, 1F, 0F);
                }
            }
            GlStateManager.scale(0.175F, 0.175F, 0.175F);
            if (facing == EnumFacing.EAST || facing == EnumFacing.WEST || facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH) {
                this.herpetogaster.renderAllSide(Minecraft.getMinecraft().player.ticksExisted);
            }
            else {
                this.herpetogaster.renderAll(Minecraft.getMinecraft().player.ticksExisted);
            }
            GlStateManager.popMatrix();
            GlStateManager.disableRescaleNormal();
            GlStateManager.disableBlend();
        }
    }
}