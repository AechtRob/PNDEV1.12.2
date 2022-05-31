
package net.lepidodendron.block;

import net.lepidodendron.LepidodendronConfig;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFire;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

public class BlockFirePF extends BlockFire {
	{
		//super(Material.FIRE);
		this.setDefaultState(this.blockState.getBaseState().withProperty(AGE, Integer.valueOf(0)).withProperty(NORTH, Boolean.valueOf(false)).withProperty(EAST, Boolean.valueOf(false)).withProperty(SOUTH, Boolean.valueOf(false)).withProperty(WEST, Boolean.valueOf(false)).withProperty(UPPER, Boolean.valueOf(false)));
		this.setTickRandomly(true);
	}

	public int getEncouragementPF(Block blockIn) {
		if (blockIn == Blocks.PLANKS) {
		return 5;
		}
		if (blockIn == Blocks.DOUBLE_WOODEN_SLAB) {
		return 5;
		}
		if (blockIn == Blocks.WOODEN_SLAB) {
		return 5;
		}
		if (blockIn == Blocks.OAK_FENCE_GATE) {
		return 5;
		}
		if (blockIn == Blocks.SPRUCE_FENCE_GATE) {
		return 5;
		}
		if (blockIn == Blocks.BIRCH_FENCE_GATE) {
		return 5;
		}
		if (blockIn == Blocks.JUNGLE_FENCE_GATE) {
		return 5;
		}
		if (blockIn == Blocks.DARK_OAK_FENCE_GATE) {
		return 5;
		}
		if (blockIn == Blocks.ACACIA_FENCE_GATE) {
		return 5;
		}
		if (blockIn == Blocks.OAK_FENCE) {
		return 5;
		}
		if (blockIn == Blocks.SPRUCE_FENCE) {
		return 5;
		}
		if (blockIn == Blocks.BIRCH_FENCE) {
		return 5;
		}
		if (blockIn == Blocks.JUNGLE_FENCE) {
		return 5;
		}
		if (blockIn == Blocks.DARK_OAK_FENCE) {
		return 5;
		}
		if (blockIn == Blocks.ACACIA_FENCE) {
		return 5;
		}
		if (blockIn == Blocks.OAK_STAIRS) {
		return 5;
		}
		if (blockIn == Blocks.BIRCH_STAIRS) {
		return 5;
		}
		if (blockIn == Blocks.SPRUCE_STAIRS) {
		return 5;
		}
		if (blockIn == Blocks.JUNGLE_STAIRS) {
		return 5;
		}
		if (blockIn == Blocks.ACACIA_STAIRS) {
		return 5;
		}
		if (blockIn == Blocks.DARK_OAK_STAIRS) {
		return 5;
		}
		if (blockIn == Blocks.LOG) {
		return 5;
		}
		if (blockIn == Blocks.LOG2) {
		return 5;
		}
		if (blockIn == Blocks.LEAVES) {
		return 30;
		}
		if (blockIn == Blocks.LEAVES2) {
		return 30;
		}
		if (blockIn == Blocks.BOOKSHELF) {
		return 30;
		}
		if (blockIn == Blocks.TNT) {
		return 15;
		}
		if (blockIn == Blocks.TALLGRASS) {
		return 60;
		}
		if (blockIn == Blocks.DOUBLE_PLANT) {
		return 60;
		}
		if (blockIn == Blocks.YELLOW_FLOWER) {
		return 60;
		}
		if (blockIn == Blocks.RED_FLOWER) {
		return 60;
		}
		if (blockIn == Blocks.DEADBUSH) {
		return 60;
		}
		if (blockIn == Blocks.WOOL) {
		return 30;
		}
		if (blockIn == Blocks.VINE) {
		return 15;
		}
		if (blockIn == Blocks.COAL_BLOCK) {
		return 5;
		}
		if (blockIn == Blocks.HAY_BLOCK) {
		return 60;
		}
		if (blockIn == Blocks.CARPET) {
		return 60;
		}
		if (blockIn == BlockResin.block) {
			return 60;
		}
		return 0;
	}

	public int getFlammabilityPF(Block blockIn) {
		if (blockIn == Blocks.PLANKS) {
		return 20;
		}
		if (blockIn == Blocks.DOUBLE_WOODEN_SLAB) {
		return 20;
		}
		if (blockIn == Blocks.WOODEN_SLAB) {
		return 20;
		}
		if (blockIn == Blocks.OAK_FENCE_GATE) {
		return 20;
		}
		if (blockIn == Blocks.SPRUCE_FENCE_GATE) {
		return 20;
		}
		if (blockIn == Blocks.BIRCH_FENCE_GATE) {
		return 20;
		}
		if (blockIn == Blocks.JUNGLE_FENCE_GATE) {
		return 20;
		}
		if (blockIn == Blocks.DARK_OAK_FENCE_GATE) {
		return 20;
		}
		if (blockIn == Blocks.ACACIA_FENCE_GATE) {
		return 20;
		}
		if (blockIn == Blocks.OAK_FENCE) {
		return 20;
		}
		if (blockIn == Blocks.SPRUCE_FENCE) {
		return 20;
		}
		if (blockIn == Blocks.BIRCH_FENCE) {
		return 20;
		}
		if (blockIn == Blocks.JUNGLE_FENCE) {
		return 20;
		}
		if (blockIn == Blocks.DARK_OAK_FENCE) {
		return 20;
		}
		if (blockIn == Blocks.ACACIA_FENCE) {
		return 20;
		}
		if (blockIn == Blocks.OAK_STAIRS) {
		return 20;
		}
		if (blockIn == Blocks.BIRCH_STAIRS) {
		return 20;
		}
		if (blockIn == Blocks.SPRUCE_STAIRS) {
		return 20;
		}
		if (blockIn == Blocks.JUNGLE_STAIRS) {
		return 20;
		}
		if (blockIn == Blocks.ACACIA_STAIRS) {
		return 20;
		}
		if (blockIn == Blocks.DARK_OAK_STAIRS) {
		return 20;
		}
		if (blockIn == Blocks.LOG) {
		return 5;
		}
		if (blockIn == Blocks.LOG2) {
		return 5;
		}
		if (blockIn == Blocks.LEAVES) {
		return 60;
		}
		if (blockIn == Blocks.LEAVES2) {
		return 60;
		}
		if (blockIn == Blocks.BOOKSHELF) {
		return 20;
		}
		if (blockIn == Blocks.TNT) {
		return 10;
		}
		if (blockIn == Blocks.TALLGRASS) {
		return 10;
		}
		if (blockIn == Blocks.DOUBLE_PLANT) {
		return 10;
		}
		if (blockIn == Blocks.YELLOW_FLOWER) {
		return 10;
		}
		if (blockIn == Blocks.RED_FLOWER) {
		return 10;
		}
		if (blockIn == Blocks.DEADBUSH) {
		return 10;
		}
		if (blockIn == Blocks.WOOL) {
		return 60;
		}
		if (blockIn == Blocks.VINE) {
		return 10;
		}
		if (blockIn == Blocks.COAL_BLOCK) {
		return 5;
		}
		if (blockIn == Blocks.HAY_BLOCK) {
		return 20;
		}
		if (blockIn == Blocks.CARPET) {
		return 20;
		}
		if (blockIn == BlockResin.block) {
			return 20;
		}
		return 0;
	}

	@Nullable
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	{
		return NULL_AABB;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}

	@Override
	public boolean isFullCube(IBlockState state)
	{
		return false;
	}

	@Override
	public int quantityDropped(Random random)
	{
		return 0;
	}


	@Override
	public int tickRate(World worldIn)
	{
		if (worldIn.provider.getDimension() == LepidodendronConfig.dimCarboniferous) {
			return 10;
		}
		return 30;
	}

	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	{
		if (worldIn.provider.getDimension() == LepidodendronConfig.dimCarboniferous) {
			return worldIn.getBlockState(pos.down()).isTopSolid() || this.canNeighborCatchFire(worldIn, pos)
				|| worldIn.getBlockState(pos.down()).getBlock().isFlammable(worldIn, pos.down(), EnumFacing.UP)
				|| worldIn.getBlockState(pos.up()).getBlock().isFlammable(worldIn, pos.up(), EnumFacing.DOWN);
		}
		return worldIn.getBlockState(pos.down()).isTopSolid() || this.canNeighborCatchFire(worldIn, pos);
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		if (worldIn.provider.getDimension() == LepidodendronConfig.dimCarboniferous) {
			if (worldIn.getGameRules().getBoolean("doFireTick"))
			{
				if (!worldIn.isAreaLoaded(pos, 2)) return; // Forge: prevent loading unloaded chunks when spreading fire
				if (!this.canPlaceBlockAt(worldIn, pos))
				{
					worldIn.setBlockToAir(pos);
				}

				Block block = worldIn.getBlockState(pos.down()).getBlock();
				boolean flag = block.isFireSource(worldIn, pos.down(), EnumFacing.UP);

				int i = ((Integer)state.getValue(AGE)).intValue();

				if (!flag && worldIn.isRaining() && this.canDie(worldIn, pos) && rand.nextFloat() < 0.1F + (float)i * 0.02F)
				{
					worldIn.setBlockToAir(pos);
				}
				else
				{
					if (i < 8)
					{
						state = state.withProperty(AGE, Integer.valueOf(i + rand.nextInt(3) / 2));
						worldIn.setBlockState(pos, state, 4);
					}

					worldIn.scheduleUpdate(pos, this, this.tickRate(worldIn) + rand.nextInt(5));

					if (!flag)
					{
						//if (!this.canNeighborCatchFire(worldIn, pos))
						//{
						//	if (!worldIn.getBlockState(pos.down()).isSideSolid(worldIn, pos.down(), EnumFacing.UP))
						//	{
						//		worldIn.setBlockToAir(pos);
						//	}

						//	return;
						//}

						if (!this.canCatchFire(worldIn, pos.down(), EnumFacing.UP) && i == 8 && rand.nextInt(40) == 0)
						{
							worldIn.setBlockToAir(pos);
							return;
						}
					}

					boolean flag1 = worldIn.isBlockinHighHumidity(pos);
					int j = 0;

					if (flag1)
					{
						j = -50;
					}

					this.tryCatchFire(worldIn, pos.east(), 600 + j, rand, i, EnumFacing.WEST);
					this.tryCatchFire(worldIn, pos.west(), 600 + j, rand, i, EnumFacing.EAST);
					this.tryCatchFire(worldIn, pos.down(), 500 + j, rand, i, EnumFacing.UP);
					this.tryCatchFire(worldIn, pos.up(), 1000 + j, rand, i, EnumFacing.DOWN);
					this.tryCatchFire(worldIn, pos.north(), 600 + j, rand, i, EnumFacing.SOUTH);
					this.tryCatchFire(worldIn, pos.south(), 600 + j, rand, i, EnumFacing.NORTH);

					for (int k = -2; k <= 2; ++k)
					{
						for (int l = -2; l <= 2; ++l)
						{
							for (int i1 = -1; i1 <= 4; ++i1)
							{
								if (k != 0 || i1 != 0 || l != 0)
								{
									int j1 = 100;

									if (i1 > 1)
									{
										j1 += (i1 - 1) * 100;
									}

									BlockPos blockpos = pos.add(k, i1, l);
									int k1 = this.getNeighborEncouragement(worldIn, blockpos);

									if (k1 > 0)
									{
										int l1 = (k1 + 40 + worldIn.getDifficulty().getId() * 7) / (i + 30);

										if (flag1)
										{
											l1 /= 10;
										}

										if (l1 > 0 && rand.nextInt(j1) <= l1 && (!worldIn.isRaining() || !this.canDie(worldIn, blockpos)))
										{
											int i2 = i + rand.nextInt(5) / 4;

											if (i2 > 8)
											{
												i2 = 8;
											}

											worldIn.setBlockState(blockpos, state.withProperty(AGE, Integer.valueOf(i2)), 3);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		else if (worldIn.getGameRules().getBoolean("doFireTick"))
		{
			if (!worldIn.isAreaLoaded(pos, 2)) return; // Forge: prevent loading unloaded chunks when spreading fire
			if (!this.canPlaceBlockAt(worldIn, pos))
			{
				worldIn.setBlockToAir(pos);
			}

			Block block = worldIn.getBlockState(pos.down()).getBlock();
			boolean flag = block.isFireSource(worldIn, pos.down(), EnumFacing.UP);

			int i = ((Integer)state.getValue(AGE)).intValue();

			if (!flag && worldIn.isRaining() && this.canDie(worldIn, pos) && rand.nextFloat() < 0.2F + (float)i * 0.03F)
			{
				worldIn.setBlockToAir(pos);
			}
			else
			{
				if (i < 15)
				{
					state = state.withProperty(AGE, Integer.valueOf(i + rand.nextInt(3) / 2));
					worldIn.setBlockState(pos, state, 4);
				}

				worldIn.scheduleUpdate(pos, this, this.tickRate(worldIn) + rand.nextInt(10));

				if (!flag)
				{
					if (!this.canNeighborCatchFire(worldIn, pos))
					{
						if (!worldIn.getBlockState(pos.down()).isSideSolid(worldIn, pos.down(), EnumFacing.UP) || i > 3)
						{
							worldIn.setBlockToAir(pos);
						}

						return;
					}

					if (!this.canCatchFire(worldIn, pos.down(), EnumFacing.UP) && i == 15 && rand.nextInt(4) == 0)
					{
						worldIn.setBlockToAir(pos);
						return;
					}
				}

				boolean flag1 = worldIn.isBlockinHighHumidity(pos);
				int j = 0;

				if (flag1)
				{
					j = -50;
				}

				this.tryCatchFire(worldIn, pos.east(), 600 + j, rand, i, EnumFacing.WEST);
				this.tryCatchFire(worldIn, pos.west(), 600 + j, rand, i, EnumFacing.EAST);
				this.tryCatchFire(worldIn, pos.down(), 500 + j, rand, i, EnumFacing.UP);
				this.tryCatchFire(worldIn, pos.up(), 500 + j, rand, i, EnumFacing.DOWN);
				this.tryCatchFire(worldIn, pos.north(), 600 + j, rand, i, EnumFacing.SOUTH);
				this.tryCatchFire(worldIn, pos.south(), 600 + j, rand, i, EnumFacing.NORTH);

				for (int k = -1; k <= 1; ++k)
				{
					for (int l = -1; l <= 1; ++l)
					{
						for (int i1 = -1; i1 <= 4; ++i1)
						{
							if (k != 0 || i1 != 0 || l != 0)
							{
								int j1 = 100;

								if (i1 > 1)
								{
									j1 += (i1 - 1) * 100;
								}

								BlockPos blockpos = pos.add(k, i1, l);
								int k1 = this.getNeighborEncouragement(worldIn, blockpos);

								if (k1 > 0)
								{
									int l1 = (k1 + 40 + worldIn.getDifficulty().getId() * 7) / (i + 30);

									if (flag1)
									{
										l1 /= 2;
									}

									if (l1 > 0 && rand.nextInt(j1) <= l1 && (!worldIn.isRaining() || !this.canDie(worldIn, blockpos)))
									{
										int i2 = i + rand.nextInt(5) / 4;

										if (i2 > 15)
										{
											i2 = 15;
										}

										worldIn.setBlockState(blockpos, state.withProperty(AGE, Integer.valueOf(i2)), 3);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@Override
	protected boolean canDie(World worldIn, BlockPos pos)
	{
		return worldIn.isRainingAt(pos) || worldIn.isRainingAt(pos.west()) || worldIn.isRainingAt(pos.east()) || worldIn.isRainingAt(pos.north()) || worldIn.isRainingAt(pos.south());
	}

	@Override
	public boolean requiresUpdates()
	{
		return false;
	}

	@Deprecated // Use Block.getFlammability
	@Override
	public int getFlammability(Block blockIn)
	{
		//System.err.println("getFlammability for " + blockIn);
		Integer integer = this.getFlammabilityPF(blockIn);
		return integer == null ? 0 : integer.intValue();
	}

	@Deprecated // Use Block.getFireSpreadSpeed
	@Override
	public int getEncouragement(Block blockIn)
	{
		Integer integer = this.getEncouragementPF(blockIn);
		return integer == null ? 0 : integer.intValue();
	}

	@Deprecated // Use tryCatchFire with face below
	private void catchOnFire(World worldIn, BlockPos pos, int chance, Random random, int age)
	{
		this.tryCatchFire(worldIn, pos, chance, random, age, EnumFacing.UP);
	}

	private void tryCatchFire(World worldIn, BlockPos pos, int chance, Random random, int age, EnumFacing face)
	{
		int i = worldIn.getBlockState(pos).getBlock().getFlammability(worldIn, pos, face);

		if (worldIn.provider.getDimension() == LepidodendronConfig.dimCarboniferous)
		{
			i = i * 10;
		}

		if (random.nextInt(chance) < i)
		{
			IBlockState iblockstate = worldIn.getBlockState(pos);

			int q = 10;
			if (worldIn.provider.getDimension() == LepidodendronConfig.dimCarboniferous) {
				q = 5;
			}

			if (random.nextInt(age + q) < 5 && !worldIn.isRainingAt(pos))
			{
				int j = age + random.nextInt(5) / 4;

				int p = 15;
				if (worldIn.provider.getDimension() == LepidodendronConfig.dimCarboniferous) {
					p = 8;
				}
				if (j > p)
				{
					j = p;
				}

				worldIn.setBlockState(pos, this.getDefaultState().withProperty(AGE, Integer.valueOf(j)), 3);
			}
			else
			{
				worldIn.setBlockToAir(pos);
			}

			if (iblockstate.getBlock() == Blocks.TNT)
			{
				Blocks.TNT.onPlayerDestroy(worldIn, pos, iblockstate.withProperty(BlockTNT.EXPLODE, Boolean.valueOf(true)));
			}
		}
	}

	private boolean canNeighborCatchFire(World worldIn, BlockPos pos)
	{
		for (EnumFacing enumfacing : EnumFacing.values())
		{
			if (this.canCatchFire(worldIn, pos.offset(enumfacing), enumfacing.getOpposite()))
			{
				return true;
			}
		}

		return false;
	}

	private int getNeighborEncouragement(World worldIn, BlockPos pos)
	{
		if (!worldIn.isAirBlock(pos))
		{
			return 0;
		}
		else
		{
			int i = 0;

			for (EnumFacing enumfacing : EnumFacing.values())
			{
				i = Math.max(worldIn.getBlockState(pos.offset(enumfacing)).getBlock().getFireSpreadSpeed(worldIn, pos.offset(enumfacing), enumfacing.getOpposite()), i);
			}

			if (worldIn.provider.getDimension() == LepidodendronConfig.dimCarboniferous) {
				i = i * 10;
			}
			return i;
		}
	}




	@Override
	public boolean isCollidable()
	{
		return false;
	}

	@Deprecated // Use canCatchFire with face sensitive version below
	@Override
	public boolean canCatchFire(IBlockAccess worldIn, BlockPos pos)
	{
		return canCatchFire(worldIn, pos, EnumFacing.UP);
	}


	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos)
	{
		if (!worldIn.getBlockState(pos.down()).isTopSolid() && !this.canNeighborCatchFire(worldIn, pos))
		{
			worldIn.setBlockToAir(pos);
		}
	}

	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state)
	{
		if (worldIn.provider.getDimensionType().getId() > 0 || !Blocks.PORTAL.trySpawnPortal(worldIn, pos))
		{
			if (!worldIn.getBlockState(pos.down()).isTopSolid() && !this.canNeighborCatchFire(worldIn, pos))
			{
				worldIn.setBlockToAir(pos);
			}
			else
			{
				worldIn.scheduleUpdate(pos, this, this.tickRate(worldIn) + worldIn.rand.nextInt(10));
			}
		}
	}

	@Override
	public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	{
		return MapColor.TNT;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
	{
		if (rand.nextInt(24) == 0)
		{
			worldIn.playSound((double)((float)pos.getX() + 0.5F), (double)((float)pos.getY() + 0.5F), (double)((float)pos.getZ() + 0.5F), SoundEvents.BLOCK_FIRE_AMBIENT, SoundCategory.BLOCKS, 1.0F + rand.nextFloat(), rand.nextFloat() * 0.7F + 0.3F, false);
		}

		if (!worldIn.getBlockState(pos.down()).isSideSolid(worldIn, pos.down(), EnumFacing.UP) && !Blocks.FIRE.canCatchFire(worldIn, pos.down(), EnumFacing.UP))
		{
			if (Blocks.FIRE.canCatchFire(worldIn, pos.west(), EnumFacing.EAST))
			{
				for (int j = 0; j < 2; ++j)
				{
					double d3 = (double)pos.getX() + rand.nextDouble() * 0.10000000149011612D;
					double d8 = (double)pos.getY() + rand.nextDouble();
					double d13 = (double)pos.getZ() + rand.nextDouble();
					worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d3, d8, d13, 0.0D, 0.0D, 0.0D);
				}
			}

			if (Blocks.FIRE.canCatchFire(worldIn, pos.east(), EnumFacing.WEST))
			{
				for (int k = 0; k < 2; ++k)
				{
					double d4 = (double)(pos.getX() + 1) - rand.nextDouble() * 0.10000000149011612D;
					double d9 = (double)pos.getY() + rand.nextDouble();
					double d14 = (double)pos.getZ() + rand.nextDouble();
					worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d4, d9, d14, 0.0D, 0.0D, 0.0D);
				}
			}

			if (Blocks.FIRE.canCatchFire(worldIn, pos.north(), EnumFacing.SOUTH))
			{
				for (int l = 0; l < 2; ++l)
				{
					double d5 = (double)pos.getX() + rand.nextDouble();
					double d10 = (double)pos.getY() + rand.nextDouble();
					double d15 = (double)pos.getZ() + rand.nextDouble() * 0.10000000149011612D;
					worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d5, d10, d15, 0.0D, 0.0D, 0.0D);
				}
			}

			if (Blocks.FIRE.canCatchFire(worldIn, pos.south(), EnumFacing.NORTH))
			{
				for (int i1 = 0; i1 < 2; ++i1)
				{
					double d6 = (double)pos.getX() + rand.nextDouble();
					double d11 = (double)pos.getY() + rand.nextDouble();
					double d16 = (double)(pos.getZ() + 1) - rand.nextDouble() * 0.10000000149011612D;
					worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d6, d11, d16, 0.0D, 0.0D, 0.0D);
				}
			}

			if (Blocks.FIRE.canCatchFire(worldIn, pos.up(), EnumFacing.DOWN))
			{
				for (int j1 = 0; j1 < 2; ++j1)
				{
					double d7 = (double)pos.getX() + rand.nextDouble();
					double d12 = (double)(pos.getY() + 1) - rand.nextDouble() * 0.10000000149011612D;
					double d17 = (double)pos.getZ() + rand.nextDouble();
					worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d7, d12, d17, 0.0D, 0.0D, 0.0D);
				}
			}
		}
		else
		{
			for (int i = 0; i < 3; ++i)
			{
				double d0 = (double)pos.getX() + rand.nextDouble();
				double d1 = (double)pos.getY() + rand.nextDouble() * 0.5D + 0.5D;
				double d2 = (double)pos.getZ() + rand.nextDouble();
				worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, d0, d1, d2, 0.0D, 0.0D, 0.0D);
			}
		}
	}

	@Override
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(AGE, Integer.valueOf(meta));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public BlockRenderLayer getRenderLayer()
	{
		return BlockRenderLayer.CUTOUT;
	}

	@Override
	public int getMetaFromState(IBlockState state)
	{
		return ((Integer)state.getValue(AGE)).intValue();
	}

	@Override
	protected BlockStateContainer createBlockState()
	{
		return new BlockStateContainer(this, new IProperty[] {AGE, NORTH, EAST, SOUTH, WEST, UPPER});
	}

	/*================================= Forge Start ======================================*/
	/**
	 * Side sensitive version that calls the block function.
	 *
	 * @param world The current world
	 * @param pos Block position
	 * @param face The side the fire is coming from
	 * @return True if the face can catch fire.
	 */
	@Override
	public boolean canCatchFire(IBlockAccess world, BlockPos pos, EnumFacing face)
	{
		//System.err.println("canCatchFire " + world.getBlockState(pos).getBlock().isFlammable(world, pos, face));
		return world.getBlockState(pos).getBlock().isFlammable(world, pos, face);
	}
	/*================================= Forge Start ======================================*/

	@Override
	public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	{
		return BlockFaceShape.UNDEFINED;
	}

}
