package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockRibCage;
import net.lepidodendron.entity.model.tile.ModelRibCage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderRibCage extends TileEntitySpecialRenderer<BlockRibCage.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ribcage.png");
    private final ModelRibCage modelRibCage;

    public RenderRibCage() {
        this.modelRibCage = new ModelRibCage();
    }

    @Override
    public void render(BlockRibCage.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
        }
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        this.bindTexture(TEXTURE);

        GlStateManager.enableAlpha();
        ModelRibCage modelRibCage = this.modelRibCage;
        double scale = 1.0;

        GlStateManager.translate(x + 0.5 , y + 0.05, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(90, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 1F, 0F, 0F);

        modelRibCage.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();
    }
}