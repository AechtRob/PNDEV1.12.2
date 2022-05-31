
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.lepidodendron.item.ItemSulphur;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenReed;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockSulphurVent extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:sulphur_vent")
	public static final Block block = null;
	public BlockSulphurVent(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.sulphur_vent);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("sulphur_vent"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:sulphur_vent", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockSulphurVent.LEVEL).build());
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {

		if (dimID != LepidodendronConfig.dimPrecambrian) {
			return;
		}

		double genChance = 0.5;

		if (Math.random() > genChance) {
			for (int i = 0; i < 10; i++) {
				int l6 = chunkX + random.nextInt(16) + 8;
				int i11 = random.nextInt(128);
				int l14 = chunkZ + random.nextInt(16) + 8;
				(new WorldGenReed() {
					@Override
					public boolean generate(World world, Random random, BlockPos pos) {
						for (int i = 0; i < 14; ++i) {
							BlockPos blockpos1 = pos.add(random.nextInt(6) - random.nextInt(6), 0, random.nextInt(6) - random.nextInt(6));
							//BlockPos blockpos2 = blockpos1.down();
							//int j = random.nextInt(3) + 1;
							//j = Math.min(3, j);
							//for (int k = 0; k < j; ++k) {
								//System.err.println("SeaLavel: " + (world.getSeaLevel()));
								//System.err.println("Try to spawn at: "  + blockpos1.up(k).getY());
								if (
									//((world.isAirBlock(blockpos1.down()) || ((BlockFalling) block).canFallThrough(world.getBlockState(blockpos1.down()))) && blockpos1.getY() >= 0)
									//&& ((world.isAirBlock(blockpos1.up(k).down()) || ((BlockFalling) block).canFallThrough(world.getBlockState(blockpos1.up(k).down()))) && blockpos1.up(k).getY() >= 0)
									((world.getBlockState(blockpos1.down()).getMaterial() == Material.SAND)
										|| (world.getBlockState(blockpos1.down()).getMaterial() == Material.ROCK)
										|| (world.getBlockState(blockpos1.down()).getMaterial() == Material.GROUND))
										&& (world.getBlockState(blockpos1).getMaterial() == Material.WATER)
										&& (world.getBlockState(blockpos1.up()).getMaterial() == Material.WATER)
								)

								{
									world.setBlockState(blockpos1, block.getDefaultState(), 2);
								}
							//}
						}
						return true;
					}
				}).generate(world, random, new BlockPos(l6, i11, l14));
			}
		}
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);

	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.WATER);
			setTranslationKey("pf_sulphur_vent");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 0);
			setHardness(0.2F);
			setResistance(0.5F);
			setCreativeTab(TabLepidodendronMisc.tab);
			this.setDefaultState( this.blockState.getBaseState().withProperty(LEVEL, 0));
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
		{
			return state.withProperty(LEVEL, 0);
		}

		@Override
		public IBlockState getStateFromMeta(int meta)
		{
			return this.getDefaultState();
		}

		@Override
		public int getMetaFromState(IBlockState state)
		{
			return 0;
		}

		@Override
		protected BlockStateContainer createBlockState()
		{
			return new BlockStateContainer(this, new IProperty[] {LEVEL});
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(Blocks.GRAVEL, (int) (1)));
			if (Math.random() > 0.5) {drops.add(new ItemStack(ItemSulphur.block, (int) (1)));}
		}

		@Override
		protected boolean canSilkHarvest()
		{
			return true;
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
		{
			return BlockFaceShape.UNDEFINED;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer()
		{
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.CUTOUT_MIPPED;
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}

		public boolean isWaterBlock(World world, BlockPos pos) {
			if (world.getBlockState(pos).getMaterial() == Material.WATER) {
				//IBlockState iblockstate = world.getBlockState(pos);
				//if (((Integer)iblockstate.getValue(BlockLiquid.LEVEL)).intValue() == 0) {
					return true;
				//}
			}
			return false;
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			world.scheduleUpdate(pos, this, 1);
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
			if (!canPlaceBlockAt(worldIn, pos)) {
				worldIn.setBlockToAir(pos);
			}
		}

		public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
		{
			if ((isWaterBlock(worldIn, pos)) && (isWaterBlock(worldIn, pos.up()))) {
				return super.canPlaceBlockAt(worldIn, pos);
			}
			return false;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void randomDisplayTick(IBlockState state, World world, BlockPos pos, Random random) {
			super.randomDisplayTick(state, world, pos, random);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			int i = x;
			int j = y;
			int k = z;
			if (true)
				for (int l = 0; l < 5; ++l) {
					double d0 = (i + random.nextFloat());
					double d1 = (j + random.nextFloat());
					double d2 = (k + random.nextFloat());
					int i1 = random.nextInt(2) * 2 - 1;
					double d3 = (random.nextFloat() - 0.5D) * 0.1999999985098839D;
					double d4 = (random.nextFloat() - 0.5D) * 0.1999999985098839D;
					double d5 = (random.nextFloat() - 0.5D) * 0.1999999985098839D;
					world.spawnParticle(EnumParticleTypes.WATER_BUBBLE, d0, d1, d2, d3, d4, d5);
				}
				for (int l = 0; l < 5; ++l) {
					double d0 = (i + random.nextFloat());
					double d1 = (j + random.nextFloat());
					double d2 = (k + random.nextFloat());
					int i1 = random.nextInt(2) * 2 - 1;
					double d3 = (random.nextFloat() - 0.5D) * 0.1999999985098839D;
					double d4 = (random.nextFloat() - 0.5D) * 0.1999999985098839D;
					double d5 = (random.nextFloat() - 0.5D) * 0.1999999985098839D;
					world.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, d0, d1, d2, d3, d4, d5);
				}
		}
	}
}
