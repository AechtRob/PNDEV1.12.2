
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.*;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemBottleOfResin extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:bottle_of_resin")
	public static final Item block = null;
	public ItemBottleOfResin(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.bottle_of_resin);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:bottle_of_resin", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 8;
			setTranslationKey("pf_bottle_of_resin");
			setRegistryName("bottle_of_resin");
			setCreativeTab(TabLepidodendronMisc.tab);
			setContainerItem(net.minecraft.init.Items.GLASS_BOTTLE);
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

		@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Can be used to hold falling blocks in place");
			}
			super.addInformation(stack, player, tooltip, advanced);
		}

		@Override
		public EnumActionResult onItemUse(EntityPlayer player, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
		{
			ItemStack itemstack = player.getHeldItem(hand);

			if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
			{
				return EnumActionResult.FAIL;
			}
			else
			{
				if (applyResin(itemstack, worldIn, pos, player, hand))
				{
					return EnumActionResult.SUCCESS;
				}
			}
			return EnumActionResult.PASS;
		}

		public static boolean applyResin(ItemStack stack, World worldIn, BlockPos target, EntityPlayer player, @javax.annotation.Nullable EnumHand hand)
		{
			IBlockState iblockstate = worldIn.getBlockState(target);
			Block blockTarget = iblockstate.getBlock();
			boolean resined = false;

			if (blockTarget == BlockSandPangaean.block) {
				if (!worldIn.isRemote) {worldIn.setBlockState(target, BlockSandPangaeanSticky.block.getDefaultState(), 2);}
				resined = true;
			}
			if (blockTarget == BlockSandBlack.block) {
				if (!worldIn.isRemote) {worldIn.setBlockState(target, BlockSandBlackSticky.block.getDefaultState(), 2);}
				resined = true;
			}
			if (blockTarget == BlockSandWhite.block) {
				if (!worldIn.isRemote) {worldIn.setBlockState(target, BlockSandWhiteSticky.block.getDefaultState(), 2);}
				resined = true;
			}
			if (iblockstate == Blocks.SAND.getStateFromMeta(0)) {
				if (!worldIn.isRemote) {worldIn.setBlockState(target, BlockSandSticky.block.getDefaultState(), 2);}
				resined = true;
			}
			if (iblockstate == Blocks.SAND.getStateFromMeta(1)) {
				if (!worldIn.isRemote) {worldIn.setBlockState(target, BlockSandRedSticky.block.getDefaultState(), 2);}
				resined = true;
			}
			if (blockTarget == Blocks.GRAVEL) {
				if (!worldIn.isRemote) {worldIn.setBlockState(target, BlockGravelSticky.block.getDefaultState(), 2);}
				resined = true;
			}
			if (blockTarget == BlockStromatolite.block) {
				if (!worldIn.isRemote) {worldIn.setBlockState(target, BlockStromatoliteSticky.block.getDefaultState(), 2);}
				resined = true;
			}
			if (blockTarget == BlockCoral.block) {
				if (!worldIn.isRemote) {worldIn.setBlockState(target, BlockCoralSticky.block.getDefaultState().withProperty(BlockCoralSticky.FACING, iblockstate.getValue(BlockCoral.FACING)), 2);}
				resined = true;
			}
			if (blockTarget == BlockThrombolite.block) {
				if (!worldIn.isRemote) {worldIn.setBlockState(target, BlockThromboliteSticky.block.getDefaultState(), 2);}
				resined = true;
			}
			if (blockTarget == BlockArchaeocyatha.block) {
				if (!worldIn.isRemote) {worldIn.setBlockState(target, BlockArchaeocyathaSticky.block.getDefaultState().withProperty(BlockArchaeocyathaSticky.FACING, iblockstate.getValue(BlockArchaeocyatha.FACING)), 2);}
				resined = true;
			}
			if (blockTarget == BlockSandWavy.block) {
				if (!worldIn.isRemote) {worldIn.setBlockState(target, BlockSandWavySticky.block.getDefaultState(), 2);}
				resined = true;
			}
			if (blockTarget == BlockSandRedWavy.block) {
				if (!worldIn.isRemote) {worldIn.setBlockState(target, BlockSandRedWavySticky.block.getDefaultState(), 2);}
				resined = true;
			}
			if (blockTarget == BlockSandPangaeanWavy.block) {
				if (!worldIn.isRemote) {worldIn.setBlockState(target, BlockSandPangaeanWavySticky.block.getDefaultState(), 2);}
				resined = true;
			}
			if (blockTarget == BlockSandBlackWavy.block) {
				if (!worldIn.isRemote) {worldIn.setBlockState(target, BlockSandBlackWavySticky.block.getDefaultState(), 2);}
				resined = true;
			}
			if (blockTarget == BlockGravelWavy.block) {
				if (!worldIn.isRemote) {worldIn.setBlockState(target, BlockGravelWavySticky.block.getDefaultState(), 2);}
				resined = true;
			}
			if (blockTarget == BlockSandWhiteWavy.block) {
				if (!worldIn.isRemote) {worldIn.setBlockState(target, BlockSandWhiteWavySticky.block.getDefaultState(), 2);}
				resined = true;
			}

			if (resined) {
				SoundEvent soundevent = SoundEvents.BLOCK_SLIME_PLACE;
				player.getEntityWorld().playSound(player, player.getPosition(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
				stack.shrink(1);
				ItemStack bottle = new ItemStack(Items.GLASS_BOTTLE, (int) (1));
				if (!player.isCreative() && !worldIn.isRemote) {
					if (player.inventory.getFirstEmptyStack() == -1) {
						//Is there room for this in an exsiting stack?
						int i = 1;
						int slotSpace = 0;
						while (i <= 32 && slotSpace == 0) {
							if (player.inventory.getStackInSlot(i).getItem() == Items.GLASS_BOTTLE
									&& player.inventory.getStackInSlot(i).getCount() < bottle.getMaxStackSize()) {
								bottle.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(player, bottle);
								slotSpace=i;
							}
							i += 1;
						}
						if (slotSpace == 0) { //No slots free in main inventory so just drop the item:
							//No slots free in main inventory so just drop the item:
							EntityItem entityToSpawn = new EntityItem(worldIn, target.getX() + 0.5, target.getY(), target.getZ() + 0.5, new ItemStack(Items.GLASS_BOTTLE, (int) (1)));
							entityToSpawn.setPickupDelay(10);
							worldIn.spawnEntity(entityToSpawn);
						}
					}
					else {
						bottle.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(player, bottle);
					}
				}
				return true;
			}
			return false;
		}

	}

}
