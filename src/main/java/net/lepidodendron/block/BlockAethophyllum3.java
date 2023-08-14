
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockReed;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockAethophyllum3 extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:aethophyllum_3")
	public static final Block block = null;
	public BlockAethophyllum3(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.aethophyllum_3);
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
	//			new ModelResourceLocation("lepidodendron:aethophyllum_3", "inventory"));
	//}
	public static class BlockCustomFlower extends BlockReed implements IAdvancementGranter {
		public BlockCustomFlower() {
			setSoundType(SoundType.PLANT);
			setCreativeTab(null);
			setHardness(0.2F);
			setResistance(0F);
			setLightLevel(0F);
			setTranslationKey("pf_aethophyllum_3");
			setRegistryName("aethophyllum_3");
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_AETHOPHYLLUM;
		}


		@Override
		public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 100;
		}

		@Override
		public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face) {
			return 60;
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Nullable
		public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
		{
			return NULL_AABB;
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(BlockAethophyllum.block, (int) (1));
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
			if (((world.getBlockState(pos.down())).getBlock() != BlockAethophyllum2.block)
				&& ((world.getBlockState(pos.down())).getBlock() != BlockAethophyllum.block)) {
				//System.err.println("Catch 4");
				world.setBlockToAir(pos);
			}
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			//super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			if (((world.getBlockState(pos.down())).getBlock() != BlockAethophyllum2.block)
				&& ((world.getBlockState(pos.down())).getBlock() != BlockAethophyllum.block)) {
				//System.err.println("Catch 3");
				world.setBlockToAir(pos);
			}
		}

		@Override
		public void breakBlock(World worldIn, BlockPos pos, IBlockState state)  {
			super.breakBlock(worldIn, pos, state);
			//System.err.println(worldIn.getBlockState(pos).getBlock());
			if (LepidodendronConfig.doPropagation && worldIn.isAirBlock(pos)) {
				boolean doSpawn = false;
				//System.err.println("Catch 2");
				IBlockState _bs = BlockAethophyllumFruitBlock.block.getDefaultState();
				if ((Math.random() >= 0.8) && (worldIn.isAirBlock(pos.north()))) {
					worldIn.setBlockState(pos.north(), _bs, 3);
					doSpawn = true;
				}
				if ((Math.random() >= 0.8) && (worldIn.isAirBlock(pos.south()))) {
					worldIn.setBlockState(pos.south(), _bs, 3);
					doSpawn = true;
				}
				if ((Math.random() >= 0.8) && (worldIn.isAirBlock(pos.east()))) {
					worldIn.setBlockState(pos.east(), _bs, 3);
					doSpawn = true;
				}
				if ((Math.random() >= 0.8) && (worldIn.isAirBlock(pos.west()))) {
					worldIn.setBlockState(pos.west(), _bs, 3);
					doSpawn = true;
				}
				if ((!doSpawn) & (Math.random() >= 0.3)) {
					worldIn.setBlockState(pos, _bs, 3);
				}
			}
		}

		@Override
		public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
			super.onBlockHarvested(worldIn, pos, state, player);
			if (LepidodendronConfig.doPropagation && worldIn.isAirBlock(pos)) {
				boolean doSpawn = false;
				IBlockState _bs = BlockAethophyllumFruitBlock.block.getDefaultState();
				if ((Math.random() >= 0.8) && (worldIn.isAirBlock(pos.north()))) {
					worldIn.setBlockState(pos.north(), _bs, 3);
					doSpawn = true;
				}
				if ((Math.random() >= 0.8) && (worldIn.isAirBlock(pos.south()))) {
					worldIn.setBlockState(pos.south(), _bs, 3);
					doSpawn = true;
				}
				if ((Math.random() >= 0.8) && (worldIn.isAirBlock(pos.east()))) {
					worldIn.setBlockState(pos.east(), _bs, 3);
					doSpawn = true;
				}
				if ((Math.random() >= 0.8) && (worldIn.isAirBlock(pos.west()))) {
					worldIn.setBlockState(pos.west(), _bs, 3);
					doSpawn = true;
				}
				if ((!doSpawn) & (Math.random() >= 0.3)) {
					worldIn.setBlockState(pos, _bs, 3);
				}
			}
		}
		
	}
}
