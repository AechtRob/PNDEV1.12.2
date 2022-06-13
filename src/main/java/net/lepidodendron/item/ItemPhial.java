
package net.lepidodendron.item;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.block.*;
import net.lepidodendron.creativetab.TabLepidodendronMisc;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.items.ItemHandlerHelper;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemPhial extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:phial")
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
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:phial", "inventory"));
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setTranslationKey("pf_phial");
			setRegistryName("phial");
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

		public static boolean collectEggs(ItemStack stack, World worldIn, BlockPos target, EntityPlayer player, @javax.annotation.Nullable EnumHand hand)
		{
			IBlockState iblockstate = worldIn.getBlockState(target);
			Block blockTarget = iblockstate.getBlock();

			if (!worldIn.isRemote) {
				boolean collected = false;
				boolean removed = false;
				EntityItem entityToSpawn = null;
				ItemStack phial = null;

				if (blockTarget == BlockEggsCladoselache.block || blockTarget ==BlockEggsCladoselachePlaceable.block) {
					phial = new ItemStack(ItemPhialEggsCladoselache.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEggsDracopristis.block || blockTarget == BlockEggsDracopristisPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsDracopristis.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEggsHyneria.block || blockTarget == BlockEggsHyneriaPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsHyneria.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEggsOnychodus.block || blockTarget == BlockEggsOnychodusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsOnychodus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEggsRhizodus.block || blockTarget == BlockEggsRhizodusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsRhizodus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEggsXenacanthus.block || blockTarget == BlockEggsXenacanthusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsXenacanthus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEurypteridEggsAcutiramus.block || blockTarget == BlockEurypteridEggsAcutiramusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsAcutiramus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEurypteridEggsCarcinosoma.block || blockTarget == BlockEurypteridEggsCarcinosomaPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsCarcinosoma.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEurypteridEggsEurypterus.block || blockTarget == BlockEurypteridEggsEurypterusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsEurypterus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEurypteridEggsAdelophthalmus.block || blockTarget == BlockEurypteridEggsAdelophthalmusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsAdelophthalmus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEurypteridEggsHibbertopterus.block || blockTarget == BlockEurypteridEggsHibbertopterusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsHibbertopterus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEurypteridEggsJaekelopterus.block || blockTarget == BlockEurypteridEggsJaekelopterusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsJaekelopterus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEurypteridEggsKokomopterus.block || blockTarget == BlockEurypteridEggsKokomopterusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsKokomopterus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEurypteridEggsMegarachne.block || blockTarget == BlockEurypteridEggsMegarachnePlaceable.block) {
					phial = new ItemStack(ItemPhialEggsMegarachne.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEurypteridEggsMixopterus.block || blockTarget == BlockEurypteridEggsMixopterusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsMixopterus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEurypteridEggsPagea.block || blockTarget == BlockEurypteridEggsPageaPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsPagea.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockInsectEggsPalaeodictyoptera.block || blockTarget == BlockInsectEggsPalaeodictyopteraPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsPalaeodictyoptera.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockInsectEggsPalaeodictyopteraPerm.block || blockTarget == BlockInsectEggsPalaeodictyopteraPlaceablePerm.block) {
					phial = new ItemStack(ItemPhialEggsPalaeodictyopteraPerm.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockInsectEggsMeganeuropsis.block || blockTarget == BlockInsectEggsMeganeuropsisPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsMeganeuropsis.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEurypteridEggsPterygotus.block || blockTarget == BlockEurypteridEggsPterygotusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsPterygotus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockInsectEggsAttercopus.block) {
					phial = new ItemStack(ItemPhialEggsAttercopus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockInsectEggsEoarthropleura.block) {
					phial = new ItemStack(ItemPhialEggsEoarthropleura.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockInsectEggsPneumodesmus.block) {
					phial = new ItemStack(ItemPhialEggsPneumodesmus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockInsectEggsTrigonotarbidCarb.block) {
					phial = new ItemStack(ItemPhialEggsTrigonotarbidCarb.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockInsectEggsTrigonotarbidDev.block) {
					phial = new ItemStack(ItemPhialEggsTrigonotarbidDev.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockInsectEggsTrigonotarbidOS.block) {
					phial = new ItemStack(ItemPhialEggsTrigonotarbidOS.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockInsectEggsTrigonotarbidPerm.block) {
					phial = new ItemStack(ItemPhialEggsTrigonotarbidPerm.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockInsectEggsHarvestman.block) {
					phial = new ItemStack(ItemPhialEggsHarvestman.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnAmphibamus.block || blockTarget == BlockAmphibianSpawnAmphibamusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsAmphibamus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnIchthyostega.block || blockTarget == BlockAmphibianSpawnIchthyostegaPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsIchthyostega.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnLimnoscelis.block || blockTarget == BlockAmphibianSpawnLimnoscelisPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsLimnoscelis.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnMegalocephalus.block || blockTarget == BlockAmphibianSpawnMegalocephalusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsMegalocephalus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnSpathicephalus.block || blockTarget == BlockAmphibianSpawnSpathicephalusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsSpathicephalus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnEryops.block || blockTarget == BlockAmphibianSpawnEryopsPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsEryops.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnAcanthostega.block || blockTarget == BlockAmphibianSpawnAcanthostegaPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsAcanthostega.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnPlatyhystrix.block || blockTarget == BlockAmphibianSpawnPlatyhystrixPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsPlatyhystrix.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnPederpes.block || blockTarget == BlockAmphibianSpawnPederpesPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsPederpes.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnProterogyrinus.block || blockTarget == BlockAmphibianSpawnProterogyrinusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsProterogyrinus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEggsListracanthus.block || blockTarget == BlockEggsListracanthusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsListracanthus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnPrionosuchus.block || blockTarget == BlockAmphibianSpawnPrionosuchusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsPrionosuchus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnPholiderpeton.block || blockTarget == BlockAmphibianSpawnPholiderpetonPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsPholiderpeton.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEggsEdestus.block || blockTarget == BlockEggsEdestusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsEdestus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnAcanthostomatops.block || blockTarget == BlockAmphibianSpawnAcanthostomatopsPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsAcanthostomatops.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEggsKaibabvenator.block || blockTarget == BlockEggsKaibabvenatorPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsKaibabvenator.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEggsSaivodus.block || blockTarget == BlockEggsSaivodusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsSaivodus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEggsHelicoprion.block || blockTarget == BlockEggsHelicoprionPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsHelicoprion.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEurypteridEggsAntarcticarcinus.block || blockTarget == BlockEurypteridEggsAntarcticarcinusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsAntarcticarcinus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnCrassigyrinus.block || blockTarget == BlockAmphibianSpawnCrassigyrinusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsCrassigyrinus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockEurypteridEggsMegalograptus.block || blockTarget == BlockEurypteridEggsMegalograptusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsMegalograptus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockInsectEggsMeganeura.block || blockTarget == BlockInsectEggsMeganeuraPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsMeganeura.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnDiplocaulus.block || blockTarget == BlockAmphibianSpawnDiplocaulusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsDiplocaulus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnDiploceraspis.block || blockTarget == BlockAmphibianSpawnDiploceraspisPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsDiploceraspis.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnCacops.block || blockTarget == BlockAmphibianSpawnCacopsPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsCacops.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnDasyceps.block || blockTarget == BlockAmphibianSpawnDasycepsPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsDasyceps.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnDvinosaurus.block || blockTarget == BlockAmphibianSpawnDvinosaurusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsDvinosaurus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnMelosaurus.block || blockTarget == BlockAmphibianSpawnMelosaurusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsMelosaurus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnPantylus.block || blockTarget == BlockAmphibianSpawnPantylusPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsPantylus.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnUranocentrodon.block || blockTarget == BlockAmphibianSpawnUranocentrodonPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsUranocentrodon.block, (int) (1));
					collected = true;
					removed = true;
				}

				else if (blockTarget == BlockAmphibianSpawnBalanerpeton.block || blockTarget == BlockAmphibianSpawnBalanerpetonPlaceable.block) {
					phial = new ItemStack(ItemPhialEggsBalanerpeton.block, (int) (1));
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
					if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_os")) {
						phial = new ItemStack(ItemPhialEggsTrigonotarbidOS.block, (int) (1));
						collected = true;
					}
					else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_dev")) {
						phial = new ItemStack(ItemPhialEggsTrigonotarbidDev.block, (int) (1));
						collected = true;
					}
					else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_carb")) {
						phial = new ItemStack(ItemPhialEggsTrigonotarbidCarb.block, (int) (1));
						collected = true;
					}
					else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_perm")) {
						phial = new ItemStack(ItemPhialEggsTrigonotarbidPerm.block, (int) (1));
						collected = true;
					}
					else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_attercopus")) {
						phial = new ItemStack(ItemPhialEggsAttercopus.block, (int) (1));
						collected = true;
					}
					else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_pneumodesmus")) {
						phial = new ItemStack(ItemPhialEggsPneumodesmus.block, (int) (1));
						collected = true;
					}
					else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_eoarthropleura")) {
						phial = new ItemStack(ItemPhialEggsEoarthropleura.block, (int) (1));
						collected = true;
					}
					else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_archoblattina")) {
						phial = new ItemStack(ItemPhialEggsArchoblattina.block, (int) (1));
						collected = true;
					}
					else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_roachoid_arid")) {
						phial = new ItemStack(ItemPhialEggsRoachoidArid.block, (int) (1));
						collected = true;
					}
					else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_roachoid_forest")) {
						phial = new ItemStack(ItemPhialEggsRoachoidForest.block, (int) (1));
						collected = true;
					}
					else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_roachoid_swamp")) {
						phial = new ItemStack(ItemPhialEggsRoachoidSwamp.block, (int) (1));
						collected = true;
					}
					else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_gerarus")) {
						phial = new ItemStack(ItemPhialEggsGerarus.block, (int) (1));
						collected = true;
					}
					else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_harvestman")) {
						phial = new ItemStack(ItemPhialEggsHarvestman.block, (int) (1));
						collected = true;
					}

					else if (blockTarget == BlockEggsSaivodus.block || blockTarget == BlockEggsSaivodusPlaceable.block) {
						phial = new ItemStack(ItemPhialEggsSaivodus.block, (int) (1));
						collected = true;
						removed = true;
					}

					else if (blockTarget == BlockEggsKaibabvenator.block || blockTarget == BlockEggsKaibabvenatorPlaceable.block) {
						phial = new ItemStack(ItemPhialEggsKaibabvenator.block, (int) (1));
						collected = true;
						removed = true;
					}


					if (collected) {
						IBlockState state = worldIn.getBlockState(target);
						TileEntity te = worldIn.getTileEntity(target);
						if (te != null) {
							te.getTileData().removeTag("egg");
						}
						worldIn.notifyBlockUpdate(target, state, state, 3);
					}
				}

				if (collected) {
					if (removed) {
						worldIn.setBlockToAir(target);
					}
					SoundEvent soundevent = SoundEvents.ITEM_BOTTLE_FILL;
					worldIn.playSound(player, target, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
					stack.shrink(1);
					//if (!player.isCreative()) {
						if (player.inventory.getFirstEmptyStack() == -1) {
							//Is there room for this in an existing stack?
							int i = 1;
							int slotSpace = 0;
							while (i <= 32 && slotSpace == 0) {
								if (player.inventory.getStackInSlot(i).getItem() == phial.getItem()
										&& player.inventory.getStackInSlot(i).getCount() < phial.getMaxStackSize()) {
									phial.setCount(1);
									ItemHandlerHelper.giveItemToPlayer(player, phial);
									slotSpace=i;
								}
								i += 1;
							}
							if (slotSpace == 0) { //No slots free in main inventory so just drop the item:
								entityToSpawn = new EntityItem(worldIn, target.getX() + 0.5, target.getY(), target.getZ() + 0.5, phial);
								entityToSpawn.setPickupDelay(10);
								worldIn.spawnEntity(entityToSpawn);
							}
						} else {
							phial.setCount(1);
							ItemHandlerHelper.giveItemToPlayer(player, phial);
						}
					//}

					return true;
				}
			}

			return false;
		}

	}

}
