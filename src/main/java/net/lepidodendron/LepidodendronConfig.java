package net.lepidodendron;

import com.google.common.collect.Lists;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;
import java.util.List;

public class LepidodendronConfig {
    public static Configuration cfg;
    public static LepidodendronConfig instance = new LepidodendronConfig();
    public static String[] genGlobalBlacklist = new String[0];
    public static String[] genLogResin = new String[]{"minecraft:log:1", "lepidodendron:hymenaea_log", "lepidodendron:agathis_log", "lepidodendron:araucarioxylon_log", "lepidodendron:bunya_log", "lepidodendron:columnaris_log", "lepidodendron:cunninghamia_log", "lepidodendron:monkeypuzzle_log", "lepidodendron:sciadopitys_log", "lepidodendron:wollemi_log", "biomesoplenty:log_2:6", "biomesoplenty:log_0:7", "jurassicraft:araucaria_log", "wildnature:cedar_log", "wildnature:fir_log", "wildnature:pine_log", "lepidodendron:bristlecone_log", "lepidodendron:mirabilis_log", "lepidodendron:monkey_puzzle_araucaria_log", "lepidodendron:hoop_araucaria_log", "lepidodendron:cunninghamia_log"};
    public static String[] genPlantPrehistoric = new String[]{"fossil:bennettitales_large", "fossil:bennettitales_small", "fossil:calamites_leaves", "fossil:calamites_sapling", "fossil:cordaites_leaves", "fossil:cordaites_sapling", "fossil:crataegus", "fossil:cyathea", "fossil:dictyophyllum", "fossil:dillhoffia_flower", "fossil:dipteris", "fossil:duisbergia", "fossil:ependra", "fossil:fern_block", "fossil:florissantia", "fossil:foozia", "fossil:fossil_sapling_calamites", "fossil:fossil_sapling_cordaites", "fossil:fossil_sapling_palae", "fossil:fossil_sapling_sigillaria", "fossil:horsetail_small", "fossil:licopodiophyta", "fossil:osmunda", "fossil:palm_leaves", "fossil:palm_sapling", "fossil:sagenopteris", "fossil:sarracenia", "fossil:sigillaria_leaves", "fossil:sigillaria_sapling", "fossil:tempskya", "fossil:vaccinium", "fossil:welwitschia", "fossil:zamites", "jurassicraft:ajuginucula_smithii", "jurassicraft:ajuginucula_smithii_leaves", "jurassicraft:araucaria_leaves", "jurassicraft:araucaria_sapling", "jurassicraft:bennettitalean_cycadeoidea", "jurassicraft:bristle_fern", "jurassicraft:calamites_leaves", "jurassicraft:calamites_sapling", "jurassicraft:cinnamon_fern", "jurassicraft:cry_pansy", "jurassicraft:cycad_zamites", "jurassicraft:dicksonia", "jurassicraft:dicroidium_zuberi", "jurassicraft:dictyophyllum", "jurassicraft:encephalartos", "jurassicraft:ginkgo_leaves", "jurassicraft:ginkgo_sapling", "jurassicraft:gracilaria_seaweed", "jurassicraft:graminidites_bambusoides", "jurassicraft:heliconia", "jurassicraft:ladinia_simplex", "jurassicraft:moss", "jurassicraft:orontium_mackii", "jurassicraft:paleo_bale_cycad", "jurassicraft:paleo_bale_cycadeoidea", "jurassicraft:paleo_bale_fern", "jurassicraft:paleo_bale_leaves", "jurassicraft:paleo_bale_other", "jurassicraft:phoenix_leaves", "jurassicraft:phoenix_sapling", "jurassicraft:psaronius_leaves", "jurassicraft:psaronius_sapling", "jurassicraft:raphaelia", "jurassicraft:rhacophyton", "jurassicraft:rhamnus_salicifolius", "jurassicraft:scaly_tree_fern", "jurassicraft:serenna_veriformans", "jurassicraft:small_chain_fern", "jurassicraft:small_cycad", "jurassicraft:small_royal_fern", "jurassicraft:tempskya", "jurassicraft:umaltolepis", "jurassicraft:west_indian_lilac", "jurassicraft:woolly_stalked_begonia", "rebornmod:ajuginucula_smithii", "rebornmod:ajuginucula_smithii_leaves", "rebornmod:araucaria_leaves", "rebornmod:araucaria_sapling", "rebornmod:bennettitalean_cycadeoidea", "rebornmod:bristle_fern", "rebornmod:calamites_leaves", "rebornmod:calamites_sapling", "rebornmod:cinnamon_fern", "rebornmod:cry_pansy", "rebornmod:cycad_zamites", "rebornmod:dicksonia", "rebornmod:dicroidium_zuberi", "rebornmod:dictyophyllum", "rebornmod:encephalartos", "rebornmod:ginkgo_leaves", "rebornmod:ginkgo_sapling", "rebornmod:gracilaria_seaweed", "rebornmod:graminidites_bambusoides", "rebornmod:heliconia", "rebornmod:ladinia_simplex", "rebornmod:moss", "rebornmod:orontium_mackii", "rebornmod:paleo_bale_cycad", "rebornmod:paleo_bale_cycadeoidea", "rebornmod:paleo_bale_fern", "rebornmod:paleo_bale_leaves", "rebornmod:paleo_bale_other", "rebornmod:phoenix_leaves", "rebornmod:phoenix_sapling", "rebornmod:psaronius_leaves", "rebornmod:psaronius_sapling", "rebornmod:raphaelia", "rebornmod:rhacophyton", "rebornmod:rhamnus_salicifolius", "rebornmod:scaly_tree_fern", "rebornmod:serenna_veriformans", "rebornmod:small_chain_fern", "rebornmod:small_cycad", "rebornmod:small_royal_fern", "rebornmod:tempskya", "rebornmod:umaltolepis", "rebornmod:west_indian_lilac", "rebornmod:woolly_stalked_begonia"};
    public static int waterSandHorizontal = 6;
    public static int waterSandVertical = 0;
    public static int waterPangaeanHorizontal = 3;
    public static int waterPangaeanVertical = 0;
    public static int spreadPlants = 70;
    public static boolean biomeApple = true;
    public static boolean machinesRF = false;
    public static boolean sulphuricAcidGrief = true;
    public static boolean sulphuricAcidInfinite = false;

    public static boolean genFossil = true;
    public static double junkFossil = 12.5;
    public static boolean modFire = true;
    public static int genPalaeobotanist = 30;
    public static int genPalaeontologist = 30;
    public static boolean renderAnimations = true;
    public static boolean renderEdiacaranLighting = true;
    public static boolean renderCustomSkies = true;
    public static boolean renderBigMobsProperly = true;
    public static boolean blockSkeletonHorse = true;
    public static boolean blockMobs = true;
    public static boolean blockMobsFAExceptions = true;
    public static boolean doMeteorites = true;
    public static boolean doMeteoritesGriefing = true;
    public static boolean fixApples = true;
    public static boolean doReSpawner = true;
    
    public static boolean doShrinkBiomes = true;

    public static boolean renderFog = true;
    public static boolean fixZirconGlass = true;

    public static int attackHealth = 90;
    public static int adultAge = 75;
    public static double spawnerDensity = 1.0;
    public static boolean attackPlayerAlways = false;
    public static boolean doLowRes = false;

    public static double worldDimensionScaler = 10D;

    public static int dimPrecambrian = -78;
    public static int dimCambrian = -79;
    public static int dimSilurian = -80;
    public static int dimDevonian = -81;
    public static int dimCarboniferous = -82;
    public static int dimPermian = -83;
    public static int dimTriassic = -84;
    public static int dimJurassic = -85;
    public static int dimCretaceous = -86;
    public static int dimOrdovician = -87;
    public static int dimPaleogene = -88;
    public static int dimNeogene = -89;
    public static int dimPleistocene = -90;

    public static boolean doSpawnsPrehistoricFloraDefault = true;
    public static boolean doSpawnsFossilsArcheology = false;
    public static boolean doSpawnsReborn = false;


    public static boolean doMultiplyMobs = false;

    public static String[] mobSpawnBespoke = new String[0];

    public static String[] jarMobs = new String[0];

    public static String[] dimPrecambrianMobsPF = new String[]{"lepidodendron:prehistoric_flora_jellyfish_precambrian:8:28","lepidodendron:prehistoric_flora_dickinsonia:2:42","lepidodendron:prehistoric_flora_kimberella:3:48","lepidodendron:prehistoric_flora_eoandromeda:10:40","lepidodendron:prehistoric_flora_parvancorina:3:50","lepidodendron:prehistoric_flora_spriggina:3:50","lepidodendron:prehistoric_flora_yilingia:2:55","lepidodendron:prehistoric_flora_yorgia:3:50"};

    public static String[] dimCambrianMobsPF = new String[]{"lepidodendron:prehistoric_flora_acadoaradoxides:3:40:3","lepidodendron:prehistoric_flora_alacaris:3:40:3","lepidodendron:prehistoric_flora_anomalocaris:1:40:2","lepidodendron:prehistoric_flora_banffia:5:40:3","lepidodendron:prehistoric_flora_cambroraster:3:40:3","lepidodendron:prehistoric_flora_canadaspis:3:40:3","lepidodendron:prehistoric_flora_canadia:3:40:2","lepidodendron:prehistoric_flora_ellipsocephalus:3:40:3","lepidodendron:prehistoric_flora_elrathia:3:40:3","lepidodendron:prehistoric_flora_hallucigenia:3:40:2","lepidodendron:prehistoric_flora_helmetia:3:40:3","lepidodendron:prehistoric_flora_kerygmachela:3:40:2","lepidodendron:prehistoric_flora_kodymirus:3:40:2","lepidodendron:prehistoric_flora_lochmanolenellus:4:40:3","lepidodendron:prehistoric_flora_marrella:8:40:2","lepidodendron:prehistoric_flora_metaspriggina:8:40:3","lepidodendron:prehistoric_flora_nectocaris:6:40:3","lepidodendron:prehistoric_flora_odaraia:3:40:3","lepidodendron:prehistoric_flora_odontogriphus:3:40:2","lepidodendron:prehistoric_flora_opabinia:2:40:3","lepidodendron:prehistoric_flora_orthrozanclus:6:40:2","lepidodendron:prehistoric_flora_ottoia:2:40:2","lepidodendron:prehistoric_flora_palaeojelly1:1:40:2","lepidodendron:prehistoric_flora_palaeojelly2:1:40:2","lepidodendron:prehistoric_flora_palaeojelly3:1:40:2","lepidodendron:prehistoric_flora_paradoxides:3:40:3","lepidodendron:prehistoric_flora_phantaspis:3:40:3","lepidodendron:prehistoric_flora_pikaia:8:40:3","lepidodendron:prehistoric_flora_profallotaspis:4:40:2","lepidodendron:prehistoric_flora_siberion:3:40:2","lepidodendron:prehistoric_flora_sidneyia:3:40:3","lepidodendron:prehistoric_flora_tegopelte:3:40:3","lepidodendron:prehistoric_flora_tokummia:3:40:3","lepidodendron:prehistoric_flora_wiwaxia:6:40:3","lepidodendron:prehistoric_flora_xenusion:3:40:2","lepidodendron:prehistoric_flora_yawunik:6:40:3","lepidodendron:prehistoric_flora_yohoia:8:40:3"};
    public static String[] dimCambrianEstuaryMobsPF = new String[]{"lepidodendron:prehistoric_flora_amplectobelua:1:40:3","lepidodendron:prehistoric_flora_batofasciculus:1:40:3","lepidodendron:prehistoric_flora_bushizheia:3:40:3","lepidodendron:prehistoric_flora_canadaspis:3:40:3","lepidodendron:prehistoric_flora_diania:3:40:3","lepidodendron:prehistoric_flora_eoredlichia:3:40:3","lepidodendron:prehistoric_flora_fortiforceps:4:40:3","lepidodendron:prehistoric_flora_gemmactena:3:40:3","lepidodendron:prehistoric_flora_haikouichthys:4:40:3","lepidodendron:prehistoric_flora_jianshanopodia:3:40:3","lepidodendron:prehistoric_flora_laminacaris:1:40:3","lepidodendron:prehistoric_flora_lyrarapax:3:40:3","lepidodendron:prehistoric_flora_microdictyon:3:40:3","lepidodendron:prehistoric_flora_nectocaris:6:40:3","lepidodendron:prehistoric_flora_omnidens:1:25:3","lepidodendron:prehistoric_flora_palaeojelly4:1:40:3","lepidodendron:prehistoric_flora_parapeytoia:2:40:3","lepidodendron:prehistoric_flora_paucipodia:3:40:3","lepidodendron:prehistoric_flora_pomatrum:8:40:3","lepidodendron:prehistoric_flora_retifacies:5:40:3","lepidodendron:prehistoric_flora_sidneyia:3:40:3","lepidodendron:prehistoric_flora_synophalos{chain:8}:16:40:3","lepidodendron:prehistoric_flora_vetulicola:4:40:3","lepidodendron:prehistoric_flora_wiwaxia:6:40:3","lepidodendron:prehistoric_flora_yunnanozoon:8:40:3"};

    public static String[] dimOrdovicianMobsOceanPF = new String[]{"lepidodendron:prehistoric_flora_aegirocassis:2:12:3","lepidodendron:prehistoric_flora_aegirocassis:2:22:2","lepidodendron:prehistoric_flora_ampyx:5:60:3","lepidodendron:prehistoric_flora_ampyx:5:60:7","lepidodendron:prehistoric_flora_angelina:5:60:3","lepidodendron:prehistoric_flora_angelina:5:60:7","lepidodendron:prehistoric_flora_aphetoceras:2:45:3","lepidodendron:prehistoric_flora_aphetoceras:2:45:2","lepidodendron:prehistoric_flora_arandaspis:6:30:3","lepidodendron:prehistoric_flora_arandaspis:6:30:2","lepidodendron:prehistoric_flora_asaphus:3:60:3","lepidodendron:prehistoric_flora_asaphus:3:60:7","lepidodendron:prehistoric_flora_astraspis:3:13:3","lepidodendron:prehistoric_flora_astraspis:3:13:2","lepidodendron:prehistoric_flora_brongniartella:5:60:3","lepidodendron:prehistoric_flora_brongniartella:5:60:7","lepidodendron:prehistoric_flora_calvapilosa:4:60:3","lepidodendron:prehistoric_flora_calvapilosa:4:60:7","lepidodendron:prehistoric_flora_cassinoceras:2:30:3","lepidodendron:prehistoric_flora_cassinoceras:2:30:2","lepidodendron:prehistoric_flora_cheirurus:2:60:3","lepidodendron:prehistoric_flora_cheirurus:2:60:2","lepidodendron:prehistoric_flora_cothurnocystis:6:12:3","lepidodendron:prehistoric_flora_cothurnocystis:6:12:7","lepidodendron:prehistoric_flora_cyclonema:2:60:3","lepidodendron:prehistoric_flora_cyclonema:2:60:7","lepidodendron:prehistoric_flora_cyrtoceras:2:54:3","lepidodendron:prehistoric_flora_cyrtoceras:2:54:2","lepidodendron:prehistoric_flora_dalmanites:3:60:3","lepidodendron:prehistoric_flora_dalmanites:3:60:7","lepidodendron:prehistoric_flora_didymograptus:3:60:3","lepidodendron:prehistoric_flora_didymograptus:3:60:2","lepidodendron:prehistoric_flora_enoploura:3:50:3","lepidodendron:prehistoric_flora_furca:3:27:3","lepidodendron:prehistoric_flora_furca:3:27:2","lepidodendron:prehistoric_flora_gonioceras:3:27:3","lepidodendron:prehistoric_flora_gonioceras:3:27:7","lepidodendron:prehistoric_flora_harpes:5:60:3","lepidodendron:prehistoric_flora_harpes:5:60:7","lepidodendron:prehistoric_flora_hoplitaspis:4:30:3","lepidodendron:prehistoric_flora_hoplitaspis:4:30:7","lepidodendron:prehistoric_flora_isotelus:5:60:3","lepidodendron:prehistoric_flora_isotelus:5:60:7","lepidodendron:prehistoric_flora_jellyfish1:1:20:3","lepidodendron:prehistoric_flora_jellyfish1:1:20:2","lepidodendron:prehistoric_flora_jellyfish2:1:20:3","lepidodendron:prehistoric_flora_jellyfish2:1:20:2","lepidodendron:prehistoric_flora_jellyfish3:1:20:3","lepidodendron:prehistoric_flora_jellyfish3:1:20:2","lepidodendron:prehistoric_flora_jellyfish4:1:20:3","lepidodendron:prehistoric_flora_jellyfish4:1:20:2","lepidodendron:prehistoric_flora_jellyfish5:1:20:3","lepidodendron:prehistoric_flora_jellyfish5:1:20:2","lepidodendron:prehistoric_flora_jellyfish6:1:20:3","lepidodendron:prehistoric_flora_jellyfish6:1:20:2","lepidodendron:prehistoric_flora_jellyfish7:1:20:3","lepidodendron:prehistoric_flora_jellyfish7:1:20:2","lepidodendron:prehistoric_flora_lituites:2:45:3","lepidodendron:prehistoric_flora_lituites:2:45:2","lepidodendron:prehistoric_flora_lunataspis:2:60:3","lepidodendron:prehistoric_flora_lunataspis:2:60:7","lepidodendron:prehistoric_flora_maclurina:3:60:3","lepidodendron:prehistoric_flora_maclurina:3:60:7","lepidodendron:prehistoric_flora_megalograptus:6:18:3","lepidodendron:prehistoric_flora_megalograptus:6:18:2","lepidodendron:prehistoric_flora_selenopeltis:5:60:3","lepidodendron:prehistoric_flora_selenopeltis:5:60:7","lepidodendron:prehistoric_flora_temperoceras:5:33:3","lepidodendron:prehistoric_flora_temperoceras:5:33:2","lepidodendron:prehistoric_flora_tetragraptus:2:60:3","lepidodendron:prehistoric_flora_tetragraptus:2:60:2","lepidodendron:prehistoric_flora_tomlinsonus:3:27:3","lepidodendron:prehistoric_flora_tomlinsonus:3:27:2","lepidodendron:prehistoric_flora_uralichas:5:60:3","lepidodendron:prehistoric_flora_uralichas:5:60:7"};
    public static String[] dimOrdovicianMobsOceanSpongePF = new String[]{"lepidodendron:prehistoric_flora_ampyx:5:80:3","lepidodendron:prehistoric_flora_ampyx:5:80:7","lepidodendron:prehistoric_flora_aphetoceras:2:20:3","lepidodendron:prehistoric_flora_aphetoceras:2:20:2","lepidodendron:prehistoric_flora_asaphus:3:80:3","lepidodendron:prehistoric_flora_asaphus:3:80:7","lepidodendron:prehistoric_flora_brongniartella:5:80:3","lepidodendron:prehistoric_flora_brongniartella:5:80:7","lepidodendron:prehistoric_flora_calvapilosa:4:80:3","lepidodendron:prehistoric_flora_calvapilosa:4:80:7","lepidodendron:prehistoric_flora_cassinoceras:2:45:3","lepidodendron:prehistoric_flora_cassinoceras:2:45:2","lepidodendron:prehistoric_flora_cheirurus:2:80:3","lepidodendron:prehistoric_flora_cheirurus:2:80:7","lepidodendron:prehistoric_flora_cothurnocystis:6:50:3","lepidodendron:prehistoric_flora_cothurnocystis:6:50:7","lepidodendron:prehistoric_flora_cyclonema:2:80:3","lepidodendron:prehistoric_flora_cyclonema:2:80:7","lepidodendron:prehistoric_flora_cyrtoceras:2:20:3","lepidodendron:prehistoric_flora_cyrtoceras:2:20:2","lepidodendron:prehistoric_flora_dalmanites:3:80:3","lepidodendron:prehistoric_flora_dalmanites:3:80:7","lepidodendron:prehistoric_flora_didymograptus:3:80:3","lepidodendron:prehistoric_flora_didymograptus:3:80:2","lepidodendron:prehistoric_flora_duslia:4:80:3","lepidodendron:prehistoric_flora_duslia:4:80:7","lepidodendron:prehistoric_flora_enoploura:3:50:ERROR","lepidodendron:prehistoric_flora_furca:3:27:3","lepidodendron:prehistoric_flora_furca:3:27:2","lepidodendron:prehistoric_flora_harpes:5:80:3","lepidodendron:prehistoric_flora_harpes:5:80:7","lepidodendron:prehistoric_flora_hoplitaspis:4:80:3","lepidodendron:prehistoric_flora_hoplitaspis:4:80:7","lepidodendron:prehistoric_flora_isotelus:5:80:3","lepidodendron:prehistoric_flora_isotelus:5:80:7","lepidodendron:prehistoric_flora_jellyfish1:1:10:3","lepidodendron:prehistoric_flora_jellyfish1:1:10:2","lepidodendron:prehistoric_flora_jellyfish2:1:10:3","lepidodendron:prehistoric_flora_jellyfish2:1:10:2","lepidodendron:prehistoric_flora_jellyfish3:1:10:3","lepidodendron:prehistoric_flora_jellyfish3:1:10:2","lepidodendron:prehistoric_flora_jellyfish4:1:10:3","lepidodendron:prehistoric_flora_jellyfish4:1:10:2","lepidodendron:prehistoric_flora_jellyfish5:1:10:3","lepidodendron:prehistoric_flora_jellyfish5:1:10:2","lepidodendron:prehistoric_flora_jellyfish6:1:10:3","lepidodendron:prehistoric_flora_jellyfish6:1:10:2","lepidodendron:prehistoric_flora_jellyfish7:1:10:3","lepidodendron:prehistoric_flora_jellyfish7:1:10:2","lepidodendron:prehistoric_flora_lonchodomas:5:86:3","lepidodendron:prehistoric_flora_lonchodomas:5:86:7","lepidodendron:prehistoric_flora_maclurina:3:80:3","lepidodendron:prehistoric_flora_maclurina:3:80:7","lepidodendron:prehistoric_flora_selenopeltis:5:80:3","lepidodendron:prehistoric_flora_selenopeltis:5:80:7","lepidodendron:prehistoric_flora_tetragraptus:3:80:3","lepidodendron:prehistoric_flora_tetragraptus:3:80:2","lepidodendron:prehistoric_flora_uralichas:5:80:3","lepidodendron:prehistoric_flora_uralichas:5:80:7"};
    public static String[] dimOrdovicianMobsOceanIcePF = new String[]{"lepidodendron:prehistoric_flora_aegirocassis:2:9:3","lepidodendron:prehistoric_flora_aegirocassis:2:9:2","lepidodendron:prehistoric_flora_cameroceras:2:10:3","lepidodendron:prehistoric_flora_cameroceras:2:10:2","lepidodendron:prehistoric_flora_cheirurus:2:66:3","lepidodendron:prehistoric_flora_cheirurus:2:66:7","lepidodendron:prehistoric_flora_cyrtoceras:2:54:3","lepidodendron:prehistoric_flora_cyrtoceras:2:54:2","lepidodendron:prehistoric_flora_deiroceras:2:10:3","lepidodendron:prehistoric_flora_deiroceras:2:10:2","lepidodendron:prehistoric_flora_didymograptus:3:90:3","lepidodendron:prehistoric_flora_didymograptus:3:90:2","lepidodendron:prehistoric_flora_endoceras:2:10:3","lepidodendron:prehistoric_flora_endoceras:2:10:2","lepidodendron:prehistoric_flora_hungioides:3:50:3","lepidodendron:prehistoric_flora_hungioides:3:50:7","lepidodendron:prehistoric_flora_jellyfish1:1:20:3","lepidodendron:prehistoric_flora_jellyfish1:1:20:2","lepidodendron:prehistoric_flora_jellyfish2:1:20:3","lepidodendron:prehistoric_flora_jellyfish2:1:20:2","lepidodendron:prehistoric_flora_jellyfish3:1:20:3","lepidodendron:prehistoric_flora_jellyfish3:1:20:2","lepidodendron:prehistoric_flora_jellyfish4:1:20:3","lepidodendron:prehistoric_flora_jellyfish4:1:20:2","lepidodendron:prehistoric_flora_jellyfish5:1:20:3","lepidodendron:prehistoric_flora_jellyfish5:1:20:2","lepidodendron:prehistoric_flora_jellyfish6:1:20:3","lepidodendron:prehistoric_flora_jellyfish6:1:20:2","lepidodendron:prehistoric_flora_jellyfish7:1:20:3","lepidodendron:prehistoric_flora_jellyfish7:1:20:2","lepidodendron:prehistoric_flora_ogyginus:4:80:3","lepidodendron:prehistoric_flora_ogyginus:4:80:7","lepidodendron:prehistoric_flora_orthoceras:2:10:3","lepidodendron:prehistoric_flora_orthoceras:2:10:2","lepidodendron:prehistoric_flora_panderodus:3:14:3","lepidodendron:prehistoric_flora_panderodus:3:14:2","lepidodendron:prehistoric_flora_promissum:1:15:3","lepidodendron:prehistoric_flora_promissum:1:15:2","lepidodendron:prehistoric_flora_sacabambaspis:6:30:3","lepidodendron:prehistoric_flora_sacabambaspis:6:30:2","lepidodendron:prehistoric_flora_selenopeltis:5:54:3","lepidodendron:prehistoric_flora_selenopeltis:5:54:7","lepidodendron:prehistoric_flora_temperoceras:2:33:3","lepidodendron:prehistoric_flora_temperoceras:2:33:2","lepidodendron:prehistoric_flora_tetragraptus:3:80:3","lepidodendron:prehistoric_flora_tetragraptus:3:80:2"};
    public static String[] dimOrdovicianMobsLandPF = new String[]{"lepidodendron:prehistoric_flora_kalbarria:6:-10:3"};

    public static String[] dimSilurianMobsOceanPF = new String[]{"lepidodendron:prehistoric_flora_acutiramus:1:11:3","lepidodendron:prehistoric_flora_acutiramus:1:11:2","lepidodendron:prehistoric_flora_ainiktozoon:3:36:3","lepidodendron:prehistoric_flora_ainiktozoon:3:36:2","lepidodendron:prehistoric_flora_arctinurus:6:33:3","lepidodendron:prehistoric_flora_arctinurus:6:33:7","lepidodendron:prehistoric_flora_ascoceras:4:54:3","lepidodendron:prehistoric_flora_ascoceras:4:54:2","lepidodendron:prehistoric_flora_ateleaspis:4:36:3","lepidodendron:prehistoric_flora_ateleaspis:4:36:2","lepidodendron:prehistoric_flora_birkenia:6:22:3","lepidodendron:prehistoric_flora_birkenia:6:22:2","lepidodendron:prehistoric_flora_bohemoharpes:5:33:3","lepidodendron:prehistoric_flora_bohemoharpes:5:33:7","lepidodendron:prehistoric_flora_boothiaspis:6:22:3","lepidodendron:prehistoric_flora_boothiaspis:6:22:2","lepidodendron:prehistoric_flora_brongniartella:5:27:3","lepidodendron:prehistoric_flora_brongniartella:5:27:2","lepidodendron:prehistoric_flora_carcinosoma:1:12:3","lepidodendron:prehistoric_flora_carcinosoma:1:12:2","lepidodendron:prehistoric_flora_cephalaspis:4:30:3","lepidodendron:prehistoric_flora_cheirurus:2:66:3","lepidodendron:prehistoric_flora_cheirurus:2:66:7","lepidodendron:prehistoric_flora_cowielepis:6:22:3","lepidodendron:prehistoric_flora_cowielepis:6:22:2","lepidodendron:prehistoric_flora_crotalocephalus:3:30:3","lepidodendron:prehistoric_flora_crotalocephalus:3:30:7","lepidodendron:prehistoric_flora_cyrtoceras:2:54:3","lepidodendron:prehistoric_flora_cyrtoceras:2:54:2","lepidodendron:prehistoric_flora_dalmanites:3:30:3","lepidodendron:prehistoric_flora_dalmanites:3:30:7","lepidodendron:prehistoric_flora_eurypterus:3:60:3","lepidodendron:prehistoric_flora_eurypterus:3:60:2","lepidodendron:prehistoric_flora_furcaster:2:18:3","lepidodendron:prehistoric_flora_furcaster:2:18:7","lepidodendron:prehistoric_flora_harpes:5:28:3","lepidodendron:prehistoric_flora_harpes:5:28:7","lepidodendron:prehistoric_flora_hemicyclaspis:4:30:3","lepidodendron:prehistoric_flora_jellyfish1:1:5:3","lepidodendron:prehistoric_flora_jellyfish1:1:5:2","lepidodendron:prehistoric_flora_jellyfish2:1:5:3","lepidodendron:prehistoric_flora_jellyfish2:1:5:2","lepidodendron:prehistoric_flora_jellyfish3:1:5:3","lepidodendron:prehistoric_flora_jellyfish3:1:5:2","lepidodendron:prehistoric_flora_jellyfish4:1:5:3","lepidodendron:prehistoric_flora_jellyfish4:1:5:2","lepidodendron:prehistoric_flora_jellyfish5:1:5:3","lepidodendron:prehistoric_flora_jellyfish5:1:5:2","lepidodendron:prehistoric_flora_jellyfish6:1:5:3","lepidodendron:prehistoric_flora_jellyfish6:1:5:2","lepidodendron:prehistoric_flora_jellyfish7:1:5:3","lepidodendron:prehistoric_flora_jellyfish7:1:5:2","lepidodendron:prehistoric_flora_kokomopterus:3:12:3","lepidodendron:prehistoric_flora_kokomopterus:3:12:2","lepidodendron:prehistoric_flora_mixopterus:2:30:3","lepidodendron:prehistoric_flora_mixopterus:2:30:2","lepidodendron:prehistoric_flora_monograptus:3:12:3","lepidodendron:prehistoric_flora_monograptus:3:12:2","lepidodendron:prehistoric_flora_panderodus:2:9:3","lepidodendron:prehistoric_flora_panderodus:2:9:2","lepidodendron:prehistoric_flora_pharyngolepis:3:13:3","lepidodendron:prehistoric_flora_pharyngolepis:3:13:2","lepidodendron:prehistoric_flora_phragmoceras:2:30:3","lepidodendron:prehistoric_flora_phragmoceras:2:30:7","lepidodendron:prehistoric_flora_platycaraspis:2:45:3","lepidodendron:prehistoric_flora_platycaraspis:2:45:2","lepidodendron:prehistoric_flora_platylomaspis:2:30:3","lepidodendron:prehistoric_flora_platylomaspis:2:30:2","lepidodendron:prehistoric_flora_poleumita:2:18:3","lepidodendron:prehistoric_flora_poleumita:2:18:7","lepidodendron:prehistoric_flora_poraspis:2:24:3","lepidodendron:prehistoric_flora_poraspis:2:24:2","lepidodendron:prehistoric_flora_psarolepis:3:20:3","lepidodendron:prehistoric_flora_psarolepis:3:20:2","lepidodendron:prehistoric_flora_pterygotus:1:12:3","lepidodendron:prehistoric_flora_pterygotus:1:12:2","lepidodendron:prehistoric_flora_qilinyu:6:30:3","lepidodendron:prehistoric_flora_qilinyu:6:30:2","lepidodendron:prehistoric_flora_silurolepis:4:24:3","lepidodendron:prehistoric_flora_silurolepis:4:24:2","lepidodendron:prehistoric_flora_strobilopterus:1:12:3","lepidodendron:prehistoric_flora_strobilopterus:1:12:2","lepidodendron:prehistoric_flora_temperoceras:2:33:3","lepidodendron:prehistoric_flora_temperoceras:2:33:2","lepidodendron:prehistoric_flora_thelodus:2:30:3","lepidodendron:prehistoric_flora_thelodus:2:30:2","lepidodendron:prehistoric_flora_torpedaspis:4:24:3","lepidodendron:prehistoric_flora_torpedaspis:4:24:2","lepidodendron:prehistoric_flora_trimerus:6:33:3","lepidodendron:prehistoric_flora_trimerus:6:33:7"};
    public static String[] dimSilurianMobsLandPF = new String[]{"lepidodendron:prehistoric_flora_eoarthropleura:2:18:1","lepidodendron:prehistoric_flora_kalbarria:8:35:3","lepidodendron:prehistoric_flora_trigonotarbid_palaeotarbus:2:14:1"};

    public static String[] dimDevonianMobsOceanPF = new String[]{"lepidodendron:prehistoric_flora_acanthodes:4:75:3","lepidodendron:prehistoric_flora_acanthodes:4:75:2","lepidodendron:prehistoric_flora_acutiramus:1:12:3","lepidodendron:prehistoric_flora_acutiramus:1:12:2","lepidodendron:prehistoric_flora_ammonite_goniatites:2:95:3","lepidodendron:prehistoric_flora_ammonite_goniatites:2:95:2","lepidodendron:prehistoric_flora_ammonite_manticoceras:2:95:3","lepidodendron:prehistoric_flora_ammonite_manticoceras:2:95:2","lepidodendron:prehistoric_flora_archaeocidaris:8:85:7","lepidodendron:prehistoric_flora_basiloceras:2:45:3","lepidodendron:prehistoric_flora_basiloceras:2:45:2","lepidodendron:prehistoric_flora_bothriolepis:3:30:3","lepidodendron:prehistoric_flora_brochoadmones:3:30:3","lepidodendron:prehistoric_flora_campbellodus:3:30:3","lepidodendron:prehistoric_flora_carolowilhelmina:2:27:2","lepidodendron:prehistoric_flora_cephalaspis:5:48:3","lepidodendron:prehistoric_flora_cheirurus:3:51:3","lepidodendron:prehistoric_flora_cheirurus:3:51:7","lepidodendron:prehistoric_flora_cladoselache:1:24:2","lepidodendron:prehistoric_flora_clydagnathus:4:18:2","lepidodendron:prehistoric_flora_coccosteus:3:33:3","lepidodendron:prehistoric_flora_crotalocephalus:3:54:3","lepidodendron:prehistoric_flora_crotalocephalus:3:54:7","lepidodendron:prehistoric_flora_cyrtoceras:1:54:3","lepidodendron:prehistoric_flora_cyrtoceras:1:54:2","lepidodendron:prehistoric_flora_dalmanites:3:54:3","lepidodendron:prehistoric_flora_dalmanites:3:54:7","lepidodendron:prehistoric_flora_deiroceras:2:15:2","lepidodendron:prehistoric_flora_doryaspis:8:36:3","lepidodendron:prehistoric_flora_drotops:5:24:2","lepidodendron:prehistoric_flora_dunkleosteus:1:3:2","lepidodendron:prehistoric_flora_dunkleosteus{AgeTicks:0}:1:3:3","lepidodendron:prehistoric_flora_furcacauda:8:21:3","lepidodendron:prehistoric_flora_furcacauda:8:21:2","lepidodendron:prehistoric_flora_gantarostrataspis:4:35:2","lepidodendron:prehistoric_flora_groenlandaspis:4:30:3","lepidodendron:prehistoric_flora_gyracanthides:3:8:3","lepidodendron:prehistoric_flora_gyracanthides:3:8:2","lepidodendron:prehistoric_flora_harpes:4:20:3","lepidodendron:prehistoric_flora_heliopeltis:3:27:2","lepidodendron:prehistoric_flora_hemicyclaspis:3:39:3","lepidodendron:prehistoric_flora_holonema:1:14:2","lepidodendron:prehistoric_flora_jaekelopterus:1:5:3","lepidodendron:prehistoric_flora_jaekelopterus:1:5:2","lepidodendron:prehistoric_flora_jellyfish1:1:5:3","lepidodendron:prehistoric_flora_jellyfish1:1:5:2","lepidodendron:prehistoric_flora_jellyfish2:1:5:3","lepidodendron:prehistoric_flora_jellyfish2:1:5:2","lepidodendron:prehistoric_flora_jellyfish3:1:5:3","lepidodendron:prehistoric_flora_jellyfish3:1:5:2","lepidodendron:prehistoric_flora_jellyfish4:1:5:3","lepidodendron:prehistoric_flora_jellyfish4:1:5:2","lepidodendron:prehistoric_flora_jellyfish5:1:5:3","lepidodendron:prehistoric_flora_jellyfish5:1:5:2","lepidodendron:prehistoric_flora_jellyfish6:1:5:3","lepidodendron:prehistoric_flora_jellyfish6:1:5:2","lepidodendron:prehistoric_flora_jellyfish7:1:5:3","lepidodendron:prehistoric_flora_jellyfish7:1:5:2","lepidodendron:prehistoric_flora_lanceaspis:3:16:2","lepidodendron:prehistoric_flora_lungmenshanaspis:5:15:2","lepidodendron:prehistoric_flora_mcnamaraspis:4:12:3","lepidodendron:prehistoric_flora_monograptus:3:12:2","lepidodendron:prehistoric_flora_montecaris:8:27:2","lepidodendron:prehistoric_flora_onychodus:1:24:3","lepidodendron:prehistoric_flora_onychodus:1:24:2","lepidodendron:prehistoric_flora_palaeoisopus:3:21:3","lepidodendron:prehistoric_flora_palaeoisopus:3:21:2","lepidodendron:prehistoric_flora_parexus:4:75:3","lepidodendron:prehistoric_flora_parexus:4:75:2","lepidodendron:prehistoric_flora_phanerotinus:4:18:3","lepidodendron:prehistoric_flora_phanerotinus:4:18:7","lepidodendron:prehistoric_flora_poraspis:2:24:3","lepidodendron:prehistoric_flora_poraspis:2:24:2","lepidodendron:prehistoric_flora_psarolepis:1:60:3","lepidodendron:prehistoric_flora_psarolepis:1:60:2","lepidodendron:prehistoric_flora_pteraspis:4:36:3","lepidodendron:prehistoric_flora_pteraspis:4:36:2","lepidodendron:prehistoric_flora_pterygotus:1:12:3","lepidodendron:prehistoric_flora_pterygotus:1:12:2","lepidodendron:prehistoric_flora_rhenocystis:2:12:3","lepidodendron:prehistoric_flora_spiniplatyceras:3:80:3","lepidodendron:prehistoric_flora_tartuosteus:1:38:3","lepidodendron:prehistoric_flora_temperoceras:2:33:3","lepidodendron:prehistoric_flora_terataspis:2:45:3","lepidodendron:prehistoric_flora_terataspis:2:45:7","lepidodendron:prehistoric_flora_titanichthys:1:3:2","lepidodendron:prehistoric_flora_titanichthys{AgeTicks:0}:1:3:3","lepidodendron:prehistoric_flora_walliserops:5:80:3","lepidodendron:prehistoric_flora_walliserops:5:80:7","lepidodendron:prehistoric_flora_willwerathia:1:80:3"};
    public static String[] dimDevonianMobsDeadReefPF = new String[]{"lepidodendron:prehistoric_flora_antineosteus:1:11:2","lepidodendron:prehistoric_flora_archaeocidaris:8:95:7","lepidodendron:prehistoric_flora_basiloceras:2:18:2","lepidodendron:prehistoric_flora_bohemoharpes:4:80:7","lepidodendron:prehistoric_flora_cheirurus:4:80:7","lepidodendron:prehistoric_flora_cheloniellon:5:80:7","lepidodendron:prehistoric_flora_chotecops:4:80:7","lepidodendron:prehistoric_flora_crotalocephalus:4:80:7","lepidodendron:prehistoric_flora_dalmanites:4:80:7","lepidodendron:prehistoric_flora_drepanaspis:2:80:2","lepidodendron:prehistoric_flora_drotops:4:80:7","lepidodendron:prehistoric_flora_furcaster:6:100:7","lepidodendron:prehistoric_flora_gemuendina:3:80:7","lepidodendron:prehistoric_flora_harpes:4:80:7","lepidodendron:prehistoric_flora_helianthaster:2:80:3","lepidodendron:prehistoric_flora_helianthaster:2:80:7","lepidodendron:prehistoric_flora_heliopeltis:4:80:7","lepidodendron:prehistoric_flora_jellyfish1:1:10:3","lepidodendron:prehistoric_flora_jellyfish1:1:10:2","lepidodendron:prehistoric_flora_jellyfish2:1:10:3","lepidodendron:prehistoric_flora_jellyfish2:1:10:2","lepidodendron:prehistoric_flora_jellyfish3:1:10:3","lepidodendron:prehistoric_flora_jellyfish3:1:10:2","lepidodendron:prehistoric_flora_jellyfish4:1:10:3","lepidodendron:prehistoric_flora_jellyfish4:1:10:2","lepidodendron:prehistoric_flora_jellyfish5:1:10:3","lepidodendron:prehistoric_flora_jellyfish5:1:10:2","lepidodendron:prehistoric_flora_jellyfish6:1:10:3","lepidodendron:prehistoric_flora_jellyfish6:1:10:2","lepidodendron:prehistoric_flora_jellyfish7:1:10:3","lepidodendron:prehistoric_flora_jellyfish7:1:10:2","lepidodendron:prehistoric_flora_lanceaspis:4:80:2","lepidodendron:prehistoric_flora_lunaspis:3:80:2","lepidodendron:prehistoric_flora_mimetaster:9:80:3","lepidodendron:prehistoric_flora_mimetaster:9:80:2","lepidodendron:prehistoric_flora_nahecaris:3:80:2","lepidodendron:prehistoric_flora_palaeoisopus:4:80:2","lepidodendron:prehistoric_flora_panderodus:3:80:3","lepidodendron:prehistoric_flora_panderodus:3:80:2","lepidodendron:prehistoric_flora_plectodiscus:3:100:6","lepidodendron:prehistoric_flora_psychopyge:6:80:7","lepidodendron:prehistoric_flora_schinderhannes:8:80:2","lepidodendron:prehistoric_flora_spiniplatyceras:3:80:7","lepidodendron:prehistoric_flora_stensioella:8:80:2","lepidodendron:prehistoric_flora_strobilopterus:1:22:3","lepidodendron:prehistoric_flora_strobilopterus:1:22:2","lepidodendron:prehistoric_flora_terataspis:4:80:7","lepidodendron:prehistoric_flora_walliserops:4:80:7","lepidodendron:prehistoric_flora_weinbergina:4:80:7","lepidodendron:prehistoric_flora_wingertshellicus:4:80:7"};
    public static String[] dimDevonianMobsSinkholePF = new String[]{"lepidodendron:prehistoric_flora_eglonaspis:3:80:3","lepidodendron:prehistoric_flora_eglonaspis:3:80:2","lepidodendron:prehistoric_flora_gabreyaspis:3:80:3","lepidodendron:prehistoric_flora_gabreyaspis:3:80:2","lepidodendron:prehistoric_flora_hibernaspis:3:80:3","lepidodendron:prehistoric_flora_hibernaspis:3:80:2","lepidodendron:prehistoric_flora_pelurgaspis:3:80:3","lepidodendron:prehistoric_flora_pelurgaspis:3:80:2"};
    public static String[] dimDevonianMobsForestPF = new String[]{"lepidodendron:prehistoric_flora_acanthostega:3:24:3","lepidodendron:prehistoric_flora_adelophthalmus:2:15:3","lepidodendron:prehistoric_flora_attercopus:2:22:1","lepidodendron:prehistoric_flora_bothriolepis:3:15:3","lepidodendron:prehistoric_flora_cephalaspis:3:24:3","lepidodendron:prehistoric_flora_coccosteus:3:24:3","lepidodendron:prehistoric_flora_eoarthropleura:2:30:1","lepidodendron:prehistoric_flora_ericixerxes:3:14:3","lepidodendron:prehistoric_flora_eusthenopteron:2:14:3","lepidodendron:prehistoric_flora_groenlandaspis:4:45:3","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_heterosteus:1:5:3","lepidodendron:prehistoric_flora_heterosteus{AgeTicks:0}:1:5:3","lepidodendron:prehistoric_flora_hyneria:1:16:3","lepidodendron:prehistoric_flora_ichthyostega:2:22:3","lepidodendron:prehistoric_flora_laccognathus:1:9:3","lepidodendron:prehistoric_flora_osteolepis:10:45:3","lepidodendron:prehistoric_flora_pagea:2:6:3","lepidodendron:prehistoric_flora_pneumodesmus:2:30:1","lepidodendron:prehistoric_flora_pteraspis:4:18:3","lepidodendron:prehistoric_flora_scaumenacia:8:18:3","lepidodendron:prehistoric_flora_scorpion_gondwanascorpio:2:15:1","lepidodendron:prehistoric_flora_tiktaalik:1:22:3","lepidodendron:prehistoric_flora_trigonotarbid_palaeocharinus:2:15:1","lepidodendron:prehistoric_flora_turrisaspis:2:15:3"};
    public static String[] dimDevonianMobsSwampPF = new String[]{"lepidodendron:prehistoric_flora_acanthostega:3:90:3","lepidodendron:prehistoric_flora_adelophthalmus:4:70:3","lepidodendron:prehistoric_flora_cephalaspis:3:32:3","lepidodendron:prehistoric_flora_eoarthropleura:2:40:1","lepidodendron:prehistoric_flora_ericixerxes:5:36:3","lepidodendron:prehistoric_flora_eusthenopteron:2:70:3","lepidodendron:prehistoric_flora_groenlandaspis:4:60:3","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_hibbertopterus:1:34:3","lepidodendron:prehistoric_flora_hyneria:1:30:3","lepidodendron:prehistoric_flora_jaekelopterus:1:8:3","lepidodendron:prehistoric_flora_laccognathus:1:28:3","lepidodendron:prehistoric_flora_panderichthys:3:26:3","lepidodendron:prehistoric_flora_parmastega:2:26:3","lepidodendron:prehistoric_flora_parmastega:1:22:3","lepidodendron:prehistoric_flora_pneumodesmus:2:40:1","lepidodendron:prehistoric_flora_scorpion_gondwanascorpio:2:20:1","lepidodendron:prehistoric_flora_tiktaalik:1:32:3","lepidodendron:prehistoric_flora_trigonotarbid_palaeocharinus:2:20:1"};

    public static String[] dimCarboniferousMobsOceanPF = new String[]{"lepidodendron:prehistoric_flora_acanthodes:4:75:3","lepidodendron:prehistoric_flora_acanthodes:4:75:2","lepidodendron:prehistoric_flora_acrolepis:1:60:3","lepidodendron:prehistoric_flora_acrolepis:1:60:2","lepidodendron:prehistoric_flora_akmonistion:2:46:3","lepidodendron:prehistoric_flora_akmonistion:2:46:2","lepidodendron:prehistoric_flora_allenypterus:4:45:3","lepidodendron:prehistoric_flora_ammonite_goniatites:2:90:6","lepidodendron:prehistoric_flora_ammonite_goniatites:2:90:2","lepidodendron:prehistoric_flora_archaeocidaris:6:90:7","lepidodendron:prehistoric_flora_bandringa:3:38:3","lepidodendron:prehistoric_flora_belantsea:2:60:3","lepidodendron:prehistoric_flora_belantsea:2:60:6","lepidodendron:prehistoric_flora_clydagnathus:4:55:2","lepidodendron:prehistoric_flora_cobelodus:3:28:3","lepidodendron:prehistoric_flora_deltoptychius:3:55:7","lepidodendron:prehistoric_flora_dracopristis:1:15:3","lepidodendron:prehistoric_flora_dracopristis:1:15:2","lepidodendron:prehistoric_flora_edestus:2:2:3","lepidodendron:prehistoric_flora_elonichthys:8:66:3","lepidodendron:prehistoric_flora_elonichthys:8:66:2","lepidodendron:prehistoric_flora_fadenia_carboniferous:1:8:3","lepidodendron:prehistoric_flora_fadenia_carboniferous:1:8:2","lepidodendron:prehistoric_flora_falcatus:3:40:3","lepidodendron:prehistoric_flora_gyracanthides:3:38:3","lepidodendron:prehistoric_flora_gyracanthides:3:38:2","lepidodendron:prehistoric_flora_iniopteryx:6:52:3","lepidodendron:prehistoric_flora_janassa:8:50:3","lepidodendron:prehistoric_flora_janassa:8:50:7","lepidodendron:prehistoric_flora_jellyfish1:1:5:3","lepidodendron:prehistoric_flora_jellyfish1:1:5:2","lepidodendron:prehistoric_flora_jellyfish2:1:5:3","lepidodendron:prehistoric_flora_jellyfish2:1:5:2","lepidodendron:prehistoric_flora_jellyfish3:1:5:3","lepidodendron:prehistoric_flora_jellyfish3:1:5:2","lepidodendron:prehistoric_flora_jellyfish4:1:5:3","lepidodendron:prehistoric_flora_jellyfish4:1:5:2","lepidodendron:prehistoric_flora_jellyfish5:1:5:3","lepidodendron:prehistoric_flora_jellyfish5:1:5:2","lepidodendron:prehistoric_flora_jellyfish6:1:5:3","lepidodendron:prehistoric_flora_jellyfish6:1:5:2","lepidodendron:prehistoric_flora_jellyfish7:1:5:3","lepidodendron:prehistoric_flora_jellyfish7:1:5:2","lepidodendron:prehistoric_flora_listracanthus:2:42:2","lepidodendron:prehistoric_flora_mooreoceras:2:42:2","lepidodendron:prehistoric_flora_ornithoprion:6:59:3","lepidodendron:prehistoric_flora_ornithoprion:6:59:2","lepidodendron:prehistoric_flora_orodus:1:34:3","lepidodendron:prehistoric_flora_orodus:1:34:2","lepidodendron:prehistoric_flora_paratarrasius:3:62:3","lepidodendron:prehistoric_flora_phanerotinus:2:46:3","lepidodendron:prehistoric_flora_phanerotinus:2:36:7","lepidodendron:prehistoric_flora_platysomus:9:32:3","lepidodendron:prehistoric_flora_rayonnoceras:2:8:2","lepidodendron:prehistoric_flora_rayonnoceras:2:44:3","lepidodendron:prehistoric_flora_saivodus:2:2:3","lepidodendron:prehistoric_flora_saivodus:2:2:2","lepidodendron:prehistoric_flora_squatinactis:2:58:3","lepidodendron:prehistoric_flora_syllipsimopodi:4:80:3","lepidodendron:prehistoric_flora_traquairius:3:70:7","lepidodendron:prehistoric_flora_tullimonstrum:4:40:3","lepidodendron:prehistoric_flora_tyrannophontes:4:45:3","lepidodendron:prehistoric_flora_vestinautilus:4:76:3","lepidodendron:prehistoric_flora_vestinautilus:4:76:2"};
    public static String[] dimCarboniferousMobsOceanCliffPF = new String[]{"lepidodendron:prehistoric_flora_acanthodes:4:75:3","lepidodendron:prehistoric_flora_acanthodes:4:75:2","lepidodendron:prehistoric_flora_acrolepis:1:60:3","lepidodendron:prehistoric_flora_acrolepis:1:60:2","lepidodendron:prehistoric_flora_akmonistion:2:46:3","lepidodendron:prehistoric_flora_akmonistion:2:46:2","lepidodendron:prehistoric_flora_ammonite_goniatites:2:90:2","lepidodendron:prehistoric_flora_ammonite_goniatites:2:90:6","lepidodendron:prehistoric_flora_archaeocidaris:6:90:7","lepidodendron:prehistoric_flora_bandringa:3:38:ERROR","lepidodendron:prehistoric_flora_belantsea:2:60:3","lepidodendron:prehistoric_flora_belantsea:2:60:6","lepidodendron:prehistoric_flora_clydagnathus:4:55:4","lepidodendron:prehistoric_flora_deltoptychius:3:55:3","lepidodendron:prehistoric_flora_dracopristis:1:15:3","lepidodendron:prehistoric_flora_dracopristis:1:15:2","lepidodendron:prehistoric_flora_edestus:2:2:3","lepidodendron:prehistoric_flora_elonichthys:8:66:3","lepidodendron:prehistoric_flora_elonichthys:8:66:2","lepidodendron:prehistoric_flora_fadenia_carboniferous:1:8:3","lepidodendron:prehistoric_flora_fadenia_carboniferous:1:8:2","lepidodendron:prehistoric_flora_falcatus:3:40:3","lepidodendron:prehistoric_flora_gyracanthides:3:38:3","lepidodendron:prehistoric_flora_gyracanthides:3:38:2","lepidodendron:prehistoric_flora_iniopteryx:6:52:3","lepidodendron:prehistoric_flora_jellyfish1:1:5:3","lepidodendron:prehistoric_flora_jellyfish1:1:5:2","lepidodendron:prehistoric_flora_jellyfish2:1:5:3","lepidodendron:prehistoric_flora_jellyfish2:1:5:2","lepidodendron:prehistoric_flora_jellyfish3:1:5:3","lepidodendron:prehistoric_flora_jellyfish3:1:5:2","lepidodendron:prehistoric_flora_jellyfish4:1:5:3","lepidodendron:prehistoric_flora_jellyfish4:1:5:2","lepidodendron:prehistoric_flora_jellyfish5:1:5:3","lepidodendron:prehistoric_flora_jellyfish5:1:5:2","lepidodendron:prehistoric_flora_jellyfish6:1:5:3","lepidodendron:prehistoric_flora_jellyfish6:1:5:2","lepidodendron:prehistoric_flora_jellyfish7:1:5:3","lepidodendron:prehistoric_flora_jellyfish7:1:5:2","lepidodendron:prehistoric_flora_listracanthus:2:42:2","lepidodendron:prehistoric_flora_mooreoceras:2:42:2","lepidodendron:prehistoric_flora_ornithoprion:6:59:3","lepidodendron:prehistoric_flora_ornithoprion:6:59:2","lepidodendron:prehistoric_flora_orodus:1:34:3","lepidodendron:prehistoric_flora_orodus:1:34:2","lepidodendron:prehistoric_flora_paratarrasius:3:62:3","lepidodendron:prehistoric_flora_phanerotinus:2:46:3","lepidodendron:prehistoric_flora_phanerotinus:2:36:7","lepidodendron:prehistoric_flora_platysomus:9:32:3","lepidodendron:prehistoric_flora_rayonnoceras:2:8:3","lepidodendron:prehistoric_flora_rayonnoceras:2:44:2","lepidodendron:prehistoric_flora_saivodus:2:2:3","lepidodendron:prehistoric_flora_saivodus:2:2:2","lepidodendron:prehistoric_flora_squatinactis:2:58:3","lepidodendron:prehistoric_flora_syllipsimopodi:4:80:3","lepidodendron:prehistoric_flora_traquairius:3:70:7","lepidodendron:prehistoric_flora_tyrannophontes:4:45:3","lepidodendron:prehistoric_flora_vestinautilus:4:76:3","lepidodendron:prehistoric_flora_vestinautilus:4:76:2"};
    public static String[] dimCarboniferousMobsSwampPF = new String[]{"lepidodendron:prehistoric_flora_acanthodes:8:80:3","lepidodendron:prehistoric_flora_acrolepis:1:27:3","lepidodendron:prehistoric_flora_adelophthalmus:1:21:3","lepidodendron:prehistoric_flora_allenypterus:6:80:3","lepidodendron:prehistoric_flora_amphibamus:2:54:3","lepidodendron:prehistoric_flora_anthracomedusa:2:30:3","lepidodendron:prehistoric_flora_archoblattina:5:6:1","lepidodendron:prehistoric_flora_balanerpeton:2:54:3","lepidodendron:prehistoric_flora_bandringa:3:38:3","lepidodendron:prehistoric_flora_barameda:3:22:3","lepidodendron:prehistoric_flora_casineria:2:36:1","lepidodendron:prehistoric_flora_crassigyrinus:1:30:3","lepidodendron:prehistoric_flora_diplocaulus:4:45:3","lepidodendron:prehistoric_flora_gephyrostegus:1:80:3","lepidodendron:prehistoric_flora_gerarus:2:26:1","lepidodendron:prehistoric_flora_greererpeton:2:36:3","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_helenodora:1:33:1","lepidodendron:prehistoric_flora_hibbertopterus:1:21:3","lepidodendron:prehistoric_flora_hylonomus:2:36:1","lepidodendron:prehistoric_flora_limnoscelis:1:59:3","lepidodendron:prehistoric_flora_megalocephalus:1:27:3","lepidodendron:prehistoric_flora_meganeura:2:21:1","lepidodendron:prehistoric_flora_megarachne:2:21:3","lepidodendron:prehistoric_flora_ophiacodon:1:24:1","lepidodendron:prehistoric_flora_palaeodictyoptera_delitzschala:2:28:1","lepidodendron:prehistoric_flora_palaeodictyoptera_homaloneura:2:28:1","lepidodendron:prehistoric_flora_palaeodictyoptera_homoioptera:2:28:1","lepidodendron:prehistoric_flora_palaeodictyoptera_lithomantis:2:28:1","lepidodendron:prehistoric_flora_palaeodictyoptera_lycocercus:2:28:1","lepidodendron:prehistoric_flora_palaeodictyoptera_mazothairos:2:28:1","lepidodendron:prehistoric_flora_palaeodictyoptera_sinodunbaria:2:28:1","lepidodendron:prehistoric_flora_palaeodictyoptera_stenodictya:2:28:1","lepidodendron:prehistoric_flora_paratarrasius:4:60:3","lepidodendron:prehistoric_flora_pederpes:3:42:3","lepidodendron:prehistoric_flora_phlegethontia:1:51:3","lepidodendron:prehistoric_flora_pholiderpeton:1:3:3","lepidodendron:prehistoric_flora_platysomus:2:80:3","lepidodendron:prehistoric_flora_proterogyrinus:2:24:3","lepidodendron:prehistoric_flora_protozygoptera:1:10:1","lepidodendron:prehistoric_flora_remigiomontanus:4:16:1","lepidodendron:prehistoric_flora_rhizodus:1:24:3","lepidodendron:prehistoric_flora_roachoid_swamp:5:30:1","lepidodendron:prehistoric_flora_scorpion_gigantoscorpio:1:30:1","lepidodendron:prehistoric_flora_scorpion_opsieobuthus:1:30:1","lepidodendron:prehistoric_flora_scorpion_pulmonoscorpius:1:30:1","lepidodendron:prehistoric_flora_snail_land:3:39:1","lepidodendron:prehistoric_flora_spathicephalus:1:27:3","lepidodendron:prehistoric_flora_sphenacodon:1:18:1","lepidodendron:prehistoric_flora_spinoaequalis:3:12:5","lepidodendron:prehistoric_flora_trigonotarbid_cryptomartus:2:45:1","lepidodendron:prehistoric_flora_trigonotarbid_eophrynus:2:45:1","lepidodendron:prehistoric_flora_trigonotarbid_kreischeria:2:45:1","lepidodendron:prehistoric_flora_tullimonstrum:1:21:3","lepidodendron:prehistoric_flora_whatcheeria:2:40:3","lepidodendron:prehistoric_flora_xenacanthus:1:36:3"};
    public static String[] dimCarboniferousMobsBurntSwampPF = new String[]{"lepidodendron:prehistoric_flora_acanthodes:8:80:3","lepidodendron:prehistoric_flora_acrolepis:1:27:3","lepidodendron:prehistoric_flora_adelophthalmus::20:3","lepidodendron:prehistoric_flora_allenypterus:3:80:3","lepidodendron:prehistoric_flora_archoblattina:6:6:1","lepidodendron:prehistoric_flora_arthropleura:5:42:1","lepidodendron:prehistoric_flora_casineria:1:36:1","lepidodendron:prehistoric_flora_datheosaurus:2:12:1","lepidodendron:prehistoric_flora_gerarus:1:26:1","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_helenodora:2:62:1","lepidodendron:prehistoric_flora_hylonomus:3:36:1","lepidodendron:prehistoric_flora_meganeura:2:50:1","lepidodendron:prehistoric_flora_megarachne:2:21:3","lepidodendron:prehistoric_flora_palaeodictyoptera_delitzschala:2:20:1","lepidodendron:prehistoric_flora_palaeodictyoptera_homaloneura:2:20:1","lepidodendron:prehistoric_flora_palaeodictyoptera_homoioptera:2:20:1","lepidodendron:prehistoric_flora_palaeodictyoptera_lithomantis:2:20:1","lepidodendron:prehistoric_flora_palaeodictyoptera_lycocercus:2:20:1","lepidodendron:prehistoric_flora_palaeodictyoptera_mazothairos:2:20:1","lepidodendron:prehistoric_flora_palaeodictyoptera_sinodunbaria:2:20:1","lepidodendron:prehistoric_flora_palaeodictyoptera_stenodictya:2:20:1","lepidodendron:prehistoric_flora_platysomus:2:80:3","lepidodendron:prehistoric_flora_protozygoptera:3:100:1","lepidodendron:prehistoric_flora_roachoid_swamp:5:30:1","lepidodendron:prehistoric_flora_scorpion_gigantoscorpio:1:30:1","lepidodendron:prehistoric_flora_scorpion_opsieobuthus:1:30:1","lepidodendron:prehistoric_flora_scorpion_pulmonoscorpius:1:30:1","lepidodendron:prehistoric_flora_snail_land:3:39:1","lepidodendron:prehistoric_flora_spinoaequalis:3:12:1","lepidodendron:prehistoric_flora_trigonotarbid_cryptomartus:2:45:1","lepidodendron:prehistoric_flora_trigonotarbid_eophrynus:2:45:1","lepidodendron:prehistoric_flora_trigonotarbid_kreischeria:2:45:1"};
    public static String[] dimCarboniferousMobsMarshPF = new String[]{"lepidodendron:prehistoric_flora_acanthodes:8:69:3","lepidodendron:prehistoric_flora_acrolepis:1:57:3","lepidodendron:prehistoric_flora_adelophthalmus:3:50:3","lepidodendron:prehistoric_flora_archoblattina:5:36:1","lepidodendron:prehistoric_flora_branchiosaur:2:64:3","lepidodendron:prehistoric_flora_casineria:2:36:1","lepidodendron:prehistoric_flora_gerarus:2:56:1","lepidodendron:prehistoric_flora_greererpeton:1:54:3","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_helenodora:1:59:1","lepidodendron:prehistoric_flora_hylonomus:2:66:1","lepidodendron:prehistoric_flora_megalocephalus:1:57:3","lepidodendron:prehistoric_flora_meganeura:2:45:1","lepidodendron:prehistoric_flora_megarachne:2:51:3","lepidodendron:prehistoric_flora_palaeodictyoptera_delitzschala:2:10:1","lepidodendron:prehistoric_flora_palaeodictyoptera_homaloneura:2:10:1","lepidodendron:prehistoric_flora_palaeodictyoptera_homoioptera:2:10:1","lepidodendron:prehistoric_flora_palaeodictyoptera_lithomantis:2:10:1","lepidodendron:prehistoric_flora_palaeodictyoptera_lycocercus:2:10:1","lepidodendron:prehistoric_flora_palaeodictyoptera_mazothairos:2:10:1","lepidodendron:prehistoric_flora_palaeodictyoptera_sinodunbaria:2:10:1","lepidodendron:prehistoric_flora_palaeodictyoptera_stenodictya:2:10:1","lepidodendron:prehistoric_flora_paratarrasius:6:72:3","lepidodendron:prehistoric_flora_platysomus:2:80:3","lepidodendron:prehistoric_flora_protozygoptera:3:100:1","lepidodendron:prehistoric_flora_roachoid_swamp:5:30:1","lepidodendron:prehistoric_flora_scorpion_gigantoscorpio:1:30:1","lepidodendron:prehistoric_flora_scorpion_opsieobuthus:1:30:1","lepidodendron:prehistoric_flora_scorpion_pulmonoscorpius:1:30:1","lepidodendron:prehistoric_flora_snail_land:3:39:1","lepidodendron:prehistoric_flora_spathicephalus:1:57:3","lepidodendron:prehistoric_flora_spinoaequalis:3:12:1","lepidodendron:prehistoric_flora_trigonotarbid_cryptomartus:2:45:1","lepidodendron:prehistoric_flora_trigonotarbid_eophrynus:2:45:1","lepidodendron:prehistoric_flora_trigonotarbid_kreischeria:2:45:1","lepidodendron:prehistoric_flora_tullimonstrum:1:41:3","lepidodendron:prehistoric_flora_urocordylus:5:52:3","lepidodendron:prehistoric_flora_xenacanthus:1:56:3"};
    public static String[] dimCarboniferousMobsHillsPF = new String[]{"lepidodendron:prehistoric_flora_branchiosaur:2:54:3","lepidodendron:prehistoric_flora_casineria:2:36:1","lepidodendron:prehistoric_flora_datheosaurus:1:28:1","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_hylonomus:2:36:1","lepidodendron:prehistoric_flora_ophiacodon:1:24:1","lepidodendron:prehistoric_flora_palaeodictyoptera_delitzschala:2:5:1","lepidodendron:prehistoric_flora_palaeodictyoptera_homaloneura:2:5:1","lepidodendron:prehistoric_flora_palaeodictyoptera_homoioptera:2:5:1","lepidodendron:prehistoric_flora_palaeodictyoptera_lithomantis:2:5:1","lepidodendron:prehistoric_flora_palaeodictyoptera_lycocercus:2:5:1","lepidodendron:prehistoric_flora_palaeodictyoptera_mazothairos:2:5:1","lepidodendron:prehistoric_flora_palaeodictyoptera_sinodunbaria:2:5:1","lepidodendron:prehistoric_flora_palaeodictyoptera_stenodictya:2:5:1","lepidodendron:prehistoric_flora_protozygoptera:1:100:1","lepidodendron:prehistoric_flora_remigiomontanus:4:46:1","lepidodendron:prehistoric_flora_roachoid_forest:5:30:1","lepidodendron:prehistoric_flora_scorpion_gigantoscorpio:1:30:1","lepidodendron:prehistoric_flora_scorpion_opsieobuthus:1:30:1","lepidodendron:prehistoric_flora_scorpion_pulmonoscorpius:1:30:1","lepidodendron:prehistoric_flora_sphenacodon:1:18:1","lepidodendron:prehistoric_flora_spinoaequalis:3:12:5","lepidodendron:prehistoric_flora_trigonotarbid_cryptomartus:2:45:1","lepidodendron:prehistoric_flora_trigonotarbid_eophrynus:2:45:1","lepidodendron:prehistoric_flora_trigonotarbid_kreischeria:2:45:1"};
    public static String[] dimCarboniferousMobsIcePF = new String[]{"lepidodendron:prehistoric_flora_antarcticarcinus:3:50:3"};

    public static String[] dimPermianMobsOceanPF = new String[]{"lepidodendron:prehistoric_flora_acanthodes:4:66:3","lepidodendron:prehistoric_flora_acanthodes:4:66:2","lepidodendron:prehistoric_flora_acrolepis:1:36:2","lepidodendron:prehistoric_flora_ammonite_cylolobus:2:90:3","lepidodendron:prehistoric_flora_ammonite_cylolobus:2:90:2","lepidodendron:prehistoric_flora_ammonite_elephantoceras:2:70:3","lepidodendron:prehistoric_flora_ammonite_elephantoceras:2:70:2","lepidodendron:prehistoric_flora_ammonite_goniatites:2:90:3","lepidodendron:prehistoric_flora_ammonite_goniatites:2:90:2","lepidodendron:prehistoric_flora_archaeocidaris:6:90:7","lepidodendron:prehistoric_flora_bobasatrania:5:45:3","lepidodendron:prehistoric_flora_claudiosaurus:6:8:1","lepidodendron:prehistoric_flora_claudiosaurus:2:10:3","lepidodendron:prehistoric_flora_coelacanthus:3:54:3","lepidodendron:prehistoric_flora_coelacanthus:3:54:2","lepidodendron:prehistoric_flora_cooperoceras:3:84:3","lepidodendron:prehistoric_flora_cooperoceras:2:84:2","lepidodendron:prehistoric_flora_dorypterus:10:65:3","lepidodendron:prehistoric_flora_dorypterus:10:65:2","lepidodendron:prehistoric_flora_ebenaqua:15:51:3","lepidodendron:prehistoric_flora_ebenaqua:15:61:2","lepidodendron:prehistoric_flora_elonichthys:8:66:3","lepidodendron:prehistoric_flora_elonichthys:8:66:2","lepidodendron:prehistoric_flora_eosaurichthys:4:65:3","lepidodendron:prehistoric_flora_eosaurichthys:4:65:2","lepidodendron:prehistoric_flora_fadenia_permotriassic:1:4:3","lepidodendron:prehistoric_flora_fadenia_permotriassic:1:4:2","lepidodendron:prehistoric_flora_helicoprion:1:2:3","lepidodendron:prehistoric_flora_helicoprion:1:2:2","lepidodendron:prehistoric_flora_janassa:8:50:7","lepidodendron:prehistoric_flora_jellyfish1:1:3:3","lepidodendron:prehistoric_flora_jellyfish1:1:3:2","lepidodendron:prehistoric_flora_jellyfish2:1:3:3","lepidodendron:prehistoric_flora_jellyfish2:1:3:2","lepidodendron:prehistoric_flora_jellyfish3:1:3:3","lepidodendron:prehistoric_flora_jellyfish3:1:3:2","lepidodendron:prehistoric_flora_jellyfish4:1:3:3","lepidodendron:prehistoric_flora_jellyfish4:1:3:2","lepidodendron:prehistoric_flora_jellyfish5:1:3:3","lepidodendron:prehistoric_flora_jellyfish5:1:3:2","lepidodendron:prehistoric_flora_jellyfish6:1:3:3","lepidodendron:prehistoric_flora_jellyfish6:1:3:2","lepidodendron:prehistoric_flora_jellyfish7:1:3:3","lepidodendron:prehistoric_flora_jellyfish7:1:3:2","lepidodendron:prehistoric_flora_kaibabvenator:2:4:2","lepidodendron:prehistoric_flora_listracanthus:2:11:2","lepidodendron:prehistoric_flora_menaspis:8:66:3","lepidodendron:prehistoric_flora_menaspis:8:66:2","lepidodendron:prehistoric_flora_mooreoceras:2:70:2","lepidodendron:prehistoric_flora_nipponomaria:3:60:7","lepidodendron:prehistoric_flora_palaeoniscum:8:80:3","lepidodendron:prehistoric_flora_palaeoniscum:8:80:2","lepidodendron:prehistoric_flora_platysomus:8:66:3","lepidodendron:prehistoric_flora_platysomus:8:66:2","lepidodendron:prehistoric_flora_pygopterus:1:36:3"};
    public static String[] dimPermianMobsOceanCliffPF = new String[]{"lepidodendron:prehistoric_flora_acanthodes:4:66:3","lepidodendron:prehistoric_flora_acanthodes:4:66:2","lepidodendron:prehistoric_flora_acrolepis:1:36:2","lepidodendron:prehistoric_flora_ammonite_cylolobus:2:90:3","lepidodendron:prehistoric_flora_ammonite_cylolobus:2:90:2","lepidodendron:prehistoric_flora_ammonite_elephantoceras:2:70:3","lepidodendron:prehistoric_flora_ammonite_elephantoceras:2:70:2","lepidodendron:prehistoric_flora_ammonite_goniatites:2:90:3","lepidodendron:prehistoric_flora_ammonite_goniatites:2:90:2","lepidodendron:prehistoric_flora_archaeocidaris:6:90:7","lepidodendron:prehistoric_flora_bobasatrania:5:45:3","lepidodendron:prehistoric_flora_claudiosaurus:6:80:3","lepidodendron:prehistoric_flora_claudiosaurus:2:10:1","lepidodendron:prehistoric_flora_coelacanthus:3:54:3","lepidodendron:prehistoric_flora_coelacanthus:3:54:2","lepidodendron:prehistoric_flora_cooperoceras:3:84:3","lepidodendron:prehistoric_flora_cooperoceras:2:84:2","lepidodendron:prehistoric_flora_dorypterus:10:65:3","lepidodendron:prehistoric_flora_dorypterus:10:65:2","lepidodendron:prehistoric_flora_ebenaqua:15:51:3","lepidodendron:prehistoric_flora_ebenaqua:15:61:2","lepidodendron:prehistoric_flora_elonichthys:8:66:3","lepidodendron:prehistoric_flora_elonichthys:8:66:2","lepidodendron:prehistoric_flora_fadenia_permotriassic:1:4:3","lepidodendron:prehistoric_flora_fadenia_permotriassic:1:4:2","lepidodendron:prehistoric_flora_helicoprion:1:2:3","lepidodendron:prehistoric_flora_helicoprion:1:2:2","lepidodendron:prehistoric_flora_janassa:8:50:7","lepidodendron:prehistoric_flora_jellyfish1:1:3:3","lepidodendron:prehistoric_flora_jellyfish1:1:3:2","lepidodendron:prehistoric_flora_jellyfish2:1:3:3","lepidodendron:prehistoric_flora_jellyfish2:1:3:2","lepidodendron:prehistoric_flora_jellyfish3:1:3:3","lepidodendron:prehistoric_flora_jellyfish3:1:3:2","lepidodendron:prehistoric_flora_jellyfish4:1:3:3","lepidodendron:prehistoric_flora_jellyfish4:1:3:2","lepidodendron:prehistoric_flora_jellyfish5:1:3:3","lepidodendron:prehistoric_flora_jellyfish5:1:3:2","lepidodendron:prehistoric_flora_jellyfish6:1:3:3","lepidodendron:prehistoric_flora_jellyfish6:1:3:2","lepidodendron:prehistoric_flora_jellyfish7:1:3:3","lepidodendron:prehistoric_flora_jellyfish7:1:3:2","lepidodendron:prehistoric_flora_kaibabvenator:2:4:2","lepidodendron:prehistoric_flora_listracanthus:2:11:2","lepidodendron:prehistoric_flora_megactenopetalus:2:52:3","lepidodendron:prehistoric_flora_megactenopetalus:2:52:2","lepidodendron:prehistoric_flora_menaspis:8:66:3","lepidodendron:prehistoric_flora_menaspis:8:66:2","lepidodendron:prehistoric_flora_mesosaurus:2:10:1","lepidodendron:prehistoric_flora_mesosaurus:2:10:3","lepidodendron:prehistoric_flora_mooreoceras:2:40:2","lepidodendron:prehistoric_flora_nipponomaria:3:60:7","lepidodendron:prehistoric_flora_palaeoniscum:8:80:2","lepidodendron:prehistoric_flora_palaeoniscum:8:80:3","lepidodendron:prehistoric_flora_palaeoniscum:8:50:2","lepidodendron:prehistoric_flora_palaeoniscum:8:50:3","lepidodendron:prehistoric_flora_platysomus:8:66:3","lepidodendron:prehistoric_flora_platysomus:8:66:2","lepidodendron:prehistoric_flora_pygopterus:1:36:3"};
    public static String[] dimPermianMobsRiverPF = new String[]{"lepidodendron:prehistoric_flora_acanthodes:4:35:3","lepidodendron:prehistoric_flora_acanthodes:4:35:2","lepidodendron:prehistoric_flora_acrolepis:1:25:3","lepidodendron:prehistoric_flora_barbclabornia:1:20:3","lepidodendron:prehistoric_flora_barbclabornia:1:20:2","lepidodendron:prehistoric_flora_blourugia:4:35:3","lepidodendron:prehistoric_flora_blourugia:4:35:2","lepidodendron:prehistoric_flora_brachydectes:1:9:3","lepidodendron:prehistoric_flora_cobelodus:4:25:3","lepidodendron:prehistoric_flora_gnathorhiza:4:25:3","lepidodendron:prehistoric_flora_gnathorhiza:4:25:2","lepidodendron:prehistoric_flora_lebachacanthus:1:6:3","lepidodendron:prehistoric_flora_lebachacanthus:1:6:2","lepidodendron:prehistoric_flora_lysorophus:1:9:3","lepidodendron:prehistoric_flora_melosaurus:2:10:3","lepidodendron:prehistoric_flora_melosaurus:2:10:2","lepidodendron:prehistoric_flora_nagini:1:9:3","lepidodendron:prehistoric_flora_orodus:1:3:3","lepidodendron:prehistoric_flora_orodus:1:3:2","lepidodendron:prehistoric_flora_pygopterus:1:80:2","lepidodendron:prehistoric_flora_urosthenes:5:25:3","lepidodendron:prehistoric_flora_varialepis:4:25:3","lepidodendron:prehistoric_flora_varialepis:4:25:2"};
    public static String[] dimPermianMobsAridLandsPF = new String[]{"lepidodendron:prehistoric_flora_acrolepis:1:10:3","lepidodendron:prehistoric_flora_anteosaurus:2:-2:1","lepidodendron:prehistoric_flora_aulacephalodon:5:4:1","lepidodendron:prehistoric_flora_blourugia:4:45:3","lepidodendron:prehistoric_flora_diictodon:6:3:1","lepidodendron:prehistoric_flora_endothiodon:4:4:1","lepidodendron:prehistoric_flora_euchambersia:6:3:1","lepidodendron:prehistoric_flora_eunotosaurus:1:3:1","lepidodendron:prehistoric_flora_gnathorhiza:2:65:3","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_lystrosaurus:6:14:1","lepidodendron:prehistoric_flora_moschops:6:7:1","lepidodendron:prehistoric_flora_platysomus:4:55:3","lepidodendron:prehistoric_flora_pristerognathus:4:8:1","lepidodendron:prehistoric_flora_proburnetia:2:1:1","lepidodendron:prehistoric_flora_procynosuchus:5:2:1","lepidodendron:prehistoric_flora_protorosaurus:2:2:1","lepidodendron:prehistoric_flora_rautiania:4:22:5","lepidodendron:prehistoric_flora_rautiania:4:1:1","lepidodendron:prehistoric_flora_roachoid_arid:5:4:1","lepidodendron:prehistoric_flora_sauroctonus:2:-2:1","lepidodendron:prehistoric_flora_scorpion_opsieobuthus:1:20:1","lepidodendron:prehistoric_flora_tapinocephalus:4:3:1","lepidodendron:prehistoric_flora_trigonotarbid_permotarbus:2:15:1","lepidodendron:prehistoric_flora_uranocentrodon:2:36:3","lepidodendron:prehistoric_flora_urosthenes:5:30:3"};
    public static String[] dimPermianMobsDesertPF = new String[]{"lepidodendron:prehistoric_flora_archosaurus:2:3:1","lepidodendron:prehistoric_flora_bunostegos:4:3:1","lepidodendron:prehistoric_flora_captorhinus:3:4:1","lepidodendron:prehistoric_flora_dvinia:5:3:1","lepidodendron:prehistoric_flora_dvinosaurus:2:28:1","lepidodendron:prehistoric_flora_gnathorhiza:2:85:3","lepidodendron:prehistoric_flora_gnathorhiza:4:95:3","lepidodendron:prehistoric_flora_inostrancevia:2:-1:1","lepidodendron:prehistoric_flora_proburnetia:2:1:1","lepidodendron:prehistoric_flora_prosictodon:6:3:1","lepidodendron:prehistoric_flora_purlovia:4:3:1","lepidodendron:prehistoric_flora_roachoid_arid:5:15:1","lepidodendron:prehistoric_flora_scorpion_opsieobuthus:1:15:1","lepidodendron:prehistoric_flora_scutosaurus:6:3:1","lepidodendron:prehistoric_flora_varialepis:4:100:ERROR","lepidodendron:prehistoric_flora_vivaxosaurus:5:3:1"};
    public static String[] dimPermianMobsFloodbasaltPF = new String[0];
    public static String[] dimPermianMobsGlossopterisPF = new String[]{"lepidodendron:prehistoric_flora_acanthodes:4:68:3","lepidodendron:prehistoric_flora_acanthodes:4:68:2","lepidodendron:prehistoric_flora_acrolepis:1:88:ERROR","lepidodendron:prehistoric_flora_adelopthalmus:3:60:3","lepidodendron:prehistoric_flora_adelopthalmus:3:60:2","lepidodendron:prehistoric_flora_antarcticarcinus:10:54:3","lepidodendron:prehistoric_flora_antarcticarcinus:2:54:2","lepidodendron:prehistoric_flora_coelacanthus:3:33:3","lepidodendron:prehistoric_flora_coelacanthus:3:33:2","lepidodendron:prehistoric_flora_coelurosauravus:4:22:1","lepidodendron:prehistoric_flora_coelurosauravus:4:1:5","lepidodendron:prehistoric_flora_gorgonops:2:-4:1","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_lebachacanthus:1:70:2","lepidodendron:prehistoric_flora_lystrosaurus:6:4:1","lepidodendron:prehistoric_flora_mesosaurus:8:38:3","lepidodendron:prehistoric_flora_moschops:4:8:1","lepidodendron:prehistoric_flora_palaeontinid:2:28:1","lepidodendron:prehistoric_flora_paranaichthys:8:78:3","lepidodendron:prehistoric_flora_paranaichthys:8:78:2","lepidodendron:prehistoric_flora_protozygoptera:1:100:1","lepidodendron:prehistoric_flora_pygopterus:1:88:3","lepidodendron:prehistoric_flora_roachoid_forest:5:4:1","lepidodendron:prehistoric_flora_rubidgea:1:-1:1","lepidodendron:prehistoric_flora_snail_land:3:39:1","lepidodendron:prehistoric_flora_tiarajudens:3:11:1","lepidodendron:prehistoric_flora_trigonotarbid_permotarbus:2:15:1"};
    public static String[] dimPermianMobsLowlandsPF = new String[]{"lepidodendron:prehistoric_flora_acanthodes:4:88:3","lepidodendron:prehistoric_flora_acrolepis:1:74:ERROR","lepidodendron:prehistoric_flora_archosaurus:2:15:1","lepidodendron:prehistoric_flora_brachydectes:1:54:3","lepidodendron:prehistoric_flora_cacops:3:20:3","lepidodendron:prehistoric_flora_coelacanthus:3:34:3","lepidodendron:prehistoric_flora_cotylorhynchus:2:8:1","lepidodendron:prehistoric_flora_datheosaurus:2:12:1","lepidodendron:prehistoric_flora_dimetrodon:2:-6:1","lepidodendron:prehistoric_flora_diplocaulus:2:49:3","lepidodendron:prehistoric_flora_diploceraspis:3:49:3","lepidodendron:prehistoric_flora_eosimops:4:10:1","lepidodendron:prehistoric_flora_eryops:2:32:3","lepidodendron:prehistoric_flora_eunotosaurus:1:27:1","lepidodendron:prehistoric_flora_gnathorhiza:2:65:3","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_jonkeria:2:2:1","lepidodendron:prehistoric_flora_lebachacanthus:2:30:3","lepidodendron:prehistoric_flora_lebachacanthus:1:30:2","lepidodendron:prehistoric_flora_lysorophus:1:54:3","lepidodendron:prehistoric_flora_moschops:6:7:1","lepidodendron:prehistoric_flora_nagini:1:14:3","lepidodendron:prehistoric_flora_palaeodictyoptera_dunbaria:4:4:1","lepidodendron:prehistoric_flora_pantylus:3:20:3","lepidodendron:prehistoric_flora_paranaichthys:2:62:3","lepidodendron:prehistoric_flora_platysomus:8:48:3","lepidodendron:prehistoric_flora_prionosuchus:2:3:3","lepidodendron:prehistoric_flora_procynosuchus:5:4:1","lepidodendron:prehistoric_flora_protorosaurus:2:2:1","lepidodendron:prehistoric_flora_protozygoptera:1:100:1","lepidodendron:prehistoric_flora_roachoid_arid:5:4:1","lepidodendron:prehistoric_flora_roachoid_swamp:5:4:1","lepidodendron:prehistoric_flora_scorpion_opsieobuthus:1:20:1","lepidodendron:prehistoric_flora_snail_land:3:39:1","lepidodendron:prehistoric_flora_tapinocephalus:6:7:1","lepidodendron:prehistoric_flora_trigonotarbid_permotarbus:2:15:1","lepidodendron:prehistoric_flora_urosthenes:5:72:3"};
    public static String[] dimPermianMobsLowlandForestPF = new String[]{"lepidodendron:prehistoric_flora_acanthodes:4:58:3","lepidodendron:prehistoric_flora_adelopthalmus:3:72:3","lepidodendron:prehistoric_flora_ascendonanus:2:9:1","lepidodendron:prehistoric_flora_ctenospondylus:1:1:1","lepidodendron:prehistoric_flora_dasyceps:2:47:3","lepidodendron:prehistoric_flora_diadectes:4:8:1","lepidodendron:prehistoric_flora_elginia:6:6:1","lepidodendron:prehistoric_flora_gnathorhiza:2:45:3","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_labidosaurus:3:6:1","lepidodendron:prehistoric_flora_palaeontinid:4:40:1","lepidodendron:prehistoric_flora_palaeontinid:10:38:5","lepidodendron:prehistoric_flora_platysomus:8:68:3","lepidodendron:prehistoric_flora_protozygoptera:1:100:1","lepidodendron:prehistoric_flora_roachoid_forest:5:4:1","lepidodendron:prehistoric_flora_scorpion_opsieobuthus:1:20:1","lepidodendron:prehistoric_flora_snail_land:3:39:1","lepidodendron:prehistoric_flora_suminia:8:20:5","lepidodendron:prehistoric_flora_tetraceratops:5:25:1","lepidodendron:prehistoric_flora_trigonotarbid_permotarbus:2:15:1","lepidodendron:prehistoric_flora_urosthenes:3:70:3","lepidodendron:prehistoric_flora_weigeltisaurus:4:22:5","lepidodendron:prehistoric_flora_weigeltisaurus:4:1:1"};
    public static String[] dimPermianMobsHighlandsPF = new String[]{"lepidodendron:prehistoric_flora_acanthodes:4:40:3","lepidodendron:prehistoric_flora_antarcticarcinus:2:80:3","lepidodendron:prehistoric_flora_gorgonops:2:-2:1","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_lystrosaurus:6:14:1","lepidodendron:prehistoric_flora_moschops:6:7:1","lepidodendron:prehistoric_flora_roachoid_forest:5:4:1","lepidodendron:prehistoric_flora_robertia:4:2:1","lepidodendron:prehistoric_flora_sauroctonus:2:-2:1","lepidodendron:prehistoric_flora_trigonotarbid_permotarbus:2:15:1"};
    public static String[] dimPermianMobsWetlandsPF = new String[]{"lepidodendron:prehistoric_flora_acanthodes:4:80:3","lepidodendron:prehistoric_flora_acanthostomatops:3:27:3","lepidodendron:prehistoric_flora_acrolepis:1:74:3","lepidodendron:prehistoric_flora_adelopthalmus:3:65:3","lepidodendron:prehistoric_flora_brachydectes:1:74:3","lepidodendron:prehistoric_flora_branchiosaur:3:35:3","lepidodendron:prehistoric_flora_cacops:3:54:3","lepidodendron:prehistoric_flora_coelacanthus:3:27:3","lepidodendron:prehistoric_flora_ctenospondylus:3:-4:1","lepidodendron:prehistoric_flora_dasyceps:2:19:3","lepidodendron:prehistoric_flora_dimetrodon:3:-4:1","lepidodendron:prehistoric_flora_diplocaulus:3:43:3","lepidodendron:prehistoric_flora_diploceraspis:5:35:3","lepidodendron:prehistoric_flora_edaphosaurus:2:12:1","lepidodendron:prehistoric_flora_eryops:3:28:3","lepidodendron:prehistoric_flora_estemmenosuchus:2:6:1","lepidodendron:prehistoric_flora_glaurung:4:22:5","lepidodendron:prehistoric_flora_glaurung:4:1:1","lepidodendron:prehistoric_flora_gnathorhiza:2:35:3","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_labidosaurus:3:6:1","lepidodendron:prehistoric_flora_lysorophus:1:14:1","lepidodendron:prehistoric_flora_meganeuropsis:2:-3:1","lepidodendron:prehistoric_flora_nagini:1:14:3","lepidodendron:prehistoric_flora_ophiacodon:1:-14:1","lepidodendron:prehistoric_flora_palaeodictyoptera_dunbaria:2:12:1","lepidodendron:prehistoric_flora_platyhystrix:2:12:3","lepidodendron:prehistoric_flora_platysomus:4:75:3","lepidodendron:prehistoric_flora_protozygoptera:1:100:1","lepidodendron:prehistoric_flora_roachoid_swamp:5:4:1","lepidodendron:prehistoric_flora_scorpion_opsieobuthus:1:20:1","lepidodendron:prehistoric_flora_seymouria:3:8:1","lepidodendron:prehistoric_flora_snail_land:3:39:1","lepidodendron:prehistoric_flora_sphenacodon:1:-10:1","lepidodendron:prehistoric_flora_trigonotarbid_permotarbus:2:15:1","lepidodendron:prehistoric_flora_xenacanthus:1:14:3"};
    public static String[] dimPermianMobsMountainsPF = new String[0];

    public static String[] dimTriassicMobsOceanPF = new String[]{"lepidodendron:prehistoric_flora_aeger:3:80:3","lepidodendron:prehistoric_flora_aeger:3:80:2","lepidodendron:prehistoric_flora_albertonia:5:100:7","lepidodendron:prehistoric_flora_ammonite_asteroceras:2:90:3","lepidodendron:prehistoric_flora_ammonite_asteroceras:2:90:2","lepidodendron:prehistoric_flora_ammonite_ceratites:2:90:7","lepidodendron:prehistoric_flora_ammonite_goniatites:2:90:3","lepidodendron:prehistoric_flora_ammonite_goniatites:2:90:2","lepidodendron:prehistoric_flora_atopodentatus:3:10:1","lepidodendron:prehistoric_flora_aulacoceras:2:75:3","lepidodendron:prehistoric_flora_aulacoceras:2:75:2","lepidodendron:prehistoric_flora_austriadactylus:10:2:1","lepidodendron:prehistoric_flora_besanosaurus:1:10:3","lepidodendron:prehistoric_flora_besanosaurus:1:10:2","lepidodendron:prehistoric_flora_birgeria:2:30:3","lepidodendron:prehistoric_flora_birgeria:2:13:2","lepidodendron:prehistoric_flora_bobasatrania:5:85:3","lepidodendron:prehistoric_flora_brembodus:6:50:3","lepidodendron:prehistoric_flora_cartorhynchus:2:20:3","lepidodendron:prehistoric_flora_cartorhynchus:2:15:1","lepidodendron:prehistoric_flora_caturus:5:45:3","lepidodendron:prehistoric_flora_caturus:5:45:2","lepidodendron:prehistoric_flora_caviramus:10:2:1","lepidodendron:prehistoric_flora_chaohusaurus:2:27:3","lepidodendron:prehistoric_flora_cidaroida:5:100:7","lepidodendron:prehistoric_flora_cidaroida:5:100:3","lepidodendron:prehistoric_flora_clevosaurus:2:23:1","lepidodendron:prehistoric_flora_cymbospondylus:1:1:2","lepidodendron:prehistoric_flora_cymbospondylus:1:1:3","lepidodendron:prehistoric_flora_cymbospondylus:2:1:6","lepidodendron:prehistoric_flora_cymbospondylus{AgeTicks:0}:1:1:2","lepidodendron:prehistoric_flora_dapedium:12:65:3","lepidodendron:prehistoric_flora_eorhynchochelys:2:50:3","lepidodendron:prehistoric_flora_eosaurichthys:4:85:3","lepidodendron:prehistoric_flora_eosaurichthys:4:85:2","lepidodendron:prehistoric_flora_eretmorhipis:3:60:3","lepidodendron:prehistoric_flora_eudimorphodon:15:2:1","lepidodendron:prehistoric_flora_eusaurosphargis:3:52:1","lepidodendron:prehistoric_flora_fadenia_permotriassic:1:4:3","lepidodendron:prehistoric_flora_fadenia_permotriassic:1:4:2","lepidodendron:prehistoric_flora_feroxichthys:20:20:3","lepidodendron:prehistoric_flora_foreyia:15:40:3","lepidodendron:prehistoric_flora_jellyfish1:1:3:3","lepidodendron:prehistoric_flora_jellyfish1:1:3:2","lepidodendron:prehistoric_flora_jellyfish2:1:3:3","lepidodendron:prehistoric_flora_jellyfish2:1:3:2","lepidodendron:prehistoric_flora_jellyfish3:1:3:3","lepidodendron:prehistoric_flora_jellyfish3:1:3:2","lepidodendron:prehistoric_flora_jellyfish4:1:3:3","lepidodendron:prehistoric_flora_jellyfish4:1:3:2","lepidodendron:prehistoric_flora_jellyfish5:1:3:3","lepidodendron:prehistoric_flora_jellyfish5:1:3:2","lepidodendron:prehistoric_flora_jellyfish6:1:3:3","lepidodendron:prehistoric_flora_jellyfish6:1:3:2","lepidodendron:prehistoric_flora_jellyfish7:1:3:3","lepidodendron:prehistoric_flora_jellyfish7:1:3:2","lepidodendron:prehistoric_flora_keichousaurus:2:23:3","lepidodendron:prehistoric_flora_limulid:4:80:3","lepidodendron:prehistoric_flora_limulid:2:80:7","lepidodendron:prehistoric_flora_listracanthus:2:70:2","lepidodendron:prehistoric_flora_lotosaurus:3:2:1","lepidodendron:prehistoric_flora_morganucodon:3:5:1","lepidodendron:prehistoric_flora_nautilus:2:40:3","lepidodendron:prehistoric_flora_nautilus:2:40:2","lepidodendron:prehistoric_flora_nothosaurus:2:50:3","lepidodendron:prehistoric_flora_panzhousaurus:2:50:3","lepidodendron:prehistoric_flora_parhybodus:1:24:3","lepidodendron:prehistoric_flora_parhybodus:1:4:2","lepidodendron:prehistoric_flora_placodus:1:70:3","lepidodendron:prehistoric_flora_potanichthys:10:50:3","lepidodendron:prehistoric_flora_potanichthys:10:50:2","lepidodendron:prehistoric_flora_pygopterus:5:46:3","lepidodendron:prehistoric_flora_rebellatrix:10:50:2","lepidodendron:prehistoric_flora_saurichthys_marine:4:50:3","lepidodendron:prehistoric_flora_saurichthys_marine:4:50:2","lepidodendron:prehistoric_flora_sclerocormus:2:24:3","lepidodendron:prehistoric_flora_semionotus:10:80:3","lepidodendron:prehistoric_flora_shonisaurus:1:2:2","lepidodendron:prehistoric_flora_shonisaurus{AgeTicks:0}:1:1:2","lepidodendron:prehistoric_flora_stanocephalosaurus:2:5:1","lepidodendron:prehistoric_flora_tanystropheus:2:5:1","lepidodendron:prehistoric_flora_xinpusaurus:4:24:3","lepidodendron:prehistoric_flora_yunguisaurus:2:16:3","lepidodendron:prehistoric_flora_yunguisaurus:2:16:2"};
    public static String[] dimTriassicMobsOceanClamBedsPF = new String[]{"lepidodendron:prehistoric_flora_aeger:3:80:3","lepidodendron:prehistoric_flora_aeger:3:80:7","lepidodendron:prehistoric_flora_ammonite_asteroceras:2:90:6","lepidodendron:prehistoric_flora_ammonite_asteroceras:2:90:3","lepidodendron:prehistoric_flora_ammonite_ceratites:2:90:7","lepidodendron:prehistoric_flora_ammonite_goniatites:2:90:6","lepidodendron:prehistoric_flora_ammonite_goniatites:2:90:3","lepidodendron:prehistoric_flora_atopodentatus:3:10:1","lepidodendron:prehistoric_flora_aulacoceras:2:75:2","lepidodendron:prehistoric_flora_aulacoceras:2:75:3","lepidodendron:prehistoric_flora_austriadactylus:10:2:1","lepidodendron:prehistoric_flora_besanosaurus:1:10:2","lepidodendron:prehistoric_flora_besanosaurus:1:10:3","lepidodendron:prehistoric_flora_birgeria:2:30:2","lepidodendron:prehistoric_flora_birgeria:2:13:3","lepidodendron:prehistoric_flora_bobasatrania:10:90:3","lepidodendron:prehistoric_flora_brembodus:6:50:3","lepidodendron:prehistoric_flora_cartorhynchus:2:20:3","lepidodendron:prehistoric_flora_cartorhynchus:2:15:1","lepidodendron:prehistoric_flora_caturus:5:45:3","lepidodendron:prehistoric_flora_caturus:5:45:2","lepidodendron:prehistoric_flora_caviramus:10:2:1","lepidodendron:prehistoric_flora_chaohusaurus:2:27:3","lepidodendron:prehistoric_flora_cidaroida:5:100:7","lepidodendron:prehistoric_flora_cidaroida:5:100:3","lepidodendron:prehistoric_flora_clevosaurus:2:23:1","lepidodendron:prehistoric_flora_cyamodus:3:95:3","lepidodendron:prehistoric_flora_cyamodus:2:75:3","lepidodendron:prehistoric_flora_dapedium:12:65:3","lepidodendron:prehistoric_flora_eorhynchochelys:2:50:2","lepidodendron:prehistoric_flora_eosaurichthys:4:85:3","lepidodendron:prehistoric_flora_eosaurichthys:4:85:3","lepidodendron:prehistoric_flora_eretmorhipis:3:60:1","lepidodendron:prehistoric_flora_eudimorphodon:15:2:1","lepidodendron:prehistoric_flora_eusaurosphargis:3:52:1","lepidodendron:prehistoric_flora_fadenia_permotriassic:1:4:2","lepidodendron:prehistoric_flora_fadenia_permotriassic:1:4:3","lepidodendron:prehistoric_flora_feroxichthys:20:20:3","lepidodendron:prehistoric_flora_foreyia:15:45:3","lepidodendron:prehistoric_flora_jellyfish1:1:3:3","lepidodendron:prehistoric_flora_jellyfish1:1:3:2","lepidodendron:prehistoric_flora_jellyfish2:1:3:3","lepidodendron:prehistoric_flora_jellyfish2:1:3:2","lepidodendron:prehistoric_flora_jellyfish3:1:3:3","lepidodendron:prehistoric_flora_jellyfish3:1:3:2","lepidodendron:prehistoric_flora_jellyfish4:1:3:3","lepidodendron:prehistoric_flora_jellyfish4:1:3:2","lepidodendron:prehistoric_flora_jellyfish5:1:3:3","lepidodendron:prehistoric_flora_jellyfish5:1:3:2","lepidodendron:prehistoric_flora_jellyfish6:1:3:3","lepidodendron:prehistoric_flora_jellyfish6:1:3:2","lepidodendron:prehistoric_flora_jellyfish7:1:3:3","lepidodendron:prehistoric_flora_jellyfish7:1:3:2","lepidodendron:prehistoric_flora_keichousaurus:2:23:3","lepidodendron:prehistoric_flora_limulid:4:22:3","lepidodendron:prehistoric_flora_limulid:2:30:2","lepidodendron:prehistoric_flora_lotosaurus:3:2:1","lepidodendron:prehistoric_flora_luoxiongichthys:8:20:3","lepidodendron:prehistoric_flora_morganucodon:3:5:1","lepidodendron:prehistoric_flora_nautilus:2:40:6","lepidodendron:prehistoric_flora_nautilus:2:40:3","lepidodendron:prehistoric_flora_nothosaurus:2:50:3","lepidodendron:prehistoric_flora_panzhousaurus:2:50:3","lepidodendron:prehistoric_flora_placodus:1:70:3","lepidodendron:prehistoric_flora_potanichthys:10:50:2","lepidodendron:prehistoric_flora_potanichthys:10:50:3","lepidodendron:prehistoric_flora_rebellatrix:5:50:2","lepidodendron:prehistoric_flora_saurichthys_marine:4:50:2","lepidodendron:prehistoric_flora_saurichthys_marine:4:50:3","lepidodendron:prehistoric_flora_sclerocormus:2:24:3","lepidodendron:prehistoric_flora_semionotus:10:80:3","lepidodendron:prehistoric_flora_shonisaurus:1:2:2","lepidodendron:prehistoric_flora_stanocephalosaurus:2:5:1","lepidodendron:prehistoric_flora_tanystropheus:2:5:1","lepidodendron:prehistoric_flora_xinpusaurus:4:24:3","lepidodendron:prehistoric_flora_yunguisaurus:2:16:2","lepidodendron:prehistoric_flora_yunguisaurus:2:16:3"};
    public static String[] dimTriassicMobsRiverPF = new String[]{"lepidodendron:prehistoric_flora_ceratodus:3:25:2","lepidodendron:prehistoric_flora_ceratodus:3:25:3","lepidodendron:prehistoric_flora_chinlea:4:30:2","lepidodendron:prehistoric_flora_chinlea:2:20:3","lepidodendron:prehistoric_flora_italophlebia:2:90:1","lepidodendron:prehistoric_flora_lonchidion:2:36:2","lepidodendron:prehistoric_flora_lonchidion:1:26:3","lepidodendron:prehistoric_flora_mastodonsaurus:1:8:3","lepidodendron:prehistoric_flora_opolanka:10:65:2","lepidodendron:prehistoric_flora_opolanka:10:85:3","lepidodendron:prehistoric_flora_plateosaurus:2:1:1","lepidodendron:prehistoric_flora_roachoid_swamp:5:4:1","lepidodendron:prehistoric_flora_saurichthys_freshwater:4:65:2","lepidodendron:prehistoric_flora_saurichthys_freshwater:4:65:3","lepidodendron:prehistoric_flora_semionotus:5:95:2","lepidodendron:prehistoric_flora_semionotus:5:95:3","lepidodendron:prehistoric_flora_teyujagua:1:4:1","lepidodendron:prehistoric_flora_xenacanthus:2:25:2","lepidodendron:prehistoric_flora_xenacanthus:2:20:3"};
    public static String[] dimTriassicMobsXericForestPF = new String[]{"lepidodendron:prehistoric_flora_ceratodus:3:25:3","lepidodendron:prehistoric_flora_clevosaurus:2:28:1","lepidodendron:prehistoric_flora_coelophysis:3:-65:1","lepidodendron:prehistoric_flora_cynognathus:2:-18:1","lepidodendron:prehistoric_flora_daedalichthys:6:50:3","lepidodendron:prehistoric_flora_desmatosuchus:2:12:1","lepidodendron:prehistoric_flora_drepanosaurus:5:50:5","lepidodendron:prehistoric_flora_effigia:6:28:1","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_hyperodapedon:3:24:1","lepidodendron:prehistoric_flora_hypsognathus:3:48:1","lepidodendron:prehistoric_flora_lystrosaurus:5:60:1","lepidodendron:prehistoric_flora_megazostrodon:3:20:1","lepidodendron:prehistoric_flora_palaeontinid:3:20:1","lepidodendron:prehistoric_flora_plateosaurus:1:15:1","lepidodendron:prehistoric_flora_roachoid_forest:3:30:1","lepidodendron:prehistoric_flora_semionotus:10:50:3","lepidodendron:prehistoric_flora_titanoptera_clatrotitan:3:15:1"};
    public static String[] dimTriassicMobsXericScrublandPF = new String[]{"lepidodendron:prehistoric_flora_ceratodus:3:25:3","lepidodendron:prehistoric_flora_clevosaurus:3:65:1","lepidodendron:prehistoric_flora_coelophysis:3:-45:1","lepidodendron:prehistoric_flora_cynognathus:2:-12:1","lepidodendron:prehistoric_flora_daedalichthys:6:80:3","lepidodendron:prehistoric_flora_daedalichthys:6:60:3","lepidodendron:prehistoric_flora_desmatosuchus:2:5:1","lepidodendron:prehistoric_flora_effigia:6:42:1","lepidodendron:prehistoric_flora_erythrosuchus:2:-6:1","lepidodendron:prehistoric_flora_euparkeria:4:80:1","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_hyperodapedon:3:60:1","lepidodendron:prehistoric_flora_hypsognathus:3:55:1","lepidodendron:prehistoric_flora_liliensternus:3:-10:1","lepidodendron:prehistoric_flora_lystrosaurus:5:45:1","lepidodendron:prehistoric_flora_morganucodon:3:5:1","lepidodendron:prehistoric_flora_ornithosuchus:3:90:1","lepidodendron:prehistoric_flora_palaeontinid:3:30:1","lepidodendron:prehistoric_flora_roachoid_arid:5:8:1","lepidodendron:prehistoric_flora_roachoid_forest:5:8:1","lepidodendron:prehistoric_flora_semionotus:10:70:3","lepidodendron:prehistoric_flora_semionotus:10:60:3","lepidodendron:prehistoric_flora_sphenotitan:3:48:1","lepidodendron:prehistoric_flora_teleocrater:2:12:1","lepidodendron:prehistoric_flora_teyujagua:1:1:1"};
    public static String[] dimTriassicMobsLakelandPF = new String[]{"lepidodendron:prehistoric_flora_batrachotomus:2:-11:1","lepidodendron:prehistoric_flora_beishanichthys:3:70:3","lepidodendron:prehistoric_flora_ceratodus:3:80:3","lepidodendron:prehistoric_flora_chinlea:8:80:3","lepidodendron:prehistoric_flora_clevosaurus:2:50:1","lepidodendron:prehistoric_flora_coelophysis:2:-25:1","lepidodendron:prehistoric_flora_doswellia:2:30:1","lepidodendron:prehistoric_flora_eudimorphodon:10:40:1","lepidodendron:prehistoric_flora_gerrothorax:5:25:3","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_henodus:3:35:3","lepidodendron:prehistoric_flora_hyperodapedon:3:70:1","lepidodendron:prehistoric_flora_hypuronector:6:70:5","lepidodendron:prehistoric_flora_italophlebia:6:32:1","lepidodendron:prehistoric_flora_liliensternus:2:-18:1","lepidodendron:prehistoric_flora_lonchidion:2:65:3","lepidodendron:prehistoric_flora_longisquama:3:60:1","lepidodendron:prehistoric_flora_lystrosaurus:5:70:1","lepidodendron:prehistoric_flora_mastodonsaurus:1:15:3","lepidodendron:prehistoric_flora_metoposaurus:2:30:3","lepidodendron:prehistoric_flora_opolanka:6:40:3","lepidodendron:prehistoric_flora_palaeontinid:3:30:1","lepidodendron:prehistoric_flora_placerias:6:26:1","lepidodendron:prehistoric_flora_plateosaurus:2:22:1","lepidodendron:prehistoric_flora_poposaurus:2:-14:1","lepidodendron:prehistoric_flora_postosuchus:2:3:1","lepidodendron:prehistoric_flora_roachoid_forest:5:25:1","lepidodendron:prehistoric_flora_roachoid_swamp:5:25:1","lepidodendron:prehistoric_flora_rutiodon:4:10:1","lepidodendron:prehistoric_flora_saurichthys_freshwater:4:80:3","lepidodendron:prehistoric_flora_semionotus:10:90:3","lepidodendron:prehistoric_flora_sharovipteryx:2:60:1","lepidodendron:prehistoric_flora_smilosuchus:2:-6:1","lepidodendron:prehistoric_flora_smilosuchus:2:-6:1","lepidodendron:prehistoric_flora_snail_land:3:39:1","lepidodendron:prehistoric_flora_titanoptera_gigatitan:3:25:1","lepidodendron:prehistoric_flora_vancleavea:2:-25:3","lepidodendron:prehistoric_flora_xenacanthus:2:65:3"};
    public static String[] dimTriassicMobsVolcanicHillsPF = new String[]{"lepidodendron:prehistoric_flora_clevosaurus:2:40:1","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_hyperodapedon:2:40:1","lepidodendron:prehistoric_flora_liliensternus:1:-10:1","lepidodendron:prehistoric_flora_lystrosaurus:5:75:1","lepidodendron:prehistoric_flora_morganucodon:3:15:1","lepidodendron:prehistoric_flora_palaeontinid:3:30:1","lepidodendron:prehistoric_flora_plateosaurus:1:15:1","lepidodendron:prehistoric_flora_poposaurus:2:-3:1","lepidodendron:prehistoric_flora_postosuchus:1:-2:1","lepidodendron:prehistoric_flora_semionotus:10:90:3","lepidodendron:prehistoric_flora_sphenotitan:2:35:1"};
    public static String[] dimTriassicMobsFloodedForestPF = new String[]{"lepidodendron:prehistoric_flora_austriadactylus:4:10:1","lepidodendron:prehistoric_flora_ceratodus:4:45:3","lepidodendron:prehistoric_flora_chinlea:8:80:3","lepidodendron:prehistoric_flora_clevosaurus:2:35:1","lepidodendron:prehistoric_flora_coelophysis:3:-5:1","lepidodendron:prehistoric_flora_eudimorphodon:4:10:1","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_henodus:5:45:3","lepidodendron:prehistoric_flora_hyperodapedon:2:65:1","lepidodendron:prehistoric_flora_italophlebia:6:90:1","lepidodendron:prehistoric_flora_lisowicia:2:10:1","lepidodendron:prehistoric_flora_lonchidion:1:32:3","lepidodendron:prehistoric_flora_lystrosaurus:2:45:1","lepidodendron:prehistoric_flora_mastodonsaurus:2:20:3","lepidodendron:prehistoric_flora_metoposaurus:2:45:3","lepidodendron:prehistoric_flora_opolanka:10:100:3","lepidodendron:prehistoric_flora_opolanka:6:40:2","lepidodendron:prehistoric_flora_opolanka:2:100:3","lepidodendron:prehistoric_flora_palaeontinid:3:25:1","lepidodendron:prehistoric_flora_proganochelys:2:18:3","lepidodendron:prehistoric_flora_roachoid_forest:5:54:1","lepidodendron:prehistoric_flora_roachoid_swamp:5:54:1","lepidodendron:prehistoric_flora_rutiodon:2:26:1","lepidodendron:prehistoric_flora_saurichthys_freshwater:5:70:3","lepidodendron:prehistoric_flora_semionotus:10:70:3","lepidodendron:prehistoric_flora_silesaurus:5:15:1","lepidodendron:prehistoric_flora_smilosuchus:2:-6:1","lepidodendron:prehistoric_flora_smilosuchus:2:-10:3","lepidodendron:prehistoric_flora_smok:1:-8:1","lepidodendron:prehistoric_flora_snail_land:3:39:1","lepidodendron:prehistoric_flora_xenacanthus:3:65:3"};
    public static String[] dimTriassicMobsCoolForestPF = new String[]{"lepidodendron:prehistoric_flora_ceratodus:3:65:3","lepidodendron:prehistoric_flora_clevosaurus:2:32:1","lepidodendron:prehistoric_flora_cynognathus:2:-15:1","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_herrerasaurus:2:-9:1","lepidodendron:prehistoric_flora_lystrosaurus:4:24:1","lepidodendron:prehistoric_flora_mussaurus:2:18:1","lepidodendron:prehistoric_flora_palaeontinid:3:30:1","lepidodendron:prehistoric_flora_pseudotherium:5:18:1","lepidodendron:prehistoric_flora_roachoid_forest:5:40:1","lepidodendron:prehistoric_flora_saurichthys_freshwater:5:64:3","lepidodendron:prehistoric_flora_semionotus:10:85:3","lepidodendron:prehistoric_flora_snail_land:3:39:1","lepidodendron:prehistoric_flora_thrinaxodon:4:16:1","lepidodendron:prehistoric_flora_titanoptera_mesotitan:15:15:1"};
    public static String[] dimTriassicMobsMossMeadowPF = new String[]{"lepidodendron:prehistoric_flora_ceratodus:4:63:3","lepidodendron:prehistoric_flora_clevosaurus:2:20:1","lepidodendron:prehistoric_flora_cynognathus:2:-6:1","lepidodendron:prehistoric_flora_eoraptor:5:47:1","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_herrerasaurus:2:-20:1","lepidodendron:prehistoric_flora_hyperodapedon:6:10:1","lepidodendron:prehistoric_flora_lessemsaurus:3:13:1","lepidodendron:prehistoric_flora_lystrosaurus:5:25:1","lepidodendron:prehistoric_flora_pseudotherium:5:14:1","lepidodendron:prehistoric_flora_roachoid_swamp:5:25:1","lepidodendron:prehistoric_flora_saurichthys_freshwater:10:80:3","lepidodendron:prehistoric_flora_saurosuchus:2:4:1","lepidodendron:prehistoric_flora_semionotus:10:60:3","lepidodendron:prehistoric_flora_sillosuchus:2:20:1","lepidodendron:prehistoric_flora_snail_land:3:39:1","lepidodendron:prehistoric_flora_thrinaxodon:4:22:1"};
    public static String[] dimTriassicMobsDesertPF = new String[]{"lepidodendron:prehistoric_flora_caelestiventus:5:2:1","lepidodendron:prehistoric_flora_ceratodus:3:80:3","lepidodendron:prehistoric_flora_clevosaurus:2:4:1","lepidodendron:prehistoric_flora_coelophysis:2:-2:1","lepidodendron:prehistoric_flora_daedalichthys:10:90:3","lepidodendron:prehistoric_flora_erythrosuchus:1:-2:1","lepidodendron:prehistoric_flora_eusaurosphargis:2:2:1","lepidodendron:prehistoric_flora_hyperodapedon:2:2:1","lepidodendron:prehistoric_flora_lystrosaurus:5:11:1","lepidodendron:prehistoric_flora_morganucodon:3:25:1","lepidodendron:prehistoric_flora_roachoid_arid:5:10:1"};
    public static String[] dimTriassicMobsDunesPF = new String[]{"lepidodendron:prehistoric_flora_caelestiventus:6:2:1","lepidodendron:prehistoric_flora_ceratodus:3:80:3","lepidodendron:prehistoric_flora_clevosaurus:2:4:1","lepidodendron:prehistoric_flora_coelophysis:2:-2:1","lepidodendron:prehistoric_flora_daedalichthys:10:90:3","lepidodendron:prehistoric_flora_erythrosuchus:1:2:1","lepidodendron:prehistoric_flora_eusaurosphargis:2:2:1","lepidodendron:prehistoric_flora_hyperodapedon:2:2:1","lepidodendron:prehistoric_flora_lystrosaurus:5:11:1","lepidodendron:prehistoric_flora_morganucodon:3:5:1","lepidodendron:prehistoric_flora_ornithosuchus:3:4:1","lepidodendron:prehistoric_flora_roachoid_arid:5:10:1","lepidodendron:prehistoric_flora_scleromochlus:2:1:1","lepidodendron:prehistoric_flora_stagonolepis:2:3:1","lepidodendron:prehistoric_flora_stanocephalosaurus:2:3:1"};
    public static String[] dimTriassicMobsPlateauPF = new String[]{"lepidodendron:prehistoric_flora_caelestiventus:6:1:1","lepidodendron:prehistoric_flora_ceratodus:4:70:3","lepidodendron:prehistoric_flora_clevosaurus:2:1:1","lepidodendron:prehistoric_flora_eusaurosphargis:4:1:1","lepidodendron:prehistoric_flora_morganucodon:3:5:1","lepidodendron:prehistoric_flora_roachoid_arid:5:10:1"};
    public static String[] dimTriassicMobsCanyonsPF = new String[]{"lepidodendron:prehistoric_flora_arizonasaurus:2:42:1","lepidodendron:prehistoric_flora_austriadactylus:6:22:1","lepidodendron:prehistoric_flora_austrolimulus:6:90:3","lepidodendron:prehistoric_flora_caviramus:6:22:1","lepidodendron:prehistoric_flora_ceratodus:4:80:3","lepidodendron:prehistoric_flora_chinlea:4:80:3","lepidodendron:prehistoric_flora_clevosaurus:2:26:1","lepidodendron:prehistoric_flora_dinodontosaurus:4:22:1","lepidodendron:prehistoric_flora_drepanosaurus:6:12:1","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_lagosuchus:3:42:1","lepidodendron:prehistoric_flora_lonchidion:1:36:3","lepidodendron:prehistoric_flora_lotosaurus:4:62:1","lepidodendron:prehistoric_flora_lystrosaurus:5:40:1","lepidodendron:prehistoric_flora_mastodonsaurus:2:17:3","lepidodendron:prehistoric_flora_metoposaurus:2:22:3","lepidodendron:prehistoric_flora_palaeontinid:3:30:1","lepidodendron:prehistoric_flora_roachoid_forest:5:14:1","lepidodendron:prehistoric_flora_roachoid_swamp:5:14:1","lepidodendron:prehistoric_flora_saurichthys_freshwater:5:90:3","lepidodendron:prehistoric_flora_semionotus:10:90:3","lepidodendron:prehistoric_flora_shringasaurus:3:63:1","lepidodendron:prehistoric_flora_smilosuchus:2:-8:1","lepidodendron:prehistoric_flora_smilosuchus:2:-8:3","lepidodendron:prehistoric_flora_snail_land:3:39:1","lepidodendron:prehistoric_flora_stagonolepis:3:8:1","lepidodendron:prehistoric_flora_stanocephalosaurus:3:8:1","lepidodendron:prehistoric_flora_tanystropheus:3:-18:3","lepidodendron:prehistoric_flora_teraterpeton:3:46:1","lepidodendron:prehistoric_flora_titanoptera_gigatitan:3:25:1","lepidodendron:prehistoric_flora_titanoptera_mesotitan:3:15:1","lepidodendron:prehistoric_flora_triadobatrachus:4:73:3","lepidodendron:prehistoric_flora_vancleavea:3:-55:3","lepidodendron:prehistoric_flora_xenacanthus:2:84:3"};
    public static String[] dimTriassicMobsIslandsPF = new String[]{"lepidodendron:prehistoric_flora_aeger:6:70:3","lepidodendron:prehistoric_flora_ammonite_asteroceras:2:60:3","lepidodendron:prehistoric_flora_ammonite_goniatites:2:60:3","lepidodendron:prehistoric_flora_atopodentatus:6:6:1","lepidodendron:prehistoric_flora_aulacoceras:4:62:3","lepidodendron:prehistoric_flora_birgeria:6:68:3","lepidodendron:prehistoric_flora_brembodus:8:75:3","lepidodendron:prehistoric_flora_cartorhynchus:2:74:3","lepidodendron:prehistoric_flora_cartorhynchus:2:15:1","lepidodendron:prehistoric_flora_caturus:6:62:3","lepidodendron:prehistoric_flora_chaohusaurus:3:60:3","lepidodendron:prehistoric_flora_cidaroida:5:100:3","lepidodendron:prehistoric_flora_eorhynchochelys:2:32:3","lepidodendron:prehistoric_flora_eretmorhipis:2:30:3","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_keichousaurus:2:8:3","lepidodendron:prehistoric_flora_limulid:4:28:3","lepidodendron:prehistoric_flora_nothosaurus:4:6:3","lepidodendron:prehistoric_flora_panzhousaurus:3:5:3","lepidodendron:prehistoric_flora_parhybodus:2:4:3","lepidodendron:prehistoric_flora_potanichthys:10:69:3","lepidodendron:prehistoric_flora_rebellatrix:5:78:3","lepidodendron:prehistoric_flora_saurichthys_marine:5:78:3","lepidodendron:prehistoric_flora_semionotus:10:85:3","lepidodendron:prehistoric_flora_thecodontosaurus:2:6:1"};
    public static String[] dimTriassicMobsMountainsPF = new String[]{"lepidodendron:prehistoric_flora_austriadactylus:2:1:1","lepidodendron:prehistoric_flora_clevosaurus:2:2:1","lepidodendron:prehistoric_flora_coelophysis:1:-1:1","lepidodendron:prehistoric_flora_eudimorphodon:2:1:1","lepidodendron:prehistoric_flora_harvestman:2:30:1","lepidodendron:prehistoric_flora_lystrosaurus:3:2:1","lepidodendron:prehistoric_flora_morganucodon:3:5:1","lepidodendron:prehistoric_flora_roachoid_arid:5:5:1"};

    //------------ Fossils and Archeology mobs:
    public static String[] dimPrecambrianMobsFA = new String[0];

    public static String[] dimCambrianMobsFA = new String[0];
    public static String[] dimCambrianEstuaryMobsFA = new String[0];

    public static String[] dimOrdovicianMobsFA = new String[]{"fossil:fossil.megalograptus{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:25}],Health:25}:2:10:3","fossil:fossil.megalograptus{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:25}],Health:25}:2:15:2"};
    public static String[] dimOrdovicianMobsSpongeFA = new String[0];

    public static String[] dimSilurianMobsFA = new String[0];

    public static String[] dimDevonianMobsForestFA = new String[]{"fossil:fossil.tiktaalik{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:30}],Health:30}:1:20:3"};
    public static String[] dimDevonianMobsSwampFA = new String[]{"fossil:fossil.tiktaalik{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:30}],Health:30}:1:20:3"};
    public static String[] dimDevonianMobsOceanFA = new String[0];
    public static String[] dimDevonianMobsSinkholeFA = new String[0];
    public static String[] dimDevonianMobsDeadReefFA = new String[0];

    public static String[] dimCarboniferousMobsSwampFA = new String[]{"fossil:fossil.crassigyrinus{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:20}],Health:20}:2:20:3","fossil:fossil.diplocaulus{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:10}],Health:10}:3:20:3","fossil:fossil.meganeura{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:18}],Health:18}:2:-20:1"};
    public static String[] dimCarboniferousMobsBurntSwampFA = new String[]{"fossil:fossil.arthropleura{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:34}],Health:34}:1:35:1","fossil:fossil.meganeura{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:18}],Health:18}:2:-20:1"};
    public static String[] dimCarboniferousMobsMarshFA = new String[]{"fossil:fossil.meganeura{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:18}],Health:18}:2:-20:1"};
    public static String[] dimCarboniferousMobsOceanFA = new String[0];
    public static String[] dimCarboniferousMobsIceFA = new String[0];
    public static String[] dimCarboniferousMobsHillsFA = new String[0];

    public static String[] dimPermianMobsOceanFA = new String[0];
    public static String[] dimPermianMobsOceanCliffFA = new String[0];
    public static String[] dimPermianMobsGlossopterisFA = new String[0];
    public static String[] dimPermianMobsWetlandsFA = new String[]{"fossil:fossil.diplocaulus{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:10}],Health:10}:3:12:3","fossil:fossil.edaphosaurus{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:30}],Health:30}:2:12:1"};
    public static String[] dimPermianMobsAridLandsFA = new String[0];
    public static String[] dimPermianMobsRiverFA = new String[0];
    public static String[] dimPermianMobsLowlandsFA = new String[]{"fossil:fossil.diplocaulus{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:10}],Health:10}:3:12:3"};
    public static String[] dimPermianMobsLowlandForestFA = new String[0];
    public static String[] dimPermianMobsFloodbasaltFA = new String[0];
    public static String[] dimPermianMobsHighlandsFA = new String[0];
    public static String[] dimPermianMobsDesertFA = new String[0];
    public static String[] dimPermianMobsMountainsFA = new String[0];

    public static String[] dimTriassicMobsOceanFA = new String[]{"fossil:fossil.ichthyosaur{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:30}],Health:30}:2:15:2"};
    public static String[] dimTriassicMobsOceanClamBedsFA = new String[]{"fossil:fossil.ichthyosaur{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:30}],Health:30}:2:15:2"};
    public static String[] dimTriassicMobsRiverFA = new String[0];
    public static String[] dimTriassicMobsXericForestFA = new String[0];
    public static String[] dimTriassicMobsXericShrublandFA = new String[0];
    public static String[] dimTriassicMobsLakelandFA = new String[]{"fossil:fossil.henodus{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:30}],Health:30}:5:15:3"};
    public static String[] dimTriassicMobsVolcanicHillsFA = new String[0];
    public static String[] dimTriassicMobsFloodedForestFA = new String[]{"fossil:fossil.henodus{Mood:0,Hunger:1000,AgeTick:1000000,Attributes:[{Name:generic.maxHealth,Base:30}],Health:30}:5:15:3"};
    public static String[] dimTriassicMobsCoolForestFA = new String[0];
    public static String[] dimTriassicMobsMossMeadowFA = new String[0];
    public static String[] dimTriassicMobsDesertFA = new String[0];
    public static String[] dimTriassicMobsDunesFA = new String[0];
    public static String[] dimTriassicMobsPlateauFA = new String[0];
    public static String[] dimTriassicMobsCanyonsFA = new String[0];
    public static String[] dimTriassicMobsIslandsFA = new String[0];
    public static String[] dimTriassicMobsMountainsFA = new String[0];
    //------------

    //------------ Reborn mobs:
    public static String[] dimPrecambrianMobsReborn = new String[0];

    public static String[] dimCambrianMobsReborn = new String[0];
    public static String[] dimCambrianEstuaryMobsReborn = new String[0];

    public static String[] dimOrdovicianMobsReborn = new String[0];
    public static String[] dimOrdovicianMobsSpongeReborn = new String[0];

    public static String[] dimSilurianMobsReborn = new String[0];

    public static String[] dimDevonianMobsForestReborn = new String[0];
    public static String[] dimDevonianMobsSwampReborn = new String[0];
    public static String[] dimDevonianMobsOceanReborn = new String[]{"rebornmod:entities.dunkleosteus:1:1:2"};
    public static String[] dimDevonianMobsSinkholeReborn = new String[0];
    public static String[] dimDevonianMobsDeadReefReborn = new String[0];

    public static String[] dimCarboniferousMobsSwampReborn = new String[]{"rebornmod:entities.crassigyrinus:2:7:3","rebornmod:entities.diplocaulus:2:7:3"};
    public static String[] dimCarboniferousMobsBurntSwampReborn = new String[]{"rebornmod:entities.crassigyrinus:2:7:3","rebornmod:entities.diplocaulus:2:7:3"};
    public static String[] dimCarboniferousMobsMarshReborn = new String[]{"rebornmod:entities.crassigyrinus:2:7:3","rebornmod:entities.diplocaulus:2:7:3"};
    public static String[] dimCarboniferousMobsOceanReborn = new String[0];
    public static String[] dimCarboniferousMobsIceReborn = new String[0];
    public static String[] dimCarboniferousMobsHillsReborn = new String[0];

    public static String[] dimPermianMobsOceanReborn = new String[0];
    public static String[] dimPermianMobsOceanCliffReborn = new String[0];
    public static String[] dimPermianMobsGlossopterisReborn = new String[0];
    public static String[] dimPermianMobsWetlandsReborn = new String[]{"rebornmod:entities.diplocaulus:2:7:3"};
    public static String[] dimPermianMobsAridLandsReborn = new String[0];
    public static String[] dimPermianMobsRiverReborn = new String[0];
    public static String[] dimPermianMobsLowlandsReborn = new String[]{"rebornmod:entities.diplocaulus:2:7:3"};
    public static String[] dimPermianMobsLowlandForestReborn = new String[0];
    public static String[] dimPermianMobsFloodbasaltReborn = new String[0];
    public static String[] dimPermianMobsHighlandsReborn = new String[0];
    public static String[] dimPermianMobsDesertReborn = new String[0];
    public static String[] dimPermianMobsMountainsReborn = new String[0];

    public static String[] dimTriassicMobsOceanReborn = new String[]{"rebornmod:entities.coelacanth:2:30:3"};
    public static String[] dimTriassicMobsOceanClamBedsReborn = new String[]{"rebornmod:entities.coelacanth:2:30:3"};
    public static String[] dimTriassicMobsRiverReborn = new String[0];
    public static String[] dimTriassicMobsXericForestReborn = new String[0];
    public static String[] dimTriassicMobsXericShrublandReborn = new String[0];
    public static String[] dimTriassicMobsLakelandReborn = new String[]{"rebornmod:entities.postosuchus:1:1:1"};
    public static String[] dimTriassicMobsVolcanicHillsReborn = new String[]{"rebornmod:entities.postosuchus:1:1:1"};
    public static String[] dimTriassicMobsFloodedForestReborn = new String[0];
    public static String[] dimTriassicMobsCoolForestReborn = new String[]{"rebornmod:entities.herrerasaurus:2:10:1", "rebornmod:entities.mussaurus:2:16:1"};
    public static String[] dimTriassicMobsMossMeadowReborn = new String[]{"rebornmod:entities.herrerasaurus:2:5:1"};
    public static String[] dimTriassicMobsDesertReborn = new String[0];
    public static String[] dimTriassicMobsDunesReborn = new String[0];
    public static String[] dimTriassicMobsPlateauReborn = new String[0];
    public static String[] dimTriassicMobsCanyonsReborn = new String[0];
    public static String[] dimTriassicMobsIslandsReborn = new String[0];
    public static String[] dimTriassicMobsMountainsReborn = new String[0];
    //------------


    public static boolean showTooltips = true;
    public static boolean doPropagation = true;
    public static boolean doPropagationVanilla = false;
    public static boolean genAllPlants = false;

    public static int waterHibbertopterus = 2;
    public static int waterLimnoscelis = 10;
    public static int waterEryops = 4;
    public static int waterCrassigyrinus = 1;
    public static int waterBranchiosaur = 1;
    public static int waterPanderichthys = 1;
    public static int waterCeratodus = 1;
    public static int waterGnathorhiza = 1;
    public static int waterLaccognathus = 1;
    public static int waterDiplocaulus = 1;
    public static int waterDiploceraspis = 1;
    public static int waterMastodonsaurus = 1;
    public static int waterAcanthostomatops = 6;
    public static int waterPhlegethontia = 1;
    public static int waterProterogyrinus = 7;
    public static int waterAmphibamus = 8;
    public static int waterIchthyostega = 6;
    public static int waterTiktaalik = 6;
    public static int waterParmastega = 6;
    public static int waterPrionosuchus = 6;
    public static int waterPholiderpeton = 7;
    public static int waterMesosaurus = 5; //not editable - does not affect mob health, only AI
    public static int waterClaudiosaurus = 5; //not editable - does not affect mob health, only AI
    public static int waterCartorhynchus = 8; //not editable - does not affect mob health, only AI
    public static int waterAtopodentatus = 10; //not editable - does not affect mob health, only AI
    public static int waterHenodus = 5; //not editable - does not affect mob health, only AI
    public static int waterTanystropheus = 10; //not editable - does not affect mob health, only AI
    public static int waterPlacodus = 6;
    public static int waterKalbarria = 2;
    public static int waterEricixerxes = 2;
    public static int waterAcanthostega = 2;
    public static int waterMegalocephalus = 4;
    public static int waterSpathicephalus = 4;
    public static boolean colourPulmonoscorpius = true;
    public static int waterPederpes = 16;
    public static int waterPlatyhystrix = 16;
    public static int waterBalanerpeton = 8;
    public static int waterMetoposaurus = 8;
    public static int waterCacops = 10;
    public static int waterDasyceps = 10;
    public static int waterDvinosaurus = 1;
    public static int waterMelosaurus = 4;
    public static int waterPantylus = 8;
    public static int waterUranocentrodon = 1;

    public LepidodendronConfig() {
    }

    public static void load(FMLPreInitializationEvent event) {
        //cfg = new Configuration(event.getSuggestedConfigurationFile(), "1.0", false);
        cfg = new Configuration(new File(event.getModConfigurationDirectory(), "prehistoricnature_general.cfg"), "2.0", false);
        MinecraftForge.EVENT_BUS.register(instance);
        syncConfigGeneral();
    }

    @SubscribeEvent
    public void update(OnConfigChangedEvent event) {
        if (event.getModID().equals("lepidodendron")) {
            syncConfigGeneral();
        }
    }

    public static boolean syncConfigGeneral() {
        List<String> propOrder = Lists.newArrayList();
        Property prop = cfg.get("Global World-Gen", "genGlobalBlacklist", genGlobalBlacklist);
        prop.setComment("List of biomes all plants are blacklisted from, in the format: modid:biomeid [default: empty]");
        genGlobalBlacklist = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "genLogResin", genLogResin);
        prop.setComment("List of log blocks which produce resin, in the format: modid:blockid:meta [default: \"minecraft:log:1\", \"lepidodendron:hymenaea_log\", \"lepidodendron:agathis_log\", \"lepidodendron:araucarioxylon_log\", \"lepidodendron:bunya_log\", \"lepidodendron:columnaris_log\", \"lepidodendron:monkeypuzzle_log\", \"lepidodendron:sciadopitys_log\", \"lepidodendron:walchia_log\", \"lepidodendron:wollemi_log\", \"biomesoplenty:log_2:6\", \"biomesoplenty:log_0:7\", \"jurassicraft:araucaria_log\", \"wildnature:cedar_log\", \"wildnature:fir_log\", \"wildnature:pine_log\", \"lepidodendron:bristlecone_log\", \"lepidodendron:mirabilis_log\", \"lepidodendron:monkey_puzzle_araucaria_log\", \"lepidodendron:hoop_araucaria_log\", \"lepidodendron:cunninghamia_log\"]");
        genLogResin = prop.getStringList();
        propOrder.add(prop.getName());
        prop = cfg.get("Prehistoric Ground Cover", "genPlantPrehistoric", genPlantPrehistoric);
        prop.setComment("List of blocks and items from OTHER mods which can be used to craft Prehistoric Ground Cover, in the format: modid:blockid:meta [default: \"fossil:bennettitales_large\",\"fossil:bennettitales_small\",\"fossil:calamites_leaves\",\"fossil:calamites_sapling\",\"fossil:cordaites_leaves\",\"fossil:cordaites_sapling\",\"fossil:crataegus\",\"fossil:cyathea\",\"fossil:dictyophyllum\",\"fossil:dillhoffia_flower\",\"fossil:dipteris\",\"fossil:duisbergia\",\"fossil:ependra\",\"fossil:fern_block\",\"fossil:florissantia\",\"fossil:foozia\",\"fossil:fossil_sapling_calamites\",\"fossil:fossil_sapling_cordaites\",\"fossil:fossil_sapling_palae\",\"fossil:fossil_sapling_sigillaria\",\"fossil:horsetail_small\",\"fossil:licopodiophyta\",\"fossil:osmunda\",\"fossil:palm_leaves\",\"fossil:palm_sapling\",\"fossil:sagenopteris\",\"fossil:sarracenia\",\"fossil:sigillaria_leaves\",\"fossil:sigillaria_sapling\",\"fossil:tempskya\",\"fossil:vaccinium\",\"fossil:welwitschia\",\"fossil:zamites\",\"jurassicraft:ajuginucula_smithii\",\"jurassicraft:ajuginucula_smithii_leaves\",\"jurassicraft:araucaria_leaves\",\"jurassicraft:araucaria_sapling\",\"jurassicraft:bennettitalean_cycadeoidea\",\"jurassicraft:bristle_fern\",\"jurassicraft:calamites_leaves\",\"jurassicraft:calamites_sapling\",\"jurassicraft:cinnamon_fern\",\"jurassicraft:cry_pansy\",\"jurassicraft:cycad_zamites\",\"jurassicraft:dicksonia\",\"jurassicraft:dicroidium_zuberi\",\"jurassicraft:dictyophyllum\",\"jurassicraft:encephalartos\",\"jurassicraft:ginkgo_leaves\",\"jurassicraft:ginkgo_sapling\",\"jurassicraft:gracilaria_seaweed\",\"jurassicraft:graminidites_bambusoides\",\"jurassicraft:heliconia\",\"jurassicraft:ladinia_simplex\",\"jurassicraft:moss\",\"jurassicraft:orontium_mackii\",\"jurassicraft:paleo_bale_cycad\",\"jurassicraft:paleo_bale_cycadeoidea\",\"jurassicraft:paleo_bale_fern\",\"jurassicraft:paleo_bale_leaves\",\"jurassicraft:paleo_bale_other\",\"jurassicraft:phoenix_leaves\",\"jurassicraft:phoenix_sapling\",\"jurassicraft:psaronius_leaves\",\"jurassicraft:psaronius_sapling\",\"jurassicraft:raphaelia\",\"jurassicraft:rhacophyton\",\"jurassicraft:rhamnus_salicifolius\",\"jurassicraft:scaly_tree_fern\",\"jurassicraft:serenna_veriformans\",\"jurassicraft:small_chain_fern\",\"jurassicraft:small_cycad\",\"jurassicraft:small_royal_fern\",\"jurassicraft:tempskya\",\"jurassicraft:umaltolepis\",\"jurassicraft:west_indian_lilac\",\"jurassicraft:woolly_stalked_begonia\",\"rebornmod:ajuginucula_smithii\",\"rebornmod:ajuginucula_smithii_leaves\",\"rebornmod:araucaria_leaves\",\"rebornmod:araucaria_sapling\",\"rebornmod:bennettitalean_cycadeoidea\",\"rebornmod:bristle_fern\",\"rebornmod:calamites_leaves\",\"rebornmod:calamites_sapling\",\"rebornmod:cinnamon_fern\",\"rebornmod:cry_pansy\",\"rebornmod:cycad_zamites\",\"rebornmod:dicksonia\",\"rebornmod:dicroidium_zuberi\",\"rebornmod:dictyophyllum\",\"rebornmod:encephalartos\",\"rebornmod:ginkgo_leaves\",\"rebornmod:ginkgo_sapling\",\"rebornmod:gracilaria_seaweed\",\"rebornmod:graminidites_bambusoides\",\"rebornmod:heliconia\",\"rebornmod:ladinia_simplex\",\"rebornmod:moss\",\"rebornmod:orontium_mackii\",\"rebornmod:paleo_bale_cycad\",\"rebornmod:paleo_bale_cycadeoidea\",\"rebornmod:paleo_bale_fern\",\"rebornmod:paleo_bale_leaves\",\"rebornmod:paleo_bale_other\",\"rebornmod:phoenix_leaves\",\"rebornmod:phoenix_sapling\",\"rebornmod:psaronius_leaves\",\"rebornmod:psaronius_sapling\",\"rebornmod:raphaelia\",\"rebornmod:rhacophyton\",\"rebornmod:rhamnus_salicifolius\",\"rebornmod:scaly_tree_fern\",\"rebornmod:serenna_veriformans\",\"rebornmod:small_chain_fern\",\"rebornmod:small_cycad\",\"rebornmod:small_royal_fern\",\"rebornmod:tempskya\",\"rebornmod:umaltolepis\",\"rebornmod:west_indian_lilac\",\"rebornmod:woolly_stalked_begonia\"]");
        genPlantPrehistoric = prop.getStringList();
        propOrder.add(prop.getName());
        prop = cfg.get("Prehistoric Ground Cover", "waterSandHorizontal", waterSandHorizontal);
        prop.setComment("Distance NSEW from water that sandy prehistoric grounds can exist and spread onto neighbouring sand (1 to 16) [default: 6]");
        waterSandHorizontal = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Prehistoric Ground Cover", "waterSandVertical", waterSandVertical);
        prop.setComment("Distance above water required for sandy prehistoric grounds to exist (0 to 6) [default: 0]");
        waterSandVertical = prop.getInt();
        propOrder.add(prop.getName());prop = cfg.get("Prehistoric Ground Cover", "waterPangaeanHorizontal", waterPangaeanHorizontal);
        prop.setComment("Distance NSEW from water that Pangaean sandy prehistoric ground can exist and spread onto neighbouring sand (1 to 16) [default: 3]");
        waterPangaeanHorizontal = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Prehistoric Ground Cover", "waterPangaeanVertical", waterPangaeanVertical);
        prop.setComment("Distance above water required for Pangaean sandy prehistoric ground to exist (0 to 6) [default: 0]");
        waterPangaeanVertical = prop.getInt();
        propOrder.add(prop.getName());


        prop = cfg.get("Global World-Gen", "showTooltips", showTooltips);
        prop.setComment("Shows useful, searchable tooltips on relevant items [default: true]");
        showTooltips = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "doMeteorites", doMeteorites);
        prop.setComment("Enable meteors in the relevant dimensions [default: true]");
        doMeteorites = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "doMeteoritesGriefing", doMeteoritesGriefing);
        prop.setComment("Make meteorites cause craters and fire, and leave iron ore (note that meteorite griefing is also tied to the more general mobGriefing gamerule) [default: true]");
        doMeteoritesGriefing = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "doReSpawner", doReSpawner);
        prop.setComment("Allow the mob ReSpawner item in the mod [default: true]");
        doReSpawner = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "fixApples", fixApples);
        prop.setComment("Make apples drop exclusively from apple trees [default: true]");
        fixApples = prop.getBoolean();
        propOrder.add(prop.getName());
        
        prop = cfg.get("Global Mobs", "blockSkeletonHorse", blockSkeletonHorse);
        prop.setComment("Prevent Skeleton Horses from being able to exist in the mod's Prehistoric dimensions (useful to prevent trap horses spawning) [default: true]");
        blockSkeletonHorse = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global Mobs", "blockMobs", blockMobs);
        prop.setComment("Try to stop other modded creatures wrongly spawning in the mod's Prehistoric dimensions [default: true]");
        blockMobs = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global Mobs", "blockMobsFAExceptions", blockMobsFAExceptions);
        prop.setComment("Switch to false to allow Fossils and Archeology ambient spawns (Alligator Gar, Sturgeon, Nautilus and Coelacanth) to spawn in the correct dimensions [default: true]");
        blockMobsFAExceptions = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global Mobs", "jarMobs", jarMobs);
        prop.setComment("List of other modded entities which can be caught in the jar, in the format: modid:mobid [default: empty]");
        jarMobs = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Global Mobs", "doLowRes", doLowRes);
        prop.setComment("Use lower-resolution textures for some of the smaller mobs so that their style fits in better [default: false]");
        doLowRes = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global Mobs", "attackPlayerAlways", attackPlayerAlways);
        prop.setComment("For mobs which can attack players, always attack players, regardless of the mob's health [default: false]");
        attackPlayerAlways = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global Mobs", "attackHealth", attackHealth);
        prop.setComment("Mobs which can hunt will only hunt prey if their health is under this percentage of full (0-100) [default: 90]");
        attackHealth = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Global Mobs", "adultAge", adultAge);
        prop.setComment("Ageable mobs will behave as adults once they are at least this percentage of full age (hunting, dropping eggs, etc.). This does nto affect models/textures. [default: 75]");
        adultAge = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Global Mobs", "doMultiplyMobs", doMultiplyMobs);
        prop.setComment("Mobs will try to multiply every 1-2 days even without breeding them [default: false]");
        doMultiplyMobs = prop.getBoolean();
        propOrder.add(prop.getName());



        prop = cfg.get("Global World-Gen", "spawnerDensity", spawnerDensity);
        prop.setComment("This number multiplies the default rate of spawning used by the mod's spawner (0-100). Recommended you do not change this. Increasing it will spawn more mobs, but as they do not despawn your PC may struggle. Use at your own risk. [default: 1.0]");
        spawnerDensity = prop.getDouble();
        propOrder.add(prop.getName());


        prop = cfg.get("Global World-Gen", "dimCambrian", dimCambrian);
        prop.setComment("Dimension number of the Cambrian dimension. Do not change this unless you get errors [default: -79]");
        dimCambrian = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "dimPrecambrian", dimPrecambrian);
        prop.setComment("Dimension number of the Precambrian dimension. Do not change this unless you get errors [default: -78]");
        dimPrecambrian = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "dimOrdovician", dimOrdovician);
        prop.setComment("Dimension number of the Ordovician dimension. Do not change this unless you get errors [default: -87]");
        dimOrdovician = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "dimSilurian", dimSilurian);
        prop.setComment("Dimension number of the Silurian dimension. Do not change this unless you get errors [default: -80]");
        dimSilurian = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "dimDevonian", dimDevonian);
        prop.setComment("Dimension number of the Devonian dimension. Do not change this unless you get errors [default: -81]");
        dimDevonian = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "dimCarboniferous", dimCarboniferous);
        prop.setComment("Dimension number of the Carboniferous dimension. Do not change this unless you get errors [default: -82]");
        dimCarboniferous = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "dimPermian", dimPermian);
        prop.setComment("Dimension number of the Permian dimension. Do not change this unless you get errors [default: -83]");
        dimPermian = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "dimTriassic", dimTriassic);
        prop.setComment("Dimension number of the Triassic dimension. Do not change this unless you get errors [default: -84]");
        dimTriassic = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "dimJurassic", dimJurassic);
        prop.setComment("Dimension number of the Jurassic dimension. Do not change this unless you get errors [default: -85]");
        dimJurassic = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "dimCretaceous", dimCretaceous);
        prop.setComment("Dimension number of the Cretaceous dimension. Do not change this unless you get errors [default: -86]");
        dimCretaceous = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "dimPaleogene", dimPaleogene);
        prop.setComment("Dimension number of the Paleogene dimension. Do not change this unless you get errors [default: -88]");
        dimPaleogene = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "dimNeogene", dimNeogene);
        prop.setComment("Dimension number of the Neogene dimension. Do not change this unless you get errors [default: -89]");
        dimNeogene = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "dimPleistocene", dimPleistocene);
        prop.setComment("Dimension number of the Pleistocene dimension. Do not change this unless you get errors [default: -90]");
        dimPleistocene = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global Mobs", "mobSpawnBespoke", mobSpawnBespoke);
        prop.setComment("Bespoke mob spawns. In the format: biomemodid:biomeid:modid:mobid:maxspawn:weight:locationid (maxspawn [1-20] is the maximum number which can spawn as a group in the same chunk; weight [-100-100] is how likely a group is to spawn - a negative number here will apply a 'rareness' factor to that spawn; locationid can be either 1, 2, 3, 4, 5, 6 or 7 as these location options for spawns: 1 = land, 2 = deep water [>4 blocks]; 3 = shallow water [<4 blocks]; 4 = general water [>5 blocks density]; 5 = on leaves; 6 = upper parts of deep water; 7 = lower parts of deep water) [default: empty]");
        mobSpawnBespoke = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "worldDimensionScaler", worldDimensionScaler);
        prop.setComment("This value controls how many blocks you move in a Prehistoric dimension when you move 1 block in the overworld (0.01 to 100) [default: 10]");
        worldDimensionScaler = prop.getDouble();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "dimTriassic", dimTriassic);
        prop.setComment("Dimension number of the Triassic dimension. Do not change this unless you get errors [default: -84]");
        dimTriassic = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "dimJurassic", dimJurassic);
        prop.setComment("Dimension number of the Jurassic dimension. Do not change this unless you get errors [default: -84]");
        dimJurassic = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "dimCretaceous", dimCretaceous);
        prop.setComment("Dimension number of the Cretaceous dimension. Do not change this unless you get errors [default: -84]");
        dimCretaceous = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "genFossil", genFossil);
        prop.setComment("Set to false to disable the world-gen of this mod's fossil blocks. [default: true]");
        genFossil = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "junkFossil", junkFossil);
        prop.setComment("Percentage chance that the acid bath returns a junk output instead of a fossil (0-100). [default: 12.5]");
        junkFossil = prop.getDouble();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "biomeApple", biomeApple);
        prop.setComment("Set to false to disable the world-gen of this mod's overworld apple orchards. [default: true]");
        biomeApple = prop.getBoolean();
        propOrder.add(prop.getName());

        //prop = cfg.get("Global World-Gen", "machinesRF", machinesRF);
        //prop.setComment("Prehistoric Nature machines need RF to function. [default: false]");
        //machinesRF = prop.getBoolean();
        //propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "sulphuricAcidGrief", sulphuricAcidGrief);
        prop.setComment("Sulphuric Acid causes griefing to organic blocks. [default: true]");
        sulphuricAcidGrief = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "sulphuricAcidInfinite", sulphuricAcidInfinite);
        prop.setComment("Allow Sulphuric Acid to form an infinite source like vanilla water. [default: false]");
        sulphuricAcidInfinite = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "modFire", modFire);
        prop.setComment("Set to false to disable this mod's custom Carboniferous fire (in case it is causing issues with other mods). [default: true]");
        modFire = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "genPalaeobotanist", genPalaeobotanist);
        prop.setComment("Percentage chance that a Palaeobotanist house will generate in a village. [default: 30]");
        genPalaeobotanist = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Global World-Gen", "genPalaeontologist", genPalaeontologist);
        prop.setComment("Percentage chance that a Palaeontologist house will generate in a village. [default: 30]");
        genPalaeontologist = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global Mobs", "doSpawnsPrehistoricFloraDefault", doSpawnsPrehistoricFloraDefault);
        prop.setComment("Set to false to disable the default mob-spawns from this mod. [default: true]");
        doSpawnsPrehistoricFloraDefault = prop.getBoolean();
        propOrder.add(prop.getName());
        prop = cfg.get("Global Mobs", "doSpawnsFossilsArcheology", doSpawnsFossilsArcheology);
        prop.setComment("Set to true add in appropriate mob-spawns from the mod Fossils and Archeology Revival [v.8.05]. [default: false]");
        doSpawnsFossilsArcheology = prop.getBoolean();
        propOrder.add(prop.getName());
        prop = cfg.get("Global Mobs", "doSpawnsReborn", doSpawnsReborn);
        prop.setComment("Set to true add in appropriate mob-spawns from the mod Jurassic World Reborn [v.1.1.1]. [default: false]");
        doSpawnsReborn = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "renderAnimations", renderAnimations);
        prop.setComment("Set to true to animate block-like mobs fully, or to false to render them as static blocks (useful for low performance graphics cards or for conflicts with Optifine). [default: true]");
        renderAnimations = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "renderEdiacaranLighting", renderEdiacaranLighting);
        prop.setComment("Set to false to switch off some of the light and shadowing effects in the Ediacaran dimension (useful for low performance graphics cards or for conflicts with Optifine). [default: true]");
        renderEdiacaranLighting = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "renderCustomSkies", renderCustomSkies);
        prop.setComment("Set to false to switch off custom sky effects in the modded dimensions (useful for low performance graphics cards or for conflicts with shaders). [default: true]");
        renderCustomSkies = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "renderBigMobsProperly", renderBigMobsProperly);
        prop.setComment("Set to false to switch off extended rendering of mobs when their hitboxes are offscreen (useful for low performance graphics cards). [default: true]");
        renderBigMobsProperly = prop.getBoolean();
        propOrder.add(prop.getName());

        //prop = cfg.get("Global World-Gen", "doShrinkBiomes", doShrinkBiomes);
        //prop.setComment("Set to true to try to make default biome sizes somewhat smaller (NOT RECOMMENDED: may compromise world-gen features and make worlds look bad or generate wrongly). [default: false]");
        //doShrinkBiomes = prop.getBoolean();
        //propOrder.add(prop.getName());



        prop = cfg.get("Global World-Gen", "doPropagation", doPropagation);
        prop.setComment("Use modded harvesting and propagation methods instead of vanilla shearing and sapling-drops, etc., for Prehistoric Nature plants [default: true]");
        doPropagation = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "doPropagationVanilla", doPropagationVanilla);
        prop.setComment("Use modded harvesting and propagation methods instead of vanilla shearing and sapling-drops, etc., for vanilla plants [default: false]");
        doPropagationVanilla = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "genAllPlants", genAllPlants);
        prop.setComment("If set to true then all plants from this mod will generate in the overworld, no matter how you set them in their own config section. You can still block them from biomes and dimensions in their individual settings. This setting does not affect algae. [default: false]");
        genAllPlants = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "spreadPlants", spreadPlants);
        prop.setComment("Percentage chance that a spreadable plant tries to spread when it receives a random tick (or is bonemealed). Does not affect other growth, only spread. (1 to 100) [default: 70]");
        spreadPlants = prop.getInt();
        propOrder.add(prop.getName());



        prop = cfg.get("Global World-Gen", "renderFog", renderFog);
        prop.setComment("Set to true to render custom fog effects in the Prehistoric dimensions. [default: true]");
        renderFog = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "fixZirconGlass", fixZirconGlass);
        prop.setComment("Set to false to disable the mod's zircon glass attempting to fix water rendering textures when a water plant is placed against it. [default: true]");
        fixZirconGlass = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Mobs", "waterHibbertopterus", waterHibbertopterus);
        prop.setComment("Distance NSEW from water that Hibbertopterus can go to without taking suffocation damage (1 to 16) [default: 2]");
        waterHibbertopterus = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterLimnoscelis", waterLimnoscelis);
        prop.setComment("Distance NSEW from water that Limnoscelis can go to without taking suffocation damage (1 to 16) [default: 10]");
        waterLimnoscelis = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterAcanthostega", waterAcanthostega);
        prop.setComment("Distance NSEW from water that Acathostega can go to without taking suffocation damage (1 to 16) [default: 2]");
        waterAcanthostega = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterPederpes", waterPederpes);
        prop.setComment("Distance NSEW from water that Pederpes can go to without taking suffocation damage (1 to 16) [default: 16]");
        waterPederpes = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterBalanerpeton", waterBalanerpeton);
        prop.setComment("Distance NSEW from water that Balanerpeton can go to without taking suffocation damage (1 to 16) [default: 8]");
        waterBalanerpeton = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterCacops", waterCacops);
        prop.setComment("Distance NSEW from water that Cacops can go to without taking suffocation damage (1 to 16) [default: 10]");
        waterCacops = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterDasyceps", waterDasyceps);
        prop.setComment("Distance NSEW from water that Dasyceps can go to without taking suffocation damage (1 to 16) [default: 10]");
        waterDasyceps = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterDvinosaurus", waterDvinosaurus);
        prop.setComment("Distance NSEW from water that Dvinosaurus can go to without taking suffocation damage (1 to 16) [default: 1]");
        waterDvinosaurus = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterMelosaurus", waterMelosaurus);
        prop.setComment("Distance NSEW from water that Melosaurus can go to without taking suffocation damage (1 to 16) [default: 4]");
        waterMelosaurus = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterPantylus", waterPantylus);
        prop.setComment("Distance NSEW from water that Pantylus can go to without taking suffocation damage (1 to 16) [default: 8]");
        waterPantylus = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterUranocentrodon", waterUranocentrodon);
        prop.setComment("Distance NSEW from water that Uranocentrodon can go to without taking suffocation damage (1 to 16) [default: 1]");
        waterUranocentrodon = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterPlatyhystrix", waterPlatyhystrix);
        prop.setComment("Distance NSEW from water that Platyhystrix can go to without taking suffocation damage (1 to 16) [default: 16]");
        waterPlatyhystrix = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterEryops", waterEryops);
        prop.setComment("Distance NSEW from water that Eryops can go to without taking suffocation damage (1 to 16) [default: 4]");
        waterEryops = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterCrassigyrinus", waterCrassigyrinus);
        prop.setComment("Distance NSEW from water that Crassigyrinus can go to without taking suffocation damage (1 to 16) [default: 1]");
        waterCrassigyrinus = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterBranchiosaur", waterBranchiosaur);
        prop.setComment("Distance NSEW from water that Branchiosaurs can go to without taking suffocation damage (1 to 16) [default: 1]");
        waterBranchiosaur = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterPanderichthys", waterPanderichthys);
        prop.setComment("Distance NSEW from water that Panderichthys can go to without taking suffocation damage (1 to 16) [default: 1]");
        waterPanderichthys = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterCeratodus", waterCeratodus);
        prop.setComment("Distance NSEW from water that Ceratodus can go to without taking suffocation damage (1 to 16) [default: 1]");
        waterCeratodus = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterGnathorhiza", waterGnathorhiza);
        prop.setComment("Distance NSEW from water that Gnathorhiza can go to without taking suffocation damage (1 to 16) [default: 1]");
        waterGnathorhiza = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterLaccognathus", waterLaccognathus);
        prop.setComment("Distance NSEW from water that Laccognathus can go to without taking suffocation damage (1 to 16) [default: 1]");
        waterLaccognathus = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterDiplocaulus", waterDiplocaulus);
        prop.setComment("Distance NSEW from water that Diplocaulus can go to without taking suffocation damage (1 to 16) [default: 1]");
        waterDiplocaulus = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterDiploceraspis", waterDiploceraspis);
        prop.setComment("Distance NSEW from water that Diploceraspis can go to without taking suffocation damage (1 to 16) [default: 1]");
        waterDiploceraspis = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterMastodonsaurus", waterMastodonsaurus);
        prop.setComment("Distance NSEW from water that Mastodonsaurus can go to without taking suffocation damage (1 to 16) [default: 1]");
        waterMastodonsaurus = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterAcanthostomatops", waterAcanthostomatops);
        prop.setComment("Distance NSEW from water that Acanthostomatops can go to without taking suffocation damage (1 to 16) [default: 6]");
        waterAcanthostomatops = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterPhlegethontia", waterPhlegethontia);
        prop.setComment("Distance NSEW from water that Phlegethontia can go to without taking suffocation damage (1 to 16) [default: 1]");
        waterPhlegethontia = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterProterogyrinus", waterProterogyrinus);
        prop.setComment("Distance NSEW from water that Proterogyrinus can go to without taking suffocation damage (1 to 16) [default: 7]");
        waterProterogyrinus = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterKalbarria", waterKalbarria);
        prop.setComment("Distance NSEW from water that Kalbarria can go to without taking suffocation damage (1 to 16) [default: 2]");
        waterKalbarria = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterEricixerxes", waterEricixerxes);
        prop.setComment("Distance NSEW from water that Ericixerxes can go to without taking suffocation damage (1 to 16) [default: 2]");
        waterEricixerxes = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterPlacodus", waterPlacodus);
        prop.setComment("Distance NSEW from water that Placodus can go to without taking suffocation damage (1 to 16) [default: 6]");
        waterPlacodus = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterAmphibamus", waterAmphibamus);
        prop.setComment("Distance NSEW from water that Amphibamus can go to without taking suffocation damage (1 to 16) [default: 8]");
        waterAmphibamus = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterIchthyostega", waterIchthyostega);
        prop.setComment("Distance NSEW from water that Ichthyostega can go to without taking suffocation damage (1 to 16) [default: 6]");
        waterIchthyostega = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterTiktaalik", waterTiktaalik);
        prop.setComment("Distance NSEW from water that Tiktaalik can go to without taking suffocation damage (1 to 16) [default: 6]");
        waterTiktaalik = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterParmastega", waterParmastega);
        prop.setComment("Distance NSEW from water that Parmastega can go to without taking suffocation damage (1 to 16) [default: 6]");
        waterParmastega = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterMetoposaurus", waterMetoposaurus);
        prop.setComment("Distance NSEW from water that Metoposaurus can go to without taking suffocation damage (1 to 16) [default: 6]");
        waterMetoposaurus = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterPrionosuchus", waterPrionosuchus);
        prop.setComment("Distance NSEW from water that Prionosuchus can go to without taking suffocation damage (1 to 16) [default: 6]");
        waterPrionosuchus = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Mobs", "waterPholiderpeton", waterPholiderpeton);
        prop.setComment("Distance NSEW from water that Pholiderpeton can go to without taking suffocation damage (1 to 16) [default: 7]");
        waterPholiderpeton = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterMegalocephalus", waterMegalocephalus);
        prop.setComment("Distance NSEW from water that Megalocephalus can go to without taking suffocation damage (1 to 16) [default: 4]");
        waterMegalocephalus = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Mobs", "waterSpathicephalus", waterSpathicephalus);
        prop.setComment("Distance NSEW from water that Spathicephalus can go to without taking suffocation damage (1 to 16) [default: 4]");
        waterSpathicephalus = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Mobs", "colourPulmonoscorpius", colourPulmonoscorpius);
        prop.setComment("Render the Pulmonoscorpius in a colourful, \"Prehistoric Park\"-inspired texture [default: true]");
        colourPulmonoscorpius = prop.getBoolean();
        propOrder.add(prop.getName());


        boolean changed = false;
        if (cfg.hasChanged()) {
            cfg.save();
            changed = true;
        }

        return changed;
    }
}
