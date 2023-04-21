package net.lepidodendron;

import net.lepidodendron.block.*;
import net.lepidodendron.entity.EntityPrehistoricFloraMeteor;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableFishBase;
import net.lepidodendron.item.*;
import net.lepidodendron.util.*;
import net.lepidodendron.world.biome.precambrian.BiomePrecambrian;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.entity.player.PlayerContainerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

public class LepidodendronEventSubscribers {

	@SubscribeEvent //Give the Palaeopedia on first join:
	public void playerJoined(EntityJoinWorldEvent event) {
		if (!LepidodendronConfig.giveBook) {
			return;
		}
		if ((event.getEntity() instanceof EntityPlayerMP)) {
			ModTriggers.PALAEOPEDIA_GIVEN.trigger((EntityPlayerMP) event.getEntity());
		}
	}

	@SubscribeEvent //Replace petrified plants and incorrect phials:
	public void petrifieds(PlayerContainerEvent event) {
		Container container = event.getContainer();
		List<Slot> itemSlots = container.inventorySlots;

		for (Slot currentSlot : itemSlots) {
			ItemStack currentItemStack = container.getSlot(currentSlot.slotNumber).getStack();
			if (!currentItemStack.isEmpty()) {
				if (currentItemStack.getItem() instanceof ItemPetrified) {
					int i = currentItemStack.getCount();
					Item itemPetrified = ((ItemPetrified) currentItemStack.getItem()).getPlantStack().getItem();
					String stringPetrified = itemPetrified.getRegistryName().toString();
					ItemStack newStack = new ItemStack(ItemFossilClean.block, i);
					NBTTagCompound plantNBT = new NBTTagCompound();
					plantNBT.setString("id", stringPetrified);
					NBTTagCompound stackNBT = new NBTTagCompound();
					stackNBT.setTag("PFPlant", plantNBT);
					newStack.setTagCompound(stackNBT);
					container.putStackInSlot(currentSlot.slotNumber, newStack);
				}
				if (currentItemStack.getItem() == ItemPhialFull.block) {
					if (currentItemStack.hasTagCompound()) {
						if (!ItemPhialFull.ItemCustom.isBlockFromItemStack(currentItemStack)) {
							int i = currentItemStack.getCount();
							ItemStack newStack = new ItemStack(ItemPhial.block, i);
							container.putStackInSlot(currentSlot.slotNumber, newStack);
						} else {
							return;
						}
					}
					else {
						int i = currentItemStack.getCount();
						ItemStack newStack = new ItemStack(ItemPhial.block, i);
						container.putStackInSlot(currentSlot.slotNumber, newStack);
					}
				}
			}
		}
	}


	@SubscribeEvent //Spawn Hadean meteors
	public void meteors(WorldTickEvent event) {
		boolean spawnShower = false;
		if (event.world != null && !event.world.isRemote && LepidodendronConfig.doMeteorites) {
			if (event.world.rand.nextInt(6000) == 0) {//Note that lowering this number spawns meteors more frequently, default 6000
				if (!event.world.playerEntities.isEmpty()) {
					EntityPlayer p = (EntityPlayer) event.world.playerEntities.get(event.world.rand.nextInt(event.world.playerEntities.size()));
					BlockPos pos = new BlockPos((p.posX + event.world.rand.nextInt(201) - 100), 300, (p.posZ + event.world.rand.nextInt(201) - 100));
					if (p != null && p.dimension == LepidodendronConfig.dimPrecambrian) {
						Biome biome = event.world.getBiome(pos);
						if (biome instanceof BiomePrecambrian) {
							if (((BiomePrecambrian) biome).getBiomeType() == EnumBiomeTypePrecambrian.Hadean) {
								spawnShower = (event.world.rand.nextInt(50) == 0);
								{
									EntityPrehistoricFloraMeteor meteor = new EntityPrehistoricFloraMeteor(event.world, pos.getX(), pos.getY(), pos.getZ());
									meteor.motionX = event.world.rand.nextDouble() - 0.5;
									meteor.motionZ = event.world.rand.nextDouble() - 0.5;
									event.world.spawnEntity(meteor);
								}
								if (spawnShower) {
									EntityPrehistoricFloraMeteor meteor = new EntityPrehistoricFloraMeteor(event.world, pos.getX(), pos.getY(), pos.getZ());
									meteor.motionX = event.world.rand.nextDouble() - 0.5;
									meteor.motionZ = event.world.rand.nextDouble() - 0.5;
									event.world.spawnEntity(meteor);
									if (event.world.rand.nextInt(3) == 0) {
										EntityPrehistoricFloraMeteor meteor2 = new EntityPrehistoricFloraMeteor(event.world, pos.getX(), pos.getY(), pos.getZ());
										meteor.motionX = event.world.rand.nextDouble() - 0.5;
										meteor.motionZ = event.world.rand.nextDouble() - 0.5;
										event.world.spawnEntity(meteor2);
									}
									if (event.world.rand.nextInt(3) == 0) {
										EntityPrehistoricFloraMeteor meteor3 = new EntityPrehistoricFloraMeteor(event.world, pos.getX(), pos.getY(), pos.getZ());
										meteor.motionX = event.world.rand.nextDouble() - 0.5;
										meteor.motionZ = event.world.rand.nextDouble() - 0.5;
										event.world.spawnEntity(meteor3);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@SubscribeEvent //Block other mods' normal spawns
	public void onSpawn(LivingSpawnEvent event) {
		if ((event.getWorld().provider.getDimension() != LepidodendronConfig.dimPrecambrian
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimCambrian
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimOrdovician
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimSilurian
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimDevonian
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimCarboniferous
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimPermian
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimTriassic
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimJurassic
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimCretaceous
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimPaleogene
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimNeogene
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimPleistocene)
				|| event.getEntity() == null) {
			return;
		}
		if (EntityList.getKey(event.getEntity()) == null) {
			return;
		}
		String resLocation = EntityList.getKey(event.getEntity()).toString();
		int strPos1 = resLocation.indexOf(":");
		if ((strPos1 > 0)) {
			String modid = resLocation.substring(0, strPos1);
			if (modid.equalsIgnoreCase("fossil") || modid.equalsIgnoreCase("rebornmod")
					|| modid.equalsIgnoreCase("lepidodendron")) {
				return;
			} else {
				if (LepidodendronConfig.blockMobs) {
					event.setResult(Event.Result.DENY);
				}
			}
		}
	}

	@SubscribeEvent //BlockTrap Horses and other mobs
	public void onJoinSpawn(EntityJoinWorldEvent event) {
		if ((event.getWorld().provider.getDimension() != LepidodendronConfig.dimPrecambrian
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimCambrian
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimOrdovician
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimSilurian
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimDevonian
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimCarboniferous
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimPermian
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimTriassic
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimJurassic
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimCretaceous
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimPaleogene
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimNeogene
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimPleistocene)
				|| event.getEntity() == null) {
			return;
		}
		if (LepidodendronConfig.blockSkeletonHorse) {
			if (event.getEntity() instanceof EntitySkeletonHorse) {
				event.setCanceled(true);
				return;
			}
		}
		if (EntityList.getKey(event.getEntity()) == null) {
			return;
		}
		String resLocation = EntityList.getKey(event.getEntity()).toString();
		int strPos1 = resLocation.indexOf(":");
		if (strPos1 > 0) {
			String modid = resLocation.substring(0, strPos1);
			int nautilus = resLocation.indexOf("fossil.nautilus");
			int coelacanth = resLocation.indexOf("fossil.coelacanth");
			int alligator_gar = resLocation.indexOf("fossil.alligator_gar");
			int sturgeon = resLocation.indexOf("fossil.sturgeon");

			if (modid.equalsIgnoreCase("fossil")
					&& (nautilus > 0 || coelacanth > 0
					|| alligator_gar > 0 || sturgeon > 0)
			) {
				if (LepidodendronConfig.blockMobsFAExceptions) {
					event.setCanceled(true);
				} else if ((nautilus > 0 || coelacanth > 0)
						&& (event.getWorld().provider.getDimension() == LepidodendronConfig.dimPrecambrian
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimCambrian
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimOrdovician
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimSilurian
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimDevonian
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimCarboniferous
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimPermian)) {
					event.setCanceled(true);
				} else if ((sturgeon > 0)
						&& (event.getWorld().provider.getDimension() == LepidodendronConfig.dimPrecambrian
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimCambrian
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimOrdovician
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimSilurian
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimDevonian
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimCarboniferous
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimPermian
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimTriassic)) {
					event.setCanceled(true);
				} else if ((alligator_gar > 0)
						&& (event.getWorld().provider.getDimension() == LepidodendronConfig.dimPrecambrian
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimCambrian
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimOrdovician
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimSilurian
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimDevonian
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimCarboniferous
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimPermian
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimTriassic
						|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimJurassic)) {
					event.setCanceled(true);
				}
			}
		}
	}

	@SubscribeEvent //We want to drop the items (also for the Taxidermy finished items)
	public void clickDisplays(PlayerInteractEvent.LeftClickBlock event) {
		if (event.getWorld().getBlockState(event.getPos()).getBlock() == BlockDisplayCase.block
				&& event.getHand() == EnumHand.MAIN_HAND) {
			TileEntity te = event.getWorld().getTileEntity(event.getPos());
			if (te != null) {
				if (te instanceof BlockDisplayCase.TileEntityDisplayCase) {
					BlockDisplayCase.TileEntityDisplayCase tee = (BlockDisplayCase.TileEntityDisplayCase) te;
					if (tee.hasItem()) {
						if (!(event.getWorld().isRemote)) {
							ItemStack itemstack = tee.getStackInSlot(0);
							Block.spawnAsEntity(event.getWorld(), event.getPos(), itemstack);
							SoundEvent soundevent = SoundEvents.ENTITY_ITEMFRAME_REMOVE_ITEM;
							((WorldServer) event.getEntityPlayer().getEntityWorld()).playSound(null, event.getPos(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
							event.getEntityPlayer().swingArm(event.getHand());
						}
						tee.setDisplay(ItemStack.EMPTY);
						//return;
						event.setCanceled(true);
					}
				}
			}
		} else if (event.getWorld().getBlockState(event.getPos()).getBlock() == BlockDisplayCaseMagnifying.block
				&& event.getHand() == EnumHand.MAIN_HAND) {
			TileEntity te = event.getWorld().getTileEntity(event.getPos());
			if (te != null) {
				if (te instanceof BlockDisplayCaseMagnifying.TileEntityDisplayCase) {
					BlockDisplayCaseMagnifying.TileEntityDisplayCase tee = (BlockDisplayCaseMagnifying.TileEntityDisplayCase) te;
					if (tee.hasItem()) {
						if (!(event.getWorld().isRemote)) {
							ItemStack itemstack = tee.getStackInSlot(0);
							Block.spawnAsEntity(event.getWorld(), event.getPos(), itemstack);

							SoundEvent soundevent = SoundEvents.ENTITY_ITEMFRAME_REMOVE_ITEM;
							((WorldServer) event.getEntityPlayer().getEntityWorld()).playSound(null, event.getPos(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
							event.getEntityPlayer().swingArm(event.getHand());
						}
						tee.setDisplay(ItemStack.EMPTY);
						//return;
						event.setCanceled(true);
					}
				}
			}
		} else if (event.getWorld().getBlockState(event.getPos()).getBlock() == BlockDisplayWallMount.block
				&& event.getHand() == EnumHand.MAIN_HAND) {
			TileEntity te = event.getWorld().getTileEntity(event.getPos());
			if (te != null) {
				if (te instanceof BlockDisplayWallMount.TileEntityDisplayWallMount) {
					BlockDisplayWallMount.TileEntityDisplayWallMount tee = (BlockDisplayWallMount.TileEntityDisplayWallMount) te;
					if (tee.hasItem()) {
						if (!(event.getWorld().isRemote)) {
							ItemStack itemstack = tee.getStackInSlot(0);
							Block.spawnAsEntity(event.getWorld(), event.getPos(), itemstack);

							SoundEvent soundevent = SoundEvents.ENTITY_ITEMFRAME_REMOVE_ITEM;
							((WorldServer) event.getEntityPlayer().getEntityWorld()).playSound(null, event.getPos(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
							event.getEntityPlayer().swingArm(event.getHand());
						}
						tee.setDisplay(ItemStack.EMPTY);
						//return;
						event.getWorld().markBlockRangeForRenderUpdate(event.getPos(), event.getPos());
						event.setCanceled(true);
					}
				}
			}
		} else if (event.getWorld().getBlockState(event.getPos()).getBlock() == BlockDisplayPlinth.block
				&& event.getHand() == EnumHand.MAIN_HAND) {
			TileEntity te = event.getWorld().getTileEntity(event.getPos());
			if (te != null) {
				if (te instanceof BlockDisplayPlinth.TileEntityDisplayPlinth) {
					BlockDisplayPlinth.TileEntityDisplayPlinth tee = (BlockDisplayPlinth.TileEntityDisplayPlinth) te;
					if (tee.hasItem()) {
						if (!(event.getWorld().isRemote)) {
							ItemStack itemstack = tee.getStackInSlot(0);
							Block.spawnAsEntity(event.getWorld(), event.getPos(), itemstack);
							//tee.setInventorySlotContents(0, ItemStack.EMPTY);

							SoundEvent soundevent = SoundEvents.ENTITY_ITEMFRAME_REMOVE_ITEM;
							((WorldServer) event.getEntityPlayer().getEntityWorld()).playSound(null, event.getPos(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
							event.getEntityPlayer().swingArm(event.getHand());
						}
						tee.setDisplay(ItemStack.EMPTY);
						//return;
						event.setCanceled(true);
					}
				}
			}
		}
		else if (event.getWorld().getBlockState(event.getPos()).getBlock() == BlockTaxidermyTable.block
				&& event.getHand() == EnumHand.MAIN_HAND) {
			TileEntity te = event.getWorld().getTileEntity(event.getPos());
			if (te != null) {
				if (te instanceof BlockTaxidermyTable.TileEntityTaxidermyTable) {
					BlockTaxidermyTable.TileEntityTaxidermyTable tee = (BlockTaxidermyTable.TileEntityTaxidermyTable) te;
					if (!tee.getStackInSlot(1).isEmpty()) {
						if (!(event.getWorld().isRemote)) {
							ItemStack itemstack = tee.getStackInSlot(1);
							Block.spawnAsEntity(event.getWorld(), event.getPos(), itemstack);
							//tee.setInventorySlotContents(0, ItemStack.EMPTY);

							SoundEvent soundevent = SoundEvents.ENTITY_ITEMFRAME_REMOVE_ITEM;
							((WorldServer) event.getEntityPlayer().getEntityWorld()).playSound(null, event.getPos(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
							event.getEntityPlayer().swingArm(event.getHand());
						}
						tee.removeStackFromSlot(1);
						tee.notifyBlockUpdate();
						//return;
						event.setCanceled(true);
					}
				}
			}
		}
	}

	@SubscribeEvent //Vanilla plants drops modifications: prevent bonemealing for propagation or growing ferns or grass
	public void onBonemeal(BonemealEvent event) {
		if (event.getBlock().getBlock() instanceof BlockDoublePlant && LepidodendronConfig.doPropagationVanilla) {
			event.setCanceled(true);
		}
		if (event.getBlock().getBlock() instanceof BlockTallGrass && LepidodendronConfig.doPropagationVanilla) {
			event.setCanceled(true);
		}
		if ((event.getBlock().getBlock() instanceof BlockGrass || event.getBlock().getMaterial() == Material.GRASS) && LepidodendronConfig.doPropagationVanilla) {
			event.setCanceled(true);
		}
	}

	@SubscribeEvent //We want to drop the real items or flowers
	public void onSheared(PlayerInteractEvent.LeftClickBlock event) {
		if (event.getWorld().getBlockState(event.getPos()).getBlock() == Blocks.DOUBLE_PLANT
				&& event.getItemStack().getItem() instanceof ItemShears && LepidodendronConfig.doPropagationVanilla
				&& event.getHand() == EnumHand.MAIN_HAND) {
			BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttype = (BlockDoublePlant.EnumPlantType) event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.VARIANT);
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.GRASS
					|| blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.FERN) { //imitate a regular harvest without shears:
				event.getEntityPlayer().swingArm(event.getHand());
				if (!(event.getWorld().isRemote)) {
					event.getWorld().destroyBlock(event.getPos(), false);
					event.getWorld().setBlockToAir(event.getPos().up());
				}
				event.getItemStack().damageItem(1, event.getEntityPlayer());
				event.setCanceled(true);
			} else if (event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.UPPER
					&& event.getWorld().getBlockState(event.getPos().down()).getBlock() == Blocks.DOUBLE_PLANT) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttypeDown = (BlockDoublePlant.EnumPlantType) event.getWorld().getBlockState(event.getPos().down()).getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumplanttypeDown == BlockDoublePlant.EnumPlantType.GRASS
						|| blockdoubleplant$enumplanttypeDown == BlockDoublePlant.EnumPlantType.FERN) { //imitate a regular harvest without shears:
					event.getEntityPlayer().swingArm(event.getHand());
					if (!(event.getWorld().isRemote)) {
						event.getWorld().destroyBlock(event.getPos(), false);
						event.getWorld().setBlockToAir(event.getPos().up());
					}
					event.getItemStack().damageItem(1, event.getEntityPlayer());
					event.setCanceled(true);
				}
			} else if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.ROSE) { //spawn rose flowers:
				event.getEntityPlayer().swingArm(event.getHand());
				Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemRoseFlower.block, 1));
				event.getItemStack().damageItem(1, event.getEntityPlayer());
				event.setCanceled(true);
			} else if (event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.UPPER
					&& event.getWorld().getBlockState(event.getPos().down()).getBlock() == Blocks.DOUBLE_PLANT) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttypeDown = (BlockDoublePlant.EnumPlantType) event.getWorld().getBlockState(event.getPos().down()).getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumplanttypeDown == BlockDoublePlant.EnumPlantType.ROSE) { //spawn rose flowers:
					event.getEntityPlayer().swingArm(event.getHand());
					Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemRoseFlower.block, 1));
					event.getItemStack().damageItem(1, event.getEntityPlayer());
					event.setCanceled(true);
				}
			} else if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.PAEONIA) { //spawn Peony flowers:
				event.getEntityPlayer().swingArm(event.getHand());
				Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemPeonyFlower.block, 1));
				event.getItemStack().damageItem(1, event.getEntityPlayer());
				event.setCanceled(true);
			} else if (event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.UPPER
					&& event.getWorld().getBlockState(event.getPos().down()).getBlock() == Blocks.DOUBLE_PLANT) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttypeDown = (BlockDoublePlant.EnumPlantType) event.getWorld().getBlockState(event.getPos().down()).getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumplanttypeDown == BlockDoublePlant.EnumPlantType.PAEONIA) { //spawn Peony flowers:
					event.getEntityPlayer().swingArm(event.getHand());
					Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemPeonyFlower.block, 1));
					event.getItemStack().damageItem(1, event.getEntityPlayer());
					event.setCanceled(true);
				}
			} else if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.SYRINGA) { //spawn lilac flowers:
				event.getEntityPlayer().swingArm(event.getHand());
				Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemLilacFlower.block, 1));
				event.getItemStack().damageItem(1, event.getEntityPlayer());
				event.setCanceled(true);
			} else if (event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.UPPER
					&& event.getWorld().getBlockState(event.getPos().down()).getBlock() == Blocks.DOUBLE_PLANT) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttypeDown = (BlockDoublePlant.EnumPlantType) event.getWorld().getBlockState(event.getPos().down()).getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumplanttypeDown == BlockDoublePlant.EnumPlantType.SYRINGA) { //spawn lilac flowers:
					event.getEntityPlayer().swingArm(event.getHand());
					Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemLilacFlower.block, 1));
					event.getItemStack().damageItem(1, event.getEntityPlayer());
					event.setCanceled(true);
				}
			}
		} else if (event.getWorld().getBlockState(event.getPos()).getBlock() == Blocks.DOUBLE_PLANT
				&& (!(event.getItemStack().getItem() instanceof ItemShears)) && LepidodendronConfig.doPropagationVanilla
				&& event.getHand() == EnumHand.MAIN_HAND) {
			BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttype = (BlockDoublePlant.EnumPlantType) event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.VARIANT);
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.GRASS
					|| blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.FERN) {

			}
		}
	}

	@SubscribeEvent //Vanilla plants drops modifications: replace saplings with seeds etc.
	public void onBlockHarvest(BlockEvent.HarvestDropsEvent event) {
		if (!LepidodendronConfig.doPropagationVanilla && !LepidodendronConfig.fixApples) {
			return;
		}
		boolean dropSelf = true;
		if (event.getState().getBlock() instanceof BlockDoublePlant && LepidodendronConfig.doPropagationVanilla) {
			BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttype = (BlockDoublePlant.EnumPlantType) event.getState().getValue(BlockDoublePlant.VARIANT);
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.FERN
					|| blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.GRASS) {
				dropSelf = false; //the large fern and large grass don't drop themselves, but we want to make it so that they do
			}
		}
		if (event.getState().getBlock() instanceof BlockTallGrass && LepidodendronConfig.doPropagationVanilla) {
			BlockTallGrass.EnumType blocktallgrass$enumtype = (BlockTallGrass.EnumType) event.getState().getValue(BlockTallGrass.TYPE);
			if (blocktallgrass$enumtype == BlockTallGrass.EnumType.GRASS) {
				dropSelf = false; //the grass needs shears but we want to drop it without needing them
			}
		}
		int i = 0;
		while (i + 1 <= event.getDrops().size()) {
			Item item = event.getDrops().get(i).getItem();
			Block block = Block.getBlockFromItem(item);

			if (event.getState().getBlock() instanceof BlockDoublePlant && LepidodendronConfig.doPropagationVanilla) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttype = (BlockDoublePlant.EnumPlantType) event.getState().getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.FERN
						&& item == new ItemStack(Blocks.DOUBLE_PLANT, 1, 3).getItem()) {
					dropSelf = true; //a drop already exists so no need to add a new one
				}
				if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.GRASS
						&& item == new ItemStack(Blocks.DOUBLE_PLANT, 1, 2).getItem() && LepidodendronConfig.doPropagationVanilla) {
					dropSelf = true; //a drop already exists so no need to add a new one
				}
			}

			if (event.getState().getBlock() instanceof BlockTallGrass && LepidodendronConfig.doPropagationVanilla) {
				BlockTallGrass.EnumType blocktallgrass$enumtype = (BlockTallGrass.EnumType) event.getState().getValue(BlockTallGrass.TYPE);
				if (blocktallgrass$enumtype == BlockTallGrass.EnumType.GRASS
						&& item == new ItemStack(Blocks.TALLGRASS, 1, 1).getItem()) {
					dropSelf = true; //a drop already exists so no need to add a new one
				}
			}

			if (item == Items.APPLE && LepidodendronConfig.fixApples &&
					(event.getState().getBlock() == Blocks.LEAVES
							|| event.getState().getBlock() == Blocks.LEAVES2)) {
				event.getDrops().remove(i);
			}

			block = Block.getBlockFromItem(item);
			if (block instanceof BlockSapling && LepidodendronConfig.doPropagationVanilla) {
				if (item == (new ItemStack(Blocks.SAPLING, (int) (1), 0).getItem())) { //Oak
					event.getDrops().remove(i);
					event.getDrops().add(i, new ItemStack(ItemOakAcorn.block, 1));
				}
				if (item == (new ItemStack(Blocks.SAPLING, (int) (2), 1).getItem())) { //Spruce
					event.getDrops().remove(i);
					event.getDrops().add(i, new ItemStack(Blocks.AIR, 1));
				}
				if (item == (new ItemStack(Blocks.SAPLING, (int) (2), 2).getItem())) { //Birch
					event.getDrops().remove(i);
					event.getDrops().add(i, new ItemStack(Blocks.AIR, 1));
				}
				if (item == (new ItemStack(Blocks.SAPLING, (int) (2), 3).getItem())) { //Jungle
					event.getDrops().remove(i);
					event.getDrops().add(i, new ItemStack(Blocks.AIR, 1));
				}
				if (item == (new ItemStack(Blocks.SAPLING, (int) (2), 4).getItem())) { //Acacia
					event.getDrops().remove(i);
					event.getDrops().add(i, new ItemStack(Blocks.AIR, 1));
				}
				if (item == (new ItemStack(Blocks.SAPLING, (int) (2), 6).getItem())) { //Dark Oak
					event.getDrops().remove(i);
					event.getDrops().add(i, new ItemStack(ItemOakDarkAcorn.block, 1));
				}
			}
			if (event.getState().getBlock() instanceof BlockDoublePlant && LepidodendronConfig.doPropagationVanilla) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttype = (BlockDoublePlant.EnumPlantType) event.getState().getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.GRASS
						&& item == new ItemStack(Blocks.TALLGRASS, 1, 1).getItem()) {
					event.getDrops().add(i, new ItemStack(Blocks.DOUBLE_PLANT, 1, 2));
					dropSelf = true; //This now drops itself
				}
				if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.FERN
						&& item == new ItemStack(Blocks.TALLGRASS, 1, 2).getItem() && LepidodendronConfig.doPropagationVanilla) {
					event.getDrops().add(i, new ItemStack(Blocks.DOUBLE_PLANT, 1, 3));
					dropSelf = true; //This now drops itself
				}
			}
			i++;
		}

		if (event.getState().getBlock() instanceof BlockDoublePlant && (!dropSelf) && LepidodendronConfig.doPropagationVanilla) { //Spawn the block drop for these ones
			BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttype = (BlockDoublePlant.EnumPlantType) event.getState().getValue(BlockDoublePlant.VARIANT);
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.FERN) {
				event.getDrops().add(i, new ItemStack(Blocks.DOUBLE_PLANT, 1, 3));
			}
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.GRASS) {
				event.getDrops().add(i, new ItemStack(Blocks.DOUBLE_PLANT, 1, 2));
			}
		}
		if (event.getState().getBlock() instanceof BlockTallGrass && (!dropSelf) && LepidodendronConfig.doPropagationVanilla) {
			BlockTallGrass.EnumType blocktallgrass$enumtype = (BlockTallGrass.EnumType) event.getState().getValue(BlockTallGrass.TYPE);
			if (blocktallgrass$enumtype == BlockTallGrass.EnumType.GRASS) {
				event.getDrops().add(i, new ItemStack(Blocks.TALLGRASS, 1, 1));
			}
		}
		//if (event.getState().getBlock() == Blocks.VINE) {
		//	event.getDrops().add(i, new ItemStack(ItemGrapes.block,1));
		//}
	}

	@SubscribeEvent //Steam in the Hot Springs:
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		Random rand = new Random();
		if (event.phase == TickEvent.Phase.END && event.player.world.provider.getDimension() == LepidodendronConfig.dimDevonian) {
			Entity entity = event.player;
			World world = entity.world;
			BlockPos pos = entity.getPosition();
			int x = (int) entity.posX - 16;
			while (x <= entity.posX + 16) {
				int y = (int) entity.posY - 16;
				while (y <= entity.posY + 16) {
					int z = (int) entity.posZ - 16;
					while (z <= entity.posZ + 16) {
						pos = new BlockPos(x, y, z);
						if (world.getBlockState(pos).getMaterial() == Material.WATER && world.isAirBlock(pos.up())) {
							if (world.getBiome(pos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_springs") && rand.nextInt(150) == 0) {
								world.spawnParticle(EnumParticleTypes.CLOUD, (double) pos.getX() + Math.random(), (double) pos.getY() + 0.95, (double) pos.getZ() + Math.random(), 0.0D, 0.03D, 0.0D);
								//System.err.println("smokin' at " + pos.getX() + " " + pos.getY() + " " + pos.getZ());
							}
						}
						z += 1;
					}
					y += 1;
				}
				x += 1;
			}
		}

	}

	@SideOnly(Side.CLIENT) //Tooltips for vanilla items
	@SubscribeEvent
	public void onEvent(ItemTooltipEvent event) throws NoSuchMethodException {

		if (event.getItemStack().getItem().getRegistryName().toString().equalsIgnoreCase("patchouli:guide_book")) {
			if (event.getItemStack().getTagCompound() != null) {
				if (event.getItemStack().getTagCompound().toString().contains("lepidodendron:paleopedia")) {
					List<String> tt = event.getToolTip();
					tt.add(I18n.translateToLocal("tooltip.palaeopedia.name").trim());
				}
			}
		}

		if (event.getItemStack().getItem() == Item.getItemFromBlock(Blocks.SPONGE)) {
			List<String> tt = event.getToolTip();
			if (!Loader.isModLoaded("pncambrian")) {
				tt.add("NOTE: Used to build the portal to the Cambrian dimension but you do not have that dimension mod installed");
			}
			else {
				tt.add("NOTE: Used to build the portal to the Cambrian dimension");
			}
		}

		if (event.getItemStack().getItem() == Item.getItemFromBlock(Blocks.SAPLING)) {
			List<String> tt = event.getToolTip();
			if (LepidodendronConfig.showTooltips) {
				switch (event.getItemStack().getMetadata()) {
					case 0:
					default: //Oak
						tt.add("Type: Flowering tree");
						tt.add("Periods: late Cretaceous - Paleogene - Neogene - Pleistocene - present");
						tt.add("Propagation: acorns drop from leaves");
						break;

					case 1: //Spruce
						tt.add("Type: Flowering tree");
						tt.add("Periods: late Cretaceous - Paleogene - Neogene - Pleistocene - present");
						tt.add("Propagation: cones drop from leaves");
						break;

					case 2: //Birch
						tt.add("Type: Flowering tree");
						tt.add("Periods: Paleogene - Neogene - Pleistocene - present");
						tt.add("Propagation: fruits drop from leaves");
						break;

					case 3: //Jungle
						tt.add("Type: Flowering tree");
						tt.add("Periods: Paleogene - Neogene - Pleistocene - present");
						tt.add("Propagation: fruits drop from leaves");
						break;

					case 4: //Acacia
						tt.add("Type: Flowering tree");
						tt.add("Periods: Paleogene - Neogene - Pleistocene - present");
						tt.add("Propagation: fruits drop from leaves");
						break;

					case 5: //Dark Oak
						tt.add("Type: Flowering tree");
						tt.add("Periods: late Cretaceous - Paleogene - Neogene - Pleistocene - present");
						tt.add("Propagation: acorns drop from leaves");
						break;
				}
			}
		}

		if (event.getItemStack().getItem() == Items.SPAWN_EGG) {
			//Get Entity period:
			ResourceLocation resourceLocation = ItemMonsterPlacer.getNamedIdFrom(event.getItemStack());
			if (resourceLocation == null) {
				return;
			}
			Class ee = EntityList.getClassFromName(resourceLocation.toString());
			List<String> tt = event.getToolTip();
			try {
				tt.add(I18n.translateToLocal("helper.pf_period.name") + ": " + ee.getMethod("getPeriod", (Class[]) null).invoke(null).toString());
			} catch (Throwable throwable) {
				//Do nothing - it's all good
			}
			try {
				tt.add(I18n.translateToLocal("helper.pf_habitat.name") + ": " + ee.getMethod("getHabitat", (Class[]) null).invoke(null).toString());
			} catch (Throwable throwable) {
				//Do nothing - it's all good
			}

		}

	}


	@SubscribeEvent //Make obsidian variants
	public void onEvent(BlockEvent.FluidPlaceBlockEvent event) {
		if (!event.getWorld().isRemote) {
			if (event.getState().getBlock() == Blocks.OBSIDIAN) {
				if (event.getWorld().rand.nextFloat() > 0.98) {
					if (event.getWorld().rand.nextFloat() > 0.5) {
						event.setNewState(BlockObsidianSulphurOre.block.getDefaultState());
					}
					else {
						event.setNewState(BlockObsidianZirconOre.block.getDefaultState());
					}
				}
			}
		}
	}

	@SubscribeEvent //Allow acid to form sourceblocks
	public void onEvent(BlockEvent.CreateFluidSourceEvent event) {
		if ((!event.getWorld().isRemote) && LepidodendronConfig.sulphuricAcidInfinite) {
			try { //Its possible that our fluid isnt registered in a modpack if another mod took precedence
				if (event.getState().getBlock() == BlockAcid.block) {
					event.setResult(Event.Result.ALLOW);
				}
			}
			catch (RuntimeException exception) {
			}
		}
	}

	@SubscribeEvent //Advancement for DNA
	public void onEvent(PlayerEvent.ItemCraftedEvent event) {
		if ((!event.player.getEntityWorld().isRemote) && event.crafting.getItem() == ItemPhialDNA.block) {
			if (event.player instanceof EntityPlayerMP) {
				ModTriggers.DNA_CRAFT.trigger((EntityPlayerMP) event.player);
			}
		}
	}

	@SubscribeEvent //Release insects and arthropods on breaking plants
	public void onBlockBreak(BlockEvent.BreakEvent event) {
		Random rand = event.getWorld().rand;
		World worldIn = event.getWorld();
		if (worldIn.isRemote) {
			return;
		}
		if (worldIn.provider.getDimension() != LepidodendronConfig.dimPrecambrian
			&& worldIn.provider.getDimension() != LepidodendronConfig.dimCambrian
			&& worldIn.provider.getDimension() != LepidodendronConfig.dimOrdovician
			&& worldIn.provider.getDimension() != LepidodendronConfig.dimSilurian
			&& worldIn.provider.getDimension() != LepidodendronConfig.dimDevonian
			&& worldIn.provider.getDimension() != LepidodendronConfig.dimCarboniferous
			&& worldIn.provider.getDimension() != LepidodendronConfig.dimPermian
			&& worldIn.provider.getDimension() != LepidodendronConfig.dimTriassic
			&& worldIn.provider.getDimension() != LepidodendronConfig.dimJurassic
			&& worldIn.provider.getDimension() != LepidodendronConfig.dimCretaceous
			&& worldIn.provider.getDimension() != LepidodendronConfig.dimPaleogene
			&& worldIn.provider.getDimension() != LepidodendronConfig.dimNeogene
			&& worldIn.provider.getDimension() != LepidodendronConfig.dimPleistocene) {
			return;
		}

		IBlockState state = event.getState();
		String resLoc = "";
		if (state.getMaterial() == Material.PLANTS
				|| state.getMaterial() == Material.LEAVES
				|| state.getMaterial() == Material.VINE
		) {
			//Terrestrial:
			for (int ii=0; ii < 2; ii++) {
				if (chancerInsects()) {
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimPrecambrian) {
						resLoc = PlantBreakMobsLand.resLocMobs(1);
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimCambrian) {
						resLoc = PlantBreakMobsLand.resLocMobs(2);
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimOrdovician) {
						resLoc = PlantBreakMobsLand.resLocMobs(3);
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimSilurian) {
						resLoc = PlantBreakMobsLand.resLocMobs(4);
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimDevonian) {
						resLoc = PlantBreakMobsLand.resLocMobs(5);
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimCarboniferous) {
						resLoc = PlantBreakMobsLand.resLocMobs(6);
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimPermian) {
						resLoc = PlantBreakMobsLand.resLocMobs(7);
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimTriassic) {
						resLoc = PlantBreakMobsLand.resLocMobs(8);
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimJurassic) {
						resLoc = PlantBreakMobsLand.resLocMobs(9);
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimCretaceous) {
						resLoc = PlantBreakMobsLand.resLocMobs(10);
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimPaleogene) {
						resLoc = PlantBreakMobsLand.resLocMobs(11);
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimNeogene) {
						resLoc = PlantBreakMobsLand.resLocMobs(12);
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimPleistocene) {
						resLoc = PlantBreakMobsLand.resLocMobs(13);
					}
				}

				if (!(resLoc.equalsIgnoreCase(""))) {
					//Spawn the mob:
					spawnMob(worldIn, resLoc, rand, event.getPos());
				}
			}
		}
		if (state.getMaterial() == Material.WATER
				&& (!(state.getBlock() instanceof BlockFluidBase))
				&& (!(state.getBlock() instanceof BlockLiquid))) {
			//Aquatic:
			for (int ii = 0; ii < 2; ii++) {
				if (chancerInsects()) {
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimPrecambrian) {
						if (BiomeDictionary.hasType(worldIn.getBiome(event.getPos()), BiomeDictionary.Type.OCEAN)) {
							resLoc = PlantBreakMobsSea.resLocMobs(1);
						} else {
							resLoc = PlantBreakMobsWater.resLocMobs(1);
						}
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimCambrian) {
						if (BiomeDictionary.hasType(worldIn.getBiome(event.getPos()), BiomeDictionary.Type.OCEAN)) {
							resLoc = PlantBreakMobsSea.resLocMobs(2);
						} else {
							resLoc = PlantBreakMobsWater.resLocMobs(2);
						}
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimOrdovician) {
						if (BiomeDictionary.hasType(worldIn.getBiome(event.getPos()), BiomeDictionary.Type.OCEAN)) {
							resLoc = PlantBreakMobsSea.resLocMobs(3);
						} else {
							resLoc = PlantBreakMobsWater.resLocMobs(3);
						}
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimSilurian) {
						if (BiomeDictionary.hasType(worldIn.getBiome(event.getPos()), BiomeDictionary.Type.OCEAN)) {
							resLoc = PlantBreakMobsSea.resLocMobs(4);
						} else {
							resLoc = PlantBreakMobsWater.resLocMobs(4);
						}
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimDevonian) {
						if (BiomeDictionary.hasType(worldIn.getBiome(event.getPos()), BiomeDictionary.Type.OCEAN)) {
							resLoc = PlantBreakMobsSea.resLocMobs(5);
						} else {
							resLoc = PlantBreakMobsWater.resLocMobs(5);
						}
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimCarboniferous) {
						if (BiomeDictionary.hasType(worldIn.getBiome(event.getPos()), BiomeDictionary.Type.OCEAN)) {
							resLoc = PlantBreakMobsSea.resLocMobs(6);
						} else {
							resLoc = PlantBreakMobsWater.resLocMobs(6);
						}
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimPermian) {
						if (BiomeDictionary.hasType(worldIn.getBiome(event.getPos()), BiomeDictionary.Type.OCEAN)) {
							resLoc = PlantBreakMobsSea.resLocMobs(7);
						} else {
							resLoc = PlantBreakMobsWater.resLocMobs(7);
						}
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimTriassic) {
						if (BiomeDictionary.hasType(worldIn.getBiome(event.getPos()), BiomeDictionary.Type.OCEAN)) {
							resLoc = PlantBreakMobsSea.resLocMobs(8);
						} else {
							resLoc = PlantBreakMobsWater.resLocMobs(8);
						}
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimJurassic) {
						if (BiomeDictionary.hasType(worldIn.getBiome(event.getPos()), BiomeDictionary.Type.OCEAN)) {
							resLoc = PlantBreakMobsSea.resLocMobs(9);
						} else {
							resLoc = PlantBreakMobsWater.resLocMobs(9);
						}
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimCretaceous) {
						if (BiomeDictionary.hasType(worldIn.getBiome(event.getPos()), BiomeDictionary.Type.OCEAN)) {
							resLoc = PlantBreakMobsSea.resLocMobs(10);
						} else {
							resLoc = PlantBreakMobsWater.resLocMobs(10);
						}
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimPaleogene) {
						if (BiomeDictionary.hasType(worldIn.getBiome(event.getPos()), BiomeDictionary.Type.OCEAN)) {
							resLoc = PlantBreakMobsSea.resLocMobs(11);
						} else {
							resLoc = PlantBreakMobsWater.resLocMobs(11);
						}
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimNeogene) {
						if (BiomeDictionary.hasType(worldIn.getBiome(event.getPos()), BiomeDictionary.Type.OCEAN)) {
							resLoc = PlantBreakMobsSea.resLocMobs(12);
						} else {
							resLoc = PlantBreakMobsWater.resLocMobs(12);
						}
					}
					if (worldIn.provider.getDimension() == LepidodendronConfig.dimPleistocene) {
						if (BiomeDictionary.hasType(worldIn.getBiome(event.getPos()), BiomeDictionary.Type.OCEAN)) {
							resLoc = PlantBreakMobsSea.resLocMobs(13);
						} else {
							resLoc = PlantBreakMobsWater.resLocMobs(13);
						}
					}
				}

				if (!(resLoc.equalsIgnoreCase(""))) {
					//Spawn the mob:
					spawnMob(worldIn, resLoc, rand, event.getPos());
				}
			}
		}
	}

	public boolean chancerInsects() {
		double chance = LepidodendronConfig.genInsectsFromPlants;
		if (chance < 0) {
			chance = 0;
		}
		if (chance > 1) {
			chance = 1;
		}
		if (chance == 0) {
			return false;
		}
		return Math.random() <= chance;
	}

	public void spawnMob(World worldIn, String resLoc, Random rand, BlockPos pos) {
		//Spawn the mob:
		String nbtStr = "";
		EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(resLoc));
		EntityLiving entity = (EntityLiving) ee.newInstance(worldIn);
		if (entity instanceof EntityPrehistoricFloraAgeableBase && rand.nextInt(20) == 0) {
			EntityPrehistoricFloraAgeableBase ageableBase = (EntityPrehistoricFloraAgeableBase) entity;
			int adultAge = ageableBase.getAdultAge();
			if (adultAge > 0) {
				int spawnAge = rand.nextInt(adultAge) + 1;
				nbtStr = "{AgeTicks:" + spawnAge + "}";
			}
		} else if (entity instanceof EntityPrehistoricFloraAgeableFishBase && rand.nextInt(20) == 0) {
			EntityPrehistoricFloraAgeableFishBase ageableBase = (EntityPrehistoricFloraAgeableFishBase) entity;
			int adultAge = ageableBase.getAdultAge();
			if (adultAge > 0) {
				int spawnAge = rand.nextInt(adultAge) + 1;
				nbtStr = "{AgeTicks:" + spawnAge + "}";
			}
		} else if (resLoc.startsWith("fossil:")) {
			if (nbtStr.equalsIgnoreCase("")) {
				nbtStr = "{Gender:" + rand.nextInt(2) + "}";
			} else {
				nbtStr = "{Gender:" + rand.nextInt(2) + "," + nbtStr.substring(1);
			}
		}
		if (entity != null) {
			entity.setDead();
		}
		//Spawn it:
		worldIn.getMinecraftServer().getCommandManager().executeCommand(new ICommandSender() {
			@Override
			public String getName() {
				return "";
			}

			@Override
			public boolean canUseCommand(int permission, String command) {
				return true;
			}

			@Override
			public World getEntityWorld() {
				return worldIn;
			}

			@Override
			public MinecraftServer getServer() {
				return worldIn.getMinecraftServer();
			}

			@Override
			public boolean sendCommandFeedback() {
				return false;
			}

		}, "pf_summon " + resLoc + " " + pos.getX() + " " + (pos.getY()) + " " + pos.getZ() + " " + nbtStr);
	}

}
