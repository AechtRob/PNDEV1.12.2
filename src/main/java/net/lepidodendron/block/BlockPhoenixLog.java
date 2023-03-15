
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.BlockLogPF;
import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockPhoenixLog extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:phoenix_log")
	public static final Block block = null;
	public BlockPhoenixLog(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.phoenix_log);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("phoenix_log"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:phoenix_log", "inventory"));
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("plantdnaPNlepidodendron:phoenix_sapling", BlockPhoenixLog.block);
		OreDictionary.registerOre("logWood", BlockPhoenixLog.block);
	}

	public static final PropertyBool SHOOT = PropertyBool.create("shoot");

	public static class BlockCustom extends BlockLogPF {
		public BlockCustom() {
			setTranslationKey("pf_phoenix_log");
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			if (worldIn.getBlockState(pos.up()).getBlock() != this
					&& worldIn.getBlockState(pos.up().north()).getBlock() != this
					&& worldIn.getBlockState(pos.up().east()).getBlock() != this
					&& worldIn.getBlockState(pos.up().south()).getBlock() != this
					&& worldIn.getBlockState(pos.up().west()).getBlock() != this
					&& worldIn.getBlockState(pos.up().north().east()).getBlock() != this
					&& worldIn.getBlockState(pos.up().north().west()).getBlock() != this
					&& worldIn.getBlockState(pos.up().south().east()).getBlock() != this
					&& worldIn.getBlockState(pos.up().south().west()).getBlock() != this) {
				return state.withProperty(SHOOT, true);
			}
			return state.withProperty(SHOOT, false);
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, SHOOT});
		}
	}
}
