package net.lepidodendron;

import net.lepidodendron.block.BlockDisplayCase;
import net.lepidodendron.block.BlockDisplayCaseMagnifying;
import net.lepidodendron.block.BlockDisplayPlinth;
import net.lepidodendron.block.BlockDisplayWallMount;
import net.lepidodendron.entity.EntityPrehistoricFloraMeteor;
import net.lepidodendron.item.*;
import net.lepidodendron.world.biome.devonian.BiomeDevonianSprings;
import net.lepidodendron.world.biome.precambrian.BiomePrecambrianBiome;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.passive.EntitySkeletonHorse;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

public class LepidodendronEventSubscribers {

	@SubscribeEvent //Spawn Hadean meteors
	public void meteors(WorldTickEvent event) {
		boolean spawnShower = false;
		if(event.world != null && !event.world.isRemote && LepidodendronConfig.doMeteorites) {
			if( event.world.rand.nextInt(6000) == 0) {//Note that lowering this number spawns meteors more frequently, default 6000
				if (!event.world.playerEntities.isEmpty()) {
					EntityPlayer p = (EntityPlayer) event.world.playerEntities.get(event.world.rand.nextInt(event.world.playerEntities.size()));
					BlockPos pos = new BlockPos((p.posX + event.world.rand.nextInt(201) - 100),300,(p.posZ+ event.world.rand.nextInt(201) - 100));
					if(p != null && p.dimension == LepidodendronConfig.dimPrecambrian) {
						if(event.world.getBiome(pos) == BiomePrecambrianBiome.biome)
						spawnShower = (event.world.rand.nextInt(50) == 0);
						{
							EntityPrehistoricFloraMeteor meteor = new EntityPrehistoricFloraMeteor(event.world,pos.getX(), pos.getY(), pos.getZ());					
							meteor.motionX = event.world.rand.nextDouble() - 0.5;
							meteor.motionZ = event.world.rand.nextDouble() - 0.5;
							event.world.spawnEntity(meteor);
						}
						if (spawnShower) {
							EntityPrehistoricFloraMeteor meteor = new EntityPrehistoricFloraMeteor(event.world,pos.getX(), pos.getY(), pos.getZ());
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

	
	@SubscribeEvent //BlockTrap Horses
	public void onSpawn(EntityJoinWorldEvent event) {
		if (LepidodendronConfig.blockSkeletonHorse) {
			if (event.getWorld().provider.getDimension() != LepidodendronConfig.dimPrecambrian
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimCambrian
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimOrdovician
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimSilurian
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimDevonian
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimCarboniferous
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimPermian
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimTriassic
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimJurassic
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimCretaceous) {
				return;
			}
			if (event.getEntity() instanceof EntitySkeletonHorse) {
				event.setCanceled(true);
			}
		}
	}

	@SubscribeEvent //We want to drop the real items or flowers
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
							tee.setInventorySlotContents(0, ItemStack.EMPTY);

							SoundEvent soundevent = SoundEvents.ENTITY_ITEMFRAME_REMOVE_ITEM;
							((WorldServer) event.getEntityPlayer().getEntityWorld()).playSound(null, event.getPos(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
							event.getEntityPlayer().swingArm(event.getHand());
						}
						event.setCanceled(true);
					}
				}
			}
		}
		else if (event.getWorld().getBlockState(event.getPos()).getBlock() == BlockDisplayCaseMagnifying.block
				&& event.getHand() == EnumHand.MAIN_HAND) {
			TileEntity te = event.getWorld().getTileEntity(event.getPos());
			if (te != null) {
				if (te instanceof BlockDisplayCaseMagnifying.TileEntityDisplayCase) {
					BlockDisplayCaseMagnifying.TileEntityDisplayCase tee = (BlockDisplayCaseMagnifying.TileEntityDisplayCase) te;
					if (tee.hasItem()) {
						if (!(event.getWorld().isRemote)) {
							ItemStack itemstack = tee.getStackInSlot(0);
							Block.spawnAsEntity(event.getWorld(), event.getPos(), itemstack);
							tee.setInventorySlotContents(0, ItemStack.EMPTY);

							SoundEvent soundevent = SoundEvents.ENTITY_ITEMFRAME_REMOVE_ITEM;
							((WorldServer) event.getEntityPlayer().getEntityWorld()).playSound(null, event.getPos(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
							event.getEntityPlayer().swingArm(event.getHand());
						}
						event.setCanceled(true);
					}
				}
			}
		}
		else if (event.getWorld().getBlockState(event.getPos()).getBlock() == BlockDisplayWallMount.block
				&& event.getHand() == EnumHand.MAIN_HAND) {
			TileEntity te = event.getWorld().getTileEntity(event.getPos());
			if (te != null) {
				if (te instanceof BlockDisplayWallMount.TileEntityDisplayWallMount) {
					BlockDisplayWallMount.TileEntityDisplayWallMount tee = (BlockDisplayWallMount.TileEntityDisplayWallMount) te;
					if (tee.hasItem()) {
						if (!(event.getWorld().isRemote)) {
							ItemStack itemstack = tee.getStackInSlot(0);
							Block.spawnAsEntity(event.getWorld(), event.getPos(), itemstack);
							tee.setInventorySlotContents(0, ItemStack.EMPTY);

							SoundEvent soundevent = SoundEvents.ENTITY_ITEMFRAME_REMOVE_ITEM;
							((WorldServer) event.getEntityPlayer().getEntityWorld()).playSound(null, event.getPos(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
							event.getEntityPlayer().swingArm(event.getHand());
						}
						event.setCanceled(true);
					}
				}
			}
		}
		else if (event.getWorld().getBlockState(event.getPos()).getBlock() == BlockDisplayPlinth.block
				&& event.getHand() == EnumHand.MAIN_HAND) {
			TileEntity te = event.getWorld().getTileEntity(event.getPos());
			if (te != null) {
				if (te instanceof BlockDisplayPlinth.TileEntityDisplayPlinth) {
					BlockDisplayPlinth.TileEntityDisplayPlinth tee = (BlockDisplayPlinth.TileEntityDisplayPlinth) te;
					if (tee.hasItem()) {
						if (!(event.getWorld().isRemote)) {
							ItemStack itemstack = tee.getStackInSlot(0);
							Block.spawnAsEntity(event.getWorld(), event.getPos(), itemstack);
							tee.setInventorySlotContents(0, ItemStack.EMPTY);

							SoundEvent soundevent = SoundEvents.ENTITY_ITEMFRAME_REMOVE_ITEM;
							((WorldServer) event.getEntityPlayer().getEntityWorld()).playSound(null, event.getPos(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
							event.getEntityPlayer().swingArm(event.getHand());
						}
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
			BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttype = (BlockDoublePlant.EnumPlantType)event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.VARIANT);
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.GRASS
			 || blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.FERN)
			{ //imitate a regular harvest without shears:
				event.getEntityPlayer().swingArm(event.getHand());
				if (!(event.getWorld().isRemote)) {
					event.getWorld().destroyBlock(event.getPos(), false);
					event.getWorld().setBlockToAir(event.getPos().up());
				}
				event.getItemStack().damageItem(1, event.getEntityPlayer());
				event.setCanceled(true);
			}
			else if (event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.UPPER
					&& event.getWorld().getBlockState(event.getPos().down()).getBlock() == Blocks.DOUBLE_PLANT) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttypeDown = (BlockDoublePlant.EnumPlantType)event.getWorld().getBlockState(event.getPos().down()).getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumplanttypeDown == BlockDoublePlant.EnumPlantType.GRASS
					|| blockdoubleplant$enumplanttypeDown == BlockDoublePlant.EnumPlantType.FERN)
				{ //imitate a regular harvest without shears:
					event.getEntityPlayer().swingArm(event.getHand());
					if (!(event.getWorld().isRemote)) {
						event.getWorld().destroyBlock(event.getPos(), false);
						event.getWorld().setBlockToAir(event.getPos().up());
					}
					event.getItemStack().damageItem(1, event.getEntityPlayer());
					event.setCanceled(true);
				}
			}
			else if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.ROSE)
			{ //spawn rose flowers:
				event.getEntityPlayer().swingArm(event.getHand());
				Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemRoseFlower.block, 1));
				event.getItemStack().damageItem(1, event.getEntityPlayer());
				event.setCanceled(true);
			}
			else if (event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.UPPER
				&& event.getWorld().getBlockState(event.getPos().down()).getBlock() == Blocks.DOUBLE_PLANT) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttypeDown = (BlockDoublePlant.EnumPlantType)event.getWorld().getBlockState(event.getPos().down()).getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumplanttypeDown == BlockDoublePlant.EnumPlantType.ROSE)
				{ //spawn rose flowers:
					event.getEntityPlayer().swingArm(event.getHand());
					Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemRoseFlower.block, 1));
					event.getItemStack().damageItem(1, event.getEntityPlayer());
					event.setCanceled(true);
				}
			}
			else if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.PAEONIA)
			{ //spawn Peony flowers:
				event.getEntityPlayer().swingArm(event.getHand());
				Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemPeonyFlower.block, 1));
				event.getItemStack().damageItem(1, event.getEntityPlayer());
				event.setCanceled(true);
			}
			else if (event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.UPPER
					&& event.getWorld().getBlockState(event.getPos().down()).getBlock() == Blocks.DOUBLE_PLANT) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttypeDown = (BlockDoublePlant.EnumPlantType)event.getWorld().getBlockState(event.getPos().down()).getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumplanttypeDown == BlockDoublePlant.EnumPlantType.PAEONIA)
				{ //spawn Peony flowers:
					event.getEntityPlayer().swingArm(event.getHand());
					Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemPeonyFlower.block, 1));
					event.getItemStack().damageItem(1, event.getEntityPlayer());
					event.setCanceled(true);
				}
			}
			else if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.SYRINGA)
			{ //spawn lilac flowers:
				event.getEntityPlayer().swingArm(event.getHand());
				Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemLilacFlower.block, 1));
				event.getItemStack().damageItem(1, event.getEntityPlayer());
				event.setCanceled(true);
			}
			else if (event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.UPPER
					&& event.getWorld().getBlockState(event.getPos().down()).getBlock() == Blocks.DOUBLE_PLANT) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttypeDown = (BlockDoublePlant.EnumPlantType)event.getWorld().getBlockState(event.getPos().down()).getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumplanttypeDown == BlockDoublePlant.EnumPlantType.SYRINGA)
				{ //spawn lilac flowers:
					event.getEntityPlayer().swingArm(event.getHand());
					Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemLilacFlower.block, 1));
					event.getItemStack().damageItem(1, event.getEntityPlayer());
					event.setCanceled(true);
				}
			}
		}
		else if (event.getWorld().getBlockState(event.getPos()).getBlock() == Blocks.DOUBLE_PLANT
				&& (!(event.getItemStack().getItem() instanceof ItemShears)) && LepidodendronConfig.doPropagationVanilla
				&& event.getHand() == EnumHand.MAIN_HAND) {
			BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttype = (BlockDoublePlant.EnumPlantType)event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.VARIANT);
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
			BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttype = (BlockDoublePlant.EnumPlantType)event.getState().getValue(BlockDoublePlant.VARIANT);
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.FERN
				|| blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.GRASS)
			{
				dropSelf = false; //the large fern and large grass don't drop themselves, but we want to make it so that they do
			}
		}
		if (event.getState().getBlock() instanceof BlockTallGrass && LepidodendronConfig.doPropagationVanilla) {
			BlockTallGrass.EnumType blocktallgrass$enumtype = (BlockTallGrass.EnumType)event.getState().getValue(BlockTallGrass.TYPE);
			if (blocktallgrass$enumtype == BlockTallGrass.EnumType.GRASS)
			{
				dropSelf = false; //the grass needs shears but we want to drop it without needing them
			}
		}
		int i = 0;
		while (i + 1 <= event.getDrops().size()) {
			Item item = event.getDrops().get(i).getItem();
			Block block = Block.getBlockFromItem(item);

			if (event.getState().getBlock() instanceof BlockDoublePlant && LepidodendronConfig.doPropagationVanilla) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttype = (BlockDoublePlant.EnumPlantType)event.getState().getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.FERN
					&& item == new ItemStack(Blocks.DOUBLE_PLANT, 1, 3).getItem())
				{
					dropSelf = true; //a drop already exists so no need to add a new one
				}
				if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.GRASS
					&& item == new ItemStack(Blocks.DOUBLE_PLANT, 1, 2).getItem()  && LepidodendronConfig.doPropagationVanilla)
				{
					dropSelf = true; //a drop already exists so no need to add a new one
				}
			}

			if (event.getState().getBlock() instanceof BlockTallGrass && LepidodendronConfig.doPropagationVanilla) {
				BlockTallGrass.EnumType blocktallgrass$enumtype = (BlockTallGrass.EnumType)event.getState().getValue(BlockTallGrass.TYPE);
				if (blocktallgrass$enumtype == BlockTallGrass.EnumType.GRASS
					&& item == new ItemStack(Blocks.TALLGRASS, 1, 1).getItem())
				{
					dropSelf = true; //a drop already exists so no need to add a new one
				}
			}

			if (item == Items.APPLE && LepidodendronConfig.fixApples &&
				(event.getState().getBlock() == Blocks.LEAVES
						|| event.getState().getBlock() == Blocks.LEAVES2) ) {
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
					event.getDrops().add(i, new ItemStack(Blocks.DOUBLE_PLANT,1, 2));
					dropSelf = true; //This now drops itself
				}
				if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.FERN
						&& item == new ItemStack(Blocks.TALLGRASS, 1, 2).getItem() && LepidodendronConfig.doPropagationVanilla) {
					event.getDrops().add(i, new ItemStack(Blocks.DOUBLE_PLANT,1, 3));
					dropSelf = true; //This now drops itself
				}
			}
			i++;
		}

		if (event.getState().getBlock() instanceof BlockDoublePlant && !dropSelf && LepidodendronConfig.doPropagationVanilla) { //Spawn the block drop for these ones
			BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttype = (BlockDoublePlant.EnumPlantType)event.getState().getValue(BlockDoublePlant.VARIANT);
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.FERN)
			{
				event.getDrops().add(i, new ItemStack(Blocks.DOUBLE_PLANT,1, 3));
			}
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.GRASS)
			{
				event.getDrops().add(i, new ItemStack(Blocks.DOUBLE_PLANT,1, 2));
			}
		}
		if (event.getState().getBlock() instanceof BlockTallGrass && !dropSelf && LepidodendronConfig.doPropagationVanilla) {
			BlockTallGrass.EnumType blocktallgrass$enumtype = (BlockTallGrass.EnumType)event.getState().getValue(BlockTallGrass.TYPE);
			if (blocktallgrass$enumtype == BlockTallGrass.EnumType.GRASS)
			{
				event.getDrops().add(i, new ItemStack(Blocks.TALLGRASS,1, 1));
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
						if (world.getBlockState(pos).getMaterial() == Material.WATER && world.isAirBlock(pos.up()))
						{
							if (world.getBiome(pos) == BiomeDevonianSprings.biome && rand.nextInt(150) == 0 ) {
								world.spawnParticle(EnumParticleTypes.CLOUD, (double)pos.getX() + Math.random(), (double)pos.getY() + 0.95, (double)pos.getZ() + Math.random(), 0.0D, 0.03D, 0.0D);
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
		if (event.getItemStack().getItem() == Item.getItemFromBlock(Blocks.SPONGE)) {
			List<String> tt = event.getToolTip();
			tt.add("NOTE: Used to build the portal to the Cambrian dimension");
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
			}
			catch (Throwable throwable) {
				//Do nothing - it's all good
			}
			try {
				tt.add(I18n.translateToLocal("helper.pf_habitat.name") + ": " + ee.getMethod("getHabitat", (Class[]) null).invoke(null).toString());
			}
			catch (Throwable throwable) {
				//Do nothing - it's all good
			}

		}

	}
}
