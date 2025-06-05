package net.lepidodendron.entity.render.entity;

import net.lepidodendron.entity.EntityVolcanoFireball;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderVolcanoFireball extends Render<EntityVolcanoFireball>
{
    public RenderVolcanoFireball(RenderManager renderManagerIn)
    {
        super(renderManagerIn);
        this.shadowSize = 0.5F;
    }

    public void doRender(EntityVolcanoFireball entity, double x, double y, double z, float entityYaw, float partialTicks)
    {            
		//Do not render anything!
    }

    protected ResourceLocation getEntityTexture(EntityVolcanoFireball entity)
    {
        return TextureMap.LOCATION_BLOCKS_TEXTURE;
    }
}