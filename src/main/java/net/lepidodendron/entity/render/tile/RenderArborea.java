package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockArborea;
import net.lepidodendron.entity.model.tile.ModelArborea;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderArborea extends TileEntitySpecialRenderer<BlockArborea.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/arborea.png");
    private final ModelArborea modelArborea;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderArborea() {
        this.modelArborea = new ModelArborea();
    }

    @Override
    public void render(BlockArborea.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        try { //to support book rendering:
            if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockArborea.block) {
                facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
            }
        }
        catch (Exception e){
            facing = EnumFacing.NORTH;
        }
        this.bindTexture(TEXTURE);
        ModelArborea modelArborea = this.modelArborea;
        GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.color(1.0F, 1.0F, 1.0F, alpha);
        GlStateManager.translate(x + 0.5, y + 2.4, z + 0.5);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        //----Start PP Page adjustment
        StackTraceElement[] elements = new Throwable().getStackTrace();
        String callerClass = elements[5].getClassName();
        if (callerClass.equalsIgnoreCase("vazkii.patchouli.client.book.page.PageMultiblock")) {
            GlStateManager.scale(0.7, 0.7, 0.7);
            GlStateManager.translate(0,0.9,0);
        }
        //----End PP Page adjustment
        GlStateManager.disableCull();
        modelArborea.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.enableCull();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();
        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
    }
}