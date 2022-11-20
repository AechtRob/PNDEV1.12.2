
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockLabBenchHopper extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:lab_bench_hopper")
	public static final Block block = null;

	public BlockLabBenchHopper(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.lab_bench);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("lab_bench_hopper"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	//@Override
	//public void init(FMLInitializationEvent event) {
	//	GameRegistry.registerTileEntity(TileEntityHopper.class, "lepidodendron:tileentitydna_recombiner_centrifuge");
	//}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("lepidodendron:lab_bench_hopper", "inventory"));
	}

	public static class BlockCustom extends BlockHopper {
		public static final PropertyBool LEFT = PropertyBool.create("left");
		public static final PropertyBool RIGHT= PropertyBool.create("right");

		public BlockCustom() {
			super();
			setTranslationKey("pf_lab_bench_hopper");
			setSoundType(SoundType.WOOD);
			setHardness(2F);
			setResistance(3F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.DOWN).withProperty(ENABLED, Boolean.valueOf(true)));
		}

		@Override
		public boolean isTopSolid(IBlockState state)
		{
			return true;
		}

		@Override
		public TileEntity createNewTileEntity(World worldIn, int meta)
		{
			return new TileEntityHopper();
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.GRAY;
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			boolean left = false;
			boolean right = false;

			if (state.getValue(FACING) == EnumFacing.NORTH) {
				if (worldIn.getBlockState(pos.west()).getBlock() == this || worldIn.getBlockState(pos.west()).getBlock() == BlockLabBench.block ) {
					left = true;
				}
				if (worldIn.getBlockState(pos.east()).getBlock() == this || worldIn.getBlockState(pos.east()).getBlock() == BlockLabBench.block ) {
					right = true;
				}
			}
			else if (state.getValue(FACING) == EnumFacing.SOUTH) {
				if (worldIn.getBlockState(pos.west()).getBlock() == this || worldIn.getBlockState(pos.west()).getBlock() == BlockLabBench.block ) {
					right = true;
				}
				if (worldIn.getBlockState(pos.east()).getBlock() == this || worldIn.getBlockState(pos.east()).getBlock() == BlockLabBench.block ) {
					left = true;
				}
			}
			else if (state.getValue(FACING) == EnumFacing.WEST) {
				if (worldIn.getBlockState(pos.south()).getBlock() == this || worldIn.getBlockState(pos.south()).getBlock() == BlockLabBench.block ) {
					left = true;
				}
				if (worldIn.getBlockState(pos.north()).getBlock() == this || worldIn.getBlockState(pos.north()).getBlock() == BlockLabBench.block ) {
					right = true;
				}
			}
			else if (state.getValue(FACING) == EnumFacing.EAST) {
				if (worldIn.getBlockState(pos.south()).getBlock() == this || worldIn.getBlockState(pos.south()).getBlock() == BlockLabBench.block ) {
					right = true;
				}
				if (worldIn.getBlockState(pos.north()).getBlock() == this || worldIn.getBlockState(pos.north()).getBlock() == BlockLabBench.block ) {
					left = true;
				}
			}

			return state.withProperty(RIGHT, right).withProperty(LEFT, left);
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(this, 1).getItem());
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, LEFT, RIGHT, ENABLED});
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			if (face == EnumFacing.UP) {
				return BlockFaceShape.BOWL;
			}
			if (face == EnumFacing.DOWN) {
				return BlockFaceShape.SOLID;
			}
			return BlockFaceShape.UNDEFINED;
		}

		@Override
		public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
		{
			return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing()).withProperty(ENABLED, Boolean.valueOf(true));
		}

		@Override
		public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
		{
			super.onBlockPlacedBy(worldIn, pos, state, placer, stack);

			if (stack.hasDisplayName())
			{
				TileEntity tileentity = worldIn.getTileEntity(pos);

				if (tileentity instanceof TileEntityHopper)
				{
					((TileEntityHopper)tileentity).setCustomName(stack.getDisplayName());
				}
			}
		}

		@Override
		public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		{
			if (worldIn.isRemote)
			{
				return true;
			}
			else
			{
				TileEntity tileentity = worldIn.getTileEntity(pos);

				if (tileentity instanceof TileEntityHopper)
				{
					playerIn.displayGUIChest((TileEntityHopper)tileentity);
					playerIn.addStat(StatList.HOPPER_INSPECTED);
				}

				return true;
			}
		}

		@Override
		public void breakBlock(World worldIn, BlockPos pos, IBlockState state)
		{
			TileEntity tileentity = worldIn.getTileEntity(pos);

			if (tileentity instanceof TileEntityHopper)
			{
				InventoryHelper.dropInventoryItems(worldIn, pos, (TileEntityHopper)tileentity);
				worldIn.updateComparatorOutputLevel(pos, this);
			}

			super.breakBlock(worldIn, pos, state);
		}

	}

}
