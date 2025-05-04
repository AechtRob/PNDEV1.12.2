package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockShankouclava;
import net.lepidodendron.entity.model.tile.ModelShankouclava;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RenderShankouclava extends TileEntitySpecialRenderer<BlockShankouclava.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/shankouclava.png");
    private static final ResourceLocation TEXTURE_T = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/shankouclava_t.png");
    private final ModelShankouclava modelShankouclava;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderShankouclava() {
        this.modelShankouclava = new ModelShankouclava();
        //this.addLayer(new LayerOdaraiaShell(this));
    }

    @Override
    public void render(BlockShankouclava.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {

        float PPscaler = 3.6f;
        float PPoffset = -16.0f;
        try { //to support book rendering:
            BlockPos pos = entity.getPos();
            World world = entity.getWorld();
            if (entity != null && entity.hasWorld() && world.getBlockState(pos).getBlock() == BlockShankouclava.block) {

                //solid
                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableRescaleNormal();
                //GlStateManager.enableAlpha();
                GlStateManager.translate(x + 0.5F, y + .76F, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.scale(0.025F, 0.025F, 0.025F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE);

                if (world.getBlockState(pos).getValue(BlockShankouclava.BlockCustom.FACING) == EnumFacing.EAST) {
                    GlStateManager.rotate(270.0F, 0F, 1f, 0.0F);
                } else if (world.getBlockState(pos).getValue(BlockShankouclava.BlockCustom.FACING) == EnumFacing.SOUTH) {

                } else if (world.getBlockState(pos).getValue(BlockShankouclava.BlockCustom.FACING) == EnumFacing.WEST) {
                    GlStateManager.rotate(90.0F, 0F, 1f, 0.0F);
                } else {
                    GlStateManager.rotate(180.0F, 0F, 1f, 0.0F);
                }

                this.modelShankouclava.renderAll(1.25f);
                // GlStateManager.disableAlpha();
                GlStateManager.disableRescaleNormal();
                GlStateManager.enableCull();
                GlStateManager.popMatrix();


                //transparent
                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableRescaleNormal();
                //GlStateManager.enableAlpha();
                GlStateManager.translate(x + 0.5F, y + .76F, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.scale(0.025F, 0.025F, 0.025F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_T);
                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.6F);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);

                if (world.getBlockState(pos).getValue(BlockShankouclava.BlockCustom.FACING) == EnumFacing.EAST) {
                    GlStateManager.rotate(270.0F, 0F, 1f, 0.0F);
                } else if (world.getBlockState(pos).getValue(BlockShankouclava.BlockCustom.FACING) == EnumFacing.SOUTH) {

                } else if (world.getBlockState(pos).getValue(BlockShankouclava.BlockCustom.FACING) == EnumFacing.WEST) {
                    GlStateManager.rotate(90.0F, 0F, 1f, 0.0F);
                } else {
                    GlStateManager.rotate(180.0F, 0F, 1f, 0.0F);
                }
            }
            else {
                //solid
                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableRescaleNormal();
                //GlStateManager.enableAlpha();
                GlStateManager.translate(x + 0.5F, y + .76F, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.scale(0.025F, 0.025F, 0.025F);
                //----Start PP Page adjustment
                StackTraceElement[] elements = new Throwable().getStackTrace();
                String callerClass = elements[5].getClassName();
                if (callerClass.equalsIgnoreCase("vazkii.patchouli.client.book.page.PageMultiblock")) {
                    GlStateManager.enableBlend();
                    GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                    GlStateManager.scale(PPscaler, PPscaler, PPscaler);
                    GlStateManager.translate(0,PPoffset,0);
                }
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE);

                this.modelShankouclava.renderAll(1.25f);
                // GlStateManager.disableAlpha();
                GlStateManager.disableRescaleNormal();
                GlStateManager.enableCull();
                GlStateManager.popMatrix();
                //transparent
                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableRescaleNormal();
                //GlStateManager.enableAlpha();
                GlStateManager.translate(x + 0.5F, y + .76F, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.scale(0.025F, 0.025F, 0.025F);
                //----Start PP Page adjustment
                if (callerClass.equalsIgnoreCase("vazkii.patchouli.client.book.page.PageMultiblock")) {
                    GlStateManager.enableBlend();
                    GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                    GlStateManager.scale(PPscaler, PPscaler, PPscaler);
                    GlStateManager.translate(0,PPoffset,0);
                }
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_T);
                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.6F);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            }
        }
        catch  (Exception e){
            //solid
            GlStateManager.pushMatrix();
            GlStateManager.disableCull();
            GlStateManager.enableRescaleNormal();
            //GlStateManager.enableAlpha();
            GlStateManager.translate(x + 0.5F, y + .76F, z + 0.5F);
            GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.scale(0.025F, 0.025F, 0.025F);
            //----Start PP Page adjustment
            StackTraceElement[] elements = new Throwable().getStackTrace();
            String callerClass = elements[5].getClassName();
            if (callerClass.equalsIgnoreCase("vazkii.patchouli.client.book.page.PageMultiblock")) {
                GlStateManager.enableBlend();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                GlStateManager.scale(PPscaler, PPscaler, PPscaler);
                GlStateManager.translate(0,PPoffset,0);
            }
            Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE);

            this.modelShankouclava.renderAll(1.25f);
            // GlStateManager.disableAlpha();
            GlStateManager.disableRescaleNormal();
            GlStateManager.enableCull();
            GlStateManager.popMatrix();
            //transparent
            GlStateManager.pushMatrix();
            GlStateManager.disableCull();
            GlStateManager.enableRescaleNormal();
            //GlStateManager.enableAlpha();
            GlStateManager.translate(x + 0.5F, y + .76F, z + 0.5F);
            GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.scale(0.025F, 0.025F, 0.025F);
            //----Start PP Page adjustment
            if (callerClass.equalsIgnoreCase("vazkii.patchouli.client.book.page.PageMultiblock")) {
                GlStateManager.enableBlend();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                GlStateManager.scale(PPscaler, PPscaler, PPscaler);
                GlStateManager.translate(0,PPoffset,0);
            }
            Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_T);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 0.6F);
            GlStateManager.enableNormalize();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        }

        //----End PP Page adjustment
        this.modelShankouclava.renderAll(1.25f);
        GlStateManager.disableBlend();
        GlStateManager.disableNormalize();
        // GlStateManager.disableAlpha();
        GlStateManager.disableRescaleNormal();
        GlStateManager.enableCull();
        GlStateManager.popMatrix();

    }
}