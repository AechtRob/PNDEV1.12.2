
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.*;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

import java.util.Random;


@ElementsLepidodendronMod.ModElement.Tag
public class BlockPrehistoricGroundHorsetail extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:horsetail_prehistoric_ground_cover")
	public static final Block block = null;
	public BlockPrehistoricGroundHorsetail(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.horsetail_prehistoric_ground_cover);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("dirt", BlockPrehistoricGroundHorsetail.block);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("horsetail_prehistoric_ground_cover"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:horsetail_prehistoric_ground_cover", "inventory"));
	}

	public static final PropertyBool SNOWY = PropertyBool.create("snowy");
	
	public static class BlockCustom extends Block implements IGrowable {
		public BlockCustom() {
			super(Material.GROUND, MapColor.GREEN);
			setTranslationKey("pf_horsetail_prehistoric_ground_cover");
			setSoundType(SoundType.PLANT);
        	setDefaultState(this.blockState.getBaseState().withProperty(SNOWY, Boolean.valueOf(false)));
        	setTickRandomly(true);
			setCreativeTab(TabLepidodendronMisc.tab);
			setHarvestLevel("shovel", 0);
			setHardness(0.5F);
			setResistance(0.5F);
        	//useNeighborBrightness = true;
		}

		@Override    
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        Block block = worldIn.getBlockState(pos.up()).getBlock();
	        return state.withProperty(SNOWY, Boolean.valueOf(block == Blocks.SNOW || block == Blocks.SNOW_LAYER));
	    }



		@Override
		public boolean canSustainPlant(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing direction, IPlantable plantable) {
			net.minecraftforge.common.EnumPlantType plantType = plantable.getPlantType(world, pos.offset(direction));
			if (plantable == Blocks.MELON_STEM || plantable == Blocks.PUMPKIN_STEM)
			{
				return true;
			}
			switch (plantType)
			{
				case Cave:   return state.isSideSolid(world, pos, EnumFacing.UP);
				case Plains: return true;
				case Beach:
					boolean hasWater = (world.getBlockState(pos.east()).getMaterial() == Material.WATER ||
							world.getBlockState(pos.west()).getMaterial() == Material.WATER ||
							world.getBlockState(pos.north()).getMaterial() == Material.WATER ||
							world.getBlockState(pos.south()).getMaterial() == Material.WATER);
					return hasWater;
			}

			return super.canSustainPlant(state, world, pos, direction, plantable);
		}

		@Override
		public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
		{
			if (!worldIn.isRemote)
			{
				if (!worldIn.isAreaLoaded(pos, 3)) return; // Forge: prevent loading unloaded chunks when checking neighbor's light and spreading
				if (((worldIn.getLightFromNeighbors(pos.up()) < 4 && worldIn.getBlockState(pos.up()).getLightOpacity(worldIn, pos.up()) > 2))
				)
				{
					worldIn.setBlockState(pos, Blocks.DIRT.getDefaultState());
				}
				else
				{
					if (worldIn.getLightFromNeighbors(pos.up()) >= 9)
					{
						for (int i = 0; i < 4; ++i)
						{
							BlockPos blockpos = pos.add(rand.nextInt(3) - 1, rand.nextInt(3) - 1, rand.nextInt(3) - 1);

							if (blockpos.getY() >= 0 && blockpos.getY() < 256 && !worldIn.isBlockLoaded(blockpos))
							{
								return;
							}

							IBlockState iblockstate = worldIn.getBlockState(blockpos.up());
							IBlockState iblockstate1 = worldIn.getBlockState(blockpos);

							if (
									(
											(iblockstate1.getBlock() == Blocks.DIRT && iblockstate1.getValue(BlockDirt.VARIANT) == BlockDirt.DirtType.DIRT)
												|| (iblockstate1.getBlock() == BlockSandyDirt.block)
												|| (iblockstate1.getBlock() == BlockSandyDirtPangaean.block)
												|| (iblockstate1.getBlock() == BlockSandyDirtRed.block)
												|| (iblockstate1.getBlock() == BlockSiltyDirt.block)
												|| (iblockstate1.getBlock() == BlockSandyDirtWhite.block)
												|| (iblockstate1.getBlock() == BlockSandyDirtBlack.block)
												|| (iblockstate1.getBlock() == BlockSandyDirtGrey.block)
									)
											&& (worldIn.getLightFromNeighbors(blockpos.up()) >= 4 && iblockstate.getLightOpacity(worldIn, pos.up()) <= 2)
							)
							{
								worldIn.setBlockState(blockpos, BlockPrehistoricGroundHorsetail.block.getDefaultState());
							}
						}
					}
				}
			}
		}

		@SideOnly(Side.CLIENT)
		public BlockRenderLayer getRenderLayer()
		{
			return BlockRenderLayer.CUTOUT_MIPPED;
		}

		@Override
		public int getMetaFromState(IBlockState state)
		{
			return 0;
		}

		@Override
		protected BlockStateContainer createBlockState()
		{
			return new BlockStateContainer(this, new IProperty[] {SNOWY});
		}

		@Override
		public boolean isOpaqueCube(IBlockState state)
		{
			return true;
		}

		@Override
		public boolean isFullBlock(IBlockState state)
		{
			return true;
		}

		@Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(Blocks.DIRT, (int) (1), 0));
		}

		@Override
		protected boolean canSilkHarvest()
		{
			return true;
		}

		@Override
		public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
		{
			return true;
		}

		@Override
		public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
		{
			return true;
		}

		@Override
		public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
		{
			BlockPos blockpos = pos.up();

			for (int i = 0; i < 128; ++i)
			{
				BlockPos blockpos1 = blockpos;
				int j = 0;

				while (true)
				{
					if (j >= i / 16)
					{
						if (worldIn.isAirBlock(blockpos1))
						{

							int h = rand.nextInt(5);
							IBlockState iblockstate1 = BlockFieldHorsetail.block.getDefaultState();
							switch (h) {
								case 0: default:
									iblockstate1 = BlockFieldHorsetail.block.getDefaultState();
									break;

								case 1:
									iblockstate1 = BlockAridHorsetail.block.getDefaultState();
									break;

								case 2:
									iblockstate1 = BlockGrassyHorsetail.block.getDefaultState();
									break;

								case 3:
									iblockstate1 = BlockWoodHorsetail.block.getDefaultState();
									break;

								case 4:
									iblockstate1 = BlockGiantHorsetail.block.getDefaultState();
									break;
							}

							if (worldIn.getBlockState(blockpos1.down()).getBlock() == this) {
								worldIn.setBlockState(blockpos1, iblockstate1, 3);
								iblockstate1.getBlock().onBlockAdded(worldIn, blockpos1, iblockstate1);
							}

						}

						break;
					}

					blockpos1 = blockpos1.add(rand.nextInt(3) - 1, (rand.nextInt(3) - 1) * rand.nextInt(3) / 2, rand.nextInt(3) - 1);

					if (worldIn.getBlockState(blockpos1.down()).getBlock() != this || worldIn.getBlockState(blockpos1).isNormalCube())
					{
						break;
					}

					++j;
				}
			}
		}

		public void onFallenUpon(World worldIn, BlockPos pos, Entity entityIn, float fallDistance)
		{
			entityIn.fall(fallDistance, 0.2F);
		}

		public void onLanded(World worldIn, Entity entityIn)
		{
			if (entityIn.isSneaking())
			{
				super.onLanded(worldIn, entityIn);
			}
			else if (entityIn.motionY < 0.0D)
			{
				entityIn.motionY = (-entityIn.motionY * 0.4D);

				if (!(entityIn instanceof EntityLivingBase))
				{
					entityIn.motionY *= 0.4D;
				}
			}
		}
	}

}
