package net.lepidodendron;

import net.lepidodendron.block.BlockNest;
import net.lepidodendron.block.BlockWebsteroprionBurrow;
import net.lepidodendron.entity.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandBase;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.*;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

import java.text.DecimalFormat;

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

			//Plant/block info:
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:acacia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ACACIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:adoketophyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ADOKETOPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:aethophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AETHOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:ancient_moss"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MOSS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:agathis_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AGATHIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:alethopteris_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ALETHOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:alliopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ALLIOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:allonnia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ALLONNIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:alpia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ALPIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:amblysiphonella"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMBLYSIPHONELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:aneurophyton_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANEUROPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:ankyropteris_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANKYROPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:anomozamites_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANOMOZAMITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:antarcticycas"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANTARCTICYCAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:apple_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_APPLE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:araucarioxylon_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARAUCARIOXYLON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:araucarites_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARAUCARITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:arborea"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARBOREA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:archaeanthus_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCHAEANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:archaefructus_item"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCHAEFRUCTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:archaeopteris_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCHAEOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:arid_horsetail"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARID_HORSETAIL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:arkarua"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARKARUA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:arthropitys_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARTHROPITYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:artocarpus_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARTOCARPUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:asteroxylon"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ASTEROXYLON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:aulacera_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AULACERA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:ausia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AUSIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:baiera"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BAIERA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:baikalophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BAIKALOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:banksia_1_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BANKSIA_1.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:banksia_2_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BANKSIA_2.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:baragwanathia_item"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BARAGWANATHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:beech_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BEECH.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:belemnopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BELEMNOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:bivalve_cream"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_CREAM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:bivalve_dark"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_DARK.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:bivalve_dicerocardium"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_DICEROCARDIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:bivalve_green"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_GREEN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:bivalve_grey"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_GREY.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:bivalve_inoceramus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_INOCERAMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:bivalve_lithiotis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_LITHIOTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:bivalve_megalodon"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_MEGALODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:bivalve_tall"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_TALL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:bivalve_upright"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_UPRIGHT.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:bivalve_white"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_WHITE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:bjuvia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BJUVIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:black_treefern_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BLACK_TREEFERN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:bolbitis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BOLBITIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:bomakellia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BOMAKELLIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:bothrodendron_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BOTHRODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:brachiopod_gigantoproductus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRACHIOPOD_GIGANTOPRODUCTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:brachiopod_orthid"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRACHIOPOD_ORTHID.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:brachiopod_spiriferid"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRACHIOPOD_SPIRIFERID.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:brachyphyllum_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRACHYPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:bradgatia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRADGATIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:brasilodendron"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRASILODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:bristlecone_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRISTLECONE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:bumbudendron_item"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BUMBUDENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:bunya_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BUNYA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:buriadia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BURIADIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:burykhia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BURYKHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:calamites_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CALAMITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:calamophyton_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CALAMOPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:callistophytales"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CALLISTOPHYTALES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:castericystis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CASTERICYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:cecropsis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CECROPSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:charnia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHARNIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:charniodiscus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHARNIODISCUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:chaunograptus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHAUNOGRAPTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:cinnamon_fern"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CINNAMON_FERN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:cladophlebis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLADOPHLEBIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:clathropteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLATHROPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:claytosmunda"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLAYTOSMUNDA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:cloudina"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLOUDINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:cobbania_item"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COBBANIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:columnaris_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COLUMNARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:coniopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CONIOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:conomedusites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CONOMEDUSITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:cooksonia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COOKSONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:cordaites_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CORDAITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:cornulitida"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CORNULITIDA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coronacollina"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CORONACOLLINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:corumbella"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CORUMBELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_ancyrocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_ANCYROCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_callicrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_CALLICRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_caryocrinites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_CARYOCRINITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_cupressocrinites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_CUPRESSOCRINITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_cyathocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_CYATHOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_dizygocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_DIZYGOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_encrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_ENCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_eucalyptocrinites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_EUCALYPTOCRINITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_holocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_HOLOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_jimbacrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_JIMBACRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_macrocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_MACROCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_petalocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_PETALOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_pisocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_PISOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_scyphocrinus_item"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_SCYPHOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_siphonocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_SIPHONOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_traumatocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_TRAUMATOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_seirocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_SEIROCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_apiocrinites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_APIOCRINITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_eugeniacrinites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_EUGENIACRINITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_phyllocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_PHYLLOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_balanocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_BALANOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_pentacrinites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_PENTACRINITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_vadarocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_VADAROCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:crinoid_vostocovacrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_VOSTOCOVACRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:ctenis_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CTENIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:cycadeoidea_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYCADEOIDEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:cycadopteris_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYCADOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:cycas_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYCAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:cyclodendron"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYCLODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:cypress_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYPRESS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:cystoid_aristocystites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYSTOID_ARISTOCYSTITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:cystoid_bolboporites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYSTOID_BOLBOPORITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:cystoid_echinosphaerites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYSTOID_ECHINOSPHAERITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:cystoid_pseudocrinites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYSTOID_PSEUDOCRINITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:czekanowskia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CZEKANOWSKIA.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:dawn_redwood_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DAWN_REDWOOD.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:dendrograptus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DENDROGRAPTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:sphenoecium"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPHENOECIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:diaphorodendron_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIAPHORODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:dicksonia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICKSONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:dicranophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICRANOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:dicroidium_e"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICROIDIUM_E.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:dicroidium_f_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICROIDIUM_F.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:dicroidium_h_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICROIDIUM_H.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:dicroidium_o_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICROIDIUM_O.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:dicroidium_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICROIDIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:dictyonema"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICTYONEMA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:dictyophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICTYOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:dinomischus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DINOMISCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:dioon_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIOON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:dollyphyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DOLLYPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:echmatocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ECHMATOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:edwardsiphyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EDWARDSIPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:elkinsia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ELKINSIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:emplectopteris_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EMPLECTOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:encblue_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ENCBLUE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:ephedra"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EPHEDRA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:equisetites_reed_item"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EQUISETITES_REED.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:equisetites_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EQUISETITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:eremopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EREMOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:escumasia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ESCUMASIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:facivermis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FACIVERMIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:fern_epiphyte"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FERN_EPIPHYTE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:field_horsetail"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FIELD_HORSETAIL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:foozia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FOOZIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:frenelopsis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FRENELOPSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:funisia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FUNISIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:furcifolium"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FURCIFOLIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:furcula_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FURCULA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:gangamopteris_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GANGAMOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:giant_horsetail"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GIANT_HORSETAIL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:jurassic_horsetail"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JURASSIC_HORSETAIL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:gigantopterid_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GIGANTOPTERID.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:ginkgo_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GINKGO.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:ginkgoites_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GINKGOITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:glenopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GLENOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:glossophyllum_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GLOSSOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:glossopterissapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GLOSSOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:gogia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GOGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:grassy_horsetail"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GRASSY_HORSETAIL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:grypania"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GRYPANIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:guangdedendron"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GUANGDEDENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:haootia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HAOOTIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:hapsidophyllas"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HAPSIDOPHYLLAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:helicocystis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELICOCYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:hermanophyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HERMANOPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:herpetogaster"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HERPETOGASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:hironoia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HIRONOIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:hymenaea_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HYMENAEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:ibyka"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_IBYKA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:inaria"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_INARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:ischnophyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ISCHNOPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:isoetes_item"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ISOETES.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:komlopteris_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KOMLOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:ladinia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LADINIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:leclercqia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LECLERCQIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:lepidocystis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPIDOCYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:lepidopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPIDOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:leptocycas_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPTOCYCAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:leptopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPTOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:lesleya"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LESLEYA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:liriodendron_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LIRIODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:lycopia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LYCOPIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:lyginopteris_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LYGINOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:lygodium"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LYGODIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:lyracystis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LYRACYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:macroneuropteris_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MACRONEUROPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:macrotaeniopteris_item"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MACROTAENIOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:magnolia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MAGNOLIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:maple_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MAPLE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:marattia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MARATTIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:medullosales_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEDULLOSALES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:mirabilis_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MIRABILIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:monkey_puzzle_araucaria_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MONKEY_PUZZLE_ARAUCARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:monkeypuzzle_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MONKEYPUZZLE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:namacalathus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NAMACALATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:namapoikia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NAMAPOIKIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:nathorstiana_item"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NATHORSTIANA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:nelumbo"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NELUMBO.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:nematophyta"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NEMATOPHYTA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:nemejcopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NEMEJCOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:neocalamites_item"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NEOCALAMITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:neuropteridium"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NEUROPTERIDIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:nilssonia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NILSSONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:nilssoniocladus_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NILSSONIOCLADUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:nilssoniopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NILSSONIOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:noeggerathiales_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NOEGGERATHIALES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:nothofagus_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NOTHOFAGUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:nystroemia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NYSTROEMIA.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:odontopteris_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ODONTOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:oesia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OESIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:omphalophloios_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OMPHALOPHLOIOS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:ortiseia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ORTISEIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:osmunda"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OSMUNDA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:otozamites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OTOZAMITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:pachypteris_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PACHYPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:palaeognetaleana"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEOGNETALEANA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:palaeostachya_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEOSTACHYA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:pambikalbae"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PAMBIKALBAE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:parviscopa"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARVISCOPA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:paurodendron"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PAURODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:pentoxylales_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PENTOXYLALES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:pertica"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PERTICA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:petriellales"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PETRIELLALES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:phasmatocycas_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHASMATOCYCAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:phoenicopsis_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHOENICOPSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:phoenix_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHOENIX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:phyllotheca_item"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHYLLOTHECA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:pirania"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PIRANIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:pitys_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PITYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:plane_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLANE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:pleuromeia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLEUROMEIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:podocarp_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PODOCARP.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:podozamites_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PODOZAMITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:polyspermophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_POLYSPERMOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:primaeval_grass_item"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PRIMAEVAL_GRASS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:protea_1_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTEA_1.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:protea_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:protolepidodendropsis_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTOLEPIDODENDROPSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:sublepidodendron"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SUBLEPIDODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:lepidosigillaria"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPIDOSIGILLARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:omprelostrobus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OMPRELOSTROBUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:clubmoss"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLUBMOSS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:prototaxites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTOTAXITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:psaronius_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PSARONIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:pseudobornia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PSEUDOBORNIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:pseudovoltzia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PSEUDOVOLTZIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:psilophyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PSILOPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:pteridinium"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PTERIDINIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:pterophyllum_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PTEROPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:ptilophyllum_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PTILOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:quadrocladus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_QUADROCLADUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:quasistrobus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_QUASISTROBUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:redwood_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_REDWOOD.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:rellimia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RELLIMIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:reticulopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RETICULOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:rhacophyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RHACOPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:rhynia_item"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RHYNIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:water_clover_item"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WATER_CLOVER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:acrocomia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ACROCOMIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:rufloria_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RUFLORIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:sahnioxylon_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SAHNIOXYLON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:sanmiguelia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SANMIGUELIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPIDODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:lepidophloios_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPIDOPHLOIOS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:schizoneura_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCHIZONEURA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:schmeissneria"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCHMEISSNERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:sciadopitys_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCIADOPITYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:scolecopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCOLECOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:scytophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCYTOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:selaginella"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SELAGINELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:sigillaria_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SIGILLARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:silver_treefern_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SILVER_TREEFERN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:siphusauctum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SIPHUSAUCTUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:skaaripteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SKAARIPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:spaciinodum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPACIINODUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:keraphyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KERAPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:pietzschia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PIETZSCHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:flabellopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FLABELLOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:sphenobaiera_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPHENOBAIERA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:sphenopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPHENOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:spiny_cycad_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPINY_CYCAD.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:stauropteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STAUROPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:stiff_cycad_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STIFF_CYCAD.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:stromatocystites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STROMATOCYSTITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:stromatolite"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STROMATOLITE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:stromatoveris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STROMATOVERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:surangephyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SURANGEPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:swamp_horsetail_item"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SWAMP_HORSETAIL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:swartpuntia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SWARTPUNTIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:sycamore_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SYCAMORE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:tawuia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TAWUIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:taxodium_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TAXODIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:telemachus_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TELEMACHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:tempskya_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TEMPSKYA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:tentaculita"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TENTACULITA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:tetraxylopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TETRAXYLOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:thamnobeatricea_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THAMNOBEATRICEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:thaumaptilon"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THAUMAPTILON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:thectardis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THECTARDIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:thrombolite"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THROMBOLITE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:thucydia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THUCYDIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:tietea_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TIETEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:tmesipteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TMESIPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:todites_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TODITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:tongchuanophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TONGCHUANOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:tribrachidium"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIBRACHIDIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:trichopitys"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRICHOPITYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:tyrmia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TYRMIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:umaltolepis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_UMALTOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:utrechtia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_UTRECHTIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:valmeyerodendron_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VALMEYERODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:ventogyrus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VENTOGYRUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:wachtleria"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WACHTLERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:wachtlerina"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WACHTLERINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:walchia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WALCHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:water_horsetail_item"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WATER_HORSETAIL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:wattieza_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WATTIEZA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:pachypteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WEICHSELIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:wielandiella"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WIELANDIELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:williamsonia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WILLIAMSONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:wollemi_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WOLLEMI.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:wood_horsetail"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WOOD_HORSETAIL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:xenocladia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_XENOCLADIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:xianguangia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_XIANGUANGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:xihuphyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_XIHUPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:yew_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YEW.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:zamites_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ZAMITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:zosterophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ZOSTEROPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:zygopteridaceae_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ZYGOPTERIDACEAE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:zygopteris_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ZYGOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:gigantospongia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GIGANTOSPONGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:cephalotaxus_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CEPHALOTAXUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:cunninghamia_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CUNNINGHAMIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:hoop_araucaria_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HOOP_ARAUCARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:amentotaxus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMENOTAXUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:scrubby_pine_sapling"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCRUBBY_PINE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}


			//Grouped ones:
			//-------------
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:blastoid_1"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:blastoid_2"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:blastoid_3"),
						target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
				) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BLASTOID.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:caytoniales"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:caytoniales2"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
				) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAYTONIALES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:fenestella_1"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:fenestella_2"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:fenestella_3"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:fenestella_4"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:fenestella_5"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:fenestella_giant_blue"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:fenestella_giant_green"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:fenestella_giant_orange"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:fenestella_giant_red"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:fenestella_giant_yellow"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
			) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FENESTELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:matonia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:matonia_large"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MATONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:primocandelabrum_1"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:primocandelabrum_2"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PRIMOCANDELABRUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:rugosa_1"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:rugosa_2"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:rugosa_3"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:rugosa_4"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:rugosa_5"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
				) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RUGOSA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:sea_anemone_1"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:sea_anemone_2"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:sea_anemone_3"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:sea_anemone_4"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:sea_anemone_5"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:sea_anemone_6"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:sea_anemone_7"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:sea_anemone_8"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:sea_anemone_9"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SEA_ANEMONE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:sphenophyllales"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("plantdnaPNlepidodendron:sphenophyllales1"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
				) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPHENOPHYLLALES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:tabulata_1"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:tabulata_2"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:tabulata_3"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:tabulata_4"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:tabulata_block_1"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:tabulata_block_2"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:tabulata_block_3"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TABULATA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:blue_sponge"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:branched_sponge"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:brown_sponge"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:dark_orange_sponge"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:dark_pink_sponge"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:orange_sponge"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:pink_sponge"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:red_sponge"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:white_sponge"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:yellow_sponge"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
				) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPONGE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coral_bamboo"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coral_blue_crust"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coral_blue_staghorn"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coral_brain"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coral_carnation"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coral_red_tree"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coral_soft_fan"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coral_stony_blooming"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coral_stony_fractal_branching"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coral_stony_lumpy"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coral_stony_pipe_stack"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coral_stony_puffy"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coral_stony_rough_branching"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coral_stony_sparse_branching"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coral_stony_tubular"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("staticdnaPNlepidodendron:coral_tan_staghorn"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
			) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CORAL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}


			//Special case:
			else if (target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()).getItem()
				== Item.getItemFromBlock(BlockWebsteroprionBurrow.block)) {
				if (!(event.getWorld().getEntitiesWithinAABB(EntityPrehistoricFloraWebsteroprionHole.class, new AxisAlignedBB(event.getPos(), event.getPos().add(1, 1, 1))).isEmpty())) {
					if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
						ModTriggers.CLICK_WEBSTEROPRION.trigger((EntityPlayerMP) event.getEntityPlayer());
					}
					event.getEntityPlayer().swingArm(event.getHand());
					event.setCanceled(true);
					return;
				}
			}


		}


	}

	public void deliverStatsEntity(PlayerInteractEvent.EntityInteract event) {
		String agePercent = "";
		double maxHealth = 0;
		double actualHealth = 0;
		BlockPos nestPos = null;
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
		if (event.getTarget() instanceof EntityPrehistoricFloraLandBase) {
			if (((EntityPrehistoricFloraLandBase) event.getTarget()).hasNest()) {
				nestPos = ((EntityPrehistoricFloraLandBase) event.getTarget()).getNestLocation();
				if (nestPos != null
						&& ((EntityPrehistoricFloraLandBase) event.getTarget()).hasNest()
						&& !((EntityPrehistoricFloraLandBase) event.getTarget()).isNestMound()) {
					nestString = " has nest at " + nestPos.getX() + " " + nestPos.getY() + " " + nestPos.getZ();
				} else {
					nestString = " with no known nest";
				}
			}
		}

		if (event.getWorld().isRemote) {
			event.getEntityPlayer().sendMessage(new TextComponentString(event.getTarget().getName() + " aged: " + agePercent + " health: " + df.format(actualHealth) + "/" + df.format(maxHealth) + " (" + Math.ceil((actualHealth/maxHealth) * 100) + "%)" + nestString));
		}
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
			if (event.getTarget() instanceof EntityPrehistoricFloraAcadoaradoxides) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ACADOARADOXIDES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAcanthodes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ACANTHODES.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraAcrolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ACROLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAcutiramus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ACUTIRAMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraAlbertonia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ALBERTONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAllenypterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ALLENYPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraAntineosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANTINEOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraArchosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCHOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraAstraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ASTRASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAteleaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ATELEASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraBirkenia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIRKENIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBlourugia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BLOURUGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBobasatrania ) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BOBASATRANIA .trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBoothiaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BOOTHIASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBothriolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BOTHRIOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraBrochoadmones) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BROCHOADMONES.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraCladoselache) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLADOSELACHE.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraClydagnathus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLYDAGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCoccosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COCCOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCoelacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COELACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraCotylorhynchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COTYLORHYNCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraCtenospondylus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CTENOSPONDYLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraCynognathus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYNOGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraDaedalichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DAEDALICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraDiadectes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIADECTES.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraDoryaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DORYASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDorypterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DORYPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraDrepanaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DREPANASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraEbenaqua) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EBENAQUA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEdestus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EDESTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEglonaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EGLONASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraEusthenopteron) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EUSTHENOPTERON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraFeroxichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FEROXICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraFurcacauda) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FURCACAUDA.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraGabreyaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GABREYASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGantarostrataspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GANTAROSTRATASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraGnathorhiza) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GNATHORHIZA.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraGorgonops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GORGONOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGroenlandaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GROENLANDASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGyracanthides) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GYRACANTHIDES.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraHemicyclaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HEMICYCLASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHerrerasaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HERRERASAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraHibernaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HIBERNASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHolonema) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HOLONEMA.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraHylonomus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HYLONOMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHyneria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HYNERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraPromissum) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROMISSUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraSaurichthysFreshwater
			|| event.getTarget() instanceof EntityPrehistoricFloraSaurichthysMarine) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SAURICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
		else if (event.getTarget() instanceof EntityPrehistoricFloraAstraspis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
			ModTriggers.CLICK_ASTRASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
		else if (event.getTarget() instanceof EntityPrehistoricFloraBoothiaspis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BOOTHIASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraHolonema) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HOLONEMA.trigger((EntityPlayerMP) event.getEntityPlayer());
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
		else if (event.getTarget() instanceof EntityPrehistoricFloraFadeniaCarboniferous) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_FADENIA_CARBONIFEROUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraFadeniaPermotriassic) {
			if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
				ModTriggers.CLICK_FADENIA_PERMOTRIASSIC.trigger((EntityPlayerMP) event.getEntityPlayer());
			}
			event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
			event.setCanceled(true);
			return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraFalcatus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_FALCATUS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
		else if (event.getTarget() instanceof EntityPrehistoricFloraCobelodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_COBELODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
		else if (event.getTarget() instanceof EntityPrehistoricFloraBrembodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BREMBODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
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
		else if (event.getTarget() instanceof EntityPrehistoricFloraHyperodapedon) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HYPERODAPEDON.trigger((EntityPlayerMP) event.getEntityPlayer());
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
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Delitzschala) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEODICTYOPTERA_DELITZSCHALA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Dunbaria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEODICTYOPTERA_DUNBARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Homaloneura) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEODICTYOPTERA_HOMALONEURA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Homoioptera) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEODICTYOPTERA_HOMOIOPTERA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Lithomantis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEODICTYOPTERA_LITHOMANTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Lycocercus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEODICTYOPTERA_LYCOCERCUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Sinodunbaria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEODICTYOPTERA_SINODUNBARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Stenodictya) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEODICTYOPTERA_STENODICTYA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
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

			
			else if (event.getTarget() instanceof EntityPrehistoricFloraTitanopteraClatrotitan) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TITANOPTERA_CLATROTITAN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			
			else if (event.getTarget() instanceof EntityPrehistoricFloraTitanopteraGigatitan) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TITANOPTERA_GIGATITAN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			
			else if (event.getTarget() instanceof EntityPrehistoricFloraTitanopteraMesotitan) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TITANOPTERA_MESOTITAN.trigger((EntityPlayerMP) event.getEntityPlayer());
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
					|| event.getTarget() instanceof EntityPrehistoricFloraAscoceras_Baby) {
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
			/*
			else if (event.getTarget() instanceof EntityPrehistoricFloraPentecopterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PENTECOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}*/
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

			else if (event.getTarget() instanceof EntityPrehistoricFloraThrissops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THRISSOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				deliverStatsEntity(event);
				event.setCanceled(true);
				return;
			}
			/*
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
			*/

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
			else if (event.getTarget() instanceof EntityPrehistoricFloraDryosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DRYOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
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







			//------------------------------------------------------------------------------
			//Put these at the end so as to trigger their children above in preference first
			//These next ones are only the ones which act as PARENTS for other classes:
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
			//End of PARENT entities - see comment above
			//------------------------------------------------------------------------------

			

		}
	}

}
