package net.lepidodendron.entity.render.entity;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.entity.boats.EntityPNBoat;
import net.minecraft.client.renderer.entity.RenderBoat;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.util.ResourceLocation;

public class RenderPNBoat extends RenderBoat {

    private static final ResourceLocation TEXTURE_AGATHIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_agathis.png");
    private static final ResourceLocation TEXTURE_ALPIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_alpia.png");
    private static final ResourceLocation TEXTURE_APPLE = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_apple.png");
    private static final ResourceLocation TEXTURE_ARAUCARIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_araucaria.png");
    private static final ResourceLocation TEXTURE_ARAUCARIOXYLON = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_araucarioxylon.png");
    private static final ResourceLocation TEXTURE_ARAUCARITES = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_araucarites.png");
    private static final ResourceLocation TEXTURE_ARCHAEANTHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_archaeanthus.png");
    private static final ResourceLocation TEXTURE_ARCHAEOPTERIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_archaeopteris.png");
    private static final ResourceLocation TEXTURE_ARTHROPITYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_arthropitys.png");
    private static final ResourceLocation TEXTURE_ARTOCARPUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_artocarpus.png");
    private static final ResourceLocation TEXTURE_BEECH = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_beech.png");
    private static final ResourceLocation TEXTURE_BOTHRODENDRON = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_bothrodendron.png");
    private static final ResourceLocation TEXTURE_BRACHYPHYLLUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_brachyphyllum.png");
    private static final ResourceLocation TEXTURE_BRISTLECONE = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_bristlecone.png");
    private static final ResourceLocation TEXTURE_CALAMITES = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_calamites.png");
    private static final ResourceLocation TEXTURE_CEPHALOTAXUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_cephalotaxus.png");
    private static final ResourceLocation TEXTURE_CORDAITES = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_cordaites.png");
    private static final ResourceLocation TEXTURE_CUNNINGHAMIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_cunninghamia.png");
    private static final ResourceLocation TEXTURE_CYPRESS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_cypress.png");
    private static final ResourceLocation TEXTURE_CZEKANOWSKIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_czekanowskia.png");
    private static final ResourceLocation TEXTURE_DAWN_REDWOOD = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_dawn_redwood.png");
    private static final ResourceLocation TEXTURE_DEAD = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_dead.png");
    private static final ResourceLocation TEXTURE_DIAPHORODENDRON = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_diaphorodendron.png");
    private static final ResourceLocation TEXTURE_DICROIDIUM_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_dicroidium_f.png");
    private static final ResourceLocation TEXTURE_DICROIDIUM_O = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_dicroidium_o.png");
    private static final ResourceLocation TEXTURE_FURCULA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_furcula.png");
    private static final ResourceLocation TEXTURE_GANGAMOPTERIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_gangamopteris.png");
    private static final ResourceLocation TEXTURE_GINKGO = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_ginkgo.png");
    private static final ResourceLocation TEXTURE_GINKGOITES = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_ginkgoites.png");
    private static final ResourceLocation TEXTURE_GLOSSOPTERIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_glossopteris.png");
    private static final ResourceLocation TEXTURE_HIRONOIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_hironoia.png");
    private static final ResourceLocation TEXTURE_HYMENAEA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_hymenaea.png");
    private static final ResourceLocation TEXTURE_LEPIDODENDRON = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_lepidodendron.png");
    private static final ResourceLocation TEXTURE_LEPIDOPHLOIOS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_lepidophloios.png");
    private static final ResourceLocation TEXTURE_LIRIODENDRON = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_liriodendron.png");
    private static final ResourceLocation TEXTURE_MACRONEUROPTERIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_macroneuropteris.png");
    private static final ResourceLocation TEXTURE_MAGNOLIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_magnolia.png");
    private static final ResourceLocation TEXTURE_MAPLE = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_maple.png");
    private static final ResourceLocation TEXTURE_NOTHOFAGUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_nothofagus.png");
    private static final ResourceLocation TEXTURE_PENTOXYLALES = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_pentoxylales.png");
    private static final ResourceLocation TEXTURE_PHOENICOPSIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_phoenicopsis.png");
    private static final ResourceLocation TEXTURE_PITYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_pitys.png");
    private static final ResourceLocation TEXTURE_PLANE = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_plane.png");
    private static final ResourceLocation TEXTURE_PODOCARP = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_podocarp.png");
    private static final ResourceLocation TEXTURE_PODOZAMITES = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_podozamites.png");
    private static final ResourceLocation TEXTURE_REDWOOD = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_redwood.png");
    private static final ResourceLocation TEXTURE_SCIADOPITYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_sciadopitys.png");
    private static final ResourceLocation TEXTURE_SCRUBBY_PINE = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_scrubby_pine.png");
    private static final ResourceLocation TEXTURE_SIGILLARIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_sigillaria.png");
    private static final ResourceLocation TEXTURE_SPHENOBAIERA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_sphenobaiera.png");
    private static final ResourceLocation TEXTURE_SYCAMORE = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_sycamore.png");
    private static final ResourceLocation TEXTURE_TAXODIUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_taxodium.png");
    private static final ResourceLocation TEXTURE_TELEMACHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_telemachus.png");
    private static final ResourceLocation TEXTURE_WALCHIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_walchia.png");
    private static final ResourceLocation TEXTURE_WOLLEMI = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_wollemi.png");
    private static final ResourceLocation TEXTURE_YEW = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_yew.png");

    private static final ResourceLocation TEXTURE_PHOENIX = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_phoenix.png");
    private static final ResourceLocation TEXTURE_ELATOCLADUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_elatocladus.png");
    private static final ResourceLocation TEXTURE_NEHVIZDYELLA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_nehvizdyella.png");
    private static final ResourceLocation TEXTURE_LAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_laurus.png");
    private static final ResourceLocation TEXTURE_CHESTNUT = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_chestnut.png");
    private static final ResourceLocation TEXTURE_BISONIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_bisonia.png");
    private static final ResourceLocation TEXTURE_EMBOTHRIUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_embothrium.png");
    private static final ResourceLocation TEXTURE_PAGIOPHYLLUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_pagiophyllum.png");
    private static final ResourceLocation TEXTURE_HIRMERIELLA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_hirmeriella.png");
    private static final ResourceLocation TEXTURE_FIG = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_fig.png");
    private static final ResourceLocation TEXTURE_GOLDEN_LARCH = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_golden_larch.png");
    private static final ResourceLocation TEXTURE_ARID_PINE = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_arid_pine.png");
    private static final ResourceLocation TEXTURE_OLIVE = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_olive.png");
    private static final ResourceLocation TEXTURE_CEDAR = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_cedar.png");
    private static final ResourceLocation TEXTURE_THUJA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_thuja.png");
    private static final ResourceLocation TEXTURE_LIQUIDAMBAR = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_liquidambar.png");

    private static final ResourceLocation TEXTURE_SYNCHYSIDENDRON = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_synchysidendron.png");
    private static final ResourceLocation TEXTURE_DOYLEALES = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_doyleales.png");

    private static final ResourceLocation TEXTURE_SATPURAPHYLLUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_satpuraphyllum.png");
    private static final ResourceLocation TEXTURE_ULLMANNIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_ullmannia.png");
    private static final ResourceLocation TEXTURE_BIARMOBAIERA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_biarmobaiera.png");
    private static final ResourceLocation TEXTURE_LEPTOPHLOEUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_leptophloeum.png");
    private static final ResourceLocation TEXTURE_MIROVIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_mirovia.png");
    private static final ResourceLocation TEXTURE_ALBERTIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_albertia.png");
    private static final ResourceLocation TEXTURE_WOODWORTHIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_woodworthia.png");
    private static final ResourceLocation TEXTURE_ARBORAMOSA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_arboramosa.png");
    private static final ResourceLocation TEXTURE_SCHILDERIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_schilderia.png");

    private static final ResourceLocation TEXTURE_DRYOPHYLLUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_dryophyllum.png");
    private static final ResourceLocation TEXTURE_BEAUPREA = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_beauprea.png");
    private static final ResourceLocation TEXTURE_POPULUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/boats/boat_populus.png");


    public RenderPNBoat(RenderManager renderManagerIn) {
        super(renderManagerIn);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityBoat entity)
    {
        EntityPNBoat boat = (EntityPNBoat) entity;
        switch (boat.getPNBoatType()) {
            case AGATHIS: default:
                return TEXTURE_AGATHIS;
            case ALPIA:
                return TEXTURE_ALPIA;
            case APPLE:
                return TEXTURE_APPLE;
            case ARAUCARIA:
                return TEXTURE_ARAUCARIA;
            case ARAUCARIOXYLON:
                return TEXTURE_ARAUCARIOXYLON;
            case ARAUCARITES:
                return TEXTURE_ARAUCARITES;
            case ARCHAEANTHUS:
                return TEXTURE_ARCHAEANTHUS;
            case ARCHAEOPTERIS:
                return TEXTURE_ARCHAEOPTERIS;
            case ARTHROPITYS:
                return TEXTURE_ARTHROPITYS;
            case ARTOCARPUS:
                return TEXTURE_ARTOCARPUS;
            case BEECH:
                return TEXTURE_BEECH;
            case BOTHRODENDRON:
                return TEXTURE_BOTHRODENDRON;
            case BRACHYPHYLLUM:
                return TEXTURE_BRACHYPHYLLUM;
            case BRISTLECONE:
                return TEXTURE_BRISTLECONE;
            case CALAMITES:
                return TEXTURE_CALAMITES;
            case CEPHALOTAXUS:
                return TEXTURE_CEPHALOTAXUS;
            case CORDAITES:
                return TEXTURE_CORDAITES;
            case CUNNINGHAMIA:
                return TEXTURE_CUNNINGHAMIA;
            case CYPRESS:
                return TEXTURE_CYPRESS;
            case CZEKANOWSKIA:
                return TEXTURE_CZEKANOWSKIA;
            case DAWN_REDWOOD:
                return TEXTURE_DAWN_REDWOOD;
            case DEAD:
                return TEXTURE_DEAD;
            case DIAPHORODENDRON:
                return TEXTURE_DIAPHORODENDRON;
            case DICROIDIUM_F:
                return TEXTURE_DICROIDIUM_F;
            case DICROIDIUM_O:
                return TEXTURE_DICROIDIUM_O;
            case FURCULA:
                return TEXTURE_FURCULA;
            case GANGAMOPTERIS:
                return TEXTURE_GANGAMOPTERIS;
            case GINKGO:
                return TEXTURE_GINKGO;
            case GINKGOITES:
                return TEXTURE_GINKGOITES;
            case GLOSSOPTERIS:
                return TEXTURE_GLOSSOPTERIS;
            case HIRONOIA:
                return TEXTURE_HIRONOIA;
            case HYMENAEA:
                return TEXTURE_HYMENAEA;
            case LEPIDODENDRON:
                return TEXTURE_LEPIDODENDRON;
            case LEPIDOPHLOIOS:
                return TEXTURE_LEPIDOPHLOIOS;
            case LIRIODENDRON:
                return TEXTURE_LIRIODENDRON;
            case MACRONEUROPTERIS:
                return TEXTURE_MACRONEUROPTERIS;
            case MAGNOLIA:
                return TEXTURE_MAGNOLIA;
            case MAPLE:
                return TEXTURE_MAPLE;
            case NOTHOFAGUS:
                return TEXTURE_NOTHOFAGUS;
            case PENTOXYLALES:
                return TEXTURE_PENTOXYLALES;
            case PHOENICOPSIS:
                return TEXTURE_PHOENICOPSIS;
            case PITYS:
                return TEXTURE_PITYS;
            case PLANE:
                return TEXTURE_PLANE;
            case PODOCARP:
                return TEXTURE_PODOCARP;
            case PODOZAMITES:
                return TEXTURE_PODOZAMITES;
            case REDWOOD:
                return TEXTURE_REDWOOD;
            case SCIADOPITYS:
                return TEXTURE_SCIADOPITYS;
            case SCRUBBY_PINE:
                return TEXTURE_SCRUBBY_PINE;
            case SIGILLARIA:
                return TEXTURE_SIGILLARIA;
            case SPHENOBAIERA:
                return TEXTURE_SPHENOBAIERA;
            case SYCAMORE:
                return TEXTURE_SYCAMORE;
            case TAXODIUM:
                return TEXTURE_TAXODIUM;
            case TELEMACHUS:
                return TEXTURE_TELEMACHUS;
            case WALCHIA:
                return TEXTURE_WALCHIA;
            case WOLLEMI:
                return TEXTURE_WOLLEMI;
            case YEW:
                return TEXTURE_YEW;
            case PHOENIX:
                return TEXTURE_PHOENIX;
            case ELATOCLADUS:
                return TEXTURE_ELATOCLADUS;
            case NEHVIZDYELLA:
                return TEXTURE_NEHVIZDYELLA;
            case LAURUS:
                return TEXTURE_LAURUS;
            case CHESTNUT:
                return TEXTURE_CHESTNUT;
            case BISONIA:
                return TEXTURE_BISONIA;
            case EMBOTHRIUM:
                return TEXTURE_EMBOTHRIUM;
            case PAGIOPHYLLUM:
                return TEXTURE_PAGIOPHYLLUM;
            case HIRMERIELLA:
                return TEXTURE_HIRMERIELLA;
            case FIG:
                return TEXTURE_FIG;
            case GOLDEN_LARCH:
                return TEXTURE_GOLDEN_LARCH;
            case ARID_PINE:
                return TEXTURE_ARID_PINE;
            case OLIVE:
                return TEXTURE_OLIVE;
            case CEDAR:
                return TEXTURE_CEDAR;
            case THUJA:
                return TEXTURE_THUJA;
            case LIQUIDAMBAR:
                return TEXTURE_LIQUIDAMBAR;
            case SYNCHYSIDENDRON:
                return TEXTURE_SYNCHYSIDENDRON;
            case DOYLEALES:
                return TEXTURE_DOYLEALES;
            case SATPURAPHYLLUM:
                return TEXTURE_SATPURAPHYLLUM;
            case ULLMANNIA:
                return TEXTURE_ULLMANNIA;
            case BIARMOBAIERA:
                return TEXTURE_BIARMOBAIERA;
            case LEPTOPHLOEUM:
                return TEXTURE_LEPTOPHLOEUM;
            case MIROVIA:
                return TEXTURE_MIROVIA;
            case ALBERTIA:
                return TEXTURE_ALBERTIA;
            case WOODWORTHIA:
                return TEXTURE_WOODWORTHIA;
            case ARBORAMOSA:
                return TEXTURE_ARBORAMOSA;
            case SCHILDERIA:
                return TEXTURE_SCHILDERIA;
            case DRYOPHYLLUM:
                return TEXTURE_DRYOPHYLLUM;
            case BEAUPREA:
                return TEXTURE_BEAUPREA;
            case POPULUS:
                return TEXTURE_POPULUS;
        }
    }
}