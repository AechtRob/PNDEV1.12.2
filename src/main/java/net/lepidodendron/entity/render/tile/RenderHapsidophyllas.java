package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockHapsidophyllas;
import net.lepidodendron.entity.model.tile.ModelHapsidophyllas;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderHapsidophyllas extends TileEntitySpecialRenderer<BlockHapsidophyllas.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hapsidophyllas.png");
    private final ModelHapsidophyllas modelHapsidophyllas;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderHapsidophyllas() {
        this.modelHapsidophyllas = new ModelHapsidophyllas();
    }

    @Override
    public void render(BlockHapsidophyllas.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
        }
        this.bindTexture(TEXTURE);
        ModelHapsidophyllas modelHapsidophyllas = this.modelHapsidophyllas;
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5, y + 1.21, z + 0.5);
        GlStateManager.scale(0.5,0.5,0.5);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        modelHapsidophyllas.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.popMatrix();
    }
}