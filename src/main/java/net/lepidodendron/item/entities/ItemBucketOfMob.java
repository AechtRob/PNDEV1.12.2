
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.IResource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fml.common.eventhandler.Event;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.IOException;
import java.util.List;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemBucketOfMob extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:mob_bucket")
	public static final Item block = null;

	public ItemBucketOfMob(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.mob_bucket);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		//ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:brasilodendron_spores", "inventory"));

		ModelBakery.registerItemVariants(block,
                new ModelResourceLocation("lepidodendron:entities/proterochampsa_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/richmondichthys_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/stemmatodus_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/handuichthys_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/concentrilepis_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/aegirosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/homalonotus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/taquetochelys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/scapanorhynchus_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/maghriboselache_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/orthacanthus_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/gerobatrachus_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/leptostyrax_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/huanghelepis_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/brachydectes_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/triodus_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/helodus_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/americaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/angelacanthus_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/americaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/genibatrachus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ptyktoptychion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/araripemys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mosura_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/victalimulus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dentilepisosteus_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/turfania_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/tadpole_kururubatrachus_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/kururubatrachus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/foreyclupea_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pseudarthron_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/trypanognathus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/chalawan_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/anjiaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/macropenaeus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/armigatus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hayenchelys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acrognathus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/prionolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/anguillavus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/maraldichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gladiopycnodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/stenoprotome_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hayolperichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tricerichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rostropycnodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhynchodercetis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ducrotayichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/joinvillichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhinopycnodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sigmapycnodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/plectocretacicus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhamphoichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pankowskichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hensodon_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hensodon_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eusebichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/heterothrissa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lissoberyx_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/flagellipinna_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paracoccodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/corusichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cretapantodon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ichthyoceros_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gebrayelichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/exocoetoides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eupodophis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cyclobatis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eubiodectes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mesiteia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/haimirichia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hakelia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/haqelpycnodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/shokawa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/chuhsiungichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jinjuichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kokuraichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nipponamia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paraleptolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/wakinoichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hyogobatrachus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megapterygius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/futabasaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phosphorosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nipponites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/amakusaichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sinemys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/monjurosuchus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kaganaias_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yezoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mesodermochelys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/adocus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tadpole_hyogobatrachus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tadpole_rhadinosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tadpole_notobatrachus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tadpole_cratopipa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tadpole_prosalirus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cryptoclidus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dissimilites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parawocklumeria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mortoniceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pinacoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tropites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/soliclymenia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/diplomoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kirkospira_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lesueurilla_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lytospira_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/boiotremus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bathrotomaria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megateuthis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lytoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mariella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ptychoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/coelostylina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jeppssonoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pentameroceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/trimeroceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/inversoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hyphantoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/baculites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pravitoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/scaphites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/notelops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/euroka_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/heckelichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/chanopsis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/siamamia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/araripelepidotes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/liaoningogriphus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/valdotriton_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/austropotamobius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/keurbos_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hoyasemys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/brodiechelys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ordosemys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/goniopholis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kronosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/liopleurodon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pleurosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/plumulites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tujiaaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/xiushanosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sume_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pseudomonocentris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/turbomesodon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cretalamna_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/magnipterygius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ostenoselache_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/callawayia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nannopterygius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/archisymplectes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/proscinetes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hamiltonichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mosineia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/apankura_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/anglaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeoechinastacus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/polzia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lycoptera_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/teoichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhinobatos_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tlalocbatos_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/notobatrachus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/harranahynchus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parenchodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/prosalirus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cratopipa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lethiscus_bucket", "inventory"),

				new ModelResourceLocation("lepidodendron:entities/cladocyclus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dugaldia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/enchodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mawsonia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/neoceratodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/onchopristis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/psilichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ptychodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tribodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cretoxyrhina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/squalicorax_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/koolasuchus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/koonwarria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhacolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dastilbe_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/wenzichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/xeneichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yanosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/uighuroniscus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/protopsephurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paraclupea_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/iemanja_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ichthyotringa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ichthyemidion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/luskhan_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/leptocleidus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tessarolax_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/vinctifer_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dimitobelus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hamulina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hypophylloceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hemiaster_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hyphalosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cooyoo_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/maiaspondylus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/moutoniceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/australiceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tropaeum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/brannerion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pliodetes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/notopala_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/anchura_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lanxangichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hoyasotes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lepidohyas_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ezkutuberezi_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/stenamara_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeocambarus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/arratiaelops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/egertonodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mesomyzon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thaiodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/archaeoniscus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rugoconites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hallidaya_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lobodiscus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/anfesta_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/discoserra_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tribrachidiummob_bucket", "inventory"),

				new ModelResourceLocation("lepidodendron:entities/eucritta_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pholidogaster_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eoherpeton_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eocaecilia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/triadobatrachus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhadinosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/apateon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/microbrachis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pygocephalomorpha_tealliocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tristychius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eurynotus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/coeruleodraco_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tariccoia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/soomaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/triopus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tremaglaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/anthracoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/arcestes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/goldringia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tuzoia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acheronauta_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thylacares_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lepidasterella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kalops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/illinichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/daidal_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/commentrya_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hexanchus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pambdelurion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/wardichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/priscomyzon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/alienum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mieridduryn_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/venustulus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/archeria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nigerpeton_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/haplolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tesnusocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/onychoselache_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ningxiaplatysomus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/australichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/anderella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/aetheretmon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rolfeia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acherontiscus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nematoptychius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/amphicentrum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/carbotubulus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/anthracosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sclerocephalus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/screbinodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/geragnostus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/urasterella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/camanchia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pseudonaraoia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/naraoia_spinosa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/naraoia_bertiensis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/vidalamia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sinamia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pachyamia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/khoratamia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hispanamia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cratoamia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tomognathus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ikechaoamia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/solnhofenamia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/calamopleurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tetrameroceras_bucket", "inventory"),



				new ModelResourceLocation("lepidodendron:entities/romerodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/srianta_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gregorius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/obruchevodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/chondrenchelys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/orestiacanthus_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/orestiacanthus_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/goodrichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gansuselache_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gansuselache_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mooreodontus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hagenoselache_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/diplodoselache_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cricosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/stenokranio_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/westrichus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/caridosuctor_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhabdoderma_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phanerorhynchus_bucket", "inventory"),

				new ModelResourceLocation("lepidodendron:entities/acadoaradoxides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acanthodes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acanthostega_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acanthostomatops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acrolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acutiramus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/adamanteryon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/adelophthalmus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/aeger_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/aegirocassis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/aetheolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ainiktozoon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/akmonistion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/alacaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/albertonia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/allenypterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ammonite_asteroceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ammonite_ceratites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ammonite_coroniceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ammonite_cylolobus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ammonite_dactylioceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ammonite_goniatites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ammonite_manticoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ammonite_pachydesmoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ammonite_pachydiscus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ammonite_parapuzosia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ammonite_perisphinctes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ammonite_titanites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/amphibamus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/amplectobelua_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ampyx_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/anaethalion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/angelina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/angustidontus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/anomalocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/antarcticarcinus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/anthracomedusa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/antineosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/aphetoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/aphnelepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/arandaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/archaeocidaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/arctinurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/arduafrons_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/asaphus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ascoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/aspidorhynchus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/asteracanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/astraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ateleaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/athenaegis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/atopodentatus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/aulacoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/austrolimulus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/balanerpeton_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/balhuticaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bandringa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/banffia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/barameda_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/barbclabornia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/basiloceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/batofasciculus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bavariscyllium_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/beishanichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/belantsea_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/belonostomus_cretaceous_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/belonostomus_jurassic_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/besanosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/birgeria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/birkenia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bishanopliosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/blourugia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bobasatrania_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bobosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bohemoharpes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/boothiaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bothriolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/brachydectes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/branchiosaur_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/brembodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/brindabellaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/brindabellaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/brochoadmones_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bundenbachiellus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bungartius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bushizheia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cacops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/calvapilosa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cambroraster_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cameroceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/campbellodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/camuropiscis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/canadaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/canadia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cancrinos_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/carcinosoma_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/carolinites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/carolowilhelmina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cartorhynchus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/caryosyntrips_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cassinoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/caturus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cenoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cephalaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ceratiocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ceratodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cervifurca_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/chasmataspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cheirurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cheloniellon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/chinlea_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/chotecops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/chunerpeton_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cidaroida_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ciurcopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cladoselache_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/clarkeiteuthis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/claudiosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/climatius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cobelodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/coccoderma_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/coccosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/coelacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cometicercus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/concavicaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/congophiopsis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/congopycnodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/conodont_clarkina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/conodont_clydagnathus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/conodont_hindeodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/conodont_iowagnathus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/conodont_misikella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/conodont_ozarkodina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/conodont_proconodontus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/conodont_promissum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cooperoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cordaticaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cothurnocystis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cowielepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cowralepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/crassigyrinus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/crotalocephalus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ctenurella_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ctenurella_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cyamodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cyclonema_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cymbospondylus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cyrtoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/daedalichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dakosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dalmanites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dapedium_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dasyceps_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/decacuminaster_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/deiroceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/deltoptychius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dendrocystites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/diania_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dickinsonia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/windermeria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dicranurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/didymograptus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/diplacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/diplocaulus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/diploceraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dollocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/doryaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dorypterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/draconichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dracopristis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dragonfly_nymph_dragonfly1_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dragonfly_nymph_dragonfly10_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dragonfly_nymph_dragonfly2_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dragonfly_nymph_dragonfly3_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dragonfly_nymph_dragonfly4_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dragonfly_nymph_dragonfly5_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dragonfly_nymph_dragonfly6_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dragonfly_nymph_dragonfly7_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dragonfly_nymph_dragonfly8_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dragonfly_nymph_dragonfly9_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/drepanaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/drotops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dunkleosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dunyu_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/duslia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dvinosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eastmanosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ebenaqua_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/echinochimaera_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/echinochimaera_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/edestus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eglonaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/elasmodectes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/elephantoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ellipsocephalus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/elrathia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/endoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/enoploura_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/entelognathus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eoandromeda_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eocarcinus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eoredlichia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eorhynchochelys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eosaurichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/erasipteroides_nymph_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eretmorhipis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ericixerxes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eryon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eryops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eugaleaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eurhinosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eurypterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/euspira_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eusthenopteron_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/fadenia_carboniferous_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/fadenia_permotriassic_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/falcatus_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/falcatus_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/fallacosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/feroxichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/flagellopantopus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/foreyia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/furca_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/furcacauda_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/furcaster_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gabreyaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gantarostrataspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gemmactena_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gemuendina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/geosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gephyrostegus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gerrothorax_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/glyptops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gnathorhiza_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gogonasus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gonioceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/goodradigbeeon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gooloogongia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/greererpeton_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/griphognathus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/groenlandaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/guiyu_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gymnotrachelus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gymnotrachelus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gyracanthides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gyrodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gyrosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hadronector_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/haikouichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hallucigenia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/haplophrentis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/harpacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/harpagodes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/harpes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/helianthaster_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/helicoprion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/heliopeltis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/helmetia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hemicyclaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/henodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/heterosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hibbertopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hibernaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/holonema_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hoplitaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hovasaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hungioides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hupehsuchus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hurdia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hybodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hyneria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ichthyostega_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/iniopteryx_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/iowacystis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/isanichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ischyodus_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ischyodus_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/isotelus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/italophlebia_nymph_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ivoites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jaekelopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jamoytius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/janassa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jeholotriton_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jellyfish_precambrian_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jellyfish1_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jellyfish2_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jellyfish3_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jellyfish4_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jellyfish5_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jellyfish6_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jellyfish7_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jianshanopodia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kaibabvenator_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kalbarria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kayentachelys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kaykay_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/keichousaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kerygmachela_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kimberella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kleptothule_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kodymirus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kokomopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kootenayscolex_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kosmoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kujdanowiaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/laccognathus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/laidleria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/laminacaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lanceaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lasanius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lebachacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lepidaster_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lepidotes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/leptolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/leviathania_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/libys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ligulella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/limnoscelis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/limulid_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/listracanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lochmanolenellus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lonchidion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lonchodomas_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lunaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lunataspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lungmenshanaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/luoxiongichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lyrarapax_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lysorophus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/maclurina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/macromesodon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/macrosemius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/marmolatella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/marmorerpeton_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/marrella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mastodonsaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/materpiscis_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/materpiscis_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mcnamaraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mecochirus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megactenopetalus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megalocephalus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megalograptus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megamastax_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/meganeura_nymph_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/meganeurites_nymph_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/meganeuropsis_nymph_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megarachne_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megasecoptera_nymph_sylvohymen_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megateuthis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megistaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/melosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/menaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mesosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mesturus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/metaspriggina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/metopacanthus_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/metopacanthus_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/metoposaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/microbrachius_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/microbrachius_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/microcleidus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/microdictyon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/miguashaia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mimetaster_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mixopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mixosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/monograptus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/montecaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mooreoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/morrolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/muensterella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/murex_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nahecaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nectocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/neeyambaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nerepisacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nerepisacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nerinea_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nipponomaria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nothosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/notidanoides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/notostracan_strudops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/notostracan_triops1_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/notostracan_triops2_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/notostracan_triops3_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/odaraia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/odontogriphus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ogyginus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/olenellus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/omnidens_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/onychodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/onychopterella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/opabinia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ophiopsis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ophthalmosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ophthalmothule_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/opolanka_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/orcanopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/oreochima_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ornithoprion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/orodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/orthoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/orthocormus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/orthrozanclus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ostenocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/osteolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ottoia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/oxyosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/oxyosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pagea_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeocarcharias_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeodictyoptera_nymph_delitzschala_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeodictyoptera_nymph_dunbaria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeodictyoptera_nymph_homaloneura_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeodictyoptera_nymph_homoioptera_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeodictyoptera_nymph_lithomantis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeodictyoptera_nymph_lycocercus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeodictyoptera_nymph_mazothairos_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeodictyoptera_nymph_sinodunbaria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeodictyoptera_nymph_stenodictya_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeoisopus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeojelly1_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeojelly2_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeojelly3_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeojelly4_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeoniscum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/panacanthocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/panderichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/panderodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pantylus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/panzhousaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/papilionichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paracestracion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paradapedium_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paradoxides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paramblypterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parameteoraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paranaichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parapeytoia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paratarrasius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parexus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parhybodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parmastega_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parnaibaia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parvancorina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/passaloteuthis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paucipodia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pederpes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pelurgaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pezopallichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phanerotinus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phantaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pharyngolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phialaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phillipsia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phlebolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phlegethontia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pholiderpeton_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phorcynis_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phorcynis_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phragmoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phyllolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phytophilaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pikaia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/piranhamesodon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pituriaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/placodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/platycaraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/platyhystrix_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/platylomaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/platypeltoides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/platysomus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/platysuchus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/plectodiscus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/plectronoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/poleumita_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/polybranchiaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pomatrum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/poraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pricyclopyge_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/prionosuchus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/profallotaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/promexyele_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/propterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/proteroctopus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/proterogyrinus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/protechiurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/protospinax_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/protozygoptera_nymph_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/psarolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pseudorhina_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pseudorhina_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/psychopyge_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pteraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pterygotus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pygopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/qilinyu_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/quasimodichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rainerichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rayonnoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rebellatrix_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/redfieldius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/retifacies_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhadinacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhamphodopsis_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhamphodopsis_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhenocystis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhinopteraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhizodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhomaleosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rolfosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rutgersella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sacabambaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/saccocoma_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/saivodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sanctacaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/saurichthys_freshwater_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/saurichthys_marine_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/saurostomus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/scaumenacia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/scheenstia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/schinderhannes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/schugurocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/schugurocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sclerocormus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sclerodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/selenopeltis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/semionotus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/shaihuludia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/shonisaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/siberion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sibyrhynchus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/siderops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sidneyia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/silurolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/skeemella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/slimonia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/smilosuchus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sokkaejaecystis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/songaichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/spathicephalus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/spathobatis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sphooceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/spiniplatyceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/spiroceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/spriggina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/squaloraja_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/squaloraja_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/squatinactis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/stanocephalosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/stensioella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/stethacanthus_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/stethacanthus_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/steurbautichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/strobilopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/strombus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/syllipsimopodi_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/symphysops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/synophalos_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/syringocrinus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tamisiocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tanyrhinichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tanystropheus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tartuosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tauraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tegeolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tegopelte_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/temnodontosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/temperoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/terataspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tetragraptus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thalassemys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thalassiodracon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thanahita_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thelodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thrinacodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thrissops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tiktaalik_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/titanichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tokummia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tomlinsonus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/torpedaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/trachymetopon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/traquairius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tribrachiodemas_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/trimerus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tullimonstrum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/turboscinetes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/turrisaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/typhloesus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tyrannophontes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/uarbryichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/uralichas_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/uranocentrodon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/urocordylus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/urosthenes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ursactis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/utatsusaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/vachonisia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/vampyronassa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/vancleavea_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/varialepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/vestinautilus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/vetulicola_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/villebrunaster_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/viviparus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/walliserops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/warneticaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/weinbergina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/whatcheeria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/willwerathia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/wingertshellicus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/wiwaxia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/wuttagoonaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/xenacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/xenusion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/xinjiangchelys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/xinpusaurus_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/xinpusaurus_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yawunik_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yilingia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yohoia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yorgia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yunguisaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yunnanozoon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/zenaspis_bucket", "inventory"),

				new ModelResourceLocation("lepidodendron:entities/nimbia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ediacaria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cyclomedusa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/burgessomedusa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cordubia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thaumactena_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eldonia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ctenorhabdotus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/discophyllum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pseudodiscophyllum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bertratis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rotaciurca_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paropsonema_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeoctenophora_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/archaeocydippida_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/daihuoides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/octomedusa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/prothysanostoma_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/medusina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tarracodiscus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/heliobranchia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eulithota_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/semaeostomites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hydrocraspedota_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhizostomites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/banksiops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pliosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/leedsichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ichthyosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/plesiosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hughmilleria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pentecopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eramoscorpius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/praearcturus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/stoermeropterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/waptia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/isoxys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/capinatator_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hadranax_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/timorebestia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mobulavermis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/burgessia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/saperion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thulaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/urokodia_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/thelxiope_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/titanokorys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eryma_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parioscorpio_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nesonektris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tanaocrossus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eochondrosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/liaosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kichkassia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/brazilichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/conchopoma_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/surcaudalus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bethesdaichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/leptoteuthis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megalichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mamulichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/senekichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/heteropetalus_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/heteropetalus_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/climacograptus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phyllograptus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bowengriphus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gosfordia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sargodon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hydropessum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phacops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phylloceras_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/erettopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/polysentor_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/harpagofututor_male_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/harpagofututor_female_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thalattosuchus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/debeerius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/wodnika_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pseudoangustidontus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sarcoprion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dipteronotus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/heterostrophus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/flagellopantopus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/waagenella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/akasakiella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/foordella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/chippewaella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/attenborites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/temnoxa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eoporpita_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ichnusa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/andiva_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/podolimirus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cephalonega_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cyanorus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ovatoscutum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ikaria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/uncus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/quaestio_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/keretsa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/plexus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/karakhtia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ectenaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/microraptor_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/changxingaspis_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/loganellia_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/bianchengichthys_bucket", "inventory"),
                new ModelResourceLocation("lepidodendron:entities/archipelepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/iansan_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/aellopobatis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhenonema_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tropidosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/grossaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/scanilepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cyclurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tethybatis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pentanogmius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/melvius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bananogmius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thryptodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/concavotectum_bucket", "inventory"),


				//new ModelResourceLocation("lepidodendron:entities/_bucket", "inventory"), (Keep here as template)

				new ModelResourceLocation("lepidodendron:mob_bucket_empty", "inventory"),
				new ModelResourceLocation("lepidodendron:mob_bucket_missing_texture", "inventory")

		);

		ModelLoader.setCustomMeshDefinition(block, stack -> {
			if (stack.hasTagCompound()) {
				if (!ItemBucketOfMob.ItemCustom.isEntityFromItemStack(stack)) {
					return new ModelResourceLocation(stack.getItem().getRegistryName() + "_empty", "inventory");
				} else {
					NBTTagCompound entityNBT = (NBTTagCompound) stack.getTagCompound().getTag("Mob");
					ResourceLocation resourcelocation = new ResourceLocation(entityNBT.getString("id"));
					String mobname = resourcelocation.toString().replace(LepidodendronMod.MODID + ":prehistoric_flora_", "");
					if (entityNBT.hasKey("PNType")) {
						mobname = mobname + "_" + entityNBT.getString("PNType").toString();
					}
					ModelResourceLocation model =  new ModelResourceLocation(LepidodendronMod.MODID +":entities/" + mobname + "_bucket", "inventory");
					List<IResource> list = null;
					try {
						list =  Minecraft.getMinecraft().getResourceManager().getAllResources(new ResourceLocation(LepidodendronMod.MODID + ":models/item/entities/" + mobname + "_bucket.json"));
					} catch (IOException e) {
					}
					if (!(list == null || list.isEmpty())) {
						return model;
					}
					else {
						return new ModelResourceLocation("lepidodendron:mob_bucket_missing_texture", "inventory");
					}
				}
			}
			else return new ModelResourceLocation(stack.getItem().getRegistryName() + "_empty", "inventory");
		});
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setTranslationKey("pf_mob_bucket");
			setRegistryName("mob_bucket");
			maxStackSize = 1;
			setCreativeTab(null);
		}

		@Override
		public String getItemStackDisplayName(ItemStack stack)
		{
			if (isEntityFromItemStack(stack)) {
				NBTTagCompound entityNBT = (NBTTagCompound) stack.getTagCompound().getTag("Mob");
				ResourceLocation resourcelocation = new ResourceLocation(entityNBT.getString("id"));
				String mobname = resourcelocation.toString().replace(LepidodendronMod.MODID + ":", "");
				if (entityNBT.hasKey("PNType")) {
					mobname = mobname + "_" + entityNBT.getString("PNType").toString();
				}
				return I18n.translateToLocal("item.pf_mob_bucket_full.name").trim()
						+ ": "
						+ I18n.translateToLocal("entity." + mobname + ".name").trim();
			}

			return super.getItemStackDisplayName(stack);
		}

		public String getTranslationKey(ItemStack stack)
		{
			if (isEntityFromItemStack(stack)) {
				NBTTagCompound entityNBT = (NBTTagCompound) stack.getTagCompound().getTag("Mob");
				ResourceLocation resourcelocation = new ResourceLocation(entityNBT.getString("id"));
				String mobname = resourcelocation.toString().replace(LepidodendronMod.MODID + ":prehistoric_flora_", "");
				if (entityNBT.hasKey("PNType")) {
					mobname = mobname + "_" + entityNBT.getString("PNType").toString();
				}
				return "item.pf_" + mobname + "_bucket";
			}
			return super.getTranslationKey(stack);
		}

		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
		{
			boolean flag = false;
			ItemStack itemstack = playerIn.getHeldItem(handIn);
			RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, false);
			ActionResult<ItemStack> ret = onBucketUse(playerIn, worldIn, itemstack, raytraceresult);
			if (raytraceresult != null) {
				if (worldIn.getBlockState(raytraceresult.getBlockPos()).getBlock().getRegistryName().toString().equalsIgnoreCase("jaff:tank")) {
					ret = null;
				}
			}
			if (ret != null) return ret;

			if (raytraceresult == null)
			{
				return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
			}
			else if (raytraceresult.typeOfHit != RayTraceResult.Type.BLOCK)
			{
				return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
			}
			else
			{
				BlockPos blockpos = raytraceresult.getBlockPos();

				if (!worldIn.isBlockModifiable(playerIn, blockpos))
				{
					return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
				}

				{
					boolean flag1 = worldIn.getBlockState(blockpos).getBlock().isReplaceable(worldIn, blockpos) || (worldIn.getBlockState(blockpos).getBlock().getRegistryName().toString().equalsIgnoreCase("jaff:tank") && raytraceresult.sideHit == EnumFacing.UP);
					BlockPos blockpos1 = flag1 && raytraceresult.sideHit == EnumFacing.UP ? blockpos : blockpos.offset(raytraceresult.sideHit);

					if (!playerIn.canPlayerEdit(blockpos1, raytraceresult.sideHit, itemstack))
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}
					else if (tryPlaceContainedLiquid(playerIn, worldIn, blockpos1, itemstack))
					{
						if (playerIn instanceof EntityPlayerMP)
						{
							CriteriaTriggers.PLACED_BLOCK.trigger((EntityPlayerMP)playerIn, blockpos1, itemstack);
						}

						playerIn.addStat(StatList.getObjectUseStats(this));

						//return !playerIn.capabilities.isCreativeMode ? new ActionResult(EnumActionResult.SUCCESS, new ItemStack(Items.BUCKET)) : new ActionResult(EnumActionResult.SUCCESS, itemstack);
						//Edited to always remove the mob bucket or else we duplicate UUIDs of mobs and they dont work:
						return new ActionResult(EnumActionResult.SUCCESS, new ItemStack(Items.BUCKET));
					}
					else
					{
						return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
					}
				}
			}
		}

		public boolean tryPlaceContainedLiquid(@Nullable EntityPlayer player, World worldIn, BlockPos posIn, ItemStack stack)
		{
			{
				IBlockState iblockstate = worldIn.getBlockState(posIn);
				Material material = iblockstate.getMaterial();
				boolean flag = !material.isSolid();
				boolean flag1 = iblockstate.getBlock().isReplaceable(worldIn, posIn);
				boolean flag2 = iblockstate.getBlock().getRegistryName().toString().equalsIgnoreCase("jaff:tank");

				if (!worldIn.isAirBlock(posIn) && !flag && !flag1 && !flag2)
				{
					return false;
				}
				else
				{
					if (worldIn.provider.doesWaterVaporize())
					{
						int l = posIn.getX();
						int i = posIn.getY();
						int j = posIn.getZ();
						worldIn.playSound(player, posIn, SoundEvents.BLOCK_FIRE_EXTINGUISH, SoundCategory.BLOCKS, 0.5F, 2.6F + (worldIn.rand.nextFloat() - worldIn.rand.nextFloat()) * 0.8F);

						for (int k = 0; k < 8; ++k)
						{
							worldIn.spawnParticle(EnumParticleTypes.SMOKE_LARGE, (double)l + Math.random(), (double)i + Math.random(), (double)j + Math.random(), 0.0D, 0.0D, 0.0D);
						}
					}
					else
					{
						if (!worldIn.isRemote && (flag || flag1 || flag2) && !material.isLiquid())
						{
							if (!flag2) {
								worldIn.destroyBlock(posIn, true);
							}
						}

						SoundEvent soundevent = SoundEvents.ITEM_BUCKET_EMPTY;
						worldIn.playSound(player, posIn, soundevent, SoundCategory.BLOCKS, 1.0F, 1.0F);
						if (!flag2) {
							worldIn.setBlockState(posIn, Blocks.FLOWING_WATER.getDefaultState(), 11);
						}

						if (!(worldIn.isRemote)) {
							spawnEntityFromItemStack(stack, worldIn, (double) posIn.getX() + 0.5D, (double) posIn.getY(), (double) posIn.getZ() + 0.5D);
						}
					}

					return true;
				}
			}
		}

		public static Entity spawnEntityFromItemStack(ItemStack stack, World world, double x, double y, double z) {

			if (!isEntityFromItemStack(stack)) return null;

			NBTTagCompound entityNBT = (NBTTagCompound) stack.getTagCompound().getTag("Mob");

			Entity entity = EntityList.createEntityFromNBT(entityNBT, world);

			if (entity != null) {
				entity.setLocationAndAngles(x, y, z, 0,0 );
				if (!world.isRemote) {
					world.spawnEntity(entity);
				}
			}
			return entity;
		}

		public static boolean isEntityFromItemStack(ItemStack stack) {
			if (stack.hasTagCompound() == false
					|| !stack.getTagCompound().hasKey("Mob")) return false;

			return true;
		}

		@Nullable
		public static ActionResult<ItemStack> onBucketUse(@Nonnull EntityPlayer player, @Nonnull World world, @Nonnull ItemStack stack, @Nullable RayTraceResult target)
		{
			FillBucketEvent event = new FillBucketEvent(player, stack, world, target);
			if (MinecraftForge.EVENT_BUS.post(event)) return new ActionResult<ItemStack>(EnumActionResult.FAIL, stack);

			if (event.getResult() == Event.Result.ALLOW)
			{
				if (player.capabilities.isCreativeMode)
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);

				stack.shrink(1);
				if (stack.isEmpty())
					return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, event.getFilledBucket());

				if (!player.inventory.addItemStackToInventory(event.getFilledBucket()))
					player.dropItem(event.getFilledBucket(), false);

				return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
			}
			return null;
		}
	}
}
