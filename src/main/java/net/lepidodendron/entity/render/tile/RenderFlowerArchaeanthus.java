package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockArchaeanthusFlower;
import net.lepidodendron.entity.model.tile.ModelFlowerArchaeanthus;
import net.lepidodendron.entity.model.tile.ModelFlowerArchaeanthusVar;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderFlowerArchaeanthus extends TileEntitySpecialRenderer<BlockArchaeanthusFlower.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/flower_archaeanthus.png");
    private final ModelFlowerArchaeanthus modelFlowerArchaeanthus;
    private final ModelFlowerArchaeanthusVar modelFlowerArchaeanthusVar;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderFlowerArchaeanthus() {
        this.modelFlowerArchaeanthus = new ModelFlowerArchaeanthus();
        this.modelFlowerArchaeanthusVar = new ModelFlowerArchaeanthusVar();
    }

    @Override
    public void render(BlockArchaeanthusFlower.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.DOWN;
        try { //to support book rendering:
            if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockArchaeanthusFlower.block) {
                facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
            }
        }
        catch (Exception e){
            facing = EnumFacing.NORTH;
        }
        this.bindTexture(TEXTURE);
        boolean var = false; //variant checker
        if ((double)(((double)entity.getPos().getX() + (double)entity.getPos().getY() + (double)entity.getPos().getZ()) / 2D)
            == Math.round((((double)entity.getPos().getX() + (double)entity.getPos().getY() + (double)entity.getPos().getZ()) / 2D))) {
            var = true;
        }

        if (!var) {
            ModelFlowerArchaeanthus modelFlowerArchaeanthus = this.modelFlowerArchaeanthus;
        }
        else {
            ModelFlowerArchaeanthusVar modelFlowerArchaeanthusVar = this.modelFlowerArchaeanthusVar;
        }
        double scale = 0.05D;
        GlStateManager.enableRescaleNormal();
        GlStateManager.alphaFunc(516, 0.1f);
        GlStateManager.enableBlend();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
        GlStateManager.pushMatrix();
        if (facing == EnumFacing.UP) {
            GlStateManager.translate(x + 0.5, y + 1.2, z + 0.5);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.DOWN) {
            GlStateManager.translate(x + 0.5, y -0.2, z + 0.5);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.NORTH) {
            GlStateManager.translate(x + 0.5, y + 0.5, z - 0.2);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(90, 1F, 0F, 0F);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.EAST) {
            GlStateManager.translate(x + 1.2, y + 0.5, z + 0.5);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(270, 0F, 0F, 1F);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.SOUTH) {
            GlStateManager.translate(x + 0.5, y + 0.2, z + 1.2);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(270, 1F, 0F, 0F);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.WEST) {
            GlStateManager.translate(x - 0.2, y + 0.5, z + 0.5);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(90, 0F, 0F, 1F);
            GlStateManager.scale(scale, scale, scale);
        }
        if (!var) {
            modelFlowerArchaeanthus.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        }
        else {
            modelFlowerArchaeanthusVar.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        }
        GlStateManager.popMatrix();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableBlend();
    }
}