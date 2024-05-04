package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockFossil;
import net.lepidodendron.block.BlockTimeResearcherFinderBottom;
import net.lepidodendron.entity.model.tile.ModelTimeResearcherFinderPlate;
import net.minecraft.block.Block;
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
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.ForgeHooksClient;
import org.lwjgl.opengl.GL11;

public class RenderTimeResearcherFinderBottom extends TileEntitySpecialRenderer<BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/time_researcher_finder_plate.png");
    private final ModelTimeResearcherFinderPlate modelTimeResearcherFinderPlate;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderTimeResearcherFinderBottom() {
        this.modelTimeResearcherFinderPlate = new ModelTimeResearcherFinderPlate();
    }

    @Override
    public void render(BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
//        EnumFacing facing = EnumFacing.NORTH;
//        if (entity != null && entity.hasWorld()) {
//            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
//        }

        int trayheight = entity.getHeight();
        //trayheight is an integer between 0 and 120

        double trayheighter = (double)trayheight/120D;

        double yy = 1.55D + (1.1 * trayheighter);

        this.bindTexture(TEXTURE);
        ModelTimeResearcherFinderPlate modelTimeResearcherFinderPlate = this.modelTimeResearcherFinderPlate;
        GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        GlStateManager.alphaFunc(516, 0.1f);
        GlStateManager.enableBlend();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);

        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5, y + yy, z + 0.5);
        GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
        GlStateManager.scale(0.05F, 0.05F, 0.05F);
        GlStateManager.rotate(270, 0.0F, 1.0F, 0.0F);
        modelTimeResearcherFinderPlate.renderAll(1.25f);
        GlStateManager.enableCull();
        GlStateManager.popMatrix();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableBlend();

        //Render laser beams if present:
        if (entity.renderZap) {

            GL11.glPushMatrix();
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glBegin(GL11.GL_TRIANGLES);
            GL11.glColor3ub((byte) 77, (byte) 182, (byte) 251);

            float width = 0.03F;
            float offsetter = 0.3F;

            //LASER 1:
            //face1:
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter - width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);

            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter - width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter + width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);

            //face2:
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);

            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter + width/2);

            //face3:
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter - width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);

            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter - width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);

            //face4:
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter + width/2);

            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter + width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter + width/2);

            //LASER 2:
            offsetter = -0.3F;
            //face1:
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter - width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);

            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter - width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter + width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);

            //face2:
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);

            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter + width/2);

            //face3:
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter - width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);

            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter - width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);

            //face4:
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter + width/2);

            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter + width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.85F, (float) z + 0.5F + offsetter + width/2);

            //LASER 3:
            offsetter = -0.35F;
            //face1:
            GL11.glVertex3f((float) x + 0.5F + offsetter + width/2, (float) y + 1.85F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);

            GL11.glVertex3f((float) x + 0.5F + offsetter + width/2, (float) y + 1.85F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F + offsetter + width/2, (float) y + 1.85F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);

            //face2:
            GL11.glVertex3f((float) x + 0.5F + offsetter - width/2, (float) y + 1.85F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);

            GL11.glVertex3f((float) x + 0.5F + offsetter - width/2, (float) y + 1.85F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + offsetter - width/2, (float) y + 1.85F, (float) z + 0.5F + width/2);

            //face3:
            GL11.glVertex3f((float) x + 0.5F + offsetter + width/2, (float) y + 1.85F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);

            GL11.glVertex3f((float) x + 0.5F + offsetter - width/2, (float) y + 1.85F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F + offsetter + width/2, (float) y + 1.85F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);

            //face4:
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + offsetter + width/2, (float) y + 1.85F, (float) z + 0.5F + width/2);

            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + offsetter + width/2, (float) y + 1.85F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + offsetter - width/2, (float) y + 1.85F, (float) z + 0.5F + width/2);

            //LASER 4:
            offsetter = 0.35F;
            //face1:
            GL11.glVertex3f((float) x + 0.5F + offsetter + width/2, (float) y + 1.85F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);

            GL11.glVertex3f((float) x + 0.5F + offsetter + width/2, (float) y + 1.85F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F + offsetter + width/2, (float) y + 1.85F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);

            //face2:
            GL11.glVertex3f((float) x + 0.5F + offsetter - width/2, (float) y + 1.85F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);

            GL11.glVertex3f((float) x + 0.5F + offsetter - width/2, (float) y + 1.85F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + offsetter - width/2, (float) y + 1.85F, (float) z + 0.5F + width/2);

            //face3:
            GL11.glVertex3f((float) x + 0.5F + offsetter + width/2, (float) y + 1.85F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);

            GL11.glVertex3f((float) x + 0.5F + offsetter - width/2, (float) y + 1.85F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F + offsetter + width/2, (float) y + 1.85F, (float) z + 0.5F - width/2);
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F - width/2);

            //face4:
            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + offsetter + width/2, (float) y + 1.85F, (float) z + 0.5F + width/2);

            GL11.glVertex3f((float) x + 0.5F - width/2, (float) y + 1.1F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + offsetter + width/2, (float) y + 1.85F, (float) z + 0.5F + width/2);
            GL11.glVertex3f((float) x + 0.5F + offsetter - width/2, (float) y + 1.85F, (float) z + 0.5F + width/2);

            GL11.glEnd();
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            GL11.glPopMatrix();
            
        }

        //Render item if present:
        float scale = 0.95F;
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        if (entity != null && entity.hasWorld()) {
            TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                if (te instanceof BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) {
                    BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom tee = (BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) te;
                    ItemStack itemstack = ItemStack.EMPTY;
                    if (!((BlockTimeResearcherFinderBottom.TileEntityTimeResearcherFinderBottom) te).getStackInSlot(1).isEmpty()) {
                        itemstack = tee.getStackInSlot(1);
                    }
                    if (!(itemstack.isEmpty() || tee.isEmpty())) {
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.alphaFunc(516, 0.1F);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        GlStateManager.pushMatrix();
                        if (Block.getBlockFromItem(itemstack.getItem()) instanceof BlockFossil) {
                            GlStateManager.translate(x + 0.5, y + yy - 1.05, z + 0.5);
                            GlStateManager.rotate(45, 0, 1, 0);
                        }
                        else {
                            scale = 0.4F;
                            GlStateManager.translate(x + 0.5, y + yy - 1.0, z + 0.5);
                            GlStateManager.rotate(90, 1, 0, 0);
                        }
                        GlStateManager.scale(scale, scale, scale);

                        IBakedModel model = Minecraft.getMinecraft().getRenderItem().getItemModelWithOverrides(itemstack, world, null);
                        model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.GROUND, false);
                        Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
                        Minecraft.getMinecraft().getRenderItem().renderItem(itemstack, model);

                        GlStateManager.popMatrix();
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.disableBlend();
                    }

                }
            }
        }
    }
}