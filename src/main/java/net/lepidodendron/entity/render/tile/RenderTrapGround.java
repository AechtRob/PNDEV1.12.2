package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockTrapGround;
import net.lepidodendron.entity.model.tile.ModelTrapGround;
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

public class RenderTrapGround extends TileEntitySpecialRenderer<BlockTrapGround.TileEntityTrapGround> {

    private static final ResourceLocation TEXTURE_TRAP_OPEN = new ResourceLocation("lepidodendron:textures/entities/trap_ground_open.png");
    private static final ResourceLocation TEXTURE_TRAP_CLOSED = new ResourceLocation("lepidodendron:textures/entities/trap_ground_closed.png");

    private final ModelTrapGround modelTrapGround;

    public RenderTrapGround() {
        this.modelTrapGround = new ModelTrapGround();
    }

    @Override
    public void render(BlockTrapGround.TileEntityTrapGround entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(BlockTrapGround.BlockCustom.FACING);
        }
        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
            facing = EnumFacing.NORTH;
        }
        
        double yy = 1.5D;
        if (BlockTrapGround.BlockCustom.hasTrapped(entity.getWorld(), entity.getPos())) {
            this.bindTexture(TEXTURE_TRAP_CLOSED);
        }
        else {
            this.bindTexture(TEXTURE_TRAP_OPEN);
        }
        ModelTrapGround modelTrapGround = this.modelTrapGround;
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
        modelTrapGround.renderAll(1.25f);
        //GlStateManager.disableAlpha();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableBlend();

        //Lures:
        if (entity != null && entity.hasWorld()) {
            TileEntity te = entity.getWorld().getTileEntity(entity.getPos());
            if (te != null) {
                if (te instanceof BlockTrapGround.TileEntityTrapGround) {
                    ItemStack itemstack = ItemStack.EMPTY;
                    if (!((BlockTrapGround.TileEntityTrapGround) te).getStackInSlot(0).isEmpty()) {
                        itemstack = ((BlockTrapGround.TileEntityTrapGround) te).getStackInSlot(0);
                        if (!(itemstack.isEmpty() || ((BlockTrapGround.TileEntityTrapGround) te).isEmpty())) {
                            float scale = 1.0F;
                            GlStateManager.enableRescaleNormal();
                            //GlStateManager.enableAlpha();
                            GlStateManager.alphaFunc(516, 0.1F);
                            GlStateManager.enableBlend();
                            RenderHelper.enableStandardItemLighting();
                            GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                            GlStateManager.pushMatrix();

                            GlStateManager.translate(x + 0.5, y + yy - 1.42, z + 0.5);
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