package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockSeaPenYellow;
import net.lepidodendron.entity.model.tile.ModelSeaPen;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderSeaPenYellow extends TileEntitySpecialRenderer<BlockSeaPenYellow.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sea_pen_yellow.png");
    private final ModelSeaPen modelSeaPen;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderSeaPenYellow() {
        this.modelSeaPen = new ModelSeaPen();
    }

    @Override
    public void render(BlockSeaPenYellow.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
        }
        this.bindTexture(TEXTURE);
        ModelSeaPen modelSeaPen = this.modelSeaPen;
        GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.color(1.0F, 1.0F, 1.0F, alpha);
        GlStateManager.translate(x + 0.5, y + 0.905, z + 0.5);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        GlStateManager.scale(0.38F, 0.38F, 0.38F);
        modelSeaPen.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
    }
}