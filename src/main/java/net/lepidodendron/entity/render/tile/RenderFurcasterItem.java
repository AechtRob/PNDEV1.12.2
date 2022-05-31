package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockFurcaster;
import net.lepidodendron.entity.model.tile.ModelFurcasterItem;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderFurcasterItem extends TileEntitySpecialRenderer<BlockFurcaster.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/furcaster.png");
    private final ModelFurcasterItem modelFurcasterItem;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderFurcasterItem() {
        this.modelFurcasterItem = new ModelFurcasterItem();
    }

    @Override
    public void render(BlockFurcaster.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
        }
        this.bindTexture(TEXTURE);
        ModelFurcasterItem modelFurcasterItem = this.modelFurcasterItem;
        double scale = 0.04D;
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5, y - 0.05, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
        modelFurcasterItem.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.popMatrix();
    }
}