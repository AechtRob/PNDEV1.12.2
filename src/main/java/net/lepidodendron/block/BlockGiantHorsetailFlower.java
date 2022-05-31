
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockReed;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockGiantHorsetailFlower extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:giant_horsetail_flower")
	public static final Block block = null;
	public BlockGiantHorsetailFlower(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.giant_horsetail_flower);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustomFlower());
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	//@SideOnly(Side.CLIENT)
	//@Override
	//public void registerModels(ModelRegistryEvent event) {
	//	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
	//			new ModelResourceLocation("lepidodendron:giant_horsetail_flower", "inventory"));
	//}
	public static class BlockCustomFlower extends BlockReed {
		public BlockCustomFlower() {
			setSoundType(SoundType.PLANT);
			setCreativeTab(null);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			setTranslationKey("pf_giant_horsetail_flower");
			setRegistryName("giant_horsetail_flower");
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(BlockGiantHorsetail.block, (int) (1));
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

        @Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(Blocks.AIR, (int) (1)));
		}
		
		@Override
		public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
			return EnumPlantType.Plains;
		}

		@Override
		public boolean canPlaceBlockAt(World world, BlockPos pos) {
			Block block2 = world.getBlockState(pos.down()).getBlock();
			return (block2.canSustainPlant(world.getBlockState(pos.down()), world, pos.down(), EnumFacing.UP, this) || block2 == block);
		}

		@SideOnly(Side.CLIENT)
		public int colorMultiplier(IBlockAccess p_149720_1_, BlockPos pos, int pass) {
			return 16777215;
		}

		@Override
			public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
				if (world.getBlockState(pos.down()).getBlock() == block || this.checkForDrop(world, pos, state)) {
					if (world.isAirBlock(pos.up())) {
						world.setBlockState(pos.up(), BlockGiantHorsetailFlowerShoot.block.getDefaultState(), 2);
					}
					else {
						if ((world.isAirBlock(pos.up(2))) && ((world.getBlockState(pos.up())).getBlock() == BlockGiantHorsetailFlowerShoot.block)) {
							int l;
							//Vary the heights:
							int ll = 1;
							if (((double) (pos.getX() + pos.getZ())/2) == Math.round((double) (pos.getX() + pos.getZ())/2)) {
								ll = 2;
								}
							for (l = 1; world.getBlockState(pos.down(l)).getBlock() == this; ++l);
							if (l <= ll) {
								int i1 = (Integer) state.getValue(AGE);
								if (i1 == 15) {
									//world.setBlockToAir(pos.up());
									world.setBlockState(pos.up(), this.getDefaultState());
									world.setBlockState(pos, state.withProperty(AGE, 0), 4);
									if (world.isAirBlock(pos.up(2))) {
										world.setBlockState(pos.up(2), BlockGiantHorsetailFlowerShoot.block.getDefaultState(), 2);
									}
								} else {
									world.setBlockState(pos, state.withProperty(AGE, i1 + 1), 4);
								}
							}
						}
					}
				}
			}
	}
}
