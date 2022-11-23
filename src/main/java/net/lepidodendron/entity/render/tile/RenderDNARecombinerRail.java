package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockDNARecombinerRail;
import net.lepidodendron.entity.model.tile.ModelDNARecombinerClaw;
import net.lepidodendron.entity.model.tile.ModelDNARecombinerHatch;
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

public class RenderDNARecombinerRail extends TileEntitySpecialRenderer<BlockDNARecombinerRail.TileEntityDNARecombinerRail> {

    private static final ResourceLocation TEXTURE_CLAW = new ResourceLocation("lepidodendron:textures/blocks/dna_claw.png");
    private static final ResourceLocation TEXTURE_HATCH = new ResourceLocation("lepidodendron:textures/blocks/dna_forge_hatch.png");
    private final ModelDNARecombinerClaw modelDNARecombinerClaw;
    private final ModelDNARecombinerHatch modelDNARecombinerHatch;

    public RenderDNARecombinerRail() {
        this.modelDNARecombinerClaw = new ModelDNARecombinerClaw();
        this.modelDNARecombinerHatch = new ModelDNARecombinerHatch();
    }

    @Override
    public void render(BlockDNARecombinerRail.TileEntityDNARecombinerRail entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(BlockDNARecombinerRail.BlockCustom.FACING);
        }

        double clawheight = entity.getClawVert();

        double yy = 1.05D + clawheight;
        double d = -1.0D;
        d = -1.0D + entity.getClawHoriz();

        this.bindTexture(TEXTURE_CLAW);
        ModelDNARecombinerClaw modelDNARecombinerClaw = this.modelDNARecombinerClaw;
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        if (facing == EnumFacing.EAST) {
            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 - d);
        }
        if (facing == EnumFacing.WEST) {
            GlStateManager.translate(x + 0.5, y + yy, z + 0.5 + d);
        }
        if (facing == EnumFacing.SOUTH) {
            GlStateManager.translate(x + 0.5 + d, y + yy, z + 0.5);
        }
        if (facing == EnumFacing.NORTH) {
            GlStateManager.translate(x + 0.5 - d, y + yy, z + 0.5);
        }
        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(0.05F, 0.05F, 0.05F);
        //GlStateManager.enableAlpha();
        modelDNARecombinerClaw.finger1.rotateAngleX = -0.3927F - (float)Math.toRadians(entity.getClawAngle());
        modelDNARecombinerClaw.finger2.rotateAngleX = -0.3927F - (float)Math.toRadians(entity.getClawAngle());
        modelDNARecombinerClaw.finger3.rotateAngleX = -0.3927F - (float)Math.toRadians(entity.getClawAngle());
        modelDNARecombinerClaw.finger1_b.rotateAngleX = 0.6981F - ((float)Math.toRadians(entity.getClawAngle()) * 0.5F);
        modelDNARecombinerClaw.finger1_b2.rotateAngleX = 0.6981F - ((float)Math.toRadians(entity.getClawAngle()) * 0.5F);
        modelDNARecombinerClaw.finger1_b3.rotateAngleX = 0.6981F - ((float)Math.toRadians(entity.getClawAngle()) * 0.5F);
        modelDNARecombinerClaw.renderAll(0.50f);
        //GlStateManager.disableAlpha();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();

        //Render the cable:
        double doubleX = x + 0.5;
        double doubleY = y + yy;
        double doubleZ = z + 0.5;

        if (facing == EnumFacing.EAST) {
            doubleZ = z + 0.5 - d;
        }
        if (facing == EnumFacing.WEST) {
            doubleZ = z + 0.5 + d;
        }
        if (facing == EnumFacing.SOUTH) {
            doubleX = x + 0.5 + d;
        }
        if (facing == EnumFacing.NORTH) {
            doubleX = x + 0.5 - d;
        }
        GL11.glPushMatrix();
        GL11.glColor3ub((byte)255,(byte)255,(byte)255);
        GL11.glLineWidth(5);
        GL11.glBegin(GL11.GL_LINES);
        GL11.glVertex3f((float)doubleX, (float)y + 1.05F - 0.22F,(float)doubleZ);
        GL11.glVertex3f((float)doubleX, (float)doubleY - 0.3F,(float)doubleZ);
        GL11.glEnd();
        GL11.glPopMatrix();

        //Render phial if present
        float scale = 0.50F;
        yy = 1.05D - 0.6750F + clawheight; //1.5 change to 1.55 to lower it
        //System.err.println("yy " + yy);
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        if (entity != null && entity.hasWorld()) {
            TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                if (te instanceof BlockDNARecombinerRail.TileEntityDNARecombinerRail) {
                    BlockDNARecombinerRail.TileEntityDNARecombinerRail tee = (BlockDNARecombinerRail.TileEntityDNARecombinerRail) te;
                    ItemStack itemstack = ItemStack.EMPTY;
                    if (!((BlockDNARecombinerRail.TileEntityDNARecombinerRail) te).getStackInSlot(0).isEmpty()) {
                        itemstack = tee.getStackInSlot(0);
                    }

                    GlStateManager.enableRescaleNormal();
                    GlStateManager.alphaFunc(516, 0.1f);
                    GlStateManager.enableBlend();
                    RenderHelper.enableStandardItemLighting();
                    GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
                    GlStateManager.pushMatrix();

                    double dd = -1.0D;
                    dd = -1.0D + entity.getClawHoriz();
                    if (facing == EnumFacing.EAST) {
                        GlStateManager.translate(x + 0.5, y + yy, z + 0.5 - dd);
                    }
                    if (facing == EnumFacing.WEST) {
                        GlStateManager.translate(x + 0.5, y + yy, z + 0.5 + dd);
                    }
                    if (facing == EnumFacing.SOUTH) {
                        GlStateManager.translate(x + 0.5 + dd, y + yy, z + 0.5);
                    }
                    if (facing == EnumFacing.NORTH) {
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
                    GlStateManager.disableBlend();

                    //and again at 90 degrees:
                    //--------------------------
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.alphaFunc(516, 0.1f);
                    GlStateManager.enableBlend();
                    RenderHelper.enableStandardItemLighting();
                    GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
                    GlStateManager.pushMatrix();

                    if (facing == EnumFacing.EAST) {
                        GlStateManager.translate(x + 0.5, y + yy, z + 0.5 - dd);
                    }
                    if (facing == EnumFacing.WEST) {
                        GlStateManager.translate(x + 0.5, y + yy, z + 0.5 + dd);
                    }
                    if (facing == EnumFacing.SOUTH) {
                        GlStateManager.translate(x + 0.5 + dd, y + yy, z + 0.5);
                    }
                    if (facing == EnumFacing.NORTH) {
                        GlStateManager.translate(x + 0.5 - dd, y + yy, z + 0.5);
                    }
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
            }
        }


        //Hatch:
        yy = 0.77D;
        this.bindTexture(TEXTURE_HATCH);
        ModelDNARecombinerHatch modelDNARecombinerHatch = this.modelDNARecombinerHatch;
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translate(x + 0.5, y + yy, z + 0.5);
        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(0.05F, 0.05F, 0.05F);
        //GlStateManager.enableAlpha();

        modelDNARecombinerHatch.left.offsetZ = -3.5F * (float) entity.getHatchVal();
        modelDNARecombinerHatch.right.offsetZ = 3.5F * (float) entity.getHatchVal();
        modelDNARecombinerHatch.renderAll(1.25f);
        //GlStateManager.disableAlpha();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();

    }
}