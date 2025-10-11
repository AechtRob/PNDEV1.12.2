
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.creativetab.TabLepidodendronPlants;
import net.lepidodendron.item.ItemPhyllothecaItem;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockPhyllothecaStem extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:phyllotheca_stem")
	public static final Block block = null;
	public BlockPhyllothecaStem(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.phyllotheca_stem);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("phyllotheca_stem"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:phyllotheca_stem", "inventory"));
			ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockPhyllothecaStem.LEVEL).build());
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);
	
	public static class BlockCustom extends Block implements IAdvancementGranter {
	    
		public BlockCustom() {
			super(Material.WATER);
			setTranslationKey("pf_phyllotheca_stem");
			setSoundType(SoundType.PLANT);
			setHardness(0.5F);
			setResistance(0F);
			setLightLevel(0F);
			setLightOpacity(3);
			setCreativeTab(TabLepidodendronPlants.tab);
			this.setDefaultState( this.blockState.getBaseState().withProperty(LEVEL, 0));
		}

		@Nullable
		@Override
		public CustomTrigger getModTrigger() {
			return ModTriggers.CLICK_PHYLLOTHECA;
		}

		@Override
		public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
			if (stack.getItem() == Items.SHEARS && LepidodendronConfig.doPropagation
					&&
					(worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.ROCK
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY
							|| worldIn.getBlockState(pos.down()).getMaterial() == Material.GRASS
							|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.WATER
							&& worldIn.getBlockState(pos.down()).getBlock() != this
							&& worldIn.getBlockState(pos.down()).getBlock() != BlockPhyllotheca.block
							&& (
							worldIn.getBlockState(pos.down(2)).getMaterial() == Material.GROUND
									|| worldIn.getBlockState(pos.down(2)).getMaterial() == Material.SAND
									|| worldIn.getBlockState(pos.down(2)).getMaterial() == Material.ROCK
									|| worldIn.getBlockState(pos.down(2)).getMaterial() == Material.CLAY
									|| worldIn.getBlockState(pos.down(2)).getMaterial() == Material.GRASS)
					)
					)
			) {
				EntityItem entityToSpawn = new EntityItem(worldIn, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(this, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				worldIn.spawnEntity(entityToSpawn);
			}
			else {
				super.harvestBlock(worldIn, player, pos, state, te, stack);
			}
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        return state.withProperty(LEVEL, 0);
	    }

	    @Override
		public void getDrops(NonNullList<ItemStack> drops, IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
			drops.add(new ItemStack(Blocks.AIR, (int) (1)));
		}

		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

	    @Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemPhyllothecaItem.block, (int) (1));
		}

		@Override
	    public IBlockState getStateFromMeta(int meta)
	    {
	        //return this.getDefaultState();
	        return this.getDefaultState();
	    }

	    @Override
	    public int getMetaFromState(IBlockState state)
	    {
	        return 0;
	    }

		@Override
	    @Nullable
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return NULL_AABB;
	    }

	    @Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {LEVEL});
	    }
	    
		@Override
	    public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

	    @SideOnly(Side.CLIENT)
	    @Override
	    public BlockRenderLayer getRenderLayer()
	    {
	        return BlockRenderLayer.CUTOUT_MIPPED;
	    }

	    @Override
	    public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing facing)
	    {
	        return BlockFaceShape.UNDEFINED;
	    }

		@Override
	    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
	    	
		    	
			super.onBlockAdded(world, pos, state);
	    }

	    public boolean isWaterBlock(World world, BlockPos pos) {
			IBlockState state  = world.getBlockState(pos);
			if (state.getMaterial() == Material.WATER
					&& (state.getBlock() instanceof BlockLiquid || state.getBlock() instanceof BlockFluidBase
					|| state.getBlock() == this)) {
				return true;
			}
			return false;
		}

	    @Override
	    public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
			//Remove the upper block(s) and propagate full destruction:
			worldIn.scheduleUpdate(pos.up(2), BlockPhyllotheca.block, 1);
			if (worldIn.getBlockState(pos.down()).getBlock() == this) {
				worldIn.destroyBlock(pos.down(), true);
			}
			if (worldIn.getBlockState(pos.up()).getBlock() == this) {
				worldIn.destroyBlock(pos.up(), true);
			}
	    	super.breakBlock(worldIn, pos, state);
	    }

	    public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	    {
			int colWater = 1;
			boolean isAir = false;
	    	while (colWater < 5 && isWaterBlock(worldIn, pos.up(colWater))) {
	    		//Check the water column:
	    		if (worldIn.isAirBlock(pos.up(colWater + 1))
	    		 	|| worldIn.getBlockState(pos.up(colWater + 1)).getBlock() == BlockPhyllotheca.block)
	    		{
	    			isAir = true;
	    		}
	    		colWater = colWater + 1;
	    	}
	    	if (!isAir) {return false;}

	        if (isWaterBlock(worldIn, pos.up()) && isWaterBlock(worldIn, pos)
	        	&& (((worldIn.getBlockState(pos.down()).getMaterial() == Material.SAND)
					|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.GROUND)
					|| (worldIn.getBlockState(pos.down()).getMaterial() == Material.CLAY))
					|| (worldIn.getBlockState(pos.down()).getBlock() == this))
				) {
	        		return true;
	        	}
	        return false;
	    }

	    @Override
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			//super.updateTick(world, pos, state, random);
			if (!this.canPlaceBlockAt(world, pos)) {
				world.destroyBlock(pos, true);
			}
		}

	    @Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			//super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			world.scheduleUpdate(pos, this, 1);
		}

	}
}
