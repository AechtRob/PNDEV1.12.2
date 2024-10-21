package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockHelianthaster;
import net.lepidodendron.entity.model.tile.ModelHelianthasterItem;
import net.lepidodendron.entity.render.entity.RenderHelianthaster;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderHelianthasterItem extends TileEntitySpecialRenderer<BlockHelianthaster.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/helianthaster.png");
    private final ModelHelianthasterItem modelHelianthasterItem;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderHelianthasterItem() {
        this.modelHelianthasterItem = new ModelHelianthasterItem();
    }

    @Override
    public void render(BlockHelianthaster.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
        }
        this.bindTexture(TEXTURE);
        ModelHelianthasterItem modelHelianthasterItem = this.modelHelianthasterItem;
        double scale = RenderHelianthaster.getScaler() * 0.0625F;
        GlStateManager.pushMatrix();
        GlStateManager.enableAlpha();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translate(x + 0.5, y + 0.125, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
        modelHelianthasterItem.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
    }
}