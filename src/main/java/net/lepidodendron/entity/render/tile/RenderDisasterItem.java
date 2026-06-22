package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockDisaster;
import net.lepidodendron.block.BlockHemiaster;
import net.lepidodendron.entity.model.tile.ModelDisasterItem;
import net.lepidodendron.entity.model.tile.ModelHemiasterItem;
import net.lepidodendron.entity.render.entity.RenderDisaster;
import net.lepidodendron.entity.render.entity.RenderHemiaster;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderDisasterItem extends TileEntitySpecialRenderer<BlockDisaster.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/disaster_test.png");
    private final ModelDisasterItem modelDisasterItem;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderDisasterItem() {
        this.modelDisasterItem = new ModelDisasterItem();
    }

    @Override
    public void render(BlockDisaster.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockDisaster.block) {
            currentRotation = entity.getTileData().getInteger("rotation");
        }
        this.bindTexture(TEXTURE);
        ModelDisasterItem modelDisasterItem = this.modelDisasterItem;
        double scale = RenderDisaster.getScaler() * 0.0625F;;
        GlStateManager.pushMatrix();
        GlStateManager.enableAlpha();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translate(x + 0.5, y - 0.00, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
        modelDisasterItem.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
    }
}