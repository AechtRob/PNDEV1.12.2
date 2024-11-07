
package net.lepidodendron.block;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.gui.GUIArchiveSorterTop;
import net.lepidodendron.item.ItemArchiveSorter;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class BlockArchiveSorterTopFiller extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:archive_sorter_top_filler")
	public static final Block block = null;

	public BlockArchiveSorterTopFiller(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.archive_sorter_top);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("archive_sorter_top_filler"));
		//elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
//		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
//				new ModelResourceLocation("lepidodendron:archive_sorter_top_filler", "inventory"));
	}

	public static class BlockCustom extends Block {
		public static final PropertyDirection FACING = BlockDirectional.FACING;
		public static final PropertyBool END = PropertyBool.create("end");

		public BlockCustom() {
			super(Material.WOOD);
			setTranslationKey("pf_archive_sorter_top_filler");
			setSoundType(SoundType.WOOD);
			setHardness(5F);
			setResistance(12F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(null);
			this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		}

		@Override
		public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
			return new ItemStack(ItemArchiveSorter.block, 1);
		}

		@Override
		public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			TileEntity te = worldIn.getTileEntity(pos.down(2));
			if (te instanceof BlockArchiveSorterBottom.TileEntityArchiveBottom) {
				if (((BlockArchiveSorterBottom.TileEntityArchiveBottom)te).getCategory() == 4) {
					state = state.withProperty(END, true);
				}
				else {
					state = state.withProperty(END, false);
				}
			}
			else {
				state = state.withProperty(END, false);
			}
			if (state.getValue(FACING) == EnumFacing.DOWN || state.getValue(FACING) == EnumFacing.UP) {
				return state.withProperty(FACING, EnumFacing.NORTH);
			}
			return state;
		}

		@Override
		public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
			return MapColor.GRAY;
		}

		@Override
		public Item getItemDropped(IBlockState state, Random rand, int fortune) {
			return (new ItemStack(Items.AIR, 1).getItem());
		}

		@Override
		protected net.minecraft.block.state.BlockStateContainer createBlockState() {
			return new net.minecraft.block.state.BlockStateContainer(this, new IProperty[]{FACING, END});
		}

		@Override
		public IBlockState getStateFromMeta(int meta) {
			return this.getDefaultState().withProperty(FACING, EnumFacing.byIndex(meta));
		}

		@Override
		public int getMetaFromState(IBlockState state) {
			return ((EnumFacing) state.getValue(FACING)).getIndex();
		}

		@Override
		public BlockFaceShape getBlockFaceShape(IBlockAccess world, IBlockState state, BlockPos pos, EnumFacing face) {
			return BlockFaceShape.SOLID;
		}

		@Override
		public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer entity, EnumHand hand, EnumFacing direction, float hitX, float hitY, float hitZ) {
			super.onBlockActivated(world, pos, state, entity, hand, direction, hitX, hitY, hitZ);
			TileEntity te = world.getTileEntity(pos.down(2));
			if (te instanceof BlockArchiveSorterBottom.TileEntityArchiveBottom && entity instanceof EntityPlayer) {
				EnumFacing facing = state.getValue(FACING).rotateY().getOpposite();
				if (world instanceof IBlockAccess) {
					facing = state.getActualState(world, pos).getValue(FACING).rotateY().getOpposite();
				}
				if (((BlockArchiveSorterBottom.TileEntityArchiveBottom) te).getCategory() == 1) {
					((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUIArchiveSorterTop.GUIID, world, pos.offset(facing).getX(), pos.offset(facing).getY(), pos.offset(facing).getZ());
				}
				if (((BlockArchiveSorterBottom.TileEntityArchiveBottom) te).getCategory() == 2) {
					((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUIArchiveSorterTop.GUIID, world, pos.offset(facing, 2).getX(), pos.offset(facing, 2).getY(), pos.offset(facing, 2).getZ());
				}
				if (((BlockArchiveSorterBottom.TileEntityArchiveBottom) te).getCategory() == 3) {
					((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUIArchiveSorterTop.GUIID, world, pos.offset(facing, 3).getX(), pos.offset(facing, 3).getY(), pos.offset(facing, 3).getZ());
				}
				if (((BlockArchiveSorterBottom.TileEntityArchiveBottom) te).getCategory() == 4) {
					((EntityPlayer) entity).openGui(LepidodendronMod.instance, GUIArchiveSorterTop.GUIID, world, pos.offset(facing, 4).getX(), pos.offset(facing, 4).getY(), pos.offset(facing, 4).getZ());
				}
			}

			return true;
		}

		@Override
		public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {

			if (!worldIn.isRemote) {
				TileEntity te = worldIn.getTileEntity(pos.down(2));
				if (te == null) {
					worldIn.destroyBlock(pos, true);
					super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
					return;
				}
				if (!(te instanceof BlockArchiveSorterBottom.TileEntityArchiveBottom)) {
					worldIn.destroyBlock(pos, true);
					super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
					return;
				}
				boolean flag = false;
				if (worldIn.getBlockState(pos.down()).getBlock() != BlockArchiveSorterBottomFiller.block) {
					flag = true;
				}
				switch (((BlockArchiveSorterBottom.TileEntityArchiveBottom) te).filingCategory) {
					case 0:
					default:
						flag = true;
						break;

					case 1:
						if (worldIn.getBlockState(pos.offset(state.getValue(FACING).rotateY())).getBlock() != this) {
							flag = true;
						}
						if (worldIn.getBlockState(pos.offset(state.getValue(FACING).getOpposite().rotateY())).getBlock() != BlockArchiveSorterTop.block) {
							flag = true;
						}
						break;

					case 2: case 3:
						if (worldIn.getBlockState(pos.offset(state.getValue(FACING).rotateY())).getBlock() != this) {
							flag = true;
						}
						if (worldIn.getBlockState(pos.offset(state.getValue(FACING).getOpposite().rotateY())).getBlock() != this) {
							flag = true;
						}
						break;

					case 4:
						if (worldIn.getBlockState(pos.offset(state.getValue(FACING).getOpposite().rotateY())).getBlock() != this) {
							flag = true;
						}
						break;

				}
				if (flag) {
					worldIn.destroyBlock(pos, true);
				}
			}

			super.neighborChanged(state, worldIn, pos, blockIn, fromPos);
		}

	}
}