package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockTaxidermyTable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.ForgeHooksClient;

public class RenderTaxidermyTable extends TileEntitySpecialRenderer<BlockTaxidermyTable.TileEntityTaxidermyTable> {

    @Override
    public void render(BlockTaxidermyTable.TileEntityTaxidermyTable entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(BlockTaxidermyTable.BlockCustom.FACING);
        }

        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        boolean hasResult = false;
        //Render finished taxidermy kit if present
        float scale = 2.75F;
        float yy = 0.65F;
        if (entity != null && entity.hasWorld()) {
            TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                if (te instanceof BlockTaxidermyTable.TileEntityTaxidermyTable) {
                    BlockTaxidermyTable.TileEntityTaxidermyTable tee = (BlockTaxidermyTable.TileEntityTaxidermyTable) te;
                    ItemStack itemstack = ItemStack.EMPTY;
                    if (!((BlockTaxidermyTable.TileEntityTaxidermyTable) te).getStackInSlot(1).isEmpty()) {
                        itemstack = tee.getStackInSlot(1);
                    }
                    if (!(itemstack.isEmpty() || tee.isEmpty())) {

                        GlStateManager.enableRescaleNormal();
                        //GlStateManager.enableAlpha();
                        GlStateManager.alphaFunc(516, 0.1F);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.pushMatrix();

                        //double dd = -0.10D;
                        GlStateManager.translate(x + 0.5, y + yy, z + 0.5);
                        if (facing == EnumFacing.NORTH) {
                            GlStateManager.rotate(180F + ((BlockTaxidermyTable.TileEntityTaxidermyTable) te).getTaxidermyAngle(), 0, 1, 0);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.rotate(((BlockTaxidermyTable.TileEntityTaxidermyTable) te).getTaxidermyAngle(), 0, 1, 0);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.rotate(90F + ((BlockTaxidermyTable.TileEntityTaxidermyTable) te).getTaxidermyAngle(), 0, 1, 0);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.rotate(270F + ((BlockTaxidermyTable.TileEntityTaxidermyTable) te).getTaxidermyAngle(), 0, 1, 0);
                        }
                        GlStateManager.scale(scale, scale, scale);

                        IBakedModel model = Minecraft.getMinecraft().getRenderItem().getItemModelWithOverrides(itemstack, world, null);
                        model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.GROUND, false);
                        Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
                        Minecraft.getMinecraft().getRenderItem().renderItem(itemstack, model);

                        GlStateManager.popMatrix();
                        GlStateManager.disableRescaleNormal();
                        //GlStateManager.disableAlpha();
                        GlStateManager.disableBlend();
                        hasResult = true;
                    }
                }
            }
        }

        //Render meat if present
        scale = 0.40F;
        yy = 0.82F;
        if (entity != null && entity.hasWorld() && !hasResult) {
            TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                if (te instanceof BlockTaxidermyTable.TileEntityTaxidermyTable) {
                    BlockTaxidermyTable.TileEntityTaxidermyTable tee = (BlockTaxidermyTable.TileEntityTaxidermyTable) te;
                    ItemStack itemstack = ItemStack.EMPTY;
                    if (!((BlockTaxidermyTable.TileEntityTaxidermyTable) te).getStackInSlot(0).isEmpty()) {
                        itemstack = tee.getStackInSlot(0);
                    }
                    if (!(itemstack.isEmpty() || tee.isEmpty())) {

                        GlStateManager.enableRescaleNormal();
                        //GlStateManager.enableAlpha();
                        GlStateManager.alphaFunc(516, 0.1F);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.pushMatrix();

                        //double dd = -0.10D;
                        GlStateManager.translate(x + 0.5, y + yy, z + 0.5);
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.rotate(180, 0, 1, 0);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.rotate(90, 0, 1, 0);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.rotate(270, 0, 1, 0);
                        }
                        GlStateManager.rotate(90, 1, 0, 0);
                        GlStateManager.scale(scale, scale, scale);

                        IBakedModel model = Minecraft.getMinecraft().getRenderItem().getItemModelWithOverrides(itemstack, world, null);
                        model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.GROUND, false);
                        Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
                        Minecraft.getMinecraft().getRenderItem().renderItem(itemstack, model);

                        GlStateManager.popMatrix();
                        GlStateManager.disableRescaleNormal();
                        //GlStateManager.disableAlpha();
                        GlStateManager.disableBlend();
                    }
                }
            }
        }

        //Render stuffing if present
        if (entity != null && entity.hasWorld()) {
            TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                if (te instanceof BlockTaxidermyTable.TileEntityTaxidermyTable) {
                    BlockTaxidermyTable.TileEntityTaxidermyTable tee = (BlockTaxidermyTable.TileEntityTaxidermyTable) te;
                    ItemStack itemstack = ItemStack.EMPTY;
                    if (!((BlockTaxidermyTable.TileEntityTaxidermyTable) te).getStackInSlot(3).isEmpty()) {
                        itemstack = tee.getStackInSlot(3);
                    }
                    if (!(itemstack.isEmpty() || tee.isEmpty())) {

                        GlStateManager.enableRescaleNormal();
                        //GlStateManager.enableAlpha();
                        GlStateManager.alphaFunc(516, 0.1F);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.pushMatrix();

                        IBakedModel model = Minecraft.getMinecraft().getRenderItem().getItemModelWithOverrides(itemstack, world, null);
                        if (model.isGui3d()) {
                            scale = 1.50F;
                            yy = 0.23F;
                        }
                        else {
                            scale = 0.75F;
                            yy = 0.33F;
                        }

                        //double dd = -0.10D;
                        GlStateManager.translate(x + 0.5, y + yy, z + 0.5);
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.rotate(180, 0, 1, 0);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.rotate(90, 0, 1, 0);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.rotate(270, 0, 1, 0);
                        }

                        if (!model.isGui3d()) {
                            GlStateManager.rotate(90, 1, 0, 0);
                        }

                        GlStateManager.scale(scale, scale, scale);
                        model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.GROUND, false);
                        Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
                        Minecraft.getMinecraft().getRenderItem().renderItem(itemstack, model);
                        GlStateManager.popMatrix();
                        GlStateManager.disableRescaleNormal();
                        //GlStateManager.disableAlpha();
                        GlStateManager.disableBlend();
                    }
                }
            }
        }
    }
}