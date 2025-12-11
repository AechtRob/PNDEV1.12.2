package net.lepidodendron;

import net.lepidodendron.block.*;
import net.lepidodendron.entity.EntityPrehistoricFloraGuanoBall;
import net.lepidodendron.entity.EntityPrehistoricFloraMeteor;
import net.lepidodendron.entity.boats.PrehistoricFloraSubmarine;
import net.lepidodendron.entity.render.tile.RenderDisplayWallMount;
import net.lepidodendron.entity.util.*;
import net.lepidodendron.item.*;
import net.lepidodendron.item.entities.ItemBugRaw;
import net.lepidodendron.item.entities.ItemPNTaxidermyItem;
import net.lepidodendron.item.entities.ItemSquidRaw;
import net.lepidodendron.item.entities.ItemWolfRaw;
import net.lepidodendron.util.*;
import net.lepidodendron.world.WorldOverworldPortal;
import net.lepidodendron.world.biome.FishingRodDrops;
import net.lepidodendron.world.biome.precambrian.BiomePrecambrian;
import net.lepidodendron.world.gen.WorldGenVolcanoEruptableNether;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.EntityMountEvent;
import net.minecraftforge.event.entity.EntityTravelToDimensionEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingSpawnEvent;
import net.minecraftforge.event.entity.player.*;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.Phase;
import net.minecraftforge.fml.common.network.ByteBufUtils;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import vazkii.patchouli.client.book.ClientBookRegistry;
import vazkii.patchouli.common.base.PatchouliSounds;
import vazkii.patchouli.common.book.Book;
import vazkii.patchouli.common.book.BookRegistry;
import vazkii.patchouli.common.item.ItemModBook;

import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class LepidodendronEventSubscribers {

	public static ArrayList<Meteor> meteors = new ArrayList();
	public static ArrayList<Meteor> fragments = new ArrayList();
	public static ArrayList<Meteor> smoke = new ArrayList();
	public static final ResourceLocation PALEOPEDIA_PRECAMBRIAN_STATS = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_precambrian");
	public static final ResourceLocation PALEOPEDIA_PRECAMBRIAN_STATS_COMPLETED = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_precambrian_completed");
	public static final ResourceLocation PALEOPEDIA_CAMBRIAN_STATS = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_cambrian");
	public static final ResourceLocation PALEOPEDIA_CAMBRIAN_STATS_COMPLETED = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_cambrian_completed");
	public static final ResourceLocation PALEOPEDIA_ORDOVICIAN_STATS = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_ordovician");
	public static final ResourceLocation PALEOPEDIA_ORDOVICIAN_STATS_COMPLETED = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_ordovician_completed");
	public static final ResourceLocation PALEOPEDIA_SILURIAN_STATS = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_silurian");
	public static final ResourceLocation PALEOPEDIA_SILURIAN_STATS_COMPLETED = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_silurian_completed");
	public static final ResourceLocation PALEOPEDIA_DEVONIAN_STATS = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_devonian");
	public static final ResourceLocation PALEOPEDIA_DEVONIAN_STATS_COMPLETED = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_devonian_completed");
	public static final ResourceLocation PALEOPEDIA_CARBONIFEROUS_STATS = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_carboniferous");
	public static final ResourceLocation PALEOPEDIA_CARBONIFEROUS_STATS_COMPLETED = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_carboniferous_completed");
	public static final ResourceLocation PALEOPEDIA_PERMIAN_STATS = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_permian");
	public static final ResourceLocation PALEOPEDIA_PERMIAN_STATS_COMPLETED = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_permian_completed");
	public static final ResourceLocation PALEOPEDIA_TRIASSIC_STATS = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_triassic");
	public static final ResourceLocation PALEOPEDIA_TRIASSIC_STATS_COMPLETED = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_triassic_completed");
	public static final ResourceLocation PALEOPEDIA_JURASSIC_STATS = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_jurassic");
	public static final ResourceLocation PALEOPEDIA_JURASSIC_STATS_COMPLETED = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_jurassic_completed");
	public static final ResourceLocation PALEOPEDIA_CRETACEOUS_EARLY_STATS = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_cretaceous_early");
	public static final ResourceLocation PALEOPEDIA_CRETACEOUS_EARLY_STATS_COMPLETED = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_cretaceous_early_completed");
	public static final ResourceLocation PALEOPEDIA_CRETACEOUS_LATE_STATS = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_cretaceous_late");
	public static final ResourceLocation PALEOPEDIA_CRETACEOUS_LATE_STATS_COMPLETED = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_cretaceous_late_completed");
	public static final ResourceLocation PALEOPEDIA_PALEOGENE_STATS = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_paleogene");
	public static final ResourceLocation PALEOPEDIA_PALEOGENE_STATS_COMPLETED = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_paleogene_completed");
	public static final ResourceLocation PALEOPEDIA_NEOGENE_STATS = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_neogene");
	public static final ResourceLocation PALEOPEDIA_NEOGENE_STATS_COMPLETED = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_neogene_completed");
	public static final ResourceLocation PALEOPEDIA_PLEISTOCENE_STATS = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_pleistocene");
	public static final ResourceLocation PALEOPEDIA_PLEISTOCENE_STATS_COMPLETED = new ResourceLocation(LepidodendronMod.MODID, "paleopediastats_pleistocene_completed");

	@SubscribeEvent
	public void attachCapability(AttachCapabilitiesEvent event) {
		if (event.getObject() instanceof EntityPlayer) {
			event.addCapability(PALEOPEDIA_PRECAMBRIAN_STATS, new PaleopediaStatsProviderPrecambrian());
			event.addCapability(PALEOPEDIA_PRECAMBRIAN_STATS_COMPLETED, new PaleopediaStatsProviderPrecambrianCompleted());
			event.addCapability(PALEOPEDIA_CAMBRIAN_STATS, new PaleopediaStatsProviderCambrian());
			event.addCapability(PALEOPEDIA_CAMBRIAN_STATS_COMPLETED, new PaleopediaStatsProviderCambrianCompleted());
			event.addCapability(PALEOPEDIA_ORDOVICIAN_STATS, new PaleopediaStatsProviderOrdovician());
			event.addCapability(PALEOPEDIA_ORDOVICIAN_STATS_COMPLETED, new PaleopediaStatsProviderOrdovicianCompleted());
			event.addCapability(PALEOPEDIA_SILURIAN_STATS, new PaleopediaStatsProviderSilurian());
			event.addCapability(PALEOPEDIA_SILURIAN_STATS_COMPLETED, new PaleopediaStatsProviderSilurianCompleted());
			event.addCapability(PALEOPEDIA_DEVONIAN_STATS, new PaleopediaStatsProviderDevonian());
			event.addCapability(PALEOPEDIA_DEVONIAN_STATS_COMPLETED, new PaleopediaStatsProviderDevonianCompleted());
			event.addCapability(PALEOPEDIA_CARBONIFEROUS_STATS, new PaleopediaStatsProviderCarboniferous());
			event.addCapability(PALEOPEDIA_CARBONIFEROUS_STATS_COMPLETED, new PaleopediaStatsProviderCarboniferousCompleted());
			event.addCapability(PALEOPEDIA_PERMIAN_STATS, new PaleopediaStatsProviderPermian());
			event.addCapability(PALEOPEDIA_PERMIAN_STATS_COMPLETED, new PaleopediaStatsProviderPermianCompleted());
			event.addCapability(PALEOPEDIA_TRIASSIC_STATS, new PaleopediaStatsProviderTriassic());
			event.addCapability(PALEOPEDIA_TRIASSIC_STATS_COMPLETED, new PaleopediaStatsProviderTriassicCompleted());
			event.addCapability(PALEOPEDIA_JURASSIC_STATS, new PaleopediaStatsProviderJurassic());
			event.addCapability(PALEOPEDIA_JURASSIC_STATS_COMPLETED, new PaleopediaStatsProviderJurassicCompleted());
			event.addCapability(PALEOPEDIA_CRETACEOUS_EARLY_STATS, new PaleopediaStatsProviderCretaceousEarly());
			event.addCapability(PALEOPEDIA_CRETACEOUS_EARLY_STATS_COMPLETED, new PaleopediaStatsProviderCretaceousEarlyCompleted());
			event.addCapability(PALEOPEDIA_CRETACEOUS_LATE_STATS, new PaleopediaStatsProviderCretaceousLate());
			event.addCapability(PALEOPEDIA_CRETACEOUS_LATE_STATS_COMPLETED, new PaleopediaStatsProviderCretaceousLateCompleted());
			event.addCapability(PALEOPEDIA_PALEOGENE_STATS, new PaleopediaStatsProviderPaleogene());
			event.addCapability(PALEOPEDIA_PALEOGENE_STATS_COMPLETED, new PaleopediaStatsProviderPaleogeneCompleted());
			event.addCapability(PALEOPEDIA_NEOGENE_STATS, new PaleopediaStatsProviderNeogene());
			event.addCapability(PALEOPEDIA_NEOGENE_STATS_COMPLETED, new PaleopediaStatsProviderNeogeneCompleted());
			event.addCapability(PALEOPEDIA_PLEISTOCENE_STATS, new PaleopediaStatsProviderPleistocene());
			event.addCapability(PALEOPEDIA_PLEISTOCENE_STATS_COMPLETED, new PaleopediaStatsProviderPleistoceneCompleted());
		}
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent //Red overlay when submarine battery is low
	public void onRenderGUI(RenderGameOverlayEvent.Post event) {
		Minecraft mc = Minecraft.getMinecraft();
		ScaledResolution scaled = new ScaledResolution(mc);
		EntityPlayer player = mc.player;
		if (player.isRiding()) {
			if (player.getRidingEntity() instanceof PrehistoricFloraSubmarine) {
				PrehistoricFloraSubmarine sub = (PrehistoricFloraSubmarine) player.getRidingEntity();
				if (sub.getEnergyFraction() < ((double)LepidodendronConfig.submarineWarning/100D) && LepidodendronConfig.machinesRF) {
					PrehistoricFloraSubmarine.seeRed(mc, scaled, event.getPartialTicks());
				}
			}
		}
	}

	@SubscribeEvent //Stop ageing things in the cages:
	public void onTickEntity(LivingEvent.LivingUpdateEvent event) {
		EntityLivingBase entity = event.getEntityLiving();
		if (entity instanceof EntityAgeable) {
			if (entity.world.getBlockState(entity.getPosition()).getBlock() == BlockCageSmall.block) {
				int i = Math.max(((EntityAgeable)entity).getGrowingAge(), -23999);
				if (entity instanceof EntityVillager) {
					i = Math.max(((EntityAgeable) entity).getGrowingAge(), -5999);
				}
				((EntityAgeable)entity).setGrowingAge(i - 1);
			}
		}
	}

	@SubscribeEvent
	public void onLavaInNether(DecorateBiomeEvent.Post event) {
		if (event.getWorld().provider.getDimension() == -1
				&& LepidodendronConfig.doVolcanoNether > 0) {
			BlockPos pos = event.getPos();
			for (int i = 0; i < LepidodendronConfig.doVolcanoNether * 10; ++i)
			{
				int j = event.getWorld().rand.nextInt(16) + 8;
				int k = event.getWorld().rand.nextInt(16) + 8;
				int l = event.getWorld().rand.nextInt(event.getWorld().getHeight(pos.add(j, 0, k)).getY() + 32);
				(new WorldGenVolcanoEruptableNether()).generate(event.getWorld(), event.getWorld().rand, pos.add(j, l, k));
			}
		}
	}

	@SubscribeEvent //Stop vanilla fish in the dimensions:
	public void onFishing(ItemFishedEvent event) {
		if (event.getHookEntity().getEntityWorld().isRemote) {
			return;
		}
		if (event.getHookEntity().getEntityWorld().provider.getDimension() != LepidodendronConfig.dimPrecambrian
				&& event.getHookEntity().getEntityWorld().provider.getDimension() != LepidodendronConfig.dimCambrian
				&& event.getHookEntity().getEntityWorld().provider.getDimension() != LepidodendronConfig.dimOrdovician
				&& event.getHookEntity().getEntityWorld().provider.getDimension() != LepidodendronConfig.dimSilurian
				&& event.getHookEntity().getEntityWorld().provider.getDimension() != LepidodendronConfig.dimDevonian
				&& event.getHookEntity().getEntityWorld().provider.getDimension() != LepidodendronConfig.dimCarboniferous
				&& event.getHookEntity().getEntityWorld().provider.getDimension() != LepidodendronConfig.dimPermian
				&& event.getHookEntity().getEntityWorld().provider.getDimension() != LepidodendronConfig.dimTriassic
				&& event.getHookEntity().getEntityWorld().provider.getDimension() != LepidodendronConfig.dimJurassic
				&& event.getHookEntity().getEntityWorld().provider.getDimension() != LepidodendronConfig.dimCretaceousEarly
				&& event.getHookEntity().getEntityWorld().provider.getDimension() != LepidodendronConfig.dimCretaceousLate
				&& event.getHookEntity().getEntityWorld().provider.getDimension() != LepidodendronConfig.dimPaleogene
				&& event.getHookEntity().getEntityWorld().provider.getDimension() != LepidodendronConfig.dimNeogene
				&& event.getHookEntity().getEntityWorld().provider.getDimension() != LepidodendronConfig.dimPleistocene) {
			return;
		}

		for (ItemStack itemstackVanilla : event.getDrops())
		{
			Item item = itemstackVanilla.getItem();
			if (item == Items.FISH || item == Items.COOKED_FISH)
			{
				event.setCanceled(true);

				//Replace with modded drops:
				Entity bobber = event.getHookEntity();
				World world = bobber.getEntityWorld();
				EntityPlayer angler = event.getEntityPlayer();

				//Try 64 times to find something:
				ItemStack itemstack = null;
				int tries = 0;
				while (itemstack == null & tries < 64)
				{
					itemstack = FishingRodDrops.executeProcedure(bobber.world, bobber.getPosition(), bobber.world.rand, null, bobber);
					tries ++;
				}
				if (itemstack == null) {
					return;
				}

				EntityItem entityitem = new EntityItem(bobber.world, bobber.posX, bobber.posY, bobber.posZ, itemstack);
				double d0 = angler.posX - bobber.posX;
				double d1 = angler.posY - bobber.posY;
				double d2 = angler.posZ - bobber.posZ;
				double d3 = (double) MathHelper.sqrt(d0 * d0 + d1 * d1 + d2 * d2);
				entityitem.motionX = d0 * 0.1D;
				entityitem.motionY = d1 * 0.1D + (double)MathHelper.sqrt(d3) * 0.08D;
				entityitem.motionZ = d2 * 0.1D;
				world.spawnEntity(entityitem);
				angler.world.spawnEntity(new EntityXPOrb(angler.world, angler.posX, angler.posY + 0.5D, angler.posZ + 0.5D, world.rand.nextInt(6) + 1));
			}
		}
	}

	@SubscribeEvent //Manage Nether portals: when travelling to the Nether
	// use the overworld (or other) portal, not a new Nether Portal in the Nether itself.
	//This subscriber is also copied into the dimension mods to deal with those.
	public void goToNether(EntityTravelToDimensionEvent event) {
		if (LepidodendronConfig.oneWayPortalsNether && LepidodendronConfig.oneWayPortals) {
			if (event.getDimension() == -1) {
				//We are travelling to the Nether from here:
				Entity entityIn = event.getEntity();
				World worldIn = entityIn.getEntityWorld();

			 	if (event.getEntity().getEntityWorld().provider.getDimensionType().getId() == 0) {
					if (!worldIn.isRemote && !entityIn.isRiding() && !entityIn.isBeingRidden() && entityIn instanceof EntityPlayerMP) {
						EntityPlayerMP thePlayer = (EntityPlayerMP) entityIn;
						if (thePlayer.dimension != event.getDimension()) {
							thePlayer.timeUntilPortal = 10;
							ReflectionHelper.setPrivateValue(EntityPlayerMP.class, thePlayer, true, "invulnerableDimensionChange", "field_184851_cj");
							WorldOverworldPortal.BlockCustomPortal.transferPlayerToDimensionPN(thePlayer.server.getPlayerList(), thePlayer, event.getDimension(), WorldOverworldPortal.BlockCustomPortal.getTeleporterForDimension(thePlayer, entityIn.getPosition(), event.getDimension()));
						}
					}
					event.setCanceled(true);
				}
			}
		}
	}

	@SubscribeEvent //Manage Nether portals: don't allow then to be lit in the Nether
	public void makeNetherPortal(BlockEvent.PortalSpawnEvent event) {
		if (LepidodendronConfig.oneWayPortalsNether && LepidodendronConfig.oneWayPortals && event.getWorld().provider.getDimensionType().getId() == -1) {
			event.setCanceled(true);
		}
	}

	@SubscribeEvent
	public void killedEntity(LivingDropsEvent event) {
		if (event.getEntity().getClass() == EntityBat.class) {
			int chancer = 30;
			if (event.getLootingLevel() > 0) {
				chancer = (int)Math.ceil(30.0D / ((double)event.getLootingLevel() + 1));
			}
			if (event.getEntity().getEntityWorld().rand.nextInt(chancer) == 0) {
				event.getDrops().add(new EntityItem(event.getEntity().getEntityWorld(), event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, new ItemStack(ItemBatHeadItem.block, 1)));
			}
		}
		if (event.getEntity().getClass() == EntitySilverfish.class
				|| event.getEntity().getClass() == EntitySpider.class
				|| event.getEntity().getClass() == EntityCaveSpider.class) {
			event.getDrops().add(new EntityItem(event.getEntity().getEntityWorld(), event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, new ItemStack(ItemBugRaw.block, 1)));
		}
		if (event.getEntity().getClass() == EntitySquid.class) {
			event.getDrops().add(new EntityItem(event.getEntity().getEntityWorld(), event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, new ItemStack(ItemSquidRaw.block, 1)));
		}
		if (event.getEntity().getClass() == EntityWolf.class) {
			event.getDrops().add(new EntityItem(event.getEntity().getEntityWorld(), event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, new ItemStack(ItemWolfRaw.block, 1)));
		}
	}

  	@SubscribeEvent //Give the Palaeopedia on first join and notify about flowerpots:
	public void playerJoined(EntityJoinWorldEvent event) {

		if ((event.getEntity() instanceof EntityPlayer)) {
			LepidodendronBookSubscribers.updatePaleopediaStats((EntityPlayer)event.getEntity());
		}

		if (LepidodendronConfig.giveBook) {
			if ((event.getEntity() instanceof EntityPlayerMP)) {
				ModTriggers.PALAEOPEDIA_GIVEN.trigger((EntityPlayerMP) event.getEntity());
			}
		}
		if (LepidodendronConfig.modFlowerpot) {
			if ((Loader.isModLoaded("quark") && !LepidodendronConfig.genFlowerpotWithQuark)) {
				Entity entity = event.getEntity();
				if (entity instanceof EntityPlayer) {
					EntityPlayer player = (EntityPlayer) entity;
					if ((event.getEntity() instanceof EntityPlayerMP) && (entity.world instanceof WorldServer)) {
						if (!(((EntityPlayerMP) event.getEntity()).getAdvancements().getProgress(((WorldServer) entity.world).getAdvancementManager()
							.getAdvancement(new ResourceLocation("lepidodendron:pf_quark_nag"))).isDone())) {
							ITextComponent itextcomponent = new TextComponentString("You have Quark installed, and Quark has its own modded flower pots, which we don't know if you're using! If you want to use Prehistoric Nature flower pots and not Quark ones, you should disable Quark ones in the Quark config, and also amend the Prehistoric Nature config file to make Prehistoric Nature ones load.");
							itextcomponent.getStyle().setColor(TextFormatting.GRAY).setItalic(Boolean.valueOf(true));
							entity.sendMessage(itextcomponent);
							ModTriggers.QUARK_NAG.trigger((EntityPlayerMP) event.getEntity());
						}
					}
				}
			}
		}
		if (!Loader.isModLoaded("vintagefix")) {
			Entity entity = event.getEntity();
			if (entity instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) entity;
				if ((event.getEntity() instanceof EntityPlayerMP) && (entity.world instanceof WorldServer)) {
					ITextComponent itextcomponent = new TextComponentString("Prehistoric Nature is a big mod and many computers may struggle: we strongly advise you to install the mod VintageFix and its dependency, MixinBooter. Installing this will normally eliminate memory, lag and fps issues while running Prehistoric Nature.");
					itextcomponent.getStyle().setColor(TextFormatting.RED).setItalic(Boolean.valueOf(true));
					entity.sendMessage(itextcomponent);
				}
			}
		}
	}

	@SubscribeEvent //Some instructions for use of rideables
	public void playerPickupItem(EntityItemPickupEvent event) {
		if (event.getEntityPlayer() != null) {
			if (event.getEntityPlayer().isRiding()) {
				if (event.getEntityPlayer().getRidingEntity() instanceof PrehistoricFloraSubmarine) {
					event.setCanceled(true);
				}
			}
		}
	}

	@SubscribeEvent //Some instructions for use of rideables
	public void playerMounted(EntityMountEvent event) {
		Entity entity = event.getEntityMounting();
		if (entity instanceof EntityPlayer && event.isMounting() && event.getEntityBeingMounted() != null) {
			EntityPlayer player = (EntityPlayer) entity;
			if (event.getEntityBeingMounted() instanceof PrehistoricFloraSubmarine && event.getEntityMounting().getEntityWorld().isRemote) {
				if (((PrehistoricFloraSubmarine)event.getEntityBeingMounted()).getShulker()) {
					LepidodendronMod.PACKET_HANDLER.sendToServer(new SubmarineMountMessage(player.getUniqueID().toString(),
							"Submarine controls:\nup = " + ClientProxyLepidodendronMod.keyBoatUp.getDisplayName()
									+ "\ndown = " + ClientProxyLepidodendronMod.keyBoatDown.getDisplayName()
									+ "\nstrafe left = " + ClientProxyLepidodendronMod.keyBoatStrafeLeft.getDisplayName()
									+ "\nstrafe right = " + ClientProxyLepidodendronMod.keyBoatStrafeRight.getDisplayName()
									+ "\nuse buckets = " + ClientProxyLepidodendronMod.keyBoatUseBucket.getDisplayName()
									+ "\nuse claw = " + ClientProxyLepidodendronMod.keyBoatUseClaw.getDisplayName()
									+ "\nleft control panel = view power level"
									+ "\ncentre control panel = open Submarine inventory"
									+ "\nright control panel = add or remove battery"));
				}
				else {
					LepidodendronMod.PACKET_HANDLER.sendToServer(new SubmarineMountMessage(player.getUniqueID().toString(),
							"Submarine controls:\nup = " + ClientProxyLepidodendronMod.keyBoatUp.getDisplayName()
									+ "\ndown = " + ClientProxyLepidodendronMod.keyBoatDown.getDisplayName()
									+ "\nstrafe left = " + ClientProxyLepidodendronMod.keyBoatStrafeLeft.getDisplayName()
									+ "\nstrafe right = " + ClientProxyLepidodendronMod.keyBoatStrafeRight.getDisplayName()
									+ "\nuse buckets = " + ClientProxyLepidodendronMod.keyBoatUseBucket.getDisplayName()
									+ "\nuse claw = " + ClientProxyLepidodendronMod.keyBoatUseClaw.getDisplayName()
									+ "\nleft control panel = view power level"
									+ "\nright control panel = add or remove battery"));
				}
			}
			if (event.getEntityBeingMounted() instanceof PrehistoricFloraSubmarine) {
				//Capture the effects if needed:
				if (player.isPotionActive(MobEffects.WATER_BREATHING)) {
					PotionEffect effectWaterBreathing = player.getActivePotionEffect(MobEffects.WATER_BREATHING);
					((PrehistoricFloraSubmarine) event.getEntityBeingMounted()).saveWaterBreathingPassenger(true, effectWaterBreathing.getDuration(), effectWaterBreathing.getAmplifier(), effectWaterBreathing.getIsAmbient(), effectWaterBreathing.doesShowParticles(), player.getUniqueID());
				}
				else {
					((PrehistoricFloraSubmarine) event.getEntityBeingMounted()).saveWaterBreathingPassenger(false, 0, 0, false, false, player.getUniqueID());
				}
				if (player.isPotionActive(MobEffects.NIGHT_VISION) && LepidodendronConfig.submarineNightvision) {
					PotionEffect effectNightVision = player.getActivePotionEffect(MobEffects.NIGHT_VISION);
					((PrehistoricFloraSubmarine) event.getEntityBeingMounted()).saveNightVisionPassenger(true, effectNightVision.getDuration(), effectNightVision.getAmplifier(), effectNightVision.getIsAmbient(), effectNightVision.doesShowParticles(), player.getUniqueID());
				}
				else {
					((PrehistoricFloraSubmarine) event.getEntityBeingMounted()).saveNightVisionPassenger(false, 0, 0, false, false, player.getUniqueID());
				}
			}
		}
		if (entity instanceof EntityPlayer && (!event.isMounting()) && event.getEntityBeingMounted() != null) {
			EntityPlayer player = (EntityPlayer) entity;
			//Dismounting the submarine:
			if (event.getEntityBeingMounted() instanceof PrehistoricFloraSubmarine) {
				//Give the night vision effect while inside:
				((PrehistoricFloraSubmarine) event.getEntityBeingMounted()).grantWaterBreathingPassenger(player);
				if (LepidodendronConfig.submarineNightvision) {
					((PrehistoricFloraSubmarine) event.getEntityBeingMounted()).grantNightVisionPassenger(player);
				}
				((PrehistoricFloraSubmarine) event.getEntityBeingMounted()).grantDamageCapabilityPassenger(player);
			}
		}
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent //Opening the Palaeopedia
	public void keyPressed(InputEvent.KeyInputEvent event) {
		if (ClientProxyLepidodendronMod.keyPalaeopdeiaOpen.getKeyCode() <= 0) {
			return;
		}
		if (Keyboard.isKeyDown(ClientProxyLepidodendronMod.keyPalaeopdeiaOpen.getKeyCode())) {
			if (Minecraft.getMinecraft().player instanceof EntityPlayer) {
				openPalaeopedia((EntityPlayer)Minecraft.getMinecraft().player);
			}
		}
	}

	public static void openPalaeopedia(EntityPlayer player) {
		ItemStack stack = player.getHeldItemMainhand();
		if (stack.getItem().getRegistryName().toString().equalsIgnoreCase("patchouli:guide_book")) {
			if (stack.getTagCompound() != null) {
				if (stack.getTagCompound().toString().contains("lepidodendron:paleopedia")) {
					Book book = getBookFromStack(stack);
					ClientBookRegistry.INSTANCE.displayBookGui(book.resourceLoc.toString());
					//NetworkHandler.INSTANCE.sendTo(new MessageOpenBookGui(book.resourceLoc.toString()), (EntityPlayerMP) player);
					SoundEvent sfx = PatchouliSounds.getSound(book.openSound, PatchouliSounds.book_open);
					player.playSound(sfx, 1.0F, (float) (0.7 + Math.random() * 0.4));
				}
			}
		}
	}

	private static Book getBookFromStack(ItemStack stack) {
		if (stack.getItem() instanceof ItemModBook) {
			return ItemModBook.getBook(stack);
		} else {
			for(Book b : BookRegistry.INSTANCE.books.values()) {
				if (b.getBookItem().isItemEqual(stack)) {
					return b;
				}
			}

			return null;
		}
	}

	public static class SubmarineMountMessageHandler implements IMessageHandler<SubmarineMountMessage, IMessage> {
		@Override
		public IMessage onMessage(SubmarineMountMessage message, MessageContext context) {
			EntityPlayer player = context.getServerHandler().player.world.getPlayerEntityByUUID(UUID.fromString(message.player));
			if (context.getServerHandler().player == player && !context.getServerHandler().player.world.isRemote) {
				ITextComponent itextcomponent = new TextComponentString(message.message);
				itextcomponent.getStyle().setColor(TextFormatting.GRAY).setItalic(Boolean.valueOf(true));
				player.sendMessage(itextcomponent);
			}
			return null;
		}
	}

	public static class SubmarineMountMessage implements IMessage {
		String player, message;
		public SubmarineMountMessage() {
		}

		public SubmarineMountMessage(String player, String message) {
			this.player = player;
			this.message = message;
		}

		@Override
		public void toBytes(io.netty.buffer.ByteBuf buf) {
			ByteBufUtils.writeUTF8String(buf, player);
			ByteBufUtils.writeUTF8String(buf, message);
		}

		@Override
		public void fromBytes(io.netty.buffer.ByteBuf buf) {
			player = ByteBufUtils.readUTF8String(buf);
			message = ByteBufUtils.readUTF8String(buf);
		}
	}

	@SubscribeEvent //Bat poo
	public void guano(LivingEvent.LivingUpdateEvent event) {
		double chancer = LepidodendronConfig.doGuanoBats;
		if (chancer < 0.0D) {
			chancer = 0.0D;
		}
		if (chancer > 1000.0D) {
			chancer = 1000.0D;
		}
		if (event.getEntity() instanceof EntityBat && chancer > 0.0D) {
			EntityBat bat = (EntityBat) event.getEntity();
			if (bat.world.rand.nextInt((int)Math.floor(6000 / chancer)) == 0 && (!bat.world.isRemote)
					&& bat.getIsBatHanging() && bat.world.isAirBlock(bat.getPosition().down())) {
				EntityPrehistoricFloraGuanoBall guanoBall = new EntityPrehistoricFloraGuanoBall(bat.world, bat.posX, bat.posY - 0.5, bat.posZ);
				guanoBall.setFromMob(true);
				bat.world.spawnEntity(guanoBall);
			}
		}
	}

	@SubscribeEvent //Spawn Hadean meteors
	public void meteors(TickEvent.WorldTickEvent event) {
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
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimCretaceousEarly
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
				&& event.getWorld().provider.getDimension() != LepidodendronConfig.dimCretaceousEarly
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
		}
//		else if (event.getWorld().getBlockState(event.getPos()).getBlock() == BlockDisplayWallMount.block
//				&& event.getHand() == EnumHand.MAIN_HAND) {
//			TileEntity te = event.getWorld().getTileEntity(event.getPos());
//			if (te != null) {
//				if (te instanceof BlockDisplayWallMount.TileEntityDisplayWallMount) {
//					BlockDisplayWallMount.TileEntityDisplayWallMount tee = (BlockDisplayWallMount.TileEntityDisplayWallMount) te;
//					if (tee.hasItem()) {
//						if (!(event.getWorld().isRemote)) {
//							ItemStack itemstack = tee.getStackInSlot(0);
//							Block.spawnAsEntity(event.getWorld(), event.getPos(), itemstack);
//
//							SoundEvent soundevent = SoundEvents.ENTITY_ITEMFRAME_REMOVE_ITEM;
//							((WorldServer) event.getEntityPlayer().getEntityWorld()).playSound(null, event.getPos(), soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
//							event.getEntityPlayer().swingArm(event.getHand());
//						}
//						tee.setDisplay(ItemStack.EMPTY);
//						//return;
//						event.getWorld().markBlockRangeForRenderUpdate(event.getPos(), event.getPos());
//						event.setCanceled(true);
//					}
//				}
//			}
//		}
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
//		if ((event.getBlock().getBlock() instanceof BlockGrass || event.getBlock().getMaterial() == Material.GRASS) && LepidodendronConfig.doPropagationVanilla) {
//			event.setCanceled(true);
//		}
	}

	@SubscribeEvent //We want to drop the real items or flowers
	public void onSheared(PlayerInteractEvent.RightClickBlock event) {
		if (event.getWorld().getBlockState(event.getPos()).getBlock() == Blocks.DOUBLE_PLANT
				&& LepidodendronConfig.doPropagationVanilla
				&& event.getHand() == EnumHand.MAIN_HAND
				&& !(event.getItemStack().getItem() instanceof ItemShears)) {
			BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttype = (BlockDoublePlant.EnumPlantType) event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.VARIANT);
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.ROSE && event.getItemStack().getItem() == ItemRoseFlower.block) {
				event.getEntityPlayer().swingArm(event.getHand());
				if (!(event.getWorld().isRemote) && Math.random() > 0.95) {
					event.getWorld().destroyBlock(event.getPos(), false);
					event.getWorld().setBlockToAir(event.getPos().up());
				}
				Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemRoseSeeds.block, 1));
				event.getItemStack().shrink(1);
				event.setCanceled(true);
			}
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.PAEONIA && event.getItemStack().getItem() == ItemPeonyFlower.block) {
				event.getEntityPlayer().swingArm(event.getHand());
				if (!(event.getWorld().isRemote) && Math.random() > 0.95) {
					event.getWorld().destroyBlock(event.getPos(), false);
					event.getWorld().setBlockToAir(event.getPos().up());
				}
				Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemPeonySeeds.block, 1));
				event.getItemStack().shrink(1);
				event.setCanceled(true);
			}
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.SYRINGA && event.getItemStack().getItem() == ItemLilacFlower.block) {
				event.getEntityPlayer().swingArm(event.getHand());
				if (!(event.getWorld().isRemote) && Math.random() > 0.95) {
					event.getWorld().destroyBlock(event.getPos(), false);
					event.getWorld().setBlockToAir(event.getPos().up());
				}
				Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemLilacSeeds.block, 1));
				event.getItemStack().shrink(1);
				event.setCanceled(true);
			}
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.SUNFLOWER && event.getItemStack().getItem() == ItemSunflowerFlower.block) {
				event.getEntityPlayer().swingArm(event.getHand());
				if (!(event.getWorld().isRemote) && Math.random() > 0.95) {
					event.getWorld().destroyBlock(event.getPos(), false);
					event.getWorld().setBlockToAir(event.getPos().up());
				}
				Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemSunflowerSeeds.block, 1));
				event.getItemStack().shrink(1);
				event.setCanceled(true);
			}
		}
		else if (event.getWorld().getBlockState(event.getPos()).getBlock() == Blocks.DOUBLE_PLANT
				&& event.getItemStack().getItem() instanceof ItemShears
				&& LepidodendronConfig.doPropagationVanilla
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
				if (!(event.getWorld().isRemote) && Math.random() > 0.95) {
					event.getWorld().destroyBlock(event.getPos(), false);
					event.getWorld().setBlockToAir(event.getPos().up());
				}
				Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemRoseFlower.block, 1));
				event.getItemStack().damageItem(1, event.getEntityPlayer());
				event.setCanceled(true);
			} else if (event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.UPPER
					&& event.getWorld().getBlockState(event.getPos().down()).getBlock() == Blocks.DOUBLE_PLANT) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttypeDown = (BlockDoublePlant.EnumPlantType) event.getWorld().getBlockState(event.getPos().down()).getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumplanttypeDown == BlockDoublePlant.EnumPlantType.ROSE) { //spawn rose flowers:
					event.getEntityPlayer().swingArm(event.getHand());
					if (!(event.getWorld().isRemote) && Math.random() > 0.95) {
						event.getWorld().destroyBlock(event.getPos(), false);
						event.getWorld().setBlockToAir(event.getPos().up());
					}
					Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemRoseFlower.block, 1));
					event.getItemStack().damageItem(1, event.getEntityPlayer());
					event.setCanceled(true);
				}
			} else if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.SUNFLOWER) { //spawn Sunflower flowers:
				event.getEntityPlayer().swingArm(event.getHand());
				if (!(event.getWorld().isRemote) && Math.random() > 0.95) {
					event.getWorld().destroyBlock(event.getPos(), false);
					event.getWorld().setBlockToAir(event.getPos().up());
				}
				Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemSunflowerFlower.block, 1));
				event.getItemStack().damageItem(1, event.getEntityPlayer());
				event.setCanceled(true);
			} else if (event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.UPPER
					&& event.getWorld().getBlockState(event.getPos().down()).getBlock() == Blocks.DOUBLE_PLANT) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttypeDown = (BlockDoublePlant.EnumPlantType) event.getWorld().getBlockState(event.getPos().down()).getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumplanttypeDown == BlockDoublePlant.EnumPlantType.SUNFLOWER) { //spawn Peony flowers:
					event.getEntityPlayer().swingArm(event.getHand());
					if (!(event.getWorld().isRemote) && Math.random() > 0.95) {
						event.getWorld().destroyBlock(event.getPos(), false);
						event.getWorld().setBlockToAir(event.getPos().up());
					}
					Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemSunflowerFlower.block, 1));
					event.getItemStack().damageItem(1, event.getEntityPlayer());
					event.setCanceled(true);
				}
			} else if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.PAEONIA) { //spawn Peony flowers:
				event.getEntityPlayer().swingArm(event.getHand());
				if (!(event.getWorld().isRemote) && Math.random() > 0.95) {
					event.getWorld().destroyBlock(event.getPos(), false);
					event.getWorld().setBlockToAir(event.getPos().up());
				}
				Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemPeonyFlower.block, 1));
				event.getItemStack().damageItem(1, event.getEntityPlayer());
				event.setCanceled(true);
			} else if (event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.UPPER
					&& event.getWorld().getBlockState(event.getPos().down()).getBlock() == Blocks.DOUBLE_PLANT) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttypeDown = (BlockDoublePlant.EnumPlantType) event.getWorld().getBlockState(event.getPos().down()).getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumplanttypeDown == BlockDoublePlant.EnumPlantType.PAEONIA) { //spawn Peony flowers:
					event.getEntityPlayer().swingArm(event.getHand());
					if (!(event.getWorld().isRemote) && Math.random() > 0.95) {
						event.getWorld().destroyBlock(event.getPos(), false);
						event.getWorld().setBlockToAir(event.getPos().up());
					}
					Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemPeonyFlower.block, 1));
					event.getItemStack().damageItem(1, event.getEntityPlayer());
					event.setCanceled(true);
				}
			} else if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.SYRINGA) { //spawn lilac flowers:
				event.getEntityPlayer().swingArm(event.getHand());
				if (!(event.getWorld().isRemote) && Math.random() > 0.95) {
					event.getWorld().destroyBlock(event.getPos(), false);
					event.getWorld().setBlockToAir(event.getPos().up());
				}
				Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemLilacFlower.block, 1));
				event.getItemStack().damageItem(1, event.getEntityPlayer());
				event.setCanceled(true);
			} else if (event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.UPPER
					&& event.getWorld().getBlockState(event.getPos().down()).getBlock() == Blocks.DOUBLE_PLANT) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttypeDown = (BlockDoublePlant.EnumPlantType) event.getWorld().getBlockState(event.getPos().down()).getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumplanttypeDown == BlockDoublePlant.EnumPlantType.SYRINGA) { //spawn lilac flowers:
					event.getEntityPlayer().swingArm(event.getHand());
					if (!(event.getWorld().isRemote) && Math.random() > 0.95) {
						event.getWorld().destroyBlock(event.getPos(), false);
						event.getWorld().setBlockToAir(event.getPos().up());
					}
					Block.spawnAsEntity(event.getWorld(), event.getPos(), new ItemStack(ItemLilacFlower.block, 1));
					event.getItemStack().damageItem(1, event.getEntityPlayer());
					event.setCanceled(true);
				}
			}
		} else if (event.getWorld().getBlockState(event.getPos()).getBlock() == Blocks.DOUBLE_PLANT
				&& (!(event.getItemStack().getItem() instanceof ItemShears)) && LepidodendronConfig.doPropagationVanilla
				&& event.getHand() == EnumHand.MAIN_HAND) {
			BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttype = (BlockDoublePlant.EnumPlantType) event.getWorld().getBlockState(event.getPos()).getValue(BlockDoublePlant.VARIANT);
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.GRASS) {

			}
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.FERN) {

			}
		}
	}

	@SubscribeEvent
	public void onBlockPreBreak(BlockEvent.BreakEvent event) {
		if ((!event.getWorld().isRemote)) {
			//Make large ferns and large grass drop themselv es with shears:
			if (event.getState().getBlock() instanceof BlockDoublePlant && LepidodendronConfig.doPropagationVanilla) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumtype = (BlockDoublePlant.EnumPlantType) event.getState().getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumtype == BlockDoublePlant.EnumPlantType.FERN
						&& event.getPlayer().getHeldItemMainhand().getItem() instanceof ItemShears && LepidodendronConfig.doPropagationVanilla) {
					event.getWorld().destroyBlock(event.getPos(), false);
					EntityItem entityToSpawn = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(Blocks.DOUBLE_PLANT, 1, 3));
					entityToSpawn.setPickupDelay(10);
					event.getWorld().spawnEntity(entityToSpawn);
					event.setCanceled(true);
				}
			}

			if (event.getState().getBlock() instanceof BlockDoublePlant && LepidodendronConfig.doPropagationVanilla) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumtype = (BlockDoublePlant.EnumPlantType) event.getState().getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumtype == BlockDoublePlant.EnumPlantType.GRASS
						&& event.getPlayer().getHeldItemMainhand().getItem() instanceof ItemShears && LepidodendronConfig.doPropagationVanilla) {
					event.getWorld().destroyBlock(event.getPos(), false);
					EntityItem entityToSpawn = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(Blocks.DOUBLE_PLANT, 1, 2));
					entityToSpawn.setPickupDelay(10);
					event.getWorld().spawnEntity(entityToSpawn);
					event.setCanceled(true);
				}
			}

			//Drop holdfasts from the right blocks:
			if (event.getWorld().rand.nextInt(10) == 0
					&& OreDictionary.containsMatch(false,
					OreDictionary.getOres("holdfastDrops"), new ItemStack(event.getState().getBlock(), 1))) {
				EntityItem entityToSpawn = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(BlockHoldfast.block, 1));
				entityToSpawn.setPickupDelay(10);
				event.getWorld().spawnEntity(entityToSpawn);
			}
			if (event.getPlayer() != null) {
				//Let eggs drop their right items:
				if (!event.getPlayer().isCreative() && event.getState().getBlock() == BlockEggs.block) {
					String eggRenderType = "";
					TileEntity tileEntity = event.getWorld().getTileEntity(event.getPos());
					if (tileEntity != null) {
						if (tileEntity.getTileData().hasKey("creature")) {
							eggRenderType = tileEntity.getTileData().getString("creature");
						}
					}
					if (!eggRenderType.equalsIgnoreCase("")) {
						if (BlockRottenLog.BlockCustom.hasBigEggs(eggRenderType, event.getWorld(), event.getPos()) != null) {
							EntityItem entityToSpawn = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), BlockEggs.BlockCustom.getEggItemStack(event.getWorld(), event.getPos()));
							entityToSpawn.setPickupDelay(10);
							event.getWorld().spawnEntity(entityToSpawn);
						}
					}
				}
				//Let small angiosperm seeds drop sometimes:
				if (!event.getPlayer().isCreative()
						&& (event.getState().getMaterial() == Material.GROUND ||  event.getState().getMaterial() == Material.GRASS)
						&& (event.getWorld().provider.getDimension() == LepidodendronConfig.dimCretaceousEarly
							|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimCretaceousLate
							|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimPaleogene
							|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimNeogene
							|| event.getWorld().provider.getDimension() == LepidodendronConfig.dimPleistocene
							|| event.getWorld().provider.getDimension() == 0
						)
				) {
					int r = LepidodendronConfig.dropSeeds;
					if (r < 0) {
						r = 0;
					}
					if (r > 10000) {
						r = 10000;
					}
					if (r > 0) {
						if (r == 1) {
							EntityItem entityToSpawn = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(ItemSmallAngiospermSeeds.block, 1));
							entityToSpawn.setPickupDelay(10);
							event.getWorld().spawnEntity(entityToSpawn);
						}
						else if (event.getWorld().rand.nextInt(r) == 0) {
							EntityItem entityToSpawn = new EntityItem(event.getWorld(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), new ItemStack(ItemSmallAngiospermSeeds.block, 1));
							entityToSpawn.setPickupDelay(10);
							event.getWorld().spawnEntity(entityToSpawn);
						}
					}
				}
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
//		if (event.getState().getBlock() instanceof BlockTallGrass && LepidodendronConfig.doPropagationVanilla) {
//			BlockTallGrass.EnumType blocktallgrass$enumtype = (BlockTallGrass.EnumType) event.getState().getValue(BlockTallGrass.TYPE);
//			if (blocktallgrass$enumtype == BlockTallGrass.EnumType.GRASS) {
//				dropSelf = false; //the grass needs shears but we want to drop it without needing them
//			}
//		}
		int i = 0;
		while (i + 1 <= event.getDrops().size()) {
			ItemStack itemStack = event.getDrops().get(i);
			int stackSize = itemStack.getCount();
			itemStack.setCount(1);
			if (event.getState().getBlock() instanceof BlockDoublePlant && LepidodendronConfig.doPropagationVanilla) {
				dropSelf = true; //a drop already exists so no need to add a new one
			}

			if (event.getState().getBlock() instanceof BlockTallGrass && LepidodendronConfig.doPropagationVanilla) {
				BlockTallGrass.EnumType blocktallgrass$enumtype = (BlockTallGrass.EnumType) event.getState().getValue(BlockTallGrass.TYPE);
				if (blocktallgrass$enumtype == BlockTallGrass.EnumType.GRASS
						&& ItemStack.areItemStacksEqual(itemStack, new ItemStack(Blocks.TALLGRASS, 1, 1))) {
					dropSelf = true; //a drop already exists so no need to add a new one
				}
			}

			if (event.getState().getBlock() instanceof BlockTallGrass && LepidodendronConfig.doPropagationVanilla) {
				BlockTallGrass.EnumType blocktallgrass$enumtype = (BlockTallGrass.EnumType) event.getState().getValue(BlockTallGrass.TYPE);
				if (blocktallgrass$enumtype == BlockTallGrass.EnumType.FERN
						&& ItemStack.areItemStacksEqual(itemStack, new ItemStack(Items.WHEAT_SEEDS, 1))) {
					event.getDrops().remove(i); //wheat seeds from ferns dont make sense
				}
			}

			if (event.getState().getBlock() instanceof BlockDoublePlant && LepidodendronConfig.doPropagationVanilla) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumtype = (BlockDoublePlant.EnumPlantType) event.getState().getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumtype == BlockDoublePlant.EnumPlantType.FERN
						&& ItemStack.areItemStacksEqual(itemStack, new ItemStack(Items.WHEAT_SEEDS, 1))) {
					event.getDrops().remove(i); //wheat seeds from ferns dont make sense
				}
			}

			if (itemStack.getItem() == Items.APPLE && LepidodendronConfig.fixApples &&
					(event.getState().getBlock() == Blocks.LEAVES
							|| event.getState().getBlock() == Blocks.LEAVES2)) {
				event.getDrops().remove(i);
			}

			Block block = Block.getBlockFromItem(itemStack.getItem());
			if (block instanceof BlockSapling && LepidodendronConfig.doPropagationVanilla &&
					(event.getState().getBlock() == Blocks.LEAVES
							|| event.getState().getBlock() == Blocks.LEAVES2)) {
				if (ItemStack.areItemStacksEqual(itemStack, new ItemStack(Blocks.SAPLING, 1, 0))) { //Oak
					event.getDrops().remove(i);
					event.getDrops().add(i, new ItemStack(ItemOakAcorn.block, stackSize));
				}
				if (ItemStack.areItemStacksEqual(itemStack, new ItemStack(Blocks.SAPLING, 1, 1))) { //Spruce
					event.getDrops().remove(i);
					event.getDrops().add(i, new ItemStack(ItemSpruceFruit.block, stackSize));
				}
				if (ItemStack.areItemStacksEqual(itemStack, new ItemStack(Blocks.SAPLING, 1, 2))) { //Birch
					event.getDrops().remove(i);
					event.getDrops().add(i, new ItemStack(ItemBirchFruit.block, stackSize));
				}
				if (ItemStack.areItemStacksEqual(itemStack, new ItemStack(Blocks.SAPLING, 1, 3))) { //Jungle
					event.getDrops().remove(i);
					event.getDrops().add(i, new ItemStack(ItemJungleFruit.block, stackSize));
				}
				if (ItemStack.areItemStacksEqual(itemStack, new ItemStack(Blocks.SAPLING, 1, 4))) { //Acacia
					event.getDrops().remove(i);
					event.getDrops().add(i, new ItemStack(ItemAcaciaFruit.block, stackSize));
				}
				if (ItemStack.areItemStacksEqual(itemStack, new ItemStack(Blocks.SAPLING, 1, 5))) { //Dark Oak
					event.getDrops().remove(i);
					event.getDrops().add(i, new ItemStack(ItemOakDarkAcorn.block, stackSize));
				}
			}
			if (event.getState().getBlock() instanceof BlockDoublePlant && LepidodendronConfig.doPropagationVanilla) {
				BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttype = (BlockDoublePlant.EnumPlantType) event.getState().getValue(BlockDoublePlant.VARIANT);
				if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.GRASS
						&& ItemStack.areItemStacksEqual(itemStack, new ItemStack(Blocks.TALLGRASS, 1, 1))) {
					event.getDrops().add(i, new ItemStack(Blocks.DOUBLE_PLANT, 1, 2));
					dropSelf = true; //This now drops itself
				}
				if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.FERN
						&& ItemStack.areItemStacksEqual(itemStack, new ItemStack(Blocks.TALLGRASS, 1, 2)) && LepidodendronConfig.doPropagationVanilla) {
					event.getDrops().add(i, new ItemStack(Blocks.DOUBLE_PLANT, 1, 3));
					dropSelf = true; //This now drops itself
				}
			}
			i++;
		}

		if (event.getState().getBlock() instanceof BlockDoublePlant && (!dropSelf) && LepidodendronConfig.doPropagationVanilla) { //Spawn the block drop for these ones
			BlockDoublePlant.EnumPlantType blockdoubleplant$enumplanttype = (BlockDoublePlant.EnumPlantType) event.getState().getValue(BlockDoublePlant.VARIANT);
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.FERN) {
				//event.getDrops().add(i, new ItemStack(Blocks.DOUBLE_PLANT, 1, 3));
			}
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.GRASS) {
				//event.getDrops().add(i, new ItemStack(Blocks.DOUBLE_PLANT, 1, 2));
			}
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.ROSE) {
				event.getDrops().add(i, new ItemStack(Blocks.DOUBLE_PLANT, 1, 4));
			}
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.SYRINGA) {
				event.getDrops().add(i, new ItemStack(Blocks.DOUBLE_PLANT, 1, 1));
			}
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.PAEONIA) {
				event.getDrops().add(i, new ItemStack(Blocks.DOUBLE_PLANT, 1, 5));
			}
			if (blockdoubleplant$enumplanttype == BlockDoublePlant.EnumPlantType.SUNFLOWER) {
				event.getDrops().add(i, new ItemStack(Blocks.DOUBLE_PLANT, 1, 0));
			}
		}
		if (event.getState().getBlock() instanceof BlockTallGrass && (!dropSelf) && LepidodendronConfig.doPropagationVanilla) {
			BlockTallGrass.EnumType blocktallgrass$enumtype = (BlockTallGrass.EnumType) event.getState().getValue(BlockTallGrass.TYPE);
			if (blocktallgrass$enumtype == BlockTallGrass.EnumType.GRASS) {
				//event.getDrops().add(i, new ItemStack(Blocks.TALLGRASS, 1, 1));
			}
		}
		//if (event.getState().getBlock() == Blocks.VINE) {
		//	event.getDrops().add(i, new ItemStack(ItemGrapes.block,1));
		//}
	}

	@SubscribeEvent //Steam in the right places:
	public void onPlayerTick(TickEvent.PlayerTickEvent event) {
		Random rand = new Random();
		if (event.phase == TickEvent.Phase.END &&
				(event.player.world.provider.getDimension() == LepidodendronConfig.dimDevonian
						|| event.player.world.provider.getDimension() == LepidodendronConfig.dimCarboniferous
						|| event.player.world.provider.getDimension() == LepidodendronConfig.dimCretaceousEarly
						|| event.player.world.provider.getDimension() == LepidodendronConfig.dimPrecambrian
				)
		) {
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
							if ((world.getBiome(pos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:hadean_craters")
									|| world.getBiome(pos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:hadean_lava")
									|| world.getBiome(pos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:hadean_smelts")
									|| world.getBiome(pos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:hadean_smelts_helper")
									|| world.getBiome(pos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:precambrian_biome")
									|| world.getBiome(pos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:devonian_springs")
									|| world.getBiome(pos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:carboniferous_volcanic_tarns")
									|| world.getBiome(pos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_south_america_creek_wide_rift")
									|| world.getBiome(pos).getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_shrubland_springs"))
									&& rand.nextInt(150) == 0) {
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

	public static boolean hasTaxidermy(ItemStack itemstack) {
		Class[] params = new Class[1];
		boolean itemRender = false;
		String PNVariant = null;
		params[0] = String.class;
		double offsetWall = 0;
		double upperfrontverticallinedepth = 0;
		double upperbackverticallinedepth = 0;
		double upperfrontlineoffset = 0;
		double upperfrontlineoffsetperpendiular = 0;
		double upperbacklineoffset = 0;
		double upperbacklineoffsetperpendiular = 0;
		double lowerfrontverticallinedepth = 0;
		double lowerbackverticallinedepth = 0;
		double lowerfrontlineoffset = 0;
		double lowerfrontlineoffsetperpendiular = 0;
		double lowerbacklineoffset = 0;
		double lowerbacklineoffsetperpendiular = 0F;
		ResourceLocation textureDisplay = null;
		ModelBase modelDisplay = null;
		float getScaler = 0.0F;

		//Convert oreDict to NBT:
		String id_dna = "";
		String tag = "";
		int[] oreDicts = OreDictionary.getOreIDs(itemstack);
		int var = oreDicts.length;
		for (int var2 = 0; var2 < var; ++var2) {
			int oreDictID = oreDicts[var2];
			String oreName = OreDictionary.getOreName(oreDictID);
			if (oreName.startsWith("mobdnaPN")) {
				id_dna = oreName.substring(8);
				tag = "PFMob";
			}
		}
		if (itemstack.getItem() instanceof ItemGlassCaseDisplayItem) {
			PNVariant = ((ItemGlassCaseDisplayItem)itemstack.getItem()).getVariantStr();
			if (PNVariant != null) {
				if (PNVariant.equalsIgnoreCase("gendered")) {
					if ((new Random()).nextInt(2) == 0) {
						PNVariant = "male";
					} else {
						PNVariant = "female";
					}
				}
			}
		}
		if (itemstack.getItem() instanceof ItemPNTaxidermyItem) {
			PNVariant = ((ItemPNTaxidermyItem)itemstack.getItem()).getVariantStr();
			if (PNVariant != null) {
				if (PNVariant.equalsIgnoreCase("gendered")) {
					if ((new Random()).nextInt(2) == 0) {
						PNVariant = "male";
					}
					else {
						PNVariant = "female";
					}
				}
			}
		}
		ItemStack outputStack = new ItemStack(ItemTaxidermyDisplayItem.block, 1);
		NBTTagCompound parentNBT = new NBTTagCompound();
		parentNBT.setString("id", id_dna);
		NBTTagCompound stackNBT = new NBTTagCompound();
		stackNBT.setTag(tag, parentNBT);
		if (PNVariant != null) {
			stackNBT.setString("PNVariant", PNVariant);
		}
		outputStack.setTagCompound(stackNBT);

		Class classEntity = RenderDisplayWallMount.getEntityFromNBT(outputStack);
		if (classEntity != null) {
			itemRender = false;

			//Is there a variant included?
			if (outputStack.hasTagCompound()) {
				if (outputStack.getTagCompound().hasKey("PNVariant")) {
					PNVariant = outputStack.getTagCompound().getString("PNVariant");
				}
				if (RenderDisplayWallMount.getVariantFromNBT(outputStack) != null) {
					PNVariant = RenderDisplayWallMount.getVariantFromNBT(outputStack);
				}
			}

			Method method = Functions.testAndGetMethod(classEntity, "offsetWall", params);
			if (method != null) {
				try {
					offsetWall = (double) method.invoke(null, PNVariant);
				} catch (Exception e) {
					itemRender = true;
				}
			} else {
				itemRender = true;
			}
			method = Functions.testAndGetMethod(classEntity, "upperfrontverticallinedepth", params);
			if (method != null) {
				try {
					upperfrontverticallinedepth = (double) method.invoke(null, PNVariant);
				} catch (Exception e) {
					itemRender = true;
				}
			} else {
				itemRender = true;
			}
			method = Functions.testAndGetMethod(classEntity, "upperbackverticallinedepth", params);
			if (method != null) {
				try {
					upperbackverticallinedepth = (double) method.invoke(null, PNVariant);
				} catch (Exception e) {
					itemRender = true;
				}
			} else {
				itemRender = true;
			}
			method = Functions.testAndGetMethod(classEntity, "upperfrontlineoffset", params);
			if (method != null) {
				try {
					upperfrontlineoffset = (double) method.invoke(null, PNVariant);
				} catch (Exception e) {
					itemRender = true;
				}
			} else {
				itemRender = true;
			}
			method = Functions.testAndGetMethod(classEntity, "upperfrontlineoffsetperpendiular", params);
			if (method != null) {
				try {
					upperfrontlineoffsetperpendiular = (double) method.invoke(null, PNVariant);
				} catch (Exception e) {
					itemRender = true;
				}
			} else {
				itemRender = true;
			}
			method = Functions.testAndGetMethod(classEntity, "upperbacklineoffset", params);
			if (method != null) {
				try {
					upperbacklineoffset = (double) method.invoke(null, PNVariant);
				} catch (Exception e) {
					itemRender = true;
				}
			} else {
				itemRender = true;
			}
			method = Functions.testAndGetMethod(classEntity, "upperbacklineoffsetperpendiular", params);
			if (method != null) {
				try {
					upperbacklineoffsetperpendiular = (double) method.invoke(null, PNVariant);
				} catch (Exception e) {
					itemRender = true;
				}
			} else {
				itemRender = true;
			}
			method = Functions.testAndGetMethod(classEntity, "lowerfrontverticallinedepth", params);
			if (method != null) {
				try {
					lowerfrontverticallinedepth = (double) method.invoke(null, PNVariant);
				} catch (Exception e) {
					itemRender = true;
				}
			} else {
				itemRender = true;
			}
			method = Functions.testAndGetMethod(classEntity, "lowerbackverticallinedepth", params);
			if (method != null) {
				try {
					lowerbackverticallinedepth = (double) method.invoke(null, PNVariant);
				} catch (Exception e) {
					itemRender = true;
				}
			} else {
				itemRender = true;
			}
			method = Functions.testAndGetMethod(classEntity, "lowerfrontlineoffset", params);
			if (method != null) {
				try {
					lowerfrontlineoffset = (double) method.invoke(null, PNVariant);
				} catch (Exception e) {
					itemRender = true;
				}
			} else {
				itemRender = true;
			}
			method = Functions.testAndGetMethod(classEntity, "lowerfrontlineoffsetperpendiular", params);
			if (method != null) {
				try {
					lowerfrontlineoffsetperpendiular = (double) method.invoke(null, PNVariant);
				} catch (Exception e) {
					itemRender = true;
				}
			} else {
				itemRender = true;
			}
			method = Functions.testAndGetMethod(classEntity, "lowerbacklineoffset", params);
			if (method != null) {
				try {
					lowerbacklineoffset = (double) method.invoke(null, PNVariant);
				} catch (Exception e) {
					itemRender = true;
				}
			} else {
				itemRender = true;
			}
			method = Functions.testAndGetMethod(classEntity, "lowerbacklineoffsetperpendiular", params);
			if (method != null) {
				try {
					lowerbacklineoffsetperpendiular = (double) method.invoke(null, PNVariant);
				} catch (Exception e) {
					itemRender = true;
				}
			} else {
				itemRender = true;
			}
			method = Functions.testAndGetMethod(classEntity, "textureDisplay", params);
			if (method != null) {
				try {
					textureDisplay = (ResourceLocation) method.invoke(null, PNVariant);
				} catch (Exception e) {
					itemRender = true;
				}
			} else {
				itemRender = true;
			}
			method = Functions.testAndGetMethod(classEntity, "modelDisplay", params);
			if (method != null) {
				try {
					modelDisplay = (ModelBase) method.invoke(null, PNVariant);
				} catch (Exception e) {
					itemRender = true;
				}
			} else {
				itemRender = true;
			}
			method = Functions.testAndGetMethod(classEntity, "getScaler", params);
			if (method != null) {
				try {
					getScaler = (float) method.invoke(null, PNVariant);
				} catch (Exception e) {
					itemRender = true;
				}
			} else {
				itemRender = true;
			}
		}
		else {
			itemRender = true;
		}

		if (itemRender) {
			return false;
		}

		return testRenderTaxidermy(EnumFacing.UP, modelDisplay)
				|| testRenderTaxidermy(EnumFacing.DOWN, modelDisplay)
				|| testRenderTaxidermy(EnumFacing.NORTH, modelDisplay);
	}

	public static boolean testRenderTaxidermy(EnumFacing facing, ModelBase model) {

		boolean flag1 = true;
		boolean flag2 = true;
		boolean flag3 = true;

		if (facing == EnumFacing.DOWN) {
			Method renderMethod = Functions.testAndGetMethod(model.getClass(), "renderStaticSuspended", new Class[]{float.class});
			if (renderMethod == null) {
				flag1 = false;
			}
		} else if (facing == EnumFacing.UP) {
			Method renderMethod = Functions.testAndGetMethod(model.getClass(), "renderStaticFloor", new Class[]{float.class});
			if (renderMethod == null) {
				flag2 = false;
			}
		} else if (facing == EnumFacing.NORTH) {
			Method renderMethod = Functions.testAndGetMethod(model.getClass(), "renderStaticWall", new Class[]{float.class});
			if (renderMethod == null) {
				flag3 = false;
			}
		}
		return flag1 || flag2 || flag3;
	}

	@SideOnly(Side.CLIENT) //Tooltips for vanilla items etc
	@SubscribeEvent
	public void onEvent(ItemTooltipEvent event) throws NoSuchMethodException {

		if (event.getItemStack().getItem() instanceof ItemPNTaxidermyItem) {
			List<String> tt = event.getToolTip();
			tt.add("Can be turned into taxidermy");
			if (!hasTaxidermy(event.getItemStack())) {
				tt.add("Sorry: not yet coded for this item");
			}
		}
		if (event.getItemStack().getItem() instanceof ItemGlassCaseDisplayItem) {
			List<String> tt = event.getToolTip();
			tt.add("Can be displayed in the Entomology Display Case");
			tt.add("Can be turned into taxidermy");
			if (!hasTaxidermy(event.getItemStack())) {
				tt.add("Sorry: not yet coded for this item");
			}
		}

		if (Block.getBlockFromItem(event.getItemStack().getItem()) instanceof BlockFossil) {
			List<String> tt = event.getToolTip();
			if (Block.getBlockFromItem(event.getItemStack().getItem()) == BlockFossilPrecambrian.block) {
				tt.add("Time Research x13");
				tt.add(TextFormatting.DARK_RED + "Precambrian");
			}
			else if (Block.getBlockFromItem(event.getItemStack().getItem()) == BlockFossilCambrian.block) {
				tt.add("Time Research x12");
				tt.add(TextFormatting.DARK_GREEN + "Cambrian");
			}
			else if (Block.getBlockFromItem(event.getItemStack().getItem()) == BlockFossilOrdovician.block) {
				tt.add("Time Research x11");
				tt.add(TextFormatting.DARK_AQUA + "Ordovician");
			}
			else if (Block.getBlockFromItem(event.getItemStack().getItem()) == BlockFossilSilurian.block) {
				tt.add("Time Research x10");
				tt.add(TextFormatting.AQUA + "Silurian");
			}
			else if (Block.getBlockFromItem(event.getItemStack().getItem()) == BlockFossilDevonian.block) {
				tt.add("Time Research x9");
				tt.add(TextFormatting.GOLD + "Devonian");
			}
			else if (Block.getBlockFromItem(event.getItemStack().getItem()) == BlockFossilCarboniferous.block) {
				tt.add("Time Research x8");
				tt.add(TextFormatting.DARK_BLUE + "Carboniferous");
			}
			else if (Block.getBlockFromItem(event.getItemStack().getItem()) == BlockFossilPermian.block) {
				tt.add("Time Research x7");
				tt.add(TextFormatting.RED + "Permian");
			}
			else if (Block.getBlockFromItem(event.getItemStack().getItem()) == BlockFossilTriassic.block) {
				tt.add("Time Research x6");
				tt.add(TextFormatting.DARK_PURPLE + "Triassic");
			}
			else if (Block.getBlockFromItem(event.getItemStack().getItem()) == BlockFossilJurassic.block) {
				tt.add("Time Research x5");
				tt.add(TextFormatting.BLUE + "Jurassic");
			}
			else if (Block.getBlockFromItem(event.getItemStack().getItem()) == BlockFossilCretaceous.block) {
				tt.add("Time Research x8");
				tt.add(TextFormatting.GREEN + "Cretaceous");
			}
			else if (Block.getBlockFromItem(event.getItemStack().getItem()) == BlockFossilPaleogene.block) {
				tt.add("Time Research x3");
				tt.add(TextFormatting.GOLD + "Paleogene");
			}
			else if (Block.getBlockFromItem(event.getItemStack().getItem()) == BlockFossilNeogene.block) {
				tt.add("Time Research x2");
				tt.add(TextFormatting.YELLOW + "Neogene");
			}
			else if (Block.getBlockFromItem(event.getItemStack().getItem()) == BlockFossilPleistocene.block) {
				tt.add("Time Research x1");
				tt.add(TextFormatting.GRAY + "Pleistocene");
			}
		}
		else if (event.getItemStack().getItem() == ItemFossilPrecambrian.block) {
			List<String> tt = event.getToolTip();
			tt.add("Time Research x26");
			tt.add(TextFormatting.DARK_RED + "Precambrian");
		}
		else if (event.getItemStack().getItem() == ItemFossilCambrian.block) {
			List<String> tt = event.getToolTip();
			tt.add("Time Research x24");
			tt.add(TextFormatting.DARK_GREEN + "Cambrian");
		}
		else if (event.getItemStack().getItem() == ItemFossilOrdovician.block) {
			List<String> tt = event.getToolTip();
			tt.add("Time Research x22");
			tt.add(TextFormatting.DARK_AQUA + "Ordovician");
		}
		else if (event.getItemStack().getItem() == ItemFossilSilurian.block) {
			List<String> tt = event.getToolTip();
			tt.add("Time Research x20");
			tt.add(TextFormatting.AQUA + "Silurian");
		}
		else if (event.getItemStack().getItem() == ItemFossilDevonian.block) {
			List<String> tt = event.getToolTip();
			tt.add("Time Research x18");
			tt.add(TextFormatting.GOLD + "Devonian");
		}
		else if (event.getItemStack().getItem() == ItemFossilCarboniferous.block) {
			List<String> tt = event.getToolTip();
			tt.add("Time Research x16");
			tt.add(TextFormatting.DARK_BLUE + "Carboniferous");
		}
		else if (event.getItemStack().getItem() == ItemFossilPermian.block) {
			List<String> tt = event.getToolTip();
			tt.add("Time Research x14");
			tt.add(TextFormatting.RED + "Permian");
		}
		else if (event.getItemStack().getItem() == ItemFossilTriassic.block) {
			List<String> tt = event.getToolTip();
			tt.add("Time Research x12");
			tt.add(TextFormatting.DARK_PURPLE + "Triassic");
		}
		else if (event.getItemStack().getItem() == ItemFossilJurassic.block) {
			List<String> tt = event.getToolTip();
			tt.add("Time Research x10");
			tt.add(TextFormatting.BLUE + "Jurassic");
		}
		else if (event.getItemStack().getItem() == ItemFossilCretaceous.block) {
			List<String> tt = event.getToolTip();
			tt.add("Time Research x16");
			tt.add(TextFormatting.GREEN + "Cretaceous");
		}
		else if (event.getItemStack().getItem() == ItemFossilPaleogene.block) {
			List<String> tt = event.getToolTip();
			tt.add("Time Research x6");
			tt.add(TextFormatting.GOLD + "Paleogene");
		}
		else if (event.getItemStack().getItem() == ItemFossilNeogene.block) {
			List<String> tt = event.getToolTip();
			tt.add("Time Research x4");
			tt.add(TextFormatting.YELLOW + "Neogene");
		}
		else if (event.getItemStack().getItem() == ItemFossilPleistocene.block) {
			List<String> tt = event.getToolTip();
			tt.add("Time Research x2");
			tt.add(TextFormatting.GRAY + "Pleistocene");
		}
		if (event.getItemStack().getItem() == ItemFossilClean.block
				|| event.getItemStack().getItem() == ItemPhialDNA.block
				|| event.getItemStack().getItem() == ItemPlaceableLiving.block) {
			if (event.getItemStack().hasTagCompound()) {
				if (event.getItemStack().getTagCompound().hasKey("period")) {
					List<String> tt = event.getToolTip();
					if (event.getItemStack().getItem() == ItemFossilClean.block) {
						tt.add("Time Research x30");
					}
					if (event.getItemStack().getItem() == ItemPhialDNA.block) {
						tt.add("Time Research x40");
					}
					if (event.getItemStack().getItem() == ItemPlaceableLiving.block) {
						tt.add("Time Research x50");
					}
					int period = event.getItemStack().getTagCompound().getInteger("period");
					switch (period) {
						case 1: default:
							tt.add(TextFormatting.DARK_RED + "Precambrian");
							break;

						case 2:
							tt.add(TextFormatting.DARK_GREEN + "Cambrian");
							break;

						case 3:
							tt.add(TextFormatting.DARK_AQUA + "Ordovician");
							break;

						case 4:
							tt.add(TextFormatting.AQUA + "Silurian");
							break;

						case 5:
							tt.add(TextFormatting.GOLD + "Devonian");
							break;

						case 6:
							tt.add(TextFormatting.DARK_BLUE + "Carboniferous");
							break;

						case 7:
							tt.add(TextFormatting.RED + "Permian");
							break;

						case 8:
							tt.add(TextFormatting.DARK_PURPLE + "Triassic");
							break;

						case 9:
							tt.add(TextFormatting.BLUE + "Jurassic");
							break;

						case 10:
							tt.add(TextFormatting.GREEN + "Cretaceous");
							break;

						case 11:
							tt.add(TextFormatting.GOLD + "Paleogene");
							break;

						case 12:
							tt.add(TextFormatting.YELLOW + "Neogene");
							break;

						case 13:
							tt.add(TextFormatting.GRAY + "Pleistocene");
							break;
					}
				}
			}
		}

		if (event.getItemStack().getItem().getRegistryName().toString().equalsIgnoreCase("patchouli:guide_book")) {
			if (event.getItemStack().getTagCompound() != null) {
				if (event.getItemStack().getTagCompound().toString().contains("lepidodendron:paleopedia")) {
					List<String> tt = event.getToolTip();
					tt.add(ClientProxyLepidodendronMod.keyPalaeopdeiaOpen.getDisplayName() + " " + I18n.translateToLocal("tooltip.palaeopedia.name").trim());
					if (event.getEntityPlayer() != null) {
						DecimalFormat df = new DecimalFormat("##0.00");
						IPaleopediaStatsPrecambrian statsPrecambrian = event.getEntityPlayer().getCapability(PaleopediaStatsProviderPrecambrian.PALEOPEDIA_STATS, null);
						IPaleopediaStatsPrecambrianCompleted statsPrecambrianComplete = event.getEntityPlayer().getCapability(PaleopediaStatsProviderPrecambrianCompleted.PALEOPEDIA_STATS, null);
						IPaleopediaStatsCambrian statsCambrian = event.getEntityPlayer().getCapability(PaleopediaStatsProviderCambrian.PALEOPEDIA_STATS, null);
						IPaleopediaStatsCambrianCompleted statsCambrianComplete = event.getEntityPlayer().getCapability(PaleopediaStatsProviderCambrianCompleted.PALEOPEDIA_STATS, null);
						IPaleopediaStatsOrdovician statsOrdovician = event.getEntityPlayer().getCapability(PaleopediaStatsProviderOrdovician.PALEOPEDIA_STATS, null);
						IPaleopediaStatsOrdovicianCompleted statsOrdovicianComplete = event.getEntityPlayer().getCapability(PaleopediaStatsProviderOrdovicianCompleted.PALEOPEDIA_STATS, null);
						IPaleopediaStatsSilurian statsSilurian = event.getEntityPlayer().getCapability(PaleopediaStatsProviderSilurian.PALEOPEDIA_STATS, null);
						IPaleopediaStatsSilurianCompleted statsSilurianComplete = event.getEntityPlayer().getCapability(PaleopediaStatsProviderSilurianCompleted.PALEOPEDIA_STATS, null);
						IPaleopediaStatsDevonian statsDevonian = event.getEntityPlayer().getCapability(PaleopediaStatsProviderDevonian.PALEOPEDIA_STATS, null);
						IPaleopediaStatsDevonianCompleted statsDevonianComplete = event.getEntityPlayer().getCapability(PaleopediaStatsProviderDevonianCompleted.PALEOPEDIA_STATS, null);
						IPaleopediaStatsCarboniferous statsCarboniferous = event.getEntityPlayer().getCapability(PaleopediaStatsProviderCarboniferous.PALEOPEDIA_STATS, null);
						IPaleopediaStatsCarboniferousCompleted statsCarboniferousComplete = event.getEntityPlayer().getCapability(PaleopediaStatsProviderCarboniferousCompleted.PALEOPEDIA_STATS, null);
						IPaleopediaStatsPermian statsPermian = event.getEntityPlayer().getCapability(PaleopediaStatsProviderPermian.PALEOPEDIA_STATS, null);
						IPaleopediaStatsPermianCompleted statsPermianComplete = event.getEntityPlayer().getCapability(PaleopediaStatsProviderPermianCompleted.PALEOPEDIA_STATS, null);
						IPaleopediaStatsTriassic statsTriassic = event.getEntityPlayer().getCapability(PaleopediaStatsProviderTriassic.PALEOPEDIA_STATS, null);
						IPaleopediaStatsTriassicCompleted statsTriassicComplete = event.getEntityPlayer().getCapability(PaleopediaStatsProviderTriassicCompleted.PALEOPEDIA_STATS, null);
						IPaleopediaStatsJurassic statsJurassic = event.getEntityPlayer().getCapability(PaleopediaStatsProviderJurassic.PALEOPEDIA_STATS, null);
						IPaleopediaStatsJurassicCompleted statsJurassicComplete = event.getEntityPlayer().getCapability(PaleopediaStatsProviderJurassicCompleted.PALEOPEDIA_STATS, null);
						IPaleopediaStatsCretaceousEarly statsCretaceousEarly = event.getEntityPlayer().getCapability(PaleopediaStatsProviderCretaceousEarly.PALEOPEDIA_STATS, null);
						IPaleopediaStatsCretaceousEarlyCompleted statsCretaceousEarlyComplete = event.getEntityPlayer().getCapability(PaleopediaStatsProviderCretaceousEarlyCompleted.PALEOPEDIA_STATS, null);
						IPaleopediaStatsCretaceousLate statsCretaceousLate = event.getEntityPlayer().getCapability(PaleopediaStatsProviderCretaceousLate.PALEOPEDIA_STATS, null);
						IPaleopediaStatsCretaceousLateCompleted statsCretaceousLateComplete = event.getEntityPlayer().getCapability(PaleopediaStatsProviderCretaceousLateCompleted.PALEOPEDIA_STATS, null);
						IPaleopediaStatsPaleogene statsPaleogene = event.getEntityPlayer().getCapability(PaleopediaStatsProviderPaleogene.PALEOPEDIA_STATS, null);
						IPaleopediaStatsPaleogeneCompleted statsPaleogeneComplete = event.getEntityPlayer().getCapability(PaleopediaStatsProviderPaleogeneCompleted.PALEOPEDIA_STATS, null);
						IPaleopediaStatsNeogene statsNeogene = event.getEntityPlayer().getCapability(PaleopediaStatsProviderNeogene.PALEOPEDIA_STATS, null);
						IPaleopediaStatsNeogeneCompleted statsNeogeneComplete = event.getEntityPlayer().getCapability(PaleopediaStatsProviderNeogeneCompleted.PALEOPEDIA_STATS, null);
						IPaleopediaStatsPleistocene statsPleistocene = event.getEntityPlayer().getCapability(PaleopediaStatsProviderPleistocene.PALEOPEDIA_STATS, null);
						IPaleopediaStatsPleistoceneCompleted statsPleistoceneComplete = event.getEntityPlayer().getCapability(PaleopediaStatsProviderPleistoceneCompleted.PALEOPEDIA_STATS, null);
						tt.add(TextFormatting.DARK_RED + "Precambrian: " + (int)statsPrecambrianComplete.getStats() + " of " + (int)statsPrecambrian.getStats() + " (" + df.format(100.00 * ((double)statsPrecambrianComplete.getStats()/statsPrecambrian.getStats())) + "%)");
						tt.add(TextFormatting.DARK_GREEN + "Cambrian: " + (int)statsCambrianComplete.getStats() + " of " + (int)statsCambrian.getStats() + " (" + df.format(100.00 * ((double)statsCambrianComplete.getStats()/statsCambrian.getStats())) + "%)");
						tt.add(TextFormatting.DARK_AQUA + "Ordovician: " + (int)statsOrdovicianComplete.getStats() + " of " + (int)statsOrdovician.getStats() + " (" + df.format(100.00 * ((double)statsOrdovicianComplete.getStats()/statsOrdovician.getStats())) + "%)");
						tt.add(TextFormatting.AQUA + "Silurian: " + (int)statsSilurianComplete.getStats() + " of " + (int)statsSilurian.getStats() + " (" + df.format(100.00 * ((double)statsSilurianComplete.getStats()/statsSilurian.getStats())) + "%)");
						tt.add(TextFormatting.GOLD + "Devonian: " + (int)statsDevonianComplete.getStats() + " of " + (int)statsDevonian.getStats() + " (" + df.format(100.00 * ((double)statsDevonianComplete.getStats()/statsDevonian.getStats())) + "%)");
						tt.add(TextFormatting.DARK_BLUE + "Carboniferous: " + (int)statsCarboniferousComplete.getStats() + " of " + (int)statsCarboniferous.getStats() + " (" + df.format(100.00 * ((double)statsCarboniferousComplete.getStats()/statsCarboniferous.getStats())) + "%)");
						tt.add(TextFormatting.RED + "Permian: " + (int)statsPermianComplete.getStats() + " of " + (int)statsPermian.getStats() + " (" + df.format(100.00 * ((double)statsPermianComplete.getStats()/statsPermian.getStats())) + "%)");
						tt.add(TextFormatting.DARK_PURPLE + "Triassic: " + (int)statsTriassicComplete.getStats() + " of " + (int)statsTriassic.getStats() + " (" + df.format(100.00 * ((double)statsTriassicComplete.getStats()/statsTriassic.getStats())) + "%)");
						tt.add(TextFormatting.BLUE + "Jurassic: " + (int)statsJurassicComplete.getStats() + " of " + (int)statsJurassic.getStats() + " (" + df.format(100.00 * ((double)statsJurassicComplete.getStats()/statsJurassic.getStats())) + "%)");
						tt.add(TextFormatting.GREEN + "Early Cretaceous: " + (int)statsCretaceousEarlyComplete.getStats() + " of " + (int)statsCretaceousEarly.getStats() + " (" + df.format(100.00 * ((double)statsCretaceousEarlyComplete.getStats()/statsCretaceousEarly.getStats())) + "%)");
						tt.add(TextFormatting.GREEN + "Late Cretaceous: " + (int)statsCretaceousLateComplete.getStats() + " of " + (int)statsCretaceousLate.getStats() + " (" + df.format(100.00 * ((double)statsCretaceousLateComplete.getStats()/statsCretaceousLate.getStats())) + "%)");
						tt.add(TextFormatting.GOLD + "Paleogene: " + (int)statsPaleogeneComplete.getStats() + " of " + (int)statsPaleogene.getStats() + " (" + df.format(100.00 * ((double)statsPaleogeneComplete.getStats()/statsPaleogene.getStats())) + "%)");
						tt.add(TextFormatting.YELLOW + "Neogene: " + (int)statsNeogeneComplete.getStats() + " of " + (int)statsNeogene.getStats() + " (" + df.format(100.00 * ((double)statsNeogeneComplete.getStats()/statsNeogene.getStats())) + "%)");
						tt.add(TextFormatting.GRAY + "Pleistocene: " + (int)statsPleistoceneComplete.getStats() + " of " + (int)statsPleistocene.getStats() + " (" + df.format(100.00 * ((double)statsPleistoceneComplete.getStats()/statsPleistocene.getStats())) + "%)");

//						tt.add(TextFormatting.DARK_GREEN + "Cambrian" + PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 1, false));
//						tt.add(TextFormatting.DARK_AQUA + "Ordovician" + PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 2, false));
//						tt.add(TextFormatting.AQUA + "Silurian" + PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 3, false));
//						tt.add(TextFormatting.GOLD + "Devonian" + PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 4, false));
//						tt.add(TextFormatting.DARK_BLUE + "Carboniferous" + PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 5, false));
//						tt.add(TextFormatting.RED + "Permian" + PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 6, false));
//						tt.add(TextFormatting.DARK_PURPLE + "Triassic" + PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 7, false));
//						tt.add(TextFormatting.BLUE + "Jurassic" + PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 8, false));
//						tt.add(TextFormatting.GREEN + "Early Cretaceous" + PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 9, false));
//						tt.add(TextFormatting.GREEN + "Late Cretaceous" + PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 10, false));
//						tt.add(TextFormatting.GOLD + "Paleogene" + PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 11, false));
//						tt.add(TextFormatting.YELLOW + "Neogene" + PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 12, false));
//						tt.add(TextFormatting.GRAY + "Pleistocene" + PercentageCollected.getPercentagePerDimension(event.getEntityPlayer(), 13, false));
					}
				}
			}
		}

		if (event.getItemStack().getItem() == Item.getItemFromBlock(Blocks.SAPLING)) {
			List<String> tt = event.getToolTip();
			if (LepidodendronConfig.showTooltips) {
				switch (event.getItemStack().getMetadata()) {
					case 0:
					default: //Oak
						tt.add("Type: Flowering tree");
						tt.add("Periods: [Late Cretaceous (?) - ] Paleogene  - Neogene - Pleistocene - present");
						tt.add("Propagation: acorns drop from leaves");
						break;

					case 1: //Spruce
						tt.add("Type: Coniferous tree");
						tt.add("Periods: Early Cretaceous (?) - Late Cretaceous - Paleogene  - Neogene - Pleistocene - present");
						tt.add("Propagation: fruit/cone");
						break;

					case 2: //Birch
						tt.add("Type: Flowering tree");
						tt.add("Periods: Paleogene  - Neogene - Pleistocene - present");
						tt.add("Propagation: fruits drop from leaves");
						break;

					case 3: //Jungle
						tt.add("Type: Flowering tree");
						tt.add("Periods: Paleogene  - Neogene - Pleistocene - present");
						tt.add("Propagation: fruits drop from leaves");
						break;

					case 4: //Acacia
						tt.add("Type: Flowering tree");
						tt.add("Periods: Paleogene  - Neogene - Pleistocene - present");
						tt.add("Propagation: fruits drop from leaves");
						break;

					case 5: //Dark Oak
						tt.add("Type: Flowering tree");
						tt.add("Periods: [Late Cretaceous (?) - ] Paleogene  - Neogene - Pleistocene - present");
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

		if (OreDictionary.containsMatch(false, OreDictionary.getOres("logResin"),
				event.getItemStack())) {
			List<String> tt = event.getToolTip();
			try {
				tt.add(I18n.translateToLocal("helper.pf_resinable.name"));
			} catch (Throwable throwable) {
				//Do nothing - it's all good
			}
		}

		if (OreDictionary.containsMatch(false, OreDictionary.getOres("logLatex"),
				event.getItemStack())) {
			List<String> tt = event.getToolTip();
			try {
				tt.add(I18n.translateToLocal("helper.pf_latexable.name"));
			} catch (Throwable throwable) {
				//Do nothing - it's all good
			}
		}

		if (event.getItemStack().getItem().getRegistryName().toString().equalsIgnoreCase("lepidodendron:rubber_boots")) {
			List<String> tt = event.getToolTip();
			try {
				tt.add(I18n.translateToLocal("helper.pf_rubber_boots.name"));
			} catch (Throwable throwable) {
				//Do nothing - it's all good
			}
		}

	}

//	@SubscribeEvent //Add portal fossil trades
//	public void onEvent(MerchantTradeOffersEvent event) {
//		if (event.getMerchant() == null || event.getList() == null) {
//			return;
//		}
//		int i = -1;
//		if ((!event.getList().isEmpty()) && (!event.getMerchant().getWorld().isRemote)) {
//			MerchantRecipeList MerchantRecipeFinal = (MerchantRecipeList) event.getList().clone();
//			for (MerchantRecipe recipe: event.getList()) {
//				i ++;
//				if (recipe.getItemToSell().getItem() == ItemFossilClean.block) {
//					if (!recipe.getItemToSell().hasTagCompound()) {
//						MerchantRecipeFinal.remove(i);
//
//						ItemStack stackPrototaxites = new ItemStack(ItemFossilClean.block, 1);
//						NBTTagCompound plantNBT = new NBTTagCompound();
//						plantNBT.setString("id", "lepidodendron:prototaxites");
//						NBTTagCompound stackNBT = new NBTTagCompound();
//						stackNBT.setTag("PFPlant", plantNBT);
//						stackPrototaxites.setTagCompound(stackNBT);
//						MerchantRecipe recipePrototaxites = new MerchantRecipe(new ItemStack(Items.EMERALD, 5), stackPrototaxites);
//						MerchantRecipeFinal.add(recipePrototaxites);
//
//						ItemStack stackArchaeopteris = new ItemStack(ItemFossilClean.block, 1);
//						plantNBT = new NBTTagCompound();
//						plantNBT.setString("id", "lepidodendron:archaeopteris_sapling");
//						stackNBT = new NBTTagCompound();
//						stackNBT.setTag("PFPlant", plantNBT);
//						stackArchaeopteris.setTagCompound(stackNBT);
//						MerchantRecipe recipeArchaeopteris = new MerchantRecipe(new ItemStack(Items.EMERALD, 5), stackArchaeopteris);
//						MerchantRecipeFinal.add(recipeArchaeopteris);
//
//						ItemStack stackCalamites = new ItemStack(ItemFossilClean.block, 1);
//						plantNBT = new NBTTagCompound();
//						plantNBT.setString("id", "lepidodendron:calamites_sapling");
//						stackNBT = new NBTTagCompound();
//						stackNBT.setTag("PFPlant", plantNBT);
//						stackCalamites.setTagCompound(stackNBT);
//						MerchantRecipe recipeCalamites = new MerchantRecipe(new ItemStack(Items.EMERALD, 5), stackCalamites);
//						MerchantRecipeFinal.add(recipeCalamites);
//
//						ItemStack stackGlossopteris = new ItemStack(ItemFossilClean.block, 1);
//						plantNBT = new NBTTagCompound();
//						plantNBT.setString("id", "lepidodendron:glossopterissapling");
//						stackNBT = new NBTTagCompound();
//						stackNBT.setTag("PFPlant", plantNBT);
//						stackGlossopteris.setTagCompound(stackNBT);
//						MerchantRecipe recipeGlossopteris = new MerchantRecipe(new ItemStack(Items.EMERALD, 5), stackGlossopteris);
//						MerchantRecipeFinal.add(recipeGlossopteris);
//
//						ItemStack stackDicroidium = new ItemStack(ItemFossilClean.block, 1);
//						plantNBT = new NBTTagCompound();
//						plantNBT.setString("id", "lepidodendron:dicroidium_f_sapling");
//						stackNBT = new NBTTagCompound();
//						stackNBT.setTag("PFPlant", plantNBT);
//						stackDicroidium.setTagCompound(stackNBT);
//						MerchantRecipe recipeDicroidium = new MerchantRecipe(new ItemStack(Items.EMERALD, 5), stackDicroidium);
//						MerchantRecipeFinal.add(recipeDicroidium);
//
//						ItemStack stackGinkgo = new ItemStack(ItemFossilClean.block, 1);
//						plantNBT = new NBTTagCompound();
//						plantNBT.setString("id", "lepidodendron:ginkgo_sapling");
//						stackNBT = new NBTTagCompound();
//						stackNBT.setTag("PFPlant", plantNBT);
//						stackGinkgo.setTagCompound(stackNBT);
//						MerchantRecipe recipeGinkgo = new MerchantRecipe(new ItemStack(Items.EMERALD, 5), stackGinkgo);
//						MerchantRecipeFinal.add(recipeGinkgo);
//					}
//				}
//			}
//			event.setList(MerchantRecipeFinal);
//		}
//	}

	@SubscribeEvent //Make obsidian variants
	public void onEvent(BlockEvent.FluidPlaceBlockEvent event) {
		if (!event.getWorld().isRemote) {
			if (event.getWorld().getBlockState(event.getPos()).getBlock() == BlockAcid.block
				&& event.getNewState() == Blocks.STONE.getDefaultState()) {
				event.setNewState(BlockLavaRock.block.getDefaultState());
			}
			else if (event.getState().getBlock() == Blocks.OBSIDIAN) {
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

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public void spawnClientMeteors(ClientTickEvent event) {
		
		Minecraft mc = Minecraft.getMinecraft();

		 if (event.phase == Phase.START && !Minecraft.getMinecraft().isGamePaused()) {
	            // Check if the player is in the specified dimension
	        EntityPlayer player = Minecraft.getMinecraft().player;
	        WorldClient world = Minecraft.getMinecraft().world;

         	Random rand = new Random();
         
         	if(world != null)
         	{
         		if(world.provider.getDimension() == LepidodendronConfig.dimOrdovician)
         		{
         			if(rand.nextInt(64)==0)
                 	{
                         	Meteor meteor = new Meteor((player.posX+rand.nextInt(16000))-8000, 2017, (player.posZ+rand.nextInt(16000))-8000);
                         	meteors.add(meteor);
                 	}
         		}
         		
         		if(world.provider.getDimension() == LepidodendronConfig.dimPrecambrian)
         		{
         			BlockPos pos = new BlockPos(player.posX,0,player.posZ);
         			Biome biome = player.world.getBiome(pos);
             		if(biome  instanceof BiomePrecambrian)
             		{
             			if (((BiomePrecambrian)biome).getBiomeType() == EnumBiomeTypePrecambrian.Archean) {
                 			if(rand.nextInt(32)==0)
                         	{
                                 	Meteor meteor = new Meteor((player.posX+rand.nextInt(16000))-8000, 2017, (player.posZ+rand.nextInt(16000))-8000, MeteorType.STANDARD, (rand.nextFloat()*100)-50, -20.8, (rand.nextFloat()*100)-50);
                                 	meteors.add(meteor);
                         	}
             			}
             			if (((BiomePrecambrian)biome).getBiomeType() == EnumBiomeTypePrecambrian.Hadean) {
                 			if(rand.nextInt(4)==0)
                         	{
                 				Meteor meteor = new Meteor((player.posX+rand.nextInt(16000))-8000, 2017, (player.posZ+rand.nextInt(16000))-8000, MeteorType.STANDARD, (rand.nextFloat()*100)-50, -20.8, (rand.nextFloat()*100)-50);
                                 	meteors.add(meteor);
                         	}
             			}
             		}
         		}
         	}
	        
			for(Meteor meteor : meteors) {
				if(!Minecraft.getMinecraft().isGamePaused())
				meteor.update();
			}
			for(Meteor fragment : fragments) {
				if(!Minecraft.getMinecraft().isGamePaused())
				fragment.update();
			}
			for(Meteor smoke : smoke) {
				if(!Minecraft.getMinecraft().isGamePaused())
				smoke.update();
			}
			meteors.removeIf(x -> x.isDead);
			fragments.removeIf(x -> x.isDead);
			smoke.removeIf(x -> x.isDead);
		 }
	}


	public static void renderMeteorGlow(double y, float partialTicks) {
		GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_BLEND);
		float f4 = 1.0F;
		float f5 = 0.5F;
		float f6 = 0.5F;
        GL11.glRotatef(180.0F - Minecraft.getMinecraft().getRenderManager().playerViewY, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-Minecraft.getMinecraft().getRenderManager().playerViewX, 1.0F, 0.0F, 0.0F);    
        double visibility = (1-Minecraft.getMinecraft().world.rainingStrength);
		GL11.glColor4d(visibility, visibility, visibility, visibility);
		Tessellator tess = Tessellator.getInstance();
		TextureManager tex = Minecraft.getMinecraft().getTextureManager();
		BufferBuilder buff = tess.getBuffer();
		buff.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX_NORMAL);
		
		buff.pos(0.0F - f5, 0.0F - f6, 0.0D).tex(1, 0).normal(0.0F, 1.0F, 0.0F).endVertex();
		buff.pos(f4 - f5, 0.0F - f6, 0.0D).tex(0, 0).normal(0.0F, 1.0F, 0.0F).endVertex();
		buff.pos(f4 - f5, f4 - f6, 0.0D).tex(0, 1).normal(0.0F, 1.0F, 0.0F).endVertex();
		buff.pos(0.0F - f5, f4 - f6, 0.0D).tex(1, 1).normal(0.0F, 1.0F, 0.0F).endVertex();
		tex.bindTexture(new ResourceLocation(LepidodendronMod.MODID + ":textures/environment/meteor.png"));
		tess.draw();
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();

	}
	
	public static void renderMeteorSmoke(long age) {
		GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_BLEND);
		float f4 = 1.0F;
		float f5 = 0.5F;
		float f6 = 0.5F;
		float visibility = (1-Minecraft.getMinecraft().world.rainingStrength) - Math.min(((float)(age) / (float)(100f * 0.35F)), 1f);
        GL11.glRotatef(180.0F - Minecraft.getMinecraft().getRenderManager().playerViewY, 0.0F, 1.0F, 0.0F);
        GL11.glRotatef(-Minecraft.getMinecraft().getRenderManager().playerViewX, 1.0F, 0.0F, 0.0F);
		GL11.glColor4d(0.75*visibility, 0.75*visibility, 0.65*visibility, 1);
		Tessellator tess = Tessellator.getInstance();
		TextureManager tex = Minecraft.getMinecraft().getTextureManager();
		BufferBuilder buff = tess.getBuffer();
		buff.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX_NORMAL);
		
		buff.pos(0.0F - f5, 0.0F - f6, 0.0D).tex(1, 0).normal(0.0F, 1.0F, 0.0F).endVertex();
		buff.pos(f4 - f5, 0.0F - f6, 0.0D).tex(0, 0).normal(0.0F, 1.0F, 0.0F).endVertex();
		buff.pos(f4 - f5, f4 - f6, 0.0D).tex(0, 1).normal(0.0F, 1.0F, 0.0F).endVertex();
		buff.pos(0.0F - f5, f4 - f6, 0.0D).tex(1, 1).normal(0.0F, 1.0F, 0.0F).endVertex();

		tex.bindTexture(new ResourceLocation(LepidodendronMod.MODID + ":textures/environment/meteorsmoke.png"));
		tess.draw();
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();

	}

	
	public static class Meteor {

		public double posX;
		public double posY;
		public double posZ;
		public double prevPosX;
		public double prevPosY;
		public double prevPosZ;
		public double motionX;
		public double motionY;
		public double motionZ;
		public double size;
		public boolean isDead = false;
		public long age;
		public long maxAge;
		public MeteorType type;

		public Meteor(double posX, double posY, double posZ)
		{
			this(posX, posY, posZ, MeteorType.STANDARD, -31.2, -20.8, 0);
		}

		public Meteor(double posX, double posY, double posZ, MeteorType type, double motionX, double motionY, double motionZ) {
			this.posX = posX;
			this.posY = posY;
			this.posZ = posZ;
			this.type = type;
			this.motionX = motionX;
			this.motionY = motionY;
			this.motionZ = motionZ;
			//System.out.println("Added"+this.posX+" "+this.posY+" "+this.posZ);
		}

		private void update() {
			//this.isDead=true;
			Random rand = new Random();
			if(this.type != MeteorType.SMOKE && this.type != MeteorType.FRAGMENT)
			{
				Meteor meteor = new Meteor((this.posX+rand.nextInt(16))-8, (this.posY+rand.nextInt(16)), (this.posZ+rand.nextInt(16))-8, MeteorType.SMOKE,0,0,0);
				meteor.maxAge=60;
	        	smoke.add(meteor);
            	if(rand.nextInt(4)==0)
            	{
            		//double spreadY = rand.nextDouble()*(Math.abs(this.motionY*0.05d))-0.5;
            		//double spreadZ = rand.nextDouble()*(Math.abs(this.motionZ*0.05d))-0.5;
    				Meteor frag = new Meteor((this.posX+rand.nextInt(16))-8, (this.posY+rand.nextInt(16)), (this.posZ+rand.nextInt(16))-8, MeteorType.FRAGMENT,this.motionX*0.5,(this.motionY*0.5),(this.motionZ*0.5));
    				fragments.add(frag);
            	}
			}
			if(this.posY <=500 && this.type != MeteorType.SMOKE)
			{
				this.isDead=true;
			}
			if(this.type == MeteorType.SMOKE)
			{
				this.age++;
				if(this.age >=this.maxAge)
				this.isDead=true;
			}
			
			this.prevPosX = this.posX;
			this.prevPosY = this.posY;
			this.prevPosZ = this.posZ;
			this.posX += this.motionX;
			this.posY += this.motionY;
			this.posZ += this.motionZ;
		}
	}

	public static enum MeteorType {
		STANDARD,
		FRAGMENT,
		SMOKE
	}

}
