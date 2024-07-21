package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockFlowerpotPN;
import net.lepidodendron.block.base.IPottable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockFlowerPot;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;

public class RenderFlowerPotPN extends TileEntitySpecialRenderer<BlockFlowerpotPN.TileEntityFlowerPotPN> {

    public static RenderFlowerPotPN instance;

    public RenderFlowerPotPN() {
    }

    public void render(BlockFlowerpotPN.TileEntityFlowerPotPN te, double x, double y, double z, float partialTicks, int destroyStage, float alpha)
    {
        Item item = null;
        int i = 0;

        if (te != null && te.hasWorld()) {
            item = te.getFlowerPotItem();
            i = te.getFlowerPotData();
        }
        else {
            return;
        }

        if (te.getWorld().getBlockState(te.getPos()).getBlock() instanceof BlockFlowerpotPN) {
            if (te.getWorld().getBlockState(te.getPos()).getActualState(te.getWorld(), te.getPos()).getValue(BlockFlowerpotPN.CONTENTS) != BlockFlowerPot.EnumFlowerType.EMPTY) {
                return;
            }
        }

        if (item == null) {
            return;
        }

        IBlockState state = null;
        Block block = null;

        if (item instanceof ItemBlock)
        {
            block = Block.getBlockFromItem(item);;
            state = block.getStateFromMeta(i);
            if (block instanceof IPottable) {
                state = ((IPottable) block).getPotState();
            }
        }
        else {
            if (item instanceof IPottable) {
                state = ((IPottable) item).getPotState();
                block = state.getBlock();
            }
            else {
                return;
            }
        }

        GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        if (block instanceof BlockCactus) {
            GlStateManager.translate(x + 0.371, y + 0.2, z + 0.362);
        }
        else {
            GlStateManager.translate(x + 0.11F, y + 0.3, z + 0.09F);
        }
        GlStateManager.rotate(-90, 0, 1, 0);
        if (block instanceof BlockCactus) {
            GlStateManager.scale(0.26D, 0.75D, 0.26D);
        }
        else {
            GlStateManager.scale(0.80D, 0.80D, 0.80D);
        }
        BlockRendererDispatcher renderer = Minecraft.getMinecraft().getBlockRendererDispatcher();
        Minecraft.getMinecraft().renderEngine.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);

        renderer.renderBlockBrightness(state, te.getWorld().getCombinedLight(new BlockPos(x, y, z), 0));

        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

    }

    public void setRendererDispatcher(TileEntityRendererDispatcher rendererDispatcherIn)
    {
        super.setRendererDispatcher(rendererDispatcherIn);
        instance = this;
    }

}