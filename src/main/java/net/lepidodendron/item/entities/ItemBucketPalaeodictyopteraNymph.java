
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.creativetab.TabLepidodendronMobile;
import net.lepidodendron.entity.EntityPrehistoricFloraPalaeodictyopteraNymph;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemBucketPalaeodictyopteraNymph extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:palaeodictyoptera_nymph_bucket")
	public static final Item block = null;

	public ItemBucketPalaeodictyopteraNymph(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.palaeodictyoptera_nymph_bucket);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/palaeodictyoptera_nymph_bucket", "inventory"));
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setTranslationKey("pf_palaeodictyoptera_nymph_bucket");
			setRegistryName("palaeodictyoptera_nymph_bucket");
			maxStackSize = 1;
			setCreativeTab(TabLepidodendronMobile.tab);
		}

		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
		{
			boolean flag = false;
			ItemStack itemstack = playerIn.getHeldItem(handIn);
			RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, false);
			ActionResult<ItemStack> ret = onBucketUse(playerIn, worldIn, itemstack, raytraceresult);
			if (ret != null) return ret;

			if (raytraceresult == null)
			{
				return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
			}
			else if (raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK)
			{
				return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
			}
			else
			{
				BlockPos blockpos = raytraceresult.getBlockPos();

				if (!worldIn.isBlockModifiable(playerIn, blockpos))
				{
					return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
				}

				{
					boolean flag1 = worldIn.getBlockState(blockpos).getBlock().isReplaceable(worldIn, blockpos);
					BlockPos blockpos1 = flag1 && raytraceresult.sideHit == EnumFacing.UP ? blockpos : blockpos.offset(raytraceresult.sideHit);

					if (!playerIn.canPlayerEdit(blockpos1, raytraceresult.sideHit, itemstack))
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}
					else if (tryPlaceContainedLiquid(playerIn, worldIn, blockpos1))
					{
						if (playerIn instanceof EntityPlayerMP)
						{
							CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)playerIn, blockpos1, itemstack);
						}

						playerIn.addStat(StatList.getObjectUseStats(this));
						return !playerIn.capabilities.isCreativeMode ? new ActionResult(EnumActionResult.SUCCESS, new ItemStack(Items.BUCKET)) : new ActionResult(EnumActionResult.SUCCESS, itemstack);
					}
					else
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}
				}
			}
		}

		public boolean tryPlaceContainedLiquid(@Nullable EntityPlayer player, World worldIn, BlockPos posIn)
		{
			Entity MobSpawn = null;
			{
				IBlockState iblockstate = worldIn.getBlockState(posIn);
				Material material = iblockstate.getMaterial();
				boolean flag = !material.isSolid();
				boolean flag1 = iblockstate.getBlock().isReplaceable(worldIn, posIn);

				if (!worldIn.isAirBlock(posIn) && !flag && !flag1)
				{
					return false;
				}
				else
				{
					if (worldIn.provider.doesWaterVaporize())
					{
						int l = posIn.getX();
						int i = posIn.getY();
						int j = posIn.getZ();
						worldIn.playSound(player, posIn, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);

						for (int k = 0; k < 8; ++k)
						{
							worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, (double)l + Math.random(), (double)i + Math.random(), (double)j + Math.random(), 0.0D, 0.0D, 0.0D);
						}
					}
					else
					{
						if (!worldIn.isRemote && (flag || flag1) && !material.isLiquid())
						{
							worldIn.destroyBlock(posIn, true);
						}

						SoundEvent soundevent = SoundEvents.ITEM_BUCKET_EMPTY;
						worldIn.playSound(player, posIn, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
						worldIn.setBlockState(posIn, Blocks.FLOWING_WATER.getDefaultState(), 11);

						if (MobSpawn == null && !(worldIn.isRemote)) {
							EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(EntityPrehistoricFloraPalaeodictyopteraNymph.class).toString(), "", (double) posIn.getX() + 0.5D, (double) posIn.getY(), (double) posIn.getZ() + 0.5D);
						}
					}

					return true;
				}
			}
		}

		@Nullable
		public static ActionResult<ItemStack> onBucketUse(@Nonnull EntityPlayer player, @Nonnull World world, @Nonnull ItemStack stack, @Nullable RayTraceResult target)
		{
			FillBucketEvent event = new FillBucketEvent(player, stack, world, target);
			if (MinecraftForge.EVENT_BUS.post(event)) return new ActionResult<ItemStack>(EnumActionResult.FAIL, stack);

			if (event.getResult() == Event.Result.ALLOW)
			{
				if (player.capabilities.isCreativeMode)
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);

				stack.shrink(1);
				if (stack.isEmpty())
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, event.getFilledBucket());

				if (!player.inventory.addItemStackToInventory(event.getFilledBucket()))
					player.dropItem(event.getFilledBucket(), false);

				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
			}
			return null;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public void addInformation(ItemStack stack, World player, List<String> tooltip, ITooltipFlag advanced) {
			if (LepidodendronConfig.showTooltips) {
				tooltip.add("Type: Insect nymph");
				tooltip.add("Periods: Carboniferous");
				tooltip.add("Habitat: Water");
				super.addInformation(stack, player, tooltip, advanced);
			}
		}
	}
}
