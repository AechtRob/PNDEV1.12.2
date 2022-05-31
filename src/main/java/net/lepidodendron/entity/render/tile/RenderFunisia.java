package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockFunisia;
import net.lepidodendron.entity.model.tile.ModelFunisia;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderFunisia extends TileEntitySpecialRenderer<BlockFunisia.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/funisia.png");
    private final ModelFunisia modelFunisia;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderFunisia() {
        this.modelFunisia = new ModelFunisia();
    }

    @Override
    public void render(BlockFunisia.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
        }
        this.bindTexture(TEXTURE);
        ModelFunisia modelFunisia = this.modelFunisia;
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5, y + 1.03, z + 0.5);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.scale(0.43,0.43,0.43);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        modelFunisia.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.popMatrix();
    }
}