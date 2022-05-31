
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockDriedMud extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:mud_dried")
	public static final Block block = null;
	public BlockDriedMud(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.mud_dried);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("mud_dried"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:mud_dried", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.GROUND);
			setTranslationKey("pf_mud_dried");
			setSoundType(SoundType.GROUND);
			setHardness(0.5F);
			setResistance(1.5F);
			setLightLevel(0F);
			setLightOpacity(255);
			this.setTickRandomly(true);
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) {

			//return super.canSustainPlant(state, world, pos, direction, plantable);

			net.minecraftforge.common.EnumPlantType plantType = plantable.getPlantType(world, pos.offset(direction));

			switch (plantType)
			{
				case Desert: return false;
				case Nether: return false;
				case Crop:   return false;
				case Cave:   return true;
				case Plains: return true;
				case Water:  return false;
				case Beach:
					boolean isBeach = true;
					boolean hasWater = (world.getBlockState(pos.east()).getMaterial() == Material.WATER ||
							world.getBlockState(pos.west()).getMaterial() == Material.WATER ||
							world.getBlockState(pos.north()).getMaterial() == Material.WATER ||
							world.getBlockState(pos.south()).getMaterial() == Material.WATER);
					return isBeach && hasWater;
			}

			return false;

		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
		{
			super.updateTick(worldIn, pos, state, rand);

			if (worldIn.getBlockState(pos.up()).getMaterial() == Material.WATER) {
				worldIn.setBlockState(pos, BlockCarboniferousMud.block.getDefaultState());
			}
		}
	}
}
