package net.lepidodendron.entity.render.entity;

import java.util.Random;

import org.lwjgl.opengl.GL11;

import net.lepidodendron.block.BlockLavaRock;
import net.lepidodendron.entity.EntityPrehistoricFloraMeteor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderMeteor extends Render<EntityPrehistoricFloraMeteor>
{
    public RenderMeteor(RenderManager renderManagerIn)
    {
        super(renderManagerIn);
        this.shadowSize = 0.5F;
    }

    /**
     * Renders the desired {@code T} type Entity.
     */
    public void doRender(EntityPrehistoricFloraMeteor entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
            /*IBlockState iblockstate = BlockLavaRock.block.getDefaultState();

            if (iblockstate.getRenderType() == EnumBlockRenderType.MODEL)
            {
                World world = entity.world;

                if (iblockstate != world.getBlockState(new BlockPos(entity)) && iblockstate.getRenderType() != EnumBlockRenderType.INVISIBLE)
                {
                    this.bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
                    GlStateManager.pushMatrix();
                    GlStateManager.disableLighting();
                    Tessellator tessellator = Tessellator.getInstance();
                    BufferBuilder bufferbuilder = tessellator.getBuffer();

                    if (this.renderOutlines)
                    {
                        GlStateManager.enableColorMaterial();
                        GlStateManager.enableOutlineMode(this.getTeamColor(entity));
                    }

                    bufferbuilder.begin(7, DefaultVertexFormats.BLOCK);
                    BlockPos blockpos = new BlockPos(entity.posX, entity.getEntityBoundingBox().maxY, entity.posZ);
                    GlStateManager.translate((float)(x - (double)blockpos.getX() - 0.5D), (float)(y - (double)blockpos.getY()), (float)(z - (double)blockpos.getZ() - 0.5D));
                    BlockRendererDispatcher blockrendererdispatcher = Minecraft.getMinecraft().getBlockRendererDispatcher();
                    blockrendererdispatcher.getBlockModelRenderer().renderModel(world, blockrendererdispatcher.getModelForState(iblockstate), iblockstate, blockpos, bufferbuilder, false, MathHelper.getPositionRandom(entity.getPosition()));
                    tessellator.draw();

                    if (this.renderOutlines)
                    {
                        GlStateManager.disableOutlineMode();
                        GlStateManager.disableColorMaterial();
                    }

                    GlStateManager.enableLighting();
                    GlStateManager.popMatrix();
                    super.doRender(entity, x, y, z, entityYaw, partialTicks);
                }
            }*/
            
    		Tessellator tessellator = Tessellator.getInstance();
    		BufferBuilder bufferbuilder = tessellator.getBuffer();
    		RenderHelper.disableStandardItemLighting();
    		float timeFactor = ((float) entity.ticksExisted + partialTicks) / 20.0F;
    	
    		Random random = new Random(432L);
    		GlStateManager.disableTexture2D();
    		GlStateManager.shadeModel(7425);
    		GlStateManager.enableBlend();
    		GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
    		GlStateManager.disableAlpha();
    		GlStateManager.enableCull();
    		GlStateManager.depthMask(false);
    		GlStateManager.pushMatrix();
    		GlStateManager.translate((float)x, (float)y, (float)z);
    		GL11.glScalef(1, 1, 1);

    		for (int i = 0;  i < 50 ; ++i)
    		{
    			GlStateManager.rotate(random.nextFloat() * 360.0F, 1.0F, 0.0F, 0.0F);
    			GlStateManager.rotate(random.nextFloat() * 360.0F, 0.0F, 1.0F, 0.0F);
    			GlStateManager.rotate(random.nextFloat() * 360.0F, 0.0F, 0.0F, 1.0F);
    			GlStateManager.rotate(random.nextFloat() *10.0F*timeFactor, 0.0F, 0.0F, 1.0F);

    			float width = random.nextFloat()*2.5F + 1.0F;
    		
    			bufferbuilder.begin(6, DefaultVertexFormats.POSITION_COLOR);
    			
    			bufferbuilder.pos(0.0D, 0.0D, 0.0D).color(255, 255, 255, 255).endVertex();
    			bufferbuilder.pos((double)(-1*width) , 0.0, -10.0).color(0, 0, 0, 0).endVertex();
    			bufferbuilder.pos((double)(1*width), 0.0, -10.0).color(0, 0, 0, 0).endVertex();
    			bufferbuilder.pos((double)(1*width), 0.0, -10.0).color(0, 0, 0, 0).endVertex();
    			bufferbuilder.pos((double)(-1*width) , 0.0, -10.0).color(0, 0, 0, 0).endVertex();

    			tessellator.draw();
    		}

    		GlStateManager.popMatrix();
    		GlStateManager.depthMask(true);
    		GlStateManager.disableCull();
    		GlStateManager.disableBlend();
    		GlStateManager.shadeModel(7424);
    		GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
    		GlStateManager.enableTexture2D();
    		GlStateManager.enableAlpha();
    		RenderHelper.enableStandardItemLighting();
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityPrehistoricFloraMeteor entity)
    {
        return TextureMap.LOCATION_BLOCKS_TEXTURE;
    }
}