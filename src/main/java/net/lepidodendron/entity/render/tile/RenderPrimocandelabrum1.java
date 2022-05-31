package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockPrimocandelabrum1;
import net.lepidodendron.entity.model.tile.ModelPrimocandelabrum;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderPrimocandelabrum1 extends TileEntitySpecialRenderer<BlockPrimocandelabrum1.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/primocandelabrum_1.png");
    private final ModelPrimocandelabrum modelPrimocandelabrum;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderPrimocandelabrum1() {
        this.modelPrimocandelabrum = new ModelPrimocandelabrum();
    }

    @Override
    public void render(BlockPrimocandelabrum1.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
        }
        this.bindTexture(TEXTURE);
        ModelPrimocandelabrum modelPrimocandelabrum = this.modelPrimocandelabrum;
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5, y + 0.7, z + 0.5);
        GlStateManager.scale(0.3,0.3,0.3);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        modelPrimocandelabrum.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.popMatrix();
    }
}