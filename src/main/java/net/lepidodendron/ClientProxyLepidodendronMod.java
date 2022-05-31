package net.lepidodendron;

import net.lepidodendron.block.BlockZirconGlass;
import net.lepidodendron.entity.render.RenderHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

import javax.annotation.Nullable;

public class ClientProxyLepidodendronMod implements IProxyLepidodendronMod {
	@Override
	public void init(FMLInitializationEvent event) {

		//Bind the biome water colour to the glass block so its water-repair thing picks up the right colour:
		BlockColors blockColors = Minecraft.getMinecraft().getBlockColors();
		blockColors.registerBlockColorHandler(new IBlockColor()
		{
			public int colorMultiplier(IBlockState state, @Nullable IBlockAccess worldIn, @Nullable BlockPos pos, int tintIndex)
			{
				return worldIn != null && pos != null ? BiomeColorHelper.getWaterColorAtPos(worldIn, pos) : -1;
			}
		}, BlockZirconGlass.block);

	}

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		OBJLoader.INSTANCE.addDomain("lepidodendron");
		RenderHandler.RegisterEntityRenders();
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
	}

	@Override
	public void serverLoad(FMLServerStartingEvent event) {
	}
}
