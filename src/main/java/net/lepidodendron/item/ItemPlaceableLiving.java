
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.BlockBacterialLayer;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
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
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemPlaceableLiving extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:placeable_living")
	public static final Item block = null;
	public ItemPlaceableLiving(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.placeable_living);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:placeable_living", "inventory"));
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 1;
			setTranslationKey("pf_placeable_living");
			setRegistryName("placeable_living");
			setCreativeTab(null);
		}

		public String getTranslationKey(ItemStack stack)
		{
			if (isBlockFromItemStack(stack)) {
				String resourcelocation = stack.getTagCompound().getString("id_dna");
				if (resourcelocation.contains("_fail")) {
					resourcelocation = resourcelocation.replace("_fail", "");
				}
				return "item.placeable_living_" + getDNAStr(resourcelocation);
			}
			return super.getTranslationKey(stack);
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

		public static boolean isBlockFromItemStack(ItemStack stack) {
			if (stack.hasTagCompound() == false
					|| !stack.getTagCompound().hasKey("id_dna")) return false;
			return true;
		}

		public static String getDNAStr(String string) {
			string = string.replace("lepidodendron:", "");
			return string;
		}

		@Nullable
		public Block getStateFromNBT(ItemStack stack) {
			Block blockOut = null;
			String stringDNA = stack.getTagCompound().getString("id_dna");
			if (stringDNA != null) {
				blockOut = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(stringDNA));;
			}
			return blockOut;
		}

		@Nullable
		public Class getEntityFromNBT(ItemStack stack) {
			Class classOut = null;
			String stringDNA = ((stack).hasTagCompound() ? (stack).getTagCompound().getString("id_dna") : null);
			if (stringDNA != null) {
				classOut = findEntity(stringDNA);
			}
			return classOut;
		}

		@Nullable
		private static Class<? extends Entity> findEntity(String entity) {
			Class<? extends Entity> entityClass;
			EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(entity));
			entityClass = ee == null ? null : ee.getEntityClass();
			if (entityClass == null) {
				return null;
			}
			return entityClass;
		}

		public void failDNA(EntityPlayer player, World world, BlockPos pos, Random rand) {
			boolean failEntity = false;
			ItemStack stack = ItemStack.EMPTY;
			if (!(world.isRemote)) {
				if (rand.nextInt(12) == 0) {
					failEntity = true; //baby slime
				} else if (rand.nextInt(8) == 0) {
					stack = new ItemStack(BlockBacterialLayer.block, rand.nextInt(2) + 1);
				} else if (rand.nextInt(4) == 0) {
					stack = new ItemStack(Items.ROTTEN_FLESH, rand.nextInt(3) + 1);
				} else {
					stack = new ItemStack(Items.SLIME_BALL, rand.nextInt(4) + 1);
				}

				if (!failEntity) {
					EntityItem entityToSpawn = new EntityItem(world, pos.getX(), pos.getY(), pos.getZ(), stack);
					entityToSpawn.setPickupDelay(10);
					world.spawnEntity(entityToSpawn);
				} else { //Is a slime
					String nbtStr = "{Size:0}";
					EntityPrehistoricFloraAgeableBase.summon(world, "minecraft:slime", nbtStr, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5);
				}
			}
			world.playSound(player, pos, SoundEvents.BLOCK_SLIME_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
			if (player instanceof EntityPlayerMP) {
				ModTriggers.DNA_FAIL.trigger((EntityPlayerMP)player);
			}
		}

		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
		{
			ItemStack itemstack = playerIn.getHeldItem(handIn);
			RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, true);

			if (raytraceresult == null)
			{
				return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
			}
			else
			{
				if (raytraceresult.typeOfHit == RayTraceResult.Type.BLOCK)
				{
					BlockPos blockpos = raytraceresult.getBlockPos();

					if (!worldIn.isBlockModifiable(playerIn, blockpos) || !playerIn.canPlayerEdit(blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit, itemstack))
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}

					IBlockState iblockstate = worldIn.getBlockState(blockpos);

					String stringDNA = ((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getString("id_dna") : null);
					if (stringDNA != null) {
						if (stringDNA.contains("_fail")) {
							//Fail it:
							failDNA(playerIn, worldIn, blockpos, itemRand);
							return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
						}
					}

					if (getEntityFromNBT(itemstack) != null) {
						//Entities:
						String nbtStr = "";
						Entity entity = EntityList.createEntityByIDFromName(EntityList.getKey(getEntityFromNBT(itemstack)), worldIn);
						if (entity instanceof EntityPrehistoricFloraAgeableBase) {
							nbtStr = "{AgeTicks:0}";
						}
						if (!(worldIn.isRemote)) {
							if (iblockstate.getMaterial() == Material.WATER) {
								EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(getEntityFromNBT(itemstack)).toString(), nbtStr, blockpos.getX() + 0.5, blockpos.getY() + 0.5, blockpos.getZ() + 0.5);
							}
							else {
								blockpos = blockpos.offset(raytraceresult.sideHit);
								EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(getEntityFromNBT(itemstack)).toString(), nbtStr, blockpos.getX() + 0.5, blockpos.getY(), blockpos.getZ() + 0.5);
							}
						}
						if (!playerIn.capabilities.isCreativeMode) {
							itemstack.shrink(1);
						}
						playerIn.addStat(StatList.getObjectUseStats(this));
						if (iblockstate.getMaterial() == Material.WATER) {
							worldIn.playSound(playerIn, blockpos, SoundEvents.ENTITY_BOBBER_SPLASH, SoundCategory.BLOCKS, 1.0F, 1.0F);
						} else {
							worldIn.playSound(playerIn, blockpos, SoundEvents.BLOCK_SLIME_BREAK, SoundCategory.BLOCKS, 1.0F, 1.0F);
						}
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
					}
					else if (getStateFromNBT(itemstack) != null) {
						//Plants/Blocks:
						Block block = getStateFromNBT(itemstack);
						ItemStack pickBlock = block.getPickBlock(block.getDefaultState(), new RayTraceResult(playerIn), worldIn, blockpos, playerIn);
						Item item = pickBlock.getItem();
						if (item != null) {
							//System.err.println("blockpos " + blockpos);
							EnumActionResult result = item.onItemUse(playerIn, worldIn, blockpos, handIn, raytraceresult.sideHit, 0.5F, 0F, 0.5F);
							if (!playerIn.isCreative() && result == EnumActionResult.SUCCESS) {
								itemstack.shrink(1);
							}
							if (result == EnumActionResult.SUCCESS) {
								return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
							}
							else {
								//Try the right click action instead:
								ActionResult actionResult = item.onItemRightClick(worldIn, playerIn, handIn);
								if (!playerIn.isCreative() && actionResult.getResult() == EnumActionResult.SUCCESS) {
									itemstack.shrink(1);
								}
								if (actionResult.getResult() == EnumActionResult.SUCCESS) {
									return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
								}
								else {
									//Finally try a standard placement for water blocks:
									raytraceresult = this.rayTrace(worldIn, playerIn, false);

									if (raytraceresult == null)
									{
										return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
									}
									else {
										if (raytraceresult.typeOfHit == RayTraceResult.Type.BLOCK) {
											blockpos = raytraceresult.getBlockPos();

											if (!worldIn.isBlockModifiable(playerIn, blockpos) || !playerIn.canPlayerEdit(blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit, itemstack)) {
												return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
											}

											result = item.onItemUse(playerIn, worldIn, blockpos, handIn, raytraceresult.sideHit, 0.5F, 0F, 0.5F);
											if (!playerIn.isCreative() && result == EnumActionResult.SUCCESS) {
												itemstack.shrink(1);
											}
											if (result == EnumActionResult.SUCCESS) {
												return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
											}
										}
									}
								}
							}
						}
					}
				}

				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}
		}
	}
}
