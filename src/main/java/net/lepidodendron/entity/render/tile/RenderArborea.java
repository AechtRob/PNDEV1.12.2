package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockArborea;
import net.lepidodendron.entity.model.tile.ModelArborea;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderArborea extends TileEntitySpecialRenderer<BlockArborea.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/arborea.png");
    private final ModelArborea modelArborea;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderArborea() {
        this.modelArborea = new ModelArborea();
    }

    @Override
    public void render(BlockArborea.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
        }
        this.bindTexture(TEXTURE);
        ModelArborea modelArborea = this.modelArborea;
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5, y + 2.4, z + 0.5);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        modelArborea.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.popMatrix();
    }
}