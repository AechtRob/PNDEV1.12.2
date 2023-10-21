package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockEdwardsiphyton;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class RenderEdwardsiphyton extends TileEntitySpecialRenderer<BlockEdwardsiphyton.TileEntityCustom> {

    @Override
    public void render(BlockEdwardsiphyton.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        RenderEggsInBlock.renderEggs(entity, x, y, z, false);
    }
}