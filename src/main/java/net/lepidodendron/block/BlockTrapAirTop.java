
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronBuilding;
import net.lepidodendron.gui.GUITrapAir;
import net.lepidodendron.item.ItemGlassJarItem;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockTrapAirTop extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:trap_air_top")
	public static final Block block = null;

	public BlockTrapAirTop(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.trap_air);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("trap_air_top"));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
		//		new ModelResourceLocation("lepidodendron:trap_air", "inventory"));
	}

	public static class BlockCustom extends Block {

		public BlockCustom() {
			super(Material.IRON);
			setTranslationKey("pf_trap_air");
			setSoundType(SoundType.METAL);
			setHardness(1F);
			setResistance(1F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabLepidodendronBuilding.tab);
		}

		@Override
		public void neighborChanged(IBlockState state, World world, BlockPos pos, Block neighborBlock, BlockPos fromPos) {

			if (!world.isRemote)
			{
				if (world.getBlockState(pos.down()).getBlock() != BlockTrapAir.block) {
					world.destroyBlock(pos, false);
					return;
				}

				boolean flag = world.isBlockPowered(pos);

				if (flag || neighborBlock.getDefaultState().canProvidePower())
				{
					BlockTrapAir.BlockCustom.releaseTrapped(world, pos);
				}
			}

			super.neighborChanged(state, world, pos, neighborBlock, fromPos);
		}

		@Override
		public boolean causesSuffocation(IBlockState state) {
			return false;
		}

		protected static final AxisAlignedBB AABBN1 = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 1.0D, 0.1875D);
		protected static final AxisAlignedBB AABBS1 = new AxisAlignedBB(0.0D, 0.0D, 0.8125D, 1.0D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBE1 = new AxisAlignedBB(0.8125D, 0.0D, 0.0D, 1.0D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBW1 = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 0.1875D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBU = new AxisAlignedBB(0.0D, 0.9370D, 0.0D, 1.0D, 1.0D, 1.0D);
		protected static final AxisAlignedBB AABBD = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0625D, 1.0D);

		@Override
		public void addCollisionBoxToList(IBlockState state, World worldIn, BlockPos pos, AxisAlignedBB entityBox, List<AxisAlignedBB> collidingBoxes, @Nullable Entity entityIn, boolean isActualState) {
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBN1);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBS1);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBE1);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBW1);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBU);
			addCollisionBoxToList(pos, entityBox, collidingBoxes, AABBD);
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {

			if (entity.getHeldItem(hand).getItem() == ItemGlassJarItem.block && BlockTrapAir.BlockCustom.hasTrapped(world, pos.down())) {
				EntityLivingBase entityTrapped = null;
				TileEntity tileEntity = world.getTileEntity(pos.down());
				if (tileEntity != null) {
					if (tileEntity instanceof BlockTrapAir.TileEntityTrapAir) {
						BlockTrapAir.TileEntityTrapAir te = (BlockTrapAir.TileEntityTrapAir) tileEntity;
						entityTrapped = te.getTrapped(world, pos);
					}
				}
				if (!world.isRemote) {
					BlockTrapAir.BlockCustom.itemInteractionForEntityJar(entity.getHeldItem(hand), entity, entityTrapped, hand);
				}
				return true;
			}
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			if (entity instanceof EntityPlayer) {
				((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUITrapAir.GUIID, world, pos.getX(), pos.getY() - 1, pos.getZ());
			}
			return true;
		}

		@Override
		public boolean hasComparatorInputOverride(IBlockState state) {
			return true;
		}

		@Override
		public int getComparatorInputOverride(IBlockState blockState, World worldIn, BlockPos pos) {
			if (BlockTrapAir.BlockCustom.hasTrapped(worldIn, pos.down())) {
				return 15;
			}
			return 0;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.GRAY;
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(Blocks.AIR, 1).getItem());
		}

		@Override
		public EnumBlockRenderType getRenderType(IBlockState state) {
			return EnumBlockRenderType.MODEL;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public BlockRenderLayer getRenderLayer() {
			return BlockRenderLayer.CUTOUT;
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.SOLID;
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean isFullCube(IBlockState state) {
			return false;
		}

		@Override
		public boolean doesSideBlockRendering(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing face) {
			return false;
		}
	}
}