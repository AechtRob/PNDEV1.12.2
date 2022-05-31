package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockNautiloidShellAmmonite_Manticoceras;
import net.lepidodendron.entity.model.tile.ModelAmmonite50cmShell;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderNautiloidShellAmmonite_Manticoceras extends TileEntitySpecialRenderer<BlockNautiloidShellAmmonite_Manticoceras.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ammonite_manticoceras_shell.png");
    private final ModelAmmonite50cmShell modelNautiloidShell;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderNautiloidShellAmmonite_Manticoceras() {
        this.modelNautiloidShell = new ModelAmmonite50cmShell();
    }

    @Override
    public void render(BlockNautiloidShellAmmonite_Manticoceras.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.UP;
        int currentRotation = 0;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
        }
        this.bindTexture(TEXTURE);
        ModelAmmonite50cmShell modelNautiloidShell = this.modelNautiloidShell;
        double scale = 0.18D;
        GlStateManager.pushMatrix();
        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
            //lying down
            GlStateManager.translate(x + 0.5 , y + 0.05, z + 0.5);
            GlStateManager.scale(scale,scale,scale);
            GlStateManager.rotate(90, 0F, 0F, 1F);
            GlStateManager.rotate(currentRotation, 1F, 0F, 0F);
        }
        else {
            //standing up
            GlStateManager.translate(x + 0.5, y + 0.15, z + 0.5);
            GlStateManager.scale(scale,scale,scale);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
        }
        modelNautiloidShell.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.popMatrix();
    }
}