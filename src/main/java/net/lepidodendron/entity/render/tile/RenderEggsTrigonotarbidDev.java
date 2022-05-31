package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockInsectEggsTrigonotarbidDev;
import net.lepidodendron.entity.model.tile.ModelTrigonotarbidEggs;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderEggsTrigonotarbidDev extends TileEntitySpecialRenderer<BlockInsectEggsTrigonotarbidDev.TileEntityCustom> {

    private final ModelTrigonotarbidEggs insect_eggs;
    private static final ResourceLocation TEXTURE_TrigonotarbidDev_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_dev_eggs.png");
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderEggsTrigonotarbidDev() {
        this.insect_eggs = new ModelTrigonotarbidEggs();
    }

    @Override
    public void render(BlockInsectEggsTrigonotarbidDev.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);

            GlStateManager.pushMatrix();
            if (facing == EnumFacing.DOWN) {
                GlStateManager.translate(x + 0.5F, y + 0.1F, z + 0.5F);
            }
            if (facing == EnumFacing.EAST) {
                GlStateManager.translate(x + 0.9F, y + 0.5F, z + 0.5F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(90.0F, 0.0F, 0.0F, 1.0F);
            }
            if (facing == EnumFacing.WEST) {
                GlStateManager.translate(x + 0.1F, y + 0.5F, z + 0.5F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(-90.0F, 0.0F, 0.0F, 1.0F);
            }
            if (facing == EnumFacing.NORTH) {
                GlStateManager.translate(x + 0.5F, y + 0.5F, z + 0.1F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
            }
            if (facing == EnumFacing.SOUTH) {
                GlStateManager.translate(x + 0.5F, y + 0.5F, z + 0.9F);
                GlStateManager.rotate(90.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(180.0F, 0.0F, 0.0F, 1.0F);
            }
            if (facing == EnumFacing.UP) {
                GlStateManager.translate(x + 0.5F, y + 0.9F, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
            }
            GlStateManager.scale(0.5F, 0.5F, 0.5F);
            Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_TrigonotarbidDev_EGGS);
            this.insect_eggs.renderAll(0.075F);
            GlStateManager.popMatrix();
        }
    }
}