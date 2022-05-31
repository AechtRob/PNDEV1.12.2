package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockParviscopa;
import net.lepidodendron.entity.model.tile.ModelParviscopa;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderParviscopa extends TileEntitySpecialRenderer<BlockParviscopa.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parviscopa.png");
    private final ModelParviscopa modelParviscopa;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderParviscopa() {
        this.modelParviscopa = new ModelParviscopa();
    }

    @Override
    public void render(BlockParviscopa.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
        }
        this.bindTexture(TEXTURE);
        ModelParviscopa modelParviscopa = this.modelParviscopa;
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5, y + 0.6, z + 0.5);
        GlStateManager.scale(0.22,0.22,0.22);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        modelParviscopa.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.popMatrix();
    }
}