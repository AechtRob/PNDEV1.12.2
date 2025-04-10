package net.lepidodendron;

import net.lepidodendron.block.BlockNest;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.*;
import net.lepidodendron.entity.base.*;
import net.lepidodendron.entity.boats.PrehistoricFloraSubmarine;
import net.lepidodendron.util.BlockSounds;
import net.lepidodendron.util.CustomTrigger;
import net.lepidodendron.util.ModTriggers;
import net.lepidodendron.util.TriggerRegistry;
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
		if (!event.getItemStack().getItem().getRegistryName().toString().equalsIgnoreCase("patchouli:guide_book")) {
			return;
		}
		if (event.getItemStack().getTagCompound() != null) {
			if (!event.getItemStack().getTagCompound().toString().contains("lepidodendron:paleopedia")) {
				return;
			} else if (event.getTarget() instanceof IAdvancementGranter) {
				if (event.getEntityPlayer() instanceof EntityPlayerMP) {
					((IAdvancementGranter) (event.getTarget())).getModTrigger().trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}


			Entity target = event.getTarget();

			CustomTrigger trigger = TriggerRegistry.getTriggerForEntity(target.getClass());

			if (trigger != null && event.getEntityPlayer() instanceof EntityPlayerMP) {
				EntityPlayerMP player = (EntityPlayerMP) event.getEntityPlayer();
				trigger.trigger(player);
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
			}

		}
	}
}
