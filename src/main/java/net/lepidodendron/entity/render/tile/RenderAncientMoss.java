package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockAncientMoss;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class RenderAncientMoss extends TileEntitySpecialRenderer<BlockAncientMoss.TileEntityCustom> {

    @Override
    public void render(BlockAncientMoss.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        RenderEggsInBlock.renderEggs(entity, x, y, z, false);
    }
}