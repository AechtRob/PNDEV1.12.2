package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockGangtoucunia;
import net.lepidodendron.entity.model.tile.ModelGangtoucunia;
import net.lepidodendron.tileentity.TileEntityGangtoucunia;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderGangtoucunia extends TileEntitySpecialRenderer<TileEntityGangtoucunia> {

    private static final ResourceLocation TEXTURE_GANGTOUCUNIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gangtoucunia.png");
    private static final ResourceLocation TEXTURE_GANGTOUCUNIA_BASE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gangtoucunia_base.png");
    private final ModelGangtoucunia modelGangtoucunia;
    private final ModelGangtoucunia modelGangtoucuniaBase;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderGangtoucunia() {
        this.modelGangtoucunia = new ModelGangtoucunia();
        this.modelGangtoucuniaBase = new ModelGangtoucunia();
    }

    @Override
    public void render(TileEntityGangtoucunia entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        int cluster = 1;
        int hidden = 361;
        float offset1 = 1;
        float offset2 = 1;
        if (entity != null && entity.hasWorld() && entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockGangtoucunia.block) {
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
            cluster = entity.getCluster();
            hidden = entity.getHidden();
            offset1 = entity.getOffset1();
            offset2 = entity.getOffset2();
        }

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

        ModelGangtoucunia modelGangtoucunia = this.modelGangtoucunia;
        GlStateManager.enableRescaleNormal();
        GlStateManager.disableCull();
        GlStateManager.alphaFunc(516, 0.1f);
        GlStateManager.enableBlend();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
        GlStateManager.pushMatrix();
        GlStateManager.translate(x + 0.5, y + 2.4, z + 0.5);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
        modelGangtoucunia.scaler = scaler;

        //----Start PP Page adjustment
        StackTraceElement[] elements = new Throwable().getStackTrace();
        String callerClass = elements[5].getClassName();
        this.bindTexture(TEXTURE_GANGTOUCUNIA);
        if (callerClass.equalsIgnoreCase("vazkii.patchouli.client.book.page.PageMultiblock")) {
            GlStateManager.scale(5.0, 5., 5.);
            GlStateManager.translate(0,-1.83,0);
        }
        //----End PP Page adjustment
        else {
            GlStateManager.scale(1.75, 1.75, 1.75);
            GlStateManager.translate(0,-1.03,0);
        }
        modelGangtoucunia.renderAll(Minecraft.getMinecraft().player.ticksExisted);
        GlStateManager.popMatrix();

        if (cluster >= 2) {
            GlStateManager.pushMatrix();
            GlStateManager.translate(x + 0.5 + offset1, y + 2.4, z + 0.5 + offset2);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
            modelGangtoucunia.scaler = scaler;
            if (callerClass.equalsIgnoreCase("vazkii.patchouli.client.book.page.PageMultiblock")) {
                GlStateManager.scale(5.0, 5., 5.);
                GlStateManager.translate(0,-1.83,0);
            }
            //----End PP Page adjustment
            else {
                GlStateManager.scale(1.75, 1.75, 1.75);
                GlStateManager.translate(0,-1.03,0);
            }
            modelGangtoucunia.renderAll(Minecraft.getMinecraft().player.ticksExisted);
            GlStateManager.popMatrix();
        }

        if (cluster == 3) {
            GlStateManager.pushMatrix();
            GlStateManager.translate(x + 0.5 - offset2, y + 2.4, z + 0.5 - offset1);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
            modelGangtoucunia.scaler = scaler;
            if (callerClass.equalsIgnoreCase("vazkii.patchouli.client.book.page.PageMultiblock")) {
                GlStateManager.scale(5.0, 5., 5.);
                GlStateManager.translate(0,-1.83,0);
            }
            //----End PP Page adjustment
            else {
                GlStateManager.scale(1.75, 1.75, 1.75);
                GlStateManager.translate(0,-1.03,0);
            }
            modelGangtoucunia.renderAll(Minecraft.getMinecraft().player.ticksExisted);
            GlStateManager.popMatrix();
        }

        GlStateManager.enableCull();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableBlend();
    }
}