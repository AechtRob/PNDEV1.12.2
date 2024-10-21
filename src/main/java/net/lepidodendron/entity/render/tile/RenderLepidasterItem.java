package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockLepidaster;
import net.lepidodendron.entity.model.tile.ModelLepidasterItem;
import net.lepidodendron.entity.render.entity.RenderLepidaster;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderLepidasterItem extends TileEntitySpecialRenderer<BlockLepidaster.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lepidaster.png");
    private final ModelLepidasterItem modelLepidasterItem;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderLepidasterItem() {
        this.modelLepidasterItem = new ModelLepidasterItem();
    }

    @Override
    public void render(BlockLepidaster.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockLepidaster.block) {
            currentRotation = entity.getTileData().getInteger("rotation");
        }
        this.bindTexture(TEXTURE);
        ModelLepidasterItem modelLepidasterItem = this.modelLepidasterItem;
        double scale = RenderLepidaster.getScaler() * 0.0625F;;
        GlStateManager.pushMatrix();
        GlStateManager.enableAlpha();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translate(x + 0.5, y - 0.00, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
        modelLepidasterItem.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
    }
}