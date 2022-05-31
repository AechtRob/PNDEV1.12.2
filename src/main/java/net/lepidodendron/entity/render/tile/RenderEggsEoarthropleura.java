package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockInsectEggsEoarthropleura;
import net.lepidodendron.entity.model.tile.ModelInsectEggs;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderEggsEoarthropleura extends TileEntitySpecialRenderer<BlockInsectEggsEoarthropleura.TileEntityCustom> {

    private final ModelInsectEggs insect_eggs;
    private static final ResourceLocation TEXTURE_Eoarthropleura_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/insect_eggs_eoarthropleura.png");
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderEggsEoarthropleura() {
        this.insect_eggs = new ModelInsectEggs();
    }

    @Override
    public void render(BlockInsectEggsEoarthropleura.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
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
            Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_Eoarthropleura_EGGS);
            this.insect_eggs.renderAll(0.075F);
            GlStateManager.popMatrix();
        }
    }
}