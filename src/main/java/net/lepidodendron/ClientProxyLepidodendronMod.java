package net.lepidodendron;

import net.lepidodendron.block.BlockZirconGlass;
import net.lepidodendron.entity.render.RenderHandler;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.client.renderer.color.IBlockColor;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.biome.BiomeColorHelper;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import org.lwjgl.input.Keyboard;

import javax.annotation.Nullable;

public class ClientProxyLepidodendronMod implements IProxyLepidodendronMod {

	public static KeyBinding keyB = new KeyBinding("key.lepidodendron.seetaxidermy", Keyboard.KEY_F10, "key.categories.misc");
	public static KeyBinding keyBoatDown = new KeyBinding("key.lepidodendron.boatdown", Keyboard.KEY_DOWN, "key.categories.misc");
	public static KeyBinding keyBoatUp = new KeyBinding("key.lepidodendron.boatup", Keyboard.KEY_UP, "key.categories.misc");
	public static KeyBinding keyBoatStrafeLeft = new KeyBinding("key.lepidodendron.boatleft", Keyboard.KEY_LEFT, "key.categories.misc");
	public static KeyBinding keyBoatStrafeRight = new KeyBinding("key.lepidodendron.boatright", Keyboard.KEY_RIGHT, "key.categories.misc");

	@Override
	public void init(FMLInitializationEvent event) {

		ClientRegistry.registerKeyBinding(keyB);
		ClientRegistry.registerKeyBinding(keyBoatDown);

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
