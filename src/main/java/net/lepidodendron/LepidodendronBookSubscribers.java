package net.lepidodendron;

import net.lepidodendron.block.BlockNest;
import net.lepidodendron.block.base.IAdvancementGranter;
import net.lepidodendron.entity.*;
import net.lepidodendron.entity.base.*;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

import java.text.DecimalFormat;
import java.util.Locale;

public class LepidodendronBookSubscribers {

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

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void onUseBook2(PlayerInteractEvent.RightClickItem event) {
		if (!event.getItemStack().getItem().getRegistryName().toString().equalsIgnoreCase("patchouli:guide_book")) {
			return;
		}
		if (event.getItemStack().getTagCompound() != null) {
			if (!event.getItemStack().getTagCompound().toString().contains("lepidodendron:paleopedia")) {
				return;
			}
			RayTraceResult raytraceresult = this.rayTrace(event.getWorld(), event.getEntityPlayer(), true);
			if (raytraceresult != null && !event.getEntityPlayer().isSneaking()) {
				event.setCanceled(true);
				return;
			}
			if (!event.getEntityPlayer().isSneaking()) {
				event.setCanceled(true);
				return;
			}
		}
	}

	@SubscribeEvent(priority = EventPriority.HIGHEST)
	public void onUseBook(PlayerInteractEvent.RightClickBlock event) {
		/// click on blocks:
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

			//Nest info:
			if (target == BlockNest.block) {
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsNest(event);
				event.setCanceled(true);
				return;
			}
			//Blocks:
			else if (target instanceof IAdvancementGranter) {
				if (event.getEntityPlayer() instanceof EntityPlayerMP) {
					((IAdvancementGranter)target).getModTrigger().trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			//Vanilla plants get specific treatment as they have not got IAdvancementGranter:
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:acacia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ACACIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:dark_oak_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DARK_OAK.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:oak_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OAK.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:spruce_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPRUCE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:birch_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIRCH.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:jungle_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JUNGLE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}

		}

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

	public static String getNestString(Entity entity, boolean click) {

		String nestString = "";
		BlockPos nestPos = null;
		if (entity instanceof EntityPrehistoricFloraLandBase) {
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
						nestString = " requires a nest to lay into";
					}
				}
			}
			else if (entity instanceof EntityPrehistoricFloraScorpion) {
				nestString = " carries eggs";
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
					nestString = " requires a nest to lay into";
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

	public void deliverStatsNest(PlayerInteractEvent.RightClickBlock event) {
		String nestOwner = "nobody";
		IBlockState state = event.getWorld().getBlockState(event.getPos());
		Block target = state.getBlock();
		if (target == BlockNest.block) {
			String nestType = "";
			TileEntity tileEntity = event.getWorld().getTileEntity(event.getPos());
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
		if (event.getWorld().isRemote) {
			event.getEntityPlayer().sendMessage(new TextComponentString("Nest belonging to " + nestOwner));
		}
	}

	@SubscribeEvent
	public void onUseBook(PlayerInteractEvent.EntityInteract event) {
		/// click on entities:
		if (!event.getItemStack().getItem().getRegistryName().toString().equalsIgnoreCase("patchouli:guide_book")) {
			return;
		}
		if (event.getItemStack().getTagCompound() != null) {
			if (!event.getItemStack().getTagCompound().toString().contains("lepidodendron:paleopedia")) {
				return;
			}



			else if (event.getTarget() instanceof IAdvancementGranter) {
				if (event.getEntityPlayer() instanceof EntityPlayerMP) {
					((IAdvancementGranter)(event.getTarget())).getModTrigger().trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			if (event.getTarget() instanceof EntityPrehistoricFloraAcadoaradoxides) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ACADOARADOXIDES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAcanthostega) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ACANTHOSTEGA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAcanthostomatops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ACANTHOSTOMATOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAdelophthalmus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ADELOPHTHALMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAegirocassis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AEGIROCASSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAiniktozoon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AINIKTOZOON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAkmonistion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AKMONISTION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAlacaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ALACARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCaryosyntrips) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CARYOSYNTRIPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Asteroceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_ASTEROCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Ceratites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_CERATITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Coroniceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_CORONICERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Cylolobus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_CYLOLOBUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Dactylioceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_DACTYLIOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Goniatites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_GONIATITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Manticoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_MANTICOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Pachydesmoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_PACHYDESMOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Pachydiscus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_PACHYDISCUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Parapuzosia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_PARAPUZOSIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Titanites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_TITANITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmphibamus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMPHIBAMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmplectobelua) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMPLECTOBELUA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAnomalocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANOMALOCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAntarcticarcinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANTARCTICARCINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAnteosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANTEOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAnthracomedusa) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANTHRACOMEDUSA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAphetoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_APHETOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraArandaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARANDASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraArthropleura) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARTHROPLEURA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAsaphus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ASAPHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAscendonanus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ASCENDONANUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAttercopus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ATTERCOPUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAulacephalodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AULACEPHALODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBalanerpeton ) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BALANERPETON .trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBandringa) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BANDRINGA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBanffia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BANFFIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBarbclabornia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BARBCLABORNIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBasiloceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BASILOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBatofasciculus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BATOFASCICULUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBelantsea) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BELANTSEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBranchiosaur) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRANCHIOSAUR.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBunostegos) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BUNOSTEGOS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBushizheia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BUSHIZHEIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCacops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CACOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCalvapilosa) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CALVAPILOSA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCambroraster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAMBRORASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCameroceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAMEROCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCampbellodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAMPBELLODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCanadaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CANADASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCanadia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CANADIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCaptorhinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAPTORHINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCarcinosoma) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CARCINOSOMA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCarolowilhelmina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAROLOWILHELMINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCasineria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CASINERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCephalaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CEPHALASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCheirurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHEIRURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCheloniellon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHELONIELLON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraClaudiosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLAUDIOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCoelophysis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COELOPHYSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCoelurosauravus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COELUROSAURAVUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCooperoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COOPEROCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCothurnocystis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COTHURNOCYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHurdia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HURDIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCrassigyrinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRASSIGYRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCrotalocephalus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CROTALOCEPHALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCyclonema) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYCLONEMA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCyrtoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYRTOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDalmanites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DALMANITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDasyceps) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DASYCEPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDatheosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DATHEOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDeiroceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DEIROCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDiania) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIANIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDickinsonia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICKINSONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDidymograptus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIDYMOGRAPTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDimetrodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIMETRODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDiplocaulus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIPLOCAULUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDiploceraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIPLOCERASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDracopristis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DRACOPRISTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDrotops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DROTOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDunkleosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DUNKLEOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDvinia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DVINIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDvinosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DVINOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraElginia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ELGINIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEllipsocephalus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ELLIPSOCEPHALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraElrathia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ELRATHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEndoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ENDOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEnoploura) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ENOPLOURA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEoandromeda) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EOANDROMEDA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEoarthropleura) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EOARTHROPLEURA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEoraptor) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EORAPTOR.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEoredlichia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EOREDLICHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEosaurichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EOSAURICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEosimops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EOSIMOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEricixerxes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ERICIXERXES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEryops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ERYOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEstemmenosuchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ESTEMMENOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEuchambersia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EUCHAMBERSIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEunotosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EUNOTOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEurypterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EURYPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraFurcaster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FURCASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGemmactena) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GEMMACTENA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGemuendina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GEMUENDINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGephyrostegus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GEPHYROSTEGUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGerarusInsect) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GERARUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGlaurung) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GLAURUNG.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGonioceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GONIOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHaikouichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HAIKOUICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHallucigenia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HALLUCIGENIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHarvestman) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HARVESTMAN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHelenodora) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELENODORA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHelianthaster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELIANTHASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHeliopeltis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELIOPELTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHelicoprion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELICOPRION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHelmetia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELMETIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHeterosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HETEROSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHibbertopterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HIBBERTOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHungioides) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HUNGIOIDES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraIchthyostega) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ICHTHYOSTEGA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraIniopteryx) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_INIOPTERYX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraInostrancevia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_INOSTRANCEVIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraIsotelus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ISOTELUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraItalophlebia
					|| event.getTarget() instanceof EntityPrehistoricFloraItalophlebiaNymph) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ITALOPHLEBIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJaekelopterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JAEKELOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJanassa) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JANASSA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish_Precambrian) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JELLYFISH_PRECAMBRIAN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish1) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JELLYFISH1.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish2) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JELLYFISH2.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish3) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JELLYFISH3.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish4) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JELLYFISH4.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish5) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JELLYFISH5.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish6) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JELLYFISH6.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish7) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JELLYFISH7.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJianshanopodia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JIANSHANOPODIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJonkeria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JONKERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKaibabvenator) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KAIBABVENATOR.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKalbarria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KALBARRIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKerygmachela) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KERYGMACHELA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKimberella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KIMBERELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKodymirus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KODYMIRUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKokomopterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KOKOMOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLabidosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LABIDOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLaccognathus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LACCOGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLaminacaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LAMINACARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLanceaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LANCEASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLebachacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEBACHACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLiliensternus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LILIENSTERNUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLimnoscelis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LIMNOSCELIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLisowicia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LISOWICIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraListracanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LISTRACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLituites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LITUITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLunaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LUNASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLunataspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LUNATASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLungmenshanaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LUNGMENSHANASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLyrarapax) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LYRARAPAX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLystrosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LYSTROSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMaclurina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MACLURINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMarrella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MARRELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMastodonsaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MASTODONSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMcnamaraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MCNAMARASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMegalocephalus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGALOCEPHALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMegalograptus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGALOGRAPTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMeganeurites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGANEURITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMeganeura
				|| event.getTarget() instanceof EntityPrehistoricFloraMeganeuraNymph) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGANEURA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMegarachne) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGARACHNE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMelosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MELOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMenaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MENASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMesosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MESOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMetaspriggina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_METASPRIGGINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMicrodictyon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MICRODICTYON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMimetaster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MIMETASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMixopterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MIXOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMonograptus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MONOGRAPTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMontecaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MONTECARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMooreoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MOOREOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMoschops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MOSCHOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAngustidontus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANGUSTIDONTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCowielepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COWIELEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraNectocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NECTOCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOdaraia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ODARAIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOdontogriphus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ODONTOGRIPHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOmnidens) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OMNIDENS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOnychodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ONYCHODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOpabinia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OPABINIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOphiacodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OPHIACODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOrthoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ORTHOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOrthrozanclus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ORTHROZANCLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOsteolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OSTEOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOttoia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OTTOIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPagea) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PAGEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeoisopus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEOISOPUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish_Palaeo1
				|| event.getTarget() instanceof EntityPrehistoricFloraJellyfish_Palaeo2
				|| event.getTarget() instanceof EntityPrehistoricFloraJellyfish_Palaeo3
				|| event.getTarget() instanceof EntityPrehistoricFloraJellyfish_Palaeo4) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANCIENT_JELLY.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeontinid) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEONTINID.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPanderichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PANDERICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPanderodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PANDERODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPantylus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PANTYLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraParadoxides) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARADOXIDES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraParanaichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARANAICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraParexus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PAREXUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraParvancorina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARVANCORINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPaucipodia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PAUCIPODIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPederpes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PEDERPES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPelurgaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PELURGASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPhanerotinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHANEROTINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPhantaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHANTASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPharyngolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHARYNGOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPhlegethontia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHLEGETHONTIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPholiderpeton) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHOLIDERPETON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPhragmoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHRAGMOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPikaia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PIKAIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPlacerias) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLACERIAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPlateosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLATEOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPlatycaraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLATYCARASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPlatyhystrix) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLATYHYSTRIX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPlatylomaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLATYLOMASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPlatysomus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLATYSOMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPneumodesmus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PNEUMODESMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPoleumita) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_POLEUMITA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPomatrum) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_POMATRUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPoraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PORASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPrionosuchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PRIONOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPristerognathus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PRISTEROGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraProburnetia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROBURNETIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraProcynosuchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROCYNOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraProfallotaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROFALLOTASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			/*
			else if (event.getTarget() instanceof EntityPrehistoricFloraPromissum) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROMISSUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			 */
			else if (event.getTarget() instanceof EntityPrehistoricFloraProsictodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROSICTODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraProterogyrinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTEROGYRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraProtorosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTOROSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraProtozygoptera
					|| event.getTarget() instanceof EntityPrehistoricFloraProtozygopteraNymph) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTOZYGOPTERA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPsarolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PSAROLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPteraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PTERASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPterygotus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PTERYGOTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPurlovia ) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PURLOVIA .trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraQilinyu) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_QILINYU.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRautiania) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RAUTIANIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRayonnoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RAYONNOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRebellatrix) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_REBELLATRIX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRemigiomontanus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_REMIGIOMONTANUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRetifacies) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RETIFACIES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRhizodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RHIZODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRoachoidAridInsect
				|| event.getTarget() instanceof EntityPrehistoricFloraRoachoidForestInsect
				|| event.getTarget() instanceof EntityPrehistoricFloraRoachoidSwampInsect) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ROACHOID.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRobertia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ROBERTIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSacabambaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SACABAMBASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSaivodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SAIVODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSaurichthysMarine) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SAURICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSaurichthysFreshwater) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SAURICHTHYS_FRESHWATER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSauroctonus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SAUROCTONUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraScaumenacia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCAUMENACIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSchinderhannes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCHINDERHANNES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraScorpion_Gigantoscorpio) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCORPION_GIGANTOSCORPIO.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraScorpion_Gondwanascorpio) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCORPION_GONDWANASCORPIO.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraScorpion_Opsieobuthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCORPION_OPSIEOBUTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraScorpion_Pulmonoscorpius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCORPION_PULMONOSCORPIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraScutosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCUTOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSelenopeltis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SELENOPELTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSemionotus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SEMIONOTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSeymouria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SEYMOURIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraShonisaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SHONISAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraShringasaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SHRINGASAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSiberion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SIBERION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSidneyia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SIDNEYIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSpathicephalus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPATHICEPHALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSphenacodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPHENACODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSpiniplatyceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPINIPLATYCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSpinoaequalis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPINOAEQUALIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSpriggina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPRIGGINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSquatinactis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SQUATINACTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraStensioella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STENSIOELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSuminia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SUMINIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSynophalos) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SYNOPHALOS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTapinocephalus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TAPINOCEPHALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCriocephalosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRIOCEPHALOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTartuosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TARTUOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTegopelte) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TEGOPELTE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTemperoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TEMPEROCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTerataspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TERATASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTetraceratops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TETRACERATOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTetragraptus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TETRAGRAPTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraThelodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THELODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraThrinaxodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THRINAXODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTitanichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TITANICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTiarajudens) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TIARAJUDENS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTokummia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TOKUMMIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTraquairius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRAQUAIRIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTrigonotarbid_Cryptomartus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIGONOTARBID_CRYPTOMARTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTrigonotarbid_Eophrynus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIGONOTARBID_EOPHRYNUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTrigonotarbid_Kreischeria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIGONOTARBID_KREISCHERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTrigonotarbid_Palaeotarbus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIGONOTARBID_PALAEOTARBUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTrigonotarbid_Permotarbus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIGONOTARBID_PERMOTARBUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTrigonotarbid_Palaeocharinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIGONOTARBID_PALAEOCHARINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTrimerus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIMERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTullimonstrum) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TULLIMONSTRUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTurrisaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TURRISASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraUranocentrodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_URANOCENTRODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraUrosthenes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_UROSTHENES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraVarialepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VARIALEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraVestinautilus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VESTINAUTILUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraVetulicola) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VETULICOLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraVivaxosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VIVAXOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraWalliserops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WALLISEROPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraWebsteroprion
				|| event.getTarget() instanceof EntityPrehistoricFloraWebsteroprionHole) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WEBSTEROPRION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraWhatcheeria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WHATCHEERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraWiwaxia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WIWAXIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraXenacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_XENACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraXenusion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_XENUSION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraYawunik) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YAWUNIK.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraYilingia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YILINGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraYohoia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YOHOIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraYorgia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YORGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraYunnanozoon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YUNNANOZOON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLochmanolenellus) {
			if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
				ModTriggers.CLICK_LOCHMANOLENELLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
			}
			event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
			event.setCanceled(true);
			return;
		}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPanderodus) {
			if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PANDERODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
	}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
}
		else if (event.getTarget() instanceof EntityPrehistoricFloraCalvapilosa) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CALVAPILOSA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraDrotops) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DROTOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraHeliopeltis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HELIOPELTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraLanceaspis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LANCEASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraMontecaris) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_MONTECARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraRhenocystis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_RHENOCYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraWillwerathia) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_WILLWERATHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraParmastega) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PARMASTEGA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraTiktaalik) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TIKTAALIK.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraPygopterus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PYGOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraDeltoptychius) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DELTOPTYCHIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraOrodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ORODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraParatarrasius) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PARATARRASIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSyllipsimopodi) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SYLLIPSIMOPODI.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraThrinacodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_THRINACODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraTyrannophontes) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TYRANNOPHONTES.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraUrocordylus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_UROCORDYLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraEdaphosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_EDAPHOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraMegactenopetalus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_MEGACTENOPETALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraRubidgea) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_RUBIDGEA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraEndothiodon) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ENDOTHIODON.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
			else if (event.getTarget() instanceof EntityPrehistoricFloraYinlong) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YINLONG.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSaltriovenator) {
			if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
				ModTriggers.CLICK_SALTRIOVENATOR.trigger((EntityPlayerMP) event.getEntityPlayer());
			}
			event.getEntityPlayer().swingArm(event.getHand());
			deliverStatsEntity(event);
			event.setCanceled(true);
			return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraAustrolimulus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_AUSTROLIMULUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraBeishanichthys) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BEISHANICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraBirgeria) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BIRGERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraCaturus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CATURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraChinlea) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CHINLEA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraDapedium) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DAPEDIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraForeyia) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_FOREYIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraHybodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HYBODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraLuoxiongichthys) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LUOXIONGICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraPotanichthys) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_POTANICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraAeger) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_AEGER.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraAulacoceras) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_AULACOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraBesanosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BESANOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraCartorhynchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CARTORHYNCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraCyamodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CYAMODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraCymbospondylus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CYMBOSPONDYLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraEorhynchochelys) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_EORHYNCHOCHELYS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraEretmorhipis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_eretmorhipis.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraHenodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HENODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraLimulid) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LIMULID.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraKeichousaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_KEICHOUSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraNothosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_NOTHOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraOpolanka) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_OPOLANKA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraPanzhousaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PANZHOUSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraPlacodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PLACODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSclerocormus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SCLEROCORMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraTriadobatrachus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TRIADOBATRACHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraYunguisaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_YUNGUISAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraArizonasaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ARIZONASAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraAtopodentatus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ATOPODENTATUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraBatrachotomus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BATRACHOTOMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraClevosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CLEVOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraDesmatosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DESMATOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraDoswellia) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DOSWELLIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraDrepanosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DREPANOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraEffigia) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_EFFIGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraErythrosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ERYTHROSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraEuparkeria) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_EUPARKERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraEusaurosphargis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_EUSAUROSPHARGIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraGerrothorax) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_GERROTHORAX.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraHypsognathus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HYPSOGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraHypuronector) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HYPURONECTOR.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraLagosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LAGOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraLessemsaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LESSEMSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraLongisquama) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LONGISQUAMA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraLotosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LOTOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraMegazostrodon) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_MEGAZOSTRODON.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraMetoposaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_METOPOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraMussaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_MUSSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraOrnithosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ORNITHOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraTeleocrater) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TELEOCRATER.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraPoposaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_POPOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraPostosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_POSTOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraProganochelys) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PROGANOCHELYS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
			else if (event.getTarget() instanceof EntityPrehistoricFloraScheenstia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCHEENSTIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
		else if (event.getTarget() instanceof EntityPrehistoricFloraPseudotherium) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PSEUDOTHERIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSaurosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SAUROSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraRutiodon) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_RUTIODON.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraScleromochlus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SCLEROMOCHLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSharovipteryx) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SHAROVIPTERYX.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSilesaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SILESAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSillosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SILLOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSmilosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SMILOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSmok) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SMOK.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSphenotitan) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SPHENOTITAN.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraStagonolepis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_STAGONOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraStanocephalosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_STANOCEPHALOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraTanystropheus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TANYSTROPHEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraTeraterpeton) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TERATERPETON.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraTeyujagua) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TEYUJAGUA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraThecodontosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_THECODONTOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraVancleavea) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_VANCLEAVEA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraXinpusaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_XINPUSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraAustriadactylus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_AUSTRIADACTYLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraCaelestiventus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CAELESTIVENTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraCaviramus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CAVIRAMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraEudimorphodon) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_EUDIMORPHODON.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraItalophlebia) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ITALOPHLEBIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraNagini) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_NAGINI.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraBrachydectes) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BRACHYDECTES.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraLysorophus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LYSOROPHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraParhybodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
			ModTriggers.CLICK_PARHYBODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		} else if (event.getTarget() instanceof EntityPrehistoricFloraLonchidion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LONCHIDION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeoniscum) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEONISCUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLandSnail) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SNAIL_LAND.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSpiniplatyceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPINIPLATYCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraNipponomaria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NIPPONOMARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOrnithoprion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ORNITHOPRION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					switch (((EntityPrehistoricFloraPalaeodictyoptera)event.getTarget()).getPNType()) {
						case DELITZSCHALA: default:
							ModTriggers.CLICK_PALAEODICTYOPTERA_DELITZSCHALA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case DUNBARIA:
							ModTriggers.CLICK_PALAEODICTYOPTERA_DUNBARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case HOMOIOPTERA:
							ModTriggers.CLICK_PALAEODICTYOPTERA_HOMOIOPTERA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case HOMALONEURA:
							ModTriggers.CLICK_PALAEODICTYOPTERA_HOMALONEURA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case LITHOMANTIS:
							ModTriggers.CLICK_PALAEODICTYOPTERA_LITHOMANTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case LYCOCERCUS:
							ModTriggers.CLICK_PALAEODICTYOPTERA_LYCOCERCUS.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case STENODICTYA:
							ModTriggers.CLICK_PALAEODICTYOPTERA_STENODICTYA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case SINODUNBARIA:
							ModTriggers.CLICK_PALAEODICTYOPTERA_SINODUNBARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

						case MAZOTHAIROS:
							ModTriggers.CLICK_PALAEODICTYOPTERA_MAZOTHAIROS.trigger((EntityPlayerMP) event.getEntityPlayer());
							break;

					}
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
//			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Dunbaria) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_PALAEODICTYOPTERA_DUNBARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
//			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Homaloneura) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_PALAEODICTYOPTERA_HOMALONEURA.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
//			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Homoioptera) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_PALAEODICTYOPTERA_HOMOIOPTERA.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
//			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Lithomantis) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_PALAEODICTYOPTERA_LITHOMANTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
//			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Lycocercus) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_PALAEODICTYOPTERA_LYCOCERCUS.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
//			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Sinodunbaria) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_PALAEODICTYOPTERA_SINODUNBARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
//			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Stenodictya) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_PALAEODICTYOPTERA_STENODICTYA.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraParapeytoia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARAPEYTOIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPhragmoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHRAGMOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLituites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LITUITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCidaroida) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CIDAROIDA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraArchaeocidaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCHAEOCIDARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCeratodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CERATODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraWillwerathia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WILLWERATHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (event.getTarget() instanceof EntityPrehistoricFloraTitanoptera) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					switch (((EntityPrehistoricFloraTitanoptera)event.getTarget()).getPNType()) {
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

			else if (event.getTarget() instanceof EntityPrehistoricFloraSkeemella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SKEEMELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraArctinurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCTINURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOgyginus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OGYGINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraUralichas) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_URALICHAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBarameda) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BARAMEDA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAscoceras
					//|| event.getTarget() instanceof EntityPrehistoricFloraAscoceras_Baby
				) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ASCOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmpyx) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMPYX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBohemoharpes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BOHEMOHARPES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCassinoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CASSINOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraChotecops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHOTECOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHarpes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HARPES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLonchodomas) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LONCHODOMAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraNahecaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NAHECARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPlectodiscus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLECTODISCUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTorpedaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TORPEDASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraWeinbergina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WEINBERGINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraWingertshellicus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WINGERTSHELLICUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMegalosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGALOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAspidorhynchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ASPIDORHYNCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraArduafrons) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARDUAFRONS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAphnelepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_APHNELEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAetheolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AETHEOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMacromesodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MACROMESODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOphthalmosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OPHTHALMOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEryon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ERYON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAdamanteryon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ADAMANTERYON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraNotidanoides) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NOTIDANOIDES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEugaleaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EUGALEASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDunyu) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DUNYU.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLasanius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LASANIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEastmanosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EASTMANOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraIvoites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_IVOITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBundenbachiellus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BUNDENBACHIELLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSphooceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPHOOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPituriaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PITURIASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraNeeyambaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NEEYAMBASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBalhuticaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BALHUTICARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (event.getTarget() instanceof EntityPrehistoricFloraVachonisia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VACHONISIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			
			else if (event.getTarget() instanceof EntityPrehistoricFloraFurca) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FURCA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTomlinsonus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TOMLINSONUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (event.getTarget() instanceof EntityPrehistoricFloraMiguashaia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MIGUASHAIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCometicercus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COMETICERCUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOxyosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OXYOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTegeolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TEGEOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGooloogongia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GOOLOOGONGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraWarneticaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WARNETICARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSchugurocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCHUGUROCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCeratiocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CERATIOCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDiplacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIPLACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraClimatius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLIMATIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraNerepisacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NEREPISACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGriphognathus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GRIPHOGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraConcavicaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CONCAVICARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGogonasus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GOGONASUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraFallacosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FALLACOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRolfosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ROLFOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCamuropiscis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAMUROPISCIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCtenurella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CTENURELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRhamphodopsis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RHAMPHODOPSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGoodradigbeeon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GOODRADIGBEEON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDraconichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DRACONICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMaterpiscis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MATERPISCIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMicrobrachius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MICROBRACHIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBrindabellaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRINDABELLASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraWuttagoonaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WUTTAGOONASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKujdanowiaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KUJDANOWIASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPhyllolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHYLLOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCowralepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COWRALEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGymnotrachelus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GYMNOTRACHELUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBungartius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BUNGARTIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRhadinacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RHADINACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHadronector) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HADRONECTOR.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (event.getTarget() instanceof EntityPrehistoricFloraThrissops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THRISSOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}


			else if (event.getTarget() instanceof EntityPrehistoricFloraMuensterella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MUENSTERELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAsteracanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ASTERACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTurboscinetes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TURBOSCINETES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPiranhamesodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PIRANHAMESODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRedfieldius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_REDFIELDIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLeptolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPTOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLepidotes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPIDOTES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDollocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DOLLOCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (event.getTarget() instanceof EntityPrehistoricFloraEntelognathus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ENTELOGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (event.getTarget() instanceof EntityPrehistoricFloraSilurolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SILUROLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSilesaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SILESAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (event.getTarget() instanceof EntityPrehistoricFloraKentrosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KENTROSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraStethacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STETHACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDysalotosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DYSALOTOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHualianceratops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HUALIANCERATOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraChaoyangsaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHAOYANGSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPanguraptor) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PANGURAPTOR.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraXuanhuaceratops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_XUANHUACERATOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (event.getTarget() instanceof EntityPrehistoricFloraMyriacantherpestes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MYRIACANTHERPESTES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGuiyu) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GUIYU.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMegamastax) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGAMASTAX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMegateuthis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGATEUTHIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPassaloteuthis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PASSALOTEUTHIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSclerodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCLERODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAthenaegis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ATHENAEGIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTauraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TAURASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraParameteoraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARAMETEORASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPolybranchiaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_POLYBRANCHIASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPhialaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHIALASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPhlebolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHLEBOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGyrosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GYROSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSqualoraja) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SQUALORAJA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGyrodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GYRODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJamoytius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JAMOYTIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPezopallichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PEZOPALLICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}


			else if (event.getTarget() instanceof EntityPrehistoricFloraBelonostomusJurassic) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BELONOSTOMUS_JURASSIC.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBelonostomusCretaceous) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BELONOSTOMUS_CRETACEOUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTamisiocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TAMISIOCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSanctacaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SANCTACARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCordaticaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CORDATICARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGreererpeton) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GREERERPETON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraZenaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ZENASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraParamblypterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARAMBLYPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraVillebrunaster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VILLEBRUNASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDecacuminaster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DECACUMINASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDicranurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICRANURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraThanahita) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THANAHITA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLepidaster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPIDASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSaccocoma) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SACCOCOMA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraVampyronassa) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VAMPYRONASSA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraProteroctopus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTEROCTOPUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPsychopyge) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PSYCHOPYGE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKosmoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KOSMOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraElephantoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ELEPHANTOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAnaethalion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANAETHALION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraQuasimodichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_QUASIMODICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraElasmodectes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ELASMODECTES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPromexyele) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROMEXYELE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPapilionichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PAPILIONICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRainerichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RAINERICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHovasaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HOVASAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSibyrhynchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SIBYRHYNCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMarmolatella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MARMOLATELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraViviparus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VIVIPARUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraStahleckeria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STAHLECKERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRutgersella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RUTGERSELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDakosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DAKOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDuslia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DUSLIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCowielepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COWIELEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraProterosuchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTEROSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMetopacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_METOPACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCancrinos) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CANCRINOS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMurex) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MUREX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLeviathania) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEVIATHANIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHarpagodes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HARPAGODES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraNerinea) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NERINEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (event.getTarget() instanceof EntityPrehistoricFloraCiurcopterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CIURCOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSlimonia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SLIMONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraStrombus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STROMBUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBishanopliosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BISHANOPLIOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPlectronoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLECTRONOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAngelina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANGELINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPlatypeltoides) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLATYPELTOIDES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTribrachiodemas) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIBRACHIODEMAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMegistaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGISTASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHelenodora) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELENODORA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCarolinites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAROLINITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPricyclopyge) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PRICYCLOPYGE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSymphysops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SYMPHYSOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEuspira) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EUSPIRA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHarpacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HARPACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTyphloesus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TYPHLOESUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGephyrostegus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GEPHYROSTEGUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRhomaleosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RHOMALEOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraUtatsusaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_UTATSUSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCongophiopsis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CONGOPHIOPSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOphiopsis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OPHIOPSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCiurcopterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CIURCOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRhenocystis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RHENOCYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDragonfly) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DRAGONFLY.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDendrocystites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DENDROCYSTITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSyringocrinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SYRINGOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraIowacystis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_IOWACYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTemnodontosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TEMNODONTOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPropterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPseudorhina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PSEUDORHINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraChunerpeton) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHUNERPETON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDocodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DOCODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHomoeosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HOMOEOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPhorcynis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHORCYNIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLibys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LIBYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOreochima) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OREOCHIMA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOstenocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OSTENOCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKalligrammatid) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					switch (((EntityPrehistoricFloraKalligrammatid)event.getTarget()).getPNType()) {
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraLacewing) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					switch (((EntityPrehistoricFloraLacewing)event.getTarget()).getPNType()) {
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
//			else if (event.getTarget() instanceof EntityPrehistoricFloraScorpionfly) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_SCORPIONFLY.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraClarkeiteuthis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLARKEITEUTHIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKaykay) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KAYKAY.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGeosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GEOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (event.getTarget() instanceof EntityPrehistoricFloraEchinochimaera) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ECHINOCHIMAERA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKulindadromeus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KULINDADROMEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCeratosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CERATOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMorrolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MORROLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSpiroceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPIROCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCenoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CENOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCoccoderma) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COCCODERMA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDaohugoucossus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DAOHUGOUCOSSUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTrachymetopon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRACHYMETOPON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPanacanthocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PANACANTHOCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMegasecoptera) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					switch (((EntityPrehistoricFloraMegasecoptera)event.getTarget()).getPNType()) {
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraThalassiodracon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THALASSIODRACON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMicrocleidus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MICROCLEIDUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOphthalmothule) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OPHTHALMOTHULE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBobosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BOBOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOrthocormus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ORTHOCORMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEurhinosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EURHINOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEocarcinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EOCARCINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHupehsuchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HUPEHSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraParnaibaia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARNAIBAIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraProtospinax) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTOSPINAX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeocarcharias) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEOCARCHARIAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraUarbryichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_UARBRYICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSiderops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SIDEROPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraIsanichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ISANICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMecochirus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MECOCHIRUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSteurbautichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STEURBAUTICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBavariscyllium) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BAVARISCYLLIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraParacestracion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARACESTRACION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraIschyodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ISCHYODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSpathobatis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPATHOBATIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMesturus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MESTURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCongopycnodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CONGOPYCNODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLigulella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LIGULELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPhillipsia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHILLIPSIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKleptothule) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KLEPTOTHULE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHaplophrentis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HAPLOPHRENTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraParadapedium) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARADAPEDIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRhinopteraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RHINOPTERASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTritylodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRITYLODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKayentatherium) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KAYENTATHERIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCeltedens) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CELTEDENS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMarmorerpeton) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MARMORERPETON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraVadasaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VADASAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraShaihuludia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SHAIHULUDIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraUrsactis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_URSACTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKootenayscolex) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KOOTENAYSCOLEX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraArchocyrtus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCHOCYRTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPhytophilaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHYTOPHILASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSongaichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SONGAICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSaurostomus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SAUROSTOMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMacrosemius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MACROSEMIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraConodont) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					switch (((EntityPrehistoricFloraConodont)event.getTarget()).getPNType()) {
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

			else if (event.getTarget() instanceof EntityPrehistoricFloraSokkaejaecystis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SOKKAEJAECYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCastorocauda) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CASTOROCAUDA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPiatnitzkysaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PIATNITZKYSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGasosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GASOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTanyrhinichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TANYRHINICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Perisphinctes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_PERISPHINCTES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLaidleria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LAIDLERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraNotostracan) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					switch (((EntityPrehistoricFloraNotostracan)event.getTarget()).getPNType()) {
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

			else if (event.getTarget() instanceof EntityPrehistoricFloraEuropasaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EUROPASAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (event.getTarget() instanceof EntityPrehistoricFloraAngustidontus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANGUSTIDONTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJeholotriton) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JEHOLOTRITON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPycnophlebia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PYCNOPHLEBIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraArchaboilus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCHABOILUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraStanocephalosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STANOCEPHALOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

//			else if (event.getTarget() instanceof EntityPrehistoricFloraStoermeropterus) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_STOERMEROPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHoplitaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HOPLITASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraChasmataspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHASMATASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
//			else if (event.getTarget() instanceof EntityPrehistoricFloraPentecopterus) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_PENTECOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
//			else if (event.getTarget() instanceof EntityPrehistoricFloraOrcanopterus) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_ORCANOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOnychopterella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ONYCHOPTERELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
//			else if (event.getTarget() instanceof EntityPrehistoricFloraStrobilopterus) {
//				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
//					ModTriggers.CLICK_STROBILOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
//				}
//				event.getEntityPlayer().swingArm(event.getHand());
//				deliverStatsEntity(event);
//				event.setCanceled(true);
//				return;
//			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraXinjiangchelys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_XINJIANGCHELYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGlyptops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GLYPTOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKayentachelys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KAYENTACHELYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraThalassemys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THALASSEMYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHuayangosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HUAYANGOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGigantspinosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GIGANTSPINOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraStegosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STEGOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTuojiangosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TUOJIANGOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraYuxisaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YUXISAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDiandongosuchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIANDONGOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCryolophosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRYOLOPHOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTanycolagreus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TANYCOLAGREUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPlatysuchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLATYSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOlenellus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OLENELLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCervifurca) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CERVIFURCA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTorvosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TORVOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraYangchuanosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YANGCHUANOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGlacialisaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GLACIALISAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}

			else if (event.getTarget() instanceof EntityPrehistoricFloraSinraptor) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SINRAPTOR.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMymoorapelta) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MYMOORAPELTA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDilophosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DILOPHOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}














			//------------------------------------------------------------------------------
			//Put these at the end so as to trigger their children above in preference first
			//These next ones are only the ones which act as PARENTS for other classes:
			else if (event.getTarget() instanceof EntityPrehistoricFloraDryosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DRYOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMorganucodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MORGANUCODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDiictodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIICTODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraArchoblattinaInsect
					|| event.getTarget() instanceof EntityPrehistoricFloraArchoblattinaNymph) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCHOBLATTINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraWeigeltisaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WEIGELTISAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMixosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MIXOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHaldanodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HALDANODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMeganeuropsis
					|| event.getTarget() instanceof EntityPrehistoricFloraMeganeuropsisNymph) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGANEUROPSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			//End of PARENT entities - see comment above
			//------------------------------------------------------------------------------

			

		}
	}

}
