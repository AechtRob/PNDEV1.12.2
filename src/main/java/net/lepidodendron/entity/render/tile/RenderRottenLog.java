package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockRottenLog;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class RenderRottenLog extends TileEntitySpecialRenderer<BlockRottenLog.TileEntityCustom> {

    final RenderEggsInBlock renderer = new RenderEggsInBlock();

    @Override
    public void render(BlockRottenLog.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        renderer.renderEggs(entity, x, y, z, true);
    }
}