
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockAcidBath;
import net.lepidodendron.block.BlockAcidBathEnd;
import net.lepidodendron.block.BlockAcidBathEndUp;
import net.lepidodendron.block.BlockAcidBathUp;
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
public class ItemAcidBath extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:acid_bath_item")
	public static final Item block = null;
	public ItemAcidBath(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.acid_bath);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:acid_bath_item", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 1;
			setTranslationKey("pf_acid_bath_item");
			setRegistryName("acid_bath_item");
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
				BlockPos blockpos = pos.offset(enumfacing);
				ItemStack itemstack = player.getHeldItem(hand);

				if (player.canPlayerEdit(pos, facing, itemstack) && player.canPlayerEdit(blockpos, facing, itemstack))
				{
					IBlockState iblockstate1 = worldIn.getBlockState(blockpos);
					IBlockState iblockstate2 = worldIn.getBlockState(pos.up());
					IBlockState iblockstate3 = worldIn.getBlockState(blockpos.up());
					boolean flag1 = iblockstate1.getBlock().isReplaceable(worldIn, blockpos);
					boolean flag6 = iblockstate2.getBlock().isReplaceable(worldIn, pos.up());
					boolean flag7 = iblockstate3.getBlock().isReplaceable(worldIn, blockpos.up());
					boolean flag2 = flag || worldIn.isAirBlock(pos);
					boolean flag3 = flag1 || worldIn.isAirBlock(blockpos);
					boolean flag4 = flag6 || worldIn.isAirBlock(pos.up());
					boolean flag5 = flag7 || worldIn.isAirBlock(blockpos.up());

					if (flag2 && flag3 && flag4 && flag5 && worldIn.getBlockState(pos.down()).isTopSolid() && worldIn.getBlockState(blockpos.down()).isTopSolid())
					{
						worldIn.setBlockState(pos, BlockAcidBath.block.getDefaultState().withProperty(BlockAcidBath.BlockCustom.FACING, enumfacing), 3);
						worldIn.setBlockState(pos.offset(enumfacing), BlockAcidBathEnd.block.getDefaultState().withProperty(BlockAcidBathEnd.BlockCustom.FACING, enumfacing.getOpposite()), 3);

						worldIn.setBlockState(pos.up(), BlockAcidBathUp.block.getDefaultState().withProperty(BlockAcidBathUp.BlockCustom.FACING, enumfacing), 3);
						worldIn.setBlockState(pos.offset(enumfacing).up(), BlockAcidBathEndUp.block.getDefaultState().withProperty(BlockAcidBathEndUp.BlockCustom.FACING, enumfacing.getOpposite()), 3);

						worldIn.notifyNeighborsRespectDebug(pos, block, false);
						worldIn.notifyNeighborsRespectDebug(blockpos, iblockstate1.getBlock(), false);

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
