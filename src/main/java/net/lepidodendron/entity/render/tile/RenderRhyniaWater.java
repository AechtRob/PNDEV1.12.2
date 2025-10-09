package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockRhyniaWater;
import net.lepidodendron.entity.model.tile.ModelHalfBlock;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RenderRhyniaWater extends TileEntitySpecialRenderer<BlockRhyniaWater.TileEntityRhyniaWater> {

    private final ModelHalfBlock halfBlock;

    public RenderRhyniaWater() {
        this.halfBlock = new ModelHalfBlock();
    }

    @Override
    public void render(BlockRhyniaWater.TileEntityRhyniaWater entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        //EnumFacing facing = EnumFacing.NORTH;

        int eggType = 0;
        //splice in something obvious so we can see it is broken!
        ResourceLocation TEXTURE_EGG = new ResourceLocation("minecraft:textures/blocks/wool_colored_purple.png");;
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        if (entity != null && entity.hasWorld() && world.getBlockState(pos).getBlock() == BlockRhyniaWater.block) {

            Minecraft minecraft = Minecraft.getMinecraft();
            BlockRendererDispatcher ren = minecraft.getBlockRendererDispatcher();
            String texture = "minecraft:blocks/dirt";
            IBlockState state = entity.getWorld().getBlockState(entity.getPos().down());
            BlockPos pos1 = pos.down(2);
            if (pos1 != null) {
                state = entity.getWorld().getBlockState(pos1);
                try {
                    texture = ren.getModelForState(state).getQuads(state, EnumFacing.UP, 0).get(0).getSprite().getIconName();
                } catch (RuntimeException exception) {
                    texture = "minecraft:blocks/dirt";
                }
                if (texture.equalsIgnoreCase("missingno")) {
                    texture = "minecraft:blocks/dirt";
                }
            }

            texture = texture.replace(":", ":textures/");
            GlStateManager.pushMatrix();
            GlStateManager.enableCull();
            GlStateManager.enableRescaleNormal();
            GlStateManager.translate(x + 0.5F, y + 0.50F, z + 0.5F);
            GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.scale(0.05F, 0.05F, 0.05F);
            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(texture + ".png"));
            GlStateManager.enableAlpha();
            this.halfBlock.renderAll(1.25f);
            //GlStateManager.disableAlpha();
            GlStateManager.enableCull();
            GlStateManager.popMatrix();
        }

    }
}