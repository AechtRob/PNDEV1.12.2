package net.lepidodendron;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class LepidodendronConfig {
    public static Configuration cfg;
    public static LepidodendronConfig instance = new LepidodendronConfig();
    public static String[] genGlobalBlacklist = new String[0];
    public static String[] genWadeableBreaks = new String[]{"minecraft:waterlily", "lepidodendron:microvictoria_leaves", "lepidodendron:nelumbo_leaves", "lepidodendron:nuphar_leaves"};
    public static String[] genLogResin = new String[]{"minecraft:log:1", "lepidodendron:hymenaea_log", "lepidodendron:agathis_log", "lepidodendron:araucarioxylon_log", "lepidodendron:bunya_log", "lepidodendron:columnaris_log", "lepidodendron:cunninghamia_log", "lepidodendron:monkeypuzzle_log", "lepidodendron:sciadopitys_log", "lepidodendron:wollemi_log", "biomesoplenty:log_2:6", "biomesoplenty:log_0:7", "jurassicraft:araucaria_log", "wildnature:cedar_log", "wildnature:fir_log", "wildnature:pine_log", "lepidodendron:bristlecone_log", "lepidodendron:mirabilis_log", "lepidodendron:monkey_puzzle_araucaria_log", "lepidodendron:hoop_araucaria_log", "lepidodendron:scrubby_pine_log", "lepidodendron:araucarites_log", "lepidodendron:arid_pine_log", "lepidodendron:brachyphyllum_log", "lepidodendron:hirmeriella_log", "lepidodendron:cedar_log", "lepidodendron:cypress_log", "lepidodendron:dawn_redwood_log", "lepidodendron:elatocladus_log", "lepidodendron:redwood_log", "lepidodendron:pagiophyllum_log", "lepidodendron:podozamites_log", "lepidodendron:taxodium_log", "lepidodendron:telemachus_log", "lepidodendron:thuja_log", "lepidodendron:walchia_log"};
    public static String[] genLogLatex = new String[]{"lepidodendron:fig_log"};
    public static String[] submarineInventory = new String[]{"minecraft:white_shulker_box", "minecraft:orange_shulker_box", "minecraft:magenta_shulker_box", "minecraft:light_blue_shulker_box", "minecraft:yellow_shulker_box", "minecraft:lime_shulker_box", "minecraft:pink_shulker_box", "minecraft:gray_shulker_box", "minecraft:silver_shulker_box", "minecraft:cyan_shulker_box", "minecraft:purple_shulker_box", "minecraft:blue_shulker_box", "minecraft:brown_shulker_box", "minecraft:green_shulker_box", "minecraft:red_shulker_box", "minecraft:black_shulker_box"};
    public static String[] genFlowerpotExtras = new String[]{"biomesoplenty:flower_0:0","biomesoplenty:flower_0:1","biomesoplenty:flower_0:2","biomesoplenty:flower_0:3","biomesoplenty:flower_0:4","biomesoplenty:flower_0:5","biomesoplenty:flower_0:6","biomesoplenty:flower_0:7","biomesoplenty:flower_0:8","biomesoplenty:flower_0:9","biomesoplenty:flower_0:10","biomesoplenty:flower_0:11","biomesoplenty:flower_0:12","biomesoplenty:flower_0:13","biomesoplenty:flower_0:14","biomesoplenty:flower_0:15","biomesoplenty:flower_1:0","biomesoplenty:flower_1:1","biomesoplenty:flower_1:2","biomesoplenty:flower_1:3","biomesoplenty:flower_1:4","biomesoplenty:flower_1:5","biomesoplenty:mushroom:0","biomesoplenty:mushroom:1","biomesoplenty:mushroom:2","biomesoplenty:mushroom:3","biomesoplenty:mushroom:4","biomesoplenty:mushroom:5","biomesoplenty:plant_0:0","biomesoplenty:plant_0:1","biomesoplenty:plant_0:2","biomesoplenty:plant_0:3","biomesoplenty:plant_0:4","biomesoplenty:plant_0:5","biomesoplenty:plant_0:6","biomesoplenty:plant_0:7","biomesoplenty:plant_0:8","biomesoplenty:plant_0:9","biomesoplenty:plant_0:10","biomesoplenty:plant_0:11","biomesoplenty:plant_0:12","biomesoplenty:plant_0:13","biomesoplenty:plant_0:14","biomesoplenty:plant_0:15","biomesoplenty:plant_1:0","biomesoplenty:plant_1:1","biomesoplenty:plant_1:2","biomesoplenty:plant_1:3","biomesoplenty:plant_1:4","biomesoplenty:plant_1:5","biomesoplenty:plant_1:6","biomesoplenty:plant_1:7","biomesoplenty:plant_1:8","biomesoplenty:plant_1:9","biomesoplenty:plant_1:10","biomesoplenty:plant_1:11","biomesoplenty:sapling_0:0","biomesoplenty:sapling_0:1","biomesoplenty:sapling_0:2","biomesoplenty:sapling_0:3","biomesoplenty:sapling_0:4","biomesoplenty:sapling_0:5","biomesoplenty:sapling_0:6","biomesoplenty:sapling_0:7","biomesoplenty:sapling_1:0","biomesoplenty:sapling_1:1","biomesoplenty:sapling_1:2","biomesoplenty:sapling_1:3","biomesoplenty:sapling_1:4","biomesoplenty:sapling_1:5","biomesoplenty:sapling_1:6","biomesoplenty:sapling_1:7","biomesoplenty:sapling_2:0","biomesoplenty:sapling_2:1","biomesoplenty:sapling_2:2","biomesoplenty:sapling_2:3","biomesoplenty:sapling_2:4","biomesoplenty:sapling_2:5","biomesoplenty:sapling_1:6","biomesoplenty:sapling_1:7"};
    public static boolean genFlowerpotWithQuark = false;
    public static String[] genFishableOredicts = new String[]{"listAllfishraw","pnfurnaceCalamari","pnfurnaceScampi","pnfurnaceCrustacean","pnfurnaceAmphibian","pnfurnaceSeafood","pnfurnaceFish"};
    public static String[] genPlantPrehistoric = new String[]{"fossil:bennettitales_large", "fossil:bennettitales_small", "fossil:calamites_leaves", "fossil:calamites_sapling", "fossil:cordaites_leaves", "fossil:cordaites_sapling", "fossil:crataegus", "fossil:cyathea", "fossil:dictyophyllum", "fossil:dillhoffia_flower", "fossil:dipteris", "fossil:duisbergia", "fossil:ependra", "fossil:fern_block", "fossil:florissantia", "fossil:foozia", "fossil:fossil_sapling_calamites", "fossil:fossil_sapling_cordaites", "fossil:fossil_sapling_palae", "fossil:fossil_sapling_sigillaria", "fossil:horsetail_small", "fossil:licopodiophyta", "fossil:osmunda", "fossil:palm_leaves", "fossil:palm_sapling", "fossil:sagenopteris", "fossil:sarracenia", "fossil:sigillaria_leaves", "fossil:sigillaria_sapling", "fossil:tempskya", "fossil:vaccinium", "fossil:welwitschia", "fossil:zamites", "jurassicraft:ajuginucula_smithii", "jurassicraft:ajuginucula_smithii_leaves", "jurassicraft:araucaria_leaves", "jurassicraft:araucaria_sapling", "jurassicraft:bennettitalean_cycadeoidea", "jurassicraft:bristle_fern", "jurassicraft:calamites_leaves", "jurassicraft:calamites_sapling", "jurassicraft:cinnamon_fern", "jurassicraft:cry_pansy", "jurassicraft:cycad_zamites", "jurassicraft:dicksonia", "jurassicraft:dicroidium_zuberi", "jurassicraft:dictyophyllum", "jurassicraft:encephalartos", "jurassicraft:ginkgo_leaves", "jurassicraft:ginkgo_sapling", "jurassicraft:gracilaria_seaweed", "jurassicraft:graminidites_bambusoides", "jurassicraft:heliconia", "jurassicraft:ladinia_simplex", "jurassicraft:moss", "jurassicraft:orontium_mackii", "jurassicraft:paleo_bale_cycad", "jurassicraft:paleo_bale_cycadeoidea", "jurassicraft:paleo_bale_fern", "jurassicraft:paleo_bale_leaves", "jurassicraft:paleo_bale_other", "jurassicraft:phoenix_leaves", "jurassicraft:phoenix_sapling", "jurassicraft:psaronius_leaves", "jurassicraft:psaronius_sapling", "jurassicraft:raphaelia", "jurassicraft:rhacophyton", "jurassicraft:rhamnus_salicifolius", "jurassicraft:scaly_tree_fern", "jurassicraft:serenna_veriformans", "jurassicraft:small_chain_fern", "jurassicraft:small_cycad", "jurassicraft:small_royal_fern", "jurassicraft:tempskya", "jurassicraft:umaltolepis", "jurassicraft:west_indian_lilac", "jurassicraft:woolly_stalked_begonia", "rebornmod:ajuginucula_smithii", "rebornmod:ajuginucula_smithii_leaves", "rebornmod:araucaria_leaves", "rebornmod:araucaria_sapling", "rebornmod:bennettitalean_cycadeoidea", "rebornmod:bristle_fern", "rebornmod:calamites_leaves", "rebornmod:calamites_sapling", "rebornmod:cinnamon_fern", "rebornmod:cry_pansy", "rebornmod:cycad_zamites", "rebornmod:dicksonia", "rebornmod:dicroidium_zuberi", "rebornmod:dictyophyllum", "rebornmod:encephalartos", "rebornmod:ginkgo_leaves", "rebornmod:ginkgo_sapling", "rebornmod:gracilaria_seaweed", "rebornmod:graminidites_bambusoides", "rebornmod:heliconia", "rebornmod:ladinia_simplex", "rebornmod:moss", "rebornmod:orontium_mackii", "rebornmod:paleo_bale_cycad", "rebornmod:paleo_bale_cycadeoidea", "rebornmod:paleo_bale_fern", "rebornmod:paleo_bale_leaves", "rebornmod:paleo_bale_other", "rebornmod:phoenix_leaves", "rebornmod:phoenix_sapling", "rebornmod:psaronius_leaves", "rebornmod:psaronius_sapling", "rebornmod:raphaelia", "rebornmod:rhacophyton", "rebornmod:rhamnus_salicifolius", "rebornmod:scaly_tree_fern", "rebornmod:serenna_veriformans", "rebornmod:small_chain_fern", "rebornmod:small_cycad", "rebornmod:small_royal_fern", "rebornmod:tempskya", "rebornmod:umaltolepis", "rebornmod:west_indian_lilac", "rebornmod:woolly_stalked_begonia"};
    public static int waterSandHorizontal = 6;
    public static int waterSandVertical = 0;
    public static int extractionSpeed = 1200;
    public static int waterPangaeanHorizontal = 3;
    public static int waterPangaeanVertical = 0;
    public static int taxidermyRenderRange = 48;
    public static int researchMax = 7500;
    public static int researchPortal = 5;
    public static int spreadPlants = 70;
    public static boolean spreadPlantsAtAll = true;
    public static boolean biomeApple = true;
    public static boolean biomeOlive = true;
    //public static boolean digsiteGen = true;
    public static int digsiteTentColour = 12;
    public static int digsiteBedColour = 7;
    public static int digsiteCarpetColour = 8;
    public static String[] digsiteBiomeBlacklist = new String[0];
    public static int[] digsiteDimensionWhiteList = new int[]{0};
    public static int digsiteRarity = 50;
    public static boolean machinesRF = false;
    public static boolean sulphuricAcidGrief = true;
    public static boolean sulphuricAcidInfinite = false;
    public static boolean giveBook = true;
    public static boolean submarineNightvision = true;
    public static boolean doGrazeGrief = true;
    public static int[] dimFireSpreadBlacklist = new int[0];

    public static boolean genFossil = true;
    public static boolean genStone = true;
    public static int dropSeeds = 50;
    public static int palaeopediaTruncation = 24;
    public static double genEdiacaran = 0.66D;
    public static double junkFossil = 20.0;
    public static double playerSleepPercent = 100.0;
    public static boolean playerSleep = true;
    public static boolean modFire = true;
    public static boolean modFlowerpot = true;
    public static boolean modFishing = true;
    public static int genPalaeobotanist = 30;
    public static int genPalaeontologist = 30;
    public static boolean renderAnimations = true;
    public static boolean renderCustomSkies = true;
    public static boolean renderBigMobsProperly = true;
    public static boolean blockSkeletonHorse = true;
    public static boolean blockMobs = true;
    public static boolean blockMobsFAExceptions = true;
    public static boolean doMeteorites = true;
    public static boolean doVolcanos = true;
    public static boolean doMeteoritesGriefing = true;
    public static boolean doVolcanoGriefing = true;
    public static int doVolcanoNether = 100;
    public static double doGuanoGriefing = 1.00;
    public static double doGuanoBats = 1.00;
    public static boolean fixApples = true;
    public static boolean doReSpawner = true;
    public static boolean doShoalingFlocking = true;
    public static double doShoalingFlockingFactor = 1.0;
    public static double submarineWarning = 5.0;
    
    public static boolean doShrinkBiomes = true;

    public static boolean renderFog = true;
    public static boolean fixZirconGlass = true;

    public static int attackHealth = 90;
    public static int adultAge = 75;
    public static int breedCooldown = 6000;
    public static int nestSearch = 32;
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
    public static int dimCretaceousEarly = -86;
    public static int dimOrdovician = -87;
    public static int dimPaleogene = -88;
    public static int dimNeogene = -89;
    public static int dimPleistocene = -90;
    public static int dimCretaceousLate = -91;

    public static boolean doSpawnsPrehistoricFloraDefault = true;
//    public static boolean doSpawnsFossilsArcheology = false;
//    public static boolean doSpawnsReborn = false;
    public static boolean globalHomePortals = false;
    public static boolean oneWayPortals = true;
    public static boolean oneWayPortalsNether = false;

    public static String[] mobSpawnBespoke = new String[0];

    public static String[] jarMobs = new String[0];

    public static String[] revMobsPrecambrian = new String[0];
    public static String[] revMobsCambrian = new String[0];
    public static String[] revMobsOrdovician = new String[0];
    public static String[] revMobsSilurian = new String[0];
    public static String[] revMobsDevonian = new String[0];
    public static String[] revMobsCarboniferous = new String[0];
    public static String[] revMobsPermian = new String[0];
    public static String[] revMobsTriassic = new String[0];
    public static String[] revMobsJurassic = new String[0];
    public static String[] revMobsCretaceous = new String[0];
    public static String[] revMobsPaleogene = new String[0];
    public static String[] revMobsNeogene = new String[0];
    public static String[] revMobsPleistocene = new String[0];

    public static String[] revPlantsPrecambrian = new String[0];
    public static String[] revPlantsCambrian = new String[0];
    public static String[] revPlantsOrdovician = new String[0];
    public static String[] revPlantsSilurian = new String[0];
    public static String[] revPlantsDevonian = new String[0];
    public static String[] revPlantsCarboniferous = new String[0];
    public static String[] revPlantsPermian = new String[0];
    public static String[] revPlantsTriassic = new String[0];
    public static String[] revPlantsJurassic = new String[0];
    public static String[] revPlantsCretaceous = new String[0];
    public static String[] revPlantsPaleogene = new String[0];
    public static String[] revPlantsNeogene = new String[0];
    public static String[] revPlantsPleistocene = new String[0];

    public static String[] revStaticsPrecambrian = new String[0];
    public static String[] revStaticsCambrian = new String[0];
    public static String[] revStaticsOrdovician = new String[0];
    public static String[] revStaticsSilurian = new String[0];
    public static String[] revStaticsDevonian = new String[0];
    public static String[] revStaticsCarboniferous = new String[0];
    public static String[] revStaticsPermian = new String[0];
    public static String[] revStaticsTriassic = new String[0];
    public static String[] revStaticsJurassic = new String[0];
    public static String[] revStaticsCretaceous = new String[0];
    public static String[] revStaticsPaleogene = new String[0];
    public static String[] revStaticsNeogene = new String[0];
    public static String[] revStaticsPleistocene = new String[0];

    public static boolean showTooltips = true;
    public static boolean doPropagation = true;
    public static boolean doPropagationVanilla = false;
    public static boolean genAllPlants = false;
    public static boolean genAllPlantsModern = false;

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
    public static int waterPhlegethontia = 2;
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
    public static boolean colourPulmonoscorpius = false;
    public static int waterPederpes = 16;
    public static int waterPlatyhystrix = 16;
    public static int waterBalanerpeton = 8;
    public static int waterMetoposaurus = 8;
    public static int waterCacops = 10;
    public static int waterDasyceps = 10;
    public static int waterDvinosaurus = 3;
    public static int waterTrypanognathus = 3;
    public static int waterMelosaurus = 4;
    public static int waterPantylus = 8;
    public static int waterUranocentrodon = 3;

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
        ObjectList<String> propOrder = new ObjectArrayList<>();
        Property prop = cfg.get("Global World-Gen", "genGlobalBlacklist", genGlobalBlacklist);
        prop.setComment("List of biomes all plants are blacklisted from, in the format: modid:biomeid [default: empty]");
        genGlobalBlacklist = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revMobsPrecambrian", revMobsPrecambrian);
        prop.setComment("List of mobs from OTHER mods which can be found in Precambrian fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revMobsPrecambrian = prop.getStringList();
        propOrder.add(prop.getName());
        
        prop = cfg.get("Revival Integration", "revMobsCambrian", revMobsCambrian);
        prop.setComment("List of mobs from OTHER mods which can be found in Cambrian fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revMobsCambrian = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revMobsOrdovician", revMobsOrdovician);
        prop.setComment("List of mobs from OTHER mods which can be found in Ordovician fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revMobsOrdovician = prop.getStringList();
        propOrder.add(prop.getName());
        
        prop = cfg.get("Revival Integration", "revMobsSilurian", revMobsSilurian);
        prop.setComment("List of mobs from OTHER mods which can be found in Silurian fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revMobsSilurian = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revMobsDevonian", revMobsDevonian);
        prop.setComment("List of mobs from OTHER mods which can be found in Devonian fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revMobsDevonian = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revMobsCarboniferous", revMobsCarboniferous);
        prop.setComment("List of mobs from OTHER mods which can be found in Carboniferous fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revMobsCarboniferous = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revMobsPermian", revMobsPermian);
        prop.setComment("List of mobs from OTHER mods which can be found in Permian fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revMobsPermian = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revMobsTriassic", revMobsTriassic);
        prop.setComment("List of mobs from OTHER mods which can be found in Triassic fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revMobsTriassic = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revMobsJurassic", revMobsJurassic);
        prop.setComment("List of mobs from OTHER mods which can be found in Jurassic fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revMobsJurassic = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revMobsCretaceous", revMobsCretaceous);
        prop.setComment("List of mobs from OTHER mods which can be found in Cretaceous fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revMobsCretaceous = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revMobsPaleogene", revMobsPaleogene);
        prop.setComment("List of mobs from OTHER mods which can be found in Paleogene fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revMobsPaleogene = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revMobsNeogene", revMobsNeogene);
        prop.setComment("List of mobs from OTHER mods which can be found in Neogene fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revMobsNeogene = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revMobsPleistocene", revMobsPleistocene);
        prop.setComment("List of mobs from OTHER mods which can be found in Pleistocene fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revMobsPleistocene = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revPlantsPrecambrian", revPlantsPrecambrian);
        prop.setComment("List of plants from OTHER mods which can be found in Precambrian fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revPlantsPrecambrian = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revPlantsCambrian", revPlantsCambrian);
        prop.setComment("List of plants from OTHER mods which can be found in Cambrian fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revPlantsCambrian = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revPlantsOrdovician", revPlantsOrdovician);
        prop.setComment("List of plants from OTHER mods which can be found in Ordovician fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revPlantsOrdovician = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revPlantsSilurian", revPlantsSilurian);
        prop.setComment("List of plants from OTHER mods which can be found in Silurian fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revPlantsSilurian = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revPlantsDevonian", revPlantsDevonian);
        prop.setComment("List of plants from OTHER mods which can be found in Devonian fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revPlantsDevonian = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revPlantsCarboniferous", revPlantsCarboniferous);
        prop.setComment("List of plants from OTHER mods which can be found in Carboniferous fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revPlantsCarboniferous = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revPlantsPermian", revPlantsPermian);
        prop.setComment("List of plants from OTHER mods which can be found in Permian fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revPlantsPermian = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revPlantsTriassic", revPlantsTriassic);
        prop.setComment("List of plants from OTHER mods which can be found in Triassic fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revPlantsTriassic = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revPlantsJurassic", revPlantsJurassic);
        prop.setComment("List of plants from OTHER mods which can be found in Jurassic fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revPlantsJurassic = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revPlantsCretaceous", revPlantsCretaceous);
        prop.setComment("List of plants from OTHER mods which can be found in Cretaceous fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revPlantsCretaceous = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revPlantsPaleogene", revPlantsPaleogene);
        prop.setComment("List of plants from OTHER mods which can be found in Paleogene fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revPlantsPaleogene = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revPlantsNeogene", revPlantsNeogene);
        prop.setComment("List of plants from OTHER mods which can be found in Neogene fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revPlantsNeogene = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revPlantsPleistocene", revPlantsPleistocene);
        prop.setComment("List of plants from OTHER mods which can be found in Pleistocene fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revPlantsPleistocene = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revStaticsPrecambrian", revStaticsPrecambrian);
        prop.setComment("List of static creatures from OTHER mods which can be found in Precambrian fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revStaticsPrecambrian = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revStaticsCambrian", revStaticsCambrian);
        prop.setComment("List of static creatures from OTHER mods which can be found in Cambrian fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revStaticsCambrian = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revStaticsOrdovician", revStaticsOrdovician);
        prop.setComment("List of static creatures from OTHER mods which can be found in Ordovician fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revStaticsOrdovician = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revStaticsSilurian", revStaticsSilurian);
        prop.setComment("List of static creatures from OTHER mods which can be found in Silurian fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revStaticsSilurian = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revStaticsDevonian", revStaticsDevonian);
        prop.setComment("List of static creatures from OTHER mods which can be found in Devonian fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revStaticsDevonian = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revStaticsCarboniferous", revStaticsCarboniferous);
        prop.setComment("List of static creatures from OTHER mods which can be found in Carboniferous fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revStaticsCarboniferous = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revStaticsPermian", revStaticsPermian);
        prop.setComment("List of static creatures from OTHER mods which can be found in Permian fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revStaticsPermian = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revStaticsTriassic", revStaticsTriassic);
        prop.setComment("List of static creatures from OTHER mods which can be found in Triassic fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revStaticsTriassic = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revStaticsJurassic", revStaticsJurassic);
        prop.setComment("List of static creatures from OTHER mods which can be found in Jurassic fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revStaticsJurassic = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revStaticsCretaceous", revStaticsCretaceous);
        prop.setComment("List of static creatures from OTHER mods which can be found in Cretaceous fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revStaticsCretaceous = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revStaticsPaleogene", revStaticsPaleogene);
        prop.setComment("List of static creatures from OTHER mods which can be found in Paleogene fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revStaticsPaleogene = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revStaticsNeogene", revStaticsNeogene);
        prop.setComment("List of static creatures from OTHER mods which can be found in Neogene fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revStaticsNeogene = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Revival Integration", "revStaticsPleistocene", revStaticsPleistocene);
        prop.setComment("List of static creatures from OTHER mods which can be found in Pleistocene fossils from the Acid Bath, in the format: modid:entityid [default: empty]");
        revStaticsPleistocene = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "genWadeableBreaks", genWadeableBreaks);
        prop.setComment("List of blocks which are destroyed by wading animals (to avoid getting stuck on them): modid:blockid:meta [default: \"minecraft:waterlily\", \"lepidodendron:microvictoria_leaves\", \"lepidodendron:nelumbo_leaves\", \"lepidodendron:nuphar_leaves\"]");
        genWadeableBreaks = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "genFishableOredicts", genFishableOredicts);
        prop.setComment("List of fish-oreDicts which can be fished up in the prehiostoric dimensions [default: \"listAllfishraw\",\"pnfurnaceCalamari\",\"pnfurnaceScampi\",\"pnfurnaceCrustacean\",\"pnfurnaceAmphibian\",\"pnfurnaceSeafood\",\"pnfurnaceFish\"]");
        genFishableOredicts = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "genLogResin", genLogResin);
        prop.setComment("List of log blocks which produce resin, in the format: modid:blockid:meta [default: \"minecraft:log:1\", \"lepidodendron:hymenaea_log\", \"lepidodendron:agathis_log\", \"lepidodendron:araucarioxylon_log\", \"lepidodendron:bunya_log\", \"lepidodendron:columnaris_log\", \"lepidodendron:cunninghamia_log\", \"lepidodendron:monkeypuzzle_log\", \"lepidodendron:sciadopitys_log\", \"lepidodendron:wollemi_log\", \"biomesoplenty:log_2:6\", \"biomesoplenty:log_0:7\", \"jurassicraft:araucaria_log\", \"wildnature:cedar_log\", \"wildnature:fir_log\", \"wildnature:pine_log\", \"lepidodendron:bristlecone_log\", \"lepidodendron:mirabilis_log\", \"lepidodendron:monkey_puzzle_araucaria_log\", \"lepidodendron:hoop_araucaria_log\", \"lepidodendron:scrubby_pine_log\", \"lepidodendron:araucarites_log\", \"lepidodendron:arid_pine_log\", \"lepidodendron:brachyphyllum_log\", \"lepidodendron:hirmeriella_log\", \"lepidodendron:cedar_log\", \"lepidodendron:cypress_log\", \"lepidodendron:dawn_redwood_log\", \"lepidodendron:elatocladus_log\", \"lepidodendron:redwood_log\", \"lepidodendron:pagiophyllum_log\", \"lepidodendron:podozamites_log\", \"lepidodendron:taxodium_log\", \"lepidodendron:telemachus_log\", \"lepidodendron:thuja_log\", \"lepidodendron:walchia_log\"]");
        genLogResin = prop.getStringList();
        propOrder.add(prop.getName());
        prop = cfg.get("Global World-Gen", "genLogLatex", genLogLatex);
        prop.setComment("List of log blocks which produce latex, in the format: modid:blockid:meta [default: \"lepidodendron:fig_log\"]");
        genLogLatex = prop.getStringList();
        propOrder.add(prop.getName());
        prop = cfg.get("Global World-Gen", "genFlowerpotExtras", genFlowerpotExtras);
        prop.setComment("List of extra plants to put into flower pots, in the format: modid:blockid:meta [default: \"biomesoplenty:flower_0:0\",\"biomesoplenty:flower_0:1\",\"biomesoplenty:flower_0:2\",\"biomesoplenty:flower_0:3\",\"biomesoplenty:flower_0:4\",\"biomesoplenty:flower_0:5\",\"biomesoplenty:flower_0:6\",\"biomesoplenty:flower_0:7\",\"biomesoplenty:flower_0:8\",\"biomesoplenty:flower_0:9\",\"biomesoplenty:flower_0:10\",\"biomesoplenty:flower_0:11\",\"biomesoplenty:flower_0:12\",\"biomesoplenty:flower_0:13\",\"biomesoplenty:flower_0:14\",\"biomesoplenty:flower_0:15\",\"biomesoplenty:flower_1:0\",\"biomesoplenty:flower_1:1\",\"biomesoplenty:flower_1:2\",\"biomesoplenty:flower_1:3\",\"biomesoplenty:flower_1:4\",\"biomesoplenty:flower_1:5\",\"biomesoplenty:mushroom:0\",\"biomesoplenty:mushroom:1\",\"biomesoplenty:mushroom:2\",\"biomesoplenty:mushroom:3\",\"biomesoplenty:mushroom:4\",\"biomesoplenty:mushroom:5\",\"biomesoplenty:plant_0:0\",\"biomesoplenty:plant_0:1\",\"biomesoplenty:plant_0:2\",\"biomesoplenty:plant_0:3\",\"biomesoplenty:plant_0:4\",\"biomesoplenty:plant_0:5\",\"biomesoplenty:plant_0:6\",\"biomesoplenty:plant_0:7\",\"biomesoplenty:plant_0:8\",\"biomesoplenty:plant_0:9\",\"biomesoplenty:plant_0:10\",\"biomesoplenty:plant_0:11\",\"biomesoplenty:plant_0:12\",\"biomesoplenty:plant_0:13\",\"biomesoplenty:plant_0:14\",\"biomesoplenty:plant_0:15\",\"biomesoplenty:plant_1:0\",\"biomesoplenty:plant_1:1\",\"biomesoplenty:plant_1:2\",\"biomesoplenty:plant_1:3\",\"biomesoplenty:plant_1:4\",\"biomesoplenty:plant_1:5\",\"biomesoplenty:plant_1:6\",\"biomesoplenty:plant_1:7\",\"biomesoplenty:plant_1:8\",\"biomesoplenty:plant_1:9\",\"biomesoplenty:plant_1:10\",\"biomesoplenty:plant_1:11\",\"biomesoplenty:sapling_0:0\",\"biomesoplenty:sapling_0:1\",\"biomesoplenty:sapling_0:2\",\"biomesoplenty:sapling_0:3\",\"biomesoplenty:sapling_0:4\",\"biomesoplenty:sapling_0:5\",\"biomesoplenty:sapling_0:6\",\"biomesoplenty:sapling_0:7\",\"biomesoplenty:sapling_1:0\",\"biomesoplenty:sapling_1:1\",\"biomesoplenty:sapling_1:2\",\"biomesoplenty:sapling_1:3\",\"biomesoplenty:sapling_1:4\",\"biomesoplenty:sapling_1:5\",\"biomesoplenty:sapling_1:6\",\"biomesoplenty:sapling_1:7\",\"biomesoplenty:sapling_2:0\",\"biomesoplenty:sapling_2:1\",\"biomesoplenty:sapling_2:2\",\"biomesoplenty:sapling_2:3\",\"biomesoplenty:sapling_2:4\",\"biomesoplenty:sapling_2:5\",\"biomesoplenty:sapling_1:6\",\"biomesoplenty:sapling_1:7\"]");
        genFlowerpotExtras = prop.getStringList();
        propOrder.add(prop.getName());
        prop = cfg.get("Global World-Gen", "genFlowerpotWithQuark", genFlowerpotWithQuark);
        prop.setComment("By default, if you have Quark installed, the Prehistoric Nature flower pots will not be present, because they crash with Quark flower pots. If you are sure you have switched off Quark's own flower pots in the Quark config (B:\"Better vanilla flower pot\"=false), you can forcefully add Prehistoric Nature's ones instead by setting this to true. If you don't have Quark installed this will do nothing. [default: false]");
        genFlowerpotWithQuark = prop.getBoolean();
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

        prop = cfg.get("Rendering and Optimisation", "taxidermyRenderRange", taxidermyRenderRange);
        prop.setComment("Amount of blocks' distance the player can be at before taxidermy does not render on-screen (16 to 254) [default: 48]");
        taxidermyRenderRange = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "researchMax", researchMax);
        prop.setComment("Reduce or increase this to set the total maximum research level for the Fossil Researcher machine [default: 7500]");
        researchMax = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "researchPortal", researchPortal);
        prop.setComment("The percentage of research needed in order to obtain a portal block to a dimension [default: 5]");
        researchPortal = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "showTooltips", showTooltips);
        prop.setComment("Shows useful, searchable tooltips on relevant items [default: true]");
        showTooltips = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "doMeteorites", doMeteorites);
        prop.setComment("Enable meteors in the relevant dimensions [default: true]");
        doMeteorites = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "doVolcanos", doVolcanos);
        prop.setComment("Allow volcanos to erupt [default: true]");
        doVolcanos = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "doVolcanoGriefing", doVolcanoGriefing);
        prop.setComment("Volcano fireballs set things on fire (note that this is also tied to the more general mobGriefing gamerule) [default: true]");
        doVolcanoGriefing = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "doVolcanoNether", doVolcanoNether);
        prop.setComment("A value to control how many volcano fireballs can be produced in the Nether [default: 120]");
        doVolcanoNether = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "doMeteoritesGriefing", doMeteoritesGriefing);
        prop.setComment("Make meteorites cause craters and fire, and leave iron ore (note that meteorite griefing is also tied to the more general mobGriefing gamerule) [default: true]");
        doMeteoritesGriefing = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "doGuanoGriefing", doGuanoGriefing);
        prop.setComment("Frequency (0.00-1000.00) at which some appropriate flying creatures drop guano ambiently (note that guano is also tied to the more general mobGriefing gamerule) [default: 1.00]");
        doGuanoGriefing = prop.getDouble();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "doGuanoBats", doGuanoBats);
        prop.setComment("Frequency (0.00-1000.00) at which vanilla bats drop guano ambiently while roosting (note that guano is also tied to the more general mobGriefing gamerule) [default: 1.00]");
        doGuanoBats = prop.getDouble();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "doReSpawner", doReSpawner);
        prop.setComment("Allow the mob ReSpawner item in the mod [default: true]");
        doReSpawner = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "fixApples", fixApples);
        prop.setComment("Make apples drop exclusively from apple trees [default: true]");
        fixApples = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global Mobs", "doGrazeGrief", doGrazeGrief);
        prop.setComment("Allow Prehistoric Nature creatures to destroy blocks when grazing [default: true]");
        doGrazeGrief = prop.getBoolean();
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


        
        prop = cfg.get("Global World-Gen", "doShoalingFlocking", doShoalingFlocking);
        prop.setComment("Allow appropriate fish to shoal and land mobs to flock (may be resource-intensive for weak PCs) [default: true]");
        doShoalingFlocking = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "doShoalingFlockingFactor", doShoalingFlockingFactor);
        prop.setComment("A factor to use to increase or decrease the frequency of game calculations done for shoaling and flocking (do not change this unless you have performance issues, and probably you want to decrease it, not increase it!) [default: 1.0]");
        doShoalingFlockingFactor = prop.getDouble();
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
        prop.setComment("Ageable mobs will behave as adults once they are at least this percentage of full age (hunting, dropping eggs, etc.). This does not affect models/textures. [default: 75]");
        adultAge = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Global Mobs", "breedCooldown", breedCooldown);
        prop.setComment("Number of game ticks after breeding that it takes to be able to breed the same creature again (20 ticks = 1 real-world second). [default: 6000]");
        breedCooldown = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global Mobs", "nestSearch", nestSearch);
        prop.setComment("For creatures which have nests, this is the radius of search they make to locate a new nest. If you get lag, try reducing this [default: 32 (8 to 64 limits)]");
        nestSearch = prop.getInt();
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

        prop = cfg.get("Global World-Gen", "dimCretaceous", dimCretaceousEarly);
        prop.setComment("Dimension number of the Cretaceous dimension. Do not change this unless you get errors [default: -86]");
        dimCretaceousEarly = prop.getInt();
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

        prop = cfg.get("Global World-Gen", "dimCretaceous", dimCretaceousEarly);
        prop.setComment("Dimension number of the Cretaceous dimension. Do not change this unless you get errors [default: -84]");
        dimCretaceousEarly = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "genFossil", genFossil);
        prop.setComment("Set to false to disable the world-gen of this mod's fossil blocks. [default: true]");
        genFossil = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "genStone", genStone);
        prop.setComment("Set to false to disable the world-gen of this mod's stone blocks in the overworld. [default: true]");
        genStone = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "dropSeeds", dropSeeds);
        prop.setComment("Small Angiosperm Seeds drop on average one time in every n breaks, where this number is n (0-10000). [default: 50]");
        dropSeeds = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "palaeopediaTruncation", palaeopediaTruncation);
        prop.setComment("The Palaeopedia lists of mobs, plants and statics will truncate each line/name after this many characters [0-24]. [default: 24]");
        palaeopediaTruncation = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "junkFossil", junkFossil);
        prop.setComment("Percentage chance that the acid bath returns a junk output instead of a fossil (0-100). [default: 20]");
        junkFossil = prop.getDouble();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "playerSleep", playerSleep);
        prop.setComment("Allow Prehistoric Nature to manage player sleeping in dimensions and multiplayer. [default: true]");
        playerSleep = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "playerSleepPercent", playerSleepPercent);
        prop.setComment("Percentage of sleepable (including creative) players who must sleep in order for a night to pass (0-100). [default: 100.0]");
        playerSleepPercent = prop.getDouble();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "biomeApple", biomeApple);
        prop.setComment("Set to false to disable the world-gen of this mod's overworld apple orchards. [default: true]");
        biomeApple = prop.getBoolean();
        propOrder.add(prop.getName());


//        prop = cfg.get("Global World-Gen", "digsiteGen", digsiteGen);
//        prop.setComment("Set to false to disable the world-gen of this mod's fossil digsites. [default: true]");
//        digsiteGen = prop.getBoolean();
//        propOrder.add(prop.getName());
        prop = cfg.get("Global World-Gen", "digsiteTentColour", digsiteTentColour);
        prop.setComment("Change to a different metadata number to use a different colour of wool, or use -1 for a random single colour or -2 for completely random patchwork. [default: 12]");
        digsiteTentColour = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Global World-Gen", "digsiteBedColour", digsiteBedColour);
        prop.setComment("Change to a different metadata number to use a different colour of bed, or use -1 for a random single colour. [default: 7]");
        digsiteBedColour = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Global World-Gen", "digsiteCarpetColour", digsiteCarpetColour);
        prop.setComment("Change to a different metadata number to use a different colour of carpet, or use -1 for a random single colour or -2 for completely random patchwork. [default: 8]");
        digsiteCarpetColour = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Global World-Gen", "digsiteBiomeBlacklist", digsiteBiomeBlacklist);
        prop.setComment("A list of biomes digsites are blacklisted from. [default: empty]");
        digsiteBiomeBlacklist = prop.getStringList();
        propOrder.add(prop.getName());
        prop = cfg.get("Global World-Gen", "digsiteDimensionWhiteList", digsiteDimensionWhiteList);
        prop.setComment("A list of dimensions IDs digsites can generate in. [default: 0]");
        digsiteDimensionWhiteList = prop.getIntList();
        propOrder.add(prop.getName());
        prop = cfg.get("WorldGen Lepidodendron", "digSiteRarity", digsiteRarity);
        prop.setComment("One in this many chunks will try to generate a digsite, or set to zero to disable (note, most attempts will fail due to unsuitable terrain) [default: 50]");
        digsiteRarity = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Global World-Gen", "dimFireSpreadBlacklist", dimFireSpreadBlacklist);
        prop.setComment("A list of dimensions IDs where you want to stop fire from being able to spread. [default: empty]");
        dimFireSpreadBlacklist = prop.getIntList();
        propOrder.add(prop.getName());


        prop = cfg.get("Global World-Gen", "biomeOlive", biomeOlive);
        prop.setComment("Set to false to disable the world-gen of this mod's overworld olive groves. [default: true]");
        biomeOlive = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "machinesRF", machinesRF);
        prop.setComment("Prehistoric Nature machines need RF to function. [default: false]");
        machinesRF = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "giveBook", giveBook);
        prop.setComment("Give new players a copy of the Palaeopedia when they join. [default: true]");
        giveBook = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "submarineNightvision", submarineNightvision);
        prop.setComment("Players have night-vision when in a submarine. [default: true]");
        submarineNightvision = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "submarineInventory", submarineInventory);
        prop.setComment("List of items which can be used to provide the submarine with an inventory, in the format: modid:blockid:meta [default: \"minecraft:white_shulker_box\", \"minecraft:orange_shulker_box\", \"minecraft:magenta_shulker_box\", \"minecraft:light_blue_shulker_box\", \"minecraft:yellow_shulker_box\", \"minecraft:lime_shulker_box\", \"minecraft:pink_shulker_box\", \"minecraft:gray_shulker_box\", \"minecraft:silver_shulker_box\", \"minecraft:cyan_shulker_box\", \"minecraft:purple_shulker_box\", \"minecraft:blue_shulker_box\", \"minecraft:brown_shulker_box\", \"minecraft:green_shulker_box\", \"minecraft:red_shulker_box\", \"minecraft:black_shulker_box\"]");
        submarineInventory = prop.getStringList();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "submarineWarning", submarineWarning);
        prop.setComment("If you are using RF for machines and the submarine is under this % of full, the GUI will show a red warning colour [default: 5.0]");
        submarineWarning = prop.getDouble();
        propOrder.add(prop.getName());

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

        prop = cfg.get("Global World-Gen", "modFlowerpot", modFlowerpot);
        prop.setComment("Set to false to disable this mod's custom Flower Pots (in case it is causing issues with other mods). [default: true]");
        modFlowerpot = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "genPalaeobotanist", genPalaeobotanist);
        prop.setComment("Percentage chance that a Palaeobotanist house will generate in a village. [default: 30]");
        genPalaeobotanist = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Global World-Gen", "genPalaeontologist", genPalaeontologist);
        prop.setComment("Percentage chance that a Palaeontologist house will generate in a village. [default: 30]");
        genPalaeontologist = prop.getInt();
        propOrder.add(prop.getName());
        prop = cfg.get("Global World-Gen", "portalsHomeGlobally", globalHomePortals);
        prop.setComment("Overworld portals can also be used to escape from non-Prehistoric Nature dimensions. [default: false]");
        globalHomePortals = prop.getBoolean();
        propOrder.add(prop.getName());
        prop = cfg.get("Global World-Gen", "portalsOneWay", oneWayPortals);
        prop.setComment("Portals generate one-way counterparts on both sides; but only when used between Prehistoric Nature dimensions and the overworld. [default: true]");
        oneWayPortals = prop.getBoolean();
        propOrder.add(prop.getName());
        prop = cfg.get("Global World-Gen", "portalsOneWayNether", oneWayPortalsNether);
        prop.setComment("Extend the portal behaviour to Nether Portals [default: false]");
        oneWayPortalsNether = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global Mobs", "doSpawnsPrehistoricFloraDefault", doSpawnsPrehistoricFloraDefault);
        prop.setComment("Set to false to disable the default mob-spawns from this mod. [default: true]");
        doSpawnsPrehistoricFloraDefault = prop.getBoolean();
        propOrder.add(prop.getName());
//        prop = cfg.get("Global Mobs", "doSpawnsFossilsArcheology", doSpawnsFossilsArcheology);
//        prop.setComment("Set to true add in appropriate mob-spawns from the mod Fossils and Archeology Revival [v.8.05]. [default: false]");
//        doSpawnsFossilsArcheology = prop.getBoolean();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Global Mobs", "doSpawnsReborn", doSpawnsReborn);
//        prop.setComment("Set to true add in appropriate mob-spawns from the mod Jurassic World Reborn [v.1.1.1]. [default: false]");
//        doSpawnsReborn = prop.getBoolean();
//        propOrder.add(prop.getName());

        prop = cfg.get("Rendering and Optimisation", "renderAnimations", renderAnimations);
        prop.setComment("Set to true to animate block-like mobs fully, or to false to render them as static blocks (useful for low performance graphics cards or for conflicts with Optifine). [default: true]");
        renderAnimations = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Rendering and Optimisation", "genEdiacaran", genEdiacaran);
        prop.setComment("Adjust the amount of entities in the Ediacaran Frondose Forest, in case of fps problems (0.01 to 1.0). [default: 0.66]");
        genEdiacaran = prop.getDouble();
        propOrder.add(prop.getName());

        prop = cfg.get("Rendering and Optimisation", "renderCustomSkies", renderCustomSkies);
        prop.setComment("Set to false to switch off custom sky effects in the modded dimensions (useful for low performance graphics cards or for conflicts with shaders). [default: true]");
        renderCustomSkies = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Rendering and Optimisation", "renderBigMobsProperly", renderBigMobsProperly);
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

        prop = cfg.get("Global World-Gen", "genAllPlantsModern", genAllPlantsModern);
        prop.setComment("If set to true then all plants from this mod will generate in the overworld, if they are still alive today, no matter how you set them in their own config section. You can still block them from biomes and dimensions in their individual settings. This setting does not affect algae. [default: false]");
        genAllPlantsModern = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "spreadPlants", spreadPlants);
        prop.setComment("Percentage chance that a spreadable plant tries to spread when it receives a random tick (or is bonemealed). Does not affect other growth, only spread. (1 to 100) [default: 70]");
        spreadPlants = prop.getInt();
        propOrder.add(prop.getName());

        prop = cfg.get("Global World-Gen", "spreadPlantsAtAll", spreadPlantsAtAll);
        prop.setComment("Controls whether spreadable plants can spread at all (if set to false, bonemeal can still trigger a spread) [default: true]");
        spreadPlantsAtAll = prop.getBoolean();
        propOrder.add(prop.getName());

        propOrder.add(prop.getName());
        prop = cfg.get("Global World-Gen", "extractionSpeed", extractionSpeed);
        prop.setComment("How often a resin and latex extractor extracts some fluid from a tree, in ticks [default: 1200]");
        extractionSpeed = prop.getInt();



        prop = cfg.get("Rendering and Optimisation", "renderFog", renderFog);
        prop.setComment("Set to true to render custom fog effects in the Prehistoric dimensions. [default: true]");
        renderFog = prop.getBoolean();
        propOrder.add(prop.getName());

        prop = cfg.get("Rendering and Optimisation", "fixZirconGlass", fixZirconGlass);
        prop.setComment("Set to false to disable the mod's zircon glass attempting to fix water rendering textures when a water plant is placed against it. [default: true]");
        fixZirconGlass = prop.getBoolean();
        propOrder.add(prop.getName());

//        prop = cfg.get("Mobs", "waterHibbertopterus", waterHibbertopterus);
//        prop.setComment("Distance NSEW from water that Hibbertopterus can go to without taking suffocation damage (1 to 16) [default: 2]");
//        waterHibbertopterus = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterLimnoscelis", waterLimnoscelis);
//        prop.setComment("Distance NSEW from water that Limnoscelis can go to without taking suffocation damage (1 to 16) [default: 10]");
//        waterLimnoscelis = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterAcanthostega", waterAcanthostega);
//        prop.setComment("Distance NSEW from water that Acathostega can go to without taking suffocation damage (1 to 16) [default: 2]");
//        waterAcanthostega = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterPederpes", waterPederpes);
//        prop.setComment("Distance NSEW from water that Pederpes can go to without taking suffocation damage (1 to 16) [default: 16]");
//        waterPederpes = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterBalanerpeton", waterBalanerpeton);
//        prop.setComment("Distance NSEW from water that Balanerpeton can go to without taking suffocation damage (1 to 16) [default: 8]");
//        waterBalanerpeton = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterCacops", waterCacops);
//        prop.setComment("Distance NSEW from water that Cacops can go to without taking suffocation damage (1 to 16) [default: 10]");
//        waterCacops = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterDasyceps", waterDasyceps);
//        prop.setComment("Distance NSEW from water that Dasyceps can go to without taking suffocation damage (1 to 16) [default: 10]");
//        waterDasyceps = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterDvinosaurus", waterDvinosaurus);
//        prop.setComment("Distance NSEW from water that Dvinosaurus can go to without taking suffocation damage (1 to 16) [default: 1]");
//        waterDvinosaurus = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterMelosaurus", waterMelosaurus);
//        prop.setComment("Distance NSEW from water that Melosaurus can go to without taking suffocation damage (1 to 16) [default: 4]");
//        waterMelosaurus = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterPantylus", waterPantylus);
//        prop.setComment("Distance NSEW from water that Pantylus can go to without taking suffocation damage (1 to 16) [default: 8]");
//        waterPantylus = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterUranocentrodon", waterUranocentrodon);
//        prop.setComment("Distance NSEW from water that Uranocentrodon can go to without taking suffocation damage (1 to 16) [default: 1]");
//        waterUranocentrodon = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterPlatyhystrix", waterPlatyhystrix);
//        prop.setComment("Distance NSEW from water that Platyhystrix can go to without taking suffocation damage (1 to 16) [default: 16]");
//        waterPlatyhystrix = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterEryops", waterEryops);
//        prop.setComment("Distance NSEW from water that Eryops can go to without taking suffocation damage (1 to 16) [default: 4]");
//        waterEryops = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterCrassigyrinus", waterCrassigyrinus);
//        prop.setComment("Distance NSEW from water that Crassigyrinus can go to without taking suffocation damage (1 to 16) [default: 1]");
//        waterCrassigyrinus = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterBranchiosaur", waterBranchiosaur);
//        prop.setComment("Distance NSEW from water that Branchiosaurs can go to without taking suffocation damage (1 to 16) [default: 1]");
//        waterBranchiosaur = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterPanderichthys", waterPanderichthys);
//        prop.setComment("Distance NSEW from water that Panderichthys can go to without taking suffocation damage (1 to 16) [default: 1]");
//        waterPanderichthys = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterCeratodus", waterCeratodus);
//        prop.setComment("Distance NSEW from water that Ceratodus can go to without taking suffocation damage (1 to 16) [default: 1]");
//        waterCeratodus = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterGnathorhiza", waterGnathorhiza);
//        prop.setComment("Distance NSEW from water that Gnathorhiza can go to without taking suffocation damage (1 to 16) [default: 1]");
//        waterGnathorhiza = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterLaccognathus", waterLaccognathus);
//        prop.setComment("Distance NSEW from water that Laccognathus can go to without taking suffocation damage (1 to 16) [default: 1]");
//        waterLaccognathus = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterDiplocaulus", waterDiplocaulus);
//        prop.setComment("Distance NSEW from water that Diplocaulus can go to without taking suffocation damage (1 to 16) [default: 1]");
//        waterDiplocaulus = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterDiploceraspis", waterDiploceraspis);
//        prop.setComment("Distance NSEW from water that Diploceraspis can go to without taking suffocation damage (1 to 16) [default: 1]");
//        waterDiploceraspis = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterMastodonsaurus", waterMastodonsaurus);
//        prop.setComment("Distance NSEW from water that Mastodonsaurus can go to without taking suffocation damage (1 to 16) [default: 1]");
//        waterMastodonsaurus = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterAcanthostomatops", waterAcanthostomatops);
//        prop.setComment("Distance NSEW from water that Acanthostomatops can go to without taking suffocation damage (1 to 16) [default: 6]");
//        waterAcanthostomatops = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterPhlegethontia", waterPhlegethontia);
//        prop.setComment("Distance NSEW from water that Phlegethontia can go to without taking suffocation damage (1 to 16) [default: 1]");
//        waterPhlegethontia = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterProterogyrinus", waterProterogyrinus);
//        prop.setComment("Distance NSEW from water that Proterogyrinus can go to without taking suffocation damage (1 to 16) [default: 7]");
//        waterProterogyrinus = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterKalbarria", waterKalbarria);
//        prop.setComment("Distance NSEW from water that Kalbarria can go to without taking suffocation damage (1 to 16) [default: 2]");
//        waterKalbarria = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterEricixerxes", waterEricixerxes);
//        prop.setComment("Distance NSEW from water that Ericixerxes can go to without taking suffocation damage (1 to 16) [default: 2]");
//        waterEricixerxes = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterPlacodus", waterPlacodus);
//        prop.setComment("Distance NSEW from water that Placodus can go to without taking suffocation damage (1 to 16) [default: 6]");
//        waterPlacodus = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterAmphibamus", waterAmphibamus);
//        prop.setComment("Distance NSEW from water that Amphibamus can go to without taking suffocation damage (1 to 16) [default: 8]");
//        waterAmphibamus = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterIchthyostega", waterIchthyostega);
//        prop.setComment("Distance NSEW from water that Ichthyostega can go to without taking suffocation damage (1 to 16) [default: 6]");
//        waterIchthyostega = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterTiktaalik", waterTiktaalik);
//        prop.setComment("Distance NSEW from water that Tiktaalik can go to without taking suffocation damage (1 to 16) [default: 6]");
//        waterTiktaalik = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterParmastega", waterParmastega);
//        prop.setComment("Distance NSEW from water that Parmastega can go to without taking suffocation damage (1 to 16) [default: 6]");
//        waterParmastega = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterMetoposaurus", waterMetoposaurus);
//        prop.setComment("Distance NSEW from water that Metoposaurus can go to without taking suffocation damage (1 to 16) [default: 6]");
//        waterMetoposaurus = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterPrionosuchus", waterPrionosuchus);
//        prop.setComment("Distance NSEW from water that Prionosuchus can go to without taking suffocation damage (1 to 16) [default: 6]");
//        waterPrionosuchus = prop.getInt();
//        propOrder.add(prop.getName());
//
//        prop = cfg.get("Mobs", "waterPholiderpeton", waterPholiderpeton);
//        prop.setComment("Distance NSEW from water that Pholiderpeton can go to without taking suffocation damage (1 to 16) [default: 7]");
//        waterPholiderpeton = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterMegalocephalus", waterMegalocephalus);
//        prop.setComment("Distance NSEW from water that Megalocephalus can go to without taking suffocation damage (1 to 16) [default: 4]");
//        waterMegalocephalus = prop.getInt();
//        propOrder.add(prop.getName());
//        prop = cfg.get("Mobs", "waterSpathicephalus", waterSpathicephalus);
//        prop.setComment("Distance NSEW from water that Spathicephalus can go to without taking suffocation damage (1 to 16) [default: 4]");
//        waterSpathicephalus = prop.getInt();
//        propOrder.add(prop.getName());

        prop = cfg.get("Mobs", "colourPulmonoscorpius", colourPulmonoscorpius);
        prop.setComment("Render the Pulmonoscorpius in a colourful, \"Prehistoric Park\"-inspired texture [default: false]");
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
