package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockDNARecombinerRail;
import net.lepidodendron.entity.model.tile.ModelDNARecombinerCentrifugeLid;
import net.lepidodendron.entity.model.tile.ModelDNARecombinerClaw;
import net.lepidodendron.entity.model.tile.ModelDNARecombinerHatch;
import net.lepidodendron.item.ItemPhial;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.ForgeHooksClient;
import org.lwjgl.opengl.GL11;

public class RenderDNARecombinerRail extends TileEntitySpecialRenderer<BlockDNARecombinerRail.TileEntityDNARecombinerRail> {

    private static final ResourceLocation TEXTURE_CLAW = new ResourceLocation("minecraft:textures/blocks/iron_block.png");
    private static final ResourceLocation TEXTURE_HATCH = new ResourceLocation("minecraft:textures/blocks/iron_block.png");
    private static final ResourceLocation TEXTURE_CENTRIFUGE_LID = new ResourceLocation("lepidodendron:textures/entities/dna_recombiner_centrifuge_top.png");
    private final ModelDNARecombinerClaw modelDNARecombinerClaw;
    private final ModelDNARecombinerHatch modelDNARecombinerHatch;
    private final ModelDNARecombinerCentrifugeLid modelDNARecombinerCentrifugeLid;
    //public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderDNARecombinerRail() {
        this.modelDNARecombinerClaw = new ModelDNARecombinerClaw();
        this.modelDNARecombinerHatch = new ModelDNARecombinerHatch();
        this.modelDNARecombinerCentrifugeLid = new ModelDNARecombinerCentrifugeLid();
    }

    @Override
    public void render(BlockDNARecombinerRail.TileEntityDNARecombinerRail entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        //EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            //facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
        }

        //int clawheight = entity.getHeight();
        int clawheight = 0;
        //clawheight is an integer between 0 and 120

        double clawheighter = (double)clawheight/120D;
        clawheighter = 0;

        double yy = 1.9D - (1.2 * clawheighter);

        yy = 1.05D;
        double d = -1.0D;

        this.bindTexture(TEXTURE_CLAW);
        ModelDNARecombinerClaw modelDNARecombinerClaw = this.modelDNARecombinerClaw;
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        //if (facing == EnumFacing.NORTH) {
            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 - d);
        //}
        /*
        if (facing == EnumFacing.SOUTH) {
            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 + d);
        }
        if (facing == EnumFacing.EAST) {
            GlStateManager.translate(x + 0.5 + d, y + yy, z + 0.5);
        }
        if (facing == EnumFacing.WEST) {
            GlStateManager.translate(x + 0.5 - d, y + yy, z + 0.5);
        }
        */

        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(0.05F, 0.05F, 0.05F);
        //GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        GlStateManager.enableAlpha();
        modelDNARecombinerClaw.renderAll(0.50f);
        GlStateManager.disableAlpha();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();


        //Render phial if present
        float scale = 0.50F;
        yy = yy - 0.6750F; //1.5 change to 1.55 to lower it
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        if (entity != null && entity.hasWorld()) {
            TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                if (te instanceof BlockDNARecombinerRail.TileEntityDNARecombinerRail) {
                    BlockDNARecombinerRail.TileEntityDNARecombinerRail tee = (BlockDNARecombinerRail.TileEntityDNARecombinerRail) te;
                    ItemStack itemstack = ItemStack.EMPTY;
                    if (((BlockDNARecombinerRail.TileEntityDNARecombinerRail) te).getStackInSlot(0) != ItemStack.EMPTY) {
                        itemstack = tee.getStackInSlot(0);
                    }
                    itemstack = new ItemStack(ItemPhial.block, 1);
                    //if (!(itemstack.isEmpty() || tee.isEmpty())) {
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1f);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
                        GlStateManager.pushMatrix();

                        double dd = -1.0D;
                        //if (facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 - dd);
                        //}
                        /*
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 + dd);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + 0.5 + dd, y + yy, z + 0.5);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + 0.5 - dd, y + yy, z + 0.5);
                        }

                        */
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
                        //if (facing == EnumFacing.NORTH) {
                        GlStateManager.translate(x + 0.5, y + yy, z + 0.5 - dd);
                        //}
                        /*
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 + dd);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + 0.5 + dd, y + yy, z + 0.5);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + 0.5 - dd, y + yy, z + 0.5);
                        }

                        */
                        GlStateManager.rotate(45, 0, -1, 0);
                        GlStateManager.scale(scale, scale, scale);
                        model = Minecraft.getMinecraft().getRenderItem().getItemModelWithOverrides(itemstack, world, null);
                        model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.GROUND, false);
                        Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
                        Minecraft.getMinecraft().getRenderItem().renderItem(itemstack, model);

                        GlStateManager.popMatrix();
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.disableBlend();
                    //}
                }
            }
        }



        //Hatch:
        yy = 0.77D;
        d = 0;

        this.bindTexture(TEXTURE_HATCH);
        ModelDNARecombinerHatch modelDNARecombinerHatch = this.modelDNARecombinerHatch;
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        //if (facing == EnumFacing.NORTH) {
        GlStateManager.translate(x + 0.5, y + yy, z + 0.5 - d);
        //}
        /*
        if (facing == EnumFacing.SOUTH) {
            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 + d);
        }
        if (facing == EnumFacing.EAST) {
            GlStateManager.translate(x + 0.5 + d, y + yy, z + 0.5);
        }
        if (facing == EnumFacing.WEST) {
            GlStateManager.translate(x + 0.5 - d, y + yy, z + 0.5);
        }
        */

        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(0.05F, 0.05F, 0.05F);
        //GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        GlStateManager.enableAlpha();
        modelDNARecombinerHatch.renderAll(1.25f);
        GlStateManager.disableAlpha();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();

        //Centrifuge lid:
        yy = 0.5D;
        d = -1.0D;

        this.bindTexture(TEXTURE_CENTRIFUGE_LID);
        ModelDNARecombinerCentrifugeLid modelDNARecombinerCentrifugeLid = this.modelDNARecombinerCentrifugeLid;
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        //if (facing == EnumFacing.NORTH) {
        GlStateManager.translate(x + 0.5, y + yy, z + 0.5 - d);
        //}
        /*
        if (facing == EnumFacing.SOUTH) {
            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 + d);
        }
        if (facing == EnumFacing.EAST) {
            GlStateManager.translate(x + 0.5 + d, y + yy, z + 0.5);
        }
        if (facing == EnumFacing.WEST) {
            GlStateManager.translate(x + 0.5 - d, y + yy, z + 0.5);
        }
        */

        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(0.05F, 0.05F, 0.05F);
        //GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        GlStateManager.enableAlpha();
        modelDNARecombinerCentrifugeLid.renderAll(1.25f);
        GlStateManager.disableAlpha();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();

    }
}