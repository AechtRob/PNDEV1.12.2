package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockMicrovictoriaBud;
import net.lepidodendron.entity.model.tile.ModelMicrovictoria;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderFlowerMicrovictoriaBud extends TileEntitySpecialRenderer<BlockMicrovictoriaBud.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/flower_microvictoria_bud.png");
    private final ModelMicrovictoria modelMicrovictoria;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderFlowerMicrovictoriaBud() {
        this.modelMicrovictoria = new ModelMicrovictoria();
    }

    @Override
    public void render(BlockMicrovictoriaBud.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {

        this.bindTexture(TEXTURE);

        ModelMicrovictoria modelMicrovictoria = this.modelMicrovictoria;

        double scale = 0.05D;
        GlStateManager.enableRescaleNormal();
        GlStateManager.alphaFunc(516, 0.1f);
        GlStateManager.enableBlend();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
        GlStateManager.pushMatrix();

        GlStateManager.translate(x + 0.5, y + 1.43, z + 0.5);
        GlStateManager.rotate(180, 0F, 0F, 1F);
        GlStateManager.scale(scale, scale, scale);

        modelMicrovictoria.renderAll(Minecraft.getMinecraft().player.ticksExisted);

        GlStateManager.popMatrix();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableBlend();
    }
}