
package net.lepidodendron.item.crafting;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.block.*;
import net.lepidodendron.item.*;
import net.lepidodendron.item.entities.*;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@ElementsLepidodendronMod.ModElement.Tag
public class RecipeCookedMeatsandSeeds extends ElementsLepidodendronMod.ModElement {
	public RecipeCookedMeatsandSeeds(ElementsLepidodendronMod instance) {
		super(instance, 1092);
	}

	@Override
	public void init(FMLInitializationEvent event) {

		GameRegistry.addSmelting(new ItemStack(BlockArtocarpusFruitBlock.block, (int) (1)), new ItemStack(ItemCookedBreadfruit.block, (int) (1)), 0.5F);
		GameRegistry.addSmelting(new ItemStack(ItemPrototaxitesChunk.block, (int) (1)), new ItemStack(ItemCookedPrototaxites.block, (int) (1)), 0.5F);
		GameRegistry.addSmelting(new ItemStack(ItemYamTuber.block, (int) (1)), new ItemStack(ItemYamTuberBaked.block, (int) (1)), 0.5F);

		//Specials:
		//GameRegistry.addSmelting(new ItemStack(ItemCaptorhinusTail.block, (int) (1)), new ItemStack(Item.block, (int) (1)), 0.35F);

		//Calamari - nautiloids, belemnites and cephalopods
		GameRegistry.addSmelting(new ItemStack(ItemAmmoniteCeratitesRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAmmoniteCoronicerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAmmoniteCylolobusRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAmmoniteDactyliocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAmmoniteGoniatitesRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAmmoniteManticocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAmmonitePachydesmocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAmmonitePachydiscusRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAmmoniteParapuzosiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAmmoniteAsterocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAmmoniteTitanitesRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAphetocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAscocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAulacocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBasilocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCamerocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCassinocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCooperocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCyrtocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDeirocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEndocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGoniocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLituitesRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMooreocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemNectocarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOrthocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPhragmocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRayonnocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSyllipsimopodiRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTemperocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemVestinautilusRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSphoocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemIvoitesRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMuensterellaRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPlectronocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMegateuthisRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPassaloteuthisRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemClarkeiteuthisRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSpirocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCenocerasRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAmmonitePerisphinctesRaw.block, (int) (1)), new ItemStack(ItemPalaeoCalamari.block, (int) (1)), 0.35F);






		//Escargots - snails and similar
		GameRegistry.addSmelting(new ItemStack(ItemCyclonema.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMaclurina.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPhanerotinus.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPoleumita.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLandSnail.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemNipponomaria.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSpiniplatyceras.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOdontogriphusRaw.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCalvapilosaRaw.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemViviparus.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMarmolatella.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMurex.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLeviathania.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHarpagodes.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemNerinea.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemStrombus.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEuspira.block, (int) (1)), new ItemStack(ItemPalaeoEscargots.block, (int) (1)), 0.35F);






		//Insect-Treat - land insects/arthropods
		GameRegistry.addSmelting(new ItemStack(ItemArchoblattinaRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemArthropleuraRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAttercopusRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBugRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEoarthropleuraRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEophrynusRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGerarusRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemItalophlebiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemKreischeriaRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMeganeuraRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMeganeuropsisRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPalaeocharinusRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPalaeodictyopteraDelitzschalaRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPalaeodictyopteraDunbariaRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPalaeodictyopteraHomaloneuraRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPalaeodictyopteraHomoiopteraRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPalaeodictyopteraLithomantisRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPalaeodictyopteraLycocercusRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPalaeodictyopteraSinodunbariaRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPalaeodictyopteraStenodictyaRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPalaeontinidRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPalaeotarbusRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPermotarbusRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPneumodesmusRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemProtozygopteraRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRoachoidAridRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRoachoidForestRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRoachoidSwampRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemScorpionGigantoscorpioRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemScorpionGondwanascorpioRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemScorpionOpsieobuthusRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemScorpionPulmonoscorpiusRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTitanopteraClatrotitanRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTitanopteraGigatitanRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTitanopteraMesotitanRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMyriacantherpestesRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDragonfly1Raw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDragonfly2Raw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDragonfly3Raw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDragonfly4Raw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDragonfly5Raw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDragonfly6Raw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDragonfly7Raw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDragonfly9Raw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDragonfly10Raw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDragonfly8Raw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDaohugoucossusRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMeganeuritesRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSylvohymenRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemArchocyrtusRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemArchaboilusRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPycnophlebiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoInsectTreat.block, (int) (1)), 0.35F);






		//Palaeo-Scampi (prawney things)
		GameRegistry.addSmelting(new ItemStack(ItemAegerRaw.block, (int) (1)), new ItemStack(ItemPalaeoScampi.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMontecarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoScampi.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemNahecarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoScampi.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSynophalosRaw.block, (int) (1)), new ItemStack(ItemPalaeoScampi.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTokummiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoScampi.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTyrannophontesRaw.block, (int) (1)), new ItemStack(ItemPalaeoScampi.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemWarneticarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoScampi.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSchugurocarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoScampi.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCeratiocarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoScampi.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemConcavicarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoScampi.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDollocarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoScampi.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOstenocarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoScampi.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAngustidontusRaw.block, (int) (1)), new ItemStack(ItemPalaeoScampi.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPanacanthocarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoScampi.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEocarcinusRaw.block, (int) (1)), new ItemStack(ItemPalaeoScampi.block, (int) (1)), 0.35F);




		//Palaeo-Thermidor (other aquatic arthropods)
		GameRegistry.addSmelting(new ItemStack(ItemAcadoaradoxidesRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAcutiramusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAdelophthalmusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAegirocassisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAiniktozoonRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAlacarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAmplectobeluaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAmpyxRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAnomalocarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAntarcticarcinusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemArctinurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAsaphusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAustrolimulusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBalhuticarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBohemoharpesRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBundenbachiellusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBushizheiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCambrorasterRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCanadaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCarcinosomaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCheirurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCheloniellonRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemChotecopsRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCrotalocephalusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDalmanitesRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDrotopsRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEllipsocephalusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemElrathiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEoredlichiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEricixerxesRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEryonRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEurypterusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHarpesRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHarvestmanRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHeliopeltisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHelmetiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHibbertopterusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHungioidesRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemIsotelusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemJaekelopterusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemKalbarriaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemKerygmachelaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemKodymirusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemKokomopterusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLaminacarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLanceaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLimulidRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLochmanolenellusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLonchodomasRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLunataspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLyrarapaxRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMegalograptusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMegarachneRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMixopterusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOdaraiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOgyginusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPageaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemParadoxidesRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPhantaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemProfallotaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPterygotusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRetifaciesRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSchinderhannesRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSelenopeltisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSidneyiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTegopelteRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTerataspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTrimerusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemUralichasRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemWalliseropsRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemWeinberginaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemWillwerathiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemWingertshellicusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemYawunikRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemYohoiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCancrinosRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);

		GameRegistry.addSmelting(new ItemStack(ItemVachonisiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemFurcaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTomlinsonusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTamisiocarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCordaticarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSanctacarisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHurdiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCaryosyntripsRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSlimoniaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCiurcopterusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCarolinitesRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSymphysopsRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPricyclopygeRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMegistaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAngelinaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPlatypeltoidesRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAdamanteryonRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMecochirusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPhillipsiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemKleptothuleRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPhytophilaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPentecopterusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemStrobilopterusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemStoermeropterusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemChasmataspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHoplitaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOrcanopterusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOnychopterellaRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOlenellusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);











		//GameRegistry.addSmelting(new ItemStack(ItemPentecopterusRaw.block, (int) (1)), new ItemStack(ItemPalaeoThermidor.block, (int) (1)), 0.35F);



		//Palaeo-Ptero-Kebab (pterosaurs)
		GameRegistry.addSmelting(new ItemStack(ItemAustriadactylusRaw.block, (int) (1)), new ItemStack(ItemPalaeoPteroKebab.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCaelestiventusRaw.block, (int) (1)), new ItemStack(ItemPalaeoPteroKebab.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCaviramusRaw.block, (int) (1)), new ItemStack(ItemPalaeoPteroKebab.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEudimorphodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoPteroKebab.block, (int) (1)), 0.35F);



		//Palaeo-Steak (meats)
		GameRegistry.addSmelting(new ItemStack(ItemAnteosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemArchosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemArizonasaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAscendonanusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAtopodentatusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAulacephalodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBatrachotomusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBesanosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBunostegosRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCaptorhinusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCartorhynchusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCasineriaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemClaudiosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemClevosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCoelophysisRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCoelurosauravusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCotylorhynchusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCtenospondylusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCyamodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCymbospondylusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCynognathusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDatheosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDesmatosuchusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDiadectesRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDiictodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDimetrodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDviniaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDvinosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEdaphosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEffigiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemElginiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEoraptorRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEorhynchochelysRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEosimopsRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEretmorhipisRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemErythrosuchusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEstemmenosuchusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEuchambersiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEuparkeriaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGlaurungRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGorgonopsRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHenodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHerrerasaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHylonomusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHyperodapedonRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHypsognathusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemInostranceviaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemJonkeriaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemKeichousaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLabidosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLessemsaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLiliensternusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLisowiciaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLotosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLystrosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMegalosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMegazostrodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMesosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMixosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMorganucodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMoschopsRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMussaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemNothosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOphiacodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOphthalmosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPanzhousaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPlaceriasRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPlacodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPlateosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPoposaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPostosuchusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPristerognathusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemProburnetiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemProcynosuchusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemProsictodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPseudotheriumRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPurloviaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRautianiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRemigiomontanusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRobertiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSauroctonusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSaurosuchusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSclerocormusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemScleromochlusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemScutosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemShonisaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemShringasaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSillosuchusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSmilosuchusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSmokRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSphenacodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSphenotitanRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemStagonolepisRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSuminiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTanystropheusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTapinocephalusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCriocephalosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTeleocraterRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTetraceratopsRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemThecodontosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemThrinaxodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTiarajudensRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemVivaxosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemWeigeltisaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemXinpusaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemYunguisaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEndothiodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRubidgeaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSaltriovenatorRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemYinlongRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSilesaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemKentrosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDryosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDysalotosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemChaoyangsaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHualianceratopsRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemXuanhuaceratopsRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemProganochelysRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPanguraptorRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEunotosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHovasaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemStahleckeriaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRhomaleosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemUtatsusaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHupehsuchusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTemnodontosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHomoeosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDocodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBishanopliosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGeosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDakosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOphthalmothuleRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemThalassiodraconRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMicrocleidusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBobosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEurhinosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemVadasaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTritylodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemKayentatheriumRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHaldanodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGasosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCastorocaudaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPiatnitzkysaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEuropasaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemXinjiangchelysRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGlyptopsRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemThalassemysRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemKayentachelysRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHuayangosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGigantspinosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemStegosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTuojiangosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemYuxisaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTanycolagreusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCryolophosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPlatysuchusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDiandongosuchusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHypuronectorRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLongisquamaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSteak.block, (int) (1)), 0.35F);












		//Palaeo-Fillet (amphibians)
		GameRegistry.addSmelting(new ItemStack(ItemAcanthostegaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAcanthostomatopsRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAmphibamusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBalanerpetonRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBranchiosaurRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCacopsRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCrassigyrinusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDasycepsRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDiplocaulusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDiploceraspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEryopsRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGerrothoraxRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemIchthyostegaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLimnoscelisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMastodonsaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMegalocephalusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMelosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMetoposaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPantylusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemParmastegaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPederpesRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPholiderpetonRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPlatyhystrixRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPrionosuchusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemProterogyrinusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSpathicephalusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTiktaalikRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemUranocentrodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemUrocordylusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemVancleaveaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemWhatcheeriaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGreererpetonRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGephyrostegusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemChunerpetonRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPhlegethontiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSideropsRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMarmorerpetonRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCeltedensRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemJeholotritonRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemStanocephalosaurusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFillet.block, (int) (1)), 0.35F);







		//Palaeo-Fishburger / fishcake (fishes)
		GameRegistry.addSmelting(new ItemStack(ItemAcanthodesRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAcrolepisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAetheolepisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAkmonistionRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAlbertoniaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAllenypterusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAntineosteusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAphnelepisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemArandaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemArduafronsRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAspidorhynchusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAstraspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAteleaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBandringaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBaramedaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBarbclaborniaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBeishanichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBelantseaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBirgeriaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBirkeniaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBlourugiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBobasatraniaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBoothiaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBothriolepisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBrembodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBrochoadmonesRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCampbellodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCarolowilhelminaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCaturusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCephalaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCeratodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemChinleaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCladoselacheRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemClydagnathusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCobelodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCoccosteusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCoelacanthusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDaedalichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDapediumRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDeltoptychiusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDoryaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDorypterusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDracopristisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDrepanaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDunkleosteusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDunyuRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEastmanosteusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEbenaquaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEdestusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEglonaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEosaurichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEugaleaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEusthenopteronRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemFadeniaCarboniferousRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemFadeniaPermotriassicRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemFalcatusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemFeroxichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemForeyiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemFurcacaudaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGabreyaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGantarostrataspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGemuendinaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGnathorhizaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGroenlandaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGyracanthidesRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHaikouichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHelicoprionRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHemicyclaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHeterosteusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHibernaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHolonemaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHybodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHyneriaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemIniopteryxRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemJanassaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemKaibabvenatorRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLaccognathusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLasaniusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLebachacanthusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemListracanthusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLonchidionRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLunaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLungmenshanaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLuoxiongichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMacromesodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMcnamaraspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMegactenopetalusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMenaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMetasprigginaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemNeeyambaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemNotidanoidesRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOnychodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOrnithoprionRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOrodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOsteolepisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPalaeoniscumRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPanderichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPanderodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemParanaichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemParatarrasiusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemParexusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemParhybodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPelurgaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPharyngolepisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPikaiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPituriaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPlatycaraspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPlatylomaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPlatysomusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPoraspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPromissumRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPsarolepisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPteraspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPygopterusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemQilinyuRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRebellatrixRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRhizodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSacabambaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSaivodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSaurichthysFreshwaterRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSaurichthysMarineRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemScaumenaciaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSemionotusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSquatinactisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemStensioellaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTartuosteusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemThelodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemThrinacodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTitanichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTorpedaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTraquairiusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTurrisaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemUrosthenesRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemVarialepisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemXenacanthusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemYunnanozoonRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);

		GameRegistry.addSmelting(new ItemStack(ItemMiguashaiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);

		GameRegistry.addSmelting(new ItemStack(ItemCometicercusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOxyosteusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTegeolepisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGooloogongiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDiplacanthusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemClimatiusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemNerepisacanthusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGriphognathusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGogonasusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemFallacosteusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRolfosteusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCamuropiscisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCtenurellaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRhamphodopsisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGoodradigbeeonRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDraconichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMaterpiscisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMicrobrachiusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBrindabellaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemWuttagoonaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemKujdanowiaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPhyllolepisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCowralepisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGymnotrachelusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBungartiusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);

		GameRegistry.addSmelting(new ItemStack(ItemRhadinacanthusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemThrissopsRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBelonostomusJurassicRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBelonostomusCretaceousRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAsteracanthusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTurboscinetesRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRedfieldiusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLeptolepisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemLepidotesRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPiranhamesodonRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSilurolepisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEntelognathusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemStethacanthusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSclerodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMegamastaxRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGuiyuRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPolybranchiaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemParameteoraspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTauraspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemAthenaegisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSqualorajaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGyrosteusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPhialaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPhlebolepisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemZenaspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemGyrodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPezopallichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemJamoytiusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemParamblypterusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRainerichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPapilionichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPromexyeleRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSibyrhynchusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemMetopacanthusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemHarpacanthusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemOphiopsisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemCongophiopsisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemScheenstiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemHadronectorRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemPropterusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemPseudorhinaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemPhorcynisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemLibysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemOreochimaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemKaykayRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemCoccodermaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemMorrolepisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemTrachymetoponRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemOrthocormusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemParnaibaiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemPalaeocarchariasRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemProtospinaxRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemIsanichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemSteurbautichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemSpathobatisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemBavariscylliumRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemCongopycnodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemMesturusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemParacestracionRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemIschyodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemParadapediumRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemLigulellaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemRhinopteraspisRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.7F);
		GameRegistry.addSmelting(new ItemStack(ItemSaurostomusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSongaichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMacrosemiusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemProconodontusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOzarkodinaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemIowagnathusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHindeodusRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemClarkinaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMisikellaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTanyrhinichthysRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCervifurcaRaw.block, (int) (1)), new ItemStack(ItemPalaeoFishcake.block, (int) (1)), 0.35F);


















		//Mixed Exotic Seafood (weird aquatic shit):
		GameRegistry.addSmelting(new ItemStack(ItemBanffiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemBivalveRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCanadiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDianiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemEnoplouraRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemCothurnocystisRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemDendrocystitesRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSyringocrinusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemIowacystisRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHallucigeniaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemJianshanopodiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMarrellaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMicrodictyonRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemMimetasterRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOmnidensRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOpabiniaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOrthrozanclusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemOttoiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPalaeoisopusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemParapeytoiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemParvancorinaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPaucipodiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemPomatrumRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSiberionRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSkeemellaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTullimonstrumRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemVetulicolaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemWebsteroprionRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemWiwaxiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemXenusionRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemThanahitaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRutgersellaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTribrachiodemasRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemTyphloesusRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRhenocystisRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemHaplophrentisRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemShaihuludiaRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemKootenayscolexRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemUrsactisRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemSokkaejaecystisRaw.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);







		//(blocks too:)
		GameRegistry.addSmelting(new ItemStack(BlockFurcaster.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockLepidaster.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockVillebrunaster.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockDecacuminaster.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockHelianthaster.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockArchaeocidaris.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockCidaroida.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockHerpetogaster.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockBivalveInoceramus.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockBivalveWhite.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockBivalveUpright.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockBivalveDicerocardium.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockBivalveGreen.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockBivalveDark.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockBivalveMegalodon.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockBivalveTall.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockBivalveGrey.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockBivalveCream.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockBivalveLithiotis.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockBrachiopodSpiriferid.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockBrachiopodGigantoproductus.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockBrachiopodOrthid.block, (int) (1)), new ItemStack(ItemPalaeoSeafood.block, (int) (1)), 0.35F);



		GameRegistry.addSmelting(new ItemStack(ItemChestnut.block, (int) (1)), new ItemStack(ItemChestnutRoasted.block, (int) (1)), 0.15F);

		//All our conifers:
		GameRegistry.addSmelting(new ItemStack(ItemAethophyllumNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemAgathisNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemAlpiaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemAraucarioxylonNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemAraucaritesNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemBrachyphyllumSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemBristleconeSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemBunyaNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemBuriadiaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemBushyAraucariaNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemColumnarisNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemCordaitesSeeds.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemCypressSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemDawnRedwoodNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemDicranophyllumSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemFrenelopsisSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemFurcifoliumSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemMonkeyPuzzleAraucariaNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemOrtiseiaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemPseudovoltziaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemQuadrocladusSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemRedwoodNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemRufloriaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemSciadopitysNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemSpruceSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemTallAraucariaNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemTaxodiumSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemTelemachusSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemThucydiaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemUtrechtiaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemWachtlerinaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemWalchiaSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemWollemiSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemHoopNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemScrubbyPineNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemElatocladusSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemPagiophyllumSeed.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemGoldenLarchNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemCedarNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
		GameRegistry.addSmelting(new ItemStack(ItemAridPineNuts.block, (int) (1)), new ItemStack(ItemRoastedPineNuts.block, (int) (1)), 0.15F);
	}
}
