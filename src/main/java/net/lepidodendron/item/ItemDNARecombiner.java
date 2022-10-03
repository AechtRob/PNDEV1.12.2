
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
public class ItemDNARecombiner extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:dna_recombiner_item")
	public static final Item block = null;
	public ItemDNARecombiner(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.dna_recombiner);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:dna_recombiner_item", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 1;
			setTranslationKey("pf_dna_recombiner_item");
			setRegistryName("dna_recombiner_item");
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
					boolean flag1 = iblockstate1.getBlock().isReplaceable(worldIn, blockpos);
					boolean flag2 = flag || worldIn.isAirBlock(pos);
					boolean flag3 = flag1 || worldIn.isAirBlock(blockpos);

					if (flag2 && flag3 && worldIn.getBlockState(pos.down()).isTopSolid() && worldIn.getBlockState(blockpos.down()).isTopSolid())
					{
						worldIn.setBlockState(pos, BlockDNARecombinerCentrifuge.block.getDefaultState().withProperty(BlockDNARecombinerCentrifuge.BlockCustom.FACING, enumfacing.rotateY()), 3);
						worldIn.setBlockState(pos.offset(enumfacing), BlockDNARecombinerForge.block.getDefaultState().withProperty(BlockDNARecombinerForge.BlockCustom.FACING, enumfacing.rotateY()), 3);

						worldIn.setBlockState(pos.offset(enumfacing).up(), BlockDNARecombinerRail.block.getDefaultState().withProperty(BlockDNARecombinerRail.BlockCustom.FACING, enumfacing.rotateY()), 3);

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
