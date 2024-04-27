package net.lepidodendron;

import com.google.common.base.Predicate;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
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
	public void onWorldTick(TickEvent.ServerTickEvent event) {

		if (!LepidodendronConfig.playerSleep) {
			return;
		}

		//System.err.println("Testing");
		try {
			if (event.phase == TickEvent.Phase.START) {
				int[] dims = DimensionManager.getRegisteredDimensions().values().stream().flatMap(Collection::stream).mapToInt(Integer::intValue).toArray();
				int[] dimsPlayers = {};
				int playerCount = 0; //Count of players to test
				int playerCountAsleep = 0; //Count of players asleep
				if (dims.length <= 0) {
					return;
				}
				for (int i : dims) {
					WorldServer WorldTest = DimensionManager.getWorld(i);
					if (WorldTest != null) {
						ObjectList<EntityPlayer> playersInWorld = new ObjectArrayList<> (WorldTest.getPlayers (EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase ));
						if (!playersInWorld.isEmpty()) {
							for (EntityPlayer p : playersInWorld) {
								if (p.getEntityWorld().provider.canSleepAt(p, p.getPosition()) == WorldProvider.WorldSleepResult.ALLOW
									&& (!p.isSpectator()) ) {
									//The player "could" sleep here, so add the world to the iterator if not already there:
									if (!(IntStream.of(dimsPlayers).anyMatch(x -> x == i))) {
										dimsPlayers = addX(dimsPlayers, i);
									}
									playerCount ++;
								}
							}
						}
					}
				}

				//Iterate over the identified populated dimensions:
				if (dimsPlayers.length <= 0) {
					return;
				}
				if (!(playerCount > 0)) {
					return;
				}
				for (int i : dimsPlayers) {
					WorldServer WorldTest = DimensionManager.getWorld(i);
					ObjectList<EntityPlayer> playersInWorld = new ObjectArrayList<> (WorldTest.getPlayers (EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase ));
					if (!playersInWorld.isEmpty()) {
						playerCountAsleep = playerCountAsleep + getPlayersAsleepInWorld(WorldTest);
					}
				}

				//Test for move to daytime:
				double sleep = LepidodendronConfig.playerSleepPercent;
				if (sleep < 0.0) {
					sleep = 0.0;
				}
				if (sleep > 100.0) {
					sleep = 100.0;
				}
				if (playerCountAsleep > 0
						&& (((double)playerCountAsleep)/((double)playerCount)) >= (sleep/100D)) {

					World Overworld = DimensionManager.getWorld(0);
					if (Overworld.getGameRules().getBoolean("doDaylightCycle")) {
						long i = Overworld.getWorldTime() + 24000L;
						Overworld.setWorldTime(i - i % 24000L);
						//System.err.println("Setting morning");
					}
					if (Overworld.getGameRules().getBoolean("doWeatherCycle")) {
						Overworld.provider.resetRainAndThunder();
					}
					for (int i : dims) {
						WorldServer WorldTest = DimensionManager.getWorld(i);
						wakeAllPlayers(WorldTest);
					}
				}
			}
		}
		catch (IllegalAccessException error) {
			//Just ignore it for now, errors when players are in the process of logging in
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

	public int getPlayersAsleepInWorld(WorldServer world) throws IllegalAccessException {

		int playersAsleep = 0;
		if (world == null) {
			return 0;
		}

		ObjectList<EntityPlayer> playersInWorld = new ObjectArrayList<> (world.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));

		if (!playersInWorld.isEmpty()) {
			for (EntityPlayer entityplayer : playersInWorld) {
				if ((!entityplayer.isSpectator()) ) {
					if (entityplayer.isPlayerSleeping()) {
						if (isPlayerFullyAsleep(entityplayer)) {
							playersAsleep ++;
						}
					}
				}
			}
		}
		return playersAsleep;
	}

	public boolean isPlayerFullyAsleep(EntityPlayer player) throws IllegalAccessException {
		Field f1 = ObfuscationReflectionHelper.findField(EntityPlayer.class, "field_71076_b");
		//f1.setAccessible(true);
		//int pp = f1.getInt(player);
		if (player.dimension == 0 && f1.getInt(player) >= 96) {
			f1.set(player, 96);
		}
		//pp = f1.getInt(player);
		return player.isPlayerSleeping() && f1.getInt(player) >= 95;
	}

	protected void wakeAllPlayers(WorldServer world)
	{
		if (world == null) {
			return;
		}

		ObjectList<EntityPlayer> playersInWorld = new ObjectArrayList<> (world.getPlayers(EntityPlayerMP.class, (Predicate<Entity>) entity -> entity instanceof EntityLivingBase));

		for (EntityPlayer entityplayer : playersInWorld.stream().filter(EntityPlayer::isPlayerSleeping).collect(Collectors.toList()))
		{
			entityplayer.wakeUpPlayer(false, false, true);
		}
	}

}
