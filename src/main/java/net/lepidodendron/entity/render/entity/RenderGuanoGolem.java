package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.EntityPrehistoricFloraGuanoGolem;
import net.lepidodendron.entity.model.entity.ModelGuanoGolem;
import net.lepidodendron.entity.render.RenderLivingBaseWithBook;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGuanoGolem extends RenderLivingBaseWithBook<EntityPrehistoricFloraGuanoGolem>
{
	private static final ResourceLocation GUANO_GOLEM_TEXTURES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/guano_golem.png");

	public RenderGuanoGolem(RenderManager renderManagerIn)
	{
		super(renderManagerIn, new ModelGuanoGolem(), 0.5F);
		//this.addLayer(new LayerSnowmanHead(this));
	}

	protected ResourceLocation getEntityTexture(EntityPrehistoricFloraGuanoGolem entity)
	{
		return GUANO_GOLEM_TEXTURES;
	}

	public ModelGuanoGolem getMainModel()
	{
		return (ModelGuanoGolem)super.getMainModel();
	}
}