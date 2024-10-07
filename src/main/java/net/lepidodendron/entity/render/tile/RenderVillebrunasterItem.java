package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockVillebrunaster;
import net.lepidodendron.entity.model.tile.ModelVillebrunasterItem;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderVillebrunasterItem extends TileEntitySpecialRenderer<BlockVillebrunaster.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/villebrunaster.png");
    private final ModelVillebrunasterItem modelVillebrunasterItem;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderVillebrunasterItem() {
        this.modelVillebrunasterItem = new ModelVillebrunasterItem();
    }

    @Override
    public void render(BlockVillebrunaster.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockVillebrunaster.block) {
            currentRotation = entity.getTileData().getInteger("rotation");
        }
        this.bindTexture(TEXTURE);
        ModelVillebrunasterItem modelVillebrunasterItem = this.modelVillebrunasterItem;
        double scale = 0.04D;
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5, y - 0.05, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
        modelVillebrunasterItem.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.popMatrix();
    }
}