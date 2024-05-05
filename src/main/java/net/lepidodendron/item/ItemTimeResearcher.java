
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.*;
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
public class ItemTimeResearcher extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:time_researcher_item")
	public static final Item block = null;
	public ItemTimeResearcher(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.time_researcher);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:time_researcher_item", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 1;
			setTranslationKey("pf_time_researcher_item");
			setRegistryName("time_researcher_item");
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
				EnumFacing enumfacing = EnumFacing.byHorizontalIndex(i).getOpposite();
				ItemStack itemstack = player.getHeldItem(hand);

				if (player.canPlayerEdit(pos, facing, itemstack) && player.canPlayerEdit(pos, facing, itemstack))
				{

					IBlockState iblockstate1 = worldIn.getBlockState(pos);
					IBlockState iblockstate2 = worldIn.getBlockState(pos.up());
					IBlockState iblockstate3 = worldIn.getBlockState(pos.up(2));
					IBlockState iblockstate4 = worldIn.getBlockState(pos.offset(enumfacing.rotateY().rotateY().rotateY()));
					IBlockState iblockstate5 = worldIn.getBlockState(pos.up().offset(enumfacing.rotateY().rotateY().rotateY()));

					boolean flag1 = iblockstate1.getBlock().isReplaceable(worldIn, pos);
					boolean flag2 = iblockstate2.getBlock().isReplaceable(worldIn, pos.up());
					boolean flag3 = iblockstate3.getBlock().isReplaceable(worldIn, pos.up(2));
					boolean flag4 = iblockstate4.getBlock().isReplaceable(worldIn, pos.offset(enumfacing.rotateY().rotateY().rotateY()));
					boolean flag5 = iblockstate5.getBlock().isReplaceable(worldIn, pos.up().offset(enumfacing.rotateY().rotateY().rotateY()));
					boolean flag6 = flag || worldIn.isAirBlock(pos);
					boolean flag7 = flag1 || worldIn.isAirBlock(pos.up());
					boolean flag8 = flag6 || worldIn.isAirBlock(pos.up(2));
					boolean flag9 = flag7 || worldIn.isAirBlock(pos.offset(enumfacing.rotateY().rotateY().rotateY()));
					boolean flag10 = flag7 || worldIn.isAirBlock(pos.up().offset(enumfacing.rotateY().rotateY().rotateY()));

					if (flag1 && flag2 && flag3 && flag4 && flag5 && flag6 && flag7 && flag8 && flag9 && flag10
							&& worldIn.getBlockState(pos.down()).isTopSolid()
							&& worldIn.getBlockState(pos.down().offset(enumfacing.rotateY().rotateY().rotateY())).isTopSolid())
					{

						worldIn.setBlockState(pos, BlockTimeResearcherDispenser.block.getDefaultState().withProperty(BlockTimeResearcher.BlockCustom.FACING, enumfacing));
						worldIn.setBlockState(pos.up(), BlockTimeResearcher.block.getDefaultState().withProperty(BlockTimeResearcher.BlockCustom.FACING, enumfacing));
						worldIn.setBlockState(pos.up(2), BlockTimeResearcherHopper.block.getDefaultState().withProperty(BlockTimeResearcherHopper.BlockCustom.FACING, enumfacing));
						worldIn.setBlockState(pos.offset(enumfacing.rotateY().rotateY().rotateY()), BlockTimeResearcherFinderBottom.block.getDefaultState().withProperty(BlockTimeResearcherFinderBottom.BlockCustom.FACING,enumfacing));
						worldIn.setBlockState(pos.up().offset(enumfacing.rotateY().rotateY().rotateY()), BlockTimeResearcherFinderTop.block.getDefaultState().withProperty(BlockTimeResearcherFinderTop.BlockCustom.FACING, enumfacing));

						worldIn.notifyNeighborsRespectDebug(pos, iblockstate1.getBlock(), false);
						worldIn.notifyNeighborsRespectDebug(pos.up(), iblockstate2.getBlock(), false);
						worldIn.notifyNeighborsRespectDebug(pos.up(2), iblockstate3.getBlock(), false);
						worldIn.notifyNeighborsRespectDebug(pos.offset(enumfacing.rotateY().rotateY().rotateY()), iblockstate4.getBlock(), false);
						worldIn.notifyNeighborsRespectDebug(pos.up().offset(enumfacing.rotateY().rotateY().rotateY()), iblockstate5.getBlock(), false);

						if (itemstack.hasTagCompound()) {
							TileEntity te = worldIn.getTileEntity(pos.up());
							if (te != null) {
								if (te instanceof BlockTimeResearcher.TileEntityTimeResearcher) {
									BlockTimeResearcher.TileEntityTimeResearcher entity = (BlockTimeResearcher.TileEntityTimeResearcher) te;
									if (itemstack.getTagCompound().hasKey("dimPrecambrian")) {
										entity.dimPrecambrian = itemstack.getTagCompound().getInteger("dimPrecambrian");
									}
									if (itemstack.getTagCompound().hasKey("dimCambrian")) {
										entity.dimCambrian = itemstack.getTagCompound().getInteger("dimCambrian");
									}
									if (itemstack.getTagCompound().hasKey("dimOrdovician")) {
										entity.dimOrdovician = itemstack.getTagCompound().getInteger("dimOrdovician");
									}
									if (itemstack.getTagCompound().hasKey("dimSilurian")) {
										entity.dimSilurian = itemstack.getTagCompound().getInteger("dimSilurian");
									}
									if (itemstack.getTagCompound().hasKey("dimDevonian")) {
										entity.dimDevonian = itemstack.getTagCompound().getInteger("dimDevonian");
									}
									if (itemstack.getTagCompound().hasKey("dimCarboniferous")) {
										entity.dimCarboniferous = itemstack.getTagCompound().getInteger("dimCarboniferous");
									}
									if (itemstack.getTagCompound().hasKey("dimPermian")) {
										entity.dimPermian = itemstack.getTagCompound().getInteger("dimPermian");
									}
									if (itemstack.getTagCompound().hasKey("dimTriassic")) {
										entity.dimTriassic = itemstack.getTagCompound().getInteger("dimTriassic");
									}
									if (itemstack.getTagCompound().hasKey("dimJurassic")) {
										entity.dimJurassic = itemstack.getTagCompound().getInteger("dimJurassic");
									}
									if (itemstack.getTagCompound().hasKey("dimCretaceousEarly")) {
										entity.dimCretaceousEarly = itemstack.getTagCompound().getInteger("dimCretaceousEarly");
									}
									if (itemstack.getTagCompound().hasKey("dimCretaceousLate")) {
										entity.dimCretaceousLate = itemstack.getTagCompound().getInteger("dimCretaceousLate");
									}
									if (itemstack.getTagCompound().hasKey("dimPaleogene")) {
										entity.dimPaleogene = itemstack.getTagCompound().getInteger("dimPaleogene");
									}
									if (itemstack.getTagCompound().hasKey("dimNeogene")) {
										entity.dimNeogene = itemstack.getTagCompound().getInteger("dimNeogene");
									}
									if (itemstack.getTagCompound().hasKey("dimPleistocene")) {
										entity.dimPleistocene = itemstack.getTagCompound().getInteger("dimPleistocene");
									}
								}
							}
						}

						if (player instanceof EntityPlayerMP)
						{
							CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)player, pos, itemstack);
						}

						SoundType soundtype = SoundType.METAL;
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
