package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockNautiloidShellAmmonite_Pachydesmoceras;
import net.lepidodendron.entity.model.tile.ModelAmmonite100cmShell;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderNautiloidShellAmmonite_Pachydesmoceras extends TileEntitySpecialRenderer<BlockNautiloidShellAmmonite_Pachydesmoceras.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ammonite_pachydesmoceras_shell.png");
    private final ModelAmmonite100cmShell modelNautiloidShell;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderNautiloidShellAmmonite_Pachydesmoceras() {
        this.modelNautiloidShell = new ModelAmmonite100cmShell();
    }

    @Override
    public void render(BlockNautiloidShellAmmonite_Pachydesmoceras.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.UP;
        int currentRotation = 0;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
        }
        this.bindTexture(TEXTURE);
        ModelAmmonite100cmShell modelNautiloidShell = this.modelNautiloidShell;
        double scale = 0.5D;
        GlStateManager.pushMatrix();
        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
            //lying down
            GlStateManager.translate(x + 0.5 , y + 0.14, z + 0.5);
            GlStateManager.scale(scale,scale,scale);
            GlStateManager.rotate(90, 0F, 0F, 1F);
            GlStateManager.rotate(currentRotation, 1F, 0F, 0F);
        }
        else {
            //standing up
            GlStateManager.translate(x + 0.5, y + 0.4, z + 0.5);
            GlStateManager.scale(scale,scale,scale);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
        }
        modelNautiloidShell.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.popMatrix();
    }
}