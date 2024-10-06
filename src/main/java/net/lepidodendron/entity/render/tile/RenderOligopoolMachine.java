package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockOligopoolMachine;
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

public class RenderOligopoolMachine extends TileEntitySpecialRenderer<BlockOligopoolMachine.TileEntityOligopoolMachine> {
    
    @Override
    public void render(BlockOligopoolMachine.TileEntityOligopoolMachine entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockOligopoolMachine.block) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(BlockOligopoolMachine.BlockCustom.FACING);
        }

        //Render oligopools if present
        float scale = 0.6666F;
        double yy = 0.5F;
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        if (entity != null && entity.hasWorld()) {
            TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                if (te instanceof BlockOligopoolMachine.TileEntityOligopoolMachine) {
                    BlockOligopoolMachine.TileEntityOligopoolMachine tee = (BlockOligopoolMachine.TileEntityOligopoolMachine) te;
                    ItemStack itemstack = ItemStack.EMPTY;
                    if (!((BlockOligopoolMachine.TileEntityOligopoolMachine) te).getStackInSlot(1).isEmpty()) {
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

                        double dd = 0.38D;
                        if (facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 - dd);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 + dd);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + 0.5 + dd, y + yy, z + 0.5);
                            GlStateManager.rotate(90, 0, 1, 0);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + 0.5 - dd, y + yy, z + 0.5);
                            GlStateManager.rotate(90, 0, 1, 0);
                        }
                        //GlStateManager.rotate(45, 0, 1, 0);
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
    }
}