package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockDNARecombinerForge;
import net.lepidodendron.entity.model.tile.*;
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

public class RenderDNAForge extends TileEntitySpecialRenderer<BlockDNARecombinerForge.TileEntityDNARecombinerForge> {

    private static final ResourceLocation TEXTURE_OLIGO_FULL = new ResourceLocation("lepidodendron:textures/blocks/dna_recombiner_forge_oligopool_full.png");
    private static final ResourceLocation TEXTURE_OLIGO_EMPTY = new ResourceLocation("lepidodendron:textures/blocks/dna_recombiner_forge_oligopool_empty.png");

    private final ModelDNARecombinerForgeOligopool modelDNARecombinerForgeOligopool;

    public RenderDNAForge() {
        this.modelDNARecombinerForgeOligopool = new ModelDNARecombinerForgeOligopool();
    }

    @Override
    public void render(BlockDNARecombinerForge.TileEntityDNARecombinerForge entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(BlockDNARecombinerForge.BlockCustom.FACING);
        }

        //Render phial if present
        float scale = 0.50F;
        double yy = -0.8650000119209298 + 1;
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        if (entity != null && entity.hasWorld()) {
            TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                if (te instanceof BlockDNARecombinerForge.TileEntityDNARecombinerForge) {
                    BlockDNARecombinerForge.TileEntityDNARecombinerForge tee = (BlockDNARecombinerForge.TileEntityDNARecombinerForge) te;
                    ItemStack itemstack = ItemStack.EMPTY;
                    if (((BlockDNARecombinerForge.TileEntityDNARecombinerForge) te).getStackInSlot(0) != ItemStack.EMPTY) {
                        itemstack = tee.getStackInSlot(0);
                    }

                    //Render Phial of DNA for usage:
                    if (itemstack != ItemStack.EMPTY) {
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1f);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
                        GlStateManager.pushMatrix();
                        GlStateManager.translate(x + 0.5, y + yy, z + 0.5);
                        GlStateManager.rotate(45, 0, 1, 0);
                        GlStateManager.scale(scale, scale, scale);
                        IBakedModel model = Minecraft.getMinecraft().getRenderItem().getItemModelWithOverrides(itemstack, world, null);
                        model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.GROUND, false);
                        Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
                        Minecraft.getMinecraft().getRenderItem().renderItem(itemstack, model);
                        GlStateManager.popMatrix();
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.disableBlend();

                        //and again at 90 degrees:
                        //--------------------------
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1f);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
                        GlStateManager.pushMatrix();
                        GlStateManager.translate(x + 0.5, y + yy, z + 0.5);
                        GlStateManager.rotate(45, 0, -1, 0);
                        GlStateManager.scale(scale, scale, scale);
                        model = Minecraft.getMinecraft().getRenderItem().getItemModelWithOverrides(itemstack, world, null);
                        model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.GROUND, false);
                        Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
                        Minecraft.getMinecraft().getRenderItem().renderItem(itemstack, model);
                        GlStateManager.popMatrix();
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.disableBlend();
                    }

                    //Render Oligopool clamp:
                    itemstack = ItemStack.EMPTY;
                    float scalePool = 1.00F;
                    yy = -0.8650000119209298 + 1.3;
                    if (((BlockDNARecombinerForge.TileEntityDNARecombinerForge) te).getStackInSlot(2) != ItemStack.EMPTY) {
                        itemstack = tee.getStackInSlot(2);
                    }
                    if (itemstack != ItemStack.EMPTY) {
                        this.bindTexture(TEXTURE_OLIGO_FULL);
                    }
                    else {
                        this.bindTexture(TEXTURE_OLIGO_EMPTY);
                    }

                    yy = 1.5D;
                    ModelDNARecombinerForgeOligopool modelDNARecombinerForgeOligopool = this.modelDNARecombinerForgeOligopool;
                    GlStateManager.pushMatrix();
                    //GlStateManager.disableCull();
                    GlStateManager.enableRescaleNormal();
                    double dd = 0.35;
                    GlStateManager.translate(x + 0.5, y + yy, z + 0.5);
                    GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (!(facing == EnumFacing.DOWN || facing == EnumFacing.UP)) {
                        GlStateManager.rotate(facing.rotateY().getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
                    }
                    GlStateManager.enableAlpha();
                    modelDNARecombinerForgeOligopool.renderAll(1.25f);
                    GlStateManager.disableAlpha();
                    //GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                }
            }
        }
    }
}