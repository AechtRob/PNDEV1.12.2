package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockSauroSkeleton;
import net.lepidodendron.entity.model.tile.ModelSauroSkeleton1;
import net.lepidodendron.entity.model.tile.ModelSauroSkeleton2;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;

public class RenderSauroSkeleton extends TileEntitySpecialRenderer<BlockSauroSkeleton.TileEntityCustom> {

    private static final ResourceLocation TEXTURE1 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sauroskeleton1.png");
    private static final ResourceLocation TEXTURE2 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sauroskeleton2.png");
    private final ModelSauroSkeleton1 modelSauroSkeleton1;
    private final ModelSauroSkeleton2 modelSauroSkeleton2;

    public RenderSauroSkeleton() {
        this.modelSauroSkeleton1 = new ModelSauroSkeleton1();
        this.modelSauroSkeleton2 = new ModelSauroSkeleton2();
    }

    @Override
    public void render(BlockSauroSkeleton.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        int currentRotation = 0;
        int var = 0;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
            var = entity.getTileData().getInteger("var");
        }
        GlStateManager.pushMatrix();
        GlStateManager.disableCull();
        GlStateManager.enableRescaleNormal();
        if (var == 0) {
            this.bindTexture(TEXTURE1);
        }
        else {
            this.bindTexture(TEXTURE2);
        }

        GlStateManager.enableAlpha();

        if (var == 0) {
            ModelSauroSkeleton1 modelSauroSkeleton1 = this.modelSauroSkeleton1;
        }
        else {
            ModelSauroSkeleton2 modelSauroSkeleton2 = this.modelSauroSkeleton2;
        }

        double scale = 1.0;

        GlStateManager.translate(x + 0.5 , y + 0.05, z + 0.5);
        GlStateManager.scale(scale,scale,scale);
        GlStateManager.rotate(90, 0F, 0F, 1F);
        GlStateManager.rotate(currentRotation, 1F, 0F, 0F);

        if (var == 0) {
            modelSauroSkeleton1.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        }
        else {
            modelSauroSkeleton2.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        }

        //GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();
    }
}