package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockTrapWater;
import net.lepidodendron.entity.model.tile.ModelTrapWater;
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
import net.minecraftforge.client.ForgeHooksClient;
import org.lwjgl.opengl.GL11;

public class RenderTrapWater extends TileEntitySpecialRenderer<BlockTrapWater.TileEntityTrapWater> {

    private static final ResourceLocation TEXTURE_TRAP = new ResourceLocation("lepidodendron:textures/entities/trap_water.png");

    private final ModelTrapWater modelTrapWater;

    public RenderTrapWater() {
        this.modelTrapWater = new ModelTrapWater();
    }

    @Override
    public void render(BlockTrapWater.TileEntityTrapWater entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(BlockTrapWater.BlockCustom.FACING);
        }
        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
            facing = EnumFacing.NORTH;
        }
        
        double yy = 1.5D;
        this.bindTexture(TEXTURE_TRAP);
        ModelTrapWater modelTrapWater = this.modelTrapWater;
        //GlStateManager.enableRescaleNormal();
        GlStateManager.alphaFunc(516, 0.1f);
        GlStateManager.enableBlend();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translate(x + 0.5, y + yy, z + 0.5);
        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(0.05F, 0.05F, 0.05F);
        if (!(facing == EnumFacing.DOWN || facing == EnumFacing.UP)) {
            GlStateManager.rotate(facing.rotateY().rotateY().rotateY().getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        }
        modelTrapWater.renderAll(1.25f);
        //GlStateManager.disableAlpha();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableBlend();

        //Lures:
        if (entity != null && entity.hasWorld()) {
            TileEntity te = entity.getWorld().getTileEntity(entity.getPos());
            if (te != null) {
                if (te instanceof BlockTrapWater.TileEntityTrapWater) {
                    ItemStack itemstack = ItemStack.EMPTY;
                    if (!((BlockTrapWater.TileEntityTrapWater) te).getStackInSlot(0).isEmpty()) {
                        itemstack = ((BlockTrapWater.TileEntityTrapWater) te).getStackInSlot(0);
                        if (!(itemstack.isEmpty() || ((BlockTrapWater.TileEntityTrapWater) te).isEmpty())) {
                            float scale = 1.0F;
                            GlStateManager.enableRescaleNormal();
                            //GlStateManager.enableAlpha();
                            GlStateManager.alphaFunc(516, 0.1F);
                            GlStateManager.enableBlend();
                            RenderHelper.enableStandardItemLighting();
                            GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                            GlStateManager.pushMatrix();

                            GlStateManager.translate(x + 0.5, y + yy - 1.45, z + 0.5);
                            GlStateManager.rotate(90, 1, 0, 0);
                            GlStateManager.scale(scale, scale, scale);

                            IBakedModel model = Minecraft.getMinecraft().getRenderItem().getItemModelWithOverrides(itemstack, entity.getWorld(), null);
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
}