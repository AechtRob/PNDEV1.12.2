
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.*;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemPhial extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:phial_empty")
	public static final Item block = null;
	public ItemPhial(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.phial);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/phial", "inventory"));
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setTranslationKey("pf_phial_empty");
			setRegistryName("phial_empty");
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
			ItemStack itemstack = player.getHeldItem(hand);

			if (!player.canPlayerEdit(pos.offset(facing), facing, itemstack))
			{
				return EnumActionResult.FAIL;
			}
			else
			{
				if (collectEggs(itemstack, worldIn, pos, player, hand))
				{
					return EnumActionResult.SUCCESS;
				}
			}
			return EnumActionResult.PASS;
		}

		public boolean collectEggs(ItemStack stack, World worldIn, BlockPos target, EntityPlayer player, @javax.annotation.Nullable EnumHand hand)
		{

			IBlockState iblockstate = worldIn.getBlockState(target);
			Block blockTarget = iblockstate.getBlock();

			if (!worldIn.isRemote) {
				boolean collected = false;
				boolean removed = false;
				String strPhial = "";
				ItemStack phial = new ItemStack(ItemPhialFull.block, 1);

				if (blockTarget instanceof BlockMobSpawn
					|| blockTarget instanceof BlockInsectEggs) {
					RayTraceResult raytraceresult = this.rayTrace(worldIn, player, true);
					Item itemTarget = blockTarget.getPickBlock(iblockstate, raytraceresult, worldIn, target, player).getItem();
					blockTarget = Block.getBlockFromItem(blockTarget.getPickBlock(iblockstate, raytraceresult, worldIn, target, player).getItem());
					if (blockTarget != Blocks.AIR) {
						strPhial = blockTarget.getRegistryName().toString();
					}
					else {
						strPhial = itemTarget.getRegistryName().toString();
					}
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockRottenLog.block
					|| blockTarget == BlockAncientMoss.block
					|| blockTarget == BlockDollyphyton.block
					|| blockTarget == BlockEdwardsiphyton.block
					|| blockTarget == BlockSelaginella.block
				) {
					String eggRenderType = new Object() {
						public String getValue(BlockPos pos, String tag) {
						TileEntity tileEntity = worldIn.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getString(tag);
						return "";
						}
					}.getValue(new BlockPos(target), "egg");

					if (!eggRenderType.equalsIgnoreCase("")) {
						if (BlockRottenLog.BlockCustom.hasBigEggs(eggRenderType, worldIn, new BlockPos(target)) == null) {
							strPhial = eggRenderType;
							collected = true;
							IBlockState state = worldIn.getBlockState(target);
							TileEntity te = worldIn.getTileEntity(target);
							if (te != null) {
								te.getTileData().removeTag("egg");
							}
							worldIn.notifyBlockUpdate(target, state, state, 3);
						}
					}
				}

				if (collected) {

					SoundEvent soundevent = SoundEvents.ITEM_BOTTLE_FILL;
					worldIn.playSound(player, target, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
					stack.shrink(1);
					phial.setCount(1);
					NBTTagCompound stackNBT = new NBTTagCompound();
					phial.setTagCompound(stackNBT);
					phial.getTagCompound().setString("id_eggs", strPhial);

					TileEntity tileentity = worldIn.getTileEntity(target);
					if (tileentity != null) {
						if (tileentity.getTileData() != null) {
							if (tileentity.getTileData().hasKey("PNType")) {
								phial.getTagCompound().setString("PNType", tileentity.getTileData().getString("PNType"));
							}
						}
					}

					ItemHandlerHelper.giveItemToPlayer(player, phial);
					if (removed) {
						worldIn.setBlockToAir(target);
					}
					return true;
				}
			}

			return false;
		}

	}

}
