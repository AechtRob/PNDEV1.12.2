package net.lepidodendron;

import com.google.common.base.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class LepidodendronDimensionalSleeping {

	@SubscribeEvent
	public void onWorldTick(TickEvent.ServerTickEvent event) throws IllegalAccessException {

		//System.err.println("Testing");

		if (event.phase == TickEvent.Phase.START) {
			boolean sleepPrecambrian = false;
			boolean worldPrecambrian = false;
			WorldServer Precambrian = DimensionManager.getWorld(LepidodendronConfig.dimPrecambrian);
			if (Precambrian != null) {
				if (Precambrian.getChunkProvider().getLoadedChunkCount() != 0) {
					worldPrecambrian = true;
					List<EntityPlayer> playersInWorld = Precambrian.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase);
					if (playersInWorld.isEmpty()) {
						worldPrecambrian = false;
					}
					else if (areAllPlayersAsleep(Precambrian)) {
						sleepPrecambrian = true;
					}
				}
			}
			boolean sleepCambrian = false;
			boolean worldCambrian = false;
			WorldServer Cambrian = DimensionManager.getWorld(LepidodendronConfig.dimCambrian);
			if (Cambrian != null) {
				if (Cambrian.getChunkProvider().getLoadedChunkCount() != 0) {
					worldCambrian = true;
					List<EntityPlayer> playersInWorld = Cambrian.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase);
					if (playersInWorld.isEmpty()) {
						worldCambrian = false;
					}
					else if (areAllPlayersAsleep(Cambrian)) {
						sleepCambrian = true;
					}
				}
			}
			boolean sleepOrdovician = false;
			boolean worldOrdovician = false;
			WorldServer Ordovician = DimensionManager.getWorld(LepidodendronConfig.dimOrdovician);
			if (Ordovician != null) {
				if (Ordovician.getChunkProvider().getLoadedChunkCount() != 0) {
					worldOrdovician = true;
					List<EntityPlayer> playersInWorld = Ordovician.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase);
					if (playersInWorld.isEmpty()) {
						worldOrdovician = false;
					}
					else if (areAllPlayersAsleep(Ordovician)) {
						sleepOrdovician = true;
					}
				}
			}
			boolean sleepSilurian = false;
			boolean worldSilurian = false;
			WorldServer Silurian = DimensionManager.getWorld(LepidodendronConfig.dimSilurian);
			if (Silurian != null) {
				if (Silurian.getChunkProvider().getLoadedChunkCount() != 0) {
					worldSilurian = true;
					List<EntityPlayer> playersInWorld = Silurian.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase);
					if (playersInWorld.isEmpty()) {
						worldSilurian = false;
					}
					else if (areAllPlayersAsleep(Silurian)) {
						sleepSilurian = true;
					}
				}
			}
			boolean sleepDevonian = false;
			boolean worldDevonian = false;
			WorldServer Devonian = DimensionManager.getWorld(LepidodendronConfig.dimDevonian);
			if (Devonian != null) {
				if (Devonian.getChunkProvider().getLoadedChunkCount() != 0) {
					worldDevonian = true;
					List<EntityPlayer> playersInWorld = Devonian.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase);
					if (playersInWorld.isEmpty()) {
						worldDevonian = false;
					}
					else if (areAllPlayersAsleep(Devonian)) {
						sleepDevonian = true;
					}
				}
			}
			boolean sleepCarboniferous = false;
			boolean worldCarboniferous = false;
			WorldServer Carboniferous = DimensionManager.getWorld(LepidodendronConfig.dimCarboniferous);
			if (Carboniferous != null) {
				if (Carboniferous.getChunkProvider().getLoadedChunkCount() != 0) {
					worldCarboniferous = true;
					List<EntityPlayer> playersInWorld = Carboniferous.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase);
					if (playersInWorld.isEmpty()) {
						worldCarboniferous = false;
					}
					else if (areAllPlayersAsleep(Carboniferous)) {
						sleepCarboniferous = true;
					}
				}
			}
			boolean sleepPermian = false;
			boolean worldPermian = false;
			WorldServer Permian = DimensionManager.getWorld(LepidodendronConfig.dimPermian);
			if (Permian != null) {
				if (Permian.getChunkProvider().getLoadedChunkCount() != 0) {
					worldPermian = true;
					List<EntityPlayer> playersInWorld = Permian.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase);
					if (playersInWorld.isEmpty()) {
						worldPermian = false;
					}
					else if (areAllPlayersAsleep(Permian)) {
						sleepPermian = true;
					}
				}
			}
			boolean sleepTriassic = false;
			boolean worldTriassic = false;
			WorldServer Triassic = DimensionManager.getWorld(LepidodendronConfig.dimTriassic);
			if (Triassic != null) {
				if (Triassic.getChunkProvider().getLoadedChunkCount() != 0) {
					worldTriassic = true;
					List<EntityPlayer> playersInWorld = Triassic.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase);
					if (playersInWorld.isEmpty()) {
						worldTriassic = false;
					}
					else if (areAllPlayersAsleep(Triassic)) {
						sleepTriassic = true;
					}
				}
			}
			boolean sleepJurassic = false;
			boolean worldJurassic = false;
			WorldServer Jurassic = DimensionManager.getWorld(LepidodendronConfig.dimJurassic);
			if (Jurassic != null) {
				if (Jurassic.getChunkProvider().getLoadedChunkCount() != 0) {
					worldJurassic = true;
					List<EntityPlayer> playersInWorld = Jurassic.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase);
					if (playersInWorld.isEmpty()) {
						worldJurassic = false;
					}
					else if (areAllPlayersAsleep(Jurassic)) {
						sleepJurassic = true;
					}
				}
			}
			boolean sleepOverworld = false;
			boolean worldOverworld = false;
			WorldServer Overworld = DimensionManager.getWorld(0);
			if (Overworld != null) {
				if (Overworld.getChunkProvider().getLoadedChunkCount() != 0) {
					worldOverworld = true;
					//System.err.println("overworld is loaded");
					List<EntityPlayer> playersInWorld = Overworld.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase);
					if (playersInWorld.isEmpty()) {
						//System.err.println("overworld has no players");
						worldOverworld = false;
					}
					else if (areAllPlayersAsleep(Overworld)) {
						//System.err.println("all are asleep in overworld");
						sleepOverworld = true;
						worldOverworld = true;
					}
				}
			}

			boolean testPrecambrian = true;
			boolean testCambrian = true;
			boolean testOrdovician = true;
			boolean testSilurian = true;
			boolean testDevonian = true;
			boolean testCarboniferous = true;
			boolean testPermian = true;
			boolean testTriassic = true;
			boolean testJurassic = true;
			boolean testOverworld = true;

			if (worldPrecambrian && !sleepPrecambrian) {
				testPrecambrian = false;
			}
			if (worldCambrian && !sleepCambrian) {
				testCambrian = false;
			}
			if (worldOrdovician && !sleepOrdovician) {
				testOrdovician = false;
			}
			if (worldSilurian && !sleepSilurian) {
				testSilurian = false;
			}
			if (worldDevonian && !sleepDevonian) {
				testDevonian = false;
			}
			if (worldCarboniferous && !sleepCarboniferous) {
				testCarboniferous = false;
			}
			if (worldPermian && !sleepPermian) {
				testPermian = false;
			}
			if (worldTriassic && !sleepTriassic) {
				testTriassic = false;
			}
			if (worldJurassic && !sleepJurassic) {
				testJurassic = false;
			}
			if (worldOverworld && !sleepOverworld) {
				testOverworld = false;
			}


			/*
				System.err.println("testPrecambrian: " + testPrecambrian);
				System.err.println("testCambrian: " + testCambrian);
				System.err.println("testOrdovician: " + testOrdovician);
				System.err.println("testSilurian: " + testSilurian);
				System.err.println("testDevonian: " + testDevonian);
				System.err.println("testCarboniferous: " + testCarboniferous);
				System.err.println("testPermian: " + testPermian);
				System.err.println("testTriassic: " + testTriassic);
				System.err.println("testJurassic: " + testJurassic);
				System.err.println("testOverworld: " + testOverworld);


				System.err.println("sleepPrecambrian: " + sleepPrecambrian);
				System.err.println("sleepCambrian: " + sleepCambrian);
				System.err.println("sleepOrdovician: " + sleepOrdovician);
				System.err.println("sleepSilurian: " + sleepSilurian);
				System.err.println("sleepDevonian: " + sleepDevonian);
				System.err.println("sleepCarboniferous: " + sleepCarboniferous);
				System.err.println("sleepPermian: " + sleepPermian);
				System.err.println("sleepTriassic: " + sleepTriassic);
				System.err.println("sleepJurassic: " + sleepJurassic);
				System.err.println("sleepOverworld: " + sleepOverworld);

				System.err.println("worldPrecambrian: " + worldPrecambrian);
				System.err.println("worldCambrian: " + worldCambrian);
				System.err.println("worldOrdovician: " + worldOrdovician);
				System.err.println("worldSilurian: " + worldSilurian);
				System.err.println("worldDevonian: " + worldDevonian);
				System.err.println("worldCarboniferous: " + worldCarboniferous);
				System.err.println("worldPermian: " + worldPermian);
				System.err.println("worldTriassic: " + worldTriassic);
				System.err.println("worldJurassic: " + worldJurassic);
				System.err.println("worldOverworld: " + worldOverworld);
				
			*/

			if (testPrecambrian
				&& testCambrian
				&& testOrdovician
				&& testSilurian
				&& testDevonian
				&& testCarboniferous
				&& testPermian
				&& testTriassic
				&& testJurassic
				&& testOverworld
			) {
				//Quickly test the otehr dimensions and check in case we starting up still:
				int[] dims = DimensionManager.getRegisteredDimensions().values().stream().flatMap(Collection::stream).mapToInt(Integer::intValue).toArray();
				boolean isAnyoneLoggedIn = false;
				for (int i: dims) {
					WorldServer WorldTest = DimensionManager.getWorld(i);
					if (WorldTest != null) {
						if (Overworld.getChunkProvider().getLoadedChunkCount() != 0) {
							List<EntityPlayer> playersInWorld = WorldTest.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase);
							if (!playersInWorld.isEmpty()) {
								isAnyoneLoggedIn = true;
							}
						}
					}
					if (isAnyoneLoggedIn) {
						break;
					}
				}
				if (!isAnyoneLoggedIn) {
					//System.err.println("No-one logged in ");
					return;
				}

				if (Overworld.getGameRules().getBoolean("doDaylightCycle"))
				{
					long i = Overworld.getWorldTime() + 24000L;
					Overworld.setWorldTime(i - i % 24000L);
					//System.err.println("Setting morning");
				}
				if (Overworld.getGameRules().getBoolean("doWeatherCycle"))
				{
					Overworld.provider.resetRainAndThunder();
				}
				wakeAllPlayers(Precambrian);
				wakeAllPlayers(Cambrian);
				wakeAllPlayers(Ordovician);
				wakeAllPlayers(Silurian);
				wakeAllPlayers(Devonian);
				wakeAllPlayers(Carboniferous);
				wakeAllPlayers(Permian);
				wakeAllPlayers(Triassic);
				wakeAllPlayers(Jurassic);
				wakeAllPlayers((WorldServer) Overworld);
			}
		}
	}

	public boolean allPlayersSleeping(WorldServer world)
	{
		if (world == null) {
			return false;
		}

		//System.err.println("allPlayersSleeping");

		List<EntityPlayer> playersInWorld = world.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase);

		if (!playersInWorld.isEmpty())
		{
			int i = 0;
			int j = 0;

			for (EntityPlayer entityplayer : playersInWorld)
			{
				if (entityplayer.isSpectator())
				{
					++i;
				}
				else if (entityplayer.isPlayerSleeping())
				{
					++j;
				}
			}
			//System.err.println("allPlayersSleeping result " + (j > 0 && j >= playersInWorld.size() - i));
			return j > 0 && j >= playersInWorld.size() - i;
		}
		//System.err.println("allPlayersSleeping result false default");
		return false;
	}

	public boolean areAllPlayersAsleep(WorldServer world) throws IllegalAccessException {

		//System.err.println("areAllPlayersAsleep");

		if (allPlayersSleeping(world) && !world.isRemote)
		{
			List<EntityPlayer> playersInWorld = world.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase);
			for (EntityPlayer entityplayer : playersInWorld)
			{
				if (!entityplayer.isSpectator() && !isPlayerFullyAsleep(entityplayer))
				{
					return false;
				}
			}

			return true;
		}
		else
		{
			return false;
		}
	}

	public boolean isPlayerFullyAsleep(EntityPlayer player) throws IllegalAccessException {
		Field f1 = ObfuscationReflectionHelper.findField(EntityPlayer.class, "field_71076_b");
		//f1.setAccessible(true);
		if (player.dimension == 0 && f1.getInt(player) >= 96) {
			f1.set(player, 96);
		}
		return player.isPlayerSleeping() && f1.getInt(player) >= 95;
	}

	protected void wakeAllPlayers(WorldServer world)
	{
		if (world == null) {
			return;
		}

		List<EntityPlayer> playersInWorld = world.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase);

		for (EntityPlayer entityplayer : playersInWorld.stream().filter(EntityPlayer::isPlayerSleeping).collect(Collectors.toList()))
		{
			entityplayer.wakeUpPlayer(false, false, true);
		}
	}

}
