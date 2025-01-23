package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGigarimaneta;
import net.lepidodendron.entity.model.tile.ModelGigarimaneta;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderGigarimaneta extends TileEntitySpecialRenderer<BlockGigarimaneta.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gigarimaneta.png");
    private final ModelGigarimaneta modelGigarimaneta;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderGigarimaneta() {
        this.modelGigarimaneta = new ModelGigarimaneta();
    }

    @Override
    public void render(BlockGigarimaneta.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        try { //to support book rendering:
            if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockGigarimaneta.block) {
                facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
            }
        }
        catch (Exception e){
            facing = EnumFacing.NORTH;
        }
        this.bindTexture(TEXTURE);
        ModelGigarimaneta modelGigarimaneta = this.modelGigarimaneta;
        GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.color(1.0F, 1.0F, 1.0F, alpha);
        GlStateManager.translate(x + 0.5, y + 0.525, z + 0.5);
        GlStateManager.scale(0.22,0.22,0.22);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        //----Start PP Page adjustment
        StackTraceElement[] elements = new Throwable().getStackTrace();
        String callerClass = elements[5].getClassName();
        if (callerClass.equalsIgnoreCase("vazkii.patchouli.client.book.page.PageMultiblock")) {
            GlStateManager.scale(1.9, 1.9, 1.9);
            GlStateManager.translate(0,-1.2,0);
        }
        //----End PP Page adjustment
        GlStateManager.disableCull();
        modelGigarimaneta.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.enableCull();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
    }
}