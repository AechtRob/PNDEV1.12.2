package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockAngiopteris;
import net.lepidodendron.entity.model.tile.ModelAngiopteris;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RenderAngiopteris extends TileEntitySpecialRenderer<BlockAngiopteris.TileEntityAngiopteris> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/angiopteris.png");
    private final ModelAngiopteris modelAngiopteris;

    public RenderAngiopteris() {
        this.modelAngiopteris = new ModelAngiopteris();
    }

    @Override
    public void render(BlockAngiopteris.TileEntityAngiopteris entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        if (entity != null && entity.hasWorld() && world.getBlockState(pos).getBlock() == BlockAngiopteris.block) {

            GlStateManager.pushMatrix();
            GlStateManager.enableRescaleNormal();
            GlStateManager.disableCull();
            GlStateManager.translate(x + 0.5F, y + 1.50F, z + 0.5F);
            GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.scale(0.05F, 0.05F, 0.05F);
            Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE);
            this.modelAngiopteris.renderAll(1.25f);
            GlStateManager.enableCull();
            GlStateManager.disableRescaleNormal();
            GlStateManager.popMatrix();
        }
    }
}