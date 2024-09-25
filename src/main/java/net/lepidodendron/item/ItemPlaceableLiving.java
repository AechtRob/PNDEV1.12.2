
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;

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
			maxStackSize = 64;
			setTranslationKey("pf_placeable_living");
			setRegistryName("placeable_living");
			setCreativeTab(null);
		}

		@Override
		public String getItemStackDisplayName(ItemStack stack)
		{
			if (stack.hasTagCompound()) {
				if (stack.getTagCompound().hasKey("PFPlant")) {
					NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFPlant");
					String resourcelocation = (blockNBT.getString("id"));
					if (!(I18n.translateToLocal("tile.pf_" + getDNAStr(resourcelocation) + ".name")
							.equalsIgnoreCase("tile.pf_" + getDNAStr(resourcelocation) + ".name"))) {
						return I18n.translateToLocal("item.pf_placeable_living_full.name").trim()
								+ ": "
								+ I18n.translateToLocal("tile.pf_" + getDNAStr(resourcelocation) + ".name").trim();
					} else if (!(I18n.translateToLocal("item.pf_" + getDNAStr(resourcelocation) + ".name")
							.equalsIgnoreCase("item.pf_" + getDNAStr(resourcelocation) + ".name"))) {
						return I18n.translateToLocal("item.pf_placeable_living_full.name").trim()
								+ ": "
								+ I18n.translateToLocal("item.pf_" + getDNAStr(resourcelocation) + ".name").trim();
					} else {
						return super.getItemStackDisplayName(stack);
					}
				}

				else if (stack.getTagCompound().hasKey("PFMob")) {
					NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFMob");
					String resourcelocation = (blockNBT.getString("id"));
					if (I18n.translateToLocal("entity." + getDNAStr(resourcelocation) + ".name").trim()
							.equalsIgnoreCase("entity." + getDNAStr(resourcelocation) + ".name")) {
						//This didn't translate properly, try using a capital letter:
						return I18n.translateToLocal("item.pf_phial_dna_full.name").trim()
								+ ": "
								+ I18n.translateToLocal("entity." + ItemPhialDNA.ItemCustom.upperCase(getDNAStr(resourcelocation)) + ".name").trim();
					}
					return I18n.translateToLocal("item.pf_placeable_living_full.name").trim()
							+ ": "
							+ I18n.translateToLocal("entity." + getDNAStr(resourcelocation) + ".name").trim();
				}

				else if (stack.getTagCompound().hasKey("PFStatic")) {
					NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFStatic");
					String resourcelocation = (blockNBT.getString("id"));
					if (!(I18n.translateToLocal("tile.pf_" + getDNAStr(resourcelocation) + ".name")
							.equalsIgnoreCase("tile.pf_" + getDNAStr(resourcelocation) + ".name"))) {
						return I18n.translateToLocal("item.pf_placeable_living_full.name").trim()
								+ ": "
								+ I18n.translateToLocal("tile.pf_" + getDNAStr(resourcelocation) + ".name").trim();
					} else if (!(I18n.translateToLocal("item.pf_" + getDNAStr(resourcelocation) + ".name")
							.equalsIgnoreCase("item.pf_" + getDNAStr(resourcelocation) + ".name"))) {
						return I18n.translateToLocal("item.pf_placeable_living_full.name").trim()
								+ ": "
								+ I18n.translateToLocal("item.pf_" + getDNAStr(resourcelocation) + ".name").trim();
					} else {
						return super.getItemStackDisplayName(stack);
					}
				}

			}

			return super.getItemStackDisplayName(stack);
		}

		public String getTranslationKey(ItemStack stack)
		{
			if (isBlockFromItemStack(stack)) {
				if (stack.getTagCompound().hasKey("PFPlant")) {
					NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFPlant");
					String resourcelocation = (blockNBT.getString("id"));
					return "item.placeable_living_" + getDNAStr(resourcelocation);
				}
				else if (stack.getTagCompound().hasKey("PFMob")) {
					NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFMob");
					String resourcelocation = (blockNBT.getString("id"));
					return "item.placeable_living_" + getDNAStr(resourcelocation);
				}
				else if (stack.getTagCompound().hasKey("PFStatic")) {
					NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFStatic");
					String resourcelocation = (blockNBT.getString("id"));
					return "item.placeable_living_" + getDNAStr(resourcelocation);
				}
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
					||
					((!stack.getTagCompound().hasKey("PFPlant"))
					&& (!stack.getTagCompound().hasKey("PFMob"))
					&& (!stack.getTagCompound().hasKey("PFStatic")))
			) {
				return false;
			}
			return true;
		}

		public static String getDNAStr(String string) {
			string = string.replace("lepidodendron:", "");
			string = string.replace("minecraft:", "");
			string = string.replace("@", "_");
			return string;
		}

		@Nullable
		public IBlockState getStateFromNBT(ItemStack stack) {
			if ((!stack.getTagCompound().hasKey("PFPlant"))
				&& (!stack.getTagCompound().hasKey("PFStatic"))) {
			return null;
			}
			IBlockState blockOut = null;
			if (stack.getTagCompound().hasKey("PFPlant")) {
				NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFPlant");
				String stringDNA = (blockNBT.getString("id"));
				if (stringDNA != null) {
					if (stringDNA.equalsIgnoreCase("minecraft:acacia_sapling")) {
						blockOut = Blocks.SAPLING.getStateFromMeta(4);
					}
					else if (stringDNA.equalsIgnoreCase("minecraft:birch_sapling")) {
						blockOut = Blocks.SAPLING.getStateFromMeta(2);
					}
					else if (stringDNA.equalsIgnoreCase("minecraft:dark_oak_sapling")) {
						blockOut = Blocks.SAPLING.getStateFromMeta(5);
					}
					else if (stringDNA.equalsIgnoreCase("minecraft:jungle_sapling")) {
						blockOut = Blocks.SAPLING.getStateFromMeta(3);
					}
					else if (stringDNA.equalsIgnoreCase("minecraft:oak_sapling")) {
						blockOut = Blocks.SAPLING.getStateFromMeta(0);
					}
					else if (stringDNA.equalsIgnoreCase("minecraft:spruce_sapling")) {
						blockOut = Blocks.SAPLING.getStateFromMeta(1);
					}
					else if (stringDNA.equalsIgnoreCase("minecraft:small_fern")) {
						blockOut = Blocks.TALLGRASS.getStateFromMeta(2);
					}
					else if (stringDNA.equalsIgnoreCase("minecraft:large_fern")) {
						blockOut = Blocks.DOUBLE_PLANT.getStateFromMeta(3);
					}
					else {
						blockOut = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(stringDNA)).getDefaultState();
					}
				}
			}
			else if (stack.getTagCompound().hasKey("PFStatic")) {
				NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFStatic");
				String stringDNA = (blockNBT.getString("id"));
				if (stringDNA != null) {
					blockOut = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(stringDNA)).getDefaultState();
				}
			}
			return blockOut;
		}

		@Nullable
		public Item getItemFromNBT(ItemStack stack) {
			if ((!stack.getTagCompound().hasKey("PFPlant"))
				&& (!stack.getTagCompound().hasKey("PFStatic"))) {
				return null;
			}
			Item itemOut = null;
			if (stack.getTagCompound().hasKey("PFPlant")) {
				NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFPlant");
				String stringDNA = (blockNBT.getString("id"));
				if (stringDNA != null) {
					itemOut = ForgeRegistries.ITEMS.getValue(new ResourceLocation(stringDNA));
				}
			}
			else if (stack.getTagCompound().hasKey("PFStatic")) {
				NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFStatic");
				String stringDNA = (blockNBT.getString("id"));
				if (stringDNA != null) {
					itemOut = ForgeRegistries.ITEMS.getValue(new ResourceLocation(stringDNA));
				}
			}
			return itemOut;
		}

		@Nullable
		public Class getEntityFromNBT(ItemStack stack) {
			if (!stack.getTagCompound().hasKey("PFMob")) {
				return null;
			}
			Class classOut = null;
			NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFMob");
			String stringDNA = (blockNBT.getString("id"));
			if (stringDNA.indexOf("@") >= 0) {
				stringDNA = stringDNA.substring(0, stringDNA.indexOf("@"));
			}
			if (stringDNA != null) {
				classOut = findEntity(stringDNA);
			}
			return classOut;
		}

		@Nullable
		public String getVariantID(ItemStack stack) {
			if (!stack.getTagCompound().hasKey("PFMob")) {
				return "";
			}
			NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFMob");
			String stringDNA = (blockNBT.getString("id"));
			if (stringDNA.indexOf("@") >= 0) {
				String varStr = stringDNA.substring(stringDNA.indexOf("@") + 1);
				if (varStr.equalsIgnoreCase("triops_random")) {
					varStr = "triops" + (itemRand.nextInt(3) + 1);
				}
				if (varStr.equalsIgnoreCase("dragonfly_random")) {
					varStr = "dragonfly" + (itemRand.nextInt(10) + 1);
				}
				if (varStr.equalsIgnoreCase("gendered")) {
					if (itemRand.nextInt(2) == 0) {
						varStr = "male";
					}
					else {
						varStr = "female";
					}
				}
				return varStr;
			}
			return "";
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

		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
		{
			ItemStack itemstack = playerIn.getHeldItem(handIn);
			RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, true);

			if (!itemstack.hasTagCompound()) {
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
			}

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

					if (getEntityFromNBT(itemstack) != null) {
						//Entities:
						boolean isBaby = false;
						String nbtStr = "";
						Entity entity = EntityList.createEntityByIDFromName(EntityList.getKey(getEntityFromNBT(itemstack)), worldIn);
						if (entity instanceof EntityPrehistoricFloraAgeableBase) {
							nbtStr = "{AgeTicks:0}";
							isBaby = true;
						}
						else {
							if (itemstack.getTagCompound().hasKey("PFMob")) {
								NBTTagCompound blockNBT = (NBTTagCompound) itemstack.getTagCompound().getTag("PFMob");
								String stringDNA = (blockNBT.getString("id"));
								if (stringDNA.startsWith("fossil:")) {
									nbtStr = "{Age:-25000, Gender:" + itemRand.nextInt(2) + "}";
								} else {
									nbtStr = "{Age:-25000}";
								}
							} else {
								nbtStr = "{Age:-25000}";
							}
						}
						if (!(worldIn.isRemote)) {
							if (worldIn.getBlockState(blockpos).getBlock().getRegistryName().toString().equalsIgnoreCase("jaff:tank") && raytraceresult.sideHit == EnumFacing.UP) {
								blockpos = blockpos.down(); // If it's a JAFF tank place it IN the tank if we are clicking above it
							}

							if (iblockstate.getMaterial() == Material.WATER) {
								if (this.getVariantID(itemstack).equalsIgnoreCase("")) {
									EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(getEntityFromNBT(itemstack)).toString(), nbtStr, blockpos.getX() + 0.5, blockpos.getY() + 0.5, blockpos.getZ() + 0.5, isBaby);
								}
								else {
									EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(getEntityFromNBT(itemstack)).toString() + "@" + this.getVariantID(itemstack), nbtStr, blockpos.getX() + 0.5, blockpos.getY() + 0.5, blockpos.getZ() + 0.5, isBaby);
								}
							}
							else {
								blockpos = blockpos.offset(raytraceresult.sideHit);
								if (this.getVariantID(itemstack).equalsIgnoreCase("")) {
									EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(getEntityFromNBT(itemstack)).toString(), nbtStr, blockpos.getX() + 0.5, blockpos.getY(), blockpos.getZ() + 0.5, isBaby);
								}
								else {
									EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(getEntityFromNBT(itemstack)).toString() + "@" + this.getVariantID(itemstack), nbtStr,blockpos.getX() + 0.5, blockpos.getY(), blockpos.getZ() + 0.5, isBaby);
								}
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
					else if (getStateFromNBT(itemstack) != null || getItemFromNBT(itemstack) != null) {
						//Plants/Blocks:
						IBlockState block = getStateFromNBT(itemstack);
						Item item = null;
						//System.err.println("block " + block);

						//Deal with vanilla first:
						if (block.getBlock() == Blocks.SAPLING || block.getBlock() == Blocks.TALLGRASS) {
							if (block.getBlock().canPlaceBlockAt(worldIn, blockpos.offset(raytraceresult.sideHit))) {
								worldIn.setBlockState(blockpos.offset(raytraceresult.sideHit), block);
								block.getBlock().onBlockAdded(worldIn, blockpos.offset(raytraceresult.sideHit), block);
								worldIn.playSound(playerIn, blockpos, SoundEvents.BLOCK_GRASS_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
								if (!playerIn.isCreative()) {
									itemstack.shrink(1);
								}
								return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
							}
						}
						else if (block.getBlock() == Blocks.DOUBLE_PLANT) {
							if (block.getBlock().canPlaceBlockAt(worldIn, blockpos.offset(raytraceresult.sideHit))) {
								worldIn.setBlockState(blockpos.offset(raytraceresult.sideHit), block);
								((BlockDoublePlant)block.getBlock()).placeAt(worldIn, blockpos.offset(raytraceresult.sideHit), block.getValue(BlockDoublePlant.VARIANT), 3);
								block.getBlock().onBlockAdded(worldIn, blockpos.offset(raytraceresult.sideHit), block);
								worldIn.playSound(playerIn, blockpos, SoundEvents.BLOCK_GRASS_PLACE, SoundCategory.BLOCKS, 1.0F, 1.0F);
								if (!playerIn.isCreative()) {
									itemstack.shrink(1);
								}
								return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
							}
						}

						//Now modded:
						else if (block != null) {
							if (block.getBlock() != Blocks.AIR) {
								ItemStack pickBlock = block.getBlock().getPickBlock(block.getBlock().getDefaultState(), new RayTraceResult(playerIn), worldIn, blockpos, playerIn);
								item = pickBlock.getItem();
							}
							else {
								item = getItemFromNBT(itemstack);
							}
						}
						else {
							item = getItemFromNBT(itemstack);
						}
						if (item != null) {
							//System.err.println("blockpos " + blockpos);
							EnumActionResult result = item.onItemUse(playerIn, worldIn, blockpos, handIn, raytraceresult.sideHit, 0.5F, 0F, 0.5F);
							if (!playerIn.isCreative() && result == EnumActionResult.SUCCESS) {
								//Shrink it if the item is not the block:
								if (Block.getBlockFromItem(item) == null || Block.getBlockFromItem(item) == Blocks.AIR) {
									itemstack.shrink(1);
								}
							}
							if (result == EnumActionResult.SUCCESS) { //Things like floating water plant items:
								//if (!playerIn.isCreative()) {
									//itemstack.shrink(1);
								//}
								return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
							}
							else {
								//Try the right click action instead
								ActionResult actionResult = item.onItemRightClick(worldIn, playerIn, handIn);
								if (!playerIn.isCreative() && actionResult.getType() == EnumActionResult.SUCCESS) {
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
											//if (!playerIn.isCreative() && result == EnumActionResult.SUCCESS) {
											//	itemstack.shrink(1);
											//}
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
