package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockUrasterella;
import net.lepidodendron.entity.model.tile.ModelUrasterellaItem;
import net.lepidodendron.entity.render.entity.RenderUrasterella;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderUrasterellaItem extends TileEntitySpecialRenderer<BlockUrasterella.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/urasterella.png");
    private final ModelUrasterellaItem modelUrasterellaItem;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderUrasterellaItem() {
        this.modelUrasterellaItem = new ModelUrasterellaItem();
    }

    @Override
    public void render(BlockUrasterella.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockUrasterella.block) {
            currentRotation = entity.getTileData().getInteger("rotation");
        }
        this.bindTexture(TEXTURE);
        ModelUrasterellaItem modelUrasterellaItem = this.modelUrasterellaItem;
        double scale = RenderUrasterella.getScaler() * 0.0625F;;
        GlStateManager.pushMatrix();
        GlStateManager.enableAlpha();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translate(x + 0.5, y - 0.00, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
        modelUrasterellaItem.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
    }
}