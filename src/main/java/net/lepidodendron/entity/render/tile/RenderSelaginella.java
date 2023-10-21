package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockSelaginella;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class RenderSelaginella extends TileEntitySpecialRenderer<BlockSelaginella.TileEntityCustom> {

    @Override
    public void render(BlockSelaginella.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        RenderEggsInBlock.renderEggs(entity, x, y, z, false);
    }
}