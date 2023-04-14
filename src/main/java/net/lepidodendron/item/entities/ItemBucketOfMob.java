
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
//				new ModelResourceLocation("lepidodendron:entities/megamastax_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/gyrosteus_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/squaloraja_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/pezopallichthys_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/gyrodus_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/tamisiocaris_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/cordaticaris_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/sanctacaris_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/marmolatella_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/typhloesus_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/papilionichthys_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/promexyele_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/rainerichthys_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/zenaspis_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/strudops_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/triops_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/psychopyge_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/lepidaster_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/villebrunaster_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/elephantoceras_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/elasmodectes_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/kosmoceras_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/quasimodichthys_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/anaethalion_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/viviparus_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/dakosaurus_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/slimonia_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/hovasaurus_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/decacuminaster_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/saccocoma_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/vampyronassa_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/proteroctopus_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/pentecopterus_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/angelina_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/brongniartella_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/chaohusaurus_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/cothurnocystis_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/elephantoceras_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/elonichthys_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/greererpeton_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/hoplitaspis_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/micromitra_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/nagini_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/nautilus_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/potanichthys_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/rhenocystis_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/sagenodus_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/strobilopterus_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/triadobatrachus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parameteoraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tauraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sclerodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/guiyu_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/polybranchiaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phialaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thanahita_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dicranurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/platypeltoides_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/priscomyzon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/chasmataspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/angelina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megistaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tribrachiodemas_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/iowacystis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dendrocystites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/syringocrinus_bucket", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/ciurcopterus_bucket", "inventory"),

				new ModelResourceLocation("lepidodendron:entities/stethacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/vachonisia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/furca_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tomlinsonus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acadoaradoxides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acanthodes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acanthostega_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acanthostomatops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acrolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/acutiramus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/adelophthalmus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/aeger_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/aegirocassis_bucket", "inventory"),
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
				new ModelResourceLocation("lepidodendron:entities/ammonite_titanites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/amphibamus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/amplectobelua_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ampyx_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/angustidontus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/anomalocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/antarcticarcinus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/anthracomedusa_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/antineosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/aphetoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/arandaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/arctinurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/asaphus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ascoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ascoceras_baby_bucket", "inventory"),
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
				new ModelResourceLocation("lepidodendron:entities/beishanichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/belantsea_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/besanosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/birgeria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/birkenia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/blourugia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bobasatrania_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bohemoharpes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/boothiaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bothriolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/brachydectes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/branchiosaur_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/brembodus_bucket", "inventory"),
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
				new ModelResourceLocation("lepidodendron:entities/carolowilhelmina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cartorhynchus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/caryosyntrips_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cassinoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/caturus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cephalaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ceratiocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ceratodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cheirurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cheloniellon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/chinlea_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/chotecops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/claudiosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/climatius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/clydagnathus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cobelodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/coccosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/coelacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cooperoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cowielepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/crassigyrinus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/crotalocephalus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ctenurella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cyamodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cymbospondylus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cyrtoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/daedalichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dalmanites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dapedium_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dasyceps_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/deiroceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/deltoptychius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dendrocystites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/diania_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dickinsonia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/didymograptus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/diplacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/diplocaulus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/diploceraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/doryaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dorypterus_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/doswellia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/draconichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/drepanaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/drotops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dunkleosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dunyu_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/duslia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dvinosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ebenaqua_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/edestus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eglonaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ellipsocephalus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/elrathia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/endoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/enoploura_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eoandromeda_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eoredlichia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eorhynchochelys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eosaurichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eretmorhipis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ericixerxes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eryops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eugaleaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eurypterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eusthenopteron_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/fadenia_carboniferous_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/fadenia_permotriassic_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/falcatus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/fallacosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/feroxichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/flagellopantopus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/foreyia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/furcacauda_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/furcaster_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gabreyaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gantarostrataspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gemmactena_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gemuendina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gerrothorax_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gnathorhiza_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gogonasus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gonioceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/goodradigbeeon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/groenlandaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gymnotrachelus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gyracanthides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/haikouichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hallucigenia_bucket", "inventory"),
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
				new ModelResourceLocation("lepidodendron:entities/hungioides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hurdia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hybodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/hyneria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ichthyostega_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/iniopteryx_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/isotelus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/italophlebia_nymph_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ivoites_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jaekelopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/jamoytius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/janassa_bucket", "inventory"),
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
				new ModelResourceLocation("lepidodendron:entities/keichousaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kerygmachela_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kimberella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kodymirus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kokomopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kujdanowiaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/laccognathus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/laminacaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lanceaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lasanius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lebachacanthus_bucket", "inventory"),
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
				new ModelResourceLocation("lepidodendron:entities/marrella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mastodonsaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mcnamaraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megactenopetalus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megalocephalus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/meganeura_nymph_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/meganeuropsis_nymph_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/megarachne_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/menaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mesosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/metaspriggina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/metaspriggina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/metoposaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/microbrachius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/microdictyon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/miguashaia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mimetaster_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mixopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mixosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/monograptus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/montecaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/mooreoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nahecaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nectocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/neeyambaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nerepisacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nipponomaria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nothosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/odaraia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/odontogriphus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ogyginus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/omnidens_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/onychodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/opabinia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/opolanka_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ornithoprion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/orodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/orthoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/orthrozanclus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/osteolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ottoia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/oxyosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pagea_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeodictyoptera_nymph_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeodictyoptera_nymph_perm_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeoisopus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeojelly1_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeojelly2_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeojelly3_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeojelly4_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/palaeoniscum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/panderichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/panderodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pantylus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/panzhousaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paradoxides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paramblypterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paranaichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parapeytoia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paratarrasius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parexus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parhybodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parmastega_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/parvancorina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/paucipodia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pederpes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pelurgaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pentecopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phantaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pharyngolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phialaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phlebolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pholiderpeton_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pikaia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pituriaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/placodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/platycaraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/platyhystrix_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/platylomaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/platysomus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/plectodiscus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pomatrum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/poraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/prionosuchus_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/priscomyzon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/profallotaspis_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/proganochelys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/promissum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/proterogyrinus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/protozygoptera_nymph_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/psarolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pteraspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pterygotus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/pygopterus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/qilinyu_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rayonnoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rebellatrix_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/retifacies_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhamphodopsis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhizodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rutgersella_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/rutiodon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sacabambaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/saivodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/saurichthys_freshwater_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/saurichthys_marine_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/scaumenacia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/schinderhannes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/schugurocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sclerocormus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/selenopeltis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/semionotus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/shonisaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/siberion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sidneyia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/skeemella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/spathicephalus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/sphooceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/spiniplatyceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/spriggina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/squatinactis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/stensioella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/stethacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/syllipsimopodi_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/synophalos_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/syringocrinus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tanystropheus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tartuosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tegeolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tegopelte_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/temperoceras_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/terataspis_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/teraterpeton_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tetragraptus_bucket", "inventory"),
				//new ModelResourceLocation("lepidodendron:entities/teyujagua_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thelodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thrinacodus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tiktaalik_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/titanichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tokummia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/torpedaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/traquairius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/trimerus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tullimonstrum_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/turrisaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tyrannophontes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/uralichas_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/urocordylus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/urosthenes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/vancleavea_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/varialepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/vestinautilus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/vetulicola_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/walliserops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/weinbergina_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/whatcheeria_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/willwerathia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/wingertshellicus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/wiwaxia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/xenusion_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/xinpusaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yawunik_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yilingia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yohoia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yorgia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yunguisaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/yunnanozoon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/aetheolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/aphnelepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/arduafrons_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/aspidorhynchus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/notidanoides_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eryon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/macromesodon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ophthalmosaurus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/eastmanosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phragmoceras_bucket", "inventory"),

				new ModelResourceLocation("lepidodendron:entities/miguashaia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cometicercus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/oxyosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/tegeolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gooloogongia_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/warneticaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/schugurocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ceratiocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/diplacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/climatius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/nerepisacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/griphognathus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/concavicaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gogonasus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/fallacosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rolfosteus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/camuropiscis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/ctenurella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhamphodopsis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/goodradigbeeon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/draconichthys_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/materpiscis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/microbrachius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/brindabellaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/wuttagoonaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/kujdanowiaspis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/phyllolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/cowralepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/gymnotrachelus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/bungartius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/rhadinacanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/thrissops_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/belonostomus_jurassic_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/belonostomus_cretaceous_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/muensterella_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/asteracanthus_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/turboscinetes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/redfieldius_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/leptolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/lepidotes_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/dollocaris_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/piranhamesodon_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/silurolepis_bucket", "inventory"),
				new ModelResourceLocation("lepidodendron:entities/entelognathus_bucket", "inventory"),




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

		public String getTranslationKey(ItemStack stack)
		{
			if (isEntityFromItemStack(stack)) {
				NBTTagCompound entityNBT = (NBTTagCompound) stack.getTagCompound().getTag("Mob");
				ResourceLocation resourcelocation = new ResourceLocation(entityNBT.getString("id"));
				String mobname = resourcelocation.toString().replace(LepidodendronMod.MODID + ":prehistoric_flora_", "");
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
