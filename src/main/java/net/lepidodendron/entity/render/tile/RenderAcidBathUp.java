package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockAcidBathUp;
import net.lepidodendron.entity.model.tile.ModelAcidBathTray;
import net.lepidodendron.entity.model.tile.ModelAcidBathTrayGrid;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
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
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.ForgeHooksClient;
import org.lwjgl.opengl.GL11;

public class RenderAcidBathUp extends TileEntitySpecialRenderer<BlockAcidBathUp.TileEntityAcidBathUp> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/blocks/acid_bath_supports.png");
    private static final ResourceLocation TEXTURE_GRID = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acid_bath_grid.png");
    private final ModelAcidBathTray modelAcidBathTray;
    private final ModelAcidBathTrayGrid modelAcidBathTrayGrid;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderAcidBathUp() {
        this.modelAcidBathTray = new ModelAcidBathTray();
        this.modelAcidBathTrayGrid = new ModelAcidBathTrayGrid();
    }

    @Override
    public void render(BlockAcidBathUp.TileEntityAcidBathUp entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        try { //to support book rendering:
            if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockAcidBathUp.block) {
                facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
            }
        }
        catch (Exception e){
            facing = EnumFacing.NORTH;
        }

        int trayheight = entity.getHeight();
        //trayheight is an integer between 0 and 120

        double trayheighter = (double)trayheight/120D;

        double yy = 1.9D - (1.2 * trayheighter);
        double d = 0.66D - 0.125D;

        this.bindTexture(TEXTURE);
        ModelAcidBathTray modelAcidBathTray = this.modelAcidBathTray;
       //GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        GlStateManager.alphaFunc(516, 0.1f);
        GlStateManager.enableBlend();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);

        GlStateManager.pushMatrix();

        if (facing == EnumFacing.NORTH) {
            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 - d);
        }
        if (facing == EnumFacing.SOUTH) {
            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 + d);
        }
        if (facing == EnumFacing.EAST) {
            GlStateManager.translate(x + 0.5 + d, y + yy, z + 0.5);
        }
        if (facing == EnumFacing.WEST) {
            GlStateManager.translate(x + 0.5 - d, y + yy, z + 0.5);
        }
        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(0.05F, 0.05F, 0.05F);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        //GlStateManager.enableAlpha();
        modelAcidBathTray.renderAll(1.25f);
        //GlStateManager.disableAlpha();


        GlStateManager.enableCull();
        GlStateManager.popMatrix();


        GlStateManager.disableRescaleNormal();
        GlStateManager.disableBlend();


        this.bindTexture(TEXTURE_GRID);
        ModelAcidBathTrayGrid modelAcidBathTrayGrid = this.modelAcidBathTrayGrid;

        GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        GlStateManager.alphaFunc(516, 0.1f);
        GlStateManager.enableBlend();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);

        GlStateManager.pushMatrix();

        if (facing == EnumFacing.NORTH) {
            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 - d);
        }
        if (facing == EnumFacing.SOUTH) {
            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 + d);
        }
        if (facing == EnumFacing.EAST) {
            GlStateManager.translate(x + 0.5 + d, y + yy, z + 0.5);
        }
        if (facing == EnumFacing.WEST) {
            GlStateManager.translate(x + 0.5 - d, y + yy, z + 0.5);
        }
        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(0.05F, 0.05F, 0.05F);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        //GlStateManager.enableAlpha();
        modelAcidBathTrayGrid.renderAll(1.25f);
        //GlStateManager.disableAlpha();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();

        GlStateManager.disableRescaleNormal();
        GlStateManager.disableBlend();

        //Render items if they are present:
        float scale = 0.6666F;
        yy = yy - 1.53F; //1.5 change to 1.55 to lower it
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        if (entity != null && entity.hasWorld()) {
            TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                if (te instanceof BlockAcidBathUp.TileEntityAcidBathUp) {
                    BlockAcidBathUp.TileEntityAcidBathUp tee = (BlockAcidBathUp.TileEntityAcidBathUp) te;
                    ItemStack itemstack = ItemStack.EMPTY;
                    if (!((BlockAcidBathUp.TileEntityAcidBathUp) te).getStackInSlot(1).isEmpty()) {
                        itemstack = tee.getStackInSlot(1);
                    }
                    else if (!((BlockAcidBathUp.TileEntityAcidBathUp) te).getStackInSlot(5).isEmpty()) {
                        itemstack = tee.getStackInSlot(5);
                    }
                    if (!(itemstack.isEmpty() || tee.isEmpty())) {
                        //GlStateManager.enableRescaleNormal();
                        //GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1f);
                        //GlStateManager.enableBlend();
                        //RenderHelper.enableStandardItemLighting();
                        //GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
                        //GlStateManager.pushMatrix();

                        GlStateManager.enableRescaleNormal();
                        //GlStateManager.enableAlpha();
                        GlStateManager.alphaFunc(516, 0.1F);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.pushMatrix();

                        double dd = 0.125D;
                        if (facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 - dd);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 + dd);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + 0.5 + dd, y + yy, z + 0.5);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + 0.5 - dd, y + yy, z + 0.5);
                        }
                        GlStateManager.rotate(45, 0, 1, 0);
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

                    itemstack = ItemStack.EMPTY;
                    if (!((BlockAcidBathUp.TileEntityAcidBathUp) te).getStackInSlot(2).isEmpty()) {
                        itemstack = tee.getStackInSlot(2);
                    }
                    else if (!((BlockAcidBathUp.TileEntityAcidBathUp) te).getStackInSlot(6).isEmpty()) {
                        itemstack = tee.getStackInSlot(6);
                    }
                    if (!(itemstack.isEmpty() || tee.isEmpty())) {
                        //GlStateManager.enableRescaleNormal();
                        //GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1f);
                        //GlStateManager.enableBlend();
                        //RenderHelper.enableStandardItemLighting();
                        //GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
                        //GlStateManager.pushMatrix();

                        GlStateManager.enableRescaleNormal();
                        //GlStateManager.enableAlpha();
                        GlStateManager.alphaFunc(516, 0.1F);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.pushMatrix();


                        double dd = 0.435D;
                        if (facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 - dd);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 + dd);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + 0.5 + dd, y + yy, z + 0.5);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + 0.5 - dd, y + yy, z + 0.5);
                        }
                        GlStateManager.rotate(45, 0, 1, 0);
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

                    itemstack = ItemStack.EMPTY;
                    if (!((BlockAcidBathUp.TileEntityAcidBathUp) te).getStackInSlot(3).isEmpty()) {
                        itemstack = tee.getStackInSlot(3);
                    }
                    else if (!((BlockAcidBathUp.TileEntityAcidBathUp) te).getStackInSlot(7).isEmpty()) {
                        itemstack = tee.getStackInSlot(7);
                    }
                    if (!(itemstack.isEmpty() || tee.isEmpty())) {
                        //GlStateManager.enableRescaleNormal();
                        //GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1f);
                        //GlStateManager.enableBlend();
                        //RenderHelper.enableStandardItemLighting();
                        //GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
                        //GlStateManager.pushMatrix();

                        GlStateManager.enableRescaleNormal();
                        //GlStateManager.enableAlpha();
                        GlStateManager.alphaFunc(516, 0.1F);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.pushMatrix();


                        double dd = 0.745D;
                        if (facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 - dd);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 + dd);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + 0.5 + dd, y + yy, z + 0.5);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + 0.5 - dd, y + yy, z + 0.5);
                        }
                        GlStateManager.rotate(45, 0, 1, 0);
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

                    itemstack = ItemStack.EMPTY;
                    if (!((BlockAcidBathUp.TileEntityAcidBathUp) te).getStackInSlot(4).isEmpty()) {
                        itemstack = tee.getStackInSlot(4);
                    }
                    else if (!((BlockAcidBathUp.TileEntityAcidBathUp) te).getStackInSlot(8).isEmpty()) {
                        itemstack = tee.getStackInSlot(8);
                    }
                    if (!(itemstack.isEmpty() || tee.isEmpty())) {
                        //GlStateManager.enableRescaleNormal();
                        //GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1f);
                        //GlStateManager.enableBlend();
                        //RenderHelper.enableStandardItemLighting();
                        //GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
                        //GlStateManager.pushMatrix();

                        GlStateManager.enableRescaleNormal();
                        //GlStateManager.enableAlpha();
                        GlStateManager.alphaFunc(516, 0.1F);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.pushMatrix();

                        double dd = 1.055D;
                        if (facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 - dd);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 + dd);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + 0.5 + dd, y + yy, z + 0.5);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + 0.5 - dd, y + yy, z + 0.5);
                        }
                        GlStateManager.rotate(45, 0, 1, 0);
                        GlStateManager.scale(scale, scale, scale);
                        //GlStateManager.rotate(90, 1, 0, 0);
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