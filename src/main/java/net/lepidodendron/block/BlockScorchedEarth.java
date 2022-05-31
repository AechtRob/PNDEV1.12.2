
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockScorchedEarth extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:scorched_dirt")
	public static final Block block = null;
	public BlockScorchedEarth(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.scorched_dirt);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("scorched_dirt"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:scorched_dirt", "inventory"));
	}
	public static class BlockCustom extends Block implements ISustainsPlantType {
		public BlockCustom() {
			super(Material.GROUND);
			this.setHardness(0.5F);
			this.setHarvestLevel("shovel", 0);
			this.setSoundType(SoundType.GROUND);
			setTranslationKey("pf_scorched_dirt");
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess blockAccess, BlockPos pos) {
			return MapColor.DIRT;
		}


		@Override
		public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) {

			net.minecraftforge.common.EnumPlantType plantType = plantable.getPlantType(world, pos.offset(direction));
			if (canSustainPlantType(world, pos, plantType)) {
				return true;
			}
			return super.canSustainPlant(state, world, pos, direction, plantable);
		}

		public boolean canSustainPlantType(IBlockAccess world, BlockPos pos, EnumPlantType plantType)
		{
			// support desert, plains and cave plants
			if (plantType == EnumPlantType.Desert || plantType == EnumPlantType.Plains || plantType == EnumPlantType.Cave)
			{
				return true;
			}
			// support beach plants if there's water alongside
			if (plantType == EnumPlantType.Beach)
			{
				return (
						world.getBlockState(pos.east()).getMaterial() == Material.WATER ||
						world.getBlockState(pos.west()).getMaterial() == Material.WATER ||
						world.getBlockState(pos.north()).getMaterial() == Material.WATER ||
						world.getBlockState(pos.south()).getMaterial() == Material.WATER
				);
			}
			return false;
		}

	}
}
