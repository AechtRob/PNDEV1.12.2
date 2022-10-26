package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockDisplayWallMount;
import net.lepidodendron.entity.model.entity.*;
import net.lepidodendron.item.ItemRoseFlower;
import net.lepidodendron.item.entities.*;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.ForgeHooksClient;

public class RenderDisplayWallMount extends TileEntitySpecialRenderer<BlockDisplayWallMount.TileEntityDisplayWallMount> {

    public static final PropertyDirection FACING = BlockDirectional.FACING;
    private static final ResourceLocation TEXTURE_ACANTHODES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acanthodes.png");
    private final ModelAcanthodes modelAcanthodes;
    private static final ResourceLocation TEXTURE_ACROLEPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acrolepis.png");
    private final ModelAcrolepis modelAcrolepis;
    private static final ResourceLocation TEXTURE_AEGIROCASSIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aegirocassis.png");
    private final ModelAegirocassis modelAegirocassis;
    private static final ResourceLocation TEXTURE_AKMONISTION = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/akmonistion.png");
    private final ModelAkmonistion modelAkmonistion;
    private static final ResourceLocation TEXTURE_ALBERTONIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/albertonia.png");
    private final ModelAlbertonia modelAlbertonia;
    private static final ResourceLocation TEXTURE_ALLENYPTERUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/allenypterus.png");
    private final ModelAllenypterus modelAllenypterus;
    private static final ResourceLocation TEXTURE_ANTEOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anteosaurus.png");
    private final ModelAnteosaurus modelAnteosaurus;
    private static final ResourceLocation TEXTURE_ANTINEOSTEUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/antineosteus.png");
    private final ModelAntineosteus modelAntineosteus;
    private static final ResourceLocation TEXTURE_ARANDASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/arandaspis.png");
    private final ModelArandaspis modelArandaspis;
    private static final ResourceLocation TEXTURE_ARCHOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archosaurus.png");
    private final ModelArchosaurus modelArchosaurus;
    private static final ResourceLocation TEXTURE_ARIZONASAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/arizonasaurus.png");
    private final ModelArizonasaurus modelArizonasaurus;
    private static final ResourceLocation TEXTURE_ASTRASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/astraspis.png");
    private final ModelAstraspis modelAstraspis;
    private static final ResourceLocation TEXTURE_ATELEASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ateleaspis.png");
    private final ModelAteleaspis modelAteleaspis;
    private static final ResourceLocation TEXTURE_ATOPODENTATUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/atopodentatus.png");
    private final ModelAtopodentatus modelAtopodentatus;
    private static final ResourceLocation TEXTURE_BANDRINGA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bandringa.png");
    private final ModelBandringa modelBandringa;
    private static final ResourceLocation TEXTURE_BARAMEDA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/barameda.png");
    private final ModelBarameda modelBarameda;
    private static final ResourceLocation TEXTURE_BARBCLABORNIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/barbclabornia.png");
    private final ModelBarbclabornia modelBarbclabornia;
    private static final ResourceLocation TEXTURE_BATRACHOTOMUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/batrachotomus.png");
    private final ModelBatrachotomus modelBatrachotomus;
    private static final ResourceLocation TEXTURE_BEISHANICHTHYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/beishanichthys.png");
    private final ModelBeishanichthys modelBeishanichthys;
    private static final ResourceLocation TEXTURE_BELANTSEA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/belantsea.png");
    private final ModelBelantsea modelBelantsea;
    private static final ResourceLocation TEXTURE_BESANOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/besanosaurus.png");
    private final ModelBesanosaurus modelBesanosaurus;
    private static final ResourceLocation TEXTURE_BIRGERIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/birgeria.png");
    private final ModelBirgeria modelBirgeria;
    private static final ResourceLocation TEXTURE_BIRKENIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/birkenia.png");
    private final ModelBirkenia modelBirkenia;
    private static final ResourceLocation TEXTURE_BLOURUGIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/blourugia.png");
    private final ModelBlourugia modelBlourugia;
    private static final ResourceLocation TEXTURE_BOBASATRANIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bobasatrania.png");
    private final ModelBobasatrania modelBobasatrania;
    private static final ResourceLocation TEXTURE_BOOTHIASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/boothiaspis.png");
    private final ModelBoothiaspis modelBoothiaspis;
    private static final ResourceLocation TEXTURE_BOTHRIOLEPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bothriolepis.png");
    private final ModelBothriolepis modelBothriolepis;
    private static final ResourceLocation TEXTURE_BREMBODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/brembodus.png");
    private final ModelBrembodus modelBrembodus;
    private static final ResourceLocation TEXTURE_BROCHOADMONES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/brochoadmones_static.png");
    private final ModelBrochoadmones modelBrochoadmones;
    private static final ResourceLocation TEXTURE_BUNOSTEGOS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bunostegos.png");
    private final ModelBunostegos modelBunostegos;
    private static final ResourceLocation TEXTURE_CAMPBELLODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/campbellodus.png");
    private final ModelCampbellodus modelCampbellodus;
    private static final ResourceLocation TEXTURE_CAROLOWILHELMINA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/carolowilhelmina.png");
    private final ModelCarolowilhelmina modelCarolowilhelmina;
    private static final ResourceLocation TEXTURE_CATURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/caturus.png");
    private final ModelCaturus modelCaturus;
    private static final ResourceLocation TEXTURE_CEPHALASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cephalaspis.png");
    private final ModelCephalaspis modelCephalaspis;
    private static final ResourceLocation TEXTURE_CERATODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ceratodus.png");
    private final ModelCeratodus modelCeratodus;
    private static final ResourceLocation TEXTURE_CHINLEA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/chinlea.png");
    private final ModelChinlea modelChinlea;
    private static final ResourceLocation TEXTURE_CLADOSELACHE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cladoselache.png");
    private final ModelCladoselache modelCladoselache;
    private static final ResourceLocation TEXTURE_CLYDAGNATHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/clydagnathus.png");
    private final ModelClydagnathus modelClydagnathus;
    private static final ResourceLocation TEXTURE_COBELODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cobelodus.png");
    private final ModelCobelodus modelCobelodus;
    private static final ResourceLocation TEXTURE_COCCOSTEUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/coccosteus.png");
    private final ModelCoccosteus modelCoccosteus;
    private static final ResourceLocation TEXTURE_COELACANTHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/coelacanthus.png");
    private final ModelCoelacanthus modelCoelacanthus;
    private static final ResourceLocation TEXTURE_COELOPHYSIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/coelophysis.png");
    private final ModelCoelophysis modelCoelophysis;
    private static final ResourceLocation TEXTURE_COELUROSAURAVUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/coelurosauravus.png");
    private final ModelWeigeltisaurid modelWeigeltisaurid;
    private static final ResourceLocation TEXTURE_COTYLORHYNCHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cotylorhynchus.png");
    private final ModelCotylorhynchus modelCotylorhynchus;
    private static final ResourceLocation TEXTURE_CRASSIGYRINUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/crassigyrinus.png");
    private final ModelCrassigyrinus modelCrassigyrinus;
    private static final ResourceLocation TEXTURE_CTENOSPONDYLUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ctenospondylus.png");
    private final ModelCtenospondylus modelCtenospondylus;
    private static final ResourceLocation TEXTURE_CYMBOSPONDYLUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cymbospondylus.png");
    private final ModelCymbospondylus modelCymbospondylus;
    private static final ResourceLocation TEXTURE_CYNOGNATHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cynognathus.png");
    private final ModelCynognathus modelCynognathus;
    private static final ResourceLocation TEXTURE_DAEDALICHTHYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/daedalichthys.png");
    private final ModelDaedalichthys modelDaedalichthys;
    private static final ResourceLocation TEXTURE_DAPEDIUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dapedium.png");
    private final ModelDapedium modelDapedium;
    private static final ResourceLocation TEXTURE_DELTOPTYCHIUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/deltoptychius.png");
    private final ModelDeltoptychius modelDeltoptychius;
    private static final ResourceLocation TEXTURE_DESMATOSUCHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/desmatosuchus.png");
    private final ModelDesmatosuchus modelDesmatosuchus;
    private static final ResourceLocation TEXTURE_DIADECTES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diadectes.png");
    private final ModelDiadectes modelDiadectes;
    private static final ResourceLocation TEXTURE_DIMETRODON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dimetrodon.png");
    private final ModelDimetrodon modelDimetrodon;
    private static final ResourceLocation TEXTURE_DORYASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/doryaspis.png");
    private final ModelDoryaspis modelDoryaspis;
    private static final ResourceLocation TEXTURE_DORYPTERUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dorypterus.png");
    private final ModelDorypterus modelDorypterus;
    private static final ResourceLocation TEXTURE_DRACOPRISTIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dracopristis.png");
    private final ModelDracopristis modelDracopristis;
    private static final ResourceLocation TEXTURE_DREPANASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/drepanaspis.png");
    private final ModelDrepanaspis modelDrepanaspis;
    private static final ResourceLocation TEXTURE_DUNKLEOSTEUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dunkleosteus.png");
    private final ModelDunkleosteus modelDunkleosteus;
    private static final ResourceLocation TEXTURE_EBENAQUA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ebenaqua.png");
    private final ModelEbenaqua modelEbenaqua;
    private static final ResourceLocation TEXTURE_EDAPHOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/edaphosaurus.png");
    private final ModelEdaphosaurus modelEdaphosaurus;
    private static final ResourceLocation TEXTURE_EDESTUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/edestus.png");
    private final ModelEdestus modelEdestus;
    private static final ResourceLocation TEXTURE_EGLONASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eglonaspis.png");
    private final ModelEglonaspis modelEglonaspis;
    private static final ResourceLocation TEXTURE_EORAPTOR = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eoraptor.png");
    private final ModelEoraptor modelEoraptor;
    private static final ResourceLocation TEXTURE_EOSAURICHTHYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eosaurichthys.png");
    private final ModelSaurichthys modelSaurichthys;
    private static final ResourceLocation TEXTURE_ERYOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eryops.png");
    private final ModelEryops modelEryops;
    private static final ResourceLocation TEXTURE_ERYTHROSUCHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/erythrosuchus.png");
    private final ModelErythrosuchus modelErythrosuchus;
    private static final ResourceLocation TEXTURE_ESTEMMENOSUCHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/estemmenosuchus.png");
    private final ModelEstemmenosuchus modelEstemmenosuchus;
    private static final ResourceLocation TEXTURE_EUSTHENOPTERON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eusthenopteron.png");
    private final ModelEusthenopteron modelEusthenopteron;
    private static final ResourceLocation TEXTURE_FADENIAC = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/fadenia_carboniferous.png");
    private static final ResourceLocation TEXTURE_FADENIAPT = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/fadenia_permo_triassic.png");
    private final ModelFadenia modelFadenia;
    private static final ResourceLocation TEXTURE_FALCATUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/falcatus_m.png");
    private final ModelFalcatus modelFalcatus;
    private static final ResourceLocation TEXTURE_FEROXICHTHYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/feroxichthys.png");
    private final ModelFeroxichthys modelFeroxichthys;
    private static final ResourceLocation TEXTURE_FOREYIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/foreyia.png");
    private final ModelForeyia modelForeyia;
    private static final ResourceLocation TEXTURE_FURCACAUDA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/furcacauda.png");
    private final ModelFurcacauda modelFurcacauda;
    private static final ResourceLocation TEXTURE_GABREYASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gabreyaspis.png");
    private final ModelGabreyaspis modelGabreyaspis;
    private static final ResourceLocation TEXTURE_GANTAROSTRATASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gantarostrataspis.png");
    private final ModelGantarostrataspis modelGantarostrataspis;
    private static final ResourceLocation TEXTURE_GEMUENDINA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gemuendina.png");
    private final ModelGemuendina modelGemuendina;
    private static final ResourceLocation TEXTURE_GERARUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerarus.png");
    private final ModelGerarus modelGerarus;
    private static final ResourceLocation TEXTURE_GLAURUNG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/glaurung.png");
    private static final ResourceLocation TEXTURE_GNATHORHIZA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gnathorhiza.png");
    private final ModelGnathorhiza modelGnathorhiza;
    private static final ResourceLocation TEXTURE_GORGONOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gorgonops.png");
    private final ModelGorgonops modelGorgonops;
    private static final ResourceLocation TEXTURE_GROENLANDASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/groenlandaspis.png");
    private final ModelGroenlandaspis modelGroenlandaspis;
    private static final ResourceLocation TEXTURE_GYRACANTHIDES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gyracanthides.png");
    private final ModelGyracanthides modelGyracanthides;
    private static final ResourceLocation TEXTURE_HELICOPRION = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/helicoprion.png");
    private final ModelHelicoprion modelHelicoprion;
    private static final ResourceLocation TEXTURE_HEMICYCLASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hemicyclaspis.png");
    private final ModelHemicyclaspis modelHemicyclaspis;
    private static final ResourceLocation TEXTURE_HERRERASAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/herrerasaurus.png");
    private final ModelHerrerasaurus modelHerrerasaurus;
    private static final ResourceLocation TEXTURE_HETEROSTEUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/heterosteus.png");
    private final ModelHeterosteus modelHeterosteus;
    private static final ResourceLocation TEXTURE_HIBERNASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hibernaspis.png");
    private final ModelHibernaspis modelHibernaspis;
    private static final ResourceLocation TEXTURE_HOLONEMA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/holonema.png");
    private final ModelHolonema modelHolonema;
    private static final ResourceLocation TEXTURE_HYBODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hybodus.png");
    private final ModelHybodus modelHybodus;
    private static final ResourceLocation TEXTURE_HYNERIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hyneria.png");
    private final ModelHyneria modelHyneria;
    private static final ResourceLocation TEXTURE_HYPERODAPEDON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hyperodapedon.png");
    private final ModelHyperodapedon modelHyperodapedon;
    private static final ResourceLocation TEXTURE_INIOPTERYX = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/iniopteryx.png");
    private final ModelIniopteryx modelIniopteryx;
    private static final ResourceLocation TEXTURE_INOSTRANCEVIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/inostrancevia.png");
    private final ModelInostrancevia modelInostrancevia;
    private static final ResourceLocation TEXTURE_JANASSA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/janassa.png");
    private final ModelJanassa modelJanassa;
    private static final ResourceLocation TEXTURE_JONKERIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jonkeria.png");
    private final ModelJonkeria modelJonkeria;
    private static final ResourceLocation TEXTURE_KAIBABVENATOR = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kaibabvenator.png");
    private final ModelKaibabvenator modelKaibabvenator;
    private static final ResourceLocation TEXTURE_LACCOGNATHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/laccognathus.png");
    private final ModelLaccognathus modelLaccognathus;
    private static final ResourceLocation TEXTURE_LAMINACARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/laminacaris.png");
    private final ModelLaminacaris modelLaminacaris;
    private static final ResourceLocation TEXTURE_LEBACHACANTHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lebachacanthus.png");
    private final ModelLebachacanthus modelLebachacanthus;
    private static final ResourceLocation TEXTURE_LESSEMSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lessemsaurus.png");
    private final ModelLessemsaurus modelLessemsaurus;
    private static final ResourceLocation TEXTURE_LILIENSTERNUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/liliensternus.png");
    private final ModelLiliensternus modelLiliensternus;
    private static final ResourceLocation TEXTURE_LIMNOSCELIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/limnoscelis.png");
    private final ModelLimnoscelis modelLimnoscelis;
    private static final ResourceLocation TEXTURE_LISOWICIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lisowicia.png");
    private final ModelLisowicia modelLisowicia;
    private static final ResourceLocation TEXTURE_LISTRACANTHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/listracanthus.png");
    private final ModelListracanthus modelListracanthus;
    private static final ResourceLocation TEXTURE_LONCHIDION = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lonchidion.png");
    private final ModelLonchidion modelLonchidion;
    private static final ResourceLocation TEXTURE_LOTOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lotosaurus.png");
    private final ModelLotosaurus modelLotosaurus;
    private static final ResourceLocation TEXTURE_LUNASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lunaspis.png");
    private final ModelLunaspis modelLunaspis;
    private static final ResourceLocation TEXTURE_LUNGMENSHANASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lungmenshanaspis.png");
    private final ModelLungmenshanaspis modelLungmenshanaspis;
    private static final ResourceLocation TEXTURE_LUOXIONGICHTHYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/luoxiongichthys.png");
    private final ModelLuoxiongichthys modelLuoxiongichthys;
    private static final ResourceLocation TEXTURE_LYSTROSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lystrosaurus.png");
    private final ModelLystrosaurus modelLystrosaurus;
    private static final ResourceLocation TEXTURE_MASTODONSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mastodonsaurus.png");
    private final ModelMastodonsaurus modelMastodonsaurus;
    private static final ResourceLocation TEXTURE_MCNAMARASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mcnamaraspis.png");
    private final ModelMcnamaraspis modelMcnamaraspis;
    private static final ResourceLocation TEXTURE_MEGACTENOPETALUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megactenopetalus.png");
    private final ModelMegactenopetalus modelMegactenopetalus;
    private static final ResourceLocation TEXTURE_MEGALOGRAPTUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megalograptus.png");
    private final ModelMegalograptus modelMegalograptus;
    private static final ResourceLocation TEXTURE_MELOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/melosaurus.png");
    private final ModelMelosaurus modelMelosaurus;
    private static final ResourceLocation TEXTURE_MENASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/menaspis.png");
    private final ModelMenaspis modelMenaspis;
    private static final ResourceLocation TEXTURE_METOPOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/metoposaurus.png");
    private final ModelMetoposaurus modelMetoposaurus;
    private static final ResourceLocation TEXTURE_MIXOPTERUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mixopterus.png");
    private final ModelMixopterus modelMixopterus;
    private static final ResourceLocation TEXTURE_MOSCHOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/moschops.png");
    private final ModelMoschops modelMoschops;
    private static final ResourceLocation TEXTURE_MUSSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mussaurus.png");
    private final ModelMussaurus modelMussaurus;
    private static final ResourceLocation TEXTURE_NOTHOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nothosaurus.png");
    private final ModelNothosaurus modelNothosaurus;
    private static final ResourceLocation TEXTURE_ONYCHODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/onychodus.png");
    private final ModelOnychodus modelOnychodus;
    private static final ResourceLocation TEXTURE_OPHIACODON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ophiacodon.png");
    private final ModelOphiacodon modelOphiacodon;
    private static final ResourceLocation TEXTURE_ORODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/orodus.png");
    private final ModelOrodus modelOrodus;
    private static final ResourceLocation TEXTURE_ORNITHOPRION = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ornithoprion.png");
    private final ModelOrnithoprion modelOrnithoprion;
    private static final ResourceLocation TEXTURE_OSTEOLEPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/osteolepis.png");
    private final ModelOsteolepis modelOsteolepis;
    private static final ResourceLocation TEXTURE_PALAEONISCUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeoniscum.png");
    private final ModelPalaeoniscum modelPalaeoniscum;
    private static final ResourceLocation TEXTURE_PANDERICHTHYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/panderichthys.png");
    private final ModelPanderichthys modelPanderichthys;
    private static final ResourceLocation TEXTURE_PANDERODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/panderodus.png");
    private final ModelPanderodus modelPanderodus;
    private static final ResourceLocation TEXTURE_PARANAICHTHYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paranaichthys.png");
    private final ModelParanaichthys modelParanaichthys;
    private static final ResourceLocation TEXTURE_PARATARRASIUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paratarrasius.png");
    private final ModelParatarrasius modelParatarrasius;
    private static final ResourceLocation TEXTURE_PAREXUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parexus.png");
    private final ModelParexus modelParexus;
    private static final ResourceLocation TEXTURE_PARHYBODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parhybodus.png");
    private static final ResourceLocation TEXTURE_PELURGASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pelurgaspis.png");
    private final ModelPelurgaspis modelPelurgaspis;
    private static final ResourceLocation TEXTURE_PHARYNGOLEPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pharyngolepis.png");
    private final ModelPharyngolepis modelPharyngolepis;
    private static final ResourceLocation TEXTURE_PHOLIDERPETON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pholiderpeton.png");
    private final ModelPholiderpeton modelPholiderpeton;
    private static final ResourceLocation TEXTURE_PLACERIAS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/placerias.png");
    private final ModelPlacerias modelPlacerias;
    private static final ResourceLocation TEXTURE_PLACODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/placodus.png");
    private final ModelPlacodus modelPlacodus;
    private static final ResourceLocation TEXTURE_PLATEOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/plateosaurus.png");
    private final ModelPlateosaurus modelPlateosaurus;
    private static final ResourceLocation TEXTURE_PLATYCARASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/platycaraspis.png");
    private final ModelPlatycaraspis modelPlatycaraspis;
    private static final ResourceLocation TEXTURE_PLATYLOMASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/platylomaspis.png");
    private final ModelPlatylomaspis modelPlatylomaspis;
    private static final ResourceLocation TEXTURE_PLATYSOMUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/platysomus.png");
    private final ModelPlatysomus modelPlatysomus;
    private static final ResourceLocation TEXTURE_POPOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/poposaurus.png");
    private final ModelPoposaurus modelPoposaurus;
    private static final ResourceLocation TEXTURE_PORASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/poraspis.png");
    private final ModelPoraspis modelPoraspis;
    private static final ResourceLocation TEXTURE_POSTOSUCHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/postosuchus.png");
    private final ModelPostosuchus modelPostosuchus;
    private static final ResourceLocation TEXTURE_PRIONOSUCHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/prionosuchus.png");
    private final ModelPrionosuchus modelPrionosuchus;
    private static final ResourceLocation TEXTURE_PRISTEROGNATHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pristerognathus.png");
    private final ModelPristerognathus modelPristerognathus;
    private static final ResourceLocation TEXTURE_PROMISSUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/promissum.png");
    private final ModelPromissum modelPromissum;
    private static final ResourceLocation TEXTURE_PSAROLEPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/psarolepis.png");
    private final ModelPsarolepis modelPsarolepis;
    private static final ResourceLocation TEXTURE_PTERASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pteraspis.png");
    private final ModelPteraspis modelPteraspis;
    private static final ResourceLocation TEXTURE_PYGOPTERUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pygopterus.png");
    private final ModelPygopterus modelPygopterus;
    private static final ResourceLocation TEXTURE_QILINYU = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/qilinyu.png");
    private final ModelQilinyu modelQilinyu;
    private static final ResourceLocation TEXTURE_RAUTIANIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rautiania.png");
    private static final ResourceLocation TEXTURE_REBELLATRIX = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rebellatrix.png");
    private final ModelRebellatrix modelRebellatrix;
    private static final ResourceLocation TEXTURE_RHIZODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhizodus.png");
    private final ModelRhizodus modelRhizodus;
    private static final ResourceLocation TEXTURE_SACABAMBASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sacabambaspis.png");
    private final ModelSacabambaspis modelSacabambaspis;
    private static final ResourceLocation TEXTURE_SAIVODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/saivodus.png");
    private final ModelSaivodus modelSaivodus;
    private static final ResourceLocation TEXTURE_SAURICHTHYS_M = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/saurichthys_marine.png");
    private static final ResourceLocation TEXTURE_SAURICHTHYS_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/saurichthys_freshwater.png");
    private static final ResourceLocation TEXTURE_SAUROCTONUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sauroctonus.png");
    private final ModelSauroctonus modelSauroctonus;
    private static final ResourceLocation TEXTURE_SAUROSUCHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/saurosuchus.png");
    private final ModelSaurosuchus modelSaurosuchus;
    private static final ResourceLocation TEXTURE_SCAUMENACIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scaumenacia.png");
    private final ModelScaumenacia modelScaumenacia;
    private static final ResourceLocation TEXTURE_SCUTOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scutosaurus.png");
    private final ModelScutosaurus modelScutosaurus;
    private static final ResourceLocation TEXTURE_SEMIONOTUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/semionotus.png");
    private final ModelSemionotus modelSemionotus;
    private static final ResourceLocation TEXTURE_SHONISAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/shonisaurus.png");
    private final ModelShonisaurus modelShonisaurus;
    private static final ResourceLocation TEXTURE_SPHENACODON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sphenacodon.png");
    private final ModelSphenacodon modelSphenacodon;
    private static final ResourceLocation TEXTURE_SQUATINACTIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/squatinactis.png");
    private final ModelSquatinactis modelSquatinactis;
    private static final ResourceLocation TEXTURE_STAGONOLEPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stagonolepis.png");
    private final ModelStagonolepis modelStagonolepis;
    private static final ResourceLocation TEXTURE_STENSIOELLA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stensioella.png");
    private final ModelStensioella modelStensioella;
    private static final ResourceLocation TEXTURE_SHRINGASAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/shringasaurus_m.png");
    private final ModelShringasaurus modelShringasaurus;
    private static final ResourceLocation TEXTURE_SILLOSUCHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sillosuchus.png");
    private final ModelSillosuchus modelSillosuchus;
    private static final ResourceLocation TEXTURE_SMILOSUCHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/smilosuchus.png");
    private final ModelSmilosuchus modelSmilosuchus;
    private static final ResourceLocation TEXTURE_SMOK = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/smok.png");
    private final ModelSmok modelSmok;
    private static final ResourceLocation TEXTURE_TANYSTROPHEUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tanystropheus.png");
    private final ModelTanystropheus modelTanystropheus;
    private static final ResourceLocation TEXTURE_TAPINOCEPHALUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tapinocephalus.png");
    private final ModelTapinocephalus modelTapinocephalus;
    private static final ResourceLocation TEXTURE_TARTUOSTEUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tartuosteus.png");
    private final ModelTartuosteus modelTartuosteus;
    private static final ResourceLocation TEXTURE_THECODONTOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/thecodontosaurus.png");
    private final ModelThecodontosaurus modelThecodontosaurus;
    private static final ResourceLocation TEXTURE_THELODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/thelodus.png");
    private final ModelThelodus modelThelodus;
    private static final ResourceLocation TEXTURE_THRINACODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/thrinacodus.png");
    private final ModelThrinacodus modelThrinacodus;
    private static final ResourceLocation TEXTURE_TITANICHTHYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanichthys.png");
    private final ModelTitanicthys modelTitanicthys;
    private static final ResourceLocation TEXTURE_TORPEDASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/torpedaspis.png");
    private final ModelTorpedaspis modelTorpedaspis;
    private static final ResourceLocation TEXTURE_TRAQUAIRIUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/traquairius.png");
    private final ModelTraquairius modelTraquairius;
    private static final ResourceLocation TEXTURE_TULLIMONSTRUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tullimonstrum.png");
    private final ModelTullimonstrum modelTullimonstrum;
    private static final ResourceLocation TEXTURE_TURRISASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/turrisaspis.png");
    private final ModelTurrisaspis modelTurrisaspis;
    private static final ResourceLocation TEXTURE_URANOCENTRODON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/uranocentrodon.png");
    private final ModelUranocentrodon modelUranocentrodon;
    private static final ResourceLocation TEXTURE_UROSTHENES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/urosthenes.png");
    private final ModelUrosthenes modelUrosthenes;
    private static final ResourceLocation TEXTURE_VANCLEAVEA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vancleavea.png");
    private final ModelVancleavea modelVancleavea;
    private static final ResourceLocation TEXTURE_VARIALEPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/varialepis.png");
    private final ModelVarialepis modelVarialepis;
    private static final ResourceLocation TEXTURE_VIVAXOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vivaxosaurus.png");
    private final ModelVivaxosaurus modelVivaxosaurus;
    private static final ResourceLocation TEXTURE_WEIGELTISAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/weigeltisaurus.png");
    private static final ResourceLocation TEXTURE_XENACANTHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/xenacanthus.png");
    private final ModelXenacanthus modelXenacanthus;
    private static final ResourceLocation TEXTURE_XINPUSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/xinpusaurus.png");
    private final ModelXinpusaurus modelXinpusaurus;
    private static final ResourceLocation TEXTURE_YUNGUISAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yunguisaurus.png");
    private final ModelYunguisaurus modelYunguisaurus;



    public RenderDisplayWallMount() {
        this.modelAcanthodes = new ModelAcanthodes();
        this.modelAcrolepis = new ModelAcrolepis();
        this.modelAegirocassis = new ModelAegirocassis();
        this.modelAkmonistion = new ModelAkmonistion();
        this.modelAlbertonia = new ModelAlbertonia();
        this.modelAllenypterus = new ModelAllenypterus();
        this.modelAnteosaurus = new ModelAnteosaurus();
        this.modelAntineosteus = new ModelAntineosteus();
        this.modelArandaspis = new ModelArandaspis();
        this.modelArchosaurus = new ModelArchosaurus();
        this.modelArizonasaurus = new ModelArizonasaurus();
        this.modelAstraspis= new ModelAstraspis();
        this.modelAteleaspis= new ModelAteleaspis();
        this.modelAtopodentatus= new ModelAtopodentatus();
        this.modelBandringa = new ModelBandringa();
        this.modelBarameda = new ModelBarameda();
        this.modelBarbclabornia = new ModelBarbclabornia();
        this.modelBatrachotomus = new ModelBatrachotomus();
        this.modelBeishanichthys = new ModelBeishanichthys();
        this.modelBelantsea = new ModelBelantsea();
        this.modelBesanosaurus = new ModelBesanosaurus();
        this.modelBirgeria = new ModelBirgeria();
        this.modelBirkenia = new ModelBirkenia();
        this.modelBlourugia = new ModelBlourugia();
        this.modelBobasatrania = new ModelBobasatrania();
        this.modelBoothiaspis = new ModelBoothiaspis();
        this.modelBothriolepis = new ModelBothriolepis();
        this.modelBrembodus = new ModelBrembodus();
        this.modelBrochoadmones = new ModelBrochoadmones();
        this.modelBunostegos = new ModelBunostegos();
        this.modelCampbellodus = new ModelCampbellodus();
        this.modelCarolowilhelmina = new ModelCarolowilhelmina();
        this.modelCaturus = new ModelCaturus();
        this.modelCephalaspis = new ModelCephalaspis();
        this.modelCeratodus = new ModelCeratodus();
        this.modelChinlea = new ModelChinlea();
        this.modelCladoselache = new ModelCladoselache();
        this.modelClydagnathus = new ModelClydagnathus();
        this.modelCobelodus = new ModelCobelodus();
        this.modelCoccosteus = new ModelCoccosteus();
        this.modelCoelacanthus = new ModelCoelacanthus();
        this.modelCoelophysis = new ModelCoelophysis();
        this.modelWeigeltisaurid = new ModelWeigeltisaurid();
        this.modelCotylorhynchus = new ModelCotylorhynchus();
        this.modelCrassigyrinus = new ModelCrassigyrinus();
        this.modelCtenospondylus = new ModelCtenospondylus();
        this.modelCymbospondylus = new ModelCymbospondylus();
        this.modelCynognathus = new ModelCynognathus();
        this.modelDaedalichthys = new ModelDaedalichthys();
        this.modelDapedium = new ModelDapedium();
        this.modelDeltoptychius = new ModelDeltoptychius();
        this.modelDesmatosuchus = new ModelDesmatosuchus();
        this.modelDiadectes = new ModelDiadectes();
        this.modelDimetrodon = new ModelDimetrodon();
        this.modelDoryaspis = new ModelDoryaspis();
        this.modelDorypterus = new ModelDorypterus();
        this.modelDracopristis = new ModelDracopristis();
        this.modelDrepanaspis = new ModelDrepanaspis();
        this.modelDunkleosteus = new ModelDunkleosteus();
        this.modelEbenaqua = new ModelEbenaqua();
        this.modelEdaphosaurus = new ModelEdaphosaurus();
        this.modelEdestus = new ModelEdestus();
        this.modelEglonaspis = new ModelEglonaspis();
        this.modelEoraptor = new ModelEoraptor();
        this.modelEryops = new ModelEryops();
        this.modelErythrosuchus = new ModelErythrosuchus();
        this.modelEstemmenosuchus = new ModelEstemmenosuchus();
        this.modelEusthenopteron = new ModelEusthenopteron();
        this.modelFadenia = new ModelFadenia();
        this.modelFalcatus = new ModelFalcatus();
        this.modelFeroxichthys = new ModelFeroxichthys();
        this.modelForeyia = new ModelForeyia();
        this.modelFurcacauda = new ModelFurcacauda();
        this.modelGabreyaspis = new ModelGabreyaspis();
        this.modelGantarostrataspis = new ModelGantarostrataspis();
        this.modelGemuendina = new ModelGemuendina();
        this.modelGerarus = new ModelGerarus();
        this.modelGnathorhiza = new ModelGnathorhiza();
        this.modelGorgonops = new ModelGorgonops();
        this.modelGroenlandaspis = new ModelGroenlandaspis();
        this.modelGyracanthides = new ModelGyracanthides();
        this.modelHelicoprion = new ModelHelicoprion();
        this.modelHemicyclaspis = new ModelHemicyclaspis();
        this.modelHerrerasaurus = new ModelHerrerasaurus();
        this.modelHeterosteus = new ModelHeterosteus();
        this.modelHibernaspis = new ModelHibernaspis();
        this.modelHolonema = new ModelHolonema();
        this.modelHybodus = new ModelHybodus();
        this.modelHyneria = new ModelHyneria();
        this.modelHyperodapedon = new ModelHyperodapedon();
        this.modelIniopteryx = new ModelIniopteryx();
        this.modelInostrancevia = new ModelInostrancevia();
        this.modelJanassa = new ModelJanassa();
        this.modelJonkeria = new ModelJonkeria();
        this.modelKaibabvenator = new ModelKaibabvenator();
        this.modelLaccognathus = new ModelLaccognathus();
        this.modelLaminacaris = new ModelLaminacaris();
        this.modelLebachacanthus = new ModelLebachacanthus();
        this.modelLessemsaurus = new ModelLessemsaurus();
        this.modelLiliensternus = new ModelLiliensternus();
        this.modelLimnoscelis = new ModelLimnoscelis();
        this.modelLisowicia = new ModelLisowicia();
        this.modelListracanthus = new ModelListracanthus();
        this.modelLonchidion = new ModelLonchidion();
        this.modelLotosaurus = new ModelLotosaurus();
        this.modelLunaspis = new ModelLunaspis();
        this.modelLungmenshanaspis = new ModelLungmenshanaspis();
        this.modelLuoxiongichthys = new ModelLuoxiongichthys();
        this.modelLystrosaurus = new ModelLystrosaurus();
        this.modelMastodonsaurus = new ModelMastodonsaurus();
        this.modelMcnamaraspis = new ModelMcnamaraspis();
        this.modelMegactenopetalus = new ModelMegactenopetalus();
        this.modelMegalograptus = new ModelMegalograptus();
        this.modelMelosaurus = new ModelMelosaurus();
        this.modelMenaspis = new ModelMenaspis();
        this.modelMetoposaurus = new ModelMetoposaurus();
        this.modelMixopterus = new ModelMixopterus();
        this.modelMoschops = new ModelMoschops();
        this.modelMussaurus = new ModelMussaurus();
        this.modelNothosaurus = new ModelNothosaurus();
        this.modelOnychodus = new ModelOnychodus();
        this.modelOphiacodon = new ModelOphiacodon();
        this.modelOrodus = new ModelOrodus();
        this.modelOrnithoprion = new ModelOrnithoprion();
        this.modelOsteolepis = new ModelOsteolepis();
        this.modelPalaeoniscum = new ModelPalaeoniscum();
        this.modelPanderichthys = new ModelPanderichthys();
        this.modelPanderodus = new ModelPanderodus();
        this.modelParanaichthys = new ModelParanaichthys();
        this.modelParatarrasius = new ModelParatarrasius();
        this.modelParexus = new ModelParexus();
        this.modelPelurgaspis = new ModelPelurgaspis();
        this.modelPharyngolepis = new ModelPharyngolepis();
        this.modelPholiderpeton = new ModelPholiderpeton();
        this.modelPlacerias = new ModelPlacerias();
        this.modelPlacodus = new ModelPlacodus();
        this.modelPlateosaurus = new ModelPlateosaurus();
        this.modelPlatycaraspis = new ModelPlatycaraspis();
        this.modelPlatylomaspis = new ModelPlatylomaspis();
        this.modelPlatysomus = new ModelPlatysomus();
        this.modelPoposaurus = new ModelPoposaurus();
        this.modelPoraspis = new ModelPoraspis();
        this.modelPostosuchus = new ModelPostosuchus();
        this.modelPrionosuchus = new ModelPrionosuchus();
        this.modelPristerognathus = new ModelPristerognathus();
        this.modelPromissum = new ModelPromissum();
        this.modelPsarolepis = new ModelPsarolepis();
        this.modelPteraspis = new ModelPteraspis();
        this.modelPygopterus = new ModelPygopterus();
        this.modelQilinyu = new ModelQilinyu();
        this.modelRebellatrix = new ModelRebellatrix();
        this.modelRhizodus = new ModelRhizodus();
        this.modelSacabambaspis = new ModelSacabambaspis();
        this.modelSaivodus = new ModelSaivodus();
        this.modelSauroctonus = new ModelSauroctonus();
        this.modelSaurosuchus = new ModelSaurosuchus();
        this.modelSaurichthys = new ModelSaurichthys();
        this.modelScaumenacia = new ModelScaumenacia();
        this.modelScutosaurus = new ModelScutosaurus();
        this.modelSemionotus = new ModelSemionotus();
        this.modelShonisaurus = new ModelShonisaurus();
        this.modelShringasaurus = new ModelShringasaurus();
        this.modelSillosuchus = new ModelSillosuchus();
        this.modelSmilosuchus = new ModelSmilosuchus();
        this.modelSmok = new ModelSmok();
        this.modelSphenacodon = new ModelSphenacodon();
        this.modelSquatinactis = new ModelSquatinactis();
        this.modelStagonolepis = new ModelStagonolepis();
        this.modelStensioella = new ModelStensioella();
        this.modelTanystropheus = new ModelTanystropheus();
        this.modelTapinocephalus = new ModelTapinocephalus();
        this.modelTartuosteus = new ModelTartuosteus();
        this.modelThecodontosaurus = new ModelThecodontosaurus();
        this.modelThelodus = new ModelThelodus();
        this.modelThrinacodus = new ModelThrinacodus();
        this.modelTitanicthys = new ModelTitanicthys();
        this.modelTorpedaspis = new ModelTorpedaspis();
        this.modelTraquairius = new ModelTraquairius();
        this.modelTullimonstrum = new ModelTullimonstrum();
        this.modelTurrisaspis = new ModelTurrisaspis();
        this.modelUranocentrodon = new ModelUranocentrodon();
        this.modelUrosthenes = new ModelUrosthenes();
        this.modelVancleavea = new ModelVancleavea();
        this.modelVarialepis = new ModelVarialepis();
        this.modelVivaxosaurus = new ModelVivaxosaurus();
        this.modelXenacanthus = new ModelXenacanthus();
        this.modelXinpusaurus = new ModelXinpusaurus();
        this.modelYunguisaurus = new ModelYunguisaurus();
    }

    @Override
    public void render(BlockDisplayWallMount.TileEntityDisplayWallMount entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        EnumFacing facing;
        boolean itemRender  = false;
        int currentRotation = 0;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);

            TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                if (te instanceof BlockDisplayWallMount.TileEntityDisplayWallMount) {
                    BlockDisplayWallMount.TileEntityDisplayWallMount tee = (BlockDisplayWallMount.TileEntityDisplayWallMount) te;
                    ItemStack itemstack = tee.getStackInSlot(0);
                    if (itemstack.isEmpty()) {
                        return;
                    }

                    /*
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1f);
                    GlStateManager.enableBlend();
                    RenderHelper.enableStandardItemLighting();
                    GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
                    GlStateManager.pushMatrix();
                     */

                    GlStateManager.pushMatrix();
                    GlStateManager.disableCull();
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.enableAlpha();

                    if (itemstack.getItem() == ItemRoseFlower.block) {
                        double offset = 0.12;
                        double voffset = 0.0625;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        this.bindTexture(TEXTURE_GERARUS);
                        modelGerarus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAcanthodesRaw.block) {
                        double offset = 0.04;
                        double voffset = 0.25;
                        double hoffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.35,1.35,1.35);
                        this.bindTexture(TEXTURE_ACANTHODES);
                        modelAcanthodes.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAcrolepisRaw.block) {
                        double offset = 0.04;
                        double voffset = 0.29;
                        double hoffset = 0.14;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.9,1.9,1.9);
                        this.bindTexture(TEXTURE_ACROLEPIS);
                        modelAcrolepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAegirocassisRaw.block) {
                        double offset = 0.25;
                        double voffset = 0.6;
                        double hoffset = -0.4;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 - hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.7,3.7,3.7);
                        this.bindTexture(TEXTURE_AEGIROCASSIS);
                        modelAegirocassis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAkmonistionRaw.block) {
                        double offset = 0.06;
                        double voffset = 0.47;
                        double hoffset = 0.2;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 - hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.1,2.1,2.1);
                        this.bindTexture(TEXTURE_AKMONISTION);
                        modelAkmonistion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAlbertoniaRaw.block) {
                        double offset = 0.06;
                        double voffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1,1,1);
                        this.bindTexture(TEXTURE_ALBERTONIA);
                        modelAlbertonia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAllenypterusRaw.block) {
                        double offset = 0.05;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.9,0.9,0.9);
                        this.bindTexture(TEXTURE_ALLENYPTERUS);
                        modelAllenypterus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAnteosaurusRaw.block) {
                        double offset = -0.5;
                        double voffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(6.5,6.5,6.5);
                        this.bindTexture(TEXTURE_ANTEOSAURUS);
                        modelAnteosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);

                    }
                    else if (itemstack.getItem() == ItemAntineosteusRaw.block) {
                        double offset = 0.1;
                        double voffset = 1;
                        double hoffset = 0.8;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 - hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.8,4.8,4.8);
                        this.bindTexture(TEXTURE_ANTINEOSTEUS);
                        modelAntineosteus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);

                    }
                    else if (itemstack.getItem() == ItemArandaspisRaw.block) {
                        double offset = 0.02;
                        double voffset = 0.07;
                        double hoffset = 0.02;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.5,1.5,1.5);
                        this.bindTexture(TEXTURE_ARANDASPIS);
                        modelArandaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemArchosaurusRaw.block) {
                        double offset = -0.15;
                        double voffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.6,1.6,1.6);
                        this.bindTexture(TEXTURE_ARCHOSAURUS);
                        modelArchosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemArizonasaurusRaw.block) {
                        double offset = -0.28;
                        double voffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3,3,3);
                        this.bindTexture(TEXTURE_ARIZONASAURUS);
                        modelArizonasaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAteleaspisRaw.block) {
                        double offset = 0.46;
                        double voffset = 0.03;
                        double hoffset = 0.05;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.9,1.9,1.9);
                        this.bindTexture(TEXTURE_ATELEASPIS);
                        modelAteleaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAtopodentatusRaw.block) {
                        double offset = -0.5;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.3,2.3,2.3);
                        this.bindTexture(TEXTURE_ATOPODENTATUS);
                        modelAtopodentatus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAstraspisRaw.block) {
                        double offset = 0.24;
                        double voffset = 0;
                        double hoffset = 0.05;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 - hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(2,2,2);
                        this.bindTexture(TEXTURE_ASTRASPIS);
                        modelAstraspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBandringaRaw.block) {
                        double offset = -0.09;
                        double voffset = 0.54;
                        double hoffset = 0.2;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.3,2.3,2.3);
                        this.bindTexture(TEXTURE_BANDRINGA);
                        modelBandringa.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBaramedaRaw.block) {
                        double offset = 0.3;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.4,4.4,4.4);
                        this.bindTexture(TEXTURE_BARAMEDA);
                        modelBarameda.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBarbclaborniaRaw.block) {
                        double offset = -0.76;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(5.3,5.3,5.3);
                        this.bindTexture(TEXTURE_BARBCLABORNIA);
                        modelBarbclabornia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBatrachotomusRaw.block) {
                        double offset = -0.68;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(6.1,6.1,6.1);
                        this.bindTexture(TEXTURE_BATRACHOTOMUS);
                        modelBatrachotomus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBeishanichthysRaw.block) {
                        double offset = 0.07;
                        //double voffset = 0.7;
                        double voffset = 0;
                        double hoffset = 0.08;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.06,0.06,0.06);
                        this.bindTexture(TEXTURE_BEISHANICHTHYS);
                        modelBeishanichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBelantseaRaw.block) {
                        double offset = 0.07;
                        double voffset = 0.03;
                        double hoffset = 0.06;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.1,2.1,2.1);
                        this.bindTexture(TEXTURE_BELANTSEA);
                        modelBelantsea.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBesanosaurusRaw.block) {
                        double offset = 1.14;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(7.4,7.4,7.4);
                        this.bindTexture(TEXTURE_BESANOSAURUS);
                        modelBesanosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBirgeriaRaw.block) {
                        double offset = -0.12;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.5,3.5,3.5);
                        this.bindTexture(TEXTURE_BIRGERIA);
                        modelBirgeria.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBirkeniaRaw.block) {
                        double offset = 0.04;
                        double voffset = 0.21;
                        double hoffset = 0.04;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.2,1.2,1.2);
                        this.bindTexture(TEXTURE_BIRKENIA);
                        modelBirkenia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBlourugiaRaw.block) {
                        double offset = 0.08;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.9,0.9,0.9);
                        this.bindTexture(TEXTURE_BLOURUGIA);
                        modelBlourugia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBobasatraniaRaw.block) {
                        double offset = 0.23;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4,4,4);
                        this.bindTexture(TEXTURE_BOBASATRANIA);
                        modelBobasatrania.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBoothiaspisRaw.block) {
                        double offset = 0.38;
                        double voffset = 0;
                        double hoffset = 0.05;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 - hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.6,1.6,1.6);
                        this.bindTexture(TEXTURE_BOOTHIASPIS);
                        modelBoothiaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBothriolepisRaw.block) {
                        double offset = 0.56;
                        double voffset = 0.03;
                        double hoffset = 0.22;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(2.4,2.4,2.4);
                        this.bindTexture(TEXTURE_BOTHRIOLEPIS);
                        modelBothriolepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBrembodusRaw.block) {
                        double offset = 0.03;
                        double voffset = 0.1;
                        double hoffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1,1,1);
                        this.bindTexture(TEXTURE_BREMBODUS);
                        modelBrembodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBrochoadmonesRaw.block) {
                        double offset = -0.02;
                        double voffset = 0.1;
                        double hoffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.7,0.7,0.7);
                        this.bindTexture(TEXTURE_BROCHOADMONES);
                        modelBrochoadmones.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBunostegosRaw.block) {
                        double offset = -0.21;
                        double voffset = 0.2;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.8,4.8,4.8);
                        this.bindTexture(TEXTURE_BUNOSTEGOS);
                        modelBunostegos.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCampbellodusRaw.block) {
                        double offset = 0.04;
                        double voffset = 0.08;
                        double hoffset = 0.13;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.1,1.1,1.1);
                        this.bindTexture(TEXTURE_CAMPBELLODUS);
                        modelCampbellodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCarolowilhelminaRaw.block) {
                        double offset = 0.12;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.2,4.2,4.2);
                        this.bindTexture(TEXTURE_CAROLOWILHELMINA);
                        modelCarolowilhelmina.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCaturusRaw.block) {
                        double offset = -0.03;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.6,2.6,2.6);
                        this.bindTexture(TEXTURE_CATURUS);
                        modelCaturus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCephalaspisRaw.block) {
                        double offset = 0.46;
                        double voffset = 0.03;
                        double hoffset = 0.05;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.8,1.8,1.8);
                        this.bindTexture(TEXTURE_CEPHALASPIS);
                        modelCephalaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCeratodusRaw.block) {
                        double offset = 0.04;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4,4,4);
                        this.bindTexture(TEXTURE_CERATODUS);
                        modelCeratodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemChinleaRaw.block) {
                        double offset = 0.04;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.45,1.45,1.45);
                        this.bindTexture(TEXTURE_CHINLEA);
                        modelChinlea.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCladoselacheRaw.block) {
                        double offset = -0.4;
                        double voffset = 0.55;
                        double hoffset = 0.9;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.2,3.2,3.2);
                        this.bindTexture(TEXTURE_CLADOSELACHE);
                        modelCladoselache.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemClydagnathusRaw.block) {
                        double offset = 0.05;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.7,0.7,0.7);
                        this.bindTexture(TEXTURE_CLYDAGNATHUS);
                        modelClydagnathus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCobelodusRaw.block) {
                        double offset = 0.17;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.5,3.5,3.5);
                        this.bindTexture(TEXTURE_COBELODUS);
                        modelCobelodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCoccosteusRaw.block) {
                        double offset = -0.02;
                        double voffset = 0.01;
                        double hoffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.8,0.8,0.8);
                        this.bindTexture(TEXTURE_COCCOSTEUS);
                        modelCoccosteus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCoelacanthusRaw.block) {
                        double offset = 0.03;
                        double voffset = 0.08;
                        double hoffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.8,1.8,1.8);
                        this.bindTexture(TEXTURE_COELACANTHUS);
                        modelCoelacanthus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCoelophysisRaw.block) {
                        double offset = -0.23;
                        double voffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.9,2.9,2.9);
                        this.bindTexture(TEXTURE_COELOPHYSIS);
                        modelCoelophysis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCoelurosauravusRaw.block) {
                        double offset = 0.03;
                        double voffset = 0.03;
                        double hoffset = 0.01;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(0.6,0.6,0.6);
                        this.bindTexture(TEXTURE_COELUROSAURAVUS);
                        modelWeigeltisaurid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCotylorhynchusRaw.block) {
                        double offset = -0.55;
                        double voffset = 0.2;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(6.6,6.6,6.6);
                        this.bindTexture(TEXTURE_COTYLORHYNCHUS);
                        modelCotylorhynchus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCrassigyrinusRaw.block) {
                        double offset = 0.03;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.8,2.8,2.8);
                        this.bindTexture(TEXTURE_CRASSIGYRINUS);
                        modelCrassigyrinus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCtenospondylusRaw.block) {
                        double offset = -0.22;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3,3,3);
                        this.bindTexture(TEXTURE_CTENOSPONDYLUS);
                        modelCtenospondylus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCymbospondylusRaw.block) {
                        double offset = -0.9;
                        double voffset = 0.15;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(8,8,8);
                        this.bindTexture(TEXTURE_CYMBOSPONDYLUS);
                        modelCymbospondylus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCynognathusRaw.block) {
                        double offset = -0.27;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.6,3.6,3.6);
                        this.bindTexture(TEXTURE_CYNOGNATHUS);
                        modelCynognathus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDaedalichthysRaw.block) {
                        double offset = -0.02;
                        double voffset = 0.2;
                        double hoffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.1,1.1,1.1);
                        this.bindTexture(TEXTURE_DAEDALICHTHYS);
                        modelDaedalichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDapediumRaw.block) {
                        double offset = 0.01;
                        double voffset = 0.2;
                        double hoffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 - hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.7,1.7,1.7);
                        this.bindTexture(TEXTURE_DAPEDIUM);
                        modelDapedium.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDeltoptychiusRaw.block) {
                        double offset = -0.03;
                        double voffset = 0;
                        double hoffset = 0.05;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 - hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.8,1.8,1.8);
                        this.bindTexture(TEXTURE_DELTOPTYCHIUS);
                        modelDeltoptychius.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDesmatosuchusRaw.block) {
                        double offset = -0.36;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.1,4.1,4.1);
                        this.bindTexture(TEXTURE_DESMATOSUCHUS);
                        modelDesmatosuchus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDiadectesRaw.block) {
                        double offset = -0.39;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.3,4.3,4.3);
                        this.bindTexture(TEXTURE_DIADECTES);
                        modelDiadectes.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDimetrodonRaw.block) {
                        double offset = -0.28;
                        double voffset = -0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.3,4.3,4.3);
                        this.bindTexture(TEXTURE_DIMETRODON);
                        modelDimetrodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDoryaspisRaw.block) {
                        double offset = 0.23;
                        double voffset = -0.01;
                        double hoffset = 0.02;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1,1,1);
                        this.bindTexture(TEXTURE_DORYASPIS);
                        modelDoryaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDorypterusRaw.block) {
                        double offset = -0.02;
                        double voffset = 0.08;
                        double hoffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.4,0.4,0.4);
                        this.bindTexture(TEXTURE_DORYPTERUS);
                        modelDorypterus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDracopristisRaw.block) {
                        double offset = -0.02;
                        double voffset = 0.7;
                        double hoffset = 0.6;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.4,3.4,3.4);
                        this.bindTexture(TEXTURE_DRACOPRISTIS);
                        modelDracopristis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDrepanaspisRaw.block) {
                        double offset = 0.58;
                        double voffset = 0.03;
                        double hoffset = 0.02;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(2.4,2.4,2.4);
                        this.bindTexture(TEXTURE_DREPANASPIS);
                        modelDrepanaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDunkleosteusRaw.block) {
                        double offset = -1.2;
                        double voffset = 0.3;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(11.5,11.5,11.5);
                        this.bindTexture(TEXTURE_DUNKLEOSTEUS);
                        modelDunkleosteus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEbenaquaRaw.block) {
                        double offset = -0.05;
                        double voffset = 0.05;
                        double hoffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.35,0.35,0.35);
                        this.bindTexture(TEXTURE_EBENAQUA);
                        modelEbenaqua.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEdaphosaurusRaw.block) {
                        double offset = -0.07;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.2,4.2,4.2);
                        this.bindTexture(TEXTURE_EDAPHOSAURUS);
                        modelEdaphosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEdestusRaw.block) {
                        double offset = -1.01;
                        double voffset = 0.3;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(9.3,9.3,9.3);
                        this.bindTexture(TEXTURE_EDESTUS);
                        modelEdestus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEglonaspisRaw.block) {
                        double offset = 1.11;
                        double voffset = 0.01;
                        double hoffset = 0.02;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(4.5,4.5,4.5);
                        this.bindTexture(TEXTURE_EGLONASPIS);
                        modelEglonaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEoraptorRaw.block) {
                        double offset = -0.15;
                        double voffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.7,1.7,1.7);
                        this.bindTexture(TEXTURE_EORAPTOR);
                        modelEoraptor.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEosaurichthysRaw.block) {
                        double offset = 0.07;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.2,1.2,1.2);
                        this.bindTexture(TEXTURE_EOSAURICHTHYS);
                        modelSaurichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEryopsRaw.block) {
                        double offset = -0.39;
                        double voffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(5.3,5.3,5.3);
                        this.bindTexture(TEXTURE_ERYOPS);
                        modelEryops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemErythrosuchusRaw.block) {
                        double offset = -0.73;
                        double voffset = 0.25;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.56,0.56,0.56);
                        this.bindTexture(TEXTURE_ERYTHROSUCHUS);
                        modelErythrosuchus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEstemmenosuchusRaw.block) {
                        double offset = -0.73;
                        double voffset = 0.25;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(6.1,6.1,6.1);
                        this.bindTexture(TEXTURE_ESTEMMENOSUCHUS);
                        modelEstemmenosuchus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEusthenopteronRaw.block) {
                        double offset = -0.14;
                        double voffset = 0.41;
                        double hoffset = 0.6;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 - hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2,2,2);
                        this.bindTexture(TEXTURE_EUSTHENOPTERON);
                        modelEusthenopteron.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemFadeniaCarboniferousRaw.block) {
                        double offset = -0.4;
                        double voffset = 0.55;
                        double hoffset = 0.9;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.2,3.2,3.2);
                        this.bindTexture(TEXTURE_FADENIAC);
                        modelFadenia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemFadeniaPermotriassicRaw.block) {
                        double offset = -0.4;
                        double voffset = 0.55;
                        double hoffset = 0.9;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.2,3.2,3.2);
                        this.bindTexture(TEXTURE_FADENIAPT);
                        modelFadenia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemFalcatusRaw.block) {
                        double offset = 0.1;
                        //double voffset = 0.41;
                        //double hoffset = 0.6;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.7,1.7,1.7);
                        this.bindTexture(TEXTURE_FALCATUS);
                        modelFalcatus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemFeroxichthysRaw.block) {
                        double offset = 0.1;
                        //double voffset = 0.41;
                        //double hoffset = 0.6;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1,1,1);
                        this.bindTexture(TEXTURE_FEROXICHTHYS);
                        modelFeroxichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemForeyiaRaw.block) {
                        double offset = 0.04;
                        //double voffset = 0.41;
                        //double hoffset = 0.6;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.3,1.3,1.3);
                        this.bindTexture(TEXTURE_FOREYIA);
                        modelForeyia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemFurcacaudaRaw.block) {
                        double offset = 0.03;
                        double voffset = 0.23;
                        double hoffset = 0.05;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.2,1.2,1.2);
                        this.bindTexture(TEXTURE_FURCACAUDA);
                        modelFurcacauda.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemGabreyaspisRaw.block) {
                        double offset = 0.44;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.8,1.8,1.8);
                        this.bindTexture(TEXTURE_GABREYASPIS);
                        modelGabreyaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemGantarostrataspisRaw.block) {
                        double offset = 0.33;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.3,1.3,1.3);
                        this.bindTexture(TEXTURE_GANTAROSTRATASPIS);
                        modelGantarostrataspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemGemuendinaRaw.block) {
                        double offset = 0.44;
                        double voffset = 0.05;
                        double hoffset = 0.16;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.7,1.7,1.7);
                        this.bindTexture(TEXTURE_GEMUENDINA);
                        modelGemuendina.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemGlaurungRaw.block) {
                        double offset = 0.03;
                        double voffset = 0.03;
                        double hoffset = 0.01;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(0.8,0.8,0.8);
                        this.bindTexture(TEXTURE_GLAURUNG);
                        modelWeigeltisaurid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemGnathorhizaRaw.block) {
                        double offset = 0.05;
                        double voffset = 0.03;
                        double hoffset = 0.08;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.4,1.4,1.4);
                        this.bindTexture(TEXTURE_GNATHORHIZA);
                        modelGnathorhiza.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemGorgonopsRaw.block) {
                        double offset = -0.3;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.9,2.9,2.9);
                        this.bindTexture(TEXTURE_GORGONOPS);
                        modelGorgonops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemGroenlandaspisRaw.block) {
                        double offset = 0.02;
                        double voffset = 0.39;
                        double hoffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.9,1.9,1.9);
                        this.bindTexture(TEXTURE_GROENLANDASPIS);
                        modelGroenlandaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemGyracanthidesRaw.block) {
                        double offset = 0.65;
                        double voffset = 0.38;
                        double hoffset = 0.6;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(2.6,2.6,2.6);
                        this.bindTexture(TEXTURE_GYRACANTHIDES);
                        modelGyracanthides.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHelicoprionRaw.block) {
                        double offset = -1.1;
                        double voffset = 0.35;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(10,10,10);
                        this.bindTexture(TEXTURE_HELICOPRION);
                        modelHelicoprion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHemicyclaspisRaw.block) {
                        double offset = 0.46;
                        double voffset = 0.03;
                        double hoffset = 0.05;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.9,1.9,1.9);
                        this.bindTexture(TEXTURE_HEMICYCLASPIS);
                        modelHemicyclaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHerrerasaurusRaw.block) {
                        double offset = -0.85;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.5,4.5,4.5);
                        this.bindTexture(TEXTURE_HERRERASAURUS);
                        modelHerrerasaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHeterosteusRaw.block) {
                        double offset = -0.27;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(180,0,1,0);
                        GlStateManager.scale(6.5,6.5,6.5);
                        this.bindTexture(TEXTURE_HETEROSTEUS);
                        modelHeterosteus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHibernaspisRaw.block) {
                        double offset = 0.1;
                        double voffset = -0.26;
                        double hoffset = 0.05;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.8,1.8,1.8);
                        this.bindTexture(TEXTURE_HIBERNASPIS);
                        modelHibernaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHolonemaRaw.block) {
                        double offset = 0.6;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(2.4,2.4,2.4);
                        this.bindTexture(TEXTURE_HOLONEMA);
                        modelHolonema.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHybodusRaw.block) {
                        double offset = 0.09;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3,3,3);
                        this.bindTexture(TEXTURE_HYBODUS);
                        modelHybodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHyneriaRaw.block) {
                        double offset = -0.03;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.4,4.4,4.4);
                        this.bindTexture(TEXTURE_HYNERIA);
                        modelHyneria.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHyperodapedonRaw.block) {
                        double offset = -0.1;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.8,4.8,4.8);
                        this.bindTexture(TEXTURE_HYPERODAPEDON);
                        modelHyperodapedon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemIniopteryxRaw.block) {
                        double offset = 0.06;
                        double voffset = 0.06;
                        double hoffset = 0.12;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.4,1.4,1.4);
                        this.bindTexture(TEXTURE_INIOPTERYX);
                        modelIniopteryx.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemInostranceviaRaw.block) {
                        double offset = -0.29;
                        double voffset = 0.02;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.3,4.3,4.3);
                        this.bindTexture(TEXTURE_INOSTRANCEVIA);
                        modelInostrancevia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemJanassaRaw.block) {
                        double offset = 0.39;
                        double voffset = -0.01;
                        double hoffset = 0.13;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.6,1.6,1.6);
                        this.bindTexture(TEXTURE_JANASSA);
                        modelJanassa.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemJonkeriaRaw.block) {
                        double offset = -0.6;
                        double voffset = 0.26;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(5.2,5.2,5.2);
                        this.bindTexture(TEXTURE_JONKERIA);
                        modelJonkeria.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemKaibabvenatorRaw.block) {
                        double offset = 0.04;
                        double voffset = 0.05;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(5.7,5.7,5.7);
                        this.bindTexture(TEXTURE_KAIBABVENATOR);
                        modelKaibabvenator.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLaccognathusRaw.block) {
                        double offset = 0.28;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(6.4,6.4,6.4);
                        this.bindTexture(TEXTURE_LACCOGNATHUS);
                        modelLaccognathus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLaminacarisRaw.block) {
                        double offset = 0.96;
                        //double voffset = -0.01;
                        double voffset = -0;
                        //double hoffset = 0.43;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(3.8,3.8,3.8);
                        this.bindTexture(TEXTURE_LAMINACARIS);
                        modelLaminacaris.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLebachacanthusRaw.block) {
                        double offset = 0.09;
                        double voffset = 0.7;
                        double hoffset = 0.5;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.8,3.8,3.8);
                        this.bindTexture(TEXTURE_LEBACHACANTHUS);
                        modelLebachacanthus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLessemsaurusRaw.block) {
                        double offset = -0.3;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(5.5,5.5,5.5);
                        this.bindTexture(TEXTURE_LESSEMSAURUS);
                        modelLessemsaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLiliensternusRaw.block) {
                        double offset = -0.32;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.9,3.9,3.9);
                        this.bindTexture(TEXTURE_LILIENSTERNUS);
                        modelLiliensternus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLimnoscelisRaw.block) {
                        double offset = -0.15;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2,2,2);
                        this.bindTexture(TEXTURE_LIMNOSCELIS);
                        modelLimnoscelis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLisowiciaRaw.block) {
                        double offset = -0.79;
                        double voffset = 0.5;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(7.6,7.6,7.6);
                        this.bindTexture(TEXTURE_LISOWICIA);
                        modelLisowicia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemListracanthusRaw.block) {
                        double offset = 0.06;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.4,3.4,3.4);
                        this.bindTexture(TEXTURE_LISTRACANTHUS);
                        modelListracanthus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLonchidionRaw.block) {
                        double offset = -0.02;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.9,1.9,1.9);
                        this.bindTexture(TEXTURE_LONCHIDION);
                        modelLonchidion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLotosaurusRaw.block) {
                        double offset = -0.3;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(5.2,5.2,5.2);
                        this.bindTexture(TEXTURE_LOTOSAURUS);
                        modelLotosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLunaspisRaw.block) {
                        double offset = 0.45;
                        //double voffset = -0.01;
                        double voffset = 0;
                        //double hoffset = 0.13;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.9,1.9,1.9);
                        this.bindTexture(TEXTURE_LUNASPIS);
                        modelLunaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLungmenshanaspisRaw.block) {
                        double offset = 0.2;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.1,1.1,1.1);
                        this.bindTexture(TEXTURE_LUNGMENSHANASPIS);
                        modelLungmenshanaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLuoxiongichthysRaw.block) {
                        double offset = 0.04;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.7,0.7,0.7);
                        this.bindTexture(TEXTURE_LUOXIONGICHTHYS);
                        modelLuoxiongichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLystrosaurusRaw.block) {
                        double offset = -0.25;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.7,3.7,3.7);
                        this.bindTexture(TEXTURE_LYSTROSAURUS);
                        modelLystrosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMastodonsaurusRaw.block) {
                        double offset = -0.9;
                        double voffset = 0.15;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(7.1,7.1,7.1);
                        this.bindTexture(TEXTURE_MASTODONSAURUS);
                        modelMastodonsaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMcnamaraspisRaw.block) {
                        double offset = 0.04;
                        //double voffset = 0.06;
                        //double hoffset = 0.12;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.85,0.85,0.85);
                        this.bindTexture(TEXTURE_MCNAMARASPIS);
                        modelMcnamaraspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMegactenopetalusRaw.block) {
                        double offset = -0.04;
                        double voffset = 0.03;
                        double hoffset = 0.06;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(5.4,5.4,5.4);
                        this.bindTexture(TEXTURE_MEGACTENOPETALUS);
                        modelMegactenopetalus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMegalograptusRaw.block) {
                        double offset = 0.39;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.6,1.6,1.6);
                        this.bindTexture(TEXTURE_MEGALOGRAPTUS);
                        modelMegalograptus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMelosaurusRaw.block) {
                        double offset = -0.12;
                        double voffset = 0.04;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3,3,3);
                        this.bindTexture(TEXTURE_MELOSAURUS);
                        modelMelosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMenaspisRaw.block) {
                        double offset = 0.3;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.2,1.2,1.2);
                        this.bindTexture(TEXTURE_MENASPIS);
                        modelMenaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMetoposaurusRaw.block) {
                        double offset = -0.35;
                        double voffset = 0.04;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(5.4,5.4,5.4);
                        this.bindTexture(TEXTURE_METOPOSAURUS);
                        modelMetoposaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMixopterusRaw.block) {
                        double offset = 0.42;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.8,1.8,1.8);
                        this.bindTexture(TEXTURE_MIXOPTERUS);
                        modelMixopterus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMoschopsRaw.block) {
                        double offset = -0.45;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.5,4.5,4.5);
                        this.bindTexture(TEXTURE_MOSCHOPS);
                        modelMoschops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMussaurusRaw.block) {
                        double offset = -0.9;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.7,4.7,4.7);
                        this.bindTexture(TEXTURE_MUSSAURUS);
                        modelMussaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemNothosaurusRaw.block) {
                        double offset = -0.49;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.38,0.38,0.38);
                        this.bindTexture(TEXTURE_NOTHOSAURUS);
                        modelNothosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemOnychodusRaw.block) {
                        double offset = 0.06;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.8,4.8,4.8);
                        this.bindTexture(TEXTURE_ONYCHODUS);
                        modelOnychodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemOphiacodonRaw.block) {
                        double offset = -0.15;
                        double voffset = 0.04;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.5,2.5,2.5);
                        this.bindTexture(TEXTURE_OPHIACODON);
                        modelOphiacodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemOrodusRaw.block) {
                        double offset = -0.14;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3,3,3);
                        this.bindTexture(TEXTURE_ORODUS);
                        modelOrodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemOrnithoprionRaw.block) {
                        double offset = 0.04;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1,1,1);
                        this.bindTexture(TEXTURE_ORNITHOPRION);
                        modelOrnithoprion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemOsteolepisRaw.block) {
                        double offset = -0.04;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.4,1.4,1.4);
                        this.bindTexture(TEXTURE_OSTEOLEPIS);
                        modelOsteolepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPalaeoniscumRaw.block) {
                        double offset = 0.02;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.9,0.9,0.9);
                        this.bindTexture(TEXTURE_PALAEONISCUM);
                        modelPalaeoniscum.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPanderichthysRaw.block) {
                        double offset = 0.73;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(3,3,3);
                        this.bindTexture(TEXTURE_PANDERICHTHYS);
                        modelPanderichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPanderodusRaw.block) {
                        double offset = 0.02;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.55,0.55,0.55);
                        this.bindTexture(TEXTURE_PANDERODUS);
                        modelPanderodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemParanaichthysRaw.block) {
                        double offset = 0.02;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.4,1.4,1.4);
                        this.bindTexture(TEXTURE_PARANAICHTHYS);
                        modelParanaichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemParatarrasiusRaw.block) {
                        double offset = -0.01;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.8,0.8,0.8);
                        this.bindTexture(TEXTURE_PARATARRASIUS);
                        modelParatarrasius.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemParexusRaw.block) {
                        double offset = -0.04;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.2,1.2,1.2);
                        this.bindTexture(TEXTURE_PAREXUS);
                        modelParexus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemParhybodusRaw.block) {
                        double offset = 0.09;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.9,1.9,1.9);
                        this.bindTexture(TEXTURE_PARHYBODUS);
                        modelHybodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPelurgaspisRaw.block) {
                        double offset = 0.09;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.3,2.3,2.3);
                        this.bindTexture(TEXTURE_PELURGASPIS);
                        modelPelurgaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPharyngolepisRaw.block) {
                        double offset = -0.06;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.5,1.5,1.5);
                        this.bindTexture(TEXTURE_PHARYNGOLEPIS);
                        modelPharyngolepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPholiderpetonRaw.block) {
                        double offset = -0.43;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.8,3.8,3.8);
                        this.bindTexture(TEXTURE_PHOLIDERPETON);
                        modelPholiderpeton.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPlaceriasRaw.block) {
                        double offset = -0.36;
                        double voffset = 0.14;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.8,2.8,2.8);
                        this.bindTexture(TEXTURE_PLACERIAS);
                        modelPlacerias.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPlacodusRaw.block) {
                        double offset = -0.26;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.6 * 1.2F,2.6 * 1.2F,2.6 * 1.2F);
                        this.bindTexture(TEXTURE_PLACODUS);
                        modelPlacodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPlateosaurusRaw.block) {
                        double offset = -1.4;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(7,7,7);
                        this.bindTexture(TEXTURE_PLATEOSAURUS);
                        modelPlateosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPlatycaraspisRaw.block) {
                        double offset = 0.31;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.3,1.3,1.3);
                        this.bindTexture(TEXTURE_PLATYCARASPIS);
                        modelPlatycaraspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPlatylomaspisRaw.block) {
                        double offset = 0.24;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1,1,1);
                        this.bindTexture(TEXTURE_PLATYLOMASPIS);
                        modelPlatylomaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPlatysomusRaw.block) {
                        double offset = 0.06;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1,1,1);
                        this.bindTexture(TEXTURE_PLATYSOMUS);
                        modelPlatysomus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPoposaurusRaw.block) {
                        double offset = -0.15;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.3,4.3,4.3);
                        this.bindTexture(TEXTURE_POPOSAURUS);
                        modelPoposaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPoraspisRaw.block) {
                        double offset = 0.13;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2,2,2);
                        this.bindTexture(TEXTURE_PORASPIS);
                        modelPoraspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPostosuchusRaw.block) {
                        double offset = -0.23;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.5,3.5,3.5);
                        this.bindTexture(TEXTURE_POSTOSUCHUS);
                        modelPostosuchus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPrionosuchusRaw.block) {
                        double offset = -0.9;
                        double voffset = 0.15;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(7.2,7.2,7.2);
                        this.bindTexture(TEXTURE_PRIONOSUCHUS);
                        modelPrionosuchus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPristerognathusRaw.block) {
                        double offset = -0.3;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.6,2.6,2.6);
                        this.bindTexture(TEXTURE_PRISTEROGNATHUS);
                        modelPristerognathus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPromissumRaw.block) {
                        double offset = 0.04;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.4,1.4,1.4);
                        this.bindTexture(TEXTURE_PROMISSUM);
                        modelPromissum.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPsarolepisRaw.block) {
                        double offset = 0.06;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.3,1.3,1.3);
                        this.bindTexture(TEXTURE_PSAROLEPIS);
                        modelPsarolepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPteraspisRaw.block) {
                        double offset = 0.12;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.8,1.8,1.8);
                        this.bindTexture(TEXTURE_PTERASPIS);
                        modelPteraspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPygopterusRaw.block) {
                        double offset = -0.02;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.1,2.1,2.1);
                        this.bindTexture(TEXTURE_PYGOPTERUS);
                        modelPygopterus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemQilinyuRaw.block) {
                        double offset = 0.44;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.8,1.8,1.8);
                        this.bindTexture(TEXTURE_QILINYU);
                        modelQilinyu.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemRautianiaRaw.block) {
                        double offset = 0.03;
                        double voffset = 0.03;
                        double hoffset = 0.01;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(0.8,0.8,0.8);
                        this.bindTexture(TEXTURE_RAUTIANIA);
                        modelWeigeltisaurid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemRebellatrixRaw.block) {
                        double offset = 0.06;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.5,2.5,2.5);
                        this.bindTexture(TEXTURE_REBELLATRIX);
                        modelRebellatrix.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemRhizodusRaw.block) {
                        double offset = -0.7;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(6.5,6.5,6.5);
                        this.bindTexture(TEXTURE_RHIZODUS);
                        modelRhizodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemSacabambaspisRaw.block) {
                        double offset = 0.12;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.4,1.4,1.4);
                        this.bindTexture(TEXTURE_SACABAMBASPIS);
                        modelSacabambaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemSaivodusRaw.block) {
                        double offset = 0.1;
                        double voffset = 0.15;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(10.2,10.2,10.2);
                        this.bindTexture(TEXTURE_SAIVODUS);
                        modelSaivodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemSaurichthysMarineRaw.block) {
                        double offset = 0.15;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.1,3.1,3.1);
                        this.bindTexture(TEXTURE_SAURICHTHYS_M);
                        modelSaurichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemSaurichthysFreshwaterRaw.block) {
                        double offset = 0.1;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.2,1.2,1.2);
                        this.bindTexture(TEXTURE_SAURICHTHYS_F);
                        modelSaurichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemSauroctonusRaw.block) {
                        double offset = -0.3;
                        double voffset = 0.15;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3,3,3);
                        this.bindTexture(TEXTURE_SAUROCTONUS);
                        modelSauroctonus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemSaurosuchusRaw.block) {
                        double offset = -0.68;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(6.5,6.5,6.5);
                        this.bindTexture(TEXTURE_SAUROSUCHUS);
                        modelSaurosuchus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemScaumenaciaRaw.block) {
                        double offset = 0.18;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.1,2.1,2.1);
                        this.bindTexture(TEXTURE_SCAUMENACIA);
                        modelScaumenacia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemScutosaurusRaw.block) {
                        double offset = -0.36;
                        double voffset = 0.15;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(5.2,5.2,5.2);
                        this.bindTexture(TEXTURE_SCUTOSAURUS);
                        modelScutosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemSemionotusRaw.block) {
                        double offset = 0.13;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.2,1.2,1.2);
                        this.bindTexture(TEXTURE_SEMIONOTUS);
                        modelSemionotus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemShonisaurusRaw.block) {
                        double offset = -1.3;
                        double voffset = 0.15;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(12,12,12);
                        this.bindTexture(TEXTURE_SHONISAURUS);
                        modelShonisaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemShringasaurusRaw.block) {
                        double offset = -0.45;
                        double voffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.2,4.2,4.2);
                        this.bindTexture(TEXTURE_SHRINGASAURUS);
                        modelShringasaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemSillosuchusRaw.block) {
                        double offset = -1.2;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(6.8,6.8,6.8);
                        this.bindTexture(TEXTURE_SILLOSUCHUS);
                        modelSillosuchus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemSmilosuchusRaw.block) {
                        double offset = 0.4;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.3,4.3,4.3);
                        this.bindTexture(TEXTURE_SMILOSUCHUS);
                        modelSmilosuchus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemSmokRaw.block) {
                        double offset = -0.6;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.5,3.5,3.5);
                        this.bindTexture(TEXTURE_SMOK);
                        modelSmok.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemSphenacodonRaw.block) {
                        double offset = -0.31;
                        double voffset = 0.15;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.6,3.6,3.6);
                        this.bindTexture(TEXTURE_SPHENACODON);
                        modelSphenacodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemSquatinactisRaw.block) {
                        double offset = 0.42;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.6,1.6,1.6);
                        this.bindTexture(TEXTURE_SQUATINACTIS);
                        modelSquatinactis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemStagonolepisRaw.block) {
                        double offset = -0.36;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.2,4.2,4.2);
                        this.bindTexture(TEXTURE_STAGONOLEPIS);
                        modelStagonolepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemStensioellaRaw.block) {
                        double offset = 0.03;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.2,1.2,1.2);
                        this.bindTexture(TEXTURE_STENSIOELLA);
                        modelStensioella.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemTanystropheusRaw.block) {
                        double offset = -0.3;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.25,0.25,0.25);
                        this.bindTexture(TEXTURE_TANYSTROPHEUS);
                        modelTanystropheus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemTapinocephalusRaw.block) {
                        double offset = -0.7;
                        double voffset = 0.15;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(6.5,6.5,6.5);
                        this.bindTexture(TEXTURE_TAPINOCEPHALUS);
                        modelTapinocephalus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemTartuosteusRaw.block) {
                        double offset = 0.13;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3,3,3);
                        this.bindTexture(TEXTURE_TARTUOSTEUS);
                        modelTartuosteus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemThecodontosaurusRaw.block) {
                        double offset = -0.7;
                        double voffset = 0.15;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(6.5,6.5,6.5);
                        this.bindTexture(TEXTURE_THECODONTOSAURUS);
                        modelThecodontosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemThelodusRaw.block) {
                        double offset = 0.67;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(3,3,3);
                        this.bindTexture(TEXTURE_THELODUS);
                        modelThelodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemThrinacodusRaw.block) {
                        double offset = 0.19;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.7,0.7,0.7);
                        this.bindTexture(TEXTURE_THRINACODUS);
                        modelThrinacodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemTitanichthysRaw.block) {
                        double offset = -0.63;
                        double voffset = 0.15;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(5.8,5.8,5.8);
                        this.bindTexture(TEXTURE_TITANICHTHYS);
                        modelTitanicthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemTorpedaspisRaw.block) {
                        double offset = 0.67;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(3,3,3);
                        this.bindTexture(TEXTURE_TORPEDASPIS);
                        modelTorpedaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemTraquairiusRaw.block) {
                        double offset = 0.13;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.4,1.4,1.4);
                        this.bindTexture(TEXTURE_TRAQUAIRIUS);
                        modelTraquairius.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemTullimonstrumRaw.block) {
                        double offset = 0.22;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.6,2.6,2.6);
                        this.bindTexture(TEXTURE_TULLIMONSTRUM);
                        modelTullimonstrum.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemTurrisaspisRaw.block) {
                        double offset = 0.03;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1,1,1);
                        this.bindTexture(TEXTURE_TURRISASPIS);
                        modelTurrisaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemUranocentrodonRaw.block) {
                        double offset = -0.3;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3,3,3);
                        this.bindTexture(TEXTURE_URANOCENTRODON);
                        modelUranocentrodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemUrosthenesRaw.block) {
                        double offset = 0.12;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.2,1.2,1.2);
                        this.bindTexture(TEXTURE_UROSTHENES);
                        modelUrosthenes.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemVancleaveaRaw.block) {
                        double offset = -0.48;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.35,0.35,0.35);
                        this.bindTexture(TEXTURE_VANCLEAVEA);
                        modelVancleavea.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemVarialepisRaw.block) {
                        double offset = 0.14;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1,1,1);
                        this.bindTexture(TEXTURE_VARIALEPIS);
                        modelVarialepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemVivaxosaurusRaw.block) {
                        double offset = -0.3;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.5,4.5,4.5);
                        this.bindTexture(TEXTURE_VIVAXOSAURUS);
                        modelVivaxosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemWeigeltisaurusRaw.block) {
                        double offset = 0.03;
                        double voffset = 0.03;
                        double hoffset = 0.01;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(0.8,0.8,0.8);
                        this.bindTexture(TEXTURE_WEIGELTISAURUS);
                        modelWeigeltisaurid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemXenacanthusRaw.block) {
                        double offset = -0.07;
                        double voffset = 0.7;
                        double hoffset = 0.5;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.2,3.2,3.2);
                        this.bindTexture(TEXTURE_XENACANTHUS);
                        modelXenacanthus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemXinpusaurusRaw.block) {
                        double offset = 0.05;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.6,1.6,1.6);
                        this.bindTexture(TEXTURE_XINPUSAURUS);
                        modelXinpusaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemYunguisaurusRaw.block) {
                        double offset = -0.3;
                        double voffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.43,0.43,0.43);
                        this.bindTexture(TEXTURE_YUNGUISAURUS);
                        modelYunguisaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }


                    // ********************************************************************
                    else { //standard items
                        itemRender = true;

                        GlStateManager.alphaFunc(516, 0.1F);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        //GlStateManager.pushMatrix();

                        float scale = 0.6666F;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5, z + 0.98);
                            GlStateManager.scale(scale, scale, scale);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5, z + 0.02);
                            GlStateManager.scale(scale, scale, scale);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + 0.98, y + 0.5, z + 0.5);
                            GlStateManager.scale(scale, scale, scale);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + 0.02, y + 0.5, z + 0.5);
                            GlStateManager.scale(scale, scale, scale);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        IBakedModel model = Minecraft.getMinecraft().getRenderItem().getItemModelWithOverrides(itemstack, world, null);
                        //model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.FIXED, false);
                        model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.GROUND, false);
                        Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
                        Minecraft.getMinecraft().getRenderItem().renderItem(itemstack, model);


                    }

                    if (itemRender) {
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.disableAlpha();
                        GlStateManager.disableBlend();
                        GlStateManager.enableCull();
                        GlStateManager.disableRescaleNormal();
                        RenderHelper.disableStandardItemLighting();
                        GlStateManager.popMatrix();
                    }
                    else {
                        GlStateManager.disableAlpha();
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();
                    }

                }
            }
        }
    }
}