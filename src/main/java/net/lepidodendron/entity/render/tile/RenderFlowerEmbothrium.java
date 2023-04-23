package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockEmbothriumFlower;
import net.lepidodendron.entity.model.tile.ModelFlowerEmbothrium;
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

public class RenderFlowerEmbothrium extends TileEntitySpecialRenderer<BlockEmbothriumFlower.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/flower_embothrium.png");
    private final ModelFlowerEmbothrium modelFlowerEmbothrium;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderFlowerEmbothrium() {
        this.modelFlowerEmbothrium = new ModelFlowerEmbothrium();
    }

    @Override
    public void render(BlockEmbothriumFlower.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.UP;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
        }

        long i = MathHelper.getCoordinateRandom(entity.getPos().getX(), entity.getPos().getY(), entity.getPos().getZ());
        Vec3d offsetXZ = new Vec3d(((double)((float)(i >> 16 & 15L) / 15.0F) - 0.5D) * 0.5D, 0.0D, ((double)((float)(i >> 24 & 15L) / 15.0F) - 0.5D) * 0.5D);
        double offsetX = offsetXZ.x;
        double offsetZ = offsetXZ.z;

        this.bindTexture(TEXTURE);

        ModelFlowerEmbothrium modelFlowerEmbothrium = this.modelFlowerEmbothrium;

        double scale = 0.05D;
        GlStateManager.enableRescaleNormal();
        GlStateManager.alphaFunc(516, 0.1f);
        GlStateManager.enableBlend();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
        GlStateManager.pushMatrix();
        if (facing == EnumFacing.UP) {
            GlStateManager.translate(x + 0.5 + offsetX, y + 1.2, z + 0.5 + offsetZ);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.DOWN) {
            GlStateManager.translate(x + 0.5 + 0.5 + offsetX, y -0.2, z + 0.5 + offsetZ);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.NORTH) {
            GlStateManager.translate(x + 0.5 + offsetX, y + 0.5 + offsetZ, z - 0.2);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(90, 1F, 0F, 0F);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.EAST) {
            GlStateManager.translate(x + 1.2, y + 0.5 + offsetZ, z + 0.5 + offsetX);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(270, 0F, 0F, 1F);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.SOUTH) {
            GlStateManager.translate(x + 0.5 + offsetX, y + 0.2 + offsetZ, z + 1.2);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(270, 1F, 0F, 0F);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.WEST) {
            GlStateManager.translate(x - 0.2, y + 0.5 + offsetZ, z + 0.5 + offsetX);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(90, 0F, 0F, 1F);
            GlStateManager.scale(scale, scale, scale);
        }
        modelFlowerEmbothrium.renderAll(Minecraft.getMinecraft().player.ticksExisted);

        GlStateManager.popMatrix();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableBlend();
    }
}