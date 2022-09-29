
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.item.ItemAcidBath;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidUtil;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockAcidBathEnd extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:acid_bath_end")
	public static final Block block = null;

	public BlockAcidBathEnd(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.acid_bath);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("acid_bath_end"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:acid_bath_end", "inventory"));
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyInteger ACID = PropertyInteger.create("acid", 0, 15);

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_acid_bath_end");
			setSoundType(SoundType.METAL);
			setHardness(5F);
			setResistance(5F);
			setLightLevel(0F);
			setLightOpacity(1);
			setCreativeTab(null);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.SOUTH).withProperty(ACID, 0));
		}

		//NORTH
		protected static final AxisAlignedBB AABBN = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.875D, 0.9375D);

		//SOUTH
		protected static final AxisAlignedBB AABBS = new AxisAlignedBB(0.0D, 0.0D, 0.0625D, 1.0D, 0.875D, 1.0D);

		//EAST
		protected static final AxisAlignedBB AABBE = new AxisAlignedBB(0.0625D, 0.0D, 0.0D, 1.0D, 0.875D, 1.0D);

		//WEST
		protected static final AxisAlignedBB AABBW = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.9375D, 0.875D, 1.0D);

		@Override
		public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
			if (state.getValue(FACING) == EnumFacing.NORTH) {
				return AABBN;
			}
			else if (state.getValue(FACING) == EnumFacing.SOUTH) {
				return AABBS;
			}
			else if (state.getValue(FACING) == EnumFacing.EAST) {
				return AABBE;
			}
			else if (state.getValue(FACING) == EnumFacing.WEST) {
				return AABBW;
			}
			else {
				return new AxisAlignedBB(0,0,0,1,1,1);
			}
		}

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
			if (state.getValue(FACING) == EnumFacing.NORTH) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBN);
			}
			else if (state.getValue(FACING) == EnumFacing.SOUTH) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBS);
			}
			else if (state.getValue(FACING) == EnumFacing.EAST) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBE);
			}
			else if (state.getValue(FACING) == EnumFacing.WEST) {
				addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBW);
			}

		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemAcidBath.block, 1);
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

			IBlockState endState = worldIn.getBlockState(pos.offset(state.getValue(FACING)));
			if (endState.getBlock() != BlockAcidBath.block) {
				worldIn.destroyBlock(pos, true);
				return;
			}
			else {
				if (endState.getValue(FACING) != state.getValue(FACING).getOpposite()) {
					worldIn.destroyBlock(pos, true);
					return;
				}
			}

			if (worldIn.getBlockState(pos.up()).getBlock() != BlockAcidBathEndUp.block) {
				worldIn.destroyBlock(pos, true);
				return;
			}

			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
		}


		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			TileEntity tileEntity = worldIn.getTileEntity(pos.offset(state.getValue(FACING)));
			if (tileEntity != null) {
				if (tileEntity instanceof BlockAcidBath.TileEntityAcidBath) {
					BlockAcidBath.TileEntityAcidBath te = (BlockAcidBath.TileEntityAcidBath) tileEntity;
					return state.withProperty(ACID, te.getFill());
				}
			}

			return state.withProperty(ACID, 0);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(Items.AIR, 1).getItem());
		}

		@Override
		public boolean hasComparatorInputOverride(IBlockState state) {
			return true;
		}

		@Override
		public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos) {
			TileEntity tileEntity = worldIn.getTileEntity(pos.offset(blockState.getValue(FACING)));
			if (tileEntity != null) {
				if (tileEntity instanceof BlockAcidBath.TileEntityAcidBath) {
					BlockAcidBath.TileEntityAcidBath te = (BlockAcidBath.TileEntityAcidBath) tileEntity;
					return te.getFillFloor();
				}
			}
			return 0;
		}

		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer()
		{
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
			return layer == BlockRenderLayer.TRANSLUCENT;
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, ACID});
		}

		@Override
		public IBlockState withRotation(IBlockState state, Rotation rot) {
			return state.withProperty(FACING, rot.rotate((EnumFacing) state.getValue(FACING)));
		}

		@Override
		public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
			return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(FACING)));
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(FACING, EnumFacing.byIndex(meta));
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			if (state.getValue(FACING) == EnumFacing.NORTH && ((face == EnumFacing.SOUTH && LepidodendronConfig.machinesRF) || face == EnumFacing.EAST || face == EnumFacing.WEST)
					|| state.getValue(FACING) == EnumFacing.SOUTH && ((face == EnumFacing.NORTH && LepidodendronConfig.machinesRF) || face == EnumFacing.EAST || face == EnumFacing.WEST)
					|| state.getValue(FACING) == EnumFacing.EAST && ((face == EnumFacing.WEST && LepidodendronConfig.machinesRF) || face == EnumFacing.NORTH || face == EnumFacing.SOUTH)
					|| state.getValue(FACING) == EnumFacing.WEST && ((face == EnumFacing.EAST && LepidodendronConfig.machinesRF) || face == EnumFacing.NORTH || face == EnumFacing.SOUTH)
					|| face == EnumFacing.DOWN) {
				return BlockFaceShape.SOLID;
			}
			return BlockFaceShape.UNDEFINED;
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

		@Override
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}

		@Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
			TileEntity te = worldIn.getTileEntity(pos.offset(state.getValue(FACING)));
			if (te == null || (!(te instanceof BlockAcidBath.TileEntityAcidBath))) {
				return false;
			}
			IFluidHandler handler = ((BlockAcidBath.TileEntityAcidBath)te).getCapabilityBucket(CapabilityFluidHandler.FLUID_HANDLER_CAPABILITY, facing);
			ItemStack stack = playerIn.getHeldItem(hand);

			if (FluidUtil.getFluidContained(stack) != null) {
				if (FluidUtil.getFluidContained(stack).getFluid() != FluidRegistry.lookupFluidForBlock(BlockAcid.block)) {
					return false;
				}
			}

			if (FluidUtil.interactWithFluidHandler(playerIn, hand, handler)) {
				return true;
			}

			return FluidUtil.getFluidHandler(stack) != null; //Stops buckets getting placed
		}
	}

}
