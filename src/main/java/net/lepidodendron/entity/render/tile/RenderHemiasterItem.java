package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockHemiaster;
import net.lepidodendron.entity.model.tile.ModelHemiasterItem;
import net.lepidodendron.entity.render.entity.RenderHemiaster;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderHemiasterItem extends TileEntitySpecialRenderer<BlockHemiaster.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hemiaster_shell.png");
    private final ModelHemiasterItem modelHemiasterItem;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderHemiasterItem() {
        this.modelHemiasterItem = new ModelHemiasterItem();
    }

    @Override
    public void render(BlockHemiaster.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockHemiaster.block) {
            currentRotation = entity.getTileData().getInteger("rotation");
        }
        this.bindTexture(TEXTURE);
        ModelHemiasterItem modelHemiasterItem = this.modelHemiasterItem;
        double scale = RenderHemiaster.getScaler() * 0.0625F;;
        GlStateManager.pushMatrix();
        GlStateManager.enableAlpha();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translate(x + 0.5, y - 0.00, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
        modelHemiasterItem.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
    }
}