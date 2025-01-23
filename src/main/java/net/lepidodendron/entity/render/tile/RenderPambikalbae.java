package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockPambikalbae;
import net.lepidodendron.entity.model.tile.ModelPambikalbae;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderPambikalbae extends TileEntitySpecialRenderer<BlockPambikalbae.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pambikalbae.png");
    private static final ResourceLocation TEXTURE_BULBS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pambikalbae_bulbs.png");
    private final ModelPambikalbae modelPambikalbae;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderPambikalbae() {
        this.modelPambikalbae = new ModelPambikalbae();
    }

    @Override
    public void render(BlockPambikalbae.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        try { //to support book rendering:
            if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockPambikalbae.block) {
                facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
            }
        }
        catch (Exception e){
            facing = EnumFacing.NORTH;
        }
        this.bindTexture(TEXTURE);
        ModelPambikalbae modelPambikalbae = this.modelPambikalbae;
        GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.color(1.0F, 1.0F, 1.0F, alpha);
        GlStateManager.translate(x + 0.5, y + 1.2, z + 0.5);
        GlStateManager.scale(0.5,0.5,0.5);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        //----Start PP Page adjustment
        StackTraceElement[] elements = new Throwable().getStackTrace();
        String callerClass = elements[5].getClassName();
        if (callerClass.equalsIgnoreCase("vazkii.patchouli.client.book.page.PageMultiblock")) {
            GlStateManager.scale(2.0, 2.0, 2.0);
            GlStateManager.translate(0,-0.8,0);
        }
        //----End PP Page adjustment
        GlStateManager.disableCull();
        modelPambikalbae.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.enableCull();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();

        this.bindTexture(TEXTURE_BULBS);
        GlStateManager.pushMatrix();
        GlStateManager.enableRescaleNormal();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GlStateManager.color(1.0F, 1.0F, 1.0F, 0.55F);
        GlStateManager.translate(x + 0.5, y + 1.2, z + 0.5);
        GlStateManager.scale(0.5,0.5,0.5);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        //----Start PP Page adjustment
        if (callerClass.equalsIgnoreCase("vazkii.patchouli.client.book.page.PageMultiblock")) {
            GlStateManager.scale(2.0, 2.0, 2.0);
            GlStateManager.translate(0,-0.8,0);
        }
        //----End PP Page adjustment
        GlStateManager.disableCull();
        modelPambikalbae.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.disableRescaleNormal();
        GlStateManager.popMatrix();

        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
    }
}