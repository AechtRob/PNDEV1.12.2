package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockArchaeocidaris;
import net.lepidodendron.entity.model.entity.ModelArchaeocidaris;
import net.lepidodendron.entity.render.entity.RenderArchaeocidaris;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderArchaeocidarisItem extends TileEntitySpecialRenderer<BlockArchaeocidaris.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archaeocidaris.png");
    private final ModelArchaeocidaris modelArchaeocidaris;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderArchaeocidarisItem() {
        this.modelArchaeocidaris = new ModelArchaeocidaris();
    }

    @Override
    public void render(BlockArchaeocidaris.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
        }
        this.bindTexture(TEXTURE);
        ModelArchaeocidaris ModelArchaeocidaris = this.modelArchaeocidaris;
        double scale = RenderArchaeocidaris.getScaler() * 0.0625F;;
        GlStateManager.pushMatrix();
        GlStateManager.enableAlpha();
        GlStateManager.enableRescaleNormal();
        GlStateManager.translate(x + 0.5, y + 0.3250, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
        ModelArchaeocidaris.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
    }
}