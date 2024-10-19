package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockCalycanthusFlower;
import net.lepidodendron.entity.model.tile.ModelFlowerCalycanthus;
import net.lepidodendron.entity.model.tile.ModelFlowerCalycanthusVar;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class RenderFlowerCalycanthus extends TileEntitySpecialRenderer<BlockCalycanthusFlower.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/flower_calycanthus.png");
    private final ModelFlowerCalycanthus modelFlowerCalycanthus;
    private final ModelFlowerCalycanthusVar modelFlowerCalycanthusVar;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderFlowerCalycanthus() {
        this.modelFlowerCalycanthus = new ModelFlowerCalycanthus();
        this.modelFlowerCalycanthusVar = new ModelFlowerCalycanthusVar();
    }

    @Override
    public void render(BlockCalycanthusFlower.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.UP;
        try { //to support book rendering:
            if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockCalycanthusFlower.block) {
                facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
            }
        }
        catch (Exception e){
            facing = EnumFacing.NORTH;
        }

        long i = MathHelper.getCoordinateRandom(entity.getPos().getX(), entity.getPos().getY(), entity.getPos().getZ());
        Vec3d offsetXZ = new Vec3d(((double)((float)(i >> 16 & 15L) / 15.0F) - 0.5D) * 0.5D, 0.0D, ((double)((float)(i >> 24 & 15L) / 15.0F) - 0.5D) * 0.5D);
        double offsetX = offsetXZ.x;
        double offsetZ = offsetXZ.z;

        this.bindTexture(TEXTURE);
        boolean var = false; //variant checker
        if ((double)(((double)entity.getPos().getX() + (double)entity.getPos().getY() + (double)entity.getPos().getZ()) / 2D)
                == Math.round((((double)entity.getPos().getX() + (double)entity.getPos().getY() + (double)entity.getPos().getZ()) / 2D))) {
            var = true;
        }

        if (!var) {
            ModelFlowerCalycanthus modelFlowerCalycanthus = this.modelFlowerCalycanthus;
        }
        else {
            ModelFlowerCalycanthusVar modelFlowerCalycanthusVar = this.modelFlowerCalycanthusVar;
        }

        double scale = 0.05D;
        GlStateManager.enableRescaleNormal();
        GlStateManager.alphaFunc(516, 0.1f);
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
        GlStateManager.pushMatrix();
        if (facing == EnumFacing.UP) {
            GlStateManager.translate(x + 0.5 + offsetX, y + 1.205, z + 0.5 + offsetZ);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.DOWN) {
            GlStateManager.translate(x + 0.5 + 0.5 + offsetX, y -0.195, z + 0.5 + offsetZ);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.NORTH) {
            GlStateManager.translate(x + 0.5 + offsetX, y + 0.5 + offsetZ, z - 0.195);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(90, 1F, 0F, 0F);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.EAST) {
            GlStateManager.translate(x + 1.205, y + 0.5 + offsetZ, z + 0.5 + offsetX);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(270, 0F, 0F, 1F);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.SOUTH) {
            GlStateManager.translate(x + 0.5 + offsetX, y + 0.2 + offsetZ, z + 1.205);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(270, 1F, 0F, 0F);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.WEST) {
            GlStateManager.translate(x - 0.195, y + 0.5 + offsetZ, z + 0.5 + offsetX);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(90, 0F, 0F, 1F);
            GlStateManager.scale(scale, scale, scale);
        }
        if (!var) {
            modelFlowerCalycanthus.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        }
        else {
            modelFlowerCalycanthusVar.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        }

        GlStateManager.popMatrix();
        GlStateManager.enableCull();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableBlend();
    }
}