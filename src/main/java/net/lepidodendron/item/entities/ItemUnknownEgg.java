
package net.lepidodendron.item.entities;

import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.LepidodendronSorter;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

@ElementsLepidodendronMod.ModElement.Tag
public class ItemUnknownEgg extends ElementsLepidodendronMod.ModElement {
	@GameRegistry.ObjectHolder("lepidodendron:eggs_generic")
	public static final Item block = null;
	public ItemUnknownEgg(ElementsLepidodendronMod instance) {
		super(instance, LepidodendronSorter.eggs_generic);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		OreDictionary.registerOre("pnfurnaceSeafood", ItemUnknownEgg.block);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("lepidodendron:entities/eggs_generic_unknown", "inventory"));

//		ModelBakery.registerItemVariants(block,
//
//				new ModelResourceLocation("lepidodendron:entities/eggs_generic_unknown", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_limulid", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_acadoaradoxides", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_acanthodes", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_acrolepis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_aeger", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ainiktozoon", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_akmonistion", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_alacaris", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_albertonia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_allenypterus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_amplectobelua", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_angelina", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_anomalocaris", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_anthracomedusa", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_arandaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_asaphus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_astraspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ateleaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_austrolimulus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_bandringa", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_banffia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_barameda", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_barbclabornia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_beishanichthys", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_belantsea", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_birgeria", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_birkenia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_blourugia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_bobasatrania", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_boothiaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_bothriolepis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_brembodus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_brochoadmones", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_brongniartella", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_bushizheia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_calvapilosa", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_cambroraster", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_campbellodus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_canadaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_canadia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_carolowilhelmina", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_caturus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_cephalaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ceratodus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_cheirurus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_cheloniellon", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_chinlea", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_clydagnathus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_cobelodus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_coccosteus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_cothurnocystis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_cowielepis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_crotalocephalus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_cyclonema", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_daedalichthys", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_dalmanites", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_dapedium", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_deltoptychius", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_diania", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_didymograptus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_doryaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_dorypterus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_drepanaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_drotops", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ebenaqua", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_eglonaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ellipsocephalus", "inventory"),
//				//new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_elonichthys", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_elrathia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_enoploura", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_eoredlichia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_eosaurichthys", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ericixerxes", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_eusthenopteron", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_falcatus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_feroxichthys", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_foreyia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_furca", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_furcacauda", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_furcaster", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_gabreyaspis", "inventory"),
// 				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_gnathorhiza", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_groenlandaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_gyracanthides", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_haikouichthys", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_hallucigenia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_helianthaster", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_heliopeltis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_helmetia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_hemicyclaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_hibernaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_holonema", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_hungioides", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_iniopteryx", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_isotelus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_janassa", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_jianshanopodia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_kalbarria", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_kerygmachela", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_kimberella", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_kodymirus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_laminacaris", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_lanceaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_lochmanolenellus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_lonchidion", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_lunaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_lunataspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_lungmenshanaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_luoxiongichthys", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_lyrarapax", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_maclurina", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_marrella", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_mcnamaraspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_megactenopetalus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_menaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_metaspriggina", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_microdictyon", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_micromitra", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_mimetaster", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_monograptus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_montecaris", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_nectocaris", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_odaraia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_odontogriphus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_omnidens", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_opabinia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_opolanka", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ornithoprion", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_orthrozanclus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_osteolepis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ottoia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_palaeoisopus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_palaeoniscum", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_panderichthys", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_panderodus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_paraceraurus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_paradoxides", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_paranaichthys", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_parapeytoia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_paratarrasius", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_parexus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_paucipodia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_pelurgaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_phanerotinus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_phantaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_pharyngolepis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_pikaia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_platycaraspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_platylomaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_platysomus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_poleumita", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_pomatrum", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_poraspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_potanichthys", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_profallotaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_promissum", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_psarolepis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_psychopyge", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_pteraspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_pygopterus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_qilinyu", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_pygopterus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_retifacies", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_rhenocystis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_sacabambaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_saurichthys_freshwater", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_saurichthys_marine", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_scaumenacia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_schinderhannes", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_selenopeltis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_semionotus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_siberion", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_sidneyia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_silurolepis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_spiniplatyceras", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_spriggina", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_squatinactis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_stensioella", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_synophalos", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_tartuosteus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_tegopelte", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_terataspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_tetragraptus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_thelodus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_tokummia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_tomlinsonus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_torpedaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_traquairius", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_trimerus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_tullimonstrum", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_turrisaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_tyrannophontes", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_urosthenes", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_varialepis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_vetulicola", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_walliserops", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_willwerathia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_wiwaxia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_xenusion", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_yawunik", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_yohoia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_yunnanozoon", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_yilingia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_vachonisia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ampyx", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_arctinurus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_bohemoharpes", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_chotecops", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_harpes", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_lonchodomas", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ogyginus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_skeemella", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_uralichas", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_wingertshellicus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_nahecaris", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_weinbergina", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_aetheolepis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_aphnelepis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_arduafrons", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_eryon", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_aspidorhynchus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_macromesodon", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_notidanoides", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_bundenbachiellus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_dunyu", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_lasanius", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_eugaleaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_pituriaspis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_neeyambaspis", "inventory"),
//
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_furca", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_tomlinsonus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_miguashaia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_cometicercus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_tegeolepis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_gooloogongia", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_warneticaris", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_schugurocaris", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ceratiocaris", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_diplacanthus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_climatius", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_nerepisacanthus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_griphognathus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_concavicaris", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_gogonasus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_rhadinacanthus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_thrissops", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_belonostomus_jurassic", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_belonostomus_cretaceous", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_turboscinetes", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_redfieldius", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_leptolepis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_lepidotes", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_dollocaris", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_piranhamesodon", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_entelognathus", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_silurolepis", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_balhuticaris","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_stethacanthus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_megamastax","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_sclerodus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_polybranchiaspis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_parameteoraspis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_tauraspis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_athenaegis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_guiyu","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_phialaspis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_tauraspis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_sclerodus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_gyrosteus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_squaloraja","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_pezopallichthys","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_gyrodus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_jamoytius","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_tamisiocaris","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_cordaticaris","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_sanctacaris","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_marmolatella","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_typhloesus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_papilionichthys","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_promexyele","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_rainerichthys","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_paramblypterus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_zenaspis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_angustidontus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_dicranurus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_strudops","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_notostracan","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_psychopyge","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_thanahita","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_lepidaster","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_villebrunaster","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_elasmodectes","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_quasimodichthys","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_anaethalion","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_viviparus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_decacuminaster","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_hurdia","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_caryosyntrips","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_metopacanthus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_cancrinos","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_murex","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_leviathania","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_harpagodes","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_nerinea","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_sibyrhynchus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_rutgersella","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_viviparus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_marmolatella","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_duslia","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_metopacanthus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_cancrinos","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_murex","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_euspira","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_leviathania","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_harpagodes","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_nerinea","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_strombus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_helenodora","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_typhloesus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_angelina","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_platypeltoides","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_megistaspis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_tribrachiodemas","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_carolinites","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_symphysops","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_pricyclopyge","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_chasmataspis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_hoplitaspis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_harpacanthus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_harpagofututor","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_hadronector","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ophiopsis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_congophiopsis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_adamanteryon","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_scheenstia","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_plectronoceras","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_pseudorhina","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_phorcynis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_propterus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_oreochima","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ostenocaris","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_morrolepis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_eocarcinus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_kaykay","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_orthocormus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_panacanthocaris","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_steurbautichthys","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_mecochirus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_isanichthys","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_protospinax","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_palaeocarcharias","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_uarbryichthys","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_congopycnodus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_mesturus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_paracestracion","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_spathobatis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_bavariscyllium","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ischyodus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ligulella","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_paradapedium","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_haplophrentis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_kleptothule","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_phillipsia","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_rhinopteraspis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_shaihuludia","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ursactis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_kootenayscolex","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_nipponomaria", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_land_snail", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_spiniplatyceras", "inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_macrosemius","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_saurostomus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_songaichthys","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_phytophilaspis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_proconodontus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_ozarkodina","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_iowagnathus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_hindeodus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_clarkina","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_misikella","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_tanyrhinichthys","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_sokkaejaecystis","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_strudops","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_olenellus","inventory"),
//				new ModelResourceLocation("lepidodendron:entities/egg_prehistoric_flora_cervifurca","inventory")
//
//
//
//
//
//
//
//		);
//
//		ModelLoader.setCustomMeshDefinition(block, stack -> {
//			String stringEgg = ((stack).hasTagCompound() ? (stack).getTagCompound().getString("creature") : null);
//			if (stringEgg != null) {
//				stringEgg = stringEgg.replace(LepidodendronMod.MODID.toString() + ":", "lepidodendron:entities/egg_");
//				//System.err.println("stringEgg " + stringEgg);
//				try {
//					return new ModelResourceLocation(stringEgg, "inventory");
//				} catch (Throwable throwable) {
//					return new ModelResourceLocation("lepidodendron:entities/eggs_generic_unknown", "inventory");
//				}
//			}
//			return new ModelResourceLocation("lepidodendron:entities/eggs_generic_unknown", "inventory");
//		});
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			setTranslationKey("pf_eggs_generic");
			setRegistryName("eggs_generic");
			setCreativeTab(null);
			setMaxStackSize(64);
		}

		@Override
		public String getItemStackDisplayName(ItemStack stack)
		{
			String stringEgg = ((stack).hasTagCompound() ? (stack).getTagCompound().getString("creature") : null);
			if (stringEgg != null) {

				stringEgg = stringEgg.replace(LepidodendronMod.MODID.toString() + ":", "");

				if (stack.getTagCompound().hasKey("PNType")) {
					stringEgg = stringEgg + "_" + stack.getTagCompound().getString("PNType").toString();
				}

				return I18n.translateToLocal("item.pf_eggs_generic_full.name").trim()
						+ ": "
						+ I18n.translateToLocal("entity." + stringEgg + ".name").trim();
			}
			return super.getItemStackDisplayName(stack);
		}

		public String getTranslationKey(ItemStack stack)
		{
			String stringEgg = ((stack).hasTagCompound() ? (stack).getTagCompound().getString("creature") : null);
			if (stringEgg != null) {
				if (stack.getTagCompound().hasKey("PNType")) {
					stringEgg = stringEgg + "_" + stack.getTagCompound().getString("PNType").toString();
				}
				stringEgg = stringEgg.replace(LepidodendronMod.MODID.toString() + ":", "egg_");
				return "item." + stringEgg;
			}
			return super.getTranslationKey(stack);
		}

		public Class getEggClassfromNBT(ItemStack itemstack) {
			Class classEgg = null;
			String stringEgg = ((itemstack).hasTagCompound() ? (itemstack).getTagCompound().getString("creature") : null);
			if (stringEgg != null) {
				classEgg = findEntity(stringEgg);
			}
			return classEgg;
		}

		private static Class<? extends Entity> findEntity(String entity) {
			Class<? extends Entity> entityClass;
			EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(entity));
			entityClass = ee == null ? null : ee.getEntityClass();
			if (entityClass == null) {
				return null;
			}
			return entityClass;
		}

		public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
	    {
	        ItemStack itemstack = playerIn.getHeldItem(handIn);
	        RayTraceResult raytraceresult = this.rayTrace(worldIn, playerIn, true);

	        if (raytraceresult == null)
	        {
	            return new ActionResult<ItemStack>(EnumActionResult.PASS, itemstack);
	        }
	        else
	        {
	            if (raytraceresult.typeOfHit == RayTraceResult.Type.BLOCK)
	            {
	                BlockPos blockpos = raytraceresult.getBlockPos();

	                if (!worldIn.isBlockModifiable(playerIn, blockpos) || !playerIn.canPlayerEdit(blockpos.offset(raytraceresult.sideHit), raytraceresult.sideHit, itemstack))
	                {
	                    return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
	                }

	                IBlockState iblockstate = worldIn.getBlockState(blockpos);

					if (iblockstate.getMaterial() == Material.WATER) {
						String nbtStr = "";
						Entity entity = EntityList.createEntityByIDFromName(EntityList.getKey(getEggClassfromNBT(itemstack)), worldIn);
						if (entity instanceof EntityPrehistoricFloraAgeableBase) {
							nbtStr = "{AgeTicks:0}";
						}
						if (!(worldIn.isRemote)) {
							if (worldIn.getBlockState(blockpos).getBlock().getRegistryName().toString().equalsIgnoreCase("jaff:tank") && raytraceresult.sideHit == EnumFacing.UP) {
								blockpos = blockpos.down(); // If it's a JAFF tank place it IN the tank if we are clicking above it
							}

							if (itemstack.getTagCompound().hasKey("PNType")) {
								String type = itemstack.getTagCompound().getString("PNType");
								if (type.equalsIgnoreCase("gendered")) {
									type = "male";
									if (worldIn.rand.nextInt(2) == 0) {
										type = "female";
									}
								}
								if (entity instanceof EntityPrehistoricFloraAgeableBase) {
									nbtStr = "{PNType:\"" + type + "\",AgeTicks:0}";
								}
								else {
									nbtStr = "{PNType:\""  + type + "\"}";
								}
							}

							EntityPrehistoricFloraAgeableBase.summon(worldIn, EntityList.getKey(getEggClassfromNBT(itemstack)).toString(), nbtStr, blockpos.getX() + 0.5, blockpos.getY() + 0.5, blockpos.getZ() + 0.5);


						}
						if (!playerIn.capabilities.isCreativeMode) {
							itemstack.shrink(1);
						}
						playerIn.addStat(StatList.getObjectUseStats(this));
						worldIn.playSound(playerIn, blockpos, SoundEvents.ENTITY_BOBBER_SPLASH, SoundCategory.BLOCKS, 1.0F, 1.0F);
						return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, itemstack);
					}
	            }
	
	            return new ActionResult<ItemStack>(EnumActionResult.FAIL, itemstack);
	        }
	    }
	}

}
