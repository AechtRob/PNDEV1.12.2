
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockArchiveSorterBottom;
import net.lepidodendron.block.BlockArchiveSorterBottomFiller;
import net.lepidodendron.block.BlockArchiveSorterTop;
import net.lepidodendron.block.BlockArchiveSorterTopFiller;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemArchiveSorter extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:archive_sorter")
	public static final Item block = null;
	public ItemArchiveSorter(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.archive_sorter_top);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:archive_sorter", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setTranslationKey("pf_archive_sorter");
			setRegistryName("archive_sorter");
			setCreativeTab(TabLepidodendronMisc.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

		@Override
		public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		{
			if (facing != EnumFacing.UP)
			{
				return EnumActionResult.FAIL;
			}
			else
			{
				IBlockState iblockstate = worldIn.getBlockState(pos);
				Block block = iblockstate.getBlock();
				boolean flag = block.isReplaceable(worldIn, pos);

				if (!flag)
				{
					pos = pos.up();
				}

				int i = MathHelper.floor((double)(player.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
				EnumFacing enumfacing = EnumFacing.byHorizontalIndex(i);
				BlockPos blockposOffset1 = pos.offset(enumfacing.rotateY());
				BlockPos blockposOffset2 = pos.offset(enumfacing.rotateY()).offset(enumfacing.rotateY());
				BlockPos blockposOffset3 = pos.offset(enumfacing.rotateY()).offset(enumfacing.rotateY()).offset(enumfacing.rotateY());
				BlockPos blockposOffset4 = pos.offset(enumfacing.rotateY()).offset(enumfacing.rotateY()).offset(enumfacing.rotateY()).offset(enumfacing.rotateY());
				ItemStack itemstack = player.getHeldItem(hand);

				if (player.canPlayerEdit(pos, EnumFacing.UP, itemstack)
						&& player.canPlayerEdit(blockposOffset1, EnumFacing.UP, itemstack)
						&& player.canPlayerEdit(blockposOffset2, EnumFacing.UP, itemstack)
						&& player.canPlayerEdit(blockposOffset3, EnumFacing.UP, itemstack)
						&& player.canPlayerEdit(blockposOffset4, EnumFacing.UP, itemstack))
				{

					IBlockState iblockstateUp = worldIn.getBlockState(pos.up());
					IBlockState iblockstateUp2 = worldIn.getBlockState(pos.up(2));

					IBlockState iblockstateOffset1 = worldIn.getBlockState(blockposOffset1);
					IBlockState iblockstateOffset1Up = worldIn.getBlockState(blockposOffset1.up());
					IBlockState iblockstateOffset1Up2 = worldIn.getBlockState(blockposOffset1.up(2));

					IBlockState iblockstateOffset2 = worldIn.getBlockState(blockposOffset2);
					IBlockState iblockstateOffset2Up = worldIn.getBlockState(blockposOffset2.up());
					IBlockState iblockstateOffset2Up2 = worldIn.getBlockState(blockposOffset2.up(2));

					IBlockState iblockstateOffset3 = worldIn.getBlockState(blockposOffset3);
					IBlockState iblockstateOffset3Up = worldIn.getBlockState(blockposOffset3.up());
					IBlockState iblockstateOffset3Up2 = worldIn.getBlockState(blockposOffset3.up(2));

					IBlockState iblockstateOffset4 = worldIn.getBlockState(blockposOffset4);
					IBlockState iblockstateOffset4Up = worldIn.getBlockState(blockposOffset4.up());
					IBlockState iblockstateOffset4Up2 = worldIn.getBlockState(blockposOffset4.up(2));

					flag = block.isReplaceable(worldIn, pos);
					boolean flag1 = flag || worldIn.isAirBlock(pos);

					boolean flag2 = iblockstateOffset1.getBlock().isReplaceable(worldIn, blockposOffset1);
					boolean flag3 = flag2 || worldIn.isAirBlock(blockposOffset1);

					boolean flag4 = iblockstateOffset2.getBlock().isReplaceable(worldIn, blockposOffset2);
					boolean flag5 = flag4 || worldIn.isAirBlock(blockposOffset2);

					boolean flag6 = iblockstateOffset3.getBlock().isReplaceable(worldIn, blockposOffset3);
					boolean flag7 = flag6 || worldIn.isAirBlock(blockposOffset3);

					boolean flag8 = iblockstateOffset4.getBlock().isReplaceable(worldIn, blockposOffset4);
					boolean flag9 = flag8 || worldIn.isAirBlock(blockposOffset4);

					boolean flag10 = iblockstateUp.getBlock().isReplaceable(worldIn, pos.up());
					boolean flag11 = flag10 || worldIn.isAirBlock(pos.up());

					boolean flag12 = iblockstateOffset1Up.getBlock().isReplaceable(worldIn, blockposOffset1.up());
					boolean flag13 = flag12 || worldIn.isAirBlock(blockposOffset1.up());

					boolean flag14 = iblockstateOffset2Up.getBlock().isReplaceable(worldIn, blockposOffset2.up());
					boolean flag15 = flag14 || worldIn.isAirBlock(blockposOffset2.up());

					boolean flag16 = iblockstateOffset3Up.getBlock().isReplaceable(worldIn, blockposOffset3.up());
					boolean flag17 = flag16 || worldIn.isAirBlock(blockposOffset3.up());

					boolean flag18 = iblockstateOffset4Up.getBlock().isReplaceable(worldIn, blockposOffset4.up());
					boolean flag19 = flag18 || worldIn.isAirBlock(blockposOffset4.up());

					boolean flag20 = iblockstateUp2.getBlock().isReplaceable(worldIn, pos.up(2));
					boolean flag21 = flag20 || worldIn.isAirBlock(pos.up(2));

					boolean flag22 = iblockstateOffset1Up2.getBlock().isReplaceable(worldIn, blockposOffset1.up(2));
					boolean flag23 = flag22 || worldIn.isAirBlock(blockposOffset1.up(2));

					boolean flag24 = iblockstateOffset2Up2.getBlock().isReplaceable(worldIn, blockposOffset2.up(2));
					boolean flag25 = flag24 || worldIn.isAirBlock(blockposOffset2.up(2));

					boolean flag26 = iblockstateOffset3Up2.getBlock().isReplaceable(worldIn, blockposOffset3.up(2));
					boolean flag27 = flag26 || worldIn.isAirBlock(blockposOffset3.up(2));

					boolean flag28 = iblockstateOffset4Up2.getBlock().isReplaceable(worldIn, blockposOffset4.up(2));
					boolean flag29 = flag28 || worldIn.isAirBlock(blockposOffset4.up(2));


					if (flag1 && flag3 && flag5 && flag7 && flag9 && flag11 && flag13 && flag15
							&& flag17 && flag19 && flag21 && flag23 && flag25 && flag27 && flag29
							&& worldIn.getBlockState(pos.down()).isTopSolid()
							&& worldIn.getBlockState(blockposOffset1.down()).isTopSolid()
							&& worldIn.getBlockState(blockposOffset2.down()).isTopSolid()
							&& worldIn.getBlockState(blockposOffset3.down()).isTopSolid()
							&& worldIn.getBlockState(blockposOffset4.down()).isTopSolid())
					{
						worldIn.setBlockState(pos, BlockArchiveSorterBottom.block.getDefaultState().withProperty(BlockArchiveSorterBottom.BlockCustom.FACING, enumfacing), 3);
						TileEntity te = worldIn.getTileEntity(pos);
						if (te instanceof BlockArchiveSorterBottom.TileEntityArchiveBottom) {
							((BlockArchiveSorterBottom.TileEntityArchiveBottom)te).setCategory(0);
						}

						worldIn.setBlockState(blockposOffset1, BlockArchiveSorterBottom.block.getDefaultState().withProperty(BlockArchiveSorterBottom.BlockCustom.FACING, enumfacing), 3);
						te = worldIn.getTileEntity(blockposOffset1);
						if (te instanceof BlockArchiveSorterBottom.TileEntityArchiveBottom) {
							((BlockArchiveSorterBottom.TileEntityArchiveBottom)te).setCategory(1);
						}

						worldIn.setBlockState(blockposOffset2, BlockArchiveSorterBottom.block.getDefaultState().withProperty(BlockArchiveSorterBottom.BlockCustom.FACING, enumfacing), 3);
						te = worldIn.getTileEntity(blockposOffset2);
						if (te instanceof BlockArchiveSorterBottom.TileEntityArchiveBottom) {
							((BlockArchiveSorterBottom.TileEntityArchiveBottom)te).setCategory(2);
						}

						worldIn.setBlockState(blockposOffset3, BlockArchiveSorterBottom.block.getDefaultState().withProperty(BlockArchiveSorterBottom.BlockCustom.FACING, enumfacing), 3);
						te = worldIn.getTileEntity(blockposOffset3);
						if (te instanceof BlockArchiveSorterBottom.TileEntityArchiveBottom) {
							((BlockArchiveSorterBottom.TileEntityArchiveBottom)te).setCategory(3);
						}

						worldIn.setBlockState(blockposOffset4, BlockArchiveSorterBottom.block.getDefaultState().withProperty(BlockArchiveSorterBottom.BlockCustom.FACING, enumfacing), 3);
						te = worldIn.getTileEntity(blockposOffset4);
						if (te instanceof BlockArchiveSorterBottom.TileEntityArchiveBottom) {
							((BlockArchiveSorterBottom.TileEntityArchiveBottom)te).setCategory(4);
						}

						worldIn.setBlockState(pos.up(), BlockArchiveSorterBottomFiller.block.getDefaultState().withProperty(BlockArchiveSorterBottomFiller.BlockCustom.FACING, enumfacing), 3);
						worldIn.setBlockState(blockposOffset1.up(), BlockArchiveSorterBottomFiller.block.getDefaultState().withProperty(BlockArchiveSorterBottomFiller.BlockCustom.FACING, enumfacing), 3);
						worldIn.setBlockState(blockposOffset2.up(), BlockArchiveSorterBottomFiller.block.getDefaultState().withProperty(BlockArchiveSorterBottomFiller.BlockCustom.FACING, enumfacing), 3);
						worldIn.setBlockState(blockposOffset3.up(), BlockArchiveSorterBottomFiller.block.getDefaultState().withProperty(BlockArchiveSorterBottomFiller.BlockCustom.FACING, enumfacing), 3);
						worldIn.setBlockState(blockposOffset4.up(), BlockArchiveSorterBottomFiller.block.getDefaultState().withProperty(BlockArchiveSorterBottomFiller.BlockCustom.FACING, enumfacing), 3);

						worldIn.setBlockState(pos.up(2), BlockArchiveSorterTop.block.getDefaultState().withProperty(BlockArchiveSorterTop.BlockCustom.FACING, enumfacing), 3);
						worldIn.setBlockState(blockposOffset1.up(2), BlockArchiveSorterTopFiller.block.getDefaultState().withProperty(BlockArchiveSorterTopFiller.BlockCustom.FACING, enumfacing), 3);
						worldIn.setBlockState(blockposOffset2.up(2), BlockArchiveSorterTopFiller.block.getDefaultState().withProperty(BlockArchiveSorterTopFiller.BlockCustom.FACING, enumfacing), 3);
						worldIn.setBlockState(blockposOffset3.up(2), BlockArchiveSorterTopFiller.block.getDefaultState().withProperty(BlockArchiveSorterTopFiller.BlockCustom.FACING, enumfacing), 3);
						worldIn.setBlockState(blockposOffset4.up(2), BlockArchiveSorterTopFiller.block.getDefaultState().withProperty(BlockArchiveSorterTopFiller.BlockCustom.FACING, enumfacing), 3);


						worldIn.notifyNeighborsRespectDebug(pos, block, false);
						worldIn.notifyNeighborsRespectDebug(blockposOffset1, iblockstateOffset1.getBlock(), false);
						worldIn.notifyNeighborsRespectDebug(blockposOffset2, iblockstateOffset2.getBlock(), false);
						worldIn.notifyNeighborsRespectDebug(blockposOffset3, iblockstateOffset3.getBlock(), false);
						worldIn.notifyNeighborsRespectDebug(blockposOffset4, iblockstateOffset4.getBlock(), false);

						worldIn.notifyNeighborsRespectDebug(pos.up(), iblockstateUp.getBlock(), false);
						worldIn.notifyNeighborsRespectDebug(blockposOffset1.up(), iblockstateOffset1Up.getBlock(), false);
						worldIn.notifyNeighborsRespectDebug(blockposOffset2.up(), iblockstateOffset2Up.getBlock(), false);
						worldIn.notifyNeighborsRespectDebug(blockposOffset3.up(), iblockstateOffset3Up.getBlock(), false);
						worldIn.notifyNeighborsRespectDebug(blockposOffset4.up(), iblockstateOffset4Up.getBlock(), false);

						worldIn.notifyNeighborsRespectDebug(pos.up(2), iblockstateUp2.getBlock(), false);
						worldIn.notifyNeighborsRespectDebug(blockposOffset1.up(2), iblockstateOffset1Up2.getBlock(), false);
						worldIn.notifyNeighborsRespectDebug(blockposOffset2.up(2), iblockstateOffset2Up2.getBlock(), false);
						worldIn.notifyNeighborsRespectDebug(blockposOffset3.up(2), iblockstateOffset3Up2.getBlock(), false);
						worldIn.notifyNeighborsRespectDebug(blockposOffset4.up(2), iblockstateOffset4Up2.getBlock(), false);

						if (player instanceof EntityPlayerMP)
						{
							CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)player, pos, itemstack);
						}

						SoundType soundtype = SoundType.WOOD;
						worldIn.playSound(player, pos, soundtype.getPlaceSound(), SoundCategory.BLOCKS, (soundtype.getVolume() + 1.0F) / 2.0F, soundtype.getPitch() * 0.8F);

						itemstack.shrink(1);
						return EnumActionResult.SUCCESS;
					}
					else
					{
						return EnumActionResult.FAIL;
					}
				}
				else
				{
					return EnumActionResult.FAIL;
				}
			}
		}
	}
}
