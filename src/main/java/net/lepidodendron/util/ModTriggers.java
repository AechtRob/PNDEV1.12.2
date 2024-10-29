package net.lepidodendron.util;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.advancements.ICriterionTrigger;
import net.minecraftforge.fml.relauncher.ReflectionHelper;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ModTriggers

{

    public static final CustomTrigger WELCOME = new CustomTrigger("pf_book_craft_prompt");
    public static final CustomTrigger ENTER_OVERWORLD = new CustomTrigger("enter_pf_overworld");
    public static final CustomTrigger ENTER_PRECAMBRIAN = new CustomTrigger("enter_pf_precambrian");
    public static final CustomTrigger ENTER_CAMBRIAN = new CustomTrigger("enter_pf_cambrian");
    public static final CustomTrigger ENTER_ORDOVICIAN = new CustomTrigger("enter_pf_ordovician");
    public static final CustomTrigger ENTER_SILURIAN = new CustomTrigger("enter_pf_silurian");
    public static final CustomTrigger ENTER_DEVONIAN = new CustomTrigger("enter_pf_devonian");
    public static final CustomTrigger ENTER_CARBONIFEROUS = new CustomTrigger("enter_pf_carboniferous");
    public static final CustomTrigger ENTER_PERMIAN = new CustomTrigger("enter_pf_permian");
    public static final CustomTrigger ENTER_TRIASSIC = new CustomTrigger("enter_pf_triassic");
    public static final CustomTrigger ENTER_JURASSIC = new CustomTrigger("enter_pf_jurassic");
    public static final CustomTrigger ENTER_CRETACEOUS_EARLY = new CustomTrigger("enter_pf_cretaceous_early");
    public static final CustomTrigger REJUVENATE = new CustomTrigger("pf_rejuvenate");
    public static final CustomTrigger ACID_CLEAN = new CustomTrigger("pf_acid_clean");
    public static final CustomTrigger USE_CAGE = new CustomTrigger("pf_use_cage");
    public static final CustomTrigger USE_JAR = new CustomTrigger("pf_use_jar");
    public static final CustomTrigger TAXIDERMY = new CustomTrigger("pf_taxidermy");
    public static final CustomTrigger EPHEDRA = new CustomTrigger("pf_eat_ephedra");
    public static final CustomTrigger TAIL = new CustomTrigger("pf_eat_tail");
    public static final CustomTrigger DNA_CRAFT = new CustomTrigger("pf_dna_craft");
    public static final CustomTrigger PALAEOPEDIA_GIVEN = new CustomTrigger("pf_palaeopedia_given");
    public static final CustomTrigger QUARK_NAG = new CustomTrigger("pf_quark_nag");

    //Knowledge of blocks:
    public static final CustomTrigger CLICK_ACACIA = new CustomTrigger("pf_book_acacia");
    public static final CustomTrigger CLICK_ADOKETOPHYTON = new CustomTrigger("pf_book_adoketophyton");
    public static final CustomTrigger CLICK_AETHOPHYLLUM = new CustomTrigger("pf_book_aethophyllum");
    public static final CustomTrigger CLICK_MOSS = new CustomTrigger("pf_book_ancient_moss");
    public static final CustomTrigger CLICK_AGATHIS = new CustomTrigger("pf_book_agathis");
    public static final CustomTrigger CLICK_ALETHOPTERIS = new CustomTrigger("pf_book_alethopteris");
    public static final CustomTrigger CLICK_ALLIOPTERIS = new CustomTrigger("pf_book_alliopteris");
    public static final CustomTrigger CLICK_ALLONNIA = new CustomTrigger("pf_book_allonnia");
    public static final CustomTrigger CLICK_ALPIA = new CustomTrigger("pf_book_alpia");
    public static final CustomTrigger CLICK_AMBLYSIPHONELLA = new CustomTrigger("pf_book_amblysiphonella");
    public static final CustomTrigger CLICK_REEF_BRYOZOAN = new CustomTrigger("pf_book_reef_bryozoan");
    public static final CustomTrigger CLICK_REEF_CORAL = new CustomTrigger("pf_book_reef_coral");
    public static final CustomTrigger CLICK_REEF_ALGAL = new CustomTrigger("pf_book_reef_algal");
    public static final CustomTrigger CLICK_REEF_SHELLY = new CustomTrigger("pf_book_reef_shelly");
    public static final CustomTrigger CLICK_REEF_SPONGE = new CustomTrigger("pf_book_reef_sponge");
    public static final CustomTrigger CLICK_REEF_STROMATOPOROIDEA = new CustomTrigger("pf_book_reef_stromatoporoidea");
    public static final CustomTrigger CLICK_REEF_DEAD = new CustomTrigger("pf_book_reef_dead");
    public static final CustomTrigger CLICK_REEF_ARCHAEOCYATHEA = new CustomTrigger("pf_book_reef_archaeocyatha");
    public static final CustomTrigger CLICK_REEF_GLASS_SPONGE = new CustomTrigger("pf_book_reef_glass_sponge");
    public static final CustomTrigger CLICK_ANEUROPHYTON = new CustomTrigger("pf_book_aneurophyton");
    public static final CustomTrigger CLICK_ANKYROPTERIS = new CustomTrigger("pf_book_ankyropteris");
    public static final CustomTrigger CLICK_ANOMOZAMITES = new CustomTrigger("pf_book_anomozamites");
    public static final CustomTrigger CLICK_ANTARCTICYCAS = new CustomTrigger("pf_book_antarcticycas");
    public static final CustomTrigger CLICK_APPLE = new CustomTrigger("pf_book_apple");
    public static final CustomTrigger CLICK_LAURUS = new CustomTrigger("pf_book_laurus");
    public static final CustomTrigger CLICK_BISONIA = new CustomTrigger("pf_book_bisonia");
    public static final CustomTrigger CLICK_ARAUCARIOXYLON = new CustomTrigger("pf_book_araucarioxylon");
    public static final CustomTrigger CLICK_ANEMONE = new CustomTrigger("pf_book_anemone");
    public static final CustomTrigger CLICK_DAISY = new CustomTrigger("pf_book_daisy");
    public static final CustomTrigger CLICK_ALGAE = new CustomTrigger("pf_book_algae");
    public static final CustomTrigger CLICK_KELP = new CustomTrigger("pf_book_kelp");
    public static final CustomTrigger CLICK_ZINGIBEROPSIS = new CustomTrigger("pf_book_zingiberopsis");
    public static final CustomTrigger CLICK_GANSUFRUCTUS = new CustomTrigger("pf_book_gansufructus");
    public static final CustomTrigger CLICK_SANTANIELLA = new CustomTrigger("pf_book_santaniella");
    public static final CustomTrigger CLICK_SINOHERBA = new CustomTrigger("pf_book_sinoherba");
    public static final CustomTrigger CLICK_CHLORANTHUS = new CustomTrigger("pf_book_chloranthus");
    public static final CustomTrigger CLICK_BUTTERCUP = new CustomTrigger("pf_book_buttercup");
    public static final CustomTrigger CLICK_TELOPEA = new CustomTrigger("pf_book_telopea");
    public static final CustomTrigger CLICK_ORITES = new CustomTrigger("pf_book_orites");
    public static final CustomTrigger CLICK_LOMATIA = new CustomTrigger("pf_book_lomatia");
    public static final CustomTrigger CLICK_DRIMYS = new CustomTrigger("pf_book_drimys");
    public static final CustomTrigger CLICK_VOLTZIA = new CustomTrigger("pf_book_voltzia");
    public static final CustomTrigger CLICK_HYDRANGEA = new CustomTrigger("pf_book_hydrangea");
    public static final CustomTrigger CLICK_EMBOTHRIUM = new CustomTrigger("pf_book_embothrium");
    public static final CustomTrigger CLICK_AMBORELLA = new CustomTrigger("pf_book_amborella");
    public static final CustomTrigger CLICK_ILICIUM = new CustomTrigger("pf_book_ilicium");
    public static final CustomTrigger CLICK_CALYCANTHUS = new CustomTrigger("pf_book_calycanthus");
    public static final CustomTrigger CLICK_JERSEYANTHUS = new CustomTrigger("pf_book_jerseyanthus");
    public static final CustomTrigger CLICK_ARAUCARITES = new CustomTrigger("pf_book_araucarites");
    public static final CustomTrigger CLICK_ARBOREA = new CustomTrigger("pf_book_arborea");
    public static final CustomTrigger CLICK_ARCHAEANTHUS = new CustomTrigger("pf_book_archaeanthus");
    public static final CustomTrigger CLICK_ARCHAEFRUCTUS = new CustomTrigger("pf_book_archaefructus");
    public static final CustomTrigger CLICK_CALLIANTHUS = new CustomTrigger("pf_book_callianthus");
    public static final CustomTrigger CLICK_MONTSECHIA = new CustomTrigger("pf_book_montsechia");
    public static final CustomTrigger CLICK_ARCHAEOPTERIS = new CustomTrigger("pf_book_archaeopteris");
    public static final CustomTrigger CLICK_ARID_HORSETAIL = new CustomTrigger("pf_book_arid_horsetail");
    public static final CustomTrigger CLICK_ARKARUA = new CustomTrigger("pf_book_arkarua");
    public static final CustomTrigger CLICK_HORODYSKIA = new CustomTrigger("pf_book_horodyskia");
    public static final CustomTrigger CLICK_ARTHROPITYS = new CustomTrigger("pf_book_arthropitys");
    public static final CustomTrigger CLICK_ARTOCARPUS = new CustomTrigger("pf_book_artocarpus");
    public static final CustomTrigger CLICK_ASTEROXYLON = new CustomTrigger("pf_book_asteroxylon");
    public static final CustomTrigger CLICK_AULACERA = new CustomTrigger("pf_book_aulacera");
    public static final CustomTrigger CLICK_AUSIA = new CustomTrigger("pf_book_ausia");
    public static final CustomTrigger CLICK_BAIERA = new CustomTrigger("pf_book_baiera");
    public static final CustomTrigger CLICK_DORATOPHYLLUM = new CustomTrigger("pf_book_doratophyllum");
    public static final CustomTrigger CLICK_BAIKALOPHYLLUM = new CustomTrigger("pf_book_baikalophyllum");
    public static final CustomTrigger CLICK_REHEZAMITES = new CustomTrigger("pf_book_rehezamites");
    public static final CustomTrigger CLICK_BANKSIA_1 = new CustomTrigger("pf_book_banksia_1");
    public static final CustomTrigger CLICK_BANKSIA_2 = new CustomTrigger("pf_book_banksia_2");
    public static final CustomTrigger CLICK_BARAGWANATHIA = new CustomTrigger("pf_book_baragwanathia");
    public static final CustomTrigger CLICK_BEECH = new CustomTrigger("pf_book_beech");
    public static final CustomTrigger CLICK_BELEMNOPTERIS = new CustomTrigger("pf_book_belemnopteris");
    public static final CustomTrigger CLICK_BIRCH = new CustomTrigger("pf_book_birch");
    public static final CustomTrigger CLICK_BIVALVE_CREAM = new CustomTrigger("pf_book_bivalve_cream");
    public static final CustomTrigger CLICK_BIVALVE_DARK = new CustomTrigger("pf_book_bivalve_dark");
    public static final CustomTrigger CLICK_BIVALVE_DICEROCARDIUM = new CustomTrigger("pf_book_bivalve_dicerocardium");
    public static final CustomTrigger CLICK_BIVALVE_GREEN = new CustomTrigger("pf_book_bivalve_green");
    public static final CustomTrigger CLICK_BIVALVE_GREY = new CustomTrigger("pf_book_bivalve_grey");
    public static final CustomTrigger CLICK_BIVALVE_SHIKAMAIA = new CustomTrigger("pf_book_bivalve_shikamaia");
    public static final CustomTrigger CLICK_BIVALVE_INOCERAMUS = new CustomTrigger("pf_book_bivalve_inoceramus");
    public static final CustomTrigger CLICK_BIVALVE_INOCERAMUS_GIGANTOCAPULUS = new CustomTrigger("pf_book_bivalve_inoceramus_gigantocapulus");
    public static final CustomTrigger CLICK_BIVALVE_LITHIOTIS = new CustomTrigger("pf_book_bivalve_lithiotis");
    public static final CustomTrigger CLICK_BIVALVE_MEGALODON = new CustomTrigger("pf_book_bivalve_megalodon");
    public static final CustomTrigger CLICK_BIVALVE_TALL = new CustomTrigger("pf_book_bivalve_tall");
    public static final CustomTrigger CLICK_BIVALVE_UPRIGHT = new CustomTrigger("pf_book_bivalve_upright");
    public static final CustomTrigger CLICK_BIVALVE_WHITE = new CustomTrigger("pf_book_bivalve_white");
    public static final CustomTrigger CLICK_BJUVIA = new CustomTrigger("pf_book_bjuvia");
    public static final CustomTrigger CLICK_BLACK_TREEFERN = new CustomTrigger("pf_book_black_treefern");
    public static final CustomTrigger CLICK_BOLBITIS = new CustomTrigger("pf_book_bolbitis");
    public static final CustomTrigger CLICK_SEAGRASS = new CustomTrigger("pf_book_seagrass");
    public static final CustomTrigger CLICK_MOSACAULIS = new CustomTrigger("pf_book_mosacaulis");
    public static final CustomTrigger CLICK_BOMAKELLIA = new CustomTrigger("pf_book_bomakellia");
    public static final CustomTrigger CLICK_BOTHRODENDRON = new CustomTrigger("pf_book_bothrodendron");
    public static final CustomTrigger CLICK_BRACHIOPOD_GIGANTOPRODUCTUS = new CustomTrigger("pf_book_brachiopod_gigantoproductus");
    public static final CustomTrigger CLICK_BRACHIOPOD_ORTHID = new CustomTrigger("pf_book_brachiopod_orthid");
    public static final CustomTrigger CLICK_BRACHIOPOD_SPIRIFERID = new CustomTrigger("pf_book_brachiopod_spiriferid");
    public static final CustomTrigger CLICK_BRACHYPHYLLUM = new CustomTrigger("pf_book_brachyphyllum");
    public static final CustomTrigger CLICK_BRADGATIA = new CustomTrigger("pf_book_bradgatia");
    public static final CustomTrigger CLICK_BRASILODENDRON = new CustomTrigger("pf_book_brasilodendron");
    public static final CustomTrigger CLICK_BRISTLECONE = new CustomTrigger("pf_book_bristlecone");
    public static final CustomTrigger CLICK_BUMBUDENDRON = new CustomTrigger("pf_book_bumbudendron");
    public static final CustomTrigger CLICK_BUNYA = new CustomTrigger("pf_book_bunya");
    public static final CustomTrigger CLICK_BURIADIA = new CustomTrigger("pf_book_buriadia");
    public static final CustomTrigger CLICK_PELOURDEA = new CustomTrigger("pf_book_pelourdea");
    public static final CustomTrigger CLICK_BURYKHIA = new CustomTrigger("pf_book_burykhia");
    public static final CustomTrigger CLICK_CALAMITES = new CustomTrigger("pf_book_calamites");
    public static final CustomTrigger CLICK_CALAMOPHYTON = new CustomTrigger("pf_book_calamophyton");
    public static final CustomTrigger CLICK_ROSE_ANCIENT = new CustomTrigger("pf_book_rose_ancient");
    public static final CustomTrigger CLICK_CALLISTOPHYTALES = new CustomTrigger("pf_book_callistophytales");
    public static final CustomTrigger CLICK_HEDERA = new CustomTrigger("pf_book_hedera");
    public static final CustomTrigger CLICK_ARISTOLOCHIA = new CustomTrigger("pf_book_aristolochia");
    public static final CustomTrigger CLICK_KAJANTHUS = new CustomTrigger("pf_book_kajanthus");
    public static final CustomTrigger CLICK_BUCKTHORN = new CustomTrigger("pf_book_buckthorn");
    public static final CustomTrigger CLICK_ACTINIDEA = new CustomTrigger("pf_book_actinidea");
    public static final CustomTrigger CLICK_VITIS = new CustomTrigger("pf_book_vitis");
    public static final CustomTrigger CLICK_HOPS = new CustomTrigger("pf_book_hops");
    public static final CustomTrigger CLICK_YAM = new CustomTrigger("pf_book_yam");
    public static final CustomTrigger CLICK_CASTERICYSTIS = new CustomTrigger("pf_book_castericystis");
    public static final CustomTrigger CLICK_CECROPSIS = new CustomTrigger("pf_book_cecropsis");
    public static final CustomTrigger CLICK_RHACOPTERIS = new CustomTrigger("pf_book_rhacopteris");
    public static final CustomTrigger CLICK_CHARNIA = new CustomTrigger("pf_book_charnia");
    public static final CustomTrigger CLICK_TUANSHANZIA = new CustomTrigger("pf_book_tuanshanzia");
    public static final CustomTrigger CLICK_CHARNIODISCUS = new CustomTrigger("pf_book_charniodiscus");
    public static final CustomTrigger CLICK_SEA_PEN = new CustomTrigger("pf_book_sea_pen");
    public static final CustomTrigger CLICK_CHAUNOGRAPTUS = new CustomTrigger("pf_book_chaunograptus");
    public static final CustomTrigger CLICK_CINNAMON_FERN = new CustomTrigger("pf_book_cinnamon_fern");
    public static final CustomTrigger CLICK_CLADOPHLEBIS = new CustomTrigger("pf_book_cladophlebis");
    public static final CustomTrigger CLICK_LICHEN = new CustomTrigger("pf_book_lichen");
    public static final CustomTrigger CLICK_CLATHROPTERIS = new CustomTrigger("pf_book_clathropteris");
    public static final CustomTrigger CLICK_ONYCHIOPSIS = new CustomTrigger("pf_book_onychiopsis");
    public static final CustomTrigger CLICK_CLAYTOSMUNDA = new CustomTrigger("pf_book_claytosmunda");
    public static final CustomTrigger CLICK_NEOMARIOPTERIS = new CustomTrigger("pf_book_neomariopteris");
    public static final CustomTrigger CLICK_CLOUDINA = new CustomTrigger("pf_book_cloudina");
    public static final CustomTrigger CLICK_COBBANIA = new CustomTrigger("pf_book_cobbania");
    public static final CustomTrigger CLICK_ORONTIUM = new CustomTrigger("pf_book_orontium");
    public static final CustomTrigger CLICK_COLUMNARIS = new CustomTrigger("pf_book_columnaris");
    public static final CustomTrigger CLICK_CONIOPTERIS = new CustomTrigger("pf_book_coniopteris");
    public static final CustomTrigger CLICK_CONOMEDUSITES = new CustomTrigger("pf_book_conomedusites");
    public static final CustomTrigger CLICK_COOKSONIA = new CustomTrigger("pf_book_cooksonia");
    public static final CustomTrigger CLICK_BELLENDENA = new CustomTrigger("pf_book_bellendena");
    public static final CustomTrigger CLICK_CORDAITES = new CustomTrigger("pf_book_cordaites");
    public static final CustomTrigger CLICK_CORDAITES_DRY = new CustomTrigger("pf_book_cordaites_dry");
    public static final CustomTrigger CLICK_CORNULITIDA = new CustomTrigger("pf_book_cornulitida");
    public static final CustomTrigger CLICK_CORONACOLLINA = new CustomTrigger("pf_book_coronacollina");
    public static final CustomTrigger CLICK_CORUMBELLA = new CustomTrigger("pf_book_corumbella");
    public static final CustomTrigger CLICK_CRINOID_ANCYROCRINUS = new CustomTrigger("pf_book_crinoid_ancyrocrinus");
    public static final CustomTrigger CLICK_CRINOID_CALLICRINUS = new CustomTrigger("pf_book_crinoid_callicrinus");
    public static final CustomTrigger CLICK_CRINOID_CARYOCRINITES = new CustomTrigger("pf_book_crinoid_caryocrinites");
    public static final CustomTrigger CLICK_CRINOID_CUPRESSOCRINITES = new CustomTrigger("pf_book_crinoid_cupressocrinites");
    public static final CustomTrigger CLICK_CRINOID_CYATHOCRINUS = new CustomTrigger("pf_book_crinoid_cyathocrinus");
    public static final CustomTrigger CLICK_CRINOID_DIZYGOCRINUS = new CustomTrigger("pf_book_crinoid_dizygocrinus");
    public static final CustomTrigger CLICK_CRINOID_ENCRINUS = new CustomTrigger("pf_book_crinoid_encrinus");
    public static final CustomTrigger CLICK_CRINOID_EUCALYPTOCRINITES = new CustomTrigger("pf_book_crinoid_eucalyptocrinites");
    public static final CustomTrigger CLICK_CRINOID_HOLOCRINUS = new CustomTrigger("pf_book_crinoid_holocrinus");
    public static final CustomTrigger CLICK_CRINOID_JIMBACRINUS = new CustomTrigger("pf_book_crinoid_jimbacrinus");
    public static final CustomTrigger CLICK_CRINOID_MACROCRINUS = new CustomTrigger("pf_book_crinoid_macrocrinus");
    public static final CustomTrigger CLICK_CRINOID_PETALOCRINUS = new CustomTrigger("pf_book_crinoid_petalocrinus");
    public static final CustomTrigger CLICK_CRINOID_PISOCRINUS = new CustomTrigger("pf_book_crinoid_pisocrinus");
    public static final CustomTrigger CLICK_CRINOID_SCYPHOCRINUS = new CustomTrigger("pf_book_crinoid_scyphocrinus");
    public static final CustomTrigger CLICK_CRINOID_SIPHONOCRINUS = new CustomTrigger("pf_book_crinoid_siphonocrinus");
    public static final CustomTrigger CLICK_CRINOID_TRAUMATOCRINUS = new CustomTrigger("pf_book_crinoid_traumatocrinus");
    public static final CustomTrigger CLICK_CRINOID_SEIROCRINUS = new CustomTrigger("pf_book_crinoid_seirocrinus");
    public static final CustomTrigger CLICK_CRINOID_APIOCRINITES = new CustomTrigger("pf_book_crinoid_apiocrinites");
    public static final CustomTrigger CLICK_CRINOID_BALANOCRINUS = new CustomTrigger("pf_book_crinoid_balanocrinus");
    public static final CustomTrigger CLICK_CRINOID_EUGENIACRINITES = new CustomTrigger("pf_book_crinoid_eugeniacrinites");
    public static final CustomTrigger CLICK_CRINOID_PHYLLOCRINUS = new CustomTrigger("pf_book_crinoid_phyllocrinus");
    public static final CustomTrigger CLICK_CRINOID_PENTACRINITES = new CustomTrigger("pf_book_crinoid_pentacrinites");
    public static final CustomTrigger CLICK_CRINOID_VADAROCRINUS = new CustomTrigger("pf_book_crinoid_vadarocrinus");
    public static final CustomTrigger CLICK_CRINOID_VOSTOCOVACRINUS = new CustomTrigger("pf_book_crinoid_vostocovacrinus");
    public static final CustomTrigger CLICK_CTENIS = new CustomTrigger("pf_book_ctenis");
    public static final CustomTrigger CLICK_CYCADEOIDEA = new CustomTrigger("pf_book_cycadeoidea");
    public static final CustomTrigger CLICK_CYCADOPTERIS = new CustomTrigger("pf_book_cycadopteris");
    public static final CustomTrigger CLICK_DICHOPTERIS = new CustomTrigger("pf_book_dichopteris");
    public static final CustomTrigger CLICK_CYCAS = new CustomTrigger("pf_book_cycas");
    public static final CustomTrigger CLICK_MONANTHESIA = new CustomTrigger("pf_book_monanthesia");
    public static final CustomTrigger CLICK_CYCLODENDRON = new CustomTrigger("pf_book_cyclodendron");
    public static final CustomTrigger CLICK_CYPRESS = new CustomTrigger("pf_book_cypress");
    public static final CustomTrigger CLICK_CYPRESS_TWIGGY = new CustomTrigger("pf_book_cypress_twiggy");
    public static final CustomTrigger CLICK_NEHVIZDYELLA = new CustomTrigger("pf_book_nehvizdyella");
    public static final CustomTrigger CLICK_ELATOCLADUS = new CustomTrigger("pf_book_elatocladus");
    public static final CustomTrigger CLICK_CYSTOID_ARISTOCYSTITES = new CustomTrigger("pf_book_cystoid_aristocystites");
    public static final CustomTrigger CLICK_CYSTOID_BOLBOPORITES = new CustomTrigger("pf_book_cystoid_bolboporites");
    public static final CustomTrigger CLICK_CYSTOID_ECHINOSPHAERITES = new CustomTrigger("pf_book_cystoid_echinosphaerites");
    public static final CustomTrigger CLICK_CYSTOID_PSEUDOCRINITES = new CustomTrigger("pf_book_cystoid_pseudocrinites");
    public static final CustomTrigger CLICK_CZEKANOWSKIA = new CustomTrigger("pf_book_czekanowskia");
    public static final CustomTrigger CLICK_DARK_OAK = new CustomTrigger("pf_book_dark_oak");
    public static final CustomTrigger CLICK_DAWN_REDWOOD = new CustomTrigger("pf_book_dawn_redwood");
    public static final CustomTrigger CLICK_DENDROGRAPTUS = new CustomTrigger("pf_book_dendrograptus");
    public static final CustomTrigger CLICK_SPHENOECIUM = new CustomTrigger("pf_book_sphenoecium");
    public static final CustomTrigger CLICK_DIAPHORODENDRON = new CustomTrigger("pf_book_diaphorodendron");
    public static final CustomTrigger CLICK_SYNCHYSIDENDRON = new CustomTrigger("pf_book_synchysidendron");
    public static final CustomTrigger CLICK_DICKSONIA = new CustomTrigger("pf_book_dicksonia");
    public static final CustomTrigger CLICK_PARADOXOPTERIS = new CustomTrigger("pf_book_paradoxopteris");
    public static final CustomTrigger CLICK_DICRANOPHYLLUM = new CustomTrigger("pf_book_dicranophyllum");
    public static final CustomTrigger CLICK_DICROIDIUM_E = new CustomTrigger("pf_book_dicroidium_e");
    public static final CustomTrigger CLICK_DICROIDIUM_F = new CustomTrigger("pf_book_dicroidium_f");
    public static final CustomTrigger CLICK_DICROIDIUM_H = new CustomTrigger("pf_book_dicroidium_h");
    public static final CustomTrigger CLICK_DICROIDIUM_O = new CustomTrigger("pf_book_dicroidium_o");
    public static final CustomTrigger CLICK_DICROIDIUM = new CustomTrigger("pf_book_dicroidium");
    public static final CustomTrigger CLICK_DICTYONEMA = new CustomTrigger("pf_book_dictyonema");
    public static final CustomTrigger CLICK_DICTYOPHYLLUM = new CustomTrigger("pf_book_dictyophyllum");
    public static final CustomTrigger CLICK_DINOMISCHUS = new CustomTrigger("pf_book_dinomischus");
    public static final CustomTrigger CLICK_DIOON = new CustomTrigger("pf_book_dioon");
    public static final CustomTrigger CLICK_EOGINKGOITES = new CustomTrigger("pf_book_eoginkgoites");
    public static final CustomTrigger CLICK_DOLLYPHYTON = new CustomTrigger("pf_book_dollyphyton");
    public static final CustomTrigger CLICK_ECHMATOCRINUS = new CustomTrigger("pf_book_echmatocrinus");
    public static final CustomTrigger CLICK_EDWARDSIPHYTON = new CustomTrigger("pf_book_edwardsiphyton");
    public static final CustomTrigger CLICK_ELKINSIA = new CustomTrigger("pf_book_elkinsia");
    public static final CustomTrigger CLICK_EMPLECTOPTERIS = new CustomTrigger("pf_book_emplectopteris");
    public static final CustomTrigger CLICK_ENCBLUE = new CustomTrigger("pf_book_encblue");
    public static final CustomTrigger CLICK_SHRUBBY_CYCAD = new CustomTrigger("pf_book_shrubby_cycad");
    public static final CustomTrigger CLICK_EPHEDRA = new CustomTrigger("pf_book_ephedra");
    public static final CustomTrigger CLICK_ARLENEA = new CustomTrigger("pf_book_arlenea");
    public static final CustomTrigger CLICK_ERDTMANITHECALES = new CustomTrigger("pf_book_erdtmanithecales");
    public static final CustomTrigger CLICK_JIANCHANGIA = new CustomTrigger("pf_book_jianchangia");
    public static final CustomTrigger CLICK_WELWITSCHIA = new CustomTrigger("pf_book_welwitschia");
    public static final CustomTrigger CLICK_WELWITSCHIOPHYLLUM = new CustomTrigger("pf_book_welwitschiophyllum");
    public static final CustomTrigger CLICK_DREWRIA = new CustomTrigger("pf_book_drewria");
    public static final CustomTrigger CLICK_PROTOGNETUM = new CustomTrigger("pf_book_protognetum");
    public static final CustomTrigger CLICK_DAYVAULTIA = new CustomTrigger("pf_book_dayvaultia");
    public static final CustomTrigger CLICK_EQUISETITES_REED = new CustomTrigger("pf_book_equisetites_reed");
    public static final CustomTrigger CLICK_EQUISETITES = new CustomTrigger("pf_book_equisetites");
    public static final CustomTrigger CLICK_EREMOPTERIS = new CustomTrigger("pf_book_eremopteris");
    public static final CustomTrigger CLICK_HEMP = new CustomTrigger("pf_book_hemp");
    public static final CustomTrigger CLICK_ESCUMASIA = new CustomTrigger("pf_book_escumasia");
    public static final CustomTrigger CLICK_FACIVERMIS = new CustomTrigger("pf_book_facivermis");
    public static final CustomTrigger CLICK_FERN_EPIPHYTE = new CustomTrigger("pf_book_fern_epiphyte");
    public static final CustomTrigger CLICK_FIELD_HORSETAIL = new CustomTrigger("pf_book_field_horsetail");
    public static final CustomTrigger CLICK_FOOZIA = new CustomTrigger("pf_book_foozia");
    public static final CustomTrigger CLICK_FRENELOPSIS = new CustomTrigger("pf_book_frenelopsis");
    public static final CustomTrigger CLICK_FUNISIA = new CustomTrigger("pf_book_funisia");
    public static final CustomTrigger CLICK_FURCIFOLIUM = new CustomTrigger("pf_book_furcifolium");
    public static final CustomTrigger CLICK_FURCULA = new CustomTrigger("pf_book_furcula");
    public static final CustomTrigger CLICK_GANGAMOPTERIS = new CustomTrigger("pf_book_gangamopteris");
    public static final CustomTrigger CLICK_GLOSSOPTERIS_AMPLA = new CustomTrigger("pf_book_glossopteris_ampla");
    public static final CustomTrigger CLICK_GLOSSOPTERIS_DUOCAUDATA = new CustomTrigger("pf_book_glossopteris_duocaudata");
    public static final CustomTrigger CLICK_GIANT_HORSETAIL = new CustomTrigger("pf_book_giant_horsetail");
    public static final CustomTrigger CLICK_JURASSIC_HORSETAIL = new CustomTrigger("pf_book_jurassic_horsetail");
    public static final CustomTrigger CLICK_GIGANTOPTERID = new CustomTrigger("pf_book_gigantopterid");
    public static final CustomTrigger CLICK_GIGANTOSPONGIA = new CustomTrigger("pf_book_gigantospongia");
    public static final CustomTrigger CLICK_GLASS_SPONGE = new CustomTrigger("pf_book_glass_sponge");
    public static final CustomTrigger CLICK_GINKGO = new CustomTrigger("pf_book_ginkgo");
    public static final CustomTrigger CLICK_GINKGOITES = new CustomTrigger("pf_book_ginkgoites");
    public static final CustomTrigger CLICK_GLENOPTERIS = new CustomTrigger("pf_book_glenopteris");
    public static final CustomTrigger CLICK_GLOSSOPHYLLUM = new CustomTrigger("pf_book_glossophyllum");
    public static final CustomTrigger CLICK_GLOSSOPTERIS = new CustomTrigger("pf_book_glossopteris");
    public static final CustomTrigger CLICK_GOGIA = new CustomTrigger("pf_book_gogia");
    public static final CustomTrigger CLICK_GORDONOPTERIS = new CustomTrigger("pf_book_gordonopteris");
    public static final CustomTrigger CLICK_GRASSY_HORSETAIL = new CustomTrigger("pf_book_grassy_horsetail");
    public static final CustomTrigger CLICK_GRYPANIA = new CustomTrigger("pf_book_grypania");
    public static final CustomTrigger CLICK_GUANGDEDENDRON = new CustomTrigger("pf_book_guangdedendron");
    public static final CustomTrigger CLICK_HAOOTIA = new CustomTrigger("pf_book_haootia");
    public static final CustomTrigger CLICK_HAPSIDOPHYLLAS = new CustomTrigger("pf_book_hapsidophyllas");
    public static final CustomTrigger CLICK_HELICOCYSTIS = new CustomTrigger("pf_book_helicocystis");
    public static final CustomTrigger CLICK_HERMANOPHYTON = new CustomTrigger("pf_book_hermanophyton");
    public static final CustomTrigger CLICK_MESODESCOLEA = new CustomTrigger("pf_book_mesodescolea");
    public static final CustomTrigger CLICK_PSEUDOCTENIS = new CustomTrigger("pf_book_pseudoctenis");
    public static final CustomTrigger CLICK_HERPETOGASTER = new CustomTrigger("pf_book_herpetogaster");
    public static final CustomTrigger CLICK_HIRONOIA = new CustomTrigger("pf_book_hironoia");
    public static final CustomTrigger CLICK_HYMENAEA = new CustomTrigger("pf_book_hymenaea");
    public static final CustomTrigger CLICK_IBYKA = new CustomTrigger("pf_book_ibyka");
    public static final CustomTrigger CLICK_INARIA = new CustomTrigger("pf_book_inaria");
    public static final CustomTrigger CLICK_ISCHNOPHYTON = new CustomTrigger("pf_book_ischnophyton");
    public static final CustomTrigger CLICK_ISOETES = new CustomTrigger("pf_book_isoetes");
    public static final CustomTrigger CLICK_POTAMOGETON = new CustomTrigger("pf_book_potamogeton");
    public static final CustomTrigger CLICK_IRANIA = new CustomTrigger("pf_book_irania");
    public static final CustomTrigger CLICK_PAGIOPHYLLUM = new CustomTrigger("pf_book_pagiophyllum");
    public static final CustomTrigger CLICK_HIRMERIELLA = new CustomTrigger("pf_book_hirmeriella");
    public static final CustomTrigger CLICK_JUNGLE = new CustomTrigger("pf_book_jungle");
    public static final CustomTrigger CLICK_FERN = new CustomTrigger("pf_book_fern");
    public static final CustomTrigger CLICK_KOMLOPTERIS = new CustomTrigger("pf_book_komlopteris");
    public static final CustomTrigger CLICK_THINNFELDIA = new CustomTrigger("pf_book_thinnfeldia");
    public static final CustomTrigger CLICK_LADINIA = new CustomTrigger("pf_book_ladinia");
    public static final CustomTrigger CLICK_LECLERCQIA = new CustomTrigger("pf_book_leclercqia");
    public static final CustomTrigger CLICK_LEPIDOCYSTIS = new CustomTrigger("pf_book_lepidocystis");
    public static final CustomTrigger CLICK_LEPIDOPTERIS = new CustomTrigger("pf_book_lepidopteris");
    public static final CustomTrigger CLICK_LEPTOCYCAS = new CustomTrigger("pf_book_leptocycas");
    public static final CustomTrigger CLICK_LEPTOPTERIS = new CustomTrigger("pf_book_leptopteris");
    public static final CustomTrigger CLICK_LESLEYA = new CustomTrigger("pf_book_lesleya");
    public static final CustomTrigger CLICK_LIRIODENDRON = new CustomTrigger("pf_book_liriodendron");
    public static final CustomTrigger CLICK_LYCOPIA = new CustomTrigger("pf_book_lycopia");
    public static final CustomTrigger CLICK_LYGINOPTERIS = new CustomTrigger("pf_book_lyginopteris");
    public static final CustomTrigger CLICK_LYGODIUM = new CustomTrigger("pf_book_lygodium");
    public static final CustomTrigger CLICK_LYRACYSTIS = new CustomTrigger("pf_book_lyracystis");
    public static final CustomTrigger CLICK_MACRONEUROPTERIS = new CustomTrigger("pf_book_macroneuropteris");
    public static final CustomTrigger CLICK_MACROTAENIOPTERIS = new CustomTrigger("pf_book_macrotaeniopteris");
    public static final CustomTrigger CLICK_MAGNOLIA = new CustomTrigger("pf_book_magnolia");
    public static final CustomTrigger CLICK_MAPLE = new CustomTrigger("pf_book_maple");
    public static final CustomTrigger CLICK_GUNNERA = new CustomTrigger("pf_book_gunnera");
    public static final CustomTrigger CLICK_MARATTIA = new CustomTrigger("pf_book_marattia");
    public static final CustomTrigger CLICK_LOPHOSORIA = new CustomTrigger("pf_book_lophosoria");
    public static final CustomTrigger CLICK_BIRDSNEST_FERN = new CustomTrigger("pf_book_birdsnest_fern");
    public static final CustomTrigger CLICK_MEDULLOSALES = new CustomTrigger("pf_book_medullosales");
    public static final CustomTrigger CLICK_NATALIGMA = new CustomTrigger("pf_book_nataligma");
    public static final CustomTrigger CLICK_MIRABILIS = new CustomTrigger("pf_book_mirabilis");
    public static final CustomTrigger CLICK_MONKEY_PUZZLE_ARAUCARIA = new CustomTrigger("pf_book_monkey_puzzle_araucaria");
    public static final CustomTrigger CLICK_MONKEYPUZZLE = new CustomTrigger("pf_book_monkeypuzzle");
    public static final CustomTrigger CLICK_NAMACALATHUS = new CustomTrigger("pf_book_namacalathus");
    public static final CustomTrigger CLICK_NAMAPOIKIA = new CustomTrigger("pf_book_namapoikia");
    public static final CustomTrigger CLICK_NATHORSTIANA = new CustomTrigger("pf_book_nathorstiana");
    public static final CustomTrigger CLICK_NELUMBO = new CustomTrigger("pf_book_nelumbo");
    public static final CustomTrigger CLICK_MICROVICTORIA = new CustomTrigger("pf_book_microvictoria");
    public static final CustomTrigger CLICK_DISKAGMA = new CustomTrigger("pf_book_diskagma");
    public static final CustomTrigger CLICK_NUPHAR = new CustomTrigger("pf_book_nuphar");
    public static final CustomTrigger CLICK_NEMATOPHYTA = new CustomTrigger("pf_book_nematophyta");
    public static final CustomTrigger CLICK_NEMEJCOPTERIS = new CustomTrigger("pf_book_nemejcopteris");
    public static final CustomTrigger CLICK_NEOCALAMITES = new CustomTrigger("pf_book_neocalamites");
    public static final CustomTrigger CLICK_ARCHAEOCALAMITES = new CustomTrigger("pf_book_archaeocalamites");
    public static final CustomTrigger CLICK_PARACALAMITES = new CustomTrigger("pf_book_paracalamites");
    public static final CustomTrigger CLICK_NEUROPTERIDIUM = new CustomTrigger("pf_book_neuropteridium");
    public static final CustomTrigger CLICK_NILSSONIA = new CustomTrigger("pf_book_nilssonia");
    public static final CustomTrigger CLICK_NILSSONIOCLADUS = new CustomTrigger("pf_book_nilssoniocladus");
    public static final CustomTrigger CLICK_NILSSONIOPTERIS = new CustomTrigger("pf_book_nilssoniopteris");
    public static final CustomTrigger CLICK_NOEGGERATHIALES = new CustomTrigger("pf_book_noeggerathiales");
    public static final CustomTrigger CLICK_PANDAN = new CustomTrigger("pf_book_pandan");
    public static final CustomTrigger CLICK_NOTHOFAGUS = new CustomTrigger("pf_book_nothofagus");
    public static final CustomTrigger CLICK_NYSTROEMIA = new CustomTrigger("pf_book_nystroemia");
    public static final CustomTrigger CLICK_OAK = new CustomTrigger("pf_book_oak");
    public static final CustomTrigger CLICK_ODONTOPTERIS = new CustomTrigger("pf_book_odontopteris");
    public static final CustomTrigger CLICK_OESIA = new CustomTrigger("pf_book_oesia");
    public static final CustomTrigger CLICK_OMPHALOPHLOIOS = new CustomTrigger("pf_book_omphalophloios");
    public static final CustomTrigger CLICK_ORTISEIA = new CustomTrigger("pf_book_ortiseia");
    public static final CustomTrigger CLICK_SAPINDOPSIS = new CustomTrigger("pf_book_sapindopsis");
    public static final CustomTrigger CLICK_SCHIZAEA = new CustomTrigger("pf_book_schizaea");
    public static final CustomTrigger CLICK_VOJNOVSKYALES = new CustomTrigger("pf_book_vojnovskyales");
    public static final CustomTrigger CLICK_OSMUNDA = new CustomTrigger("pf_book_osmunda");
    public static final CustomTrigger CLICK_OTOZAMITES = new CustomTrigger("pf_book_otozamites");
    public static final CustomTrigger CLICK_PACHYPTERIS = new CustomTrigger("pf_book_pachypteris");
    public static final CustomTrigger CLICK_PALAEOGNETALEANA = new CustomTrigger("pf_book_palaeognetaleana");
    public static final CustomTrigger CLICK_PALAEOSTACHYA = new CustomTrigger("pf_book_palaeostachya");
    public static final CustomTrigger CLICK_PAMBIKALBAE = new CustomTrigger("pf_book_pambikalbae");
    public static final CustomTrigger CLICK_PARVISCOPA = new CustomTrigger("pf_book_parviscopa");
    public static final CustomTrigger CLICK_PAURODENDRON = new CustomTrigger("pf_book_paurodendron");
    public static final CustomTrigger CLICK_PENTOXYLALES = new CustomTrigger("pf_book_pentoxylales");
    public static final CustomTrigger CLICK_PERTICA = new CustomTrigger("pf_book_pertica");
    public static final CustomTrigger CLICK_PETRIELLALES = new CustomTrigger("pf_book_petriellales");
    public static final CustomTrigger CLICK_PHASMATOCYCAS = new CustomTrigger("pf_book_phasmatocycas");
    public static final CustomTrigger CLICK_PHOENICOPSIS = new CustomTrigger("pf_book_phoenicopsis");
    public static final CustomTrigger CLICK_PHOENIX = new CustomTrigger("pf_book_phoenix");
    public static final CustomTrigger CLICK_PHYLLOTHECA = new CustomTrigger("pf_book_phyllotheca");
    public static final CustomTrigger CLICK_PIRANIA = new CustomTrigger("pf_book_pirania");
    public static final CustomTrigger CLICK_ARBORISPONGIA = new CustomTrigger("pf_book_arborispongia");
    public static final CustomTrigger CLICK_TITUSVILLIA = new CustomTrigger("pf_book_titusvillia");
    public static final CustomTrigger CLICK_RETIOPHYLLIA = new CustomTrigger("pf_book_retiophyllia");
    public static final CustomTrigger CLICK_PITYS = new CustomTrigger("pf_book_pitys");
    public static final CustomTrigger CLICK_PLANE = new CustomTrigger("pf_book_plane");
    public static final CustomTrigger CLICK_FIG = new CustomTrigger("pf_book_fig");
    public static final CustomTrigger CLICK_FIG_BANYAN = new CustomTrigger("pf_book_fig_banyan");
    public static final CustomTrigger CLICK_PLEUROMEIA = new CustomTrigger("pf_book_pleuromeia");
    public static final CustomTrigger CLICK_PODOCARP = new CustomTrigger("pf_book_podocarp");
    public static final CustomTrigger CLICK_RISSIKIA = new CustomTrigger("pf_book_rissikia");
    public static final CustomTrigger CLICK_SCARBURGIA = new CustomTrigger("pf_book_scarburgia");
    public static final CustomTrigger CLICK_PODOZAMITES = new CustomTrigger("pf_book_podozamites");
    public static final CustomTrigger CLICK_POLYSPERMOPHYLLUM = new CustomTrigger("pf_book_polyspermophyllum");
    public static final CustomTrigger CLICK_PRIMAEVAL_GRASS = new CustomTrigger("pf_book_primaeval_grass");
    public static final CustomTrigger CLICK_PROTEA_1 = new CustomTrigger("pf_book_protea_1");
    public static final CustomTrigger CLICK_PROTEA = new CustomTrigger("pf_book_protea");
    public static final CustomTrigger CLICK_PROTOLEPIDODENDROPSIS = new CustomTrigger("pf_book_protolepidodendropsis");
    public static final CustomTrigger CLICK_SUBLEPIDODENDRON = new CustomTrigger("pf_book_sublepidodendron");
    public static final CustomTrigger CLICK_LEPIDOSIGILLARIA = new CustomTrigger("pf_book_lepidosigillaria");
    public static final CustomTrigger CLICK_OMPRELOSTROBUS = new CustomTrigger("pf_book_omprelostrobus");
    public static final CustomTrigger CLICK_CLUBMOSS = new CustomTrigger("pf_book_clubmoss");
    public static final CustomTrigger CLICK_PROTOTAXITES = new CustomTrigger("pf_book_prototaxites");
    public static final CustomTrigger CLICK_PSARONIUS = new CustomTrigger("pf_book_psaronius");
    public static final CustomTrigger CLICK_PSEUDOBORNIA = new CustomTrigger("pf_book_pseudobornia");
    public static final CustomTrigger CLICK_PSEUDOVOLTZIA = new CustomTrigger("pf_book_pseudovoltzia");
    public static final CustomTrigger CLICK_PSILOPHYTON = new CustomTrigger("pf_book_psilophyton");
    public static final CustomTrigger CLICK_PTILOZAMITES = new CustomTrigger("pf_book_ptilozamites");
    public static final CustomTrigger CLICK_PTERIDINIUM = new CustomTrigger("pf_book_pteridinium");
    public static final CustomTrigger CLICK_PTEROPHYLLUM = new CustomTrigger("pf_book_pterophyllum");
    public static final CustomTrigger CLICK_PTILOPHYLLUM = new CustomTrigger("pf_book_ptilophyllum");
    public static final CustomTrigger CLICK_QUADROCLADUS = new CustomTrigger("pf_book_quadrocladus");
    public static final CustomTrigger CLICK_SINOCARPUS = new CustomTrigger("pf_book_sinocarpus");
    public static final CustomTrigger CLICK_QUASISTROBUS = new CustomTrigger("pf_book_quasistrobus");
    public static final CustomTrigger CLICK_REDWOOD = new CustomTrigger("pf_book_redwood");
    public static final CustomTrigger CLICK_RELLIMIA = new CustomTrigger("pf_book_rellimia");
    public static final CustomTrigger CLICK_RETICULOPTERIS = new CustomTrigger("pf_book_reticulopteris");
    public static final CustomTrigger CLICK_RHACOPHYTON = new CustomTrigger("pf_book_rhacophyton");
    public static final CustomTrigger CLICK_RHYNIA = new CustomTrigger("pf_book_rhynia");
    public static final CustomTrigger CLICK_WATER_CLOVER = new CustomTrigger("pf_book_water_clover");
    public static final CustomTrigger CLICK_SALVINIA = new CustomTrigger("pf_book_salvinia");
    public static final CustomTrigger CLICK_RUFLORIA = new CustomTrigger("pf_book_rufloria");
    public static final CustomTrigger CLICK_ACROCOMIA = new CustomTrigger("pf_book_acrocomia");
    public static final CustomTrigger CLICK_SABAL = new CustomTrigger("pf_book_sabal");
    public static final CustomTrigger CLICK_NYPA = new CustomTrigger("pf_book_nypa");
    public static final CustomTrigger CLICK_SAHNIOXYLON = new CustomTrigger("pf_book_sahnioxylon");
    public static final CustomTrigger CLICK_TICOA = new CustomTrigger("pf_book_ticoa");
    public static final CustomTrigger CLICK_SANMIGUELIA = new CustomTrigger("pf_book_sanmiguelia");
    public static final CustomTrigger CLICK_LEPIDODENDRON = new CustomTrigger("pf_book_lepidodendron");
    public static final CustomTrigger CLICK_LEPIDOPHLOIOS = new CustomTrigger("pf_book_lepidophloios");
    public static final CustomTrigger CLICK_SCHIZONEURA = new CustomTrigger("pf_book_schizoneura");
    public static final CustomTrigger CLICK_SCHMEISSNERIA = new CustomTrigger("pf_book_schmeissneria");
    public static final CustomTrigger CLICK_SCIADOPITYS = new CustomTrigger("pf_book_sciadopitys");
    public static final CustomTrigger CLICK_SCOLECOPTERIS = new CustomTrigger("pf_book_scolecopteris");
    public static final CustomTrigger CLICK_SCYTOPHYLLUM = new CustomTrigger("pf_book_scytophyllum");
    public static final CustomTrigger CLICK_SELAGINELLA = new CustomTrigger("pf_book_selaginella");
    public static final CustomTrigger CLICK_SIGILLARIA = new CustomTrigger("pf_book_sigillaria");
    public static final CustomTrigger CLICK_SILVER_TREEFERN = new CustomTrigger("pf_book_silver_treefern");
    public static final CustomTrigger CLICK_BURNISHED_TREEFERN = new CustomTrigger("pf_book_burnished_treefern");
    public static final CustomTrigger CLICK_SIPHUSAUCTUM = new CustomTrigger("pf_book_siphusauctum");
    public static final CustomTrigger CLICK_SKAARIPTERIS = new CustomTrigger("pf_book_skaaripteris");
    public static final CustomTrigger CLICK_BOTRYCHIOPSIS = new CustomTrigger("pf_book_botrychiopsis");
    public static final CustomTrigger CLICK_CHIROPTERIS = new CustomTrigger("pf_book_chiropteris");
    public static final CustomTrigger CLICK_SPACIINODUM = new CustomTrigger("pf_book_spaciinodum");
    public static final CustomTrigger CLICK_SPHENOBAIERA = new CustomTrigger("pf_book_sphenobaiera");
    public static final CustomTrigger CLICK_SPHENOPTERIS = new CustomTrigger("pf_book_sphenopteris");
    public static final CustomTrigger CLICK_SPHENOPTERIS_FERN = new CustomTrigger("pf_book_sphenopteris_fern");
    public static final CustomTrigger CLICK_SPHENOPTERIS_SEED = new CustomTrigger("pf_book_sphenopteris_seed");
    public static final CustomTrigger CLICK_CALAMOPITYS = new CustomTrigger("pf_book_calamopitys");
    public static final CustomTrigger CLICK_CALATHOSPERMUM = new CustomTrigger("pf_book_calathospermum");
    public static final CustomTrigger CLICK_ANGIOPTERIS = new CustomTrigger("pf_book_angiopteris");
    public static final CustomTrigger CLICK_SPINY_CYCAD = new CustomTrigger("pf_book_spiny_cycad");
    public static final CustomTrigger CLICK_SPRUCE = new CustomTrigger("pf_book_spruce");
    public static final CustomTrigger CLICK_STAUROPTERIS = new CustomTrigger("pf_book_stauropteris");
    public static final CustomTrigger CLICK_STIFF_CYCAD = new CustomTrigger("pf_book_stiff_cycad");
    public static final CustomTrigger CLICK_STROMATOCYSTITES = new CustomTrigger("pf_book_stromatocystites");
    public static final CustomTrigger CLICK_STROMATOLITE = new CustomTrigger("pf_book_stromatolite");
    public static final CustomTrigger CLICK_STROMATOVERIS = new CustomTrigger("pf_book_stromatoveris");
    public static final CustomTrigger CLICK_SURANGEPHYLLUM = new CustomTrigger("pf_book_surangephyllum");
    public static final CustomTrigger CLICK_SWAMP_HORSETAIL = new CustomTrigger("pf_book_swamp_horsetail");
    public static final CustomTrigger CLICK_SWARTPUNTIA = new CustomTrigger("pf_book_swartpuntia");
    public static final CustomTrigger CLICK_SYCAMORE = new CustomTrigger("pf_book_sycamore");
    public static final CustomTrigger CLICK_CHESTNUT = new CustomTrigger("pf_book_chestnut");
    public static final CustomTrigger CLICK_TAWUIA = new CustomTrigger("pf_book_tawuia");
    public static final CustomTrigger CLICK_TAXODIUM = new CustomTrigger("pf_book_taxodium");
    public static final CustomTrigger CLICK_TELEMACHUS = new CustomTrigger("pf_book_telemachus");
    public static final CustomTrigger CLICK_TEMPSKYA = new CustomTrigger("pf_book_tempskya");
    public static final CustomTrigger CLICK_TENTACULITA = new CustomTrigger("pf_book_tentaculita");
    public static final CustomTrigger CLICK_TETRAXYLOPTERIS = new CustomTrigger("pf_book_tetraxylopteris");
    public static final CustomTrigger CLICK_THAMNOBEATRICEA = new CustomTrigger("pf_book_thamnobeatricea");
    public static final CustomTrigger CLICK_THAUMAPTILON = new CustomTrigger("pf_book_thaumaptilon");
    public static final CustomTrigger CLICK_THECTARDIS = new CustomTrigger("pf_book_thectardis");
    public static final CustomTrigger CLICK_THROMBOLITE = new CustomTrigger("pf_book_thrombolite");
    public static final CustomTrigger CLICK_THUCYDIA = new CustomTrigger("pf_book_thucydia");
    public static final CustomTrigger CLICK_TIETEA = new CustomTrigger("pf_book_tietea");
    public static final CustomTrigger CLICK_TMESIPTERIS = new CustomTrigger("pf_book_tmesipteris");
    public static final CustomTrigger CLICK_TODITES = new CustomTrigger("pf_book_todites");
    public static final CustomTrigger CLICK_TONGCHUANOPHYLLUM = new CustomTrigger("pf_book_tongchuanophyllum");
    public static final CustomTrigger CLICK_TRIBRACHIDIUM = new CustomTrigger("pf_book_tribrachidium");
    public static final CustomTrigger CLICK_TRICHOPITYS = new CustomTrigger("pf_book_trichopitys");
    public static final CustomTrigger CLICK_TYRMIA = new CustomTrigger("pf_book_tyrmia");
    public static final CustomTrigger CLICK_UMALTOLEPIS = new CustomTrigger("pf_book_umaltolepis");
    public static final CustomTrigger CLICK_UTRECHTIA = new CustomTrigger("pf_book_utrechtia");
    public static final CustomTrigger CLICK_VALMEYERODENDRON = new CustomTrigger("pf_book_valmeyerodendron");
    public static final CustomTrigger CLICK_VENTOGYRUS = new CustomTrigger("pf_book_ventogyrus");
    public static final CustomTrigger CLICK_WACHTLERIA = new CustomTrigger("pf_book_wachtleria");
    public static final CustomTrigger CLICK_WACHTLERINA = new CustomTrigger("pf_book_wachtlerina");
    public static final CustomTrigger CLICK_DECHELLYIA = new CustomTrigger("pf_book_dechellyia");
    public static final CustomTrigger CLICK_WALCHIA = new CustomTrigger("pf_book_walchia");
    public static final CustomTrigger CLICK_WATER_HORSETAIL = new CustomTrigger("pf_book_water_horsetail");
    public static final CustomTrigger CLICK_WATTIEZA = new CustomTrigger("pf_book_wattieza");
    public static final CustomTrigger CLICK_SANFORDIACAULIS = new CustomTrigger("pf_book_sanfordiacaulis");
    public static final CustomTrigger CLICK_WEICHSELIA = new CustomTrigger("pf_book_weichselia");
    public static final CustomTrigger CLICK_WIELANDIELLA = new CustomTrigger("pf_book_wielandiella");
    public static final CustomTrigger CLICK_WILLIAMSONIA = new CustomTrigger("pf_book_williamsonia");
    public static final CustomTrigger CLICK_WOLLEMI = new CustomTrigger("pf_book_wollemi");
    public static final CustomTrigger CLICK_WOOD_HORSETAIL = new CustomTrigger("pf_book_wood_horsetail");
    public static final CustomTrigger CLICK_XENOCLADIA = new CustomTrigger("pf_book_xenocladia");
    public static final CustomTrigger CLICK_ATLI = new CustomTrigger("pf_book_atli");
    public static final CustomTrigger CLICK_RATTAN = new CustomTrigger("pf_book_rattan");
    public static final CustomTrigger CLICK_XIANGUANGIA = new CustomTrigger("pf_book_xianguangia");
    public static final CustomTrigger CLICK_XIHUPHYLLUM = new CustomTrigger("pf_book_xihuphyllum");
    public static final CustomTrigger CLICK_YEW = new CustomTrigger("pf_book_yew");
    public static final CustomTrigger CLICK_ZAMITES = new CustomTrigger("pf_book_zamites");
    public static final CustomTrigger CLICK_ZOSTEROPHYLLUM = new CustomTrigger("pf_book_zosterophyllum");
    public static final CustomTrigger CLICK_ZYGOPTERIDACEAE = new CustomTrigger("pf_book_zygopteridaceae");
    public static final CustomTrigger CLICK_SYMPLOCOPTERIS = new CustomTrigger("pf_book_symplocopteris");
    public static final CustomTrigger CLICK_ZYGOPTERIS = new CustomTrigger("pf_book_zygopteris");

    public static final CustomTrigger CLICK_CEPHALOTAXUS = new CustomTrigger("pf_book_cephalotaxus");
    public static final CustomTrigger CLICK_CUNNINGHAMIA = new CustomTrigger("pf_book_cunninghamia");
    public static final CustomTrigger CLICK_HOOP_ARAUCARIA = new CustomTrigger("pf_book_hoop_araucaria");
    public static final CustomTrigger CLICK_AMENOTAXUS = new CustomTrigger("pf_book_amentotaxus");
    public static final CustomTrigger CLICK_PALISSYA = new CustomTrigger("pf_book_palissya");
    public static final CustomTrigger CLICK_SCRUBBY_PINE = new CustomTrigger("pf_book_scrubby_pine");
    public static final CustomTrigger CLICK_GOLDEN_LARCH = new CustomTrigger("pf_book_golden_larch");
    public static final CustomTrigger CLICK_ARID_PINE = new CustomTrigger("pf_book_arid_pine");
    public static final CustomTrigger CLICK_CEDAR = new CustomTrigger("pf_book_cedar");
    public static final CustomTrigger CLICK_OLIVE = new CustomTrigger("pf_book_olive");
    public static final CustomTrigger CLICK_THUJA = new CustomTrigger("pf_book_thuja");
    public static final CustomTrigger CLICK_LIQUIDAMBAR = new CustomTrigger("pf_book_liquidambar");
    public static final CustomTrigger CLICK_ROGERSIA = new CustomTrigger("pf_book_rogersia");

    public static final CustomTrigger CLICK_KERAPHYTON = new CustomTrigger("pf_book_keraphyton");
    public static final CustomTrigger CLICK_PIETZSCHIA = new CustomTrigger("pf_book_pietzschia");
    public static final CustomTrigger CLICK_FLABELLOPTERIS = new CustomTrigger("pf_book_flabellopteris");
    public static final CustomTrigger CLICK_KTALENIA = new CustomTrigger("pf_book_ktalenia");
    public static final CustomTrigger CLICK_TODEA = new CustomTrigger("pf_book_todea");

    //Grouped ones:
    public static final CustomTrigger CLICK_BLASTOID = new CustomTrigger("pf_book_blastoid");
    public static final CustomTrigger CLICK_SPONGE = new CustomTrigger("pf_book_sponge");
    public static final CustomTrigger CLICK_CORAL = new CustomTrigger("pf_book_coral");
    public static final CustomTrigger CLICK_CAYTONIALES = new CustomTrigger("pf_book_caytoniales");
    public static final CustomTrigger CLICK_FENESTELLA = new CustomTrigger("pf_book_fenestella");
    public static final CustomTrigger CLICK_MATONIA = new CustomTrigger("pf_book_matonia");
    public static final CustomTrigger CLICK_PRIMOCANDELABRUM = new CustomTrigger("pf_book_primocandelabrum");
    public static final CustomTrigger CLICK_RUGOSA = new CustomTrigger("pf_book_rugosa");
    public static final CustomTrigger CLICK_SEA_ANEMONE = new CustomTrigger("pf_book_sea_anemone");
    public static final CustomTrigger CLICK_SPHENOPHYLLALES = new CustomTrigger("pf_book_sphenophyllales");
    public static final CustomTrigger CLICK_TABULATA = new CustomTrigger("pf_book_tabulata");



    //Knowledge of mobs:
    public static final CustomTrigger CLICK_ACADOARADOXIDES = new CustomTrigger("pf_book_acadoaradoxides");
    public static final CustomTrigger CLICK_ACANTHODES = new CustomTrigger("pf_book_acanthodes");
    public static final CustomTrigger CLICK_ACANTHOSTEGA = new CustomTrigger("pf_book_acanthostega");
    public static final CustomTrigger CLICK_ACANTHOSTOMATOPS = new CustomTrigger("pf_book_acanthostomatops");
    public static final CustomTrigger CLICK_ACROLEPIS = new CustomTrigger("pf_book_acrolepis");
    public static final CustomTrigger CLICK_ACUTIRAMUS = new CustomTrigger("pf_book_acutiramus");
    public static final CustomTrigger CLICK_ADELOPHTHALMUS = new CustomTrigger("pf_book_adelophthalmus");
    public static final CustomTrigger CLICK_AEGIROCASSIS = new CustomTrigger("pf_book_aegirocassis");
    public static final CustomTrigger CLICK_AINIKTOZOON = new CustomTrigger("pf_book_ainiktozoon");
    public static final CustomTrigger CLICK_AKMONISTION = new CustomTrigger("pf_book_akmonistion");
    public static final CustomTrigger CLICK_ALACARIS = new CustomTrigger("pf_book_alacaris");
    public static final CustomTrigger CLICK_ALBERTONIA = new CustomTrigger("pf_book_albertonia");
    public static final CustomTrigger CLICK_ALLENYPTERUS = new CustomTrigger("pf_book_allenypterus");
    public static final CustomTrigger CLICK_AMMONITE_ASTEROCERAS = new CustomTrigger("pf_book_ammonite_asteroceras");
    public static final CustomTrigger CLICK_AMMONITE_CERATITES = new CustomTrigger("pf_book_ammonite_ceratites");
    public static final CustomTrigger CLICK_AMMONITE_CORONICERAS = new CustomTrigger("pf_book_ammonite_coroniceras");
    public static final CustomTrigger CLICK_AMMONITE_CYLOLOBUS = new CustomTrigger("pf_book_ammonite_cylolobus");
    public static final CustomTrigger CLICK_AMMONITE_DACTYLIOCERAS = new CustomTrigger("pf_book_ammonite_dactylioceras");
    public static final CustomTrigger CLICK_AMMONITE_GONIATITES = new CustomTrigger("pf_book_ammonite_goniatites");
    public static final CustomTrigger CLICK_AMMONITE_MANTICOCERAS = new CustomTrigger("pf_book_ammonite_manticoceras");
    public static final CustomTrigger CLICK_AMMONITE_PACHYDESMOCERAS = new CustomTrigger("pf_book_ammonite_pachydesmoceras");
    public static final CustomTrigger CLICK_AMMONITE_PACHYDISCUS = new CustomTrigger("pf_book_ammonite_pachydiscus");
    public static final CustomTrigger CLICK_AMMONITE_PARAPUZOSIA = new CustomTrigger("pf_book_ammonite_parapuzosia");
    public static final CustomTrigger CLICK_AMMONITE_TITANITES = new CustomTrigger("pf_book_ammonite_titanites");
    public static final CustomTrigger CLICK_AMPHIBAMUS = new CustomTrigger("pf_book_amphibamus");
    public static final CustomTrigger CLICK_AMPLECTOBELUA = new CustomTrigger("pf_book_amplectobelua");
    public static final CustomTrigger CLICK_ANOMALOCARIS = new CustomTrigger("pf_book_anomalocaris");
    public static final CustomTrigger CLICK_ANTARCTICARCINUS = new CustomTrigger("pf_book_antarcticarcinus");
    public static final CustomTrigger CLICK_ANTEOSAURUS = new CustomTrigger("pf_book_anteosaurus");
    public static final CustomTrigger CLICK_ANTHRACOMEDUSA = new CustomTrigger("pf_book_anthracomedusa");
    public static final CustomTrigger CLICK_ANTINEOSTEUS = new CustomTrigger("pf_book_antineosteus");
    public static final CustomTrigger CLICK_APHETOCERAS = new CustomTrigger("pf_book_aphetoceras");
    public static final CustomTrigger CLICK_ARANDASPIS = new CustomTrigger("pf_book_arandaspis");
    public static final CustomTrigger CLICK_ARCHOBLATTINA = new CustomTrigger("pf_book_archoblattina");
    public static final CustomTrigger CLICK_ARCHOBLATTINA_NYMPH = new CustomTrigger("pf_book_archoblattina_nymph");
    public static final CustomTrigger CLICK_ARCHOSAURUS = new CustomTrigger("pf_book_archosaurus");
    public static final CustomTrigger CLICK_ARTHROPLEURA = new CustomTrigger("pf_book_arthropleura");
    public static final CustomTrigger CLICK_ASAPHUS = new CustomTrigger("pf_book_asaphus");
    public static final CustomTrigger CLICK_ASCENDONANUS = new CustomTrigger("pf_book_ascendonanus");
    public static final CustomTrigger CLICK_ATELEASPIS = new CustomTrigger("pf_book_ateleaspis");
    public static final CustomTrigger CLICK_ATTERCOPUS = new CustomTrigger("pf_book_attercopus");
    public static final CustomTrigger CLICK_AULACEPHALODON = new CustomTrigger("pf_book_aulacephalodon");
    public static final CustomTrigger CLICK_BALANERPETON = new CustomTrigger("pf_book_balanerpeton");
    public static final CustomTrigger CLICK_BANDRINGA = new CustomTrigger("pf_book_bandringa");
    public static final CustomTrigger CLICK_BANFFIA = new CustomTrigger("pf_book_banffia");
    public static final CustomTrigger CLICK_BARBCLABORNIA = new CustomTrigger("pf_book_barbclabornia");
    public static final CustomTrigger CLICK_BASILOCERAS = new CustomTrigger("pf_book_basiloceras");
    public static final CustomTrigger CLICK_BATOFASCICULUS = new CustomTrigger("pf_book_batofasciculus");
    public static final CustomTrigger CLICK_BELANTSEA = new CustomTrigger("pf_book_belantsea");
    public static final CustomTrigger CLICK_BIRKENIA = new CustomTrigger("pf_book_birkenia");
    public static final CustomTrigger CLICK_BLOURUGIA = new CustomTrigger("pf_book_blourugia");
    public static final CustomTrigger CLICK_BOBASATRANIA = new CustomTrigger("pf_book_bobasatrania");
    public static final CustomTrigger CLICK_BOTHRIOLEPIS = new CustomTrigger("pf_book_bothriolepis");
    public static final CustomTrigger CLICK_BRANCHIOSAUR = new CustomTrigger("pf_book_branchiosaur");
    public static final CustomTrigger CLICK_BROCHOADMONES = new CustomTrigger("pf_book_brochoadmones");
    public static final CustomTrigger CLICK_BUNOSTEGOS = new CustomTrigger("pf_book_bunostegos");
    public static final CustomTrigger CLICK_BUSHIZHEIA = new CustomTrigger("pf_book_bushizheia");
    public static final CustomTrigger CLICK_CACOPS = new CustomTrigger("pf_book_cacops");
    public static final CustomTrigger CLICK_CAMBRORASTER = new CustomTrigger("pf_book_cambroraster");
    public static final CustomTrigger CLICK_CAMEROCERAS = new CustomTrigger("pf_book_cameroceras");
    public static final CustomTrigger CLICK_CAMPBELLODUS = new CustomTrigger("pf_book_campbellodus");
    public static final CustomTrigger CLICK_CANADASPIS = new CustomTrigger("pf_book_canadaspis");
    public static final CustomTrigger CLICK_CANADIA = new CustomTrigger("pf_book_canadia");
    public static final CustomTrigger CLICK_CAPTORHINUS = new CustomTrigger("pf_book_captorhinus");
    public static final CustomTrigger CLICK_CARCINOSOMA = new CustomTrigger("pf_book_carcinosoma");
    public static final CustomTrigger CLICK_CAROLOWILHELMINA = new CustomTrigger("pf_book_carolowilhelmina");
    public static final CustomTrigger CLICK_CASINERIA = new CustomTrigger("pf_book_casineria");
    public static final CustomTrigger CLICK_CEPHALASPIS = new CustomTrigger("pf_book_cephalaspis");
    public static final CustomTrigger CLICK_CHEIRURUS = new CustomTrigger("pf_book_cheirurus");
    public static final CustomTrigger CLICK_CHELONIELLON = new CustomTrigger("pf_book_cheloniellon");
    public static final CustomTrigger CLICK_CLADOSELACHE = new CustomTrigger("pf_book_cladoselache");
    public static final CustomTrigger CLICK_CLAUDIOSAURUS = new CustomTrigger("pf_book_claudiosaurus");
    public static final CustomTrigger CLICK_CLYDAGNATHUS = new CustomTrigger("pf_book_clydagnathus");
    public static final CustomTrigger CLICK_COCCOSTEUS = new CustomTrigger("pf_book_coccosteus");
    public static final CustomTrigger CLICK_COELACANTHUS = new CustomTrigger("pf_book_coelacanthus");
    public static final CustomTrigger CLICK_COELOPHYSIS = new CustomTrigger("pf_book_coelophysis");
    public static final CustomTrigger CLICK_COELUROSAURAVUS = new CustomTrigger("pf_book_coelurosauravus");
    public static final CustomTrigger CLICK_COOPEROCERAS = new CustomTrigger("pf_book_cooperoceras");
    public static final CustomTrigger CLICK_COTHURNOCYSTIS = new CustomTrigger("pf_book_cothurnocystis");
    public static final CustomTrigger CLICK_COTYLORHYNCHUS = new CustomTrigger("pf_book_cotylorhynchus");
    public static final CustomTrigger CLICK_CRASSIGYRINUS = new CustomTrigger("pf_book_crassigyrinus");
    public static final CustomTrigger CLICK_CROTALOCEPHALUS = new CustomTrigger("pf_book_crotalocephalus");
    public static final CustomTrigger CLICK_CTENOSPONDYLUS = new CustomTrigger("pf_book_ctenospondylus");
    public static final CustomTrigger CLICK_CYCLONEMA = new CustomTrigger("pf_book_cyclonema");
    public static final CustomTrigger CLICK_CYNOGNATHUS = new CustomTrigger("pf_book_cynognathus");
    public static final CustomTrigger CLICK_CYRTOCERAS = new CustomTrigger("pf_book_cyrtoceras");
    public static final CustomTrigger CLICK_DAEDALICHTHYS = new CustomTrigger("pf_book_daedalichthys");
    public static final CustomTrigger CLICK_DALMANITES = new CustomTrigger("pf_book_dalmanites");
    public static final CustomTrigger CLICK_DASYCEPS = new CustomTrigger("pf_book_dasyceps");
    public static final CustomTrigger CLICK_DATHEOSAURUS = new CustomTrigger("pf_book_datheosaurus");
    public static final CustomTrigger CLICK_DEIROCERAS = new CustomTrigger("pf_book_deiroceras");
    public static final CustomTrigger CLICK_DIADECTES = new CustomTrigger("pf_book_diadectes");
    public static final CustomTrigger CLICK_DIANIA = new CustomTrigger("pf_book_diania");
    public static final CustomTrigger CLICK_DICKINSONIA = new CustomTrigger("pf_book_dickinsonia");
    public static final CustomTrigger CLICK_ATTENBORITES = new CustomTrigger("pf_book_attenborites");
    public static final CustomTrigger CLICK_DIDYMOGRAPTUS = new CustomTrigger("pf_book_didymograptus");
    public static final CustomTrigger CLICK_DIICTODON = new CustomTrigger("pf_book_diictodon");
    public static final CustomTrigger CLICK_DIMETRODON = new CustomTrigger("pf_book_dimetrodon");
    public static final CustomTrigger CLICK_DIPLOCAULUS = new CustomTrigger("pf_book_diplocaulus");
    public static final CustomTrigger CLICK_DIPLOCERASPIS = new CustomTrigger("pf_book_diploceraspis");
    public static final CustomTrigger CLICK_DORYASPIS = new CustomTrigger("pf_book_doryaspis");
    public static final CustomTrigger CLICK_DORYPTERUS = new CustomTrigger("pf_book_dorypterus");
    public static final CustomTrigger CLICK_DRACOPRISTIS = new CustomTrigger("pf_book_dracopristis");
    public static final CustomTrigger CLICK_DREPANASPIS = new CustomTrigger("pf_book_drepanaspis");
    public static final CustomTrigger CLICK_DUNKLEOSTEUS = new CustomTrigger("pf_book_dunkleosteus");
    public static final CustomTrigger CLICK_DVINIA = new CustomTrigger("pf_book_dvinia");
    public static final CustomTrigger CLICK_DVINOSAURUS = new CustomTrigger("pf_book_dvinosaurus");
    public static final CustomTrigger CLICK_EBENAQUA = new CustomTrigger("pf_book_ebenaqua");
    public static final CustomTrigger CLICK_EDESTUS = new CustomTrigger("pf_book_edestus");
    public static final CustomTrigger CLICK_EGLONASPIS = new CustomTrigger("pf_book_eglonaspis");
    public static final CustomTrigger CLICK_ELGINIA = new CustomTrigger("pf_book_elginia");
    public static final CustomTrigger CLICK_ELLIPSOCEPHALUS = new CustomTrigger("pf_book_ellipsocephalus");
    public static final CustomTrigger CLICK_ELRATHIA = new CustomTrigger("pf_book_elrathia");
    public static final CustomTrigger CLICK_ENDOCERAS = new CustomTrigger("pf_book_endoceras");
    public static final CustomTrigger CLICK_ENOPLOURA = new CustomTrigger("pf_book_enoploura");
    public static final CustomTrigger CLICK_EOANDROMEDA = new CustomTrigger("pf_book_eoandromeda");
    public static final CustomTrigger CLICK_EOARTHROPLEURA = new CustomTrigger("pf_book_eoarthropleura");
    public static final CustomTrigger CLICK_EORAPTOR = new CustomTrigger("pf_book_eoraptor");
    public static final CustomTrigger CLICK_EOREDLICHIA = new CustomTrigger("pf_book_eoredlichia");
    public static final CustomTrigger CLICK_EOSAURICHTHYS = new CustomTrigger("pf_book_eosaurichthys");
    public static final CustomTrigger CLICK_EOSIMOPS = new CustomTrigger("pf_book_eosimops");
    public static final CustomTrigger CLICK_ERICIXERXES = new CustomTrigger("pf_book_ericixerxes");
    public static final CustomTrigger CLICK_ERYOPS = new CustomTrigger("pf_book_eryops");
    public static final CustomTrigger CLICK_ESTEMMENOSUCHUS = new CustomTrigger("pf_book_estemmenosuchus");
    public static final CustomTrigger CLICK_EUCHAMBERSIA = new CustomTrigger("pf_book_euchambersia");
    public static final CustomTrigger CLICK_EUNOTOSAURUS = new CustomTrigger("pf_book_eunotosaurus");
    public static final CustomTrigger CLICK_EURYPTERUS = new CustomTrigger("pf_book_eurypterus");
    public static final CustomTrigger CLICK_EUSTHENOPTERON = new CustomTrigger("pf_book_eusthenopteron");
    public static final CustomTrigger CLICK_FEROXICHTHYS = new CustomTrigger("pf_book_feroxichthys");
    public static final CustomTrigger CLICK_FURCACAUDA = new CustomTrigger("pf_book_furcacauda");
    public static final CustomTrigger CLICK_FURCASTER = new CustomTrigger("pf_book_furcaster");
    public static final CustomTrigger CLICK_GABREYASPIS = new CustomTrigger("pf_book_gabreyaspis");
    public static final CustomTrigger CLICK_GANTAROSTRATASPIS = new CustomTrigger("pf_book_gantarostrataspis");
    public static final CustomTrigger CLICK_GEMMACTENA = new CustomTrigger("pf_book_gemmactena");
    public static final CustomTrigger CLICK_GEMUENDINA = new CustomTrigger("pf_book_gemuendina");
    public static final CustomTrigger CLICK_GEPHYROSTEGUS = new CustomTrigger("pf_book_gephyrostegus");
    public static final CustomTrigger CLICK_GERARUS = new CustomTrigger("pf_book_gerarus");
    public static final CustomTrigger CLICK_GLAURUNG = new CustomTrigger("pf_book_glaurung");
    public static final CustomTrigger CLICK_GNATHORHIZA = new CustomTrigger("pf_book_gnathorhiza");
    public static final CustomTrigger CLICK_GONIOCERAS = new CustomTrigger("pf_book_gonioceras");
    public static final CustomTrigger CLICK_GORGONOPS = new CustomTrigger("pf_book_gorgonops");
    public static final CustomTrigger CLICK_GROENLANDASPIS = new CustomTrigger("pf_book_groenlandaspis");
    public static final CustomTrigger CLICK_GYRACANTHIDES = new CustomTrigger("pf_book_gyracanthides");
    public static final CustomTrigger CLICK_HAIKOUICHTHYS = new CustomTrigger("pf_book_haikouichthys");
    public static final CustomTrigger CLICK_HALLUCIGENIA = new CustomTrigger("pf_book_hallucigenia");
    public static final CustomTrigger CLICK_HARVESTMAN = new CustomTrigger("pf_book_harvestman");
    public static final CustomTrigger CLICK_HELENODORA = new CustomTrigger("pf_book_helenodora");
    public static final CustomTrigger CLICK_HELIANTHASTER = new CustomTrigger("pf_book_helianthaster");
    public static final CustomTrigger CLICK_HELICOPRION = new CustomTrigger("pf_book_helicoprion");
    public static final CustomTrigger CLICK_HELMETIA = new CustomTrigger("pf_book_helmetia");
    public static final CustomTrigger CLICK_HEMICYCLASPIS = new CustomTrigger("pf_book_hemicyclaspis");
    public static final CustomTrigger CLICK_HERRERASAURUS = new CustomTrigger("pf_book_herrerasaurus");
    public static final CustomTrigger CLICK_HETEROSTEUS = new CustomTrigger("pf_book_heterosteus");
    public static final CustomTrigger CLICK_HIBBERTOPTERUS = new CustomTrigger("pf_book_hibbertopterus");
    public static final CustomTrigger CLICK_HIBERNASPIS = new CustomTrigger("pf_book_hibernaspis");
    public static final CustomTrigger CLICK_HUNGIOIDES = new CustomTrigger("pf_book_hungioides");
    public static final CustomTrigger CLICK_HYLONOMUS = new CustomTrigger("pf_book_hylonomus");
    public static final CustomTrigger CLICK_HYNERIA = new CustomTrigger("pf_book_hyneria");
    public static final CustomTrigger CLICK_ICHTHYOSTEGA = new CustomTrigger("pf_book_ichthyostega");
    public static final CustomTrigger CLICK_INIOPTERYX = new CustomTrigger("pf_book_iniopteryx");
    public static final CustomTrigger CLICK_INOSTRANCEVIA = new CustomTrigger("pf_book_inostrancevia");
    public static final CustomTrigger CLICK_ISOTELUS = new CustomTrigger("pf_book_isotelus");
    public static final CustomTrigger CLICK_ITALOPHLEBIA = new CustomTrigger("pf_book_italophlebia");
    public static final CustomTrigger CLICK_JAEKELOPTERUS = new CustomTrigger("pf_book_jaekelopterus");
    public static final CustomTrigger CLICK_JANASSA = new CustomTrigger("pf_book_janassa");
    public static final CustomTrigger CLICK_JELLYFISH_PRECAMBRIAN = new CustomTrigger("pf_book_jellyfish_precambrian");
    public static final CustomTrigger CLICK_JELLYFISH1 = new CustomTrigger("pf_book_jellyfish1");
    public static final CustomTrigger CLICK_JELLYFISH2 = new CustomTrigger("pf_book_jellyfish2");
    public static final CustomTrigger CLICK_JELLYFISH3 = new CustomTrigger("pf_book_jellyfish3");
    public static final CustomTrigger CLICK_JELLYFISH4 = new CustomTrigger("pf_book_jellyfish4");
    public static final CustomTrigger CLICK_JELLYFISH5 = new CustomTrigger("pf_book_jellyfish5");
    public static final CustomTrigger CLICK_JELLYFISH6 = new CustomTrigger("pf_book_jellyfish6");
    public static final CustomTrigger CLICK_JELLYFISH7 = new CustomTrigger("pf_book_jellyfish7");
    public static final CustomTrigger CLICK_JIANSHANOPODIA = new CustomTrigger("pf_book_jianshanopodia");
    public static final CustomTrigger CLICK_JONKERIA = new CustomTrigger("pf_book_jonkeria");
    public static final CustomTrigger CLICK_KAIBABVENATOR = new CustomTrigger("pf_book_kaibabvenator");
    public static final CustomTrigger CLICK_KALBARRIA = new CustomTrigger("pf_book_kalbarria");
    public static final CustomTrigger CLICK_KERYGMACHELA = new CustomTrigger("pf_book_kerygmachela");
    public static final CustomTrigger CLICK_KIMBERELLA = new CustomTrigger("pf_book_kimberella");
    public static final CustomTrigger CLICK_KODYMIRUS = new CustomTrigger("pf_book_kodymirus");
    public static final CustomTrigger CLICK_KOKOMOPTERUS = new CustomTrigger("pf_book_kokomopterus");
    public static final CustomTrigger CLICK_LABIDOSAURUS = new CustomTrigger("pf_book_labidosaurus");
    public static final CustomTrigger CLICK_LACCOGNATHUS = new CustomTrigger("pf_book_laccognathus");
    public static final CustomTrigger CLICK_LAMINACARIS = new CustomTrigger("pf_book_laminacaris");
    public static final CustomTrigger CLICK_LEBACHACANTHUS = new CustomTrigger("pf_book_lebachacanthus");
    public static final CustomTrigger CLICK_LILIENSTERNUS = new CustomTrigger("pf_book_liliensternus");
    public static final CustomTrigger CLICK_LIMNOSCELIS = new CustomTrigger("pf_book_limnoscelis");
    public static final CustomTrigger CLICK_LISOWICIA = new CustomTrigger("pf_book_lisowicia");
    public static final CustomTrigger CLICK_LISTRACANTHUS = new CustomTrigger("pf_book_listracanthus");
    public static final CustomTrigger CLICK_LUNASPIS = new CustomTrigger("pf_book_lunaspis");
    public static final CustomTrigger CLICK_LUNATASPIS = new CustomTrigger("pf_book_lunataspis");
    public static final CustomTrigger CLICK_LUNGMENSHANASPIS = new CustomTrigger("pf_book_lungmenshanaspis");
    public static final CustomTrigger CLICK_LYRARAPAX = new CustomTrigger("pf_book_lyrarapax");
    public static final CustomTrigger CLICK_LYSTROSAURUS = new CustomTrigger("pf_book_lystrosaurus");
    public static final CustomTrigger CLICK_MACLURINA = new CustomTrigger("pf_book_maclurina");
    public static final CustomTrigger CLICK_MARRELLA = new CustomTrigger("pf_book_marrella");
    public static final CustomTrigger CLICK_MASTODONSAURUS = new CustomTrigger("pf_book_mastodonsaurus");
    public static final CustomTrigger CLICK_MCNAMARASPIS = new CustomTrigger("pf_book_mcnamaraspis");
    public static final CustomTrigger CLICK_MEGALOCEPHALUS = new CustomTrigger("pf_book_megalocephalus");
    public static final CustomTrigger CLICK_MEGALOGRAPTUS = new CustomTrigger("pf_book_megalograptus");
    public static final CustomTrigger CLICK_MEGANEURA = new CustomTrigger("pf_book_meganeura");
    public static final CustomTrigger CLICK_MEGANEUROPSIS = new CustomTrigger("pf_book_meganeuropsis");
    public static final CustomTrigger CLICK_MEGARACHNE = new CustomTrigger("pf_book_megarachne");
    public static final CustomTrigger CLICK_MELOSAURUS = new CustomTrigger("pf_book_melosaurus");
    public static final CustomTrigger CLICK_MENASPIS = new CustomTrigger("pf_book_menaspis");
    public static final CustomTrigger CLICK_MESOSAURUS = new CustomTrigger("pf_book_mesosaurus");
    public static final CustomTrigger CLICK_METASPRIGGINA = new CustomTrigger("pf_book_metaspriggina");
    public static final CustomTrigger CLICK_MICRODICTYON = new CustomTrigger("pf_book_microdictyon");
    public static final CustomTrigger CLICK_MIMETASTER = new CustomTrigger("pf_book_mimetaster");
    public static final CustomTrigger CLICK_MIXOPTERUS = new CustomTrigger("pf_book_mixopterus");
    public static final CustomTrigger CLICK_MIXOSAURUS = new CustomTrigger("pf_book_mixosaurus");
    public static final CustomTrigger CLICK_MONOGRAPTUS = new CustomTrigger("pf_book_monograptus");
    public static final CustomTrigger CLICK_MOOREOCERAS = new CustomTrigger("pf_book_mooreoceras");
    public static final CustomTrigger CLICK_MOSCHOPS = new CustomTrigger("pf_book_moschops");
    public static final CustomTrigger CLICK_ANGUSTIDONTUS = new CustomTrigger("pf_book_angustidontus");
    public static final CustomTrigger CLICK_COWIELEPIS = new CustomTrigger("pf_book_cowielepis");
    public static final CustomTrigger CLICK_NECTOCARIS = new CustomTrigger("pf_book_nectocaris");
    public static final CustomTrigger CLICK_ODARAIA = new CustomTrigger("pf_book_odaraia");
    public static final CustomTrigger CLICK_ODONTOGRIPHUS = new CustomTrigger("pf_book_odontogriphus");
    public static final CustomTrigger CLICK_OMNIDENS = new CustomTrigger("pf_book_omnidens");
    public static final CustomTrigger CLICK_ONYCHODUS = new CustomTrigger("pf_book_onychodus");
    public static final CustomTrigger CLICK_OPABINIA = new CustomTrigger("pf_book_opabinia");
    public static final CustomTrigger CLICK_OPHIACODON = new CustomTrigger("pf_book_ophiacodon");
    public static final CustomTrigger CLICK_ORTHOCERAS = new CustomTrigger("pf_book_orthoceras");
    public static final CustomTrigger CLICK_ORTHROZANCLUS = new CustomTrigger("pf_book_orthrozanclus");
    public static final CustomTrigger CLICK_OSTEOLEPIS = new CustomTrigger("pf_book_osteolepis");
    public static final CustomTrigger CLICK_OTTOIA = new CustomTrigger("pf_book_ottoia");
    public static final CustomTrigger CLICK_PAGEA = new CustomTrigger("pf_book_pagea");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_DELITZSCHALA = new CustomTrigger("pf_book_palaeodictyoptera_delitzschala");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_DUNBARIA = new CustomTrigger("pf_book_palaeodictyoptera_dunbaria");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_HOMALONEURA = new CustomTrigger("pf_book_palaeodictyoptera_homaloneura");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_HOMOIOPTERA = new CustomTrigger("pf_book_palaeodictyoptera_homoioptera");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_LITHOMANTIS = new CustomTrigger("pf_book_palaeodictyoptera_lithomantis");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_LYCOCERCUS = new CustomTrigger("pf_book_palaeodictyoptera_lycocercus");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_STENODICTYA = new CustomTrigger("pf_book_palaeodictyoptera_stenodictya");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_SINODUNBARIA = new CustomTrigger("pf_book_palaeodictyoptera_sinodunbaria");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_MAZOTHAIROS = new CustomTrigger("pf_book_palaeodictyoptera_mazothairos");
    public static final CustomTrigger CLICK_PALAEODICTYOPTERA_PSYCHROPTILUS = new CustomTrigger("pf_book_palaeodictyoptera_psychroptilus");
    public static final CustomTrigger CLICK_PALAEOISOPUS = new CustomTrigger("pf_book_palaeoisopus");
    public static final CustomTrigger CLICK_ANCIENT_JELLY = new CustomTrigger("pf_book_ancientjelly");
    public static final CustomTrigger CLICK_YUNNANOASCUS = new CustomTrigger("pf_book_yunnanoascus");
    public static final CustomTrigger CLICK_PALAEONTINID = new CustomTrigger("pf_book_palaeontinid");
    public static final CustomTrigger CLICK_PANDERICHTHYS = new CustomTrigger("pf_book_panderichthys");
    public static final CustomTrigger CLICK_PANTYLUS = new CustomTrigger("pf_book_pantylus");
    public static final CustomTrigger CLICK_PARADOXIDES = new CustomTrigger("pf_book_paradoxides");
    public static final CustomTrigger CLICK_PARANAICHTHYS = new CustomTrigger("pf_book_paranaichthys");
    public static final CustomTrigger CLICK_PAREXUS = new CustomTrigger("pf_book_parexus");
    public static final CustomTrigger CLICK_PARVANCORINA = new CustomTrigger("pf_book_parvancorina");
    public static final CustomTrigger CLICK_PAUCIPODIA = new CustomTrigger("pf_book_paucipodia");
    public static final CustomTrigger CLICK_PEDERPES = new CustomTrigger("pf_book_pederpes");
    public static final CustomTrigger CLICK_PELURGASPIS = new CustomTrigger("pf_book_pelurgaspis");
    public static final CustomTrigger CLICK_PHANEROTINUS = new CustomTrigger("pf_book_phanerotinus");
    public static final CustomTrigger CLICK_PHANTASPIS = new CustomTrigger("pf_book_phantaspis");
    public static final CustomTrigger CLICK_PHARYNGOLEPIS = new CustomTrigger("pf_book_pharyngolepis");
    public static final CustomTrigger CLICK_PHLEGETHONTIA = new CustomTrigger("pf_book_phlegethontia");
    public static final CustomTrigger CLICK_PHOLIDERPETON = new CustomTrigger("pf_book_pholiderpeton");
    public static final CustomTrigger CLICK_PIKAIA = new CustomTrigger("pf_book_pikaia");
    public static final CustomTrigger CLICK_PLACERIAS = new CustomTrigger("pf_book_placerias");
    public static final CustomTrigger CLICK_PLATEOSAURUS = new CustomTrigger("pf_book_plateosaurus");
    public static final CustomTrigger CLICK_PLATYCARASPIS = new CustomTrigger("pf_book_platycaraspis");
    public static final CustomTrigger CLICK_PLATYHYSTRIX = new CustomTrigger("pf_book_platyhystrix");
    public static final CustomTrigger CLICK_PLATYLOMASPIS = new CustomTrigger("pf_book_platylomaspis");
    public static final CustomTrigger CLICK_PLATYSOMUS = new CustomTrigger("pf_book_platysomus");
    public static final CustomTrigger CLICK_PNEUMODESMUS = new CustomTrigger("pf_book_pneumodesmus");
    public static final CustomTrigger CLICK_POLEUMITA = new CustomTrigger("pf_book_poleumita");
    public static final CustomTrigger CLICK_POMATRUM = new CustomTrigger("pf_book_pomatrum");
    public static final CustomTrigger CLICK_PORASPIS = new CustomTrigger("pf_book_poraspis");
    public static final CustomTrigger CLICK_PRIONOSUCHUS = new CustomTrigger("pf_book_prionosuchus");
    public static final CustomTrigger CLICK_PRISTEROGNATHUS = new CustomTrigger("pf_book_pristerognathus");
    public static final CustomTrigger CLICK_PROBURNETIA = new CustomTrigger("pf_book_proburnetia");
    public static final CustomTrigger CLICK_PROCYNOSUCHUS = new CustomTrigger("pf_book_procynosuchus");
    public static final CustomTrigger CLICK_PROFALLOTASPIS = new CustomTrigger("pf_book_profallotaspis");
    public static final CustomTrigger CLICK_PROMISSUM = new CustomTrigger("pf_book_promissum");
    public static final CustomTrigger CLICK_PROSICTODON = new CustomTrigger("pf_book_prosictodon");
    public static final CustomTrigger CLICK_PROTEROGYRINUS = new CustomTrigger("pf_book_proterogyrinus");
    public static final CustomTrigger CLICK_PROTOROSAURUS = new CustomTrigger("pf_book_protorosaurus");
    public static final CustomTrigger CLICK_PROTOZYGOPTERA = new CustomTrigger("pf_book_protozygoptera");
    public static final CustomTrigger CLICK_PSAROLEPIS = new CustomTrigger("pf_book_psarolepis");
    public static final CustomTrigger CLICK_PTERASPIS = new CustomTrigger("pf_book_pteraspis");
    public static final CustomTrigger CLICK_PTERYGOTUS = new CustomTrigger("pf_book_pterygotus");
    public static final CustomTrigger CLICK_PURLOVIA  = new CustomTrigger("pf_book_purlovia");
    public static final CustomTrigger CLICK_QILINYU = new CustomTrigger("pf_book_qilinyu");
    public static final CustomTrigger CLICK_RAUTIANIA = new CustomTrigger("pf_book_rautiania");
    public static final CustomTrigger CLICK_RAYONNOCERAS = new CustomTrigger("pf_book_rayonnoceras");
    public static final CustomTrigger CLICK_REBELLATRIX = new CustomTrigger("pf_book_rebellatrix");
    public static final CustomTrigger CLICK_REMIGIOMONTANUS = new CustomTrigger("pf_book_remigiomontanus");
    public static final CustomTrigger CLICK_RETIFACIES = new CustomTrigger("pf_book_retifacies");
    public static final CustomTrigger CLICK_RHIZODUS = new CustomTrigger("pf_book_rhizodus");
    public static final CustomTrigger CLICK_ROACHOID = new CustomTrigger("pf_book_roachoid");
    public static final CustomTrigger CLICK_ROBERTIA = new CustomTrigger("pf_book_robertia");
    public static final CustomTrigger CLICK_SACABAMBASPIS = new CustomTrigger("pf_book_sacabambaspis");
    public static final CustomTrigger CLICK_SAIVODUS = new CustomTrigger("pf_book_saivodus");
    public static final CustomTrigger CLICK_SALTRIOVENATOR = new CustomTrigger("pf_book_saltriovenator");
    public static final CustomTrigger CLICK_SAURICHTHYS = new CustomTrigger("pf_book_saurichthys");
    public static final CustomTrigger CLICK_SAURICHTHYS_FRESHWATER = new CustomTrigger("pf_book_saurichthys_freshwater");
    public static final CustomTrigger CLICK_SAUROCTONUS = new CustomTrigger("pf_book_sauroctonus");
    public static final CustomTrigger CLICK_SCAUMENACIA = new CustomTrigger("pf_book_scaumenacia");
    public static final CustomTrigger CLICK_SCHINDERHANNES = new CustomTrigger("pf_book_schinderhannes");
    public static final CustomTrigger CLICK_SCORPION_GIGANTOSCORPIO = new CustomTrigger("pf_book_gigantoscorpio");
    public static final CustomTrigger CLICK_SCORPION_GONDWANASCORPIO = new CustomTrigger("pf_book_gondwanascorpio");
    public static final CustomTrigger CLICK_SCORPION_OPSIEOBUTHUS = new CustomTrigger("pf_book_opsieobuthus");
    public static final CustomTrigger CLICK_SCORPION_PULMONOSCORPIUS = new CustomTrigger("pf_book_pulmonoscorpius");
    public static final CustomTrigger CLICK_SCUTOSAURUS = new CustomTrigger("pf_book_scutosaurus");
    public static final CustomTrigger CLICK_SELENOPELTIS = new CustomTrigger("pf_book_selenopeltis");
    public static final CustomTrigger CLICK_SEMIONOTUS = new CustomTrigger("pf_book_semionotus");
    public static final CustomTrigger CLICK_SEYMOURIA = new CustomTrigger("pf_book_seymouria");
    public static final CustomTrigger CLICK_SHONISAURUS = new CustomTrigger("pf_book_shonisaurus");
    public static final CustomTrigger CLICK_SHRINGASAURUS = new CustomTrigger("pf_book_shringasaurus");
    public static final CustomTrigger CLICK_SIBERION = new CustomTrigger("pf_book_siberion");
    public static final CustomTrigger CLICK_SIDNEYIA = new CustomTrigger("pf_book_sidneyia");
    public static final CustomTrigger CLICK_SPATHICEPHALUS = new CustomTrigger("pf_book_spathicephalus");
    public static final CustomTrigger CLICK_SPHENACODON = new CustomTrigger("pf_book_sphenacodon");
    public static final CustomTrigger CLICK_SPINOAEQUALIS = new CustomTrigger("pf_book_spinoaequalis");
    public static final CustomTrigger CLICK_SPRIGGINA = new CustomTrigger("pf_book_spriggina");
    public static final CustomTrigger CLICK_SQUATINACTIS = new CustomTrigger("pf_book_squatinactis");
    public static final CustomTrigger CLICK_STENSIOELLA = new CustomTrigger("pf_book_stensioella");
    public static final CustomTrigger CLICK_SUMINIA = new CustomTrigger("pf_book_suminia");
    public static final CustomTrigger CLICK_SYNOPHALOS = new CustomTrigger("pf_book_synophalos");
    public static final CustomTrigger CLICK_TAPINOCEPHALUS = new CustomTrigger("pf_book_tapinocephalus");
    public static final CustomTrigger CLICK_CRIOCEPHALOSAURUS = new CustomTrigger("pf_book_criocephalosaurus");
    public static final CustomTrigger CLICK_TARTUOSTEUS = new CustomTrigger("pf_book_tartuosteus");
    public static final CustomTrigger CLICK_TEGOPELTE = new CustomTrigger("pf_book_tegopelte");
    public static final CustomTrigger CLICK_TEMPEROCERAS = new CustomTrigger("pf_book_temperoceras");
    public static final CustomTrigger CLICK_TERATASPIS = new CustomTrigger("pf_book_terataspis");
    public static final CustomTrigger CLICK_TETRACERATOPS = new CustomTrigger("pf_book_tetraceratops");
    public static final CustomTrigger CLICK_TETRAGRAPTUS = new CustomTrigger("pf_book_tetragraptus");
    public static final CustomTrigger CLICK_THELODUS = new CustomTrigger("pf_book_thelodus");
    public static final CustomTrigger CLICK_THRINAXODON = new CustomTrigger("pf_book_thrinaxodon");
    public static final CustomTrigger CLICK_TITANICHTHYS = new CustomTrigger("pf_book_titanichthys");
    public static final CustomTrigger CLICK_TIARAJUDENS = new CustomTrigger("pf_book_tiarajudens");
    public static final CustomTrigger CLICK_TOKUMMIA = new CustomTrigger("pf_book_tokummia");
    public static final CustomTrigger CLICK_TRAQUAIRIUS = new CustomTrigger("pf_book_traquairius");
    public static final CustomTrigger CLICK_TRIGONOTARBID_CRYPTOMARTUS = new CustomTrigger("pf_book_trigonotarbid_cryptomartus");
    public static final CustomTrigger CLICK_TRIGONOTARBID_EOPHRYNUS = new CustomTrigger("pf_book_trigonotarbid_eophrynus");
    public static final CustomTrigger CLICK_TRIGONOTARBID_KREISCHERIA = new CustomTrigger("pf_book_trigonotarbid_kreischeria");
    public static final CustomTrigger CLICK_TRIGONOTARBID_PALAEOTARBUS = new CustomTrigger("pf_book_trigonotarbid_palaeotarbus");
    public static final CustomTrigger CLICK_TRIGONOTARBID_PERMOTARBUS = new CustomTrigger("pf_book_trigonotarbid_permotarbus");
    public static final CustomTrigger CLICK_TRIGONOTARBID_PALAEOCHARINUS = new CustomTrigger("pf_book_trigonotarbid_palaeocharinus");
    public static final CustomTrigger CLICK_TRIMERUS = new CustomTrigger("pf_book_trimerus");
    public static final CustomTrigger CLICK_TULLIMONSTRUM = new CustomTrigger("pf_book_tullimonstrum");
    public static final CustomTrigger CLICK_TURRISASPIS = new CustomTrigger("pf_book_turrisaspis");
    public static final CustomTrigger CLICK_URANOCENTRODON = new CustomTrigger("pf_book_uranocentrodon");
    public static final CustomTrigger CLICK_UROSTHENES = new CustomTrigger("pf_book_urosthenes");
    public static final CustomTrigger CLICK_VARIALEPIS = new CustomTrigger("pf_book_varialepis");
    public static final CustomTrigger CLICK_VESTINAUTILUS = new CustomTrigger("pf_book_vestinautilus");
    public static final CustomTrigger CLICK_VETULICOLA = new CustomTrigger("pf_book_vetulicola");
    public static final CustomTrigger CLICK_VIVAXOSAURUS = new CustomTrigger("pf_book_vivaxosaurus");
    public static final CustomTrigger CLICK_WALLISEROPS = new CustomTrigger("pf_book_walliserops");
    public static final CustomTrigger CLICK_WEBSTEROPRION = new CustomTrigger("pf_book_websteroprion");
    public static final CustomTrigger CLICK_WEIGELTISAURUS = new CustomTrigger("pf_book_weigeltisaurus");
    public static final CustomTrigger CLICK_WHATCHEERIA = new CustomTrigger("pf_book_whatcheeria");
    public static final CustomTrigger CLICK_WIWAXIA = new CustomTrigger("pf_book_wiwaxia");
    public static final CustomTrigger CLICK_XENACANTHUS = new CustomTrigger("pf_book_xenacanthus");
    public static final CustomTrigger CLICK_XENUSION = new CustomTrigger("pf_book_xenusion");
    public static final CustomTrigger CLICK_YAWUNIK = new CustomTrigger("pf_book_yawunik");
    public static final CustomTrigger CLICK_YILINGIA = new CustomTrigger("pf_book_yilingia");
    public static final CustomTrigger CLICK_YOHOIA = new CustomTrigger("pf_book_yohoia");
    public static final CustomTrigger CLICK_YORGIA = new CustomTrigger("pf_book_yorgia");
    public static final CustomTrigger CLICK_YUNNANOZOON = new CustomTrigger("pf_book_yunnanozoon");
    public static final CustomTrigger CLICK_LOCHMANOLENELLUS = new CustomTrigger("pf_book_lochmanolenellus");
    public static final CustomTrigger CLICK_ASTRASPIS = new CustomTrigger("pf_book_astraspis");
    public static final CustomTrigger CLICK_PANDERODUS = new CustomTrigger("pf_book_panderodus");
    public static final CustomTrigger CLICK_CALVAPILOSA = new CustomTrigger("pf_book_calvapilosa");
    public static final CustomTrigger CLICK_BOOTHIASPIS = new CustomTrigger("pf_book_boothiaspis");
    public static final CustomTrigger CLICK_HOLONEMA = new CustomTrigger("pf_book_holonema");
    public static final CustomTrigger CLICK_DROTOPS = new CustomTrigger("pf_book_drotops");
    public static final CustomTrigger CLICK_HELIOPELTIS = new CustomTrigger("pf_book_heliopeltis");
    public static final CustomTrigger CLICK_LANCEASPIS = new CustomTrigger("pf_book_lanceaspis");
    public static final CustomTrigger CLICK_MONTECARIS = new CustomTrigger("pf_book_montecaris");
    public static final CustomTrigger CLICK_RHENOCYSTIS = new CustomTrigger("pf_book_rhenocystis");
    public static final CustomTrigger CLICK_WILLWERATHIA = new CustomTrigger("pf_book_willwerathia");
    public static final CustomTrigger CLICK_PARMASTEGA = new CustomTrigger("pf_book_parmastega");
    public static final CustomTrigger CLICK_TIKTAALIK = new CustomTrigger("pf_book_tiktaalik");
    public static final CustomTrigger CLICK_PYGOPTERUS = new CustomTrigger("pf_book_pygopterus");
    public static final CustomTrigger CLICK_DELTOPTYCHIUS = new CustomTrigger("pf_book_deltoptychius");
    public static final CustomTrigger CLICK_FADENIA_CARBONIFEROUS = new CustomTrigger("pf_book_fadenia_carboniferous");
    public static final CustomTrigger CLICK_FADENIA_PERMOTRIASSIC = new CustomTrigger("pf_book_fadenia_permotriassic");
    public static final CustomTrigger CLICK_FALCATUS = new CustomTrigger("pf_book_falcatus");
    public static final CustomTrigger CLICK_ORODUS = new CustomTrigger("pf_book_orodus");
    public static final CustomTrigger CLICK_PARATARRASIUS = new CustomTrigger("pf_book_paratarrasius");
    public static final CustomTrigger CLICK_SYLLIPSIMOPODI = new CustomTrigger("pf_book_syllipsimopodi");
    public static final CustomTrigger CLICK_THRINACODUS = new CustomTrigger("pf_book_thrinacodus");
    public static final CustomTrigger CLICK_TYRANNOPHONTES = new CustomTrigger("pf_book_tyrannophontes");
    public static final CustomTrigger CLICK_UROCORDYLUS = new CustomTrigger("pf_book_urocordylus");
    public static final CustomTrigger CLICK_EDAPHOSAURUS = new CustomTrigger("pf_book_edaphosaurus");
    public static final CustomTrigger CLICK_COBELODUS = new CustomTrigger("pf_book_cobelodus");
    public static final CustomTrigger CLICK_MEGACTENOPETALUS = new CustomTrigger("pf_book_megactenopetalus");
    public static final CustomTrigger CLICK_RUBIDGEA = new CustomTrigger("pf_book_rubidgea");
    public static final CustomTrigger CLICK_ENDOTHIODON = new CustomTrigger("pf_book_endothiodon");
    public static final CustomTrigger CLICK_YINLONG = new CustomTrigger("pf_book_yinlong");
    public static final CustomTrigger CLICK_AUSTROLIMULUS = new CustomTrigger("pf_book_austrolimulus");
    public static final CustomTrigger CLICK_BEISHANICHTHYS = new CustomTrigger("pf_book_beishanichthys");
    public static final CustomTrigger CLICK_BIRGERIA = new CustomTrigger("pf_book_birgeria");
    public static final CustomTrigger CLICK_BREMBODUS = new CustomTrigger("pf_book_brembodus");
    public static final CustomTrigger CLICK_CATURUS = new CustomTrigger("pf_book_caturus");
    public static final CustomTrigger CLICK_CHINLEA = new CustomTrigger("pf_book_chinlea");
    public static final CustomTrigger CLICK_DAPEDIUM = new CustomTrigger("pf_book_dapedium");
    public static final CustomTrigger CLICK_FOREYIA = new CustomTrigger("pf_book_foreyia");
    public static final CustomTrigger CLICK_HYBODUS = new CustomTrigger("pf_book_hybodus");
    public static final CustomTrigger CLICK_LUOXIONGICHTHYS = new CustomTrigger("pf_book_luoxiongichthys");
    public static final CustomTrigger CLICK_POTANICHTHYS = new CustomTrigger("pf_book_potanichthys");
    public static final CustomTrigger CLICK_AEGER = new CustomTrigger("pf_book_aeger");
    public static final CustomTrigger CLICK_AULACOCERAS = new CustomTrigger("pf_book_aulacoceras");
    public static final CustomTrigger CLICK_BESANOSAURUS = new CustomTrigger("pf_book_besanosaurus");
    public static final CustomTrigger CLICK_CARTORHYNCHUS = new CustomTrigger("pf_book_cartorhynchus");
    public static final CustomTrigger CLICK_CYAMODUS = new CustomTrigger("pf_book_cyamodus");
    public static final CustomTrigger CLICK_CYMBOSPONDYLUS = new CustomTrigger("pf_book_cymbospondylus");
    public static final CustomTrigger CLICK_EORHYNCHOCHELYS = new CustomTrigger("pf_book_eorhynchochelys");
    public static final CustomTrigger CLICK_eretmorhipis = new CustomTrigger("pf_book_eretmorhipis");
    public static final CustomTrigger CLICK_HENODUS = new CustomTrigger("pf_book_henodus");
    public static final CustomTrigger CLICK_LIMULID = new CustomTrigger("pf_book_limulid");
    public static final CustomTrigger CLICK_KEICHOUSAURUS = new CustomTrigger("pf_book_keichousaurus");
    public static final CustomTrigger CLICK_NOTHOSAURUS = new CustomTrigger("pf_book_nothosaurus");
    public static final CustomTrigger CLICK_OPOLANKA = new CustomTrigger("pf_book_opolanka");
    public static final CustomTrigger CLICK_PANZHOUSAURUS = new CustomTrigger("pf_book_panzhousaurus");
    public static final CustomTrigger CLICK_PLACODUS = new CustomTrigger("pf_book_placodus");
    public static final CustomTrigger CLICK_SCLEROCORMUS = new CustomTrigger("pf_book_sclerocormus");
    public static final CustomTrigger CLICK_TRIADOBATRACHUS = new CustomTrigger("pf_book_triadobatrachus");
    public static final CustomTrigger CLICK_YUNGUISAURUS = new CustomTrigger("pf_book_yunguisaurus");
    public static final CustomTrigger CLICK_ARIZONASAURUS = new CustomTrigger("pf_book_arizonasaurus");
    public static final CustomTrigger CLICK_ATOPODENTATUS = new CustomTrigger("pf_book_atopodentatus");
    public static final CustomTrigger CLICK_BATRACHOTOMUS = new CustomTrigger("pf_book_batrachotomus");
    public static final CustomTrigger CLICK_CLEVOSAURUS = new CustomTrigger("pf_book_clevosaurus");
    public static final CustomTrigger CLICK_DESMATOSUCHUS = new CustomTrigger("pf_book_desmatosuchus");
    public static final CustomTrigger CLICK_DOSWELLIA = new CustomTrigger("pf_book_doswellia");
    public static final CustomTrigger CLICK_DREPANOSAURUS = new CustomTrigger("pf_book_drepanosaurus");
    public static final CustomTrigger CLICK_EFFIGIA = new CustomTrigger("pf_book_effigia");
    public static final CustomTrigger CLICK_ERYTHROSUCHUS = new CustomTrigger("pf_book_erythrosuchus");
    public static final CustomTrigger CLICK_EUPARKERIA = new CustomTrigger("pf_book_euparkeria");
    public static final CustomTrigger CLICK_EUSAUROSPHARGIS = new CustomTrigger("pf_book_eusaurosphargis");
    public static final CustomTrigger CLICK_GERROTHORAX = new CustomTrigger("pf_book_gerrothorax");
    public static final CustomTrigger CLICK_HYPERODAPEDON = new CustomTrigger("pf_book_hyperodapedon");
    public static final CustomTrigger CLICK_HYPSOGNATHUS = new CustomTrigger("pf_book_hypsognathus");
    public static final CustomTrigger CLICK_HYPURONECTOR = new CustomTrigger("pf_book_hypuronector");
    public static final CustomTrigger CLICK_LAGOSUCHUS = new CustomTrigger("pf_book_lagosuchus");
    public static final CustomTrigger CLICK_LESSEMSAURUS = new CustomTrigger("pf_book_lessemsaurus");
    public static final CustomTrigger CLICK_LONGISQUAMA = new CustomTrigger("pf_book_longisquama");
    public static final CustomTrigger CLICK_LOTOSAURUS = new CustomTrigger("pf_book_lotosaurus");
    public static final CustomTrigger CLICK_MEGAZOSTRODON = new CustomTrigger("pf_book_megazostrodon");
    public static final CustomTrigger CLICK_METOPOSAURUS = new CustomTrigger("pf_book_metoposaurus");
    public static final CustomTrigger CLICK_MORGANUCODON = new CustomTrigger("pf_book_morganucodon");
    public static final CustomTrigger CLICK_MUSSAURUS = new CustomTrigger("pf_book_mussaurus");
    public static final CustomTrigger CLICK_ORNITHOSUCHUS = new CustomTrigger("pf_book_ornithosuchus");
    public static final CustomTrigger CLICK_TELEOCRATER = new CustomTrigger("pf_book_teleocrater");
    public static final CustomTrigger CLICK_POPOSAURUS = new CustomTrigger("pf_book_poposaurus");
    public static final CustomTrigger CLICK_POSTOSUCHUS = new CustomTrigger("pf_book_postosuchus");
    public static final CustomTrigger CLICK_PROGANOCHELYS = new CustomTrigger("pf_book_proganochelys");
    public static final CustomTrigger CLICK_PSEUDOTHERIUM = new CustomTrigger("pf_book_pseudotherium");
    public static final CustomTrigger CLICK_SAUROSUCHUS = new CustomTrigger("pf_book_saurosuchus");
    public static final CustomTrigger CLICK_RUTIODON = new CustomTrigger("pf_book_rutiodon");
    public static final CustomTrigger CLICK_SCLEROMOCHLUS = new CustomTrigger("pf_book_scleromochlus");
    public static final CustomTrigger CLICK_SHAROVIPTERYX = new CustomTrigger("pf_book_sharovipteryx");
    public static final CustomTrigger CLICK_SILESAURUS = new CustomTrigger("pf_book_silesaurus");
    public static final CustomTrigger CLICK_SILLOSUCHUS = new CustomTrigger("pf_book_sillosuchus");
    public static final CustomTrigger CLICK_SMILOSUCHUS = new CustomTrigger("pf_book_smilosuchus");
    public static final CustomTrigger CLICK_SMOK = new CustomTrigger("pf_book_smok");
    public static final CustomTrigger CLICK_SPHENOTITAN = new CustomTrigger("pf_book_sphenotitan");
    public static final CustomTrigger CLICK_STAGONOLEPIS = new CustomTrigger("pf_book_stagonolepis");
    public static final CustomTrigger CLICK_STANOCEPHALOSAURUS = new CustomTrigger("pf_book_stanocephalosaurus");
    public static final CustomTrigger CLICK_TANYSTROPHEUS = new CustomTrigger("pf_book_tanystropheus");
    public static final CustomTrigger CLICK_TERATERPETON = new CustomTrigger("pf_book_teraterpeton");
    public static final CustomTrigger CLICK_TEYUJAGUA = new CustomTrigger("pf_book_teyujagua");
    public static final CustomTrigger CLICK_THECODONTOSAURUS = new CustomTrigger("pf_book_thecodontosaurus");
    public static final CustomTrigger CLICK_VANCLEAVEA = new CustomTrigger("pf_book_vancleavea");
    public static final CustomTrigger CLICK_XINPUSAURUS = new CustomTrigger("pf_book_xinpusaurus");
    public static final CustomTrigger CLICK_AUSTRIADACTYLUS = new CustomTrigger("pf_book_austriadactylus");
    public static final CustomTrigger CLICK_CAELESTIVENTUS = new CustomTrigger("pf_book_caelestiventus");
    public static final CustomTrigger CLICK_CAVIRAMUS = new CustomTrigger("pf_book_caviramus");
    public static final CustomTrigger CLICK_EUDIMORPHODON = new CustomTrigger("pf_book_eudimorphodon");
    public static final CustomTrigger CLICK_TITANOPTERA_CLATROTITAN = new CustomTrigger("pf_book_titanoptera_clatrotitan");
    public static final CustomTrigger CLICK_TITANOPTERA_MESOTITAN = new CustomTrigger("pf_book_titanoptera_mesotitan");
    public static final CustomTrigger CLICK_TITANOPTERA_GIGATITAN = new CustomTrigger("pf_book_titanoptera_gigatitan");
    public static final CustomTrigger CLICK_NAGINI = new CustomTrigger("pf_book_nagini");
    public static final CustomTrigger CLICK_BRACHYDECTES = new CustomTrigger("pf_book_brachydectes");
    public static final CustomTrigger CLICK_LYSOROPHUS = new CustomTrigger("pf_book_lysorophus");
    public static final CustomTrigger CLICK_PARHYBODUS = new CustomTrigger("pf_book_parhybodus");
    public static final CustomTrigger CLICK_SNAIL_LAND = new CustomTrigger("pf_book_snail_land");
    public static final CustomTrigger CLICK_LONCHIDION = new CustomTrigger("pf_book_lonchidion");
    public static final CustomTrigger CLICK_PALAEONISCUM = new CustomTrigger("pf_book_palaeoniscum");
    public static final CustomTrigger CLICK_SPINIPLATYCERAS = new CustomTrigger("pf_book_spiniplatyceras");
    public static final CustomTrigger CLICK_NIPPONOMARIA = new CustomTrigger("pf_book_nipponomaria");
    public static final CustomTrigger CLICK_PARAPEYTOIA = new CustomTrigger("pf_book_parapeytoia");
    public static final CustomTrigger CLICK_PHRAGMOCERAS = new CustomTrigger("pf_book_phragmoceras");
    public static final CustomTrigger CLICK_LITUITES = new CustomTrigger("pf_book_lituites");

    public static final CustomTrigger CLICK_CIDAROIDA = new CustomTrigger("pf_book_cidaroida");
    public static final CustomTrigger CLICK_ARCHAEOCIDARIS = new CustomTrigger("pf_book_archaeocidaris");
    public static final CustomTrigger CLICK_CERATODUS = new CustomTrigger("pf_book_ceratodus");

    public static final CustomTrigger CLICK_MICROBRACHIUS = new CustomTrigger("pf_book_microbrachius");
    public static final CustomTrigger CLICK_CHOTECOPS = new CustomTrigger("pf_book_chotecops");
    public static final CustomTrigger CLICK_IVOITES = new CustomTrigger("pf_book_ivoites");
    public static final CustomTrigger CLICK_PARAMBLYPTERUS = new CustomTrigger("pf_book_paramblypterus");
    public static final CustomTrigger CLICK_MIGUASHAIA = new CustomTrigger("pf_book_miguashaia");
    public static final CustomTrigger CLICK_ERAMOSCORPIUS = new CustomTrigger("pf_book_eramoscorpius");
    public static final CustomTrigger CLICK_DUSLIA = new CustomTrigger("pf_book_duslia");
    public static final CustomTrigger CLICK_BALHUTICARIS = new CustomTrigger("pf_book_balhuticaris");
    public static final CustomTrigger CLICK_CERATIOCARIS = new CustomTrigger("pf_book_ceratiocaris");
    public static final CustomTrigger CLICK_PLECTODISCUS = new CustomTrigger("pf_book_plectodiscus");
    public static final CustomTrigger CLICK_FLAGELLOPANTOPUS = new CustomTrigger("pf_book_flagellopantopus");
    public static final CustomTrigger CLICK_VACHONISIA = new CustomTrigger("pf_book_vachonisia");
    public static final CustomTrigger CLICK_BUNDENBACHIELLUS = new CustomTrigger("pf_book_bundenbachiellus");
    public static final CustomTrigger CLICK_WINGERTSHELLICUS = new CustomTrigger("pf_book_wingertshellicus");
    public static final CustomTrigger CLICK_WEINBERGINA = new CustomTrigger("pf_book_weinbergina");
    public static final CustomTrigger CLICK_NAHECARIS = new CustomTrigger("pf_book_nahecaris");
    public static final CustomTrigger CLICK_HARPES = new CustomTrigger("pf_book_harpes");
    public static final CustomTrigger CLICK_COMETICERCUS = new CustomTrigger("pf_book_cometicercus");
    public static final CustomTrigger CLICK_BOHEMOHARPES = new CustomTrigger("pf_book_bohemoharpes");
    public static final CustomTrigger CLICK_AMPYX = new CustomTrigger("pf_book_ampyx");
    public static final CustomTrigger CLICK_LONCHODOMAS = new CustomTrigger("pf_book_lonchodomas");
    public static final CustomTrigger CLICK_NEEYAMBASPIS = new CustomTrigger("pf_book_neeyambaspis");
    public static final CustomTrigger CLICK_PITURIASPIS = new CustomTrigger("pf_book_pituriaspis");
    public static final CustomTrigger CLICK_TEGEOLEPIS = new CustomTrigger("pf_book_tegeolepis");
    public static final CustomTrigger CLICK_CLIMATIUS = new CustomTrigger("pf_book_climatius");
    public static final CustomTrigger CLICK_NEREPISACANTHUS = new CustomTrigger("pf_book_nerepisacanthus");
    public static final CustomTrigger CLICK_DIPLACANTHUS = new CustomTrigger("pf_book_diplacanthus");
    public static final CustomTrigger CLICK_HURDIA = new CustomTrigger("pf_book_hurdia");
    public static final CustomTrigger CLICK_CARYOSYNTRIPS = new CustomTrigger("pf_book_caryosyntrips");
    public static final CustomTrigger CLICK_PHLEBOLEPIS = new CustomTrigger("pf_book_phlebolepis");
    public static final CustomTrigger CLICK_JAMOYTIUS = new CustomTrigger("pf_book_jamoytius");
    public static final CustomTrigger CLICK_ASCOCERAS = new CustomTrigger("pf_book_ascoceras");
    public static final CustomTrigger CLICK_SPHOOCERAS = new CustomTrigger("pf_book_sphooceras");
    public static final CustomTrigger CLICK_CASSINOCERAS = new CustomTrigger("pf_book_cassinoceras");
    public static final CustomTrigger CLICK_PRAEARCTURUS = new CustomTrigger("pf_book_praearcturus");
    public static final CustomTrigger CLICK_SKEEMELLA = new CustomTrigger("pf_book_skeemella");
    public static final CustomTrigger CLICK_RUTGERSELLA = new CustomTrigger("pf_book_rutgersella");
    public static final CustomTrigger CLICK_DUNYU = new CustomTrigger("pf_book_dunyu");
    public static final CustomTrigger CLICK_EUGALEASPIS = new CustomTrigger("pf_book_eugaleaspis");
    public static final CustomTrigger CLICK_OGYGINUS = new CustomTrigger("pf_book_ogyginus");
    public static final CustomTrigger CLICK_ARCTINURUS = new CustomTrigger("pf_book_arctinurus");
    public static final CustomTrigger CLICK_URALICHAS = new CustomTrigger("pf_book_uralichas");
    public static final CustomTrigger CLICK_LASANIUS = new CustomTrigger("pf_book_lasanius");
    public static final CustomTrigger CLICK_BARAMEDA = new CustomTrigger("pf_book_barameda");
    public static final CustomTrigger CLICK_ORNITHOPRION = new CustomTrigger("pf_book_ornithoprion");
    public static final CustomTrigger CLICK_MAZOTHAIROS = new CustomTrigger("pf_book_mazothairos");
    public static final CustomTrigger CLICK_TORPEDASPIS = new CustomTrigger("pf_book_torpedaspis");
    public static final CustomTrigger CLICK_FURCA = new CustomTrigger("pf_book_furca");
    public static final CustomTrigger CLICK_TOMLINSONUS = new CustomTrigger("pf_book_tomlinsonus");
    public static final CustomTrigger CLICK_MEGALOSAURUS = new CustomTrigger("pf_book_megalosaurus");

    public static final CustomTrigger CLICK_OPHTHALMOSAURUS = new CustomTrigger("pf_book_ophthalmosaurus");
    public static final CustomTrigger CLICK_MACROMESODON = new CustomTrigger("pf_book_macromesodon");
    public static final CustomTrigger CLICK_NOTIDANOIDES = new CustomTrigger("pf_book_notidanoides");
    public static final CustomTrigger CLICK_ERYON = new CustomTrigger("pf_book_eryon");
    public static final CustomTrigger CLICK_ARDUAFRONS = new CustomTrigger("pf_book_arduafrons");
    public static final CustomTrigger CLICK_AETHEOLEPIS = new CustomTrigger("pf_book_aetheolepis");
    public static final CustomTrigger CLICK_APHNELEPIS = new CustomTrigger("pf_book_aphnelepis");
    public static final CustomTrigger CLICK_ASPIDORHYNCHUS = new CustomTrigger("pf_book_aspidorhynchus");

    public static final CustomTrigger CLICK_EASTMANOSTEUS = new CustomTrigger("pf_book_eastmanosteus");

    public static final CustomTrigger CLICK_PENTECOPTERUS = new CustomTrigger("pf_book_pentecopterus");
    public static final CustomTrigger CLICK_OXYOSTEUS = new CustomTrigger("pf_book_oxyosteus");
    public static final CustomTrigger CLICK_GOOLOOGONGIA = new CustomTrigger("pf_book_gooloogongia");
    public static final CustomTrigger CLICK_WARNETICARIS = new CustomTrigger("pf_book_warneticaris");
    public static final CustomTrigger CLICK_SCHUGUROCARIS = new CustomTrigger("pf_book_schugurocaris");
    public static final CustomTrigger CLICK_GRIPHOGNATHUS = new CustomTrigger("pf_book_griphognathus");
    public static final CustomTrigger CLICK_CONCAVICARIS = new CustomTrigger("pf_book_concavicaris");
    public static final CustomTrigger CLICK_GOGONASUS = new CustomTrigger("pf_book_gogonasus");
    public static final CustomTrigger CLICK_FALLACOSTEUS = new CustomTrigger("pf_book_fallacosteus");
    public static final CustomTrigger CLICK_ROLFOSTEUS = new CustomTrigger("pf_book_rolfosteus");
    public static final CustomTrigger CLICK_CAMUROPISCIS = new CustomTrigger("pf_book_camuropiscis");
    public static final CustomTrigger CLICK_CTENURELLA = new CustomTrigger("pf_book_ctenurella");
    public static final CustomTrigger CLICK_RHAMPHODOPSIS = new CustomTrigger("pf_book_rhamphodopsis");
    public static final CustomTrigger CLICK_GOODRADIGBEEON = new CustomTrigger("pf_book_goodradigbeeon");
    public static final CustomTrigger CLICK_DRACONICHTHYS = new CustomTrigger("pf_book_draconichthys");
    public static final CustomTrigger CLICK_MATERPISCIS = new CustomTrigger("pf_book_materpiscis");
    public static final CustomTrigger CLICK_BRINDABELLASPIS = new CustomTrigger("pf_book_brindabellaspis");
    public static final CustomTrigger CLICK_WUTTAGOONASPIS = new CustomTrigger("pf_book_wuttagoonaspis");
    public static final CustomTrigger CLICK_KUJDANOWIASPIS = new CustomTrigger("pf_book_kujdanowiaspis");
    public static final CustomTrigger CLICK_PHYLLOLEPIS = new CustomTrigger("pf_book_phyllolepis");
    public static final CustomTrigger CLICK_COWRALEPIS = new CustomTrigger("pf_book_cowralepis");
    public static final CustomTrigger CLICK_GYMNOTRACHELUS = new CustomTrigger("pf_book_gymnotrachelus");
    public static final CustomTrigger CLICK_BUNGARTIUS = new CustomTrigger("pf_book_bungartius");
    public static final CustomTrigger CLICK_RHADINACANTHUS = new CustomTrigger("pf_book_rhadinacanthus");
    public static final CustomTrigger CLICK_THRISSOPS = new CustomTrigger("pf_book_thrissops");
    public static final CustomTrigger CLICK_BELONOSTOMUS = new CustomTrigger("pf_book_belonostomus");
    public static final CustomTrigger CLICK_MUENSTERELLA = new CustomTrigger("pf_book_muensterella");
    public static final CustomTrigger CLICK_ASTERACANTHUS = new CustomTrigger("pf_book_asteracanthus");
    public static final CustomTrigger CLICK_TURBOSCINETES = new CustomTrigger("pf_book_turboscinetes");
    public static final CustomTrigger CLICK_REDFIELDIUS = new CustomTrigger("pf_book_redfieldius");
    public static final CustomTrigger CLICK_LEPTOLEPIS = new CustomTrigger("pf_book_leptolepis");
    public static final CustomTrigger CLICK_LEPIDOTES = new CustomTrigger("pf_book_lepidotes");
    public static final CustomTrigger CLICK_DOLLOCARIS = new CustomTrigger("pf_book_dollocaris");
    public static final CustomTrigger CLICK_PIRANHAMESODON = new CustomTrigger("pf_book_piranhamesodon");
    public static final CustomTrigger CLICK_SILUROLEPIS = new CustomTrigger("pf_book_silurolepis");
    public static final CustomTrigger CLICK_ENTELOGNATHUS = new CustomTrigger("pf_book_entelognathus");

    public static final CustomTrigger CLICK_KENTROSAURUS = new CustomTrigger("pf_book_kentrosaurus");
    public static final CustomTrigger CLICK_DRYOSAURUS = new CustomTrigger("pf_book_dryosaurus");
    public static final CustomTrigger CLICK_STETHACANTHUS = new CustomTrigger("pf_book_stethacanthus");
    public static final CustomTrigger CLICK_DYSALOTOSAURUS = new CustomTrigger("pf_book_dysalotosaurus");
    public static final CustomTrigger CLICK_HUALIANCERATOPS = new CustomTrigger("pf_book_hualianceratops");
    public static final CustomTrigger CLICK_CHAOYANGSAURUS = new CustomTrigger("pf_book_chaoyangsaurus");
    public static final CustomTrigger CLICK_XUANHUACERATOPS = new CustomTrigger("pf_book_xuanhuaceratops");
    public static final CustomTrigger CLICK_PANGURAPTOR = new CustomTrigger("pf_book_panguraptor");
    public static final CustomTrigger CLICK_MYRIACANTHERPESTES = new CustomTrigger("pf_book_myriacantherpestes");
    public static final CustomTrigger CLICK_GUIYU = new CustomTrigger("pf_book_guiyu");
    public static final CustomTrigger CLICK_SCLERODUS = new CustomTrigger("pf_book_sclerodus");
    public static final CustomTrigger CLICK_MEGAMASTAX = new CustomTrigger("pf_book_megamastax");
    public static final CustomTrigger CLICK_POLYBRANCHIASPIS = new CustomTrigger("pf_book_polybranchiaspis");
    public static final CustomTrigger CLICK_TAURASPIS = new CustomTrigger("pf_book_tauraspis");
    public static final CustomTrigger CLICK_PARAMETEORASPIS = new CustomTrigger("pf_book_parameteoraspis");
    public static final CustomTrigger CLICK_ATHENAEGIS = new CustomTrigger("pf_book_athenaegis");
    public static final CustomTrigger CLICK_GYROSTEUS = new CustomTrigger("pf_book_gyrosteus");
    public static final CustomTrigger CLICK_SQUALORAJA = new CustomTrigger("pf_book_squaloraja");
    public static final CustomTrigger CLICK_PHIALASPIS = new CustomTrigger("pf_book_phialaspis");
    public static final CustomTrigger CLICK_GYRODUS = new CustomTrigger("pf_book_gyrodus");
    public static final CustomTrigger CLICK_LEPIDASTER = new CustomTrigger("pf_book_lepidaster");
    public static final CustomTrigger CLICK_VILLEBRUNASTER = new CustomTrigger("pf_book_villebrunaster");
    public static final CustomTrigger CLICK_TAMISIOCARIS = new CustomTrigger("pf_book_tamisiocaris");
    public static final CustomTrigger CLICK_HUPEHSUCHUS = new CustomTrigger("pf_book_hupehsuchus");
    public static final CustomTrigger CLICK_MARMOLATELLA = new CustomTrigger("pf_book_marmolatella");
    public static final CustomTrigger CLICK_MUREX = new CustomTrigger("pf_book_murex");
    public static final CustomTrigger CLICK_HARPAGODES = new CustomTrigger("pf_book_harpagodes");
    public static final CustomTrigger CLICK_STROMBUS = new CustomTrigger("pf_book_strombus");
    public static final CustomTrigger CLICK_NERINEA = new CustomTrigger("pf_book_nerinea");
    public static final CustomTrigger CLICK_LEVIATHANIA = new CustomTrigger("pf_book_leviathania");
    public static final CustomTrigger CLICK_PRICYCLOPYGE = new CustomTrigger("pf_book_pricyclopyge");
    public static final CustomTrigger CLICK_PSYCHOPYGE = new CustomTrigger("pf_book_psychopyge");
    public static final CustomTrigger CLICK_CAROLINITES = new CustomTrigger("pf_book_carolinites");
    public static final CustomTrigger CLICK_SYMPHYSOPS = new CustomTrigger("pf_book_symphysops");
    public static final CustomTrigger CLICK_ELEPHANTOCERAS = new CustomTrigger("pf_book_elephantoceras");
    public static final CustomTrigger CLICK_EUSPIRA = new CustomTrigger("pf_book_euspira");
    public static final CustomTrigger CLICK_PROMEXYELE = new CustomTrigger("pf_book_promexyele");
    public static final CustomTrigger CLICK_PAPILIONICHTHYS = new CustomTrigger("pf_book_papilionichthys");
    public static final CustomTrigger CLICK_RAINERICHTHYS = new CustomTrigger("pf_book_rainerichthys");
    public static final CustomTrigger CLICK_STRUDOPS = new CustomTrigger("pf_book_strudops");
    public static final CustomTrigger CLICK_GUANO_GOLEM = new CustomTrigger("pf_book_guano_golem");
    public static final CustomTrigger CLICK_IRON_GOLEM = new CustomTrigger("pf_book_iron_golem");
    public static final CustomTrigger CLICK_SNOW_GOLEM = new CustomTrigger("pf_book_snow_golem");
    public static final CustomTrigger CLICK_WITHER = new CustomTrigger("pf_book_wither");
    public static final CustomTrigger CLICK_ORCANOPTERUS = new CustomTrigger("pf_book_orcanopterus");
    public static final CustomTrigger CLICK_ONYCHOPTERELLA = new CustomTrigger("pf_book_onychopterella");
    public static final CustomTrigger CLICK_STROBILOPTERUS = new CustomTrigger("pf_book_strobilopterus");
    public static final CustomTrigger CLICK_PROTEROSUCHUS = new CustomTrigger("pf_book_proterosuchus");
    public static final CustomTrigger CLICK_LIMUSAURUS = new CustomTrigger("pf_book_limusaurus");
    public static final CustomTrigger CLICK_STOERMEROPTERUS = new CustomTrigger("pf_book_stoermeropterus");
    public static final CustomTrigger CLICK_PEZOPALLICHTHYS = new CustomTrigger("pf_book_pezopallichthys");
    public static final CustomTrigger CLICK_BELONOSTOMUS_JURASSIC = new CustomTrigger("pf_book_belonostomus_jurassic");
    public static final CustomTrigger CLICK_BELONOSTOMUS_CRETACEOUS = new CustomTrigger("pf_book_belonostomus_cretaceous");
    public static final CustomTrigger CLICK_GREERERPETON = new CustomTrigger("pf_book_greererpeton");
    public static final CustomTrigger CLICK_CORDATICARIS = new CustomTrigger("pf_book_cordaticaris");
    public static final CustomTrigger CLICK_SANCTACARIS = new CustomTrigger("pf_book_sanctacaris");
    public static final CustomTrigger CLICK_ZENASPIS = new CustomTrigger("pf_book_zenaspis");
    public static final CustomTrigger CLICK_TYPHLOESUS = new CustomTrigger("pf_book_typhloesus");
    public static final CustomTrigger CLICK_ELASMODECTES = new CustomTrigger("pf_book_elasmodectes");
    public static final CustomTrigger CLICK_KOSMOCERAS = new CustomTrigger("pf_book_kosmoceras");
    public static final CustomTrigger CLICK_QUASIMODICHTHYS = new CustomTrigger("pf_book_quasimodichthys");
    public static final CustomTrigger CLICK_ANAETHALION = new CustomTrigger("pf_book_anaethalion");
    public static final CustomTrigger CLICK_VIVIPARUS = new CustomTrigger("pf_book_viviparus");
    public static final CustomTrigger CLICK_DAKOSAURUS = new CustomTrigger("pf_book_dakosaurus");
    public static final CustomTrigger CLICK_STAHLECKERIA = new CustomTrigger("pf_book_stahleckeria");
    public static final CustomTrigger CLICK_SLIMONIA = new CustomTrigger("pf_book_slimonia");
    public static final CustomTrigger CLICK_HOVASAURUS = new CustomTrigger("pf_book_hovasaurus");
    public static final CustomTrigger CLICK_DECACUMINASTER = new CustomTrigger("pf_book_decacuminaster");
    public static final CustomTrigger CLICK_SACCOCOMA = new CustomTrigger("pf_book_saccocoma");
    public static final CustomTrigger CLICK_VAMPYRONASSA = new CustomTrigger("pf_book_vampyronassa");
    public static final CustomTrigger CLICK_PROTEROCTOPUS = new CustomTrigger("pf_book_proteroctopus");
    public static final CustomTrigger CLICK_THANAHITA = new CustomTrigger("pf_book_thanahita");
    public static final CustomTrigger CLICK_DICRANURUS = new CustomTrigger("pf_book_dicranurus");
    public static final CustomTrigger CLICK_SIBYRHYNCHUS = new CustomTrigger("pf_book_sibyrhynchus");
    public static final CustomTrigger CLICK_METOPACANTHUS = new CustomTrigger("pf_book_metopacanthus");
    public static final CustomTrigger CLICK_BISHANOPLIOSAURUS = new CustomTrigger("pf_book_bishanopliosaurus");
    public static final CustomTrigger CLICK_CANCRINOS = new CustomTrigger("pf_book_cancrinos");
    public static final CustomTrigger CLICK_PLATYSUCHUS = new CustomTrigger("pf_book_platysuchus");
    public static final CustomTrigger CLICK_SYRINGOCRINUS = new CustomTrigger("pf_book_syringocrinus");
    public static final CustomTrigger CLICK_DENDROCYSTITES = new CustomTrigger("pf_book_dendrocystites");
    public static final CustomTrigger CLICK_ANGELINA = new CustomTrigger("pf_book_angelina");
    public static final CustomTrigger CLICK_PLATYPELTOIDES = new CustomTrigger("pf_book_platypeltoides");
    public static final CustomTrigger CLICK_MEGISTASPIS = new CustomTrigger("pf_book_megistaspis");
    public static final CustomTrigger CLICK_TRIBRACHIODEMAS = new CustomTrigger("pf_book_tribrachiodemas");
    public static final CustomTrigger CLICK_CHASMATASPIS = new CustomTrigger("pf_book_chasmataspis");
    public static final CustomTrigger CLICK_HOPLITASPIS = new CustomTrigger("pf_book_hoplitaspis");
    public static final CustomTrigger CLICK_CERATOSAURUS = new CustomTrigger("pf_book_ceratosaurus");
    public static final CustomTrigger CLICK_KULINDADROMEUS = new CustomTrigger("pf_book_kulindadromeus");
    public static final CustomTrigger CLICK_UTATSUSAURUS = new CustomTrigger("pf_book_utatsusaurus");
    public static final CustomTrigger CLICK_HARPACANTHUS = new CustomTrigger("pf_book_harpacanthus");
    public static final CustomTrigger CLICK_RHOMALEOSAURUS = new CustomTrigger("pf_book_rhomaleosaurus");
    public static final CustomTrigger CLICK_HARPAGOFUTUTOR = new CustomTrigger("pf_book_harpagofututor");
    public static final CustomTrigger CLICK_HADRONECTOR = new CustomTrigger("pf_book_hadronector");
    public static final CustomTrigger CLICK_MEGATEUTHIS = new CustomTrigger("pf_book_megateuthis");
    public static final CustomTrigger CLICK_PASSALOTEUTHIS = new CustomTrigger("pf_book_passaloteuthis");
    public static final CustomTrigger CLICK_OPHIOPSIS = new CustomTrigger("pf_book_ophiopsis");
    public static final CustomTrigger CLICK_CONGOPHIOPSIS = new CustomTrigger("pf_book_congophiopsis");
    public static final CustomTrigger CLICK_ADAMANTERYON = new CustomTrigger("pf_book_adamanteryon");
    public static final CustomTrigger CLICK_SCHEENSTIA = new CustomTrigger("pf_book_scheenstia");
    public static final CustomTrigger CLICK_PLECTRONOCERAS = new CustomTrigger("pf_book_plectronoceras");
    public static final CustomTrigger CLICK_CALCEOLISPONGIA = new CustomTrigger("pf_book_calceolispongia");
    public static final CustomTrigger CLICK_PSEUDORHINA = new CustomTrigger("pf_book_pseudorhina");
    public static final CustomTrigger CLICK_PHORCYNIS = new CustomTrigger("pf_book_phorcynis");
    public static final CustomTrigger CLICK_TEMNODONTOSAURUS = new CustomTrigger("pf_book_temnodontosaurus");
    public static final CustomTrigger CLICK_PROPTERUS = new CustomTrigger("pf_book_propterus");
    public static final CustomTrigger CLICK_OREOCHIMA = new CustomTrigger("pf_book_oreochima");
    public static final CustomTrigger CLICK_LIBYS = new CustomTrigger("pf_book_libys");
    public static final CustomTrigger CLICK_COCCODERMA = new CustomTrigger("pf_book_coccoderma");
    public static final CustomTrigger CLICK_CHUNERPETON = new CustomTrigger("pf_book_chunerpeton");
    public static final CustomTrigger CLICK_DOCODON = new CustomTrigger("pf_book_docodon");
    public static final CustomTrigger CLICK_CASTOROCAUDA = new CustomTrigger("pf_book_castorocauda");
    public static final CustomTrigger CLICK_PLEUROSAURUS = new CustomTrigger("pf_book_pleurosaurus");
    public static final CustomTrigger CLICK_SPIROCERAS = new CustomTrigger("pf_book_spiroceras");
    public static final CustomTrigger CLICK_HOMOEOSAURUS = new CustomTrigger("pf_book_homoeosaurus");
    public static final CustomTrigger CLICK_CENOCERAS = new CustomTrigger("pf_book_cenoceras");
    public static final CustomTrigger CLICK_OSTENOCARIS = new CustomTrigger("pf_book_ostenocaris");
    public static final CustomTrigger CLICK_MORROLEPIS = new CustomTrigger("pf_book_morrolepis");
    public static final CustomTrigger CLICK_IOWACYSTIS = new CustomTrigger("pf_book_iowacystis");
    public static final CustomTrigger CLICK_GEOSAURUS = new CustomTrigger("pf_book_geosaurus");
    public static final CustomTrigger CLICK_XINJIANGCHELYS = new CustomTrigger("pf_book_xinjiangchelys");
    public static final CustomTrigger CLICK_EOCARCINUS = new CustomTrigger("pf_book_eocarcinus");
    public static final CustomTrigger CLICK_EURHINOSAURUS = new CustomTrigger("pf_book_eurhinosaurus");
    public static final CustomTrigger CLICK_KAYKAY = new CustomTrigger("pf_book_kaykay");
    public static final CustomTrigger CLICK_THALASSEMYS = new CustomTrigger("pf_book_thalassemys");
    public static final CustomTrigger CLICK_CLARKEITEUTHIS = new CustomTrigger("pf_book_clarkeiteuthis");
    public static final CustomTrigger CLICK_ORTHOCORMUS = new CustomTrigger("pf_book_orthocormus");
    public static final CustomTrigger CLICK_THALASSIODRACON = new CustomTrigger("pf_book_thalassiodracon");
    public static final CustomTrigger CLICK_MICROCLEIDUS = new CustomTrigger("pf_book_microcleidus");
    public static final CustomTrigger CLICK_OPHTHALMOTHULE = new CustomTrigger("pf_book_ophthalmothule");
    public static final CustomTrigger CLICK_CIURCOPTERUS = new CustomTrigger("pf_book_ciurcopterus");
    public static final CustomTrigger CLICK_DRAGONFLY = new CustomTrigger("pf_book_dragonfly");

    public static final CustomTrigger CLICK_KALLIGRAMMATID_OREGRAMMA = new CustomTrigger("pf_book_kalligrammatid_oregramma");
    public static final CustomTrigger CLICK_KALLIGRAMMATID_MAKARKINIA = new CustomTrigger("pf_book_kalligrammatid_makarkinia");
    public static final CustomTrigger CLICK_KALLIGRAMMATID_ITHIGRAMMA = new CustomTrigger("pf_book_kalligrammatid_ithigramma");
    public static final CustomTrigger CLICK_KALLIGRAMMATID_SOPHOGRAMMA = new CustomTrigger("pf_book_kalligrammatid_sophogramma");
    public static final CustomTrigger CLICK_KALLIGRAMMATID_ABRIGRAMMA = new CustomTrigger("pf_book_kalligrammatid_abrigramma");
    public static final CustomTrigger CLICK_LACEWING_AETHEOGRAMMA = new CustomTrigger("pf_book_lacewing_aetheogramma");
    public static final CustomTrigger CLICK_KALLIGRAMMATID_MEIONEURITES = new CustomTrigger("pf_book_kalligrammatid_meioneurites");
    public static final CustomTrigger CLICK_KALLIGRAMMATID_LIASSOPSYCHOPS = new CustomTrigger("pf_book_kalligrammatid_liassopsychops");
    public static final CustomTrigger CLICK_KALLIGRAMMATID_KALLIGRAMMA = new CustomTrigger("pf_book_kalligrammatid_kalligramma");
    public static final CustomTrigger CLICK_LACEWING_LICHENIPOLYSTOECHOTES = new CustomTrigger("pf_book_lacewing_lichenipolystoechotes");
    public static final CustomTrigger CLICK_KALLIGRAMMATID_HUIYINGOGRAMMA = new CustomTrigger("pf_book_kalligrammatid_huiyingogramma");
    public static final CustomTrigger CLICK_KALLIGRAMMATID_APOCHRYSOGRAMMA = new CustomTrigger("pf_book_kalligrammatid_apochrysogramma");
    public static final CustomTrigger CLICK_LACEWING_GRAMMOLINGIA = new CustomTrigger("pf_book_lacewing_grammolingia");
    public static final CustomTrigger CLICK_LACEWING_LACCOSMYLUS = new CustomTrigger("pf_book_lacewing_laccosmylus");
    public static final CustomTrigger CLICK_LACEWING_CRETAPSYCHOPS = new CustomTrigger("pf_book_lacewing_cretapsychops");
    public static final CustomTrigger CLICK_LACEWING_BELLINYMPHA = new CustomTrigger("pf_book_lacewing_bellinympha");
    public static final CustomTrigger CLICK_SCORPIONFLY = new CustomTrigger("pf_book_scorpionfly");
    public static final CustomTrigger CLICK_PHILLIPSIA = new CustomTrigger("pf_book_phillipsia");
    public static final CustomTrigger CLICK_ECHINOCHIMAERA = new CustomTrigger("pf_book_echinochimaera");
    public static final CustomTrigger CLICK_MEGASECOPTERA_SYLVOHYMEN = new CustomTrigger("pf_book_sylvohymen");
    public static final CustomTrigger CLICK_DAOHUGOUCOSSUS = new CustomTrigger("pf_book_daohugoucossus");
    public static final CustomTrigger CLICK_MEGANEURITES = new CustomTrigger("pf_book_meganeurites");
    public static final CustomTrigger CLICK_TRACHYMETOPON = new CustomTrigger("pf_book_trachymetopon");
    public static final CustomTrigger CLICK_PANACANTHOCARIS = new CustomTrigger("pf_book_panacanthocaris");
    public static final CustomTrigger CLICK_BOBOSAURUS = new CustomTrigger("pf_book_bobosaurus");
    public static final CustomTrigger CLICK_PARNAIBAIA = new CustomTrigger("pf_book_parnaibaia");
    public static final CustomTrigger CLICK_PALAEOCARCHARIAS = new CustomTrigger("pf_book_palaeocarcharias");
    public static final CustomTrigger CLICK_PROTOSPINAX = new CustomTrigger("pf_book_protospinax");
    public static final CustomTrigger CLICK_UARBRYICHTHYS = new CustomTrigger("pf_book_uarbryichthys");
    public static final CustomTrigger CLICK_SIDEROPS = new CustomTrigger("pf_book_siderops");
    public static final CustomTrigger CLICK_STEURBAUTICHTHYS = new CustomTrigger("pf_book_steurbautichthys");
    public static final CustomTrigger CLICK_MECOCHIRUS = new CustomTrigger("pf_book_mecochirus");
    public static final CustomTrigger CLICK_ISANICHTHYS = new CustomTrigger("pf_book_isanichthys");
    public static final CustomTrigger CLICK_CONGOPYCNODUS = new CustomTrigger("pf_book_congopycnodus");
    public static final CustomTrigger CLICK_MESTURUS = new CustomTrigger("pf_book_mesturus");
    public static final CustomTrigger CLICK_PARACESTRACION = new CustomTrigger("pf_book_paracestracion");
    public static final CustomTrigger CLICK_SPATHOBATIS = new CustomTrigger("pf_book_spathobatis");
    public static final CustomTrigger CLICK_BAVARISCYLLIUM = new CustomTrigger("pf_book_bavariscyllium");
    public static final CustomTrigger CLICK_ISCHYODUS = new CustomTrigger("pf_book_ischyodus");
    public static final CustomTrigger CLICK_LIGULELLA = new CustomTrigger("pf_book_ligulella");
    public static final CustomTrigger CLICK_PARADAPEDIUM = new CustomTrigger("pf_book_paradapedium");
    public static final CustomTrigger CLICK_HAPLOPHRENTIS = new CustomTrigger("pf_book_haplophrentis");
    public static final CustomTrigger CLICK_KLEPTOTHULE = new CustomTrigger("pf_book_kleptothule");
    public static final CustomTrigger CLICK_RHINOPTERASPIS = new CustomTrigger("pf_book_rhinopteraspis");
    public static final CustomTrigger CLICK_KAYENTATHERIUM = new CustomTrigger("pf_book_kayentatherium");
    public static final CustomTrigger CLICK_TRITYLODON = new CustomTrigger("pf_book_tritylodon");
    public static final CustomTrigger CLICK_HALDANODON = new CustomTrigger("pf_book_haldanodon");
    public static final CustomTrigger CLICK_MARMORERPETON = new CustomTrigger("pf_book_marmorerpeton");
    public static final CustomTrigger CLICK_CELTEDENS = new CustomTrigger("pf_book_celtedens");
    public static final CustomTrigger CLICK_VADASAURUS = new CustomTrigger("pf_book_vadasaurus");
    public static final CustomTrigger CLICK_SHAIHULUDIA = new CustomTrigger("pf_book_shaihuludia");
    public static final CustomTrigger CLICK_URSACTIS = new CustomTrigger("pf_book_ursactis");
    public static final CustomTrigger CLICK_KOOTENAYSCOLEX = new CustomTrigger("pf_book_kootenayscolex");
    public static final CustomTrigger CLICK_MACROSEMIUS = new CustomTrigger("pf_book_macrosemius");
    public static final CustomTrigger CLICK_SAUROSTOMUS = new CustomTrigger("pf_book_saurostomus");
    public static final CustomTrigger CLICK_SONGAICHTHYS = new CustomTrigger("pf_book_songaichthys");
    public static final CustomTrigger CLICK_PHYTOPHILASPIS = new CustomTrigger("pf_book_phytophilaspis");
    public static final CustomTrigger CLICK_ARCHOCYRTUS = new CustomTrigger("pf_book_archocyrtus");
    public static final CustomTrigger CLICK_PROCONODONTUS = new CustomTrigger("pf_book_proconodontus");
    public static final CustomTrigger CLICK_OZARKODINA = new CustomTrigger("pf_book_ozarkodina");
    public static final CustomTrigger CLICK_IOWAGNATHUS = new CustomTrigger("pf_book_iowagnathus");
    public static final CustomTrigger CLICK_HINDEODUS = new CustomTrigger("pf_book_hindeodus");
    public static final CustomTrigger CLICK_CLARKINA = new CustomTrigger("pf_book_clarkina");
    public static final CustomTrigger CLICK_MISIKELLA = new CustomTrigger("pf_book_misikella");
    public static final CustomTrigger CLICK_SOKKAEJAECYSTIS = new CustomTrigger("pf_book_sokkaejaecystis");
    public static final CustomTrigger CLICK_PIATNITZKYSAURUS = new CustomTrigger("pf_book_piatnitzkysaurus");
    public static final CustomTrigger CLICK_GASOSAURUS = new CustomTrigger("pf_book_gasosaurus");
    public static final CustomTrigger CLICK_TANYRHINICHTHYS = new CustomTrigger("pf_book_tanyrhinichthys");
    public static final CustomTrigger CLICK_AMMONITE_PERISPHINCTES = new CustomTrigger("pf_book_ammonite_perisphinctes");
    public static final CustomTrigger CLICK_LAIDLERIA = new CustomTrigger("pf_book_laidleria");
    public static final CustomTrigger CLICK_TRIOPS = new CustomTrigger("pf_book_triops");
    public static final CustomTrigger CLICK_PYCNOPHLEBIA = new CustomTrigger("pf_book_pycnophlebia");
    public static final CustomTrigger CLICK_ARCHABOILUS = new CustomTrigger("pf_book_archaboilus");
    public static final CustomTrigger CLICK_EUROPASAURUS = new CustomTrigger("pf_book_europasaurus");
    public static final CustomTrigger CLICK_JEHOLOTRITON = new CustomTrigger("pf_book_jeholotriton");

    public static final CustomTrigger CLICK_GLYPTOPS = new CustomTrigger("pf_book_glyptops");
    public static final CustomTrigger CLICK_KAYENTACHELYS = new CustomTrigger("pf_book_kayentachelys");
    public static final CustomTrigger CLICK_HUAYANGOSAURUS = new CustomTrigger("pf_book_huayangosaurus");
    public static final CustomTrigger CLICK_GIGANTSPINOSAURUS = new CustomTrigger("pf_book_gigantspinosaurus");
    public static final CustomTrigger CLICK_STEGOSAURUS = new CustomTrigger("pf_book_stegosaurus");
    public static final CustomTrigger CLICK_TUOJIANGOSAURUS = new CustomTrigger("pf_book_tuojiangosaurus");
    public static final CustomTrigger CLICK_YUXISAURUS = new CustomTrigger("pf_book_yuxisaurus");
    public static final CustomTrigger CLICK_DIANDONGOSUCHUS = new CustomTrigger("pf_book_diandongosuchus");
    public static final CustomTrigger CLICK_TANYCOLAGREUS = new CustomTrigger("pf_book_tanycolagreus");
    public static final CustomTrigger CLICK_CRYOLOPHOSAURUS = new CustomTrigger("pf_book_cryolophosaurus");
    public static final CustomTrigger CLICK_CERVIFURCA = new CustomTrigger("pf_book_cervifurca");
    public static final CustomTrigger CLICK_OLENELLUS = new CustomTrigger("pf_book_olenellus");
    public static final CustomTrigger CLICK_DUBREUILLOSAURUS = new CustomTrigger("pf_book_dubreuillosaurus");
    public static final CustomTrigger CLICK_TIANYULONG = new CustomTrigger("pf_book_tianyulong");
    public static final CustomTrigger CLICK_APATOSAURUS = new CustomTrigger("pf_book_apatosaurus");
    public static final CustomTrigger CLICK_CHILESAURUS = new CustomTrigger("pf_book_chilesaurus");
    public static final CustomTrigger CLICK_DICRAEOSAURUS = new CustomTrigger("pf_book_dicraeosaurus");
    public static final CustomTrigger CLICK_ANCHISAURUS = new CustomTrigger("pf_book_anchisaurus");
    public static final CustomTrigger CLICK_ORNITHOLESTES = new CustomTrigger("pf_book_ornitholestes");
    public static final CustomTrigger CLICK_ANCHIORNIS = new CustomTrigger("pf_book_anchiornis");
    public static final CustomTrigger CLICK_HETERODONTOSAURUS = new CustomTrigger("pf_book_heterodontosaurus");
    public static final CustomTrigger CLICK_WUKONGOPTERUS = new CustomTrigger("pf_book_wukongopterus");
    public static final CustomTrigger CLICK_GARGOYLEOSAURUS = new CustomTrigger("pf_book_gargoyleosaurus");
    public static final CustomTrigger CLICK_PROCERATOSAURUS = new CustomTrigger("pf_book_proceratosaurus");
    public static final CustomTrigger CLICK_SHUNOSAURUS = new CustomTrigger("pf_book_shunosaurus");
    public static final CustomTrigger CLICK_CAMPTOSAURUS = new CustomTrigger("pf_book_camptosaurus");
    public static final CustomTrigger CLICK_RHAMPHORHYNCHUS = new CustomTrigger("pf_book_rhamphorhynchus");
    public static final CustomTrigger CLICK_PTERODACTYLUS = new CustomTrigger("pf_book_pterodactylus");
    public static final CustomTrigger CLICK_GUANLONG = new CustomTrigger("pf_book_guanlong");
    public static final CustomTrigger CLICK_YI = new CustomTrigger("pf_book_yi");
    public static final CustomTrigger CLICK_YANGCHUANOSAURUS = new CustomTrigger("pf_book_yangchuanosaurus");
    public static final CustomTrigger CLICK_ANUROGNATHUS = new CustomTrigger("pf_book_anurognathus");
    public static final CustomTrigger CLICK_SINOMACROPS = new CustomTrigger("pf_book_sinomacrops");
    public static final CustomTrigger CLICK_BATRACHOGNATHUS = new CustomTrigger("pf_book_batrachognathus");
    public static final CustomTrigger CLICK_CASCOCAUDA = new CustomTrigger("pf_book_cascocauda");
    public static final CustomTrigger CLICK_DENDRORHYNCHOIDES = new CustomTrigger("pf_book_dendrorhynchoides");
    public static final CustomTrigger CLICK_JEHOLOPTERUS = new CustomTrigger("pf_book_jeholopterus");
    public static final CustomTrigger CLICK_DIMORPHODON = new CustomTrigger("pf_book_dimorphodon");
    public static final CustomTrigger CLICK_ARCHAEOPTERYX = new CustomTrigger("pf_book_archaeopteryx");
    public static final CustomTrigger CLICK_COMPSOGNATHUS = new CustomTrigger("pf_book_compsognathus");
    public static final CustomTrigger CLICK_DILOPHOSAURUS = new CustomTrigger("pf_book_dilophosaurus");
    public static final CustomTrigger CLICK_ALLOSAURUS = new CustomTrigger("pf_book_allosaurus");
    public static final CustomTrigger CLICK_TORVOSAURUS = new CustomTrigger("pf_book_torvosaurus");
    public static final CustomTrigger CLICK_BRACHIOSAURUS = new CustomTrigger("pf_book_brachiosaurus");
    public static final CustomTrigger CLICK_CAMARASAURUS = new CustomTrigger("pf_book_camarasaurus");
    public static final CustomTrigger CLICK_DIPLODOCUS = new CustomTrigger("pf_book_diplodocus");
    public static final CustomTrigger CLICK_GLACIALISAURUS = new CustomTrigger("pf_book_glacialisaurus");
    public static final CustomTrigger CLICK_ADEOPAPPOSAURUS = new CustomTrigger("pf_book_adeopapposaurus");
    public static final CustomTrigger CLICK_MAMENCHISAURUS = new CustomTrigger("pf_book_mamenchisaurus");
    public static final CustomTrigger CLICK_MYMOORAPELTA = new CustomTrigger("pf_book_mymoorapelta");
    public static final CustomTrigger CLICK_CUMNORIA = new CustomTrigger("pf_book_cumnoria");
    public static final CustomTrigger CLICK_UTEODON = new CustomTrigger("pf_book_uteodon");
    public static final CustomTrigger CLICK_SINRAPTOR = new CustomTrigger("pf_book_sinraptor");
    public static final CustomTrigger CLICK_MIRAGAIA = new CustomTrigger("pf_book_miragaia");
    public static final CustomTrigger CLICK_DORYGNATHUS = new CustomTrigger("pf_book_dorygnathus");
    public static final CustomTrigger CLICK_ELAPHROSAURUS = new CustomTrigger("pf_book_elaphrosaurus");
    public static final CustomTrigger CLICK_YIQI = new CustomTrigger("pf_book_yiqi");

    public static final CustomTrigger CLICK_NIMBIA = new CustomTrigger("pf_book_nimbia");
    public static final CustomTrigger CLICK_EDIACARIA = new CustomTrigger("pf_book_ediacaria");
    public static final CustomTrigger CLICK_CYCLOMEDUSA = new CustomTrigger("pf_book_cyclomedusa");
    public static final CustomTrigger CLICK_BURGESSOMEDUSA = new CustomTrigger("pf_book_burgessomedusa");
    public static final CustomTrigger CLICK_CORDUBIA = new CustomTrigger("pf_book_cordubia");
    public static final CustomTrigger CLICK_THAUMACTENA = new CustomTrigger("pf_book_thaumactena");
    public static final CustomTrigger CLICK_ELDONIA = new CustomTrigger("pf_book_eldonia");
    public static final CustomTrigger CLICK_CTENORHABDOTUS = new CustomTrigger("pf_book_ctenorhabdotus");
    public static final CustomTrigger CLICK_CONULARIID = new CustomTrigger("pf_book_conulariid");
    public static final CustomTrigger CLICK_ARCHAEOCONULARIA = new CustomTrigger("pf_book_archaeoconularia");
    public static final CustomTrigger CLICK_DISCOPHYLLUM = new CustomTrigger("pf_book_discophyllum");
    public static final CustomTrigger CLICK_PSEUDODISCOPHYLLUM = new CustomTrigger("pf_book_pseudodiscophyllum");
    public static final CustomTrigger CLICK_BERTRATIS = new CustomTrigger("pf_book_bertratis");
    public static final CustomTrigger CLICK_ROTACIURCA = new CustomTrigger("pf_book_rotaciurca");
    public static final CustomTrigger CLICK_PAROPSONEMA = new CustomTrigger("pf_book_paropsonema");
    public static final CustomTrigger CLICK_PALAEOCTENOPHORA = new CustomTrigger("pf_book_palaeoctenophora");
    public static final CustomTrigger CLICK_ARCHAEOCYDIPPIDA = new CustomTrigger("pf_book_archaeocydippida");
    public static final CustomTrigger CLICK_DAIHUOIDES = new CustomTrigger("pf_book_daihuoides");
    public static final CustomTrigger CLICK_OCTOMEDUSA = new CustomTrigger("pf_book_octomedusa");
    public static final CustomTrigger CLICK_PROTHYSANOSTOMA = new CustomTrigger("pf_book_prothysanostoma");
    public static final CustomTrigger CLICK_ESSEXELLA = new CustomTrigger("pf_book_essexella");
    public static final CustomTrigger CLICK_MEDUSINA = new CustomTrigger("pf_book_medusina");
    public static final CustomTrigger CLICK_TARRACODISCUS = new CustomTrigger("pf_book_tarracodiscus");
    public static final CustomTrigger CLICK_HELIOBRANCHIA = new CustomTrigger("pf_book_heliobranchia");
    public static final CustomTrigger CLICK_EULITHOTA = new CustomTrigger("pf_book_eulithota");
    public static final CustomTrigger CLICK_SEMAEOSTOMITES = new CustomTrigger("pf_book_semaeostomites");
    public static final CustomTrigger CLICK_HYDROCRASPEDOTA = new CustomTrigger("pf_book_hydrocraspedota");
    public static final CustomTrigger CLICK_RHIZOSTOMITES = new CustomTrigger("pf_book_rhizostomites");
    public static final CustomTrigger CLICK_BANKSIOPS = new CustomTrigger("pf_book_banksiops");
    public static final CustomTrigger CLICK_PAMPAPHONEUS = new CustomTrigger("pf_book_pampaphoneus");
    public static final CustomTrigger CLICK_PLIOSAURUS = new CustomTrigger("pf_book_pliosaurus");
    public static final CustomTrigger CLICK_LEEDSICHTHYS = new CustomTrigger("pf_book_leedsichthys");
    public static final CustomTrigger CLICK_ICHTHYOSAURUS = new CustomTrigger("pf_book_ichthyosaurus");
    public static final CustomTrigger CLICK_PLESIOSAURUS = new CustomTrigger("pf_book_plesiosaurus");
    public static final CustomTrigger CLICK_HUGHMILLERIA = new CustomTrigger("pf_book_hughmilleria");
    public static final CustomTrigger CLICK_WAPTIA = new CustomTrigger("pf_book_waptia");
    public static final CustomTrigger CLICK_ISOXYS = new CustomTrigger("pf_book_isoxys");
    public static final CustomTrigger CLICK_CAPINATATOR = new CustomTrigger("pf_book_capinatator");
    public static final CustomTrigger CLICK_HADRANAX = new CustomTrigger("pf_book_hadranax");
    public static final CustomTrigger CLICK_TIMOREBESTIA = new CustomTrigger("pf_book_timorebestia");
    public static final CustomTrigger CLICK_MOBULAVERMIS = new CustomTrigger("pf_book_mobulavermis");
    public static final CustomTrigger CLICK_BURGESSIA = new CustomTrigger("pf_book_burgessia");
    public static final CustomTrigger CLICK_SAPERION = new CustomTrigger("pf_book_saperion");
    public static final CustomTrigger CLICK_THULASPIS = new CustomTrigger("pf_book_thulaspis");
    public static final CustomTrigger CLICK_UROKODIA = new CustomTrigger("pf_book_urokodia");
    public static final CustomTrigger CLICK_THELXIOPE = new CustomTrigger("pf_book_thelxiope");
    public static final CustomTrigger CLICK_TITANOKORYS = new CustomTrigger("pf_book_titanokorys");
    public static final CustomTrigger CLICK_ERYMA = new CustomTrigger("pf_book_eryma");
    public static final CustomTrigger CLICK_PARIOSCORPIO = new CustomTrigger("pf_book_parioscorpio");
    public static final CustomTrigger CLICK_NESONEKTRIS = new CustomTrigger("pf_book_nesonektris");
    public static final CustomTrigger CLICK_TANAOCROSSUS = new CustomTrigger("pf_book_tanaocrossus");
    public static final CustomTrigger CLICK_EOCHONDROSTEUS = new CustomTrigger("pf_book_eochondrosteus");
    public static final CustomTrigger CLICK_LIAOSTEUS = new CustomTrigger("pf_book_liaosteus");
    public static final CustomTrigger CLICK_KICHKASSIA = new CustomTrigger("pf_book_kichkassia");
    public static final CustomTrigger CLICK_BRAZILICHTHYS = new CustomTrigger("pf_book_brazilichthys");
    public static final CustomTrigger CLICK_CONCHOPOMA = new CustomTrigger("pf_book_conchopoma");
    public static final CustomTrigger CLICK_SURCAUDALUS = new CustomTrigger("pf_book_surcaudalus");
    public static final CustomTrigger CLICK_BETHESDAICHTHYS = new CustomTrigger("pf_book_bethesdaichthys");
    public static final CustomTrigger CLICK_NAMUROTYPUS = new CustomTrigger("pf_book_namurotypus");
    public static final CustomTrigger CLICK_ERASIPTEROIDES = new CustomTrigger("pf_book_erasipteroides");
    public static final CustomTrigger CLICK_LEPTOTEUTHIS = new CustomTrigger("pf_book_leptoteuthis");
    public static final CustomTrigger CLICK_LUFENGOSAURUS = new CustomTrigger("pf_book_lufengosaurus");
    public static final CustomTrigger CLICK_CAIHONG = new CustomTrigger("pf_book_caihong");
    public static final CustomTrigger CLICK_MEGALICHTHYS = new CustomTrigger("pf_book_megalichthys");
    public static final CustomTrigger CLICK_MAMULICHTHYS = new CustomTrigger("pf_book_mamulichthys");
    public static final CustomTrigger CLICK_COTYLEDION = new CustomTrigger("pf_book_cotyledion");
    public static final CustomTrigger CLICK_SENEKICHTHYS = new CustomTrigger("pf_book_senekichthys");
    public static final CustomTrigger CLICK_HETEROPETALUS = new CustomTrigger("pf_book_heteropetalus");
    public static final CustomTrigger CLICK_GANGTOUCUNIA = new CustomTrigger("pf_book_gangtoucunia");
    public static final CustomTrigger CLICK_SHANKOUCLAVA = new CustomTrigger("pf_book_shankouclava");
    public static final CustomTrigger CLICK_CLIMACOGRAPTUS = new CustomTrigger("pf_book_climacograptus");
    public static final CustomTrigger CLICK_PHYLLOGRAPTUS = new CustomTrigger("pf_book_phyllograptus");
    public static final CustomTrigger CLICK_ORTHOGRAPTUS = new CustomTrigger("pf_book_orthograptus");
    public static final CustomTrigger CLICK_BOWENGRIPHUS = new CustomTrigger("pf_book_bowengriphus");
    public static final CustomTrigger CLICK_GOSFORDIA = new CustomTrigger("pf_book_gosfordia");
    public static final CustomTrigger CLICK_SARGODON = new CustomTrigger("pf_book_sargodon");
    public static final CustomTrigger CLICK_HYDROPESSUM = new CustomTrigger("pf_book_hydropessum");
    public static final CustomTrigger CLICK_PHACOPS = new CustomTrigger("pf_book_phacops");
    public static final CustomTrigger CLICK_PHYLLOCERAS = new CustomTrigger("pf_book_phylloceras");
    public static final CustomTrigger CLICK_ERETTOPTERUS = new CustomTrigger("pf_book_erettopterus");
    public static final CustomTrigger CLICK_POLYSENTOR = new CustomTrigger("pf_book_polysentor");
    public static final CustomTrigger CLICK_THALATTOSUCHUS = new CustomTrigger("pf_book_thalattosuchus");
    public static final CustomTrigger CLICK_DEBEERIUS = new CustomTrigger("pf_book_debeerius");
    public static final CustomTrigger CLICK_WODNIKA = new CustomTrigger("pf_book_wodnika");
    public static final CustomTrigger CLICK_PSEUDOANGUSTIDONTUS = new CustomTrigger("pf_book_pseudoangustidontus");
    public static final CustomTrigger CLICK_SARCOPRION = new CustomTrigger("pf_book_sarcoprion");
    public static final CustomTrigger CLICK_DAIHUA = new CustomTrigger("pf_book_daihua");
    public static final CustomTrigger CLICK_CRUMILLOSPONGIA = new CustomTrigger("pf_book_crumillospongia");
    public static final CustomTrigger CLICK_DIPTERONOTUS = new CustomTrigger("pf_book_dipteronotus");
    public static final CustomTrigger CLICK_HETEROSTROPHUS = new CustomTrigger("pf_book_heterostrophus");
    public static final CustomTrigger CLICK_MONOLOPHOSAURUS = new CustomTrigger("pf_book_monolophosaurus");
    public static final CustomTrigger CLICK_WAAGENELLA = new CustomTrigger("pf_book_waagenella");
    public static final CustomTrigger CLICK_AKASAKIELLA = new CustomTrigger("pf_book_akasakiella");
    public static final CustomTrigger CLICK_FOORDELLA = new CustomTrigger("pf_book_foordella");
    public static final CustomTrigger CLICK_CHIPPEWAELLA = new CustomTrigger("pf_book_chippewaella");
    public static final CustomTrigger CLICK_DEUTEROSAURUS = new CustomTrigger("pf_book_deuterosaurus");
    public static final CustomTrigger CLICK_DRACOPELTA = new CustomTrigger("pf_book_dracopelta");
    public static final CustomTrigger CLICK_SINOPHONEUS = new CustomTrigger("pf_book_sinophoneus");
    public static final CustomTrigger CLICK_STONEFLY = new CustomTrigger("pf_book_stonefly");

    public static final CustomTrigger CLICK_LUSOVENATOR = new CustomTrigger("pf_book_lusovenator");
    public static final CustomTrigger CLICK_LUSOTITAN = new CustomTrigger("pf_book_lusotitan");
    public static final CustomTrigger CLICK_ROMERODUS = new CustomTrigger("pf_book_romerodus");
    public static final CustomTrigger CLICK_SRIANTA = new CustomTrigger("pf_book_srianta");
    public static final CustomTrigger CLICK_GREGORIUS = new CustomTrigger("pf_book_gregorius");
    public static final CustomTrigger CLICK_OBRUCHEVODUS = new CustomTrigger("pf_book_obruchevodus");
    public static final CustomTrigger CLICK_CHONDRENCHELYS = new CustomTrigger("pf_book_chondrenchelys");
    public static final CustomTrigger CLICK_ORESTIACANTHUS = new CustomTrigger("pf_book_orestiacanthus");
    public static final CustomTrigger CLICK_GOODRICHTHYS = new CustomTrigger("pf_book_goodrichthys");
    public static final CustomTrigger CLICK_GANSUSELACHE = new CustomTrigger("pf_book_gansuselache");
    public static final CustomTrigger CLICK_ARCHAEOTHYRIS = new CustomTrigger("pf_book_archaeothyris");
    public static final CustomTrigger CLICK_EUSTREPTOSPONDYLUS = new CustomTrigger("pf_book_eustreptospondylus");
    public static final CustomTrigger CLICK_MOOREODONTUS = new CustomTrigger("pf_book_mooreodontus");
    public static final CustomTrigger CLICK_HAGENOSELACHE = new CustomTrigger("pf_book_hagenoselache");
    public static final CustomTrigger CLICK_DIPLODOSELACHE = new CustomTrigger("pf_book_diplodoselache");
    public static final CustomTrigger CLICK_STENOKRANIO = new CustomTrigger("pf_book_stenokranio");
    public static final CustomTrigger CLICK_IDMONARACHNE = new CustomTrigger("pf_book_idmonarachne");
    public static final CustomTrigger CLICK_TRIGONOTARBID_GONDWANARACHNE = new CustomTrigger("pf_book_trigonotarbid_gondwanarachne");
    public static final CustomTrigger CLICK_CRICOSAURUS = new CustomTrigger("pf_book_cricosaurus");
    public static final CustomTrigger CLICK_SCHOENESMAHL = new CustomTrigger("pf_book_schoenesmahl");
    public static final CustomTrigger CLICK_WESTRICHUS = new CustomTrigger("pf_book_westrichus");
    public static final CustomTrigger CLICK_CARIDOSUCTOR = new CustomTrigger("pf_book_caridosuctor");
    public static final CustomTrigger CLICK_RHABDODERMA = new CustomTrigger("pf_book_rhabdoderma");
    public static final CustomTrigger CLICK_PHANERORHYNCHUS = new CustomTrigger("pf_book_phanerorhynchus");
    public static final CustomTrigger CLICK_DEARC = new CustomTrigger("pf_book_dearc");
    public static final CustomTrigger CLICK_GERMANODACTYLUS = new CustomTrigger("pf_book_germanodactylus");
    public static final CustomTrigger CLICK_HARPACTOGNATHUS = new CustomTrigger("pf_book_harpactognathus");
    public static final CustomTrigger CLICK_PRISCOMYZON = new CustomTrigger("pf_book_priscomyzon");

    public static final CustomTrigger CLICK_EOCURSOR = new CustomTrigger("pf_book_eocursor");
    public static final CustomTrigger CLICK_WARDICHTHYS = new CustomTrigger("pf_book_wardichthys");
    public static final CustomTrigger CLICK_PAMBDELURION = new CustomTrigger("pf_book_pambdelurion");
    public static final CustomTrigger CLICK_ALIENUM = new CustomTrigger("pf_book_alienum");
    public static final CustomTrigger CLICK_MIERIDDURYN = new CustomTrigger("pf_book_mieridduryn");
    public static final CustomTrigger CLICK_VENUSTULUS = new CustomTrigger("pf_book_venustulus");
    public static final CustomTrigger CLICK_ARCHERIA = new CustomTrigger("pf_book_archeria");
    public static final CustomTrigger CLICK_TYRANNOTITAN = new CustomTrigger("pf_book_tyrannotitan");
    public static final CustomTrigger CLICK_NIGERPETON = new CustomTrigger("pf_book_nigerpeton");
    public static final CustomTrigger CLICK_HAPLOLEPIS = new CustomTrigger("pf_book_haplolepis");
    public static final CustomTrigger CLICK_TESNUSOCARIS = new CustomTrigger("pf_book_tesnusocaris");
    public static final CustomTrigger CLICK_ONYCHOSELACHE = new CustomTrigger("pf_book_onychoselache");
    public static final CustomTrigger CLICK_NINGXIAPLATYSOMUS = new CustomTrigger("pf_book_ningxiaplatysomus");
    public static final CustomTrigger CLICK_AUSTRALICHTHYS = new CustomTrigger("pf_book_australichthys");
    public static final CustomTrigger CLICK_ANDERELLA = new CustomTrigger("pf_book_anderella");
    public static final CustomTrigger CLICK_AETHERETMON = new CustomTrigger("pf_book_aetheretmon");
    public static final CustomTrigger CLICK_ROLFEIA = new CustomTrigger("pf_book_rolfeia");
    public static final CustomTrigger CLICK_ACHERONTISCUS = new CustomTrigger("pf_book_acherontiscus");
    public static final CustomTrigger CLICK_NEMATOPTYCHIUS = new CustomTrigger("pf_book_nematoptychius");
    public static final CustomTrigger CLICK_AMPHICENTRUM = new CustomTrigger("pf_book_amphicentrum");
    public static final CustomTrigger CLICK_CARBOTUBULUS = new CustomTrigger("pf_book_carbotubulus");
    public static final CustomTrigger CLICK_ANTHRACOSAURUS = new CustomTrigger("pf_book_anthracosaurus");
    public static final CustomTrigger CLICK_SCLEROCEPHALUS = new CustomTrigger("pf_book_sclerocephalus");
    public static final CustomTrigger CLICK_SCREBINODUS = new CustomTrigger("pf_book_screbinodus");
    public static final CustomTrigger CLICK_GERAGNOSTUS = new CustomTrigger("pf_book_geragnostus");
    public static final CustomTrigger CLICK_URASTERELLA = new CustomTrigger("pf_book_urasterella");
    public static final CustomTrigger CLICK_CAMANCHIA = new CustomTrigger("pf_book_camanchia");
    public static final CustomTrigger CLICK_PSEUDONARAOIA = new CustomTrigger("pf_book_pseudonaraoia");
    public static final CustomTrigger CLICK_NARAOIA_SPINOSA = new CustomTrigger("pf_book_naraoia_spinosa");
    public static final CustomTrigger CLICK_NARAOIA_BERTIENSIS = new CustomTrigger("pf_book_naraoia_bertiensis");
    public static final CustomTrigger CLICK_VIDALAMIA = new CustomTrigger("pf_book_vidalamia");
    public static final CustomTrigger CLICK_SINAMIA = new CustomTrigger("pf_book_sinamia");
    public static final CustomTrigger CLICK_PACHYAMIA = new CustomTrigger("pf_book_pachyamia");
    public static final CustomTrigger CLICK_KHORATAMIA = new CustomTrigger("pf_book_khoratamia");
    public static final CustomTrigger CLICK_HISPANAMIA = new CustomTrigger("pf_book_hispanamia");
    public static final CustomTrigger CLICK_CRATOAMIA = new CustomTrigger("pf_book_cratoamia");
    public static final CustomTrigger CLICK_TOMOGNATHUS = new CustomTrigger("pf_book_tomognathus");
    public static final CustomTrigger CLICK_IKECHAOAMIA = new CustomTrigger("pf_book_ikechaoamia");
    public static final CustomTrigger CLICK_SOLNHOFENAMIA = new CustomTrigger("pf_book_solnhofenamia");
    public static final CustomTrigger CLICK_CALAMOPLEURUS = new CustomTrigger("pf_book_calamopleurus");


    public static final CustomTrigger CLICK_TETRAMEROCERAS = new CustomTrigger("pf_book_tetrameroceras");
    public static final CustomTrigger CLICK_DRACORAPTOR = new CustomTrigger("pf_book_dracoraptor");
    public static final CustomTrigger CLICK_PRESTOSUCHUS = new CustomTrigger("pf_book_prestosuchus");
    public static final CustomTrigger CLICK_KANNEMEYERIA = new CustomTrigger("pf_book_kannemeyeria");
    public static final CustomTrigger CLICK_TRILOPHOSAURUS = new CustomTrigger("pf_book_trilophosaurus");
    public static final CustomTrigger CLICK_LESOTHOSAURUS = new CustomTrigger("pf_book_lesothosaurus");
    public static final CustomTrigger CLICK_QIANOSUCHUS = new CustomTrigger("pf_book_qianosuchus");
    public static final CustomTrigger CLICK_KNOETSCHKESUCHUS = new CustomTrigger("pf_book_knoetschkesuchus");
    public static final CustomTrigger CLICK_LITARGOSUCHUS = new CustomTrigger("pf_book_litargosuchus");
    public static final CustomTrigger CLICK_TROPIDOSUCHUS = new CustomTrigger("pf_book_tropidosuchus");





    // public static final CustomTrigger CLICK_ = new CustomTrigger("pf_book_"); TEMPLATE



    /*
     * This array just makes it convenient to register all the criteria.
     */
    public static final CustomTrigger[] TRIGGER_ARRAY = new CustomTrigger[] {
            WELCOME,
            ENTER_OVERWORLD,
            ENTER_PRECAMBRIAN,
            ENTER_CAMBRIAN,
            ENTER_ORDOVICIAN,
            ENTER_SILURIAN,
            ENTER_DEVONIAN,
            ENTER_CARBONIFEROUS,
            ENTER_PERMIAN,
            ENTER_TRIASSIC,
            ENTER_JURASSIC,
            ENTER_CRETACEOUS_EARLY,
            REJUVENATE,
            ACID_CLEAN,
            USE_CAGE,
            USE_JAR,
            TAXIDERMY,
            EPHEDRA,
            TAIL,
            DNA_CRAFT,
            PALAEOPEDIA_GIVEN,
            QUARK_NAG,

            //BLOCKS:
            //----------
            CLICK_ACACIA,
            CLICK_ADOKETOPHYTON,
            CLICK_AETHOPHYLLUM,
            CLICK_MOSS,
            CLICK_AGATHIS,
            CLICK_ALETHOPTERIS,
            CLICK_ALLIOPTERIS,
            CLICK_ALLONNIA,
            CLICK_ALPIA,
            CLICK_AMBLYSIPHONELLA,
            CLICK_ANEUROPHYTON,
            CLICK_REEF_ALGAL,
            CLICK_REEF_SPONGE,
            CLICK_REEF_STROMATOPOROIDEA,
            CLICK_REEF_DEAD,
            CLICK_REEF_BRYOZOAN,
            CLICK_REEF_ARCHAEOCYATHEA,
            CLICK_REEF_GLASS_SPONGE,
            CLICK_REEF_CORAL,
            CLICK_REEF_SHELLY,
            CLICK_ANKYROPTERIS,
            CLICK_ANOMOZAMITES,
            CLICK_ANTARCTICYCAS,
            CLICK_APPLE,
            CLICK_LAURUS,
            CLICK_BISONIA,
            CLICK_ARAUCARIOXYLON,
            CLICK_ANEMONE,
            CLICK_ALGAE,
            CLICK_DAISY,
            CLICK_KELP,
            CLICK_ZINGIBEROPSIS,
            CLICK_GANSUFRUCTUS,
            CLICK_SANTANIELLA,
            CLICK_SINOHERBA,
            CLICK_CHLORANTHUS,
            CLICK_BUTTERCUP,
            CLICK_TELOPEA,
            CLICK_ORITES,
            CLICK_LOMATIA,
            CLICK_DRIMYS,
            CLICK_VOLTZIA,
            CLICK_HYDRANGEA,
            CLICK_EMBOTHRIUM,
            CLICK_AMBORELLA,
            CLICK_ILICIUM,
            CLICK_CALYCANTHUS,
            CLICK_JERSEYANTHUS,
            CLICK_ARAUCARITES,
            CLICK_ARBOREA,
            CLICK_ARCHAEANTHUS,
            CLICK_ARCHAEFRUCTUS,
            CLICK_CALLIANTHUS,
            CLICK_MONTSECHIA,
            CLICK_ARCHAEOPTERIS,
            CLICK_ARID_HORSETAIL,
            CLICK_ARKARUA,
            CLICK_HORODYSKIA,
            CLICK_ARTHROPITYS,
            CLICK_ARTOCARPUS,
            CLICK_ASTEROXYLON,
            CLICK_AULACERA,
            CLICK_AUSIA,
            CLICK_BAIERA,
            CLICK_DORATOPHYLLUM,
            CLICK_BAIKALOPHYLLUM,
            CLICK_REHEZAMITES,
            CLICK_BANKSIA_1,
            CLICK_BANKSIA_2,
            CLICK_BARAGWANATHIA,
            CLICK_BEECH,
            CLICK_BELEMNOPTERIS,
            CLICK_BIRCH,
            CLICK_BIVALVE_CREAM,
            CLICK_BIVALVE_DARK,
            CLICK_BIVALVE_DICEROCARDIUM,
            CLICK_BIVALVE_GREEN,
            CLICK_BIVALVE_GREY,
            CLICK_BIVALVE_SHIKAMAIA,
            CLICK_BIVALVE_INOCERAMUS,
            CLICK_BIVALVE_LITHIOTIS,
            CLICK_BIVALVE_MEGALODON,
            CLICK_BIVALVE_TALL,
            CLICK_BIVALVE_UPRIGHT,
            CLICK_BIVALVE_WHITE,
            CLICK_BJUVIA,
            CLICK_BLACK_TREEFERN,
            CLICK_BOLBITIS,
            CLICK_SEAGRASS,
            CLICK_BOMAKELLIA,
            CLICK_MOSACAULIS,
            CLICK_BOTHRODENDRON,
            CLICK_BRACHIOPOD_GIGANTOPRODUCTUS,
            CLICK_BRACHIOPOD_ORTHID,
            CLICK_BRACHIOPOD_SPIRIFERID,
            CLICK_BRACHYPHYLLUM,
            CLICK_BRADGATIA,
            CLICK_BRASILODENDRON,
            CLICK_BRISTLECONE,
            CLICK_BUMBUDENDRON,
            CLICK_BUNYA,
            CLICK_BURIADIA,
            CLICK_PELOURDEA,
            CLICK_BURYKHIA,
            CLICK_CALAMITES,
            CLICK_CALAMOPHYTON,
            CLICK_ROSE_ANCIENT,
            CLICK_CALLISTOPHYTALES,
            CLICK_HEDERA,
            CLICK_ARISTOLOCHIA,
            CLICK_KAJANTHUS,
            CLICK_BUCKTHORN,
            CLICK_ACTINIDEA,
            CLICK_VITIS,
            CLICK_HOPS,
            CLICK_YAM,
            CLICK_CASTERICYSTIS,
            CLICK_CECROPSIS,
            CLICK_RHACOPTERIS,
            CLICK_CHARNIA,
            CLICK_TUANSHANZIA,
            CLICK_CHARNIODISCUS,
            CLICK_SEA_PEN,
            CLICK_CHAUNOGRAPTUS,
            CLICK_CINNAMON_FERN,
            CLICK_CLADOPHLEBIS,
            CLICK_CLATHROPTERIS,
            CLICK_ONYCHIOPSIS,
            CLICK_LICHEN,
            CLICK_CLAYTOSMUNDA,
            CLICK_NEOMARIOPTERIS,
            CLICK_CLOUDINA,
            CLICK_COBBANIA,
            CLICK_ORONTIUM,
            CLICK_COLUMNARIS,
            CLICK_CONIOPTERIS,
            CLICK_CONOMEDUSITES,
            CLICK_COOKSONIA,
            CLICK_BELLENDENA,
            CLICK_CORDAITES,
            CLICK_CORDAITES_DRY,
            CLICK_CORNULITIDA,
            CLICK_CORONACOLLINA,
            CLICK_CORUMBELLA,
            CLICK_CRINOID_ANCYROCRINUS,
            CLICK_CRINOID_CALLICRINUS,
            CLICK_CRINOID_CARYOCRINITES,
            CLICK_CRINOID_CUPRESSOCRINITES,
            CLICK_CRINOID_CYATHOCRINUS,
            CLICK_CRINOID_DIZYGOCRINUS,
            CLICK_CRINOID_ENCRINUS,
            CLICK_CRINOID_EUCALYPTOCRINITES,
            CLICK_CRINOID_HOLOCRINUS,
            CLICK_CRINOID_JIMBACRINUS,
            CLICK_CRINOID_MACROCRINUS,
            CLICK_CRINOID_PETALOCRINUS,
            CLICK_CRINOID_PISOCRINUS,
            CLICK_CRINOID_SCYPHOCRINUS,
            CLICK_CRINOID_SIPHONOCRINUS,
            CLICK_CRINOID_TRAUMATOCRINUS,
            CLICK_CRINOID_SEIROCRINUS,
            CLICK_CRINOID_APIOCRINITES,
            CLICK_CRINOID_BALANOCRINUS,
            CLICK_CRINOID_EUGENIACRINITES,
            CLICK_CRINOID_PHYLLOCRINUS,
            CLICK_CRINOID_PENTACRINITES,
            CLICK_CRINOID_VADAROCRINUS,
            CLICK_CRINOID_VOSTOCOVACRINUS,
            CLICK_CTENIS,
            CLICK_CYCADEOIDEA,
            CLICK_CYCADOPTERIS,
            CLICK_DICHOPTERIS,
            CLICK_CYCAS,
            CLICK_MONANTHESIA,
            CLICK_CYCLODENDRON,
            CLICK_CYPRESS,
            CLICK_CYPRESS_TWIGGY,
            CLICK_NEHVIZDYELLA,
            CLICK_PAGIOPHYLLUM,
            CLICK_HIRMERIELLA,
            CLICK_ELATOCLADUS,
            CLICK_CYSTOID_ARISTOCYSTITES,
            CLICK_CYSTOID_BOLBOPORITES,
            CLICK_CYSTOID_ECHINOSPHAERITES,
            CLICK_CYSTOID_PSEUDOCRINITES,
            CLICK_CZEKANOWSKIA,
            CLICK_DARK_OAK,
            CLICK_DAWN_REDWOOD,
            CLICK_DENDROGRAPTUS,
            CLICK_SPHENOECIUM,
            CLICK_DIAPHORODENDRON,
            CLICK_SYNCHYSIDENDRON,
            CLICK_DICKSONIA,
            CLICK_PARADOXOPTERIS,
            CLICK_DICRANOPHYLLUM,
            CLICK_DICROIDIUM_E,
            CLICK_DICROIDIUM_F,
            CLICK_DICROIDIUM_H,
            CLICK_DICROIDIUM_O,
            CLICK_DICROIDIUM,
            CLICK_DICTYONEMA,
            CLICK_DICTYOPHYLLUM,
            CLICK_DINOMISCHUS,
            CLICK_DIOON,
            CLICK_EOGINKGOITES,
            CLICK_DOLLYPHYTON,
            CLICK_ECHMATOCRINUS,
            CLICK_EDWARDSIPHYTON,
            CLICK_ELKINSIA,
            CLICK_EMPLECTOPTERIS,
            CLICK_ENCBLUE,
            CLICK_SHRUBBY_CYCAD,
            CLICK_EPHEDRA,
            CLICK_ARLENEA,
            CLICK_ERDTMANITHECALES,
            CLICK_JIANCHANGIA,
            CLICK_WELWITSCHIA,
            CLICK_WELWITSCHIOPHYLLUM,
            CLICK_DREWRIA,
            CLICK_PROTOGNETUM,
            CLICK_DAYVAULTIA,
            CLICK_EQUISETITES_REED,
            CLICK_EQUISETITES,
            CLICK_EREMOPTERIS,
            CLICK_HEMP,
            CLICK_ESCUMASIA,
            CLICK_FACIVERMIS,
            CLICK_FERN_EPIPHYTE,
            CLICK_FIELD_HORSETAIL,
            CLICK_FOOZIA,
            CLICK_FRENELOPSIS,
            CLICK_FUNISIA,
            CLICK_FURCIFOLIUM,
            CLICK_FURCULA,
            CLICK_GANGAMOPTERIS,
            CLICK_GLOSSOPTERIS_AMPLA,
            CLICK_GLOSSOPTERIS_DUOCAUDATA,
            CLICK_GIANT_HORSETAIL,
            CLICK_JURASSIC_HORSETAIL,
            CLICK_GIGANTOPTERID,
            CLICK_GIGANTOSPONGIA,
            CLICK_GLASS_SPONGE,
            CLICK_GINKGO,
            CLICK_GINKGOITES,
            CLICK_GLENOPTERIS,
            CLICK_GLOSSOPHYLLUM,
            CLICK_GLOSSOPTERIS,
            CLICK_GOGIA,
            CLICK_GORDONOPTERIS,
            CLICK_GRASSY_HORSETAIL,
            CLICK_GRYPANIA,
            CLICK_GUANGDEDENDRON,
            CLICK_HAOOTIA,
            CLICK_HAPSIDOPHYLLAS,
            CLICK_HELICOCYSTIS,
            CLICK_HERMANOPHYTON,
            CLICK_MESODESCOLEA,
            CLICK_PSEUDOCTENIS,
            CLICK_HERPETOGASTER,
            CLICK_HIRONOIA,
            CLICK_HYMENAEA,
            CLICK_IBYKA,
            CLICK_INARIA,
            CLICK_ISCHNOPHYTON,
            CLICK_ISOETES,
            CLICK_POTAMOGETON,
            CLICK_IRANIA,
            CLICK_JUNGLE,
            CLICK_FERN,
            CLICK_KOMLOPTERIS,
            CLICK_THINNFELDIA,
            CLICK_LADINIA,
            CLICK_LECLERCQIA,
            CLICK_LEPIDOCYSTIS,
            CLICK_LEPIDOPTERIS,
            CLICK_LEPTOCYCAS,
            CLICK_LEPTOPTERIS,
            CLICK_LESLEYA,
            CLICK_LIRIODENDRON,
            CLICK_LYCOPIA,
            CLICK_LYGINOPTERIS,
            CLICK_LYGODIUM,
            CLICK_LYRACYSTIS,
            CLICK_MACRONEUROPTERIS,
            CLICK_MACROTAENIOPTERIS,
            CLICK_MAGNOLIA,
            CLICK_MAPLE,
            CLICK_GUNNERA,
            CLICK_MARATTIA,
            CLICK_LOPHOSORIA,
            CLICK_BIRDSNEST_FERN,
            CLICK_MEDULLOSALES,
            CLICK_MIRABILIS,
            CLICK_NATALIGMA,
            CLICK_MONKEY_PUZZLE_ARAUCARIA,
            CLICK_MONKEYPUZZLE,
            CLICK_NAMACALATHUS,
            CLICK_NAMAPOIKIA,
            CLICK_NATHORSTIANA,
            CLICK_NELUMBO,
            CLICK_MICROVICTORIA,
            CLICK_DISKAGMA,
            CLICK_NUPHAR,
            CLICK_NEMATOPHYTA,
            CLICK_NEMEJCOPTERIS,
            CLICK_NEOCALAMITES,
            CLICK_ARCHAEOCALAMITES,
            CLICK_PARACALAMITES,
            CLICK_NEUROPTERIDIUM,
            CLICK_NILSSONIA,
            CLICK_NILSSONIOCLADUS,
            CLICK_NILSSONIOPTERIS,
            CLICK_NOEGGERATHIALES,
            CLICK_PANDAN,
            CLICK_NOTHOFAGUS,
            CLICK_NYSTROEMIA,
            CLICK_OAK,
            CLICK_ODONTOPTERIS,
            CLICK_OESIA,
            CLICK_OMPHALOPHLOIOS,
            CLICK_ORTISEIA,
            CLICK_SAPINDOPSIS,
            CLICK_VOJNOVSKYALES,
            CLICK_OSMUNDA,
            CLICK_OTOZAMITES,
            CLICK_PACHYPTERIS,
            CLICK_PALAEOGNETALEANA,
            CLICK_PALAEOSTACHYA,
            CLICK_PAMBIKALBAE,
            CLICK_PARVISCOPA,
            CLICK_PAURODENDRON,
            CLICK_PENTOXYLALES,
            CLICK_PERTICA,
            CLICK_PETRIELLALES,
            CLICK_PHASMATOCYCAS,
            CLICK_PHOENICOPSIS,
            CLICK_PHOENIX,
            CLICK_PHYLLOTHECA,
            CLICK_PIRANIA,
            CLICK_ARBORISPONGIA,
            CLICK_TITUSVILLIA,
            CLICK_RETIOPHYLLIA,
            CLICK_PITYS,
            CLICK_PLANE,
            CLICK_FIG,
            CLICK_FIG_BANYAN,
            CLICK_PLEUROMEIA,
            CLICK_PODOCARP,
            CLICK_SCARBURGIA,
            CLICK_RISSIKIA,
            CLICK_PODOZAMITES,
            CLICK_POLYSPERMOPHYLLUM,
            CLICK_PRIMAEVAL_GRASS,
            CLICK_PROTEA_1,
            CLICK_PROTEA,
            CLICK_PROTOLEPIDODENDROPSIS,
            CLICK_SUBLEPIDODENDRON,
            CLICK_LEPIDOSIGILLARIA,
            CLICK_OMPRELOSTROBUS,
            CLICK_CLUBMOSS,
            CLICK_PROTOTAXITES,
            CLICK_PSARONIUS,
            CLICK_PSEUDOBORNIA,
            CLICK_PSEUDOVOLTZIA,
            CLICK_PSILOPHYTON,
            CLICK_PTILOZAMITES,
            CLICK_PTERIDINIUM,
            CLICK_PTEROPHYLLUM,
            CLICK_PTILOPHYLLUM,
            CLICK_QUADROCLADUS,
            CLICK_SINOCARPUS,
            CLICK_QUASISTROBUS,
            CLICK_REDWOOD,
            CLICK_RELLIMIA,
            CLICK_RETICULOPTERIS,
            CLICK_RHACOPHYTON,
            CLICK_RHYNIA,
            CLICK_WATER_CLOVER,
            CLICK_SALVINIA,
            CLICK_RUFLORIA,
            CLICK_ACROCOMIA,
            CLICK_SABAL,
            CLICK_NYPA,
            CLICK_SAHNIOXYLON,
            CLICK_TICOA,
            CLICK_SANMIGUELIA,
            CLICK_LEPIDODENDRON,
            CLICK_LEPIDOPHLOIOS,
            CLICK_SCHIZONEURA,
            CLICK_SCHMEISSNERIA,
            CLICK_SCIADOPITYS,
            CLICK_SCOLECOPTERIS,
            CLICK_SCYTOPHYLLUM,
            CLICK_SELAGINELLA,
            CLICK_SIGILLARIA,
            CLICK_SILVER_TREEFERN,
            CLICK_BURNISHED_TREEFERN,
            CLICK_SIPHUSAUCTUM,
            CLICK_SKAARIPTERIS,
            CLICK_BOTRYCHIOPSIS,
            CLICK_CHIROPTERIS,
            CLICK_SPACIINODUM,
            CLICK_SPHENOBAIERA,
            CLICK_SPHENOPTERIS,
            CLICK_SPHENOPTERIS_FERN,
            CLICK_SPHENOPTERIS_SEED,
            CLICK_CALAMOPITYS,
            CLICK_CALATHOSPERMUM,
            CLICK_ANGIOPTERIS,
            CLICK_SPINY_CYCAD,
            CLICK_SPRUCE,
            CLICK_STAUROPTERIS,
            CLICK_STIFF_CYCAD,
            CLICK_STROMATOCYSTITES,
            CLICK_STROMATOLITE,
            CLICK_STROMATOVERIS,
            CLICK_SURANGEPHYLLUM,
            CLICK_SWAMP_HORSETAIL,
            CLICK_SWARTPUNTIA,
            CLICK_SYCAMORE,
            CLICK_CHESTNUT,
            CLICK_TAWUIA,
            CLICK_TAXODIUM,
            CLICK_TELEMACHUS,
            CLICK_TEMPSKYA,
            CLICK_TENTACULITA,
            CLICK_TETRAXYLOPTERIS,
            CLICK_THAMNOBEATRICEA,
            CLICK_THAUMAPTILON,
            CLICK_THECTARDIS,
            CLICK_THROMBOLITE,
            CLICK_THUCYDIA,
            CLICK_TIETEA,
            CLICK_TMESIPTERIS,
            CLICK_TODITES,
            CLICK_TONGCHUANOPHYLLUM,
            CLICK_TRIBRACHIDIUM,
            CLICK_TRICHOPITYS,
            CLICK_TYRMIA,
            CLICK_UMALTOLEPIS,
            CLICK_UTRECHTIA,
            CLICK_VALMEYERODENDRON,
            CLICK_VENTOGYRUS,
            CLICK_WACHTLERIA,
            CLICK_WACHTLERINA,
            CLICK_DECHELLYIA,
            CLICK_WALCHIA,
            CLICK_WATER_HORSETAIL,
            CLICK_WATTIEZA,
            CLICK_SANFORDIACAULIS,
            CLICK_WEICHSELIA,
            CLICK_WIELANDIELLA,
            CLICK_WILLIAMSONIA,
            CLICK_WOLLEMI,
            CLICK_WOOD_HORSETAIL,
            CLICK_XENOCLADIA,
            CLICK_ATLI,
            CLICK_RATTAN,
            CLICK_XIANGUANGIA,
            CLICK_XIHUPHYLLUM,
            CLICK_YEW,
            CLICK_ZAMITES,
            CLICK_ZOSTEROPHYLLUM,
            CLICK_ZYGOPTERIDACEAE,
            CLICK_SYMPLOCOPTERIS,
            CLICK_ZYGOPTERIS,
            CLICK_CEPHALOTAXUS,
            CLICK_CUNNINGHAMIA,
            CLICK_HOOP_ARAUCARIA,
            CLICK_AMENOTAXUS,
            CLICK_PALISSYA,
            CLICK_SCRUBBY_PINE,
            CLICK_GOLDEN_LARCH,
            CLICK_ARID_PINE,
            CLICK_CEDAR,
            CLICK_OLIVE,
            CLICK_THUJA,
            CLICK_LIQUIDAMBAR,
            CLICK_ROGERSIA,
            CLICK_SCHIZAEA,
            CLICK_KERAPHYTON,
            CLICK_PIETZSCHIA,
            CLICK_FLABELLOPTERIS,
            CLICK_KTALENIA,
            CLICK_TODEA,
        
            //Grouped ones:
            CLICK_BLASTOID,
            CLICK_SPONGE,
            CLICK_CORAL,
            CLICK_CAYTONIALES,
            CLICK_FENESTELLA,
            CLICK_MATONIA,
            CLICK_PRIMOCANDELABRUM,
            CLICK_RUGOSA,
            CLICK_SEA_ANEMONE,
            CLICK_SPHENOPHYLLALES,
            CLICK_TABULATA,

            
            //ENTITIES:
            //----------
            CLICK_ACADOARADOXIDES,
            CLICK_ACANTHODES,
            CLICK_ACANTHOSTEGA,
            CLICK_ACANTHOSTOMATOPS,
            CLICK_ACROLEPIS,
            CLICK_ACUTIRAMUS,
            CLICK_ADELOPHTHALMUS,
            CLICK_AEGER,
            CLICK_AEGIROCASSIS,
            CLICK_AINIKTOZOON,
            CLICK_AKMONISTION,
            CLICK_ALACARIS,
            CLICK_ALBERTONIA,
            CLICK_ALLENYPTERUS,
            CLICK_AMMONITE_ASTEROCERAS,
            CLICK_AMMONITE_CERATITES,
            CLICK_AMMONITE_CORONICERAS,
            CLICK_AMMONITE_CYLOLOBUS,
            CLICK_AMMONITE_DACTYLIOCERAS,
            CLICK_AMMONITE_GONIATITES,
            CLICK_AMMONITE_MANTICOCERAS,
            CLICK_AMMONITE_PACHYDESMOCERAS,
            CLICK_AMMONITE_PACHYDISCUS,
            CLICK_AMMONITE_PARAPUZOSIA,
            CLICK_AMMONITE_TITANITES,
            CLICK_AMPHIBAMUS,
            CLICK_AMPLECTOBELUA,
            CLICK_ANCIENT_JELLY,
            CLICK_YUNNANOASCUS,
            CLICK_ANOMALOCARIS,
            CLICK_ANTARCTICARCINUS,
            CLICK_ANTEOSAURUS,
            CLICK_ANTHRACOMEDUSA,
            CLICK_ANTINEOSTEUS,
            CLICK_APHETOCERAS,
            CLICK_ARANDASPIS,
            CLICK_ARCHAEOCIDARIS,
            CLICK_ARCHOBLATTINA,
            CLICK_ARCHOBLATTINA_NYMPH,
            CLICK_ARCHOSAURUS,
            CLICK_ARIZONASAURUS,
            CLICK_ARTHROPLEURA,
            CLICK_ASAPHUS,
            CLICK_ASCENDONANUS,
            CLICK_ASTRASPIS,
            CLICK_ATELEASPIS,
            CLICK_ATOPODENTATUS,
            CLICK_ATTERCOPUS,
            CLICK_AULACEPHALODON,
            CLICK_AULACOCERAS,
            CLICK_AUSTRIADACTYLUS,
            CLICK_AUSTROLIMULUS,
            CLICK_BALANERPETON,
            CLICK_BANDRINGA,
            CLICK_BANFFIA,
            CLICK_BARBCLABORNIA,
            CLICK_BASILOCERAS,
            CLICK_BATOFASCICULUS,
            CLICK_BATRACHOTOMUS,
            CLICK_BEISHANICHTHYS,
            CLICK_BELANTSEA,
            CLICK_BESANOSAURUS,
            CLICK_BIRGERIA,
            CLICK_BIRKENIA,
            CLICK_BLOURUGIA,
            CLICK_BOBASATRANIA ,
            CLICK_BOOTHIASPIS,
            CLICK_BOTHRIOLEPIS,
            CLICK_BRACHYDECTES,
            CLICK_BRANCHIOSAUR,
            CLICK_BREMBODUS,
            CLICK_BROCHOADMONES,
            CLICK_BUNOSTEGOS,
            CLICK_BUSHIZHEIA,
            CLICK_CACOPS,
            CLICK_CAELESTIVENTUS,
            CLICK_CALVAPILOSA,
            CLICK_CAMBRORASTER,
            CLICK_CAMEROCERAS,
            CLICK_CAMPBELLODUS,
            CLICK_CANADASPIS,
            CLICK_CANADIA,
            CLICK_CAPTORHINUS,
            CLICK_CARCINOSOMA,
            CLICK_CAROLOWILHELMINA,
            CLICK_CARTORHYNCHUS,
            CLICK_CASINERIA,
            CLICK_CATURUS,
            CLICK_CAVIRAMUS,
            CLICK_CEPHALASPIS,
            CLICK_CERATODUS,
            CLICK_CHEIRURUS,
            CLICK_CHELONIELLON,
            CLICK_CHINLEA,
            CLICK_CIDAROIDA,
            CLICK_CLADOSELACHE,
            CLICK_CLAUDIOSAURUS,
            CLICK_CLEVOSAURUS,
            CLICK_CLYDAGNATHUS,
            CLICK_COBELODUS,
            CLICK_COCCOSTEUS,
            CLICK_COELACANTHUS,
            CLICK_COELOPHYSIS,
            CLICK_COELUROSAURAVUS,
            CLICK_COOPEROCERAS,
            CLICK_COTHURNOCYSTIS,
            CLICK_COTYLORHYNCHUS,
            CLICK_CRASSIGYRINUS,
            CLICK_CROTALOCEPHALUS,
            CLICK_CTENOSPONDYLUS,
            CLICK_CYAMODUS,
            CLICK_CYCLONEMA,
            CLICK_CYMBOSPONDYLUS,
            CLICK_CYNOGNATHUS,
            CLICK_CYRTOCERAS,
            CLICK_DAEDALICHTHYS,
            CLICK_DALMANITES,
            CLICK_DAPEDIUM,
            CLICK_DASYCEPS,
            CLICK_DATHEOSAURUS,
            CLICK_DEIROCERAS,
            CLICK_DELTOPTYCHIUS,
            CLICK_DESMATOSUCHUS,
            CLICK_DIADECTES,
            CLICK_DIANIA,
            CLICK_DICKINSONIA,
            CLICK_ATTENBORITES,
            CLICK_DIDYMOGRAPTUS,
            CLICK_DIICTODON,
            CLICK_DIMETRODON,
            CLICK_DIPLOCAULUS,
            CLICK_DIPLOCERASPIS,
            CLICK_DORYASPIS,
            CLICK_DORYPTERUS,
            CLICK_DOSWELLIA,
            CLICK_DRACOPRISTIS,
            CLICK_DREPANASPIS,
            CLICK_DREPANOSAURUS,
            CLICK_DROTOPS,
            CLICK_DUNKLEOSTEUS,
            CLICK_DVINIA,
            CLICK_DVINOSAURUS,
            CLICK_EBENAQUA,
            CLICK_EDAPHOSAURUS,
            CLICK_EDESTUS,
            CLICK_EFFIGIA,
            CLICK_EGLONASPIS,
            CLICK_ELGINIA,
            CLICK_ELLIPSOCEPHALUS,
            CLICK_ELRATHIA,
            CLICK_ENDOCERAS,
            CLICK_ENDOTHIODON,
            CLICK_YINLONG,
            CLICK_ENOPLOURA,
            CLICK_EOANDROMEDA,
            CLICK_EOARTHROPLEURA,
            CLICK_EORAPTOR,
            CLICK_EOREDLICHIA,
            CLICK_EORHYNCHOCHELYS,
            CLICK_EOSAURICHTHYS,
            CLICK_EOSIMOPS,
            CLICK_eretmorhipis,
            CLICK_ERICIXERXES,
            CLICK_ERYOPS,
            CLICK_ERYTHROSUCHUS,
            CLICK_ESTEMMENOSUCHUS,
            CLICK_EUCHAMBERSIA,
            CLICK_EUDIMORPHODON,
            CLICK_EUNOTOSAURUS,
            CLICK_EUPARKERIA,
            CLICK_EURYPTERUS,
            CLICK_EUSAUROSPHARGIS,
            CLICK_EUSTHENOPTERON,
            CLICK_FADENIA_CARBONIFEROUS,
            CLICK_FADENIA_PERMOTRIASSIC,
            CLICK_FALCATUS,
            CLICK_FEROXICHTHYS,
            CLICK_FOREYIA,
            CLICK_FURCACAUDA,
            CLICK_FURCASTER,
            CLICK_GABREYASPIS,
            CLICK_GANTAROSTRATASPIS,
            CLICK_GEMMACTENA,
            CLICK_GEMUENDINA,
            CLICK_GEPHYROSTEGUS,
            CLICK_GERARUS,
            CLICK_GERROTHORAX,
            CLICK_GLAURUNG,
            CLICK_GNATHORHIZA,
            CLICK_GONIOCERAS,
            CLICK_GORGONOPS,
            CLICK_GROENLANDASPIS,
            CLICK_GYRACANTHIDES,
            CLICK_HAIKOUICHTHYS,
            CLICK_HALLUCIGENIA,
            CLICK_HARVESTMAN,
            CLICK_HELENODORA,
            CLICK_HELIANTHASTER,
            CLICK_HELICOPRION,
            CLICK_HELIOPELTIS,
            CLICK_HELMETIA,
            CLICK_HEMICYCLASPIS,
            CLICK_HENODUS,
            CLICK_HERRERASAURUS,
            CLICK_HETEROSTEUS,
            CLICK_HIBBERTOPTERUS,
            CLICK_HIBERNASPIS,
            CLICK_HOLONEMA,
            CLICK_HUNGIOIDES,
            CLICK_HYBODUS,
            CLICK_HYLONOMUS,
            CLICK_HYNERIA,
            CLICK_HYPERODAPEDON,
            CLICK_HYPSOGNATHUS,
            CLICK_HYPURONECTOR,
            CLICK_ICHTHYOSTEGA,
            CLICK_INIOPTERYX,
            CLICK_INOSTRANCEVIA,
            CLICK_ISOTELUS,
            CLICK_ITALOPHLEBIA,
            CLICK_JAEKELOPTERUS,
            CLICK_JANASSA,
            CLICK_JELLYFISH_PRECAMBRIAN,
            CLICK_JELLYFISH1,
            CLICK_JELLYFISH2,
            CLICK_JELLYFISH3,
            CLICK_JELLYFISH4,
            CLICK_JELLYFISH5,
            CLICK_JELLYFISH6,
            CLICK_JELLYFISH7,
            CLICK_JIANSHANOPODIA,
            CLICK_JONKERIA,
            CLICK_KAIBABVENATOR,
            CLICK_KALBARRIA,
            CLICK_KEICHOUSAURUS,
            CLICK_KERYGMACHELA,
            CLICK_KIMBERELLA,
            CLICK_KODYMIRUS,
            CLICK_KOKOMOPTERUS,
            CLICK_LABIDOSAURUS,
            CLICK_LACCOGNATHUS,
            CLICK_LAGOSUCHUS,
            CLICK_LAMINACARIS,
            CLICK_LANCEASPIS,
            CLICK_LEBACHACANTHUS,
            CLICK_LESSEMSAURUS,
            CLICK_LILIENSTERNUS,
            CLICK_LIMNOSCELIS,
            CLICK_LIMULID,
            CLICK_LISOWICIA,
            CLICK_LISTRACANTHUS,
            CLICK_LITUITES,
            CLICK_LOCHMANOLENELLUS,
            CLICK_LONCHIDION,
            CLICK_LONGISQUAMA,
            CLICK_LOTOSAURUS,
            CLICK_LUNASPIS,
            CLICK_LUNATASPIS,
            CLICK_LUNGMENSHANASPIS,
            CLICK_LUOXIONGICHTHYS,
            CLICK_LYRARAPAX,
            CLICK_LYSOROPHUS,
            CLICK_LYSTROSAURUS,
            CLICK_MACLURINA,
            CLICK_MARRELLA,
            CLICK_MASTODONSAURUS,
            CLICK_MCNAMARASPIS,
            CLICK_MEGACTENOPETALUS,
            CLICK_MEGALOCEPHALUS,
            CLICK_MEGALOGRAPTUS,
            CLICK_MEGANEURA,
            CLICK_MEGANEUROPSIS,
            CLICK_MEGARACHNE,
            CLICK_MEGAZOSTRODON,
            CLICK_MELOSAURUS,
            CLICK_MENASPIS,
            CLICK_MESOSAURUS,
            CLICK_METASPRIGGINA,
            CLICK_METOPOSAURUS,
            CLICK_MICRODICTYON,
            CLICK_MIMETASTER,
            CLICK_MIXOPTERUS,
            CLICK_MIXOSAURUS,
            CLICK_MONOGRAPTUS,
            CLICK_MONTECARIS,
            CLICK_MOOREOCERAS,
            CLICK_MORGANUCODON,
            CLICK_MOSCHOPS,
            CLICK_MUSSAURUS,
            CLICK_NAGINI,
            CLICK_NECTOCARIS,
            CLICK_NIPPONOMARIA,
            CLICK_NOTHOSAURUS,
            CLICK_ODARAIA,
            CLICK_ODONTOGRIPHUS,
            CLICK_OMNIDENS,
            CLICK_ONYCHODUS,
            CLICK_OPABINIA,
            CLICK_OPHIACODON,
            CLICK_OPOLANKA,
            CLICK_ORNITHOSUCHUS,
            CLICK_ORODUS,
            CLICK_ORTHOCERAS,
            CLICK_ORTHROZANCLUS,
            CLICK_OSTEOLEPIS,
            CLICK_OTTOIA,
            CLICK_PAGEA,
            CLICK_PALAEODICTYOPTERA_DELITZSCHALA,
            CLICK_PALAEODICTYOPTERA_DUNBARIA,
            CLICK_PALAEODICTYOPTERA_HOMALONEURA,
            CLICK_PALAEODICTYOPTERA_HOMOIOPTERA,
            CLICK_PALAEODICTYOPTERA_LITHOMANTIS,
            CLICK_PALAEODICTYOPTERA_LYCOCERCUS,
            CLICK_PALAEODICTYOPTERA_SINODUNBARIA,
            CLICK_PALAEODICTYOPTERA_STENODICTYA,
            CLICK_PALAEODICTYOPTERA_MAZOTHAIROS,
            CLICK_PALAEODICTYOPTERA_PSYCHROPTILUS,
            CLICK_PALAEOISOPUS,
            CLICK_PALAEONISCUM,
            CLICK_PALAEONTINID,
            CLICK_PANDERICHTHYS,
            CLICK_PANDERODUS,
            CLICK_PANTYLUS,
            CLICK_PANZHOUSAURUS,
            CLICK_PARADOXIDES,
            CLICK_PARANAICHTHYS,
            CLICK_PARAPEYTOIA,
            CLICK_PARATARRASIUS,
            CLICK_PAREXUS,
            CLICK_PARHYBODUS,
            CLICK_PARMASTEGA,
            CLICK_PARVANCORINA,
            CLICK_PAUCIPODIA,
            CLICK_PEDERPES,
            CLICK_PELURGASPIS,
            CLICK_PHANEROTINUS,
            CLICK_PHANTASPIS,
            CLICK_PHARYNGOLEPIS,
            CLICK_PHLEGETHONTIA,
            CLICK_PHOLIDERPETON,
            CLICK_PHRAGMOCERAS,
            CLICK_PIKAIA,
            CLICK_PLACERIAS,
            CLICK_PLACODUS,
            CLICK_PLATEOSAURUS,
            CLICK_PLATYCARASPIS,
            CLICK_PLATYHYSTRIX,
            CLICK_PLATYLOMASPIS,
            CLICK_PLATYSOMUS,
            CLICK_PNEUMODESMUS,
            CLICK_POLEUMITA,
            CLICK_POMATRUM,
            CLICK_POPOSAURUS,
            CLICK_PORASPIS,
            CLICK_POSTOSUCHUS,
            CLICK_POTANICHTHYS,
            CLICK_PRIONOSUCHUS,
            CLICK_PRISTEROGNATHUS,
            CLICK_PROBURNETIA,
            CLICK_PROCYNOSUCHUS,
            CLICK_PROFALLOTASPIS,
            CLICK_PROGANOCHELYS,
            CLICK_PROMISSUM,
            CLICK_PROSICTODON,
            CLICK_PROTEROGYRINUS,
            CLICK_PROTOROSAURUS,
            CLICK_PROTOZYGOPTERA,
            CLICK_PSAROLEPIS,
            CLICK_PSEUDOTHERIUM,
            CLICK_PTERASPIS,
            CLICK_PTERYGOTUS,
            CLICK_PURLOVIA ,
            CLICK_PYGOPTERUS,
            CLICK_QILINYU,
            CLICK_RAUTIANIA,
            CLICK_RAYONNOCERAS,
            CLICK_REBELLATRIX,
            CLICK_REMIGIOMONTANUS,
            CLICK_RETIFACIES,
            CLICK_RHENOCYSTIS,
            CLICK_RHIZODUS,
            CLICK_ROACHOID,
            CLICK_ROBERTIA,
            CLICK_RUBIDGEA,
            CLICK_RUTIODON,
            CLICK_SACABAMBASPIS,
            CLICK_SAIVODUS,
            CLICK_SALTRIOVENATOR,
            CLICK_SAURICHTHYS,
            CLICK_SAURICHTHYS_FRESHWATER,
            CLICK_SAUROCTONUS,
            CLICK_SAUROSUCHUS,
            CLICK_SCAUMENACIA,
            CLICK_SCHINDERHANNES,
            CLICK_SCLEROCORMUS,
            CLICK_SCLEROMOCHLUS,
            CLICK_SCORPION_GIGANTOSCORPIO,
            CLICK_SCORPION_GONDWANASCORPIO,
            CLICK_SCORPION_OPSIEOBUTHUS,
            CLICK_SCORPION_PULMONOSCORPIUS,
            CLICK_SCUTOSAURUS,
            CLICK_SELENOPELTIS,
            CLICK_SEMIONOTUS,
            CLICK_SEYMOURIA,
            CLICK_SHAROVIPTERYX,
            CLICK_SHONISAURUS,
            CLICK_SHRINGASAURUS,
            CLICK_SIBERION,
            CLICK_SIDNEYIA,
            CLICK_SILESAURUS,
            CLICK_SILLOSUCHUS,
            CLICK_SMILOSUCHUS,
            CLICK_SMOK,
            CLICK_SNAIL_LAND,
            CLICK_SPATHICEPHALUS,
            CLICK_SPHENACODON,
            CLICK_SPHENOTITAN,
            CLICK_SPINIPLATYCERAS,
            CLICK_SPINOAEQUALIS,
            CLICK_SPRIGGINA,
            CLICK_SQUATINACTIS,
            CLICK_STAGONOLEPIS,
            CLICK_STANOCEPHALOSAURUS,
            CLICK_STENSIOELLA,
            CLICK_SUMINIA,
            CLICK_SYLLIPSIMOPODI,
            CLICK_SYNOPHALOS,
            CLICK_TANYSTROPHEUS,
            CLICK_TAPINOCEPHALUS,
            CLICK_CRIOCEPHALOSAURUS,
            CLICK_TARTUOSTEUS,
            CLICK_TEGOPELTE,
            CLICK_TELEOCRATER,
            CLICK_TEMPEROCERAS,
            CLICK_TERATASPIS,
            CLICK_TERATERPETON,
            CLICK_TETRACERATOPS,
            CLICK_TETRAGRAPTUS,
            CLICK_TEYUJAGUA,
            CLICK_THECODONTOSAURUS,
            CLICK_THELODUS,
            CLICK_THRINACODUS,
            CLICK_THRINAXODON,
            CLICK_TIARAJUDENS,
            CLICK_TIKTAALIK,
            CLICK_TITANICHTHYS,
            CLICK_TITANOPTERA_CLATROTITAN,
            CLICK_TITANOPTERA_GIGATITAN,
            CLICK_TITANOPTERA_MESOTITAN,
            CLICK_TOKUMMIA,
            CLICK_TRAQUAIRIUS,
            CLICK_TRIADOBATRACHUS,
            CLICK_TRIGONOTARBID_CRYPTOMARTUS,
            CLICK_TRIGONOTARBID_EOPHRYNUS,
            CLICK_TRIGONOTARBID_KREISCHERIA,
            CLICK_TRIGONOTARBID_PALAEOCHARINUS,
            CLICK_TRIGONOTARBID_PALAEOTARBUS,
            CLICK_TRIGONOTARBID_PERMOTARBUS,
            CLICK_TRIMERUS,
            CLICK_TULLIMONSTRUM,
            CLICK_TURRISASPIS,
            CLICK_TYRANNOPHONTES,
            CLICK_URANOCENTRODON,
            CLICK_UROCORDYLUS,
            CLICK_UROSTHENES,
            CLICK_VANCLEAVEA,
            CLICK_VARIALEPIS,
            CLICK_VESTINAUTILUS,
            CLICK_VETULICOLA,
            CLICK_VIVAXOSAURUS,
            CLICK_WALLISEROPS,
            CLICK_WEBSTEROPRION,
            CLICK_WEIGELTISAURUS,
            CLICK_WHATCHEERIA,
            CLICK_WILLWERATHIA,
            CLICK_WIWAXIA,
            CLICK_XENACANTHUS,
            CLICK_XENUSION,
            CLICK_XINPUSAURUS,
            CLICK_YAWUNIK,
            CLICK_YILINGIA,
            CLICK_YOHOIA,
            CLICK_YORGIA,
            CLICK_YUNGUISAURUS,
            CLICK_YUNNANOZOON,
            CLICK_MICROBRACHIUS,
            CLICK_CHOTECOPS,
            CLICK_IVOITES,
            CLICK_PARAMBLYPTERUS,
            CLICK_ERAMOSCORPIUS,
            CLICK_MIGUASHAIA,
            CLICK_DUSLIA,
            CLICK_BALHUTICARIS,
            CLICK_CERATIOCARIS,
            CLICK_PLECTODISCUS,
            CLICK_VACHONISIA,
            CLICK_BUNDENBACHIELLUS,
            CLICK_WINGERTSHELLICUS,
            CLICK_WEINBERGINA,
            CLICK_NAHECARIS,
            CLICK_COMETICERCUS,
            CLICK_HARPES,
            CLICK_BOHEMOHARPES,
            CLICK_AMPYX,
            CLICK_LONCHODOMAS,
            CLICK_NEEYAMBASPIS,
            CLICK_PITURIASPIS,
            CLICK_TEGEOLEPIS,
            CLICK_CLIMATIUS,
            CLICK_NEREPISACANTHUS,
            CLICK_DIPLACANTHUS,
            CLICK_HURDIA,
            CLICK_CARYOSYNTRIPS,
            CLICK_PHLEBOLEPIS,
            CLICK_JAMOYTIUS,
            CLICK_ASCOCERAS,
            CLICK_SPHOOCERAS,
            CLICK_PRAEARCTURUS,
            CLICK_RUTGERSELLA,
            CLICK_SKEEMELLA,
            CLICK_DUNYU,
            CLICK_EUGALEASPIS,
            CLICK_OGYGINUS,
            CLICK_ARCTINURUS,
            CLICK_URALICHAS,
            CLICK_LASANIUS,
            CLICK_BARAMEDA,
            CLICK_ORNITHOPRION,
            CLICK_TORPEDASPIS,
            CLICK_FURCA,
            CLICK_TOMLINSONUS,
            CLICK_COWIELEPIS,
            CLICK_CASSINOCERAS,
            CLICK_MEGALOSAURUS,
            CLICK_MAZOTHAIROS,
            CLICK_OPHTHALMOSAURUS,
            CLICK_MACROMESODON,
            CLICK_NOTIDANOIDES,
            CLICK_ERYON,
            CLICK_ASPIDORHYNCHUS,
            CLICK_ARDUAFRONS,
            CLICK_AETHEOLEPIS,
            CLICK_APHNELEPIS,
            CLICK_EASTMANOSTEUS,
            CLICK_PENTECOPTERUS,
            CLICK_OXYOSTEUS,
            CLICK_GOOLOOGONGIA,
            CLICK_WARNETICARIS,
            CLICK_SCHUGUROCARIS,
            CLICK_GRIPHOGNATHUS,
            CLICK_CONCAVICARIS,
            CLICK_GOGONASUS,
            CLICK_FALLACOSTEUS,
            CLICK_ROLFOSTEUS,
            CLICK_CAMUROPISCIS,
            CLICK_CTENURELLA,
            CLICK_RHAMPHODOPSIS,
            CLICK_GOODRADIGBEEON,
            CLICK_DRACONICHTHYS,
            CLICK_MATERPISCIS,
            CLICK_BRINDABELLASPIS,
            CLICK_WUTTAGOONASPIS,
            CLICK_KUJDANOWIASPIS,
            CLICK_PHYLLOLEPIS,
            CLICK_COWRALEPIS,
            CLICK_GYMNOTRACHELUS,
            CLICK_BUNGARTIUS,
            CLICK_RHADINACANTHUS,
            CLICK_THRISSOPS,
            CLICK_BELONOSTOMUS,
            CLICK_MUENSTERELLA,
            CLICK_ASTERACANTHUS,
            CLICK_TURBOSCINETES,
            CLICK_REDFIELDIUS,
            CLICK_LEPTOLEPIS,
            CLICK_LEPIDOTES,
            CLICK_DOLLOCARIS,
            CLICK_SILUROLEPIS,
            CLICK_ENTELOGNATHUS,
            CLICK_PIRANHAMESODON,
            CLICK_KENTROSAURUS,
            CLICK_DRYOSAURUS,
            CLICK_DYSALOTOSAURUS,
            CLICK_STETHACANTHUS,
            CLICK_HUALIANCERATOPS,
            CLICK_CHAOYANGSAURUS,
            CLICK_PANGURAPTOR,
            CLICK_XUANHUACERATOPS,
            CLICK_MYRIACANTHERPESTES,
            CLICK_GUIYU,
            CLICK_SCLERODUS,
            CLICK_MEGAMASTAX,
            CLICK_POLYBRANCHIASPIS,
            CLICK_TAURASPIS,
            CLICK_PARAMETEORASPIS,
            CLICK_ATHENAEGIS,
            CLICK_GYROSTEUS,
            CLICK_SQUALORAJA,
            CLICK_GYRODUS,
            CLICK_PHIALASPIS,
            CLICK_LEPIDASTER,
            CLICK_VILLEBRUNASTER,
            CLICK_TAMISIOCARIS,
            CLICK_HUPEHSUCHUS,
            CLICK_MARMOLATELLA,
            CLICK_MUREX,
            CLICK_HARPAGODES,
            CLICK_STROMBUS,
            CLICK_NERINEA,
            CLICK_LEVIATHANIA,
            CLICK_PRICYCLOPYGE,
            CLICK_PSYCHOPYGE,
            CLICK_CAROLINITES,
            CLICK_SYMPHYSOPS,
            CLICK_ELEPHANTOCERAS,
            CLICK_EUSPIRA,
            CLICK_PROMEXYELE,
            CLICK_PAPILIONICHTHYS,
            CLICK_RAINERICHTHYS,
            CLICK_STRUDOPS,
            CLICK_GUANO_GOLEM,
            CLICK_IRON_GOLEM,
            CLICK_SNOW_GOLEM,
            CLICK_WITHER,
            CLICK_ORCANOPTERUS,
            CLICK_ONYCHOPTERELLA,
            CLICK_STROBILOPTERUS,
            CLICK_PROTEROSUCHUS,
            CLICK_LIMUSAURUS,
            CLICK_STOERMEROPTERUS,
            CLICK_PEZOPALLICHTHYS,
            CLICK_BELONOSTOMUS_CRETACEOUS,
            CLICK_BELONOSTOMUS_JURASSIC,
            CLICK_GREERERPETON,
            CLICK_CORDATICARIS,
            CLICK_SANCTACARIS,
            CLICK_ZENASPIS,
            CLICK_TYPHLOESUS,
            CLICK_ELASMODECTES,
            CLICK_KOSMOCERAS,
            CLICK_QUASIMODICHTHYS,
            CLICK_ANAETHALION,
            CLICK_VIVIPARUS,
            CLICK_DAKOSAURUS,
            CLICK_STAHLECKERIA,
            CLICK_SLIMONIA,
            CLICK_HOVASAURUS,
            CLICK_DECACUMINASTER,
            CLICK_SACCOCOMA,
            CLICK_VAMPYRONASSA,
            CLICK_PROTEROCTOPUS,
            CLICK_DICRANURUS,
            CLICK_THANAHITA,
            CLICK_SIBYRHYNCHUS,
            CLICK_METOPACANTHUS,
            CLICK_BISHANOPLIOSAURUS,
            CLICK_CANCRINOS,
            CLICK_PLATYSUCHUS,
            CLICK_SYRINGOCRINUS,
            CLICK_DENDROCYSTITES,
            CLICK_ANGELINA,
            CLICK_PLATYPELTOIDES,
            CLICK_MEGISTASPIS,
            CLICK_TRIBRACHIODEMAS,
            CLICK_IOWACYSTIS,
            CLICK_CHASMATASPIS,
            CLICK_HOPLITASPIS,
            CLICK_CERATOSAURUS,
            CLICK_KULINDADROMEUS,
            CLICK_UTATSUSAURUS,
            CLICK_HARPACANTHUS,
            CLICK_RHOMALEOSAURUS,
            CLICK_HARPAGOFUTUTOR,
            CLICK_HADRONECTOR,
            CLICK_MEGATEUTHIS,
            CLICK_PASSALOTEUTHIS,
            CLICK_OPHIOPSIS,
            CLICK_CONGOPHIOPSIS,
            CLICK_ADAMANTERYON,
            CLICK_SCHEENSTIA,
            CLICK_PLECTRONOCERAS,
            CLICK_CALCEOLISPONGIA,
            CLICK_PSEUDORHINA,
            CLICK_PHORCYNIS,
            CLICK_TEMNODONTOSAURUS,
            CLICK_PROPTERUS,
            CLICK_OREOCHIMA,
            CLICK_LIBYS,
            CLICK_COCCODERMA,
            CLICK_CHUNERPETON,
            CLICK_DOCODON,
            CLICK_CASTOROCAUDA,
            CLICK_PLEUROSAURUS,
            CLICK_SPIROCERAS,
            CLICK_HOMOEOSAURUS,
            CLICK_CENOCERAS,
            CLICK_OSTENOCARIS,
            CLICK_MORROLEPIS,
            CLICK_CIURCOPTERUS,
            CLICK_GEOSAURUS,
            CLICK_XINJIANGCHELYS,
            CLICK_EOCARCINUS,
            CLICK_EURHINOSAURUS,
            CLICK_KAYKAY,
            CLICK_THALASSEMYS,
            CLICK_CLARKEITEUTHIS,
            CLICK_ORTHOCORMUS,
            CLICK_THALASSIODRACON,
            CLICK_MICROCLEIDUS,
            CLICK_OPHTHALMOTHULE,
            CLICK_DRAGONFLY,
            CLICK_KALLIGRAMMATID_OREGRAMMA,
            CLICK_KALLIGRAMMATID_MAKARKINIA,
            CLICK_KALLIGRAMMATID_ITHIGRAMMA,
            CLICK_KALLIGRAMMATID_SOPHOGRAMMA,
            CLICK_KALLIGRAMMATID_ABRIGRAMMA,
            CLICK_LACEWING_AETHEOGRAMMA,
            CLICK_KALLIGRAMMATID_MEIONEURITES,
            CLICK_KALLIGRAMMATID_LIASSOPSYCHOPS,
            CLICK_KALLIGRAMMATID_KALLIGRAMMA,
            CLICK_LACEWING_LICHENIPOLYSTOECHOTES,
            CLICK_KALLIGRAMMATID_HUIYINGOGRAMMA,
            CLICK_KALLIGRAMMATID_APOCHRYSOGRAMMA,
            CLICK_LACEWING_GRAMMOLINGIA,
            CLICK_LACEWING_LACCOSMYLUS,
            CLICK_LACEWING_CRETAPSYCHOPS,
            CLICK_LACEWING_BELLINYMPHA,
            CLICK_SCORPIONFLY,
            CLICK_ECHINOCHIMAERA,
            CLICK_PHILLIPSIA,
            CLICK_MEGASECOPTERA_SYLVOHYMEN,
            CLICK_MEGANEURITES,
            CLICK_DAOHUGOUCOSSUS,
            CLICK_PANACANTHOCARIS,
            CLICK_TRACHYMETOPON,
            CLICK_BOBOSAURUS,
            CLICK_PALAEOCARCHARIAS,
            CLICK_PROTOSPINAX,
            CLICK_PARNAIBAIA,
            CLICK_UARBRYICHTHYS,
            CLICK_SIDEROPS,
            CLICK_STEURBAUTICHTHYS,
            CLICK_MECOCHIRUS,
            CLICK_ISANICHTHYS,
            CLICK_CONGOPYCNODUS,
            CLICK_MESTURUS,
            CLICK_PARACESTRACION,
            CLICK_SPATHOBATIS,
            CLICK_BAVARISCYLLIUM,
            CLICK_ISCHYODUS,
            CLICK_LIGULELLA,
            CLICK_PARADAPEDIUM,
            CLICK_HAPLOPHRENTIS,
            CLICK_KLEPTOTHULE,
            CLICK_RHINOPTERASPIS,
            CLICK_KAYENTATHERIUM,
            CLICK_TRITYLODON,
            CLICK_HALDANODON,
            CLICK_MARMORERPETON,
            CLICK_CELTEDENS,
            CLICK_VADASAURUS,
            CLICK_SHAIHULUDIA,
            CLICK_URSACTIS,
            CLICK_KOOTENAYSCOLEX,
            CLICK_MACROSEMIUS,
            CLICK_SAUROSTOMUS,
            CLICK_SONGAICHTHYS,
            CLICK_PHYTOPHILASPIS,
            CLICK_ARCHOCYRTUS,
            CLICK_PROCONODONTUS,
            CLICK_OZARKODINA,
            CLICK_IOWAGNATHUS,
            CLICK_HINDEODUS,
            CLICK_CLARKINA,
            CLICK_MISIKELLA,
            CLICK_SOKKAEJAECYSTIS,
            CLICK_PIATNITZKYSAURUS,
            CLICK_GASOSAURUS,
            CLICK_TANYRHINICHTHYS,
            CLICK_AMMONITE_PERISPHINCTES,
            CLICK_LAIDLERIA,
            CLICK_TRIOPS,
            CLICK_BIVALVE_INOCERAMUS_GIGANTOCAPULUS,
            CLICK_PYCNOPHLEBIA,
            CLICK_ARCHABOILUS,
            CLICK_EUROPASAURUS,
            CLICK_JEHOLOTRITON,
            CLICK_GLYPTOPS,
            CLICK_KAYENTACHELYS,
            CLICK_HUAYANGOSAURUS,
            CLICK_GIGANTSPINOSAURUS,
            CLICK_STEGOSAURUS,
            CLICK_TUOJIANGOSAURUS,
            CLICK_YUXISAURUS,
            CLICK_DIANDONGOSUCHUS,
            CLICK_TANYCOLAGREUS,
            CLICK_CRYOLOPHOSAURUS,
            CLICK_OLENELLUS,
            CLICK_CERVIFURCA,
            CLICK_ANGUSTIDONTUS,
            CLICK_DUBREUILLOSAURUS,
            CLICK_TIANYULONG,
            CLICK_APATOSAURUS,
            CLICK_CHILESAURUS,
            CLICK_DICRAEOSAURUS,
            CLICK_ANCHISAURUS,
            CLICK_ORNITHOLESTES,
            CLICK_ANCHIORNIS,
            CLICK_HETERODONTOSAURUS,
            CLICK_WUKONGOPTERUS,
            CLICK_GARGOYLEOSAURUS,
            CLICK_PROCERATOSAURUS,
            CLICK_SHUNOSAURUS,
            CLICK_CAMPTOSAURUS,
            CLICK_RHAMPHORHYNCHUS,
            CLICK_PTERODACTYLUS,
            CLICK_GUANLONG,
            CLICK_YI,
            CLICK_YANGCHUANOSAURUS,
            CLICK_ANUROGNATHUS,
            CLICK_SINOMACROPS,
            CLICK_BATRACHOGNATHUS,
            CLICK_CASCOCAUDA,
            CLICK_DENDRORHYNCHOIDES,
            CLICK_DIMORPHODON,
            CLICK_ARCHAEOPTERYX,
            CLICK_COMPSOGNATHUS,
            CLICK_DILOPHOSAURUS,
            CLICK_ALLOSAURUS,
            CLICK_TORVOSAURUS,
            CLICK_BRACHIOSAURUS,
            CLICK_CAMARASAURUS,
            CLICK_DIPLODOCUS,
            CLICK_GLACIALISAURUS,
            CLICK_ADEOPAPPOSAURUS,
            CLICK_MAMENCHISAURUS,
            CLICK_MYMOORAPELTA,
            CLICK_CUMNORIA,
            CLICK_UTEODON,
            CLICK_SINRAPTOR,
            CLICK_JEHOLOPTERUS,
            CLICK_MIRAGAIA,
            CLICK_DORYGNATHUS,
            CLICK_ELAPHROSAURUS,
            CLICK_YIQI,
            CLICK_NIMBIA,
            CLICK_EDIACARIA,
            CLICK_CYCLOMEDUSA,
            CLICK_BURGESSOMEDUSA,
            CLICK_CORDUBIA,
            CLICK_THAUMACTENA,
            CLICK_ELDONIA,
            CLICK_CTENORHABDOTUS,
            CLICK_CONULARIID,
            CLICK_ARCHAEOCONULARIA,
            CLICK_DISCOPHYLLUM,
            CLICK_PSEUDODISCOPHYLLUM,
            CLICK_BERTRATIS,
            CLICK_ROTACIURCA,
            CLICK_PAROPSONEMA,
            CLICK_PALAEOCTENOPHORA,
            CLICK_ARCHAEOCYDIPPIDA,
            CLICK_DAIHUOIDES,
            CLICK_OCTOMEDUSA,
            CLICK_PROTHYSANOSTOMA,
            CLICK_ESSEXELLA,
            CLICK_MEDUSINA,
            CLICK_TARRACODISCUS,
            CLICK_HELIOBRANCHIA,
            CLICK_EULITHOTA,
            CLICK_SEMAEOSTOMITES,
            CLICK_HYDROCRASPEDOTA,
            CLICK_RHIZOSTOMITES,
            CLICK_BANKSIOPS,
            CLICK_PAMPAPHONEUS,
            CLICK_PLIOSAURUS,
            CLICK_LEEDSICHTHYS,
            CLICK_ICHTHYOSAURUS,
            CLICK_PLESIOSAURUS,
            CLICK_HUGHMILLERIA,
            CLICK_WAPTIA,
            CLICK_ISOXYS,
            CLICK_CAPINATATOR,
            CLICK_HADRANAX,
            CLICK_TIMOREBESTIA,
            CLICK_MOBULAVERMIS,
            CLICK_BURGESSIA,
            CLICK_SAPERION,
            CLICK_THULASPIS,
            CLICK_UROKODIA,
            CLICK_THELXIOPE,
            CLICK_TITANOKORYS,
            CLICK_ERYMA,
            CLICK_PARIOSCORPIO,
            CLICK_NESONEKTRIS,
            CLICK_TANAOCROSSUS,
            CLICK_EOCHONDROSTEUS,
            CLICK_LIAOSTEUS,
            CLICK_KICHKASSIA,
            CLICK_BRAZILICHTHYS,
            CLICK_CONCHOPOMA,
            CLICK_SURCAUDALUS,
            CLICK_BETHESDAICHTHYS,
            CLICK_NAMUROTYPUS,
            CLICK_ERASIPTEROIDES,
            CLICK_LEPTOTEUTHIS,
            CLICK_LUFENGOSAURUS,
            CLICK_CAIHONG,
            CLICK_MEGALICHTHYS,
            CLICK_MAMULICHTHYS,
            CLICK_COTYLEDION,
            CLICK_SENEKICHTHYS,
            CLICK_HETEROPETALUS,
            CLICK_GANGTOUCUNIA,
            CLICK_SHANKOUCLAVA,
            CLICK_CLIMACOGRAPTUS,
            CLICK_PHYLLOGRAPTUS,
            CLICK_ORTHOGRAPTUS,
            CLICK_BOWENGRIPHUS,
            CLICK_GOSFORDIA,
            CLICK_SARGODON,
            CLICK_HYDROPESSUM,
            CLICK_PHACOPS,
            CLICK_PHYLLOCERAS,
            CLICK_ERETTOPTERUS,
            CLICK_POLYSENTOR,
            CLICK_THALATTOSUCHUS,
            CLICK_DEBEERIUS,
            CLICK_WODNIKA,
            CLICK_PSEUDOANGUSTIDONTUS,
            CLICK_SARCOPRION,
            CLICK_DAIHUA,
            CLICK_CRUMILLOSPONGIA,
            CLICK_DIPTERONOTUS,
            CLICK_HETEROSTROPHUS,
            CLICK_FLAGELLOPANTOPUS,
            CLICK_MONOLOPHOSAURUS,
            CLICK_WAAGENELLA,
            CLICK_AKASAKIELLA,
            CLICK_FOORDELLA,
            CLICK_CHIPPEWAELLA,
            CLICK_DEUTEROSAURUS,
            CLICK_DRACOPELTA,
            CLICK_SINOPHONEUS,
            CLICK_STONEFLY,
            CLICK_LUSOVENATOR,
            CLICK_LUSOTITAN,
            CLICK_ROMERODUS,
            CLICK_SRIANTA,
            CLICK_GREGORIUS,
            CLICK_OBRUCHEVODUS,
            CLICK_CHONDRENCHELYS,
            CLICK_ORESTIACANTHUS,
            CLICK_GOODRICHTHYS,
            CLICK_GANSUSELACHE,
            CLICK_ARCHAEOTHYRIS,
            CLICK_EUSTREPTOSPONDYLUS,
            CLICK_MOOREODONTUS,
            CLICK_HAGENOSELACHE,
            CLICK_DIPLODOSELACHE,
            CLICK_STENOKRANIO,
            CLICK_IDMONARACHNE,
            CLICK_TRIGONOTARBID_GONDWANARACHNE,
            CLICK_CRICOSAURUS,
            CLICK_SCHOENESMAHL,
            CLICK_WESTRICHUS,
            CLICK_CARIDOSUCTOR,
            CLICK_RHABDODERMA,
            CLICK_PHANERORHYNCHUS,
            CLICK_DEARC,
            CLICK_GERMANODACTYLUS,
            CLICK_HARPACTOGNATHUS,
            CLICK_EOCURSOR,
            CLICK_WARDICHTHYS,
            CLICK_PAMBDELURION,
            CLICK_PRISCOMYZON,
            CLICK_ALIENUM,
            CLICK_MIERIDDURYN,
            CLICK_VENUSTULUS,
            CLICK_ARCHERIA,
            CLICK_TYRANNOTITAN,
            CLICK_NIGERPETON,
            CLICK_HAPLOLEPIS,
            CLICK_TESNUSOCARIS,
            CLICK_ONYCHOSELACHE,
            CLICK_NINGXIAPLATYSOMUS,
            CLICK_AUSTRALICHTHYS,
            CLICK_ANDERELLA,
            CLICK_AETHERETMON,
            CLICK_ROLFEIA,
            CLICK_ACHERONTISCUS,
            CLICK_NEMATOPTYCHIUS,
            CLICK_AMPHICENTRUM,
            CLICK_CARBOTUBULUS,
            CLICK_ANTHRACOSAURUS,
            CLICK_SCLEROCEPHALUS,
            CLICK_SCREBINODUS,
            CLICK_GERAGNOSTUS,
            CLICK_URASTERELLA,
            CLICK_CAMANCHIA,
            CLICK_PSEUDONARAOIA,
            CLICK_NARAOIA_SPINOSA,
            CLICK_NARAOIA_BERTIENSIS,
            CLICK_VIDALAMIA,
            CLICK_SINAMIA,
            CLICK_PACHYAMIA,
            CLICK_KHORATAMIA,
            CLICK_HISPANAMIA,
            CLICK_CRATOAMIA,
            CLICK_TOMOGNATHUS,
            CLICK_IKECHAOAMIA,
            CLICK_SOLNHOFENAMIA,
            CLICK_CALAMOPLEURUS,
            CLICK_TETRAMEROCERAS,
            CLICK_DRACORAPTOR,
            CLICK_PRESTOSUCHUS,
            CLICK_KANNEMEYERIA,
            CLICK_TRILOPHOSAURUS,
            CLICK_LESOTHOSAURUS,
            CLICK_QIANOSUCHUS,
            CLICK_KNOETSCHKESUCHUS,
            CLICK_LITARGOSUCHUS,
            CLICK_TROPIDOSUCHUS,




    };


    /**
     * This method is part of my simple custom advancement triggering tutorial.
     * See: http://jabelarminecraft.blogspot.com/p/minecraft-modding-custom-triggers-aka.html
     */
    public static void registerTriggers()
    {
        // DEBUG
        System.out.println("Registering custom triggers");

        Method method;

        method = ReflectionHelper.findMethod(CriteriaTriggers.class, "register", "func_192118_a", ICriterionTrigger.class);

        method.setAccessible(true);

        for (int i=0; i < TRIGGER_ARRAY.length; i++)
        {
            try
            {
               method.invoke(null, TRIGGER_ARRAY[i]);
            }
            catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e)
            {
               e.printStackTrace();
            }
        }
    }
}