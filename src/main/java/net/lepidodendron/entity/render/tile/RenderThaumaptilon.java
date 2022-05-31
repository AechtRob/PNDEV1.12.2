package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockThaumaptilon;
import net.lepidodendron.entity.model.tile.ModelThaumaptilon;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderThaumaptilon extends TileEntitySpecialRenderer<BlockThaumaptilon.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/thaumaptilon.png");
    private final ModelThaumaptilon modelThaumaptilon;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderThaumaptilon() {
        this.modelThaumaptilon = new ModelThaumaptilon();
    }

    @Override
    public void render(BlockThaumaptilon.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
        }
        this.bindTexture(TEXTURE);
        ModelThaumaptilon modelThaumaptilon = this.modelThaumaptilon;
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5, y + 2.4, z + 0.5);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        modelThaumaptilon.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.popMatrix();
    }
}