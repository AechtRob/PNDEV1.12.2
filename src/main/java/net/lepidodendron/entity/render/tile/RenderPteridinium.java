package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockPteridinium;
import net.lepidodendron.entity.model.tile.ModelPteridinium;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderPteridinium extends TileEntitySpecialRenderer<BlockPteridinium.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/Pteridinium.png");
    private final ModelPteridinium modelPteridinium;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderPteridinium() {
        this.modelPteridinium = new ModelPteridinium();
    }

    @Override
    public void render(BlockPteridinium.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        try { //to support book rendering:
            if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockPteridinium.block) {
                facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
            }
        }
        catch (Exception e){
            facing = EnumFacing.NORTH;
        }
        this.bindTexture(TEXTURE);
        ModelPteridinium modelPteridinium = this.modelPteridinium;
        GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.color(1.0F, 1.0F, 1.0F, alpha);
        GlStateManager.translate(x + 0.5, y + 1.2, z + 0.5);
        GlStateManager.scale(0.5,0.5,0.5);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        modelPteridinium.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
    }
}