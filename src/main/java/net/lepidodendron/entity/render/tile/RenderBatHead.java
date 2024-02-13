package net.lepidodendron.entity.render.tile;

import net.lepidodendron.block.BlockBatHead;
import net.minecraft.client.model.ModelBat;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

import java.lang.reflect.Field;

public class RenderBatHead extends TileEntitySpecialRenderer<BlockBatHead.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation("textures/entity/bat.png");
    private final ModelBat modelBat;
    public static RenderBatHead instance;

    public RenderBatHead() {
        this.modelBat = new ModelBat();
    }

    public void render(BlockBatHead.TileEntityCustom te, double x, double y, double z, float partialTicks, int destroyStage, float alpha)
    {
        EnumFacing enumfacing = EnumFacing.byIndex(te.getBlockMetadata() & 7);
        float yy = 0;
        if (enumfacing == EnumFacing.UP) {
            if (te.getTileData().hasKey("rotation")) {
                yy = (float)te.getTileData().getInteger("rotation");
                yy = (float)(yy * 360) / 16.0F;
            }
        }
        this.renderBatHead((float)x, (float)y, (float)z, enumfacing, yy, destroyStage, partialTicks);
    }


    public void setRendererDispatcher(TileEntityRendererDispatcher rendererDispatcherIn)
    {
        super.setRendererDispatcher(rendererDispatcherIn);
        instance = this;
    }

    public void renderBatHead(float x, float y, float z, EnumFacing facing, float rotationIn, int destroyStage, float animateTicks)
    {
        @SuppressWarnings("deprecation")
        Class clazz = sun.reflect.Reflection.getCallerClass(8);

        ModelBat modelbase = this.modelBat;

        if (destroyStage >= 0)
        {
            this.bindTexture(DESTROY_STAGES[destroyStage]);
            GlStateManager.matrixMode(5890);
            GlStateManager.pushMatrix();
            GlStateManager.scale(4.0F, 2.0F, 1.0F);
            GlStateManager.translate(0.0625F, 0.0625F, 0.0625F);
            GlStateManager.matrixMode(5888);
        }
        else
        {
            this.bindTexture(TEXTURE);
        }

        GlStateManager.pushMatrix();
        GlStateManager.disableCull();

        if (facing == EnumFacing.UP)
        {
            GlStateManager.translate(x + 0.5F, y + 0.095F, z + 0.5F);
        }
        else if (clazz.getName().equalsIgnoreCase("vazkii.patchouli.client.book.page.PageMultiblock"))
        {
            GlStateManager.translate(x + 0.5F, y + 0.205F, z + 0.5F);
        }
        else
        {
            switch (facing)
            {
                case NORTH:
                    GlStateManager.translate(x + 0.5F, y + 0.45F, z + 0.905F);
                    break;
                case SOUTH:
                    GlStateManager.translate(x + 0.5F, y + 0.45F, z + 0.095F);
                    rotationIn = 180.0F;
                    break;
                case WEST:
                    GlStateManager.translate(x + 0.905F, y + 0.45F, z + 0.5F);
                    rotationIn = 270.0F;
                    break;
                case EAST:
                default:
                    GlStateManager.translate(x + 0.095F, y + 0.45F, z + 0.5F);
                    rotationIn = 90.0F;
            }
        }

        GlStateManager.enableRescaleNormal();
        GlStateManager.scale(-1.0F, -1.0F, 1.0F);
        GlStateManager.scale(0.5F, 0.5F, 0.5F);
        if (clazz.getName().equalsIgnoreCase("vazkii.patchouli.client.book.page.PageMultiblock")) {
            GlStateManager.scale(2.0F, 2.0F, 2.0F);
        }
        GlStateManager.enableAlpha();
        GlStateManager.rotate(rotationIn, 0, 1, 0);

        try { //Done direct to the model via reflection to allow for modded bats and skins etc... might be laggy:
            Field field = modelbase.getClass().getDeclaredField("field_82895_a");
            field.setAccessible(true);
            ModelRenderer batHead = (ModelRenderer)field.get(modelbase);
            batHead.render(0.0625F);
        }
        catch (Exception e) {
            //Do nothing
        }
        GlStateManager.popMatrix();

        if (destroyStage >= 0)
        {
            GlStateManager.matrixMode(5890);
            GlStateManager.popMatrix();
            GlStateManager.matrixMode(5888);
        }
    }
}