package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockCoronacollina;
import net.lepidodendron.entity.model.tile.ModelCoronacollina;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderCoronacollina extends TileEntitySpecialRenderer<BlockCoronacollina.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/coronacollina_spines.png");
    private final ModelCoronacollina modelCoronacollina;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderCoronacollina() {
        this.modelCoronacollina = new ModelCoronacollina();
    }

    @Override
    public void render(BlockCoronacollina.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (entity != null && entity.hasWorld()) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
        }
        this.bindTexture(TEXTURE);
        ModelCoronacollina modelCoronacollina = this.modelCoronacollina;
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5, y + 0.66, z + 0.5);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(45, 0F, 1F, 0F);
        GlStateManager.scale(0.22,0.22,0.22);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        modelCoronacollina.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.popMatrix();
    }
}