package net.lepidodendron;

import net.lepidodendron.block.BlockLepidodendronStrobilus;
import net.lepidodendron.block.BlockTreeLeaves;
import net.lepidodendron.block.BlockWoodenLog;
import net.lepidodendron.entity.*;
import net.lepidodendron.util.ModTriggers;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class LepidodendronBookSubscribers {

	@SubscribeEvent
	public void onUseBook(PlayerInteractEvent.RightClickBlock event) {
		/// click on blocks:
		if (!event.getItemStack().getItem().getRegistryName().toString().equalsIgnoreCase("patchouli:guide_book")) {
			return;
		}
		if (event.getItemStack().getTagCompound() != null) {
			if (!event.getItemStack().getTagCompound().toString().contains("lepidodendron:paleopedia")) {
				return;
			}
			Block target = event.getWorld().getBlockState(event.getPos()).getBlock();

			if (target == BlockWoodenLog.block
				|| target == BlockLepidodendronStrobilus.block
				|| target == BlockTreeLeaves.block) {
				//System.err.println("Test player");
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					//System.err.println("Is player");
					ModTriggers.CLICK_LEPIDODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (target == BlockWoodenLog.block
					|| target == BlockLepidodendronStrobilus.block
					|| target == BlockTreeLeaves.block) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEPIDODENDRON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
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
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAcanthodes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ACANTHODES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAcanthostega) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ACANTHOSTEGA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAcanthostomatops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ACANTHOSTOMATOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAcrolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ACROLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAcutiramus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ACUTIRAMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAdelophthalmus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ADELOPHTHALMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAegirocassis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AEGIROCASSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAiniktozoon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AINIKTOZOON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAkmonistion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AKMONISTION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAlacaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ALACARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAlbertonia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ALBERTONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAllenypterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ALLENYPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Asteroceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_ASTEROCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Ceratites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_CERATITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Coroniceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_CORONICERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Cylolobus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_CYLOLOBUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Dactylioceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_DACTYLIOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Goniatites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_GONIATITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Manticoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_MANTICOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Pachydesmoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_PACHYDESMOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Pachydiscus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_PACHYDISCUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Parapuzosia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_PARAPUZOSIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmmonite_Titanites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMMONITE_TITANITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmphibamus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMPHIBAMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAmplectobelua) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AMPLECTOBELUA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAnomalocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANOMALOCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAntarcticarcinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANTARCTICARCINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAnteosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANTEOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAnthracomedusa) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANTHRACOMEDUSA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAntineosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ANTINEOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAphetoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_APHETOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraArandaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARANDASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraArchosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCHOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAsaphus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ASAPHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAscendonanus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ASCENDONANUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAstraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ASTRASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAteleaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ATELEASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAttercopus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ATTERCOPUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraAulacephalodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_AULACEPHALODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBalanerpeton ) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BALANERPETON .trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBandringa) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BANDRINGA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBanffia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BANFFIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBarbclabornia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BARBCLABORNIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBasiloceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BASILOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBatofasciculus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BATOFASCICULUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBelantsea) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BELANTSEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBirkenia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BIRKENIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBlourugia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BLOURUGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBobasatrania ) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BOBASATRANIA .trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBoothiaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BOOTHIASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBothriolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BOTHRIOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBranchiosaur) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BRANCHIOSAUR.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBrochoadmones) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BROCHOADMONES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBunostegos) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BUNOSTEGOS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraBushizheia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_BUSHIZHEIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCacops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CACOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCalvapilosa) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CALVAPILOSA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCambroraster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAMBRORASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCameroceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAMEROCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCampbellodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAMPBELLODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCanadaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CANADASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCanadia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CANADIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCaptorhinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAPTORHINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCarcinosoma) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CARCINOSOMA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCarolowilhelmina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CAROLOWILHELMINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCasineria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CASINERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCephalaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CEPHALASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCheirurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHEIRURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCheloniellon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CHELONIELLON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCladoselache) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLADOSELACHE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraClaudiosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLAUDIOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraClydagnathus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CLYDAGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCoccosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COCCOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCoelacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COELACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCoelophysis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COELOPHYSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCoelurosauravus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COELUROSAURAVUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCooperoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COOPEROCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCothurnocystis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COTHURNOCYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCotylorhynchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_COTYLORHYNCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCrassigyrinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CRASSIGYRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCrotalocephalus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CROTALOCEPHALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCtenospondylus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CTENOSPONDYLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCyclonema) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYCLONEMA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCynognathus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYNOGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCyrtoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CYRTOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDaedalichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DAEDALICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDalmanites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DALMANITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDasyceps) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DASYCEPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDatheosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DATHEOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDeiroceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DEIROCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDiadectes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIADECTES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDiania) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIANIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDickinsonia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DICKINSONIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDidymograptus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIDYMOGRAPTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDimetrodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIMETRODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDiplocaulus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIPLOCAULUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDiploceraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIPLOCERASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDoryaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DORYASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDorypterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DORYPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDracopristis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DRACOPRISTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDrepanaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DREPANASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDrotops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DROTOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDunkleosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DUNKLEOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDvinia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DVINIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraDvinosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DVINOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEbenaqua) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EBENAQUA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEdestus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EDESTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEglonaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EGLONASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraElginia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ELGINIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEllipsocephalus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ELLIPSOCEPHALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraElrathia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ELRATHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEndoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ENDOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEnoploura) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ENOPLOURA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEoandromeda) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EOANDROMEDA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEoarthropleura) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EOARTHROPLEURA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEoraptor) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EORAPTOR.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEoredlichia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EOREDLICHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEosaurichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EOSAURICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEosimops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EOSIMOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEricixerxes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ERICIXERXES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEryops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ERYOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEstemmenosuchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ESTEMMENOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEuchambersia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EUCHAMBERSIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEunotosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EUNOTOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEurypterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EURYPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraEusthenopteron) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_EUSTHENOPTERON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraFeroxichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FEROXICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraFurcacauda) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FURCACAUDA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraFurcaster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_FURCASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGabreyaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GABREYASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGantarostrataspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GANTAROSTRATASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGemmactena) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GEMMACTENA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGemuendina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GEMUENDINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGephyrostegus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GEPHYROSTEGUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGerarusInsect) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GERARUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGlaurung) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GLAURUNG.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGnathorhiza) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GNATHORHIZA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGonioceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GONIOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGorgonops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GORGONOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGroenlandaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GROENLANDASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraGyracanthides) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_GYRACANTHIDES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHaikouichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HAIKOUICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHallucigenia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HALLUCIGENIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHarvestman) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HARVESTMAN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHelenodora) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELENODORA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHelianthaster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELIANTHASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHeliopeltis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELIOPELTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHelicoprion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELICOPRION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHelmetia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HELMETIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHemicyclaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HEMICYCLASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHerrerasaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HERRERASAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHeterosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HETEROSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHibbertopterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HIBBERTOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHibernaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HIBERNASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHolonema) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HOLONEMA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHungioides) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HUNGIOIDES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHylonomus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HYLONOMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraHyneria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_HYNERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraIchthyostega) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ICHTHYOSTEGA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraIniopteryx) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_INIOPTERYX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraInostrancevia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_INOSTRANCEVIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraIsotelus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ISOTELUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJaekelopterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JAEKELOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJanassa) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JANASSA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish_Precambrian) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JELLYFISH_PRECAMBRIAN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish1) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JELLYFISH1.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish2) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JELLYFISH2.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish3) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JELLYFISH3.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish4) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JELLYFISH4.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish5) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JELLYFISH5.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish6) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JELLYFISH6.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJellyfish7) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JELLYFISH7.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJianshanopodia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JIANSHANOPODIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraJonkeria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_JONKERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKaibabvenator) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KAIBABVENATOR.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKalbarria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KALBARRIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKerygmachela) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KERYGMACHELA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKimberella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KIMBERELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKodymirus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KODYMIRUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraKokomopterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_KOKOMOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLabidosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LABIDOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLaccognathus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LACCOGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLaminacaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LAMINACARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLanceaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LANCEASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLebachacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LEBACHACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLiliensternus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LILIENSTERNUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLimnoscelis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LIMNOSCELIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLisowicia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LISOWICIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraListracanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LISTRACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLituites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LITUITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLunaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LUNASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLunataspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LUNATASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLungmenshanaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LUNGMENSHANASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLyrarapax) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LYRARAPAX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLystrosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LYSTROSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMaclurina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MACLURINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMarrella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MARRELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMastodonsaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MASTODONSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMcnamaraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MCNAMARASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMegalocephalus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGALOCEPHALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMegalograptus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGALOGRAPTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMeganeura
				|| event.getTarget() instanceof EntityPrehistoricFloraMeganeuraNymph) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGANEURA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMeganeuropsis
					|| event.getTarget() instanceof EntityPrehistoricFloraMeganeuropsisNymph) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGANEUROPSIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMegarachne) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MEGARACHNE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMelosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MELOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMenaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MENASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMesosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MESOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMetaspriggina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_METASPRIGGINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMicrodictyon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MICRODICTYON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMimetaster) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MIMETASTER.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMixopterus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MIXOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMonograptus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MONOGRAPTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMontecaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MONTECARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMooreoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MOOREOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraMoschops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_MOSCHOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraNectocaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NECTOCARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOdaraia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ODARAIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOdontogriphus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ODONTOGRIPHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOmnidens) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OMNIDENS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOnychodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ONYCHODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOpabinia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OPABINIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOphiacodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OPHIACODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOrthoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ORTHOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOrthrozanclus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ORTHROZANCLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOsteolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OSTEOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraOttoia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_OTTOIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPagea) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PAGEA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Delitzschala
					|| event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Dunbaria
					|| event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Homaloneura
					|| event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Homoioptera
					|| event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Lithomantis
					|| event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Lycocercus
					|| event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Sinodunbaria
					|| event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyoptera_Stenodictya
					|| event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyopteraNymph
					|| event.getTarget() instanceof EntityPrehistoricFloraPalaeodictyopteraNymphPerm) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEODICTYOPTERA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeoisopus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEOISOPUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
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
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeontinid) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEONTINID.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPanderichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PANDERICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPanderodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PANDERODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPantylus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PANTYLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraParadoxides) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARADOXIDES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraParanaichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARANAICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraParexus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PAREXUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraParvancorina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARVANCORINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPaucipodia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PAUCIPODIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPederpes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PEDERPES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPelurgaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PELURGASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPhanerotinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHANEROTINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPhantaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHANTASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPharyngolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHARYNGOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPhlegethontia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHLEGETHONTIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPholiderpeton) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHOLIDERPETON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPhragmoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHRAGMOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPikaia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PIKAIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPlacerias) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLACERIAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPlateosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLATEOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPlatycaraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLATYCARASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPlatyhystrix) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLATYHYSTRIX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPlatylomaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLATYLOMASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPlatysomus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PLATYSOMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPneumodesmus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PNEUMODESMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPoleumita) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_POLEUMITA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPomatrum) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_POMATRUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPoraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PORASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPrionosuchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PRIONOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPristerognathus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PRISTEROGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraProburnetia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROBURNETIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraProcynosuchus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROCYNOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraProfallotaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROFALLOTASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPromissum) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROMISSUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraProsictodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROSICTODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraProterogyrinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTEROGYRINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraProtorosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTOROSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraProtozygoptera
					|| event.getTarget() instanceof EntityPrehistoricFloraProtozygopteraNymph) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PROTOZYGOPTERA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPsarolepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PSAROLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPteraspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PTERASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPterygotus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PTERYGOTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPurlovia ) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PURLOVIA .trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraQilinyu) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_QILINYU.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRautiania) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RAUTIANIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRayonnoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RAYONNOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRebellatrix) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_REBELLATRIX.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRemigiomontanus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_REMIGIOMONTANUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRetifacies) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RETIFACIES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRhizodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_RHIZODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
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
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraRobertia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ROBERTIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSacabambaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SACABAMBASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSaivodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SAIVODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSaurichthysFreshwater
			|| event.getTarget() instanceof EntityPrehistoricFloraSaurichthysMarine) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SAURICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSauroctonus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SAUROCTONUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraScaumenacia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCAUMENACIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSchinderhannes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCHINDERHANNES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraScorpion_Gigantoscorpio) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCORPION_GIGANTOSCORPIO.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraScorpion_Gondwanascorpio) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCORPION_GONDWANASCORPIO.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraScorpion_Opsieobuthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCORPION_OPSIEOBUTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraScorpion_Pulmonoscorpius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCORPION_PULMONOSCORPIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraScutosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SCUTOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSelenopeltis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SELENOPELTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSemionotus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SEMIONOTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSeymouria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SEYMOURIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraShonisaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SHONISAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraShringasaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SHRINGASAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSiberion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SIBERION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSidneyia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SIDNEYIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSpathicephalus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPATHICEPHALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSphenacodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPHENACODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSpiniplatyceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPINIPLATYCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSpinoaequalis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPINOAEQUALIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSpriggina) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPRIGGINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSquatinactis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SQUATINACTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraStensioella) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_STENSIOELLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSuminia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SUMINIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSynophalos) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SYNOPHALOS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTapinocephalus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TAPINOCEPHALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTartuosteus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TARTUOSTEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTegopelte) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TEGOPELTE.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTemperoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TEMPEROCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTerataspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TERATASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTetraceratops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TETRACERATOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTetragraptus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TETRAGRAPTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraThelodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THELODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraThrinaxodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_THRINAXODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTitanichthys) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TITANICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTiarajudens) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TIARAJUDENS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTokummia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TOKUMMIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTraquairius) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRAQUAIRIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTrigonotarbid_Cryptomartus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIGONOTARBID_CRYPTOMARTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTrigonotarbid_Eophrynus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIGONOTARBID_EOPHRYNUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTrigonotarbid_Kreischeria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIGONOTARBID_KREISCHERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTrigonotarbid_Palaeotarbus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIGONOTARBID_PALAEOTARBUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTrigonotarbid_Permotarbus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIGONOTARBID_PERMOTARBUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTrigonotarbid_Palaeocharinus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIGONOTARBID_PALAEOCHARINUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTrimerus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TRIMERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTullimonstrum) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TULLIMONSTRUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraTurrisaspis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TURRISASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraUranocentrodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_URANOCENTRODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraUrosthenes) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_UROSTHENES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraVarialepis) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VARIALEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraVestinautilus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VESTINAUTILUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraVetulicola) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VETULICOLA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraVivaxosaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_VIVAXOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraWalliserops) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WALLISEROPS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraWebsteroprion
				|| event.getTarget() instanceof EntityPrehistoricFloraWebsteroprionHole) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WEBSTEROPRION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraWhatcheeria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WHATCHEERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraWiwaxia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WIWAXIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraXenacanthus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_XENACANTHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraXenusion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_XENUSION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraYawunik) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YAWUNIK.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraYilingia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YILINGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraYohoia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YOHOIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraYorgia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YORGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraYunnanozoon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_YUNNANOZOON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLochmanolenellus) {
			if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
				ModTriggers.CLICK_LOCHMANOLENELLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
			}
			event.getEntityPlayer().swingArm(event.getHand());
			event.setCanceled(true);
			return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraAstraspis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
			ModTriggers.CLICK_ASTRASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
	}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPanderodus) {
			if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PANDERODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
	}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
}
		else if (event.getTarget() instanceof EntityPrehistoricFloraCalvapilosa) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CALVAPILOSA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraBoothiaspis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BOOTHIASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraHolonema) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HOLONEMA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraDrotops) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DROTOPS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraHeliopeltis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HELIOPELTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraLanceaspis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LANCEASPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraMontecaris) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_MONTECARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraRhenocystis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_RHENOCYSTIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraWillwerathia) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_WILLWERATHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraParmastega) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PARMASTEGA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraTiktaalik) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TIKTAALIK.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraPygopterus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PYGOPTERUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraDeltoptychius) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DELTOPTYCHIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraFadeniaCarboniferous) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_FADENIA_CARBONIFEROUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraFadeniaPermotriassic) {
			if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
				ModTriggers.CLICK_FADENIA_PERMOTRIASSIC.trigger((EntityPlayerMP) event.getEntityPlayer());
			}
			event.getEntityPlayer().swingArm(event.getHand());
			event.setCanceled(true);
			return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraFalcatus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_FALCATUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraOrodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ORODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraParatarrasius) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PARATARRASIUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSyllipsimopodi) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SYLLIPSIMOPODI.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraThrinacodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_THRINACODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraTyrannophontes) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TYRANNOPHONTES.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraUrocordylus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_UROCORDYLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraEdaphosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_EDAPHOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraArthropleura) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ARTHROPLEURA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraCobelodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_COBELODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraMegactenopetalus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_MEGACTENOPETALUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraRubidgea) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_RUBIDGEA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraEndothiodon) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ENDOTHIODON.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraAustrolimulus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_AUSTROLIMULUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraBeishanichthys) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BEISHANICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraBirgeria) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BIRGERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraBrembodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BREMBODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraCaturus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CATURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraChinlea) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CHINLEA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraDapedium) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DAPEDIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraForeyia) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_FOREYIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraHybodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HYBODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraLuoxiongichthys) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LUOXIONGICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraPotanichthys) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_POTANICHTHYS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraAeger) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_AEGER.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraAulacoceras) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_AULACOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraBesanosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BESANOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraCartorhynchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CARTORHYNCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraCyamodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CYAMODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraCymbospondylus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CYMBOSPONDYLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraEorhynchochelys) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_EORHYNCHOCHELYS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraEretmorhipis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ERETOMORPHIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraHenodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HENODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraLimulid) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LIMULID.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraKeichousaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_KEICHOUSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraNothosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_NOTHOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraOpolanka) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_OPOLANKA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraPanzhousaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PANZHOUSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraPlacodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PLACODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSclerocormus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SCLEROCORMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraTriadobatrachus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TRIADOBATRACHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraYunguisaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_YUNGUISAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraArizonasaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ARIZONASAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraAtopodentatus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ATOPODENTATUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraBatrachotomus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BATRACHOTOMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraClevosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CLEVOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraDesmatosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DESMATOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraDoswellia) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DOSWELLIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraDrepanosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_DREPANOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraEffigia) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_EFFIGIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraErythrosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ERYTHROSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraEuparkeria) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_EUPARKERIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraEusaurosphargis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_EUSAUROSPHARGIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraGerrothorax) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_GERROTHORAX.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraHyperodapedon) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HYPERODAPEDON.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraHypsognathus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HYPSOGNATHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraHypuronector) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_HYPURONECTOR.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraLagosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LAGOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraLessemsaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LESSEMSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraLongisquama) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LONGISQUAMA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraLotosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LOTOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraMegazostrodon) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_MEGAZOSTRODON.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraMetoposaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_METOPOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraMorganucodon) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_MORGANUCODON.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraMussaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_MUSSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraOrnithosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ORNITHOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraTeleocrater) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TELEOCRATER.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraPoposaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_POPOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraPostosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_POSTOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraProganochelys) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PROGANOCHELYS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraPseudotherium) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_PSEUDOTHERIUM.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSaurosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SAUROSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraRutiodon) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_RUTIODON.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraScleromochlus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SCLEROMOCHLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSharovipteryx) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SHAROVIPTERYX.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSilesaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SILESAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSillosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SILLOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSmilosuchus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SMILOSUCHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSmok) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SMOK.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraSphenotitan) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_SPHENOTITAN.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraStagonolepis) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_STAGONOLEPIS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraStanocephalosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_STANOCEPHALOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraTanystropheus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TANYSTROPHEUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraTeraterpeton) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TERATERPETON.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraTeyujagua) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_TEYUJAGUA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraThecodontosaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_THECODONTOSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraVancleavea) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_VANCLEAVEA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraXinpusaurus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_XINPUSAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraAustriadactylus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_AUSTRIADACTYLUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraCaelestiventus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CAELESTIVENTUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraCaviramus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_CAVIRAMUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraEudimorphodon) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_EUDIMORPHODON.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraItalophlebia) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_ITALOPHLEBIA.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraNagini) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_NAGINI.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraBrachydectes) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_BRACHYDECTES.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraLysorophus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
		ModTriggers.CLICK_LYSOROPHUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		}
		else if (event.getTarget() instanceof EntityPrehistoricFloraParhybodus) {
		if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
			ModTriggers.CLICK_PARHYBODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
		}
		event.getEntityPlayer().swingArm(event.getHand());
		event.setCanceled(true);
		return;
		} else if (event.getTarget() instanceof EntityPrehistoricFloraLonchidion) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LONCHIDION.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPalaeoniscum) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PALAEONISCUM.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLandSnail) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SNAIL_LAND.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraSpiniplatyceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_SPINIPLATYCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraNipponomaria) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_NIPPONOMARIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraParapeytoia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PARAPEYTOIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraPhragmoceras) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_PHRAGMOCERAS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraLituites) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_LITUITES.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCidaroida) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CIDAROIDA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraArchaeocidaris) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCHAEOCIDARIS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraCeratodus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_CERATODUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraWillwerathia) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WILLWERATHIA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}

			
			else if (event.getTarget() instanceof EntityPrehistoricFloraTitanopteraClatrotitan) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TITANOPTERA_CLATROTITAN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			
			else if (event.getTarget() instanceof EntityPrehistoricFloraTitanopteraGigatitan) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TITANOPTERA_GIGATITAN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			
			else if (event.getTarget() instanceof EntityPrehistoricFloraTitanopteraMesotitan) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_TITANOPTERA_MESOTITAN.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}


			//Put these at the end so as to trigger its children above in preference first:
			else if (event.getTarget() instanceof EntityPrehistoricFloraDiictodon) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_DIICTODON.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraArchoblattinaInsect
					|| event.getTarget() instanceof EntityPrehistoricFloraArchoblattinaNymph) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_ARCHOBLATTINA.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			else if (event.getTarget() instanceof EntityPrehistoricFloraWeigeltisaurus) {
				if ((event.getEntityPlayer() instanceof EntityPlayerMP)) {
					ModTriggers.CLICK_WEIGELTISAURUS.trigger((EntityPlayerMP) event.getEntityPlayer());
				}
				event.getEntityPlayer().swingArm(event.getHand());
				event.setCanceled(true);
				return;
			}
			

		}
	}

}
