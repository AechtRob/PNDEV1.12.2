package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockDollyphyton;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class RenderDollyphyton extends TileEntitySpecialRenderer<BlockDollyphyton.TileEntityCustom> {

    final RenderEggsInBlock renderer = new RenderEggsInBlock();

    @Override
    public void render(BlockDollyphyton.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        renderer.renderEggs(entity, x, y, z, false);
    }
}