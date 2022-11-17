package net.lepidodendron;

import com.google.common.base.Predicate;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.world.World;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LepidodendronDimensionalSleeping {

	@SubscribeEvent
	public void onWorldTick(TickEvent.ServerTickEvent event) throws IllegalAccessException {

		//System.err.println("Testing");

		if (event.phase == TickEvent.Phase.START) {
			int[] dims = DimensionManager.getRegisteredDimensions().values().stream().flatMap(Collection::stream).mapToInt(Integer::intValue).toArray();
			int[] dimsPlayers = {};
			for (int i: dims) {
				WorldServer WorldTest = DimensionManager.getWorld(i);
				if (WorldTest != null) {
					List<EntityPlayer> playersInWorld = WorldTest.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase);
					if (!playersInWorld.isEmpty()) {
						for (EntityPlayer p: playersInWorld) {
							if (p.getEntityWorld().provider.canSleepAt(p, p.getPosition()) == WorldProvider.WorldSleepResult.ALLOW) {
								//The player "could" sleep here, so add the world to the iterator if not already there:
								if (IntStream.of(dimsPlayers).anyMatch(x -> x == i)) {
									dimsPlayers = addX(dimsPlayers, i);
								}
							}
						}
					}
				}
			}

			//Iterate over the identified populated dimensions:
			if (dimsPlayers.length <= 0) {
				return;
			}
			for (int i: dimsPlayers) {
				WorldServer WorldTest = DimensionManager.getWorld(i);
				List<EntityPlayer> playersInWorld = WorldTest.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase);
				if (!playersInWorld.isEmpty()) {
					if (!areAllPlayersAsleep(WorldTest)) {
						return;
					}
				}
			}

			World Overworld = DimensionManager.getWorld(0);
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
			for (int i: dims) {
				WorldServer WorldTest = DimensionManager.getWorld(i);
				wakeAllPlayers(WorldTest);
			}
		}
	}

	// Function to add x in arr
	public static int[] addX(int arr[], int x)
	{
		int i;
		int n = arr.length;
		// create a new array of size n+1
		int newarr[] = new int[n + 1];

		// insert the elements from
		// the old array into the new array
		// insert all elements till n
		// then insert x at n+1
		for (i = 0; i < n; i++)
			newarr[i] = arr[i];

		newarr[n] = x;

		return newarr;
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
