
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronStatic;
import net.lepidodendron.item.ItemHoldfast;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockCrinoidTraumatocrinus extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:crinoid_traumatocrinus")
	public static final Block block = null;
	public BlockCrinoidTraumatocrinus(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.crinoid_traumatocrinus);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom());
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:crinoid_traumatocrinus", "inventory"));
		ModelLoader.setCustomStateMapper(block, (new StateMap.Builder()).ignore(BlockCrinoidTraumatocrinus.LEVEL).build());
	}

	public static final PropertyInteger LEVEL = PropertyInteger.create("level", 0, 15);
	public static final PropertyBool TOPSHOOT = PropertyBool.create("topshoot");
	public static final PropertyBool BASE = PropertyBool.create("base");

	//-------------------------------------------------------
	//Generation is done as a structure on floating wood!
	//-------------------------------------------------------
	
	public static class BlockCustom extends Block implements net.minecraftforge.common.IShearable  {

		public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 15);
		private static int crinoidheight;

		public BlockCustom() {
			super(Material.WATER);
			setSoundType(SoundType.PLANT);
			setCreativeTab(TabLepidodendronStatic.tab);
			setHardness(0F);
			setResistance(0F);
			setLightLevel(0F);
			crinoidheight = 10;
			this.setDefaultState(this.blockState.getBaseState().withProperty(BASE, false).withProperty(TOPSHOOT, false).withProperty(AGE, Integer.valueOf(0)));
        	this.setTickRandomly(true);
			setTranslationKey("pf_crinoid_traumatocrinus");
			setRegistryName("crinoid_traumatocrinus");
		}

		@Override
		public boolean removedByPlayer(IBlockState state, World world, BlockPos pos, EntityPlayer player, boolean willHarvest) {
			if (Math.random() > 0.9 && (!world.isRemote)) {
				EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), new ItemStack(ItemHoldfast.block, (int) (1)));
				entityToSpawn.setPickupDelay(10);
				world.spawnEntity(entityToSpawn);
			}
			return super.removedByPlayer(state, world, pos, player, willHarvest);
		}

		@Override
		public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {
			return true;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos){

			if (worldIn.getBlockState(pos).getBlock() != this) {
				return state;
			}
			boolean topshoot = false;
			boolean base = false;
			topshoot = worldIn.getBlockState(pos.down()).getBlock() != this;
			base = (!topshoot) && worldIn.getBlockState(pos.up()).getBlock() != this;
			return state
				.withProperty(TOPSHOOT, topshoot)
				.withProperty(BASE, base);
		}
		
		@Override public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos){ return true; }

		@Override
		public NonNullList<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
			return NonNullList.withSize(1, new ItemStack(this, (int) (1)));
		}
	
	    @Nullable
	    public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos)
	    {
	        return NULL_AABB;
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
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}
		
		@Override
		public boolean isFullCube(IBlockState state)
	    {
	        return false;
	    }

	    public IBlockState getStateFromMeta(int meta)
	    {
	        return this.getDefaultState().withProperty(AGE, Integer.valueOf(meta));
	    }

	    public int getMetaFromState(IBlockState state)
	    {
	        return ((Integer)state.getValue(AGE)).intValue();
	    }

	    protected BlockStateContainer createBlockState()
	    {
	        return new BlockStateContainer(this, new IProperty[] {LEVEL,AGE,TOPSHOOT,BASE});
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
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return new ItemStack(Blocks.AIR, (int) (1)).getItem();
		}
		
		@Override
		protected boolean canSilkHarvest()
	    {
	        return false;
	    }

		public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face)
	    {
	        return BlockFaceShape.UNDEFINED;
	    }

		@Override
		public boolean canPlaceBlockAt(World world, BlockPos pos) {

			boolean water = false;

			if (world.getBlockState(pos.up()).getBlock() == this) {
				water = true;
			}

			if (world.getBlockState(pos.up()).getMaterial() == Material.WOOD
				&& world.getBlockState(pos.up()).getBlockFaceShape(world, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID) {
				water = true;
			}

			if (world.getBlockState(pos.up()).getBlock() != this &&
				!(world.getBlockState(pos.up()).getMaterial() == Material.WOOD
						&& world.getBlockState(pos.up()).getBlockFaceShape(world, pos.up(), EnumFacing.DOWN) == BlockFaceShape.SOLID)) {
				water = false;
			}

	        return (water);
	        		
		}

		public boolean canBlockStay(World worldIn, BlockPos pos)
	    {
	        return this.canPlaceBlockAt(worldIn, pos);
	    }

		@SideOnly(Side.CLIENT)
		public int colorMultiplier(IBlockAccess p_149720_1_, BlockPos pos, int pass) {
			return 16777215;
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {
			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
			if (!canPlaceBlockAt(world, pos)) {
				world.destroyBlock(pos, false);
			}
		}

		@Override //Grows downwards
		public void updateTick(World world, BlockPos pos, IBlockState state, Random random) {
			if (!canPlaceBlockAt(world, pos)) {
				world.destroyBlock(pos, false);
			}
			else {
				if (isWaterBlock(world, pos.down()) && isWaterBlock(world, pos.down(2))
					&& isWaterBlock(world, pos.down(3)) && isWaterBlock(world, pos.down(4))) {
					int l;
					for (l = 1; world.getBlockState(pos.up(l)).getBlock() == this; ++l);
					if (l < this.crinoidheight) {
						int i1 = (Integer) state.getValue(AGE);
						if (i1 == 15) {
							world.setBlockState(pos.down(), this.getDefaultState());
							world.setBlockState(pos, state.withProperty(AGE, 0), 4);
						} else {
							world.setBlockState(pos, state.withProperty(AGE, i1 + 1), 4);
						}
					}
				}
			}
		}

		public boolean isWaterBlock(World world, BlockPos pos) { //Different logic this time! We do need actual water blocks, not merely material
			if ((world.getBlockState(pos).getBlock() == Blocks.WATER)
				|| (world.getBlockState(pos).getBlock() == Blocks.FLOWING_WATER)) {
					return true;
			}
	    	return false;
	    }

	    
	    @SideOnly(Side.CLIENT)
		@Override
	    public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
	        if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Crinoid");
				tooltip.add("Periods: Triassic");
			}
	        super.addInformation(stack, player, tooltip, advanced);
	    }
	}

}