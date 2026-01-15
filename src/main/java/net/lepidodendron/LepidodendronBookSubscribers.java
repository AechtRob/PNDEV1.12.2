package net.lepidodendron;

import net.lepidodendron.block.BlockNest;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.*;
import net.lepidodendron.entity.base.*;
import net.lepidodendron.entity.boats.PrehistoricFloraSubmarine;
import net.lepidodendron.entity.util.*;
import net.lepidodendron.util.*;
import net.lepidodendron.util.patchouli.PercentageCollected;
import net.minecraft.advancements.AdvancementManager;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.event.entity.player.AdvancementEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

import java.text.DecimalFormat;
import java.util.Locale;

public class LepidodendronBookSubscribers {

	public static void updatePaleopediaStats(EntityPlayer player) {
		if (player.world.isRemote) {
			return;
		}
		IPaleopediaStatsPrecambrian stats1 = player.getCapability(PaleopediaStatsProviderPrecambrian.PALEOPEDIA_STATS, null);
		stats1.setStats(PercentageCollected.getPercentagePerDimensionTotal(player, 0, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats1.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderPrecambrian.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsPrecambrianCompleted stats2 = player.getCapability(PaleopediaStatsProviderPrecambrianCompleted.PALEOPEDIA_STATS, null);
		stats2.setStats(PercentageCollected.getPercentagePerDimensionAchieved(player, 0, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats2.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderPrecambrianCompleted.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsCambrian stats3 = player.getCapability(PaleopediaStatsProviderCambrian.PALEOPEDIA_STATS, null);
		stats3.setStats(PercentageCollected.getPercentagePerDimensionTotal(player, 1, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats3.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderCambrian.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsCambrianCompleted stats4 = player.getCapability(PaleopediaStatsProviderCambrianCompleted.PALEOPEDIA_STATS, null);
		stats4.setStats(PercentageCollected.getPercentagePerDimensionAchieved(player, 1, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats4.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderCambrianCompleted.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsOrdovician stats5 = player.getCapability(PaleopediaStatsProviderOrdovician.PALEOPEDIA_STATS, null);
		stats5.setStats(PercentageCollected.getPercentagePerDimensionTotal(player, 2, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats5.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderOrdovician.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsOrdovicianCompleted stats6 = player.getCapability(PaleopediaStatsProviderOrdovicianCompleted.PALEOPEDIA_STATS, null);
		stats6.setStats(PercentageCollected.getPercentagePerDimensionAchieved(player, 2, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats6.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderOrdovicianCompleted.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsSilurian stats7 = player.getCapability(PaleopediaStatsProviderSilurian.PALEOPEDIA_STATS, null);
		stats7.setStats(PercentageCollected.getPercentagePerDimensionTotal(player, 3, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats7.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderSilurian.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsSilurianCompleted stats8 = player.getCapability(PaleopediaStatsProviderSilurianCompleted.PALEOPEDIA_STATS, null);
		stats8.setStats(PercentageCollected.getPercentagePerDimensionAchieved(player, 3, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats8.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderSilurianCompleted.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsDevonian stats9 = player.getCapability(PaleopediaStatsProviderDevonian.PALEOPEDIA_STATS, null);
		stats9.setStats(PercentageCollected.getPercentagePerDimensionTotal(player, 4, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats9.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderDevonian.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsDevonianCompleted stats10 = player.getCapability(PaleopediaStatsProviderDevonianCompleted.PALEOPEDIA_STATS, null);
		stats10.setStats(PercentageCollected.getPercentagePerDimensionAchieved(player, 4, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats10.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderDevonianCompleted.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsCarboniferous stats11 = player.getCapability(PaleopediaStatsProviderCarboniferous.PALEOPEDIA_STATS, null);
		stats11.setStats(PercentageCollected.getPercentagePerDimensionTotal(player, 5, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats11.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderCarboniferous.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsCarboniferousCompleted stats12 = player.getCapability(PaleopediaStatsProviderCarboniferousCompleted.PALEOPEDIA_STATS, null);
		stats12.setStats(PercentageCollected.getPercentagePerDimensionAchieved(player, 5, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats12.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderCarboniferousCompleted.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsPermian stats13 = player.getCapability(PaleopediaStatsProviderPermian.PALEOPEDIA_STATS, null);
		stats13.setStats(PercentageCollected.getPercentagePerDimensionTotal(player, 6, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats13.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderPermian.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsPermianCompleted stats14 = player.getCapability(PaleopediaStatsProviderPermianCompleted.PALEOPEDIA_STATS, null);
		stats14.setStats(PercentageCollected.getPercentagePerDimensionAchieved(player, 6, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats14.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderPermianCompleted.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsTriassic stats15 = player.getCapability(PaleopediaStatsProviderTriassic.PALEOPEDIA_STATS, null);
		stats15.setStats(PercentageCollected.getPercentagePerDimensionTotal(player, 7, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats15.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderTriassic.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsTriassicCompleted stats16 = player.getCapability(PaleopediaStatsProviderTriassicCompleted.PALEOPEDIA_STATS, null);
		stats16.setStats(PercentageCollected.getPercentagePerDimensionAchieved(player, 7, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats16.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderTriassicCompleted.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsJurassic stats17 = player.getCapability(PaleopediaStatsProviderJurassic.PALEOPEDIA_STATS, null);
		stats17.setStats(PercentageCollected.getPercentagePerDimensionTotal(player, 8, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats17.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderJurassic.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsJurassicCompleted stats18 = player.getCapability(PaleopediaStatsProviderJurassicCompleted.PALEOPEDIA_STATS, null);
		stats18.setStats(PercentageCollected.getPercentagePerDimensionAchieved(player, 8, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats18.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderJurassicCompleted.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsCretaceousEarly stats19 = player.getCapability(PaleopediaStatsProviderCretaceousEarly.PALEOPEDIA_STATS, null);
		stats19.setStats(PercentageCollected.getPercentagePerDimensionTotal(player, 9, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats19.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderCretaceousEarly.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsCretaceousEarlyCompleted stats20 = player.getCapability(PaleopediaStatsProviderCretaceousEarlyCompleted.PALEOPEDIA_STATS, null);
		stats20.setStats(PercentageCollected.getPercentagePerDimensionAchieved(player, 9, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats20.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderCretaceousEarlyCompleted.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsCretaceousLate stats21 = player.getCapability(PaleopediaStatsProviderCretaceousLate.PALEOPEDIA_STATS, null);
		stats21.setStats(PercentageCollected.getPercentagePerDimensionTotal(player, 10, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats21.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderCretaceousLate.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsCretaceousLateCompleted stats22 = player.getCapability(PaleopediaStatsProviderCretaceousLateCompleted.PALEOPEDIA_STATS, null);
		stats22.setStats(PercentageCollected.getPercentagePerDimensionAchieved(player, 10, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats22.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderCretaceousLateCompleted.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsPaleogene stats23 = player.getCapability(PaleopediaStatsProviderPaleogene.PALEOPEDIA_STATS, null);
		stats23.setStats(PercentageCollected.getPercentagePerDimensionTotal(player, 11, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats23.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderPaleogene.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsPaleogeneCompleted stats24 = player.getCapability(PaleopediaStatsProviderPaleogeneCompleted.PALEOPEDIA_STATS, null);
		stats24.setStats(PercentageCollected.getPercentagePerDimensionAchieved(player, 11, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats24.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderPaleogeneCompleted.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsNeogene stats25 = player.getCapability(PaleopediaStatsProviderNeogene.PALEOPEDIA_STATS, null);
		stats25.setStats(PercentageCollected.getPercentagePerDimensionTotal(player, 12, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats25.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderNeogene.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsNeogeneCompleted stats26 = player.getCapability(PaleopediaStatsProviderNeogeneCompleted.PALEOPEDIA_STATS, null);
		stats26.setStats(PercentageCollected.getPercentagePerDimensionAchieved(player, 12, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats26.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderNeogeneCompleted.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsPleistocene stats27 = player.getCapability(PaleopediaStatsProviderPleistocene.PALEOPEDIA_STATS, null);
		stats27.setStats(PercentageCollected.getPercentagePerDimensionTotal(player, 13, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats27.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderPleistocene.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}
		IPaleopediaStatsPleistoceneCompleted stats28 = player.getCapability(PaleopediaStatsProviderPleistoceneCompleted.PALEOPEDIA_STATS, null);
		stats28.setStats(PercentageCollected.getPercentagePerDimensionAchieved(player, 13, false));
		if (player instanceof EntityPlayerMP) {
			float statsFloat = stats28.getStats();
			LepidodendronMod.PACKET_HANDLER.sendTo(new PaleopediaStatsProviderPleistoceneCompleted.StatsPacket(statsFloat), (EntityPlayerMP)player);
		}

	}
	
	@SubscribeEvent //If we grant an advancement, check if we have just completed a Dimension:
	public void onGiveAdvancement(AdvancementEvent event) {
		if (event.getEntityPlayer().getEntityWorld().isRemote) {
			return;
		}
		AdvancementManager mgr = null;
		if (event.getEntityPlayer().getEntityWorld() instanceof WorldServer) {
			mgr = ((WorldServer)event.getEntityPlayer().getEntityWorld()).getAdvancementManager();
		}
		if (mgr == null) {
			return;
		}
		if (event.getAdvancement().getParent() != null) {
			if ((!event.getAdvancement().getParent().getId().toString().equalsIgnoreCase("lepidodendron:pf_base_adv_knowledge"))
				&& (!event.getAdvancement().getParent().getId().toString().equalsIgnoreCase("lepidodendron:pf_base_adv"))) {
				return;
			}
		}

		updatePaleopediaStats(event.getEntityPlayer());

		if (event.getAdvancement().getId().toString().equalsIgnoreCase("lepidodendron:pf_adv_complete_precambrian")
				|| event.getAdvancement().getId().toString().equalsIgnoreCase("lepidodendron:pf_adv_complete_cambrian")
				|| event.getAdvancement().getId().toString().equalsIgnoreCase("lepidodendron:pf_adv_complete_ordovician")
				|| event.getAdvancement().getId().toString().equalsIgnoreCase("lepidodendron:pf_adv_complete_silurian")
				|| event.getAdvancement().getId().toString().equalsIgnoreCase("lepidodendron:pf_adv_complete_devonian")
				|| event.getAdvancement().getId().toString().equalsIgnoreCase("lepidodendron:pf_adv_complete_carboniferous")
				|| event.getAdvancement().getId().toString().equalsIgnoreCase("lepidodendron:pf_adv_complete_permian")
				|| event.getAdvancement().getId().toString().equalsIgnoreCase("lepidodendron:pf_adv_complete_triassic")
				|| event.getAdvancement().getId().toString().equalsIgnoreCase("lepidodendron:pf_adv_complete_jurassic")
				|| event.getAdvancement().getId().toString().equalsIgnoreCase("lepidodendron:pf_adv_complete_cretaceous_early")
				|| event.getAdvancement().getId().toString().equalsIgnoreCase("lepidodendron:pf_adv_complete_cretaceous_late")
				|| event.getAdvancement().getId().toString().equalsIgnoreCase("lepidodendron:pf_adv_complete_paleogene")
				|| event.getAdvancement().getId().toString().equalsIgnoreCase("lepidodendron:pf_adv_complete_neogene")
				|| event.getAdvancement().getId().toString().equalsIgnoreCase("lepidodendron:pf_adv_complete_pleistocene")) {
			//Avoid getting stuck in a loop!
			//But do play the sound for these:
			for (EntityPlayer player : event.getEntityPlayer().getEntityWorld().playerEntities) {
				player.getEntityWorld().playSound(null, player.getPosition().getX(), player.getPosition().getY(), player.getPosition().getZ(), BlockSounds.EXPERT_ADVANCEMENT, SoundCategory.MASTER, 1.0F, 1.0F);
			}
			return;
		}

		if (event.getEntityPlayer() instanceof EntityPlayerMP && event.getEntityPlayer().world instanceof WorldServer) {
			if (!((EntityPlayerMP) event.getEntityPlayer()).getAdvancements()
					.getProgress(((WorldServer) event.getEntityPlayer().world).getAdvancementManager()
					.getAdvancement(new ResourceLocation("lepidodendron:pf_adv_complete_precambrian"))).isDone()) {
				if (PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 0, true).equalsIgnoreCase("true")) {
					if (event.getEntityPlayer() instanceof EntityPlayerMP) {
						ModTriggers.COMPLETE_PRECAMBRIAN.trigger((EntityPlayerMP) event.getEntityPlayer());
					}
				}
			}
			if (!((EntityPlayerMP) event.getEntityPlayer()).getAdvancements()
					.getProgress(((WorldServer) event.getEntityPlayer().world).getAdvancementManager()
							.getAdvancement(new ResourceLocation("lepidodendron:pf_adv_complete_cambrian"))).isDone()) {
				if (PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 1, true).equalsIgnoreCase("true")) {
					if (event.getEntityPlayer() instanceof EntityPlayerMP) {
						ModTriggers.COMPLETE_CAMBRIAN.trigger((EntityPlayerMP) event.getEntityPlayer());
					}
				}
			}
			if (!((EntityPlayerMP) event.getEntityPlayer()).getAdvancements()
					.getProgress(((WorldServer) event.getEntityPlayer().world).getAdvancementManager()
							.getAdvancement(new ResourceLocation("lepidodendron:pf_adv_complete_ordovician"))).isDone()) {
				if (PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 2, true).equalsIgnoreCase("true")) {
					if (event.getEntityPlayer() instanceof EntityPlayerMP) {
						ModTriggers.COMPLETE_ORDOVICIAN.trigger((EntityPlayerMP) event.getEntityPlayer());
					}
				}
			}
			if (!((EntityPlayerMP) event.getEntityPlayer()).getAdvancements()
					.getProgress(((WorldServer) event.getEntityPlayer().world).getAdvancementManager()
							.getAdvancement(new ResourceLocation("lepidodendron:pf_adv_complete_silurian"))).isDone()) {
				if (PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 3, true).equalsIgnoreCase("true")) {
					if (event.getEntityPlayer() instanceof EntityPlayerMP) {
						ModTriggers.COMPLETE_SILURIAN.trigger((EntityPlayerMP) event.getEntityPlayer());
					}
				}
			}
			if (!((EntityPlayerMP) event.getEntityPlayer()).getAdvancements()
					.getProgress(((WorldServer) event.getEntityPlayer().world).getAdvancementManager()
							.getAdvancement(new ResourceLocation("lepidodendron:pf_adv_complete_devonian"))).isDone()) {
				if (PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 4, true).equalsIgnoreCase("true")) {
					if (event.getEntityPlayer() instanceof EntityPlayerMP) {
						ModTriggers.COMPLETE_DEVONIAN.trigger((EntityPlayerMP) event.getEntityPlayer());
					}
				}
			}
			if (!((EntityPlayerMP) event.getEntityPlayer()).getAdvancements()
					.getProgress(((WorldServer) event.getEntityPlayer().world).getAdvancementManager()
							.getAdvancement(new ResourceLocation("lepidodendron:pf_adv_complete_carboniferous"))).isDone()) {
				if (PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 5, true).equalsIgnoreCase("true")) {
					if (event.getEntityPlayer() instanceof EntityPlayerMP) {
						ModTriggers.COMPLETE_CARBONIFEROUS.trigger((EntityPlayerMP) event.getEntityPlayer());
					}
				}
			}
			if (!((EntityPlayerMP) event.getEntityPlayer()).getAdvancements()
					.getProgress(((WorldServer) event.getEntityPlayer().world).getAdvancementManager()
							.getAdvancement(new ResourceLocation("lepidodendron:pf_adv_complete_permian"))).isDone()) {
				if (PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 6, true).equalsIgnoreCase("true")) {
					if (event.getEntityPlayer() instanceof EntityPlayerMP) {
						ModTriggers.COMPLETE_PERMIAN.trigger((EntityPlayerMP) event.getEntityPlayer());
					}
				}
			}
			if (!((EntityPlayerMP) event.getEntityPlayer()).getAdvancements()
					.getProgress(((WorldServer) event.getEntityPlayer().world).getAdvancementManager()
							.getAdvancement(new ResourceLocation("lepidodendron:pf_adv_complete_triassic"))).isDone()) {
				if (PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 7, true).equalsIgnoreCase("true")) {
					if (event.getEntityPlayer() instanceof EntityPlayerMP) {
						ModTriggers.COMPLETE_TRIASSIC.trigger((EntityPlayerMP) event.getEntityPlayer());
					}
				}
			}
			if (!((EntityPlayerMP) event.getEntityPlayer()).getAdvancements()
					.getProgress(((WorldServer) event.getEntityPlayer().world).getAdvancementManager()
							.getAdvancement(new ResourceLocation("lepidodendron:pf_adv_complete_jurassic"))).isDone()) {
				if (PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 8, true).equalsIgnoreCase("true")) {
					if (event.getEntityPlayer() instanceof EntityPlayerMP) {
						ModTriggers.COMPLETE_JURASSIC.trigger((EntityPlayerMP) event.getEntityPlayer());
					}
				}
			}
			if (!((EntityPlayerMP) event.getEntityPlayer()).getAdvancements()
					.getProgress(((WorldServer) event.getEntityPlayer().world).getAdvancementManager()
							.getAdvancement(new ResourceLocation("lepidodendron:pf_adv_complete_cretaceous_early"))).isDone()) {
				if (PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 9, true).equalsIgnoreCase("true")) {
					if (event.getEntityPlayer() instanceof EntityPlayerMP) {
						//ModTriggers.COMPLETE_CRETACEOUS_EARLY.trigger((EntityPlayerMP) event.getEntityPlayer());
					}
				}
			}
			if (!((EntityPlayerMP) event.getEntityPlayer()).getAdvancements()
					.getProgress(((WorldServer) event.getEntityPlayer().world).getAdvancementManager()
							.getAdvancement(new ResourceLocation("lepidodendron:pf_adv_complete_cretaceous_late"))).isDone()) {
				if (PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 10, true).equalsIgnoreCase("true")) {
					if (event.getEntityPlayer() instanceof EntityPlayerMP) {
						//ModTriggers.COMPLETE_CRETACEOUS_LATE.trigger((EntityPlayerMP) event.getEntityPlayer());
					}
				}
			}
			if (!((EntityPlayerMP) event.getEntityPlayer()).getAdvancements()
					.getProgress(((WorldServer) event.getEntityPlayer().world).getAdvancementManager()
							.getAdvancement(new ResourceLocation("lepidodendron:pf_adv_complete_paleogene"))).isDone()) {
				if (PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 11, true).equalsIgnoreCase("true")) {
					if (event.getEntityPlayer() instanceof EntityPlayerMP) {
						//ModTriggers.COMPLETE_PALEOGENE.trigger((EntityPlayerMP) event.getEntityPlayer());
					}
				}
			}
			if (!((EntityPlayerMP) event.getEntityPlayer()).getAdvancements()
					.getProgress(((WorldServer) event.getEntityPlayer().world).getAdvancementManager()
							.getAdvancement(new ResourceLocation("lepidodendron:pf_adv_complete_neogene"))).isDone()) {
				if (PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 12, true).equalsIgnoreCase("true")) {
					if (event.getEntityPlayer() instanceof EntityPlayerMP) {
						//ModTriggers.COMPLETE_NEOGENE.trigger((EntityPlayerMP) event.getEntityPlayer());
					}
				}
			}
			if (!((EntityPlayerMP) event.getEntityPlayer()).getAdvancements()
					.getProgress(((WorldServer) event.getEntityPlayer().world).getAdvancementManager()
							.getAdvancement(new ResourceLocation("lepidodendron:pf_adv_complete_pleistocene"))).isDone()) {
				if (PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 13, true).equalsIgnoreCase("true")) {
					if (event.getEntityPlayer() instanceof EntityPlayerMP) {
						//ModTriggers.COMPLETE_PLEISTOCENE.trigger((EntityPlayerMP) event.getEntityPlayer());
					}
				}
			}
		}

	}

	protected RayTraceResult rayTrace(World worldIn, EntityPlayer playerIn, boolean useLiquids)
	{
		float f = playerIn.rotationPitch;
		float f1 = playerIn.rotationYaw;
		double d0 = playerIn.posX;
		double d1 = playerIn.posY + (double)playerIn.getEyeHeight();
		double d2 = playerIn.posZ;
		Vec3d vec3d = new Vec3d(d0, d1, d2);
		float f2 = MathHelper.cos(-f1 * 0.017453292F - (float)Math.PI);
		float f3 = MathHelper.sin(-f1 * 0.017453292F - (float)Math.PI);
		float f4 = -MathHelper.cos(-f * 0.017453292F);
		float f5 = MathHelper.sin(-f * 0.017453292F);
		float f6 = f3 * f4;
		float f7 = f2 * f4;
		double d3 = playerIn.getEntityAttribute(EntityPlayer.REACH_DISTANCE).getAttributeValue();
		Vec3d vec3d1 = vec3d.add((double)f6 * d3, (double)f5 * d3, (double)f7 * d3);
		return worldIn.rayTraceBlocks(vec3d, vec3d1, useLiquids, !useLiquids, false);
	}

	protected RayTraceResult RayTraceResultFromSubmarine(World worldIn, EntityPlayer playerIn, Entity submarine, boolean useLiquids)
	{
		float f = playerIn.rotationPitch;
		float f1 = playerIn.rotationYaw;
		double d0 = submarine.posX;
		double d1 = submarine.posY + (double)playerIn.getEyeHeight();
		double d2 = submarine.posZ;
		Vec3d vec3d = new Vec3d(d0, d1, d2);
		float f2 = MathHelper.cos(-f1 * 0.017453292F - (float)Math.PI);
		float f3 = MathHelper.sin(-f1 * 0.017453292F - (float)Math.PI);
		float f4 = -MathHelper.cos(-f * 0.017453292F);
		float f5 = MathHelper.sin(-f * 0.017453292F);
		float f6 = f3 * f4;
		float f7 = f2 * f4;
		double d3 = 8.0D; //reach distance changed from 5 to 8
		Vec3d vec3d1 = vec3d.add((double)f6 * d3, (double)f5 * d3, (double)f7 * d3);
		return worldIn.rayTraceBlocks(vec3d, vec3d1, useLiquids, !useLiquids, false);
	}

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void onUseBook2(PlayerInteractEvent.RightClickItem event) {
		if (!event.getItemStack().getItem().getRegistryName().toString().equalsIgnoreCase("patchouli:guide_book")) {
			return;
		}
		if (event.getItemStack().getTagCompound() != null) {
			if (!event.getItemStack().getTagCompound().toString().contains("lepidodendron:paleopedia")) {
				return;
			}
			event.setCanceled(true);
			return;
		}
	}

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void onUseBook(PlayerInteractEvent.RightClickBlock event) {

		// click on blocks:
		if (!event.getItemStack().getItem().getRegistryName().toString().equalsIgnoreCase("patchouli:guide_book")) {
			return;
		}
		if (event.getItemStack().getTagCompound() != null) {
			if (!event.getItemStack().getTagCompound().toString().contains("lepidodendron:paleopedia")) {
				return;
			}
			if (event.getEntityPlayer().isSneaking()) {
				return;
			}
			IBlockState state = event.getWorld().getBlockState(event.getPos());
			Block target = state.getBlock();

			boolean interactionResult = processBlockInteraction(event.getWorld(), event.getPos(), state, target, event.getEntityPlayer(), event.getHand());
			if (interactionResult) {
				event.setCanceled(true);
				return;
			}

		}

	}
	
	public boolean processBlockInteraction(World world, BlockPos pos, IBlockState state, Block target, EntityPlayer player, EnumHand hand) {
		//Nest info:
		if (target == BlockNest.block) {
			player.swingArm(hand);
			deliverStatsNest(world, pos, player);
			return true;
		}
		//Blocks:
		else if (target instanceof IAdvancementGranter) {
			if (player instanceof EntityPlayerMP) {
				((IAdvancementGranter)target).getModTrigger().trigger((EntityPlayerMP) player);
			}
			player.swingArm(hand);
			return true;
		}
		//Vanilla plants get specific treatment as they have not got IAdvancementGranter:
		else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNminecraft:acacia_sapling"),
				target.getPickBlock(state, new RayTraceResult(player), world, pos, player))) {
			if ((player instanceof EntityPlayerMP)) {
				ModTriggers.CLICK_ACACIA.trigger((EntityPlayerMP) player);
			}
			player.swingArm(hand);
			return true;
		}
		else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNminecraft:dark_oak_sapling"),
				target.getPickBlock(state, new RayTraceResult(player), world, pos, player))) {
			if ((player instanceof EntityPlayerMP)) {
				ModTriggers.CLICK_DARK_OAK.trigger((EntityPlayerMP) player);
			}
			player.swingArm(hand);
			return true;
		}
		else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNminecraft:oak_sapling"),
				target.getPickBlock(state, new RayTraceResult(player), world, pos, player))) {
			if ((player instanceof EntityPlayerMP)) {
				ModTriggers.CLICK_OAK.trigger((EntityPlayerMP) player);
			}
			player.swingArm(hand);
			return true;
		}
		else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNminecraft:spruce_sapling"),
				target.getPickBlock(state, new RayTraceResult(player), world, pos, player))) {
			if ((player instanceof EntityPlayerMP)) {
				ModTriggers.CLICK_SPRUCE.trigger((EntityPlayerMP) player);
			}
			player.swingArm(hand);
			return true;
		}
		else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNminecraft:birch_sapling"),
				target.getPickBlock(state, new RayTraceResult(player), world, pos, player))) {
			if ((player instanceof EntityPlayerMP)) {
				ModTriggers.CLICK_BIRCH.trigger((EntityPlayerMP) player);
			}
			player.swingArm(hand);
			return true;
		}
		else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNminecraft:jungle_sapling"),
				target.getPickBlock(state, new RayTraceResult(player), world, pos, player))) {
			if ((player instanceof EntityPlayerMP)) {
				ModTriggers.CLICK_JUNGLE.trigger((EntityPlayerMP) player);
			}
			player.swingArm(hand);
			return true;
		}
		else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNminecraft:small_fern"),
				target.getPickBlock(state, new RayTraceResult(player), world, pos, player))
				|| OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNminecraft:large_fern"),
				target.getPickBlock(state, new RayTraceResult(player), world, pos, player))) {
			if ((player instanceof EntityPlayerMP)) {
				ModTriggers.CLICK_FERN.trigger((EntityPlayerMP) player);
			}
			player.swingArm(hand);
			return true;
		}
		return false;
	}
	
	public void deliverStatsEntity(PlayerInteractEvent.EntityInteract event) {
		String agePercent = "";
		double maxHealth = 0;
		double actualHealth = 0;
		String nestString = "";

		DecimalFormat df = new DecimalFormat("###.#");
		if (event.getTarget() instanceof EntityPrehistoricFloraAgeableBase) {
			agePercent = df.format(Math.floor(((EntityPrehistoricFloraAgeableBase)event.getTarget()).getAgeScale() * 100F)) + "%";
		}
		else {
			agePercent = "100%";
		}
		if (event.getTarget() instanceof EntityLivingBase) {
			maxHealth = ((EntityLivingBase) event.getTarget()).getMaxHealth();
			actualHealth = ((EntityLivingBase) event.getTarget()).getHealth();
		}
		nestString = getNestString(event.getTarget(), true);

		if (event.getWorld().isRemote) {
			event.getEntityPlayer().sendMessage(new TextComponentString(event.getTarget().getName() + " aged: " + agePercent + " health: " + df.format(actualHealth) + "/" + df.format(maxHealth) + " (" + Math.ceil((actualHealth/maxHealth) * 100) + "%)" + nestString));
		}
	}

	public static String getHomingString(Entity entity, boolean click) {

		String homingString = "";

		if (entity instanceof EntityPrehistoricFloraLandBase) {
			if (((EntityPrehistoricFloraLandBase) entity).homesToNest()) {
				homingString = "Returns to its nest at certain times.";
			}
		}
		return homingString;
	}

	public static String getNestString(Entity entity, boolean click) {

		String nestString = "";
		BlockPos nestPos = null;
		if (entity instanceof EntityPrehistoricFloraScorpion
				|| entity instanceof EntityPrehistoricFloraEramoscorpius
				|| entity instanceof EntityPrehistoricFloraPraearcturus) {
			nestString = " carries eggs";
		}
		else if (entity instanceof EntityPrehistoricFloraLandBase) {
			if (((EntityPrehistoricFloraLandBase) entity).createPFChild(((EntityPrehistoricFloraLandBase) entity)) != null) {
				nestString = " gives birth to live young";
			}
			else if (((EntityPrehistoricFloraLandBase) entity).hasNest()
					|| ((EntityPrehistoricFloraLandBase) entity).isNestMound()) {
				if (((EntityPrehistoricFloraLandBase) entity).isNestMound()) {
					nestString = " lays eggs into mounds in blocks";
				}
				else if (((EntityPrehistoricFloraLandBase) entity).dropsEggs()) {
					nestString = " drops egg items";
				}
				else {
					if (click) {
						nestPos = ((EntityPrehistoricFloraLandBase) entity).getNestLocation();
						if (nestPos != null
								&& ((EntityPrehistoricFloraLandBase) entity).hasNest()
								&& !((EntityPrehistoricFloraLandBase) entity).isNestMound()) {
							nestString = " has nest at " + nestPos.getX() + " " + nestPos.getY() + " " + nestPos.getZ();
						} else {
							nestString = " with no known nest";
						}
					}
					else {
						if (((EntityPrehistoricFloraLandBase) entity).placesNest()
							&& (!((EntityPrehistoricFloraLandBase) entity).isNestMound())) {
							nestString = " if it has no nest, places a new nest along with its eggs when it lays";
						}
						else {
							nestString = " requires a nest to lay into";
						}
					}
				}
			}
			else if (((EntityPrehistoricFloraLandBase) entity).dropsEggs()) {
				nestString = " drops egg items";
			}
			else if (((EntityPrehistoricFloraLandBase) entity).laysEggs()) {
				if (((EntityPrehistoricFloraLandBase) entity).noMossEggs()) {
					nestString = " lays eggs into rotten wood";
				}
				else {
					nestString = " lays eggs into mosses, selaginella and rotten wood";
				}
			}
			else if (((EntityPrehistoricFloraLandBase) entity).isNestMound()) {
				nestString = " lays eggs into mounds in blocks";
			}
			else {
				nestString = " lays eggs in water";
			}
			if (((EntityPrehistoricFloraLandBase) entity).breedPNVariantsMatch() == -1) {
				nestString = nestString + ". Requires male-female to breed.";
			}
		}
		else {
			if (entity instanceof EntityPrehistoricFloraAgeableBase) {
				if (((EntityPrehistoricFloraAgeableBase) entity).createPFChild(((EntityPrehistoricFloraAgeableBase) entity)) != null) {
					nestString = " gives birth to live young";
				}
				else if (((EntityPrehistoricFloraAgeableBase) entity).dropsEggs()) {
					nestString = " drops egg items";
				}
				else if (((EntityPrehistoricFloraAgeableBase) entity).isNestMound()) {
					nestString = " lays eggs into mounds in blocks";
				}
				else if (((EntityPrehistoricFloraAgeableBase) entity).hasNest()) {
					if (((EntityPrehistoricFloraAgeableBase) entity).placesNest()
							&& (!((EntityPrehistoricFloraAgeableBase) entity).isNestMound())) {
						nestString = " if it has no nest, places a new nest along with its eggs when it lays";
					}
					else {
						nestString = " requires a nest to lay into";
					}
				}
				else {
					nestString = " lays eggs in water";
				}
				if (((EntityPrehistoricFloraAgeableBase) entity).breedPNVariantsMatch() == -1) {
					nestString = nestString + ". Requires male-female to breed.";
				}
			}
			else if (entity instanceof EntityPrehistoricFloraTrilobiteBottomBase) {
				if (((EntityPrehistoricFloraTrilobiteBottomBase) entity).dropsEggs()) {
					nestString = " drops egg items";
				}
				else {
					nestString = " lays eggs in water";
				}
				if (((EntityPrehistoricFloraTrilobiteBottomBase) entity).breedPNVariantsMatch() == -1) {
					nestString = nestString + ". Requires male-female to breed.";
				}
			}
			else if (entity instanceof EntityPrehistoricFloraTrilobiteSwimBase) {
				if (((EntityPrehistoricFloraTrilobiteSwimBase) entity).dropsEggs()) {
					nestString = " drops egg items";
				}
				else {
					nestString = " lays eggs in water";
				}
				if (((EntityPrehistoricFloraTrilobiteSwimBase) entity).breedPNVariantsMatch() == -1) {
					nestString = nestString + ". Requires male-female to breed.";
				}
			}
			else if (entity instanceof EntityPrehistoricFloraCrawlingFlyingInsectBase) {
				if (((EntityPrehistoricFloraCrawlingFlyingInsectBase) entity).dropsEggs()) {
					nestString = " drops egg items";
				}
				else {
					nestString = " lays eggs into mosses, selaginella and rotten wood";
				}
				if (((EntityPrehistoricFloraCrawlingFlyingInsectBase) entity).breedPNVariantsMatch() == -1) {
					nestString = nestString + ". Requires male-female to breed.";
				}
			}
			else if (entity instanceof EntityPrehistoricFloraFishBase) {
				if (((EntityPrehistoricFloraFishBase) entity).dropsEggs()) {
					nestString = " drops egg items";
				}
				else {
					nestString = " lays eggs in water";
				}
				if (((EntityPrehistoricFloraFishBase) entity).breedPNVariantsMatch() == -1) {
					nestString = nestString + ". Requires male-female to breed.";
				}
			}
			else if (entity instanceof EntityPrehistoricFloraInsectFlyingBase) {
				if (((EntityPrehistoricFloraInsectFlyingBase) entity).dropsEggs()) {
					nestString = " drops egg items";
				}
				else if (!((EntityPrehistoricFloraInsectFlyingBase) entity).laysInBlock()) {
					nestString = " lays eggs in water";
				}
				else {
					nestString = " lays eggs into mosses, selaginella and rotten wood";
				}
				if (((EntityPrehistoricFloraInsectFlyingBase) entity).breedPNVariantsMatch() == -1) {
					nestString = nestString + ". Requires male-female to breed.";
				}
			}
			else if (entity instanceof EntityPrehistoricFloraJellyfishBase) {
				if (((EntityPrehistoricFloraJellyfishBase) entity).dropsEggs()) {
					nestString = " drops egg items";
				}
				else {
					nestString = " lays eggs in water";
				}
				if (((EntityPrehistoricFloraJellyfishBase) entity).breedPNVariantsMatch() == -1) {
					nestString = nestString + ". Requires male-female to breed.";
				}
			}
			else if (entity instanceof EntityPrehistoricFloraSlitheringWaterBase) {
				if (((EntityPrehistoricFloraSlitheringWaterBase) entity).dropsEggs()) {
					nestString = " drops egg items";
				}
				else {
					nestString = " lays eggs in water";
				}
				if (((EntityPrehistoricFloraSlitheringWaterBase) entity).breedPNVariantsMatch() == -1) {
					nestString = nestString + ". Requires male-female to breed.";
				}
			}
		}
		if (!click) {
			nestString = nestString.trim();
			nestString = nestString.substring(0, 1).toUpperCase(Locale.ROOT) + nestString.substring(1);
		}
		return nestString;
	}

	public void deliverStatsNest(World world, BlockPos pos, EntityPlayer player) {
		String nestOwner = "nobody";
		IBlockState state = world.getBlockState(pos);
		Block target = state.getBlock();
		if (target == BlockNest.block) {
			String nestType = "";
			TileEntity tileEntity = world.getTileEntity(pos);
			if (tileEntity != null) {
				if (tileEntity.getTileData().hasKey("creature")) {
					nestType = tileEntity.getTileData().getString("creature");
				}
			}

			if (!nestType.equals("")) {
				//Get the mob:
				nestType = nestType.replace("lepidodendron:", "");
				nestOwner = I18n.translateToLocal("entity." + nestType + ".name").trim();
			}
			else {
				nestOwner = "nobody";
			}
		}
		else {
			nestOwner = "nobody";
		}
		if (world.isRemote) {
			player.sendMessage(new TextComponentString("Nest belonging to " + nestOwner));
		}
	}

	@SubscribeEvent
	public void onUseBook(PlayerInteractEvent.EntityInteract event) {
		// click on entities:
		if (!event.getItemStack().getItem().getRegistryName().toString().equalsIgnoreCase("patchouli:guide_book")) {
			return;
		}
		if (event.getItemStack().getTagCompound() != null) {
			if (!event.getItemStack().getTagCompound().toString().contains("lepidodendron:paleopedia")) {
				return;
			}

			Entity entityClicked = event.getTarget();
			if (entityClicked != null && entityClicked instanceof PrehistoricFloraSubmarine) {
				PrehistoricFloraSubmarine entityBoat = (PrehistoricFloraSubmarine) entityClicked;
				if (event.getEntityPlayer().isRiding()) {
					if (event.getEntityPlayer().getRidingEntity() == entityBoat) {
						//We are clicking from inside a submarine:
						//Raytrace to see what we are looking at!
						RayTraceResult raytraceresult = this.RayTraceResultFromSubmarine(event.getWorld(), event.getEntityPlayer(), entityBoat, true);
						if (raytraceresult != null) {
							if (raytraceresult.typeOfHit == RayTraceResult.Type.ENTITY) {
								entityClicked = raytraceresult.entityHit;
							}
							else if (raytraceresult.typeOfHit == RayTraceResult.Type.BLOCK) {
								IBlockState state = event.getWorld().getBlockState(raytraceresult.getBlockPos());
								Block target = state.getBlock();
								boolean interactionResult = processBlockInteraction(event.getWorld(), event.getPos(), state, target, event.getEntityPlayer(), event.getHand());
								if (interactionResult) {
									event.setCanceled(true);
									return;
								}
							}
						}

					}
				}
			}

			else if (entityClicked instanceof IAdvancementGranter) {
				if (event.getEntityPlayer() instanceof EntityPlayerMP) {
					((IAdvancementGranter)(entityClicked)).getModTrigger().trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			if (entityClicked instanceof EntitySnowman) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SNOW_GOLEM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityIronGolem) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_IRON_GOLEM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityWither) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WITHER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraAmmonite_Asteroceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_ASTEROCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAmmonite_Ceratites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_CERATITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAmmonite_Coroniceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_CORONICERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAmmonite_Cylolobus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_CYLOLOBUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAmmonite_Dactylioceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_DACTYLIOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAmmonite_Goniatites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_GONIATITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAmmonite_Manticoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_MANTICOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAmmonite_Pachydesmoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_PACHYDESMOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAmmonite_Pachydiscus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_PACHYDISCUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAmmonite_Parapuzosia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_PARAPUZOSIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAmmonite_Titanites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_TITANITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAnteosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANTEOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAnthracomedusa) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANTHRACOMEDUSA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAphetoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_APHETOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraArandaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARANDASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraArthropleura) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARTHROPLEURA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAsaphus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ASAPHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAscendonanus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ASCENDONANUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAttercopus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ATTERCOPUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAulacephalodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AULACEPHALODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBalanerpeton ) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BALANERPETON .trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBandringa) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BANDRINGA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBanffia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BANFFIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBarbclabornia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BARBCLABORNIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBasiloceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BASILOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBatofasciculus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BATOFASCICULUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBelantsea) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BELANTSEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBranchiosaur) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRANCHIOSAUR.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBunostegos) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BUNOSTEGOS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBushizheia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BUSHIZHEIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCalvapilosa) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CALVAPILOSA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCambroraster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAMBRORASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCameroceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAMEROCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCampbellodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAMPBELLODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCanadaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CANADASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCanadia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CANADIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCaptorhinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAPTORHINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCarcinosoma) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CARCINOSOMA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCarolowilhelmina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAROLOWILHELMINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCasineria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CASINERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCephalaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CEPHALASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCheirurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHEIRURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCheloniellon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHELONIELLON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCothurnocystis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COTHURNOCYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHurdia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HURDIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCrassigyrinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRASSIGYRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCrotalocephalus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CROTALOCEPHALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCyclonema) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYCLONEMA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCyrtoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYRTOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDalmanites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DALMANITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDasyceps) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DASYCEPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDatheosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DATHEOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDiania) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIANIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDickinsonia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICKINSONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDidymograptus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIDYMOGRAPTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDiplocaulus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIPLOCAULUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDiploceraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIPLOCERASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDracopristis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DRACOPRISTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDrotops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DROTOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDunkleosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DUNKLEOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDvinosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DVINOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraElginia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ELGINIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraEllipsocephalus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ELLIPSOCEPHALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraElrathia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ELRATHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraEndoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ENDOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraEnoploura) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ENOPLOURA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraEoandromeda) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EOANDROMEDA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraEoraptor) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EORAPTOR.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraEoredlichia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EOREDLICHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraEosaurichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EOSAURICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraEricixerxes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ERICIXERXES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraEstemmenosuchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ESTEMMENOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraEurypterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EURYPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraFurcaster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FURCASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGemmactena) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GEMMACTENA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGemuendina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GEMUENDINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGephyrostegus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GEPHYROSTEGUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGonioceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GONIOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHaikouichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HAIKOUICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHallucigenia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HALLUCIGENIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHarvestman) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HARVESTMAN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHelenodora) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELENODORA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHelianthaster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELIANTHASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHeliopeltis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELIOPELTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHelicoprion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELICOPRION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHelmetia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELMETIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHeterosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HETEROSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHibbertopterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HIBBERTOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHungioides) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HUNGIOIDES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraIchthyostega) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ICHTHYOSTEGA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraInostrancevia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_INOSTRANCEVIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraIsotelus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ISOTELUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraItalophlebia
					|| entityClicked instanceof EntityPrehistoricFloraItalophlebiaNymph) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ITALOPHLEBIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraJaekelopterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JAEKELOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraJianshanopodia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JIANSHANOPODIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraKaibabvenator) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KAIBABVENATOR.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraKalbarria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KALBARRIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraKerygmachela) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KERYGMACHELA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraKimberella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KIMBERELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraKodymirus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KODYMIRUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraKokomopterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KOKOMOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLabidosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LABIDOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLanceaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LANCEASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLiliensternus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LILIENSTERNUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLituites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LITUITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLunaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LUNASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLunataspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LUNATASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLungmenshanaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LUNGMENSHANASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLyrarapax) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LYRARAPAX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMaclurina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MACLURINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMarrella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MARRELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMastodonsaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MASTODONSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMegalocephalus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGALOCEPHALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMegalograptus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGALOGRAPTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMegarachne) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGARACHNE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMenaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MENASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMesosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MESOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMetaspriggina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_METASPRIGGINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMicrodictyon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MICRODICTYON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMimetaster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MIMETASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMonograptus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MONOGRAPTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMontecaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MONTECARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAngustidontus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANGUSTIDONTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCowielepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COWIELEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraNectocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NECTOCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraOdaraia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ODARAIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraOdontogriphus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ODONTOGRIPHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraOmnidens) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OMNIDENS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraOpabinia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OPABINIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraOrthoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ORTHOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraOrthrozanclus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ORTHROZANCLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraOttoia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OTTOIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPagea) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PAGEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			
			else if (entityClicked instanceof EntityPrehistoricFloraPalaeoisopus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEOISOPUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPalaeontinid) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEONTINID.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPanderodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PANDERODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPantylus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PANTYLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraParadoxides) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARADOXIDES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraParvancorina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARVANCORINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPaucipodia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PAUCIPODIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPederpes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PEDERPES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPhanerotinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHANEROTINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPhantaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHANTASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPhlegethontia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHLEGETHONTIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPhragmoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHRAGMOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPikaia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PIKAIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPlacerias) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLACERIAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPlateosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLATEOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPlatyhystrix) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLATYHYSTRIX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPoleumita) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_POLEUMITA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPomatrum) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_POMATRUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPrionosuchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PRIONOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraProburnetia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROBURNETIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraProcynosuchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROCYNOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			/*
			else if (entityClicked instanceof EntityPrehistoricFloraPromissum) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROMISSUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			 */
			else if (entityClicked instanceof EntityPrehistoricFloraProterogyrinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTEROGYRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraProtorosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTOROSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraProtozygoptera
					|| entityClicked instanceof EntityPrehistoricFloraProtozygopteraNymph) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTOZYGOPTERA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPteraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PTERASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPterygotus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PTERYGOTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraQilinyu) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_QILINYU.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraRayonnoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RAYONNOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraRemigiomontanus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_REMIGIOMONTANUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraRetifacies) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RETIFACIES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraRhizodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RHIZODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSaivodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SAIVODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSaurichthysMarine) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SAURICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSaurichthysFreshwater) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SAURICHTHYS_FRESHWATER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSchinderhannes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCHINDERHANNES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraScorpion_Gigantoscorpio) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCORPION_GIGANTOSCORPIO.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraScorpion_Gondwanascorpio) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCORPION_GONDWANASCORPIO.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraScorpion_Opsieobuthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCORPION_OPSIEOBUTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraScorpion_Pulmonoscorpius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCORPION_PULMONOSCORPIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSelenopeltis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SELENOPELTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSeymouria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SEYMOURIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraShonisaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SHONISAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSiberion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SIBERION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSpathicephalus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPATHICEPHALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSpiniplatyceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPINIPLATYCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSpinoaequalis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPINOAEQUALIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSpriggina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPRIGGINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSuminia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SUMINIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSynophalos) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SYNOPHALOS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTapinocephalus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TAPINOCEPHALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTegopelte) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TEGOPELTE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTemperoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TEMPEROCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTerataspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TERATASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTetragraptus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TETRAGRAPTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTitanichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TITANICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTiarajudens) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TIARAJUDENS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTokummia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TOKUMMIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTrimerus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIMERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraUrosthenes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_UROSTHENES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraVestinautilus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VESTINAUTILUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraVetulicola) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VETULICOLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraWalliserops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WALLISEROPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraWebsteroprion
				|| entityClicked instanceof EntityPrehistoricFloraWebsteroprionHole) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WEBSTEROPRION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraWhatcheeria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WHATCHEERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraWiwaxia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WIWAXIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraXenusion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_XENUSION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraYawunik) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YAWUNIK.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraYilingia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YILINGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraYorgia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YORGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraYunnanozoon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YUNNANOZOON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLochmanolenellus) {
			if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
				ModTriggers.CLICK_LOCHMANOLENELLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
			}
			event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
			event.setCanceled(true);
			return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraCalvapilosa) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CALVAPILOSA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraDrotops) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DROTOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraHeliopeltis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HELIOPELTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraLanceaspis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LANCEASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraMontecaris) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_MONTECARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraRhenocystis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_RHENOCYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraWillwerathia) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_WILLWERATHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraParmastega) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PARMASTEGA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraTiktaalik) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TIKTAALIK.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraPygopterus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PYGOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraDeltoptychius) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DELTOPTYCHIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraParatarrasius) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PARATARRASIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraSyllipsimopodi) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SYLLIPSIMOPODI.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraTyrannophontes) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TYRANNOPHONTES.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraUrocordylus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_UROCORDYLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraEdaphosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_EDAPHOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraRubidgea) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_RUBIDGEA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraEndothiodon) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ENDOTHIODON.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
			else if (entityClicked instanceof EntityPrehistoricFloraYinlong) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YINLONG.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
		else if (entityClicked instanceof EntityPrehistoricFloraSaltriovenator) {
			if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
				ModTriggers.CLICK_SALTRIOVENATOR.trigger((EntityPlayerMP) event.getEntityPlayer());
			}
			event.getEntityPlayer().swingArm(event.getHand());
			deliverStatsEntity(event);
			event.setCanceled(true);
			return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraAustrolimulus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_AUSTROLIMULUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraBeishanichthys) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BEISHANICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraBirgeria) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BIRGERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraCaturus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CATURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraChinlea) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CHINLEA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraForeyia) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_FOREYIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraHybodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HYBODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraPotanichthys) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_POTANICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraAeger) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_AEGER.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraAulacoceras) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_AULACOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraBesanosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BESANOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraCartorhynchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CARTORHYNCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraCyamodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CYAMODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraCymbospondylus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CYMBOSPONDYLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraEorhynchochelys) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_EORHYNCHOCHELYS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraEretmorhipis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_eretmorhipis.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraHenodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HENODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraLimulid) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LIMULID.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraNothosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_NOTHOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraOpolanka) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_OPOLANKA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraPanzhousaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PANZHOUSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraSclerocormus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SCLEROCORMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraTriadobatrachus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TRIADOBATRACHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraYunguisaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_YUNGUISAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraArizonasaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ARIZONASAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraAtopodentatus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ATOPODENTATUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraBatrachotomus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BATRACHOTOMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraDesmatosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DESMATOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraDoswellia) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DOSWELLIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraDrepanosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DREPANOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraEffigia) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_EFFIGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraErythrosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ERYTHROSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraEusaurosphargis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_EUSAUROSPHARGIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraGerrothorax) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_GERROTHORAX.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraHypsognathus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HYPSOGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraHypuronector) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HYPURONECTOR.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraLagosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LAGOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraLessemsaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LESSEMSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraOrnithosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ORNITHOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraTeleocrater) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TELEOCRATER.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraPoposaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_POPOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraPostosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_POSTOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraProganochelys) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PROGANOCHELYS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
			else if (entityClicked instanceof EntityPrehistoricFloraScheenstia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCHEENSTIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
		else if (entityClicked instanceof EntityPrehistoricFloraPseudotherium) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PSEUDOTHERIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraSaurosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SAUROSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraRutiodon) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_RUTIODON.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraScleromochlus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SCLEROMOCHLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraSharovipteryx) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SHAROVIPTERYX.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraSilesaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SILESAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraSillosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SILLOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraSmok) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SMOK.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraSphenotitan) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SPHENOTITAN.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraStanocephalosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_STANOCEPHALOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraTanystropheus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TANYSTROPHEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraTeraterpeton) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TERATERPETON.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraTeyujagua) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TEYUJAGUA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraThecodontosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_THECODONTOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraXinpusaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_XINPUSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraItalophlebia) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ITALOPHLEBIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraNagini) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_NAGINI.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraBrachydectes) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BRACHYDECTES.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraLysorophus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LYSOROPHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (entityClicked instanceof EntityPrehistoricFloraParhybodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
			ModTriggers.CLICK_PARHYBODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
			else if (entityClicked instanceof EntityPrehistoricFloraLandSnail) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SNAIL_LAND.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSpiniplatyceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPINIPLATYCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraNipponomaria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NIPPONOMARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
//			else if (entityClicked instanceof EntityPrehistoricFloraPalaeodictyoptera_Dunbaria) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_PALAEODICTYOPTERA_DUNBARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
//			else if (entityClicked instanceof EntityPrehistoricFloraPalaeodictyoptera_Homaloneura) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_PALAEODICTYOPTERA_HOMALONEURA.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
//			else if (entityClicked instanceof EntityPrehistoricFloraPalaeodictyoptera_Homoioptera) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_PALAEODICTYOPTERA_HOMOIOPTERA.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
//			else if (entityClicked instanceof EntityPrehistoricFloraPalaeodictyoptera_Lithomantis) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_PALAEODICTYOPTERA_LITHOMANTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
//			else if (entityClicked instanceof EntityPrehistoricFloraPalaeodictyoptera_Lycocercus) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_PALAEODICTYOPTERA_LYCOCERCUS.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
//			else if (entityClicked instanceof EntityPrehistoricFloraPalaeodictyoptera_Sinodunbaria) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_PALAEODICTYOPTERA_SINODUNBARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
//			else if (entityClicked instanceof EntityPrehistoricFloraPalaeodictyoptera_Stenodictya) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_PALAEODICTYOPTERA_STENODICTYA.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
			else if (entityClicked instanceof EntityPrehistoricFloraParapeytoia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARAPEYTOIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPhragmoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHRAGMOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLituites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LITUITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCidaroida) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CIDAROIDA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraArchaeocidaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCHAEOCIDARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraWillwerathia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WILLWERATHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraTitanoptera) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					switch (((EntityPrehistoricFloraTitanoptera)entityClicked).getPNType()) {
						case CLATROTITAN: default:
							ModTriggers.CLICK_TITANOPTERA_CLATROTITAN.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case GIGATITAN:
							ModTriggers.CLICK_TITANOPTERA_GIGATITAN.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case MESOTITAN:
							ModTriggers.CLICK_TITANOPTERA_MESOTITAN.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;
					}
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraSkeemella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SKEEMELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraArctinurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCTINURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraOgyginus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OGYGINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraUralichas) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_URALICHAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBarameda) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BARAMEDA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAscoceras
					//|| entityClicked instanceof EntityPrehistoricFloraAscoceras_Baby
				) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ASCOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAmpyx) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMPYX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBohemoharpes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BOHEMOHARPES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCassinoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CASSINOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraChotecops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHOTECOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHarpes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HARPES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLonchodomas) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LONCHODOMAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraNahecaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NAHECARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPlectodiscus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLECTODISCUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraWeinbergina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WEINBERGINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraWingertshellicus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WINGERTSHELLICUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMegalosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGALOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAspidorhynchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ASPIDORHYNCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraArduafrons) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARDUAFRONS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAphnelepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_APHNELEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAetheolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AETHEOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMacromesodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MACROMESODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraOphthalmosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OPHTHALMOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraEryon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ERYON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAdamanteryon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ADAMANTERYON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraNotidanoides) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NOTIDANOIDES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraEugaleaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EUGALEASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDunyu) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DUNYU.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLasanius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LASANIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraEastmanosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EASTMANOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraIvoites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_IVOITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBundenbachiellus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BUNDENBACHIELLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSphooceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPHOOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPituriaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PITURIASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraNeeyambaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NEEYAMBASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBalhuticaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BALHUTICARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraVachonisia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VACHONISIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			
			else if (entityClicked instanceof EntityPrehistoricFloraFurca) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FURCA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTomlinsonus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TOMLINSONUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraMiguashaia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MIGUASHAIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCometicercus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COMETICERCUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraOxyosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OXYOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTegeolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TEGEOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGooloogongia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GOOLOOGONGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraWarneticaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WARNETICARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSchugurocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCHUGUROCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCeratiocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CERATIOCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDiplacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIPLACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraClimatius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLIMATIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraNerepisacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NEREPISACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGriphognathus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GRIPHOGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraConcavicaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CONCAVICARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGogonasus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GOGONASUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraFallacosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FALLACOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraRolfosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ROLFOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCamuropiscis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAMUROPISCIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCtenurella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CTENURELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraRhamphodopsis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RHAMPHODOPSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGoodradigbeeon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GOODRADIGBEEON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDraconichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DRACONICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMaterpiscis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MATERPISCIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraBrindabellaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRINDABELLASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraWuttagoonaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WUTTAGOONASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraKujdanowiaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KUJDANOWIASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPhyllolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHYLLOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCowralepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COWRALEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGymnotrachelus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GYMNOTRACHELUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBungartius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BUNGARTIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraRhadinacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RHADINACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHadronector) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HADRONECTOR.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraThrissops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THRISSOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}


			else if (entityClicked instanceof EntityPrehistoricFloraMuensterella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MUENSTERELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAsteracanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ASTERACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTurboscinetes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TURBOSCINETES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPiranhamesodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PIRANHAMESODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraRedfieldius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_REDFIELDIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLeptolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPTOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLepidotes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPIDOTES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDollocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DOLLOCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraEntelognathus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ENTELOGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraSilurolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SILUROLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSilesaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SILESAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraKentrosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KENTROSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraStethacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STETHACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHualianceratops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HUALIANCERATOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPanguraptor) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PANGURAPTOR.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraXuanhuaceratops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_XUANHUACERATOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraMyriacantherpestes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MYRIACANTHERPESTES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGuiyu) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GUIYU.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMegamastax) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGAMASTAX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMegateuthis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGATEUTHIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPassaloteuthis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PASSALOTEUTHIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSclerodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCLERODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAthenaegis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ATHENAEGIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTauraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TAURASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraParameteoraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARAMETEORASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPolybranchiaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_POLYBRANCHIASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPhialaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHIALASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPhlebolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHLEBOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGyrosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GYROSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSqualoraja) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SQUALORAJA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGyrodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GYRODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraJamoytius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JAMOYTIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPezopallichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PEZOPALLICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}


			else if (entityClicked instanceof EntityPrehistoricFloraBelonostomusJurassic) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BELONOSTOMUS_JURASSIC.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBelonostomusCretaceous) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BELONOSTOMUS_CRETACEOUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTamisiocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TAMISIOCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSanctacaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SANCTACARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCordaticaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CORDATICARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGreererpeton) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GREERERPETON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraZenaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ZENASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraParamblypterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARAMBLYPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraVillebrunaster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VILLEBRUNASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDecacuminaster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DECACUMINASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDicranurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICRANURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraThanahita) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THANAHITA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLepidaster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPIDASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSaccocoma) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SACCOCOMA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraVampyronassa) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VAMPYRONASSA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraProteroctopus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTEROCTOPUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPsychopyge) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PSYCHOPYGE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraKosmoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KOSMOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraElephantoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ELEPHANTOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAnaethalion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANAETHALION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraQuasimodichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_QUASIMODICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraElasmodectes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ELASMODECTES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPromexyele) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROMEXYELE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPapilionichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PAPILIONICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraRainerichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RAINERICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHovasaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HOVASAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSibyrhynchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SIBYRHYNCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMarmolatella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MARMOLATELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraViviparus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VIVIPARUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraStahleckeria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STAHLECKERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraRutgersella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RUTGERSELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDakosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DAKOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDuslia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DUSLIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCowielepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COWIELEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraProterosuchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTEROSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMetopacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_METOPACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCancrinos) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CANCRINOS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMurex) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MUREX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLeviathania) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEVIATHANIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHarpagodes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HARPAGODES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraNerinea) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NERINEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraCiurcopterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CIURCOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSlimonia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SLIMONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraStrombus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STROMBUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBishanopliosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BISHANOPLIOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPlectronoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLECTRONOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAngelina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANGELINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPlatypeltoides) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLATYPELTOIDES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTribrachiodemas) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIBRACHIODEMAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMegistaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGISTASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHelenodora) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELENODORA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCarolinites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAROLINITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPricyclopyge) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PRICYCLOPYGE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSymphysops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SYMPHYSOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraEuspira) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EUSPIRA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHarpacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HARPACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTyphloesus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TYPHLOESUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGephyrostegus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GEPHYROSTEGUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraRhomaleosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RHOMALEOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraUtatsusaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_UTATSUSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCongophiopsis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CONGOPHIOPSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraOphiopsis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OPHIOPSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCiurcopterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CIURCOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraRhenocystis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RHENOCYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDragonfly) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DRAGONFLY.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDendrocystites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DENDROCYSTITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSyringocrinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SYRINGOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraIowacystis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_IOWACYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTemnodontosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TEMNODONTOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPropterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPseudorhina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PSEUDORHINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraChunerpeton) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHUNERPETON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDocodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DOCODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHomoeosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HOMOEOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPhorcynis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHORCYNIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLibys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LIBYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraOreochima) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OREOCHIMA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraOstenocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OSTENOCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraKalligrammatid) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					switch (((EntityPrehistoricFloraKalligrammatid)entityClicked).getPNType()) {
						case ABRIGRAMMA: default:
							ModTriggers.CLICK_KALLIGRAMMATID_ABRIGRAMMA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case APOCHRYSOGRAMMA:
							ModTriggers.CLICK_KALLIGRAMMATID_APOCHRYSOGRAMMA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case KALLIGRAMMA:
							ModTriggers.CLICK_KALLIGRAMMATID_KALLIGRAMMA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case MEIONEURITES:
							ModTriggers.CLICK_KALLIGRAMMATID_MEIONEURITES.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case HUIYINGOGRAMMA:
							ModTriggers.CLICK_KALLIGRAMMATID_HUIYINGOGRAMMA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case LIASSOPSYCHOPS:
							ModTriggers.CLICK_KALLIGRAMMATID_LIASSOPSYCHOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case MAKARKINIA:
							ModTriggers.CLICK_KALLIGRAMMATID_MAKARKINIA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case OREGRAMMA:
							ModTriggers.CLICK_KALLIGRAMMATID_OREGRAMMA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case ITHIGRAMMA:
							ModTriggers.CLICK_KALLIGRAMMATID_ITHIGRAMMA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;
						case SOPHOGRAMMA:
							ModTriggers.CLICK_KALLIGRAMMATID_SOPHOGRAMMA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

					}
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLacewing) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					switch (((EntityPrehistoricFloraLacewing)entityClicked).getPNType()) {
						case AETHEOGRAMMA: default:
							ModTriggers.CLICK_LACEWING_AETHEOGRAMMA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case CRETAPSYCHOPS:
							ModTriggers.CLICK_LACEWING_CRETAPSYCHOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case LACCOSMYLUS:
							ModTriggers.CLICK_LACEWING_LACCOSMYLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case LICHENIPOLYSTOECHOTES:
							ModTriggers.CLICK_LACEWING_LICHENIPOLYSTOECHOTES.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case BELLINYMPHA:
							ModTriggers.CLICK_LACEWING_BELLINYMPHA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case GRAMMOLINGIA:
							ModTriggers.CLICK_LACEWING_GRAMMOLINGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

//						case OREGRAMMA:
//							ModTriggers.CLICK_KALLIGRAMMATID_OREGRAMMA.trigger((EntityPlayerMP) event.getEntityPlayer());
//							break;
//
//						case ITHIGRAMMA:
//							ModTriggers.CLICK_KALLIGRAMMATID_ITHIGRAMMA.trigger((EntityPlayerMP) event.getEntityPlayer());
//							break;
//						case SOPHOGRAMMA:
//							ModTriggers.CLICK_KALLIGRAMMATID_SOPHOGRAMMA.trigger((EntityPlayerMP) event.getEntityPlayer());
//							break;

					}
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
//			else if (entityClicked instanceof EntityPrehistoricFloraScorpionfly) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_SCORPIONFLY.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
			else if (entityClicked instanceof EntityPrehistoricFloraClarkeiteuthis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLARKEITEUTHIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraKaykay) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KAYKAY.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGeosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GEOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraEchinochimaera) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ECHINOCHIMAERA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraKulindadromeus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KULINDADROMEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCeratosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CERATOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMorrolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MORROLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSpiroceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPIROCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCoccoderma) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COCCODERMA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDaohugoucossus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DAOHUGOUCOSSUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTrachymetopon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRACHYMETOPON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPanacanthocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PANACANTHOCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMegasecoptera) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					switch (((EntityPrehistoricFloraMegasecoptera)entityClicked).getPNType()) {
						case SYLVOHYMEN: default:
							ModTriggers.CLICK_MEGASECOPTERA_SYLVOHYMEN.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

//						case CORYDALOIDES:
//							ModTriggers.CLICK_MEGASECOPTERA_CORYDALOIDES.trigger((EntityPlayerMP) event.getEntityPlayer());
//							break;
//
//						case MISCHOPTERA:
//							ModTriggers.CLICK_MEGASECOPTERA_MISCHOPTERA.trigger((EntityPlayerMP) event.getEntityPlayer());
//							break;
//

					}
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraThalassiodracon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THALASSIODRACON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMicrocleidus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MICROCLEIDUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraOphthalmothule) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OPHTHALMOTHULE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBobosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BOBOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraOrthocormus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ORTHOCORMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraEurhinosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EURHINOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraEocarcinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EOCARCINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHupehsuchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HUPEHSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraParnaibaia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARNAIBAIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraProtospinax) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTOSPINAX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPalaeocarcharias) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEOCARCHARIAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraUarbryichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_UARBRYICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSiderops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SIDEROPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraIsanichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ISANICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMecochirus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MECOCHIRUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSteurbautichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STEURBAUTICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraBavariscyllium) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BAVARISCYLLIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraParacestracion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARACESTRACION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraIschyodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ISCHYODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSpathobatis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPATHOBATIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMesturus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MESTURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCongopycnodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CONGOPYCNODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLigulella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LIGULELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPhillipsia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHILLIPSIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraKleptothule) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KLEPTOTHULE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHaplophrentis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HAPLOPHRENTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraParadapedium) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARADAPEDIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraKayentatherium) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KAYENTATHERIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCeltedens) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CELTEDENS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMarmorerpeton) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MARMORERPETON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraVadasaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VADASAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraShaihuludia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SHAIHULUDIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraUrsactis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_URSACTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraKootenayscolex) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KOOTENAYSCOLEX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraArchocyrtus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCHOCYRTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPhytophilaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHYTOPHILASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSongaichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SONGAICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraSaurostomus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SAUROSTOMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMacrosemius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MACROSEMIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraConodont) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					switch (((EntityPrehistoricFloraConodont)entityClicked).getPNType()) {
						case PROCONODONTUS: default:
							ModTriggers.CLICK_PROCONODONTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case OZARKODINA:
							ModTriggers.CLICK_OZARKODINA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case IOWAGNATHUS:
							ModTriggers.CLICK_IOWAGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case PROMISSUM:
							ModTriggers.CLICK_PROMISSUM.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case CLYDAGNATHUS:
							ModTriggers.CLICK_CLYDAGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case HINDEODUS:
							ModTriggers.CLICK_HINDEODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case CLARKINA:
							ModTriggers.CLICK_CLARKINA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case MISIKELLA:
							ModTriggers.CLICK_MISIKELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;


					}
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraSokkaejaecystis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SOKKAEJAECYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraPiatnitzkysaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PIATNITZKYSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGasosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GASOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTanyrhinichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TANYRHINICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAmmonite_Perisphinctes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_PERISPHINCTES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraLaidleria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LAIDLERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraNotostracan) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					switch (((EntityPrehistoricFloraNotostracan)entityClicked).getPNType()) {
						case STRUDOPS: default:
							ModTriggers.CLICK_STRUDOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case TRIOPS1:
							ModTriggers.CLICK_TRIOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case TRIOPS2:
							ModTriggers.CLICK_TRIOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case TRIOPS3:
							ModTriggers.CLICK_TRIOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;


					}
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraAngustidontus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANGUSTIDONTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraJeholotriton) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JEHOLOTRITON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraStanocephalosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STANOCEPHALOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

//			else if (entityClicked instanceof EntityPrehistoricFloraStoermeropterus) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_STOERMEROPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
			else if (entityClicked instanceof EntityPrehistoricFloraHoplitaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HOPLITASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraChasmataspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHASMATASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraOnychopterella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ONYCHOPTERELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
//			else if (entityClicked instanceof EntityPrehistoricFloraStrobilopterus) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_STROBILOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
			else if (entityClicked instanceof EntityPrehistoricFloraXinjiangchelys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_XINJIANGCHELYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGlyptops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GLYPTOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraKayentachelys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KAYENTACHELYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraThalassemys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THALASSEMYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraHuayangosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HUAYANGOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGigantspinosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GIGANTSPINOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraStegosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STEGOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTuojiangosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TUOJIANGOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraYuxisaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YUXISAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTanycolagreus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TANYCOLAGREUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraOlenellus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OLENELLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraCervifurca) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CERVIFURCA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraTorvosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TORVOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraYangchuanosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YANGCHUANOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraGlacialisaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GLACIALISAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (entityClicked instanceof EntityPrehistoricFloraSinraptor) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SINRAPTOR.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraMymoorapelta) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MYMOORAPELTA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (entityClicked instanceof EntityPrehistoricFloraDilophosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DILOPHOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}



		}
	}

}
