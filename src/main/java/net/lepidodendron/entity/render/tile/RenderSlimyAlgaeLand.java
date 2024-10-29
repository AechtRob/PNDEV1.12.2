package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockSlimyAlgaeLand;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class RenderSlimyAlgaeLand extends TileEntitySpecialRenderer<BlockSlimyAlgaeLand.TileEntityCustom> {

    final RenderEggsInBlock renderer = new RenderEggsInBlock();

    @Override
    public void render(BlockSlimyAlgaeLand.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        renderer.renderEggs(entity, x, y, z, false);
    }
}