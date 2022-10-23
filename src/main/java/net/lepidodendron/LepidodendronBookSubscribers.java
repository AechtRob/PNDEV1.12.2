package net.lepidodendron;

import net.lepidodendron.entity.*;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;

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
			if (raytraceresult != null)
			{
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
			IBlockState state = event.getWorld().getBlockState(event.getPos());
			Block target = state.getBlock();

			if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAcacia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ACACIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAdoketophyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ADOKETOPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAethophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AETHOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAgathis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AGATHIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAlethopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ALETHOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAlliopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ALLIOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAllonnia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ALLONNIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAlpia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ALPIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAneurophyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANEUROPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAnkyropteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANKYROPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAnomozamites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANOMOZAMITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAntarcticycas"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANTARCTICYCAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNApple"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_APPLE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAraucarioxylon"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARAUCARIOXYLON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAraucarites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARAUCARITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNArborea"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARBOREA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNArchaeanthus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCHAEANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNArchaefructus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCHAEFRUCTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNArchaeopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCHAEOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAridHorsetail"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARID_HORSETAIL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNArkarua"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARKARUA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNArthropitys"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARTHROPITYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNArtocarpus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARTOCARPUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAsteroxylon"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ASTEROXYLON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAulacera"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AULACERA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNAusia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AUSIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBaiera"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BAIERA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBaikalophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BAIKALOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBanksia1"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BANKSIA_1.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBanksia2"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BANKSIA_2.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBaragwanathia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BARAGWANATHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBeech"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BEECH.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBelemnopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BELEMNOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBirch"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIRCH.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBivalveCream"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_CREAM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBivalveDark"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_DARK.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBivalveDicerocardium"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_DICEROCARDIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBivalveGreen"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_GREEN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBivalveGrey"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_GREY.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBivalveInoceramus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_INOCERAMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBivalveLithiotis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_LITHIOTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBivalveMegalodon"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_MEGALODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBivalveTall"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_TALL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBivalveUpright"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_UPRIGHT.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBivalveWhite"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIVALVE_WHITE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBjuvia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BJUVIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBlackTreefern"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BLACK_TREEFERN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBolbitis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BOLBITIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBomakellia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BOMAKELLIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBothrodendron"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BOTHRODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBrachiopodGigantoproductus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRACHIOPOD_GIGANTOPRODUCTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBrachiopodOrthid"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRACHIOPOD_ORTHID.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBrachiopodSpiriferid"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRACHIOPOD_SPIRIFERID.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBrachyphyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRACHYPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBradgatia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRADGATIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBrasilodendron"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRASILODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBristlecone"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRISTLECONE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBumbudendron"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BUMBUDENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBunya"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BUNYA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBuriadia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BURIADIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBurykhia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BURYKHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCalamites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CALAMITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCalamophyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CALAMOPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCallistophytales"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CALLISTOPHYTALES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCastericystis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CASTERICYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCecropsis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CECROPSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCharnia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHARNIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCharniodiscus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHARNIODISCUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNChaunograptus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHAUNOGRAPTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCinnamonFern"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CINNAMON_FERN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCladophlebis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLADOPHLEBIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNClathropteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLATHROPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNClaytosmunda"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLAYTOSMUNDA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCloudina"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLOUDINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCobbania"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COBBANIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNColumnaris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COLUMNARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNConiopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CONIOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNConomedusites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CONOMEDUSITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCooksonia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COOKSONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCordaites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CORDAITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCornulitida"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CORNULITIDA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCoronacollina"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CORONACOLLINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCorumbella"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CORUMBELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidAncyrocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_ANCYROCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidCallicrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_CALLICRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidCaryocrinites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_CARYOCRINITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidCupressocrinites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_CUPRESSOCRINITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidCyathocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_CYATHOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidDizygocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_DIZYGOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidEncrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_ENCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidEucalyptocrinites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_EUCALYPTOCRINITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidHolocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_HOLOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidJimbacrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_JIMBACRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidMacrocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_MACROCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidPetalocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_PETALOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidPisocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_PISOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidScyphocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_SCYPHOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidSiphonocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_SIPHONOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidTraumatocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_TRAUMATOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidVadarocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_VADAROCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCrinoidVostocovacrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRINOID_VOSTOCOVACRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCtenis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CTENIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCycadeoidea"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYCADEOIDEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCycadopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYCADOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCycas"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYCAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCyclodendron"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYCLODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCypress"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYPRESS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCystoidAristocystites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYSTOID_ARISTOCYSTITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCystoidBolboporites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYSTOID_BOLBOPORITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCystoidEchinosphaerites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYSTOID_ECHINOSPHAERITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCystoidPseudocrinites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYSTOID_PSEUDOCRINITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCzekanowskia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CZEKANOWSKIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDarkOak"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DARK_OAK.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDawnRedwood"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DAWN_REDWOOD.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDendrograptus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DENDROGRAPTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDiaphorodendron"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIAPHORODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDicksonia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICKSONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDicranophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICRANOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDicroidiumE"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICROIDIUM_E.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDicroidiumF"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICROIDIUM_F.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDicroidiumO"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICROIDIUM_O.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDicroidium"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICROIDIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDictyonema"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICTYONEMA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDictyophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICTYOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDinomischus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DINOMISCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDioon"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIOON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDollyphyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DOLLYPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNEchmatocrinus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ECHMATOCRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNEdwardsiphyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EDWARDSIPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNElkinsia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ELKINSIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNEmplectopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EMPLECTOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNEncblue"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ENCBLUE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNEphedra"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EPHEDRA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNEquisetitesReed"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EQUISETITES_REED.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNEquisetites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EQUISETITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNEremopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EREMOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNEscumasia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ESCUMASIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFacivermis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FACIVERMIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFernEpiphyte"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FERN_EPIPHYTE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFieldHorsetail"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FIELD_HORSETAIL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFoozia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FOOZIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFrenelopsis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FRENELOPSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFunisia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FUNISIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFurcifolium"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FURCIFOLIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFurcula"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FURCULA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNGangamopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GANGAMOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNGiantHorsetail"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GIANT_HORSETAIL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNGigantopterid"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GIGANTOPTERID.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNGinkgo"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GINKGO.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNGinkgoites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GINKGOITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNGlenopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GLENOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNGlossophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GLOSSOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNGlossopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GLOSSOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNGogia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GOGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNGrassyHorsetail"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GRASSY_HORSETAIL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNGrypania"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GRYPANIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNGuangdedendron"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GUANGDEDENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNHaootia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HAOOTIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNHapsidophyllas"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HAPSIDOPHYLLAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNHelicocystis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELICOCYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNHermanophyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HERMANOPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNHerpetogaster"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HERPETOGASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNHironoia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HIRONOIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNHymenaea"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HYMENAEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNIbyka"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_IBYKA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNInaria"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_INARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNIschnophyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ISCHNOPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNIsoetes"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ISOETES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNJungle"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JUNGLE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNKomlopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KOMLOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNLadinia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LADINIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNLeclercqia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LECLERCQIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNLepidocystis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPIDOCYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNLepidopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPIDOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNLeptocycas"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPTOCYCAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNLeptopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPTOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNLesleya"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LESLEYA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNLiriodendron"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LIRIODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNLycopia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LYCOPIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNLyginopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LYGINOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNLygodium"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LYGODIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNLyracystis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LYRACYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNMacroneuropteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MACRONEUROPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNMacrotaeniopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MACROTAENIOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNMagnolia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MAGNOLIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNMaple"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MAPLE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNMarattia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MARATTIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNMedullosales"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEDULLOSALES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNMirabilis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MIRABILIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNMonkeyPuzzleAraucaria"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MONKEY_PUZZLE_ARAUCARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNMonkeypuzzle"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MONKEYPUZZLE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNNamacalathus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NAMACALATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNNamapoikia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NAMAPOIKIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNNathorstiana"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NATHORSTIANA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNNelumbo"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NELUMBO.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNNematophyta"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NEMATOPHYTA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNNemejcopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NEMEJCOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNNeocalamites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NEOCALAMITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNNeuropteridium"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NEUROPTERIDIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNNilssonia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NILSSONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNNilssoniocladus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NILSSONIOCLADUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNNilssoniopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NILSSONIOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNNoeggerathiales"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NOEGGERATHIALES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNNothofagus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NOTHOFAGUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNNystroemia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NYSTROEMIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNOak"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OAK.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNOdontopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ODONTOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNOesia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OESIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNOmphalophloios"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OMPHALOPHLOIOS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNOrtiseia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ORTISEIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNOsmunda"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OSMUNDA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNOtozamites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OTOZAMITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPachypteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PACHYPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPalaeognetaleana"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEOGNETALEANA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPalaeostachya"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEOSTACHYA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPambikalbae"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PAMBIKALBAE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNParviscopa"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARVISCOPA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPaurodendron"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PAURODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPentoxylales"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PENTOXYLALES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPertica"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PERTICA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPetriellales"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PETRIELLALES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPhasmatocycas"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHASMATOCYCAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPhoenicopsis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHOENICOPSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPhyllotheca"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHYLLOTHECA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPirania"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PIRANIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPitys"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PITYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPlane"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLANE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPleuromeia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLEUROMEIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPodocarp"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PODOCARP.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPodozamites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PODOZAMITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPolyspermophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_POLYSPERMOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPrimaevalGrass"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PRIMAEVAL_GRASS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNProtea1"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTEA_1.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNProtea"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNProtolepidodendropsis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTOLEPIDODENDROPSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPrototaxites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTOTAXITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPsaronius"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PSARONIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPseudobornia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PSEUDOBORNIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPseudovoltzia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PSEUDOVOLTZIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPsilophyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PSILOPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPteridinium"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PTERIDINIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPterophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PTEROPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPtilophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PTILOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNQuadrocladus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_QUADROCLADUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNQuasistrobus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_QUASISTROBUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNRedwood"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_REDWOOD.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNRellimia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RELLIMIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNReticulopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RETICULOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNRhacophyton"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RHACOPHYTON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNRhynia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RHYNIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNRufloria"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RUFLORIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSahnioxylon"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SAHNIOXYLON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSanmiguelia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SANMIGUELIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNLepidodendron"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPIDODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSchizoneura"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCHIZONEURA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSchmeissneria"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCHMEISSNERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSciadopitys"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCIADOPITYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNScolecopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCOLECOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNScytophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCYTOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSelaginella"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SELAGINELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSigillaria"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SIGILLARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSilverTreefern"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SILVER_TREEFERN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSiphusauctum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SIPHUSAUCTUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSkaaripteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SKAARIPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSpaciinodum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPACIINODUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSphenobaiera"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPHENOBAIERA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSphenopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPHENOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSpinyCycad"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPINY_CYCAD.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSpruce"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPRUCE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNStauropteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STAUROPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNStiffCycad"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STIFF_CYCAD.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNStromatocystites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STROMATOCYSTITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNStromatolite"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STROMATOLITE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNStromatoveris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STROMATOVERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSurangephyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SURANGEPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSwampHorsetail"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SWAMP_HORSETAIL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSwartpuntia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SWARTPUNTIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSycamore"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SYCAMORE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNTawuia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TAWUIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNTaxodium"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TAXODIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNTelemachus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TELEMACHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNTempskya"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TEMPSKYA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNTentaculita"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TENTACULITA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNTetraxylopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TETRAXYLOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNThamnobeatricea"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THAMNOBEATRICEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNThaumaptilon"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THAUMAPTILON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNThectardis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THECTARDIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNThrombolite"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THROMBOLITE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNThucydia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THUCYDIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNTietea"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TIETEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNTmesipteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TMESIPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNTodites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TODITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNTongchuanophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TONGCHUANOPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNTribrachidium"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIBRACHIDIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNTrichopitys"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRICHOPITYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNTyrmia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TYRMIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNUmaltolepis"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_UMALTOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNUtrechtia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_UTRECHTIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNValmeyerodendron"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VALMEYERODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNVentogyrus"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VENTOGYRUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNWachtleria"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WACHTLERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNWachtlerina"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WACHTLERINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNWalchia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WALCHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNWaterHorsetail"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WATER_HORSETAIL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNWattieza"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WATTIEZA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNWeichselia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WEICHSELIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNWielandiella"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WIELANDIELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNWilliamsonia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WILLIAMSONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNWollemi"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WOLLEMI.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNWoodHorsetail"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WOOD_HORSETAIL.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNXenocladia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_XENOCLADIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNXianguangia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_XIANGUANGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNXihuphyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_XIHUPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNYew"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YEW.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNZamites"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ZAMITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNZosterophyllum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ZOSTEROPHYLLUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNZygopteridaceae"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ZYGOPTERIDACEAE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNZygopteris"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ZYGOPTERIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNGigantospongia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GIGANTOSPONGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}



			//Grouped ones:
			//-------------
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBlastoid1"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBlastoid2"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBlastoid3"),
						target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
				) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BLASTOID.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCaytoniales"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNCaytoniales2"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
				) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAYTONIALES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFenestella1"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFenestella2"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFenestella3"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFenestella4"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFenestella5"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFenestellaGiantBlue"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFenestellaGiantGreen"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFenestellaGiantOrange"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFenestellaGiantRed"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNFenestellaGiantYellow"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
			) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FENESTELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNMatonia"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MATONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNPrimocandelabrum"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PRIMOCANDELABRUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNRugosa"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RUGOSA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSeaAnemone1"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSeaAnemone2"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSeaAnemone3"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSeaAnemone4"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSeaAnemone5"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSeaAnemone6"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSeaAnemone7"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSeaAnemone8"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSeaAnemone9"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SEA_ANEMONE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNSphenophyllales"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPHENOPHYLLALES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNTabulata"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TABULATA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBlueSponge"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBranchedSponge"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNBrownSponge"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDarkOrangeSponge"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
					|| OreDictionary.containsMatch(false, OreDictionary.getOres("dnaPNDarkPinkSponge"),
					target.getPickBlock(state, new RayTraceResult(event.getEntityPlayer()), event.getWorld(), event.getPos(), event.getEntityPlayer()))
				) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPONGE.trigger((EntityPlayerMP) event.getEntityPlayer());
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
		if (event.getTarget() instanceof EntityPrehistoricFloraAgeableBase) {
			agePercent = Math.floor(((EntityPrehistoricFloraAgeableBase)event.getTarget()).getAgeScale() * 100F) + "%";
		}
		else {
			agePercent = "100%";
		}
		if (event.getTarget() instanceof EntityLivingBase) {
			maxHealth = ((EntityLivingBase) event.getTarget()).getMaxHealth();
			actualHealth = ((EntityLivingBase) event.getTarget()).getHealth();
		}
		if (event.getWorld().isRemote) {
			event.getEntityPlayer().sendMessage(new TextComponentString(event.getTarget().getName() + " aged: " + agePercent + " health: " + actualHealth + "/" + maxHealth + " (" + Math.ceil((actualHealth/maxHealth) * 100) + "%)"));
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
		else if (event.getTarget() instanceof EntityPrehistoricFloraArthropleura) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ARTHROPLEURA.trigger((EntityPlayerMP) event.getEntityPlayer());
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
				//if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
				//	ModTriggers.CLICK_ASCOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				//}
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
