package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockFacivermis;
import net.lepidodendron.entity.model.tile.ModelFacivermis;
import net.lepidodendron.tileentity.TileEntityFacivermis;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderFacivermis extends TileEntitySpecialRenderer<TileEntityFacivermis> {

    private static final ResourceLocation TEXTURE_FACIVERMIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/facivermis.png");
    private static final ResourceLocation TEXTURE_FACIVERMIS_BASE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/facivermis_base.png");
    private final ModelFacivermis modelFacivermis;
    private final ModelFacivermis modelFacivermisBase;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderFacivermis() {
        this.modelFacivermis = new ModelFacivermis();
        this.modelFacivermisBase = new ModelFacivermis();
    }

    @Override
    public void render(TileEntityFacivermis entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        try { //to support book rendering:
            if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockFacivermis.block) {
                facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
            }
        }
        catch (Exception e){
            facing = EnumFacing.NORTH;
        }

        int hidden = entity.getHidden();
        float scaler = 1;
        if (hidden < 0) {
            //hide animation runs from -15 to 0:
            scaler = (float) ((double)Math.abs(hidden) / 15D);
        }
        else {
            if (hidden >= 0 && hidden < 240) {
                //hidden fully from 0 to 240 ticks:
                scaler = 0;
            }
            else {
                if (hidden >= 240 && hidden <= 360) {
                    scaler = (float) (((double)hidden-240D) / 120D);
                }
            }
        }

        this.bindTexture(TEXTURE_FACIVERMIS);
        ModelFacivermis modelFacivermis = this.modelFacivermis;
        GlStateManager.enableRescaleNormal();
        GlStateManager.alphaFunc(516, 0.1f);
        GlStateManager.enableBlend();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5, y + (2.4 * scaler), z + 0.5);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.scale(scaler,scaler,scaler);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        //GlStateManager.pushMatrix();
        modelFacivermis.scaler = scaler;
        modelFacivermis.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.popMatrix();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableBlend();
        //GlStateManager.popMatrix();

        this.bindTexture(TEXTURE_FACIVERMIS_BASE);
        ModelFacivermis modelFacivermisBase = this.modelFacivermis;
        GlStateManager.enableRescaleNormal();
        GlStateManager.alphaFunc(516, 0.1f);
        GlStateManager.enableBlend();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5, y + 2.4, z + 0.5);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        //GlStateManager.pushMatrix();
        modelFacivermisBase.scaler = scaler;
        modelFacivermisBase.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.popMatrix();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }
}