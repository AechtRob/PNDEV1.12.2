package net.lepidodendron;

import net.lepidodendron.block.BlockDisplayCase;
import net.lepidodendron.block.BlockDisplayCaseMagnifying;
import net.lepidodendron.block.BlockDisplayPlinth;
import net.lepidodendron.block.BlockDisplayWallMount;
import net.lepidodendron.entity.*;
import net.lepidodendron.item.*;
import net.lepidodendron.world.biome.devonian.BiomeDevonianSprings;
import net.lepidodendron.world.biome.precambrian.BiomePrecambrianBiome;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
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
	public void onEvent(ItemTooltipEvent event) {
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
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_acadoaradoxides")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAcadoaradoxides.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAcadoaradoxides.getSize());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_acanthodes")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAcanthodes.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAcanthodes.getSize());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_acanthostega")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAcanthostega.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAcanthostega.getSize());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_acrolepis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAcrolepis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAcrolepis.getSize());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_acutiramus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAcutiramus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAcutiramus.getSize());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_adelophthalmus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraAdelophthalmus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraAdelophthalmus.getSize());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_aeger")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraAeger.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraAeger.getSize());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_aegirocassis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAegirocassis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAegirocassis.getSize());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ainiktozoon")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAiniktozoon.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAiniktozoon.getSize());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_akmonistion")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAkmonistion.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAkmonistion.getSize());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_alacaris")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAlacaris.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAlacaris.getSize());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ammonite_asteroceras")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAmmonite_Asteroceras.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAmmonite_Asteroceras.getSize());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ammonite_ceratites")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAmmonite_Ceratites.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAmmonite_Ceratites.getSize());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ammonite_coroniceras")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAmmonite_Coroniceras.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAmmonite_Coroniceras.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ammonite_cylolobus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAmmonite_Cylolobus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAmmonite_Cylolobus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ammonite_dactylioceras")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAmmonite_Dactylioceras.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAmmonite_Dactylioceras.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ammonite_goniatites")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAmmonite_Goniatites.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAmmonite_Goniatites.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ammonite_manticoceras")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAmmonite_Manticoceras.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAmmonite_Manticoceras.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ammonite_pachydesmoceras")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAmmonite_Pachydesmoceras.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAmmonite_Pachydesmoceras.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ammonite_pachydiscus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAmmonite_Pachydiscus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAmmonite_Pachydiscus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ammonite_parapuzosia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAmmonite_Parapuzosia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAmmonite_Parapuzosia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ammonite_titanites")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAmmonite_Titanites.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAmmonite_Titanites.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_amphibamus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAmphibamus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAmphibamus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_amplectobelua")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAmplectobelua.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAmplectobelua.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_anomalocaris")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAnomalocaris.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAnomalocaris.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_anthracomedusa")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAnthracomedusa.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAnthracomedusa.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_aphetoceras")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAphetoceras.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAphetoceras.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_arandaspis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraArandaspis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraArandaspis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_asaphus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAsaphus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAsaphus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ateleaspis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAteleaspis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAteleaspis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_attercopus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraAttercopus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraAttercopus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_banffia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraBanffia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraBanffia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_basiloceras")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraBasiloceras.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraBasiloceras.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_batofasciculus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraBatofasciculus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraBatofasciculus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_belantsea")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraBelantsea.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraBelantsea.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_bothriolepis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraBothriolepis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraBothriolepis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_cambroraster")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraCambroraster.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraCambroraster.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_cameroceras")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraCameroceras.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraCameroceras.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_campbellodus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraCampbellodus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraCampbellodus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_canadaspis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraCanadaspis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraCanadaspis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_carcinosoma")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraCarcinosoma.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraCarcinosoma.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_cephalaspis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraCephalaspis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraCephalaspis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_cheirurus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraCheirurus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraCheirurus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_cheloniellon")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraCheloniellon.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraCheloniellon.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_cladoselache")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraCladoselache.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraCladoselache.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_coccosteus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraCoccosteus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraCoccosteus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_coelacanthus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraCoelacanthus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraCoelacanthus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_cotylorhynchus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraCotylorhynchus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraCotylorhynchus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_cyclonema")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraCyclonema.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraCyclonema.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_cyrtoceras")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraCyrtoceras.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraCyrtoceras.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_deiroceras")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraDeiroceras.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraDeiroceras.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_diania")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraDiania.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraDiania.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_dickinsonia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraDickinsonia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraDickinsonia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_didymograptus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraDidymograptus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraDidymograptus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_dimetrodon")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraDimetrodon.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraDimetrodon.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_dracopristis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraDracopristis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraDracopristis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_dunkleosteus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraDunkleosteus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraDunkleosteus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_eglonaspis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraEglonaspis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraEglonaspis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ellipsocephalus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraEllipsocephalus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraEllipsocephalus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_elrathia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraElrathia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraElrathia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_endoceras")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraEndoceras.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraEndoceras.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_eoandromeda")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraEoandromeda.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraEoandromeda.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_eoarthropleura")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraEoarthropleura.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraEoarthropleura.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_eoredlichia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraEoredlichia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraEoredlichia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_eryops")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraEryops.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraEryops.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_eurypterus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraEurypterus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraEurypterus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_furcacauda")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraFurcacauda.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraFurcacauda.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_furcaster")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraFurcaster.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraFurcaster.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_gemmactena")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraGemmactena.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraGemmactena.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_gemuendina")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraGemuendina.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraGemuendina.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_gonioceras")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraGonioceras.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraGonioceras.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_gorgonops")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraGorgonops.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraGorgonops.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_hallucigenia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraHallucigenia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraHallucigenia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_helicoprion")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraHelicoprion.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraHelicoprion.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_hemicyclaspis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraHemicyclaspis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraHemicyclaspis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_heterosteus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraHeterosteus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraHeterosteus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_hibbertopterus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraHibbertopterus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraHibbertopterus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_hibernaspis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraHibernaspis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraHibernaspis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_hylonomus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraHylonomus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraHylonomus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_hyneria")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraHyneria.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraHyneria.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ichthyostega")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraIchthyostega.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraIchthyostega.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_inostrancevia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraInostrancevia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraInostrancevia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_isotelus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraIsotelus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraIsotelus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_jaekelopterus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraJaekelopterus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraJaekelopterus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_jellyfish_precambrian")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraJellyfish_Precambrian.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraJellyfish_Precambrian.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_jellyfish1")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraJellyfish1.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraJellyfish1.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_jellyfish2")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraJellyfish2.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraJellyfish2.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_jellyfish3")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraJellyfish3.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraJellyfish3.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_jellyfish4")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraJellyfish4.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraJellyfish4.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_jellyfish5")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraJellyfish5.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraJellyfish5.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_jellyfish6")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraJellyfish6.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraJellyfish6.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_jellyfish7")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraJellyfish7.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraJellyfish7.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_jianshanopodia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraJianshanopodia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraJianshanopodia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_kalbarria")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraKalbarria.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraKalbarria.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_kerygmachela")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraKerygmachela.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraKerygmachela.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_kimberella")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraKimberella.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraKimberella.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_kodymirus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraKodymirus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraKodymirus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_kokomopterus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraKokomopterus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraKokomopterus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_laminacaris")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraLaminacaris.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraLaminacaris.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_limnoscelis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraLimnoscelis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraLimnoscelis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_lunataspis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraLunataspis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraLunataspis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_lyrarapax")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraLyrarapax.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraLyrarapax.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_maclurina")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraMaclurina.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraMaclurina.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_marrella")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraMarrella.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraMarrella.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_megalocephalus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraMegalocephalus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraMegalocephalus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_megarachne")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraMegarachne.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraMegarachne.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_metaspriggina")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraMetaspriggina.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraMetaspriggina.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_microdictyon")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraMicrodictyon.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraMicrodictyon.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_mimetaster")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraMimetaster.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraMimetaster.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_mixopterus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraMixopterus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraMixopterus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_monograptus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraMonograptus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraMonograptus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_moschops")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraMoschops.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraMoschops.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_nectocaris")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraNectocaris.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraNectocaris.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_odaraia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraOdaraia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraOdaraia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_odontogriphus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraOdontogriphus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraOdontogriphus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_omnidens")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraOmnidens.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraOmnidens.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_onychodus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraOnychodus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraOnychodus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_opabinia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraOpabinia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraOpabinia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ophiacodon")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraOphiacodon.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraOphiacodon.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_orthoceras")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraOrthoceras.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraOrthoceras.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ottoia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraOttoia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraOttoia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_pagea")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPagea.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPagea.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_palaeodictyoptera_delitzschala")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPalaeodictyoptera_Delitzschala.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPalaeodictyoptera_Delitzschala.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_palaeodictyoptera_dunbaria")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPalaeodictyoptera_Dunbaria.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPalaeodictyoptera_Dunbaria.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_palaeodictyoptera_homaloneura")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPalaeodictyoptera_Homaloneura.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPalaeodictyoptera_Homaloneura.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_palaeodictyoptera_homoioptera")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPalaeodictyoptera_Homoioptera.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPalaeodictyoptera_Homoioptera.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_palaeodictyoptera_lithomantis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPalaeodictyoptera_Lithomantis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPalaeodictyoptera_Lithomantis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_palaeodictyoptera_lycocercus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPalaeodictyoptera_Lycocercus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPalaeodictyoptera_Lycocercus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_palaeodictyoptera_nymph")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPalaeodictyopteraNymph.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPalaeodictyopteraNymph.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_palaeodictyoptera_nymph_perm")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPalaeodictyopteraNymphPerm.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPalaeodictyopteraNymphPerm.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_palaeodictyoptera_sinodunbaria")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPalaeodictyoptera_Sinodunbaria.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPalaeodictyoptera_Sinodunbaria.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_palaeodictyoptera_stenodictya")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPalaeodictyoptera_Stenodictya.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPalaeodictyoptera_Stenodictya.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_palaeoisopus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPalaeoisopus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPalaeoisopus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_palaeojelly1")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraJellyfish_Palaeo1.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraJellyfish_Palaeo1.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_palaeojelly2")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraJellyfish_Palaeo2.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraJellyfish_Palaeo2.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_palaeojelly3")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraJellyfish_Palaeo3.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraJellyfish_Palaeo3.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_palaeojelly4")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraJellyfish_Palaeo4.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraJellyfish_Palaeo4.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_paradoxides")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraParadoxides.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraParadoxides.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_parexus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraParexus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraParexus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_parvancorina")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraParvancorina.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraParvancorina.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_paucipodia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPaucipodia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPaucipodia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_pederpes")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPederpes.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPederpes.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_pikaia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPikaia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPikaia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_platysomus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPlatysomus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPlatysomus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_pneumodesmus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPneumodesmus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPneumodesmus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_poleumita")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPoleumita.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPoleumita.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_pomatrum")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPomatrum.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPomatrum.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_poraspis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPoraspis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPoraspis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_promissum")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPromissum.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPromissum.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_psarolepis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPsarolepis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPsarolepis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_pteraspis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPteraspis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPteraspis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_pterygotus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPterygotus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPterygotus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_qilinyu")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraQilinyu.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraQilinyu.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_rhizodus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraRhizodus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraRhizodus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_sacabambaspis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraSacabambaspis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraSacabambaspis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_schinderhannes")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraSchinderhannes.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraSchinderhannes.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_scorpion_gigantoscorpio")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraScorpion_Gigantoscorpio.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraScorpion_Gigantoscorpio.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_scorpion_gondwanascorpio")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraScorpion_Gondwanascorpio.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraScorpion_Gondwanascorpio.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_scorpion_opsieobuthus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraScorpion_Opsieobuthus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraScorpion_Opsieobuthus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_scorpion_pulmonoscorpius")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraScorpion_Pulmonoscorpius.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraScorpion_Pulmonoscorpius.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_selenopeltis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraSelenopeltis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraSelenopeltis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_siberion")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraSiberion.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraSiberion.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_spathicephalus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraSpathicephalus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraSpathicephalus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_sphenacodon")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraSphenacodon.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraSphenacodon.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_spriggina")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraSpriggina.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraSpriggina.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_squatinactis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraSquatinactis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraSquatinactis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_synophalos")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraSynophalos.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraSynophalos.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_tegopelte")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraTegopelte.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraTegopelte.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_temperoceras")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraTemperoceras.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraTemperoceras.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_terataspis")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraTerataspis.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraTerataspis.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_tetragraptus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraTetragraptus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraTetragraptus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_thelodus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraThelodus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraThelodus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_titanichthys")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraTitanichthys.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraTitanichthys.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_tokummia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraTokummia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraTokummia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_trigonotarbid_cryptomartus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraTrigonotarbid_Cryptomartus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraTrigonotarbid_Cryptomartus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_trigonotarbid_eophrynus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraTrigonotarbid_Eophrynus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraTrigonotarbid_Eophrynus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_trigonotarbid_kreischeria")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraTrigonotarbid_Kreischeria.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraTrigonotarbid_Kreischeria.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_trigonotarbid_palaeocharinus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraTrigonotarbid_Palaeocharinus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraTrigonotarbid_Palaeocharinus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_trigonotarbid_palaeotarbus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraTrigonotarbid_Palaeotarbus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraTrigonotarbid_Palaeotarbus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_trigonotarbid_permotarbus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraTrigonotarbid_Permotarbus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraTrigonotarbid_Permotarbus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_tullimonstrum")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraTullimonstrum.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraTullimonstrum.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_vestinautilus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraVestinautilus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraVestinautilus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_walliserops")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraWalliserops.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraWalliserops.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_websteroprion")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraWebsteroprion.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraWebsteroprion.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_wiwaxia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraWiwaxia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraWiwaxia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_xenacanthus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraXenacanthus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraXenacanthus.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_xenusion")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraXenusion.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraXenusion.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_yawunik")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraYawunik.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraYawunik.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_yilingia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraYilingia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraYilingia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_yohoia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraYohoia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraYohoia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_yorgia")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraYorgia.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraYorgia.getHabitat());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_yunnanozoon")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraYunnanozoon.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraYunnanozoon.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_platyhystrix")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraPlatyhystrix.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraPlatyhystrix.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_estemmenosuchus")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraEstemmenosuchus.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraEstemmenosuchus.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_traquairius")) {
			List<String> tt = event.getToolTip();
			tt.add("Periods: " + EntityPrehistoricFloraTraquairius.getPeriod());
			//tt.add("Size: " + EntityPrehistoricFloraTraquairius.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_diictodon")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraDiictodon.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraDiictodon.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_eosimops")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraEosimops.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraEosimops.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_prosictodon")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraProsictodon.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraProsictodon.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_robertia")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraRobertia.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraRobertia.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_bushizheia")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraBushizheia.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraBushizheia.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_phantaspis")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraPhantaspis.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraPhantaspis.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_sidneyia")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraSidneyia.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraSidneyia.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_pharyngolepis")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraPharyngolepis.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraPharyngolepis.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_platycaraspis")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraPlatycaraspis.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraPlatycaraspis.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_crotalocephalus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraCrotalocephalus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraCrotalocephalus.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_dalmanites")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraDalmanites.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraDalmanites.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_drepanaspis")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraDrepanaspis.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraDrepanaspis.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_eusthenopteron")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraEusthenopteron.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraEusthenopteron.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_lunaspis")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraLunaspis.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraLunaspis.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_lungmenshanaspis")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraLungmenshanaspis.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraLungmenshanaspis.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_panderichthys")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraPanderichthys.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraPanderichthys.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_archoblattina")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraArchoblattinaInsect.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraArchoblattinaInsect.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_archoblattina_nymph")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraArchoblattinaNymph.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraArchoblattinaNymph.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_platylomaspis")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraPlatylomaspis.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraPlatylomaspis.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_roachoid_arid")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraRoachoidAridInsect.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraRoachoidAridInsect.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_roachoid_forest")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraRoachoidForestInsect.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraRoachoidForestInsect.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_roachoid_swamp")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraRoachoidSwampInsect.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraRoachoidSwampInsect.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_gerarus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraGerarusInsect.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraGerarusInsect.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_meganeuropsis")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraMeganeuropsis.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraMeganeuropsis.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_meganeuropsis_nymph")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraMeganeuropsisNymph.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraMeganeuropsisNymph.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_bandringa")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraBandringa.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraBandringa.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_gyracanthides")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraGyracanthides.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraGyracanthides.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_janassa")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraJanassa.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraJanassa.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_phanerotinus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraPhanerotinus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraPhanerotinus.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_proterogyrinus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraProterogyrinus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraProterogyrinus.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_listracanthus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraListracanthus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraListracanthus.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_prionosuchus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraPrionosuchus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraPrionosuchus.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_mooreoceras")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraMooreoceras.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraMooreoceras.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_rayonnoceras")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraRayonnoceras.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraRayonnoceras.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_remigiomontanus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraRemigiomontanus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraRemigiomontanus.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_edestus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraEdestus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraEdestus.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_pholiderpeton")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraPholiderpeton.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraPholiderpeton.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_mesosaurus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraMesosaurus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraMesosaurus.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_iniopteryx")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraIniopteryx.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraIniopteryx.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_menaspis")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraMenaspis.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraMenaspis.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_gnathorhiza")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraGnathorhiza.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraGnathorhiza.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_claudiosaurus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraClaudiosaurus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraClaudiosaurus.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_acanthostomatops")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraAcanthostomatops.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraAcanthostomatops.getSize());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_diadectes")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraDiadectes.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraDiadectes.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_dvinia")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraDvinia.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraDvinia.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_procynosuchus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraProcynosuchus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraProcynosuchus.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_kaibabvenator")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraKaibabvenator.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraKaibabvenator.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_saivodus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraSaivodus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraSaivodus.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_tapinocephalus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraTapinocephalus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraTapinocephalus.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_anteosaurus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraAnteosaurus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraAnteosaurus.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_vivaxosaurus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraVivaxosaurus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraVivaxosaurus.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_albertonia")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraAlbertonia.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraAlbertonia.getSize());
			}
			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_allenypterus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraAllenypterus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraAllenypterus.getSize());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_scutosaurus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraScutosaurus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraScutosaurus.getHabitat());
			}

			if (resourceLocation.toString().equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_labidosaurus")) {
				List<String> tt = event.getToolTip();
				tt.add("Periods: " + EntityPrehistoricFloraLabidosaurus.getPeriod());
				//tt.add("Size: " + EntityPrehistoricFloraLabidosaurus.getHabitat());
			}

		}

	}
}
