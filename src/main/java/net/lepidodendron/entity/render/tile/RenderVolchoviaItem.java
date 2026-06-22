package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockVolchovia;
import net.lepidodendron.entity.model.tile.ModelVolchoviaItem;
import net.lepidodendron.entity.render.entity.RenderVolchovia;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderVolchoviaItem extends TileEntitySpecialRenderer<BlockVolchovia.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/volchovia_shell.png");
    private final ModelVolchoviaItem modelVolchoviaItem;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderVolchoviaItem() {
        this.modelVolchoviaItem = new ModelVolchoviaItem();
    }

    @Override
    public void render(BlockVolchovia.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockVolchovia.block) {
            currentRotation = entity.getTileData().getInteger("rotation");
        }
        this.bindTexture(TEXTURE);
        ModelVolchoviaItem modelVolchoviaItem = this.modelVolchoviaItem;
        double scale = RenderVolchovia.getScaler() * 0.0625F;;
        GlStateManager.pushMatrix();
        GlStateManager.enableAlpha();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translate(x + 0.5, y - 0.00, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
        modelVolchoviaItem.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
    }
}