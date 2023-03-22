package net.lepidodendron.entity.render.tile;

import net.lepidodendron.ClientProxyLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockDisplayWallMount;
import net.lepidodendron.entity.*;
import net.lepidodendron.entity.model.entity.*;
import net.lepidodendron.entity.render.entity.*;
import net.lepidodendron.item.ItemTaxidermyDisplayItem;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;
import java.lang.reflect.Method;

public class RenderDisplayWallMount extends TileEntitySpecialRenderer<BlockDisplayWallMount.TileEntityDisplayWallMount> {

    public static final float scaler = 6.0F;

    public static final PropertyDirection FACING = BlockDirectional.FACING;
    private static final ResourceLocation TEXTURE_ACANTHODES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acanthodes.png");
    private final ModelAcanthodes modelAcanthodes;
    private static final ResourceLocation TEXTURE_ACROLEPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acrolepis.png");
    private final ModelAcrolepis modelAcrolepis;

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
    private static final ResourceLocation TEXTURE_COELUROSAURAVUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/coelurosauravus.png");
    private final ModelWeigeltisaurid modelWeigeltisaurid;
    private static final ResourceLocation TEXTURE_COTYLORHYNCHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cotylorhynchus.png");
    private final ModelCotylorhynchus modelCotylorhynchus;
    private static final ResourceLocation TEXTURE_CRASSIGYRINUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/crassigyrinus.png");
    private final ModelCrassigyrinus modelCrassigyrinus;
    private static final ResourceLocation TEXTURE_CTENOSPONDYLUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ctenospondylus.png");
    private final ModelCtenospondylus modelCtenospondylus;
    private static final ResourceLocation TEXTURE_CYNOGNATHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cynognathus.png");
    private final ModelCynognathus modelCynognathus;
    private static final ResourceLocation TEXTURE_DAEDALICHTHYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/daedalichthys.png");
    private final ModelDaedalichthys modelDaedalichthys;
    private static final ResourceLocation TEXTURE_DIADECTES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diadectes.png");
    private final ModelDiadectes modelDiadectes;
    private static final ResourceLocation TEXTURE_DORYASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/doryaspis.png");
    private final ModelDoryaspis modelDoryaspis;
    private static final ResourceLocation TEXTURE_DORYPTERUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dorypterus.png");
    private final ModelDorypterus modelDorypterus;
    private static final ResourceLocation TEXTURE_DREPANASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/drepanaspis.png");
    private final ModelDrepanaspis modelDrepanaspis;
    private static final ResourceLocation TEXTURE_EBENAQUA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ebenaqua.png");
    private final ModelEbenaqua modelEbenaqua;
    private static final ResourceLocation TEXTURE_EDESTUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/edestus.png");
    private final ModelEdestus modelEdestus;
    private static final ResourceLocation TEXTURE_EGLONASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eglonaspis.png");
    private final ModelEglonaspis modelEglonaspis;
    private static final ResourceLocation TEXTURE_EOSAURICHTHYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eosaurichthys.png");
    private final ModelSaurichthys modelSaurichthys;
    private static final ResourceLocation TEXTURE_EUSTHENOPTERON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eusthenopteron.png");
    private final ModelEusthenopteron modelEusthenopteron;
    private static final ResourceLocation TEXTURE_FADENIAC = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/fadenia_carboniferous.png");
    private static final ResourceLocation TEXTURE_FADENIAPT = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/fadenia_permotriassic.png");
    private final ModelFadenia modelFadenia;
    private static final ResourceLocation TEXTURE_FALCATUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/falcatus_m.png");
    private final ModelFalcatus modelFalcatus;
    private static final ResourceLocation TEXTURE_FEROXICHTHYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/feroxichthys.png");
    private final ModelFeroxichthys modelFeroxichthys;
    private static final ResourceLocation TEXTURE_FURCACAUDA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/furcacauda.png");
    private final ModelFurcacauda modelFurcacauda;
    private static final ResourceLocation TEXTURE_GABREYASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gabreyaspis.png");
    private final ModelGabreyaspis modelGabreyaspis;
    private static final ResourceLocation TEXTURE_GANTAROSTRATASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gantarostrataspis.png");
    private final ModelGantarostrataspis modelGantarostrataspis;

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
    private static final ResourceLocation TEXTURE_JANASSA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/janassa.png");
    private final ModelJanassa modelJanassa;
    private static final ResourceLocation TEXTURE_JONKERIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jonkeria.png");
    private final ModelJonkeria modelJonkeria;
    private static final ResourceLocation TEXTURE_LACCOGNATHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/laccognathus.png");
    private final ModelLaccognathus modelLaccognathus;
    private static final ResourceLocation TEXTURE_LAMINACARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/laminacaris.png");
    private final ModelLaminacaris modelLaminacaris;
    private static final ResourceLocation TEXTURE_LEBACHACANTHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lebachacanthus.png");
    private final ModelLebachacanthus modelLebachacanthus;
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
    private static final ResourceLocation TEXTURE_MELOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/melosaurus.png");
    private final ModelMelosaurus modelMelosaurus;
    private static final ResourceLocation TEXTURE_METOPOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/metoposaurus.png");
    private final ModelMetoposaurus modelMetoposaurus;
    private static final ResourceLocation TEXTURE_MIXOPTERUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mixopterus.png");
    private final ModelMixopterus modelMixopterus;
    private static final ResourceLocation TEXTURE_MOSCHOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/moschops.png");
    private final ModelMoschops modelMoschops;
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
    private static final ResourceLocation TEXTURE_PORASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/poraspis.png");
    private final ModelPoraspis modelPoraspis;
    private static final ResourceLocation TEXTURE_PRISTEROGNATHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pristerognathus.png");
    private final ModelPristerognathus modelPristerognathus;
    private static final ResourceLocation TEXTURE_PROMISSUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/promissum.png");
    private final ModelPromissum modelPromissum;
    private static final ResourceLocation TEXTURE_PSAROLEPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/psarolepis.png");
    private final ModelPsarolepis modelPsarolepis;
    private static final ResourceLocation TEXTURE_PTERASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pteraspis.png");
    private final ModelPteraspis modelPteraspis;
    private static final ResourceLocation TEXTURE_RAUTIANIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rautiania.png");
    private static final ResourceLocation TEXTURE_REBELLATRIX = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rebellatrix.png");
    private final ModelRebellatrix modelRebellatrix;
    private static final ResourceLocation TEXTURE_RHIZODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rhizodus.png");
    private final ModelRhizodus modelRhizodus;
    private static final ResourceLocation TEXTURE_SACABAMBASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sacabambaspis.png");
    private final ModelSacabambaspis modelSacabambaspis;
    private static final ResourceLocation TEXTURE_SAURICHTHYS_M = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/saurichthys_marine.png");
    private static final ResourceLocation TEXTURE_SAURICHTHYS_F = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/saurichthys_freshwater.png");
    private static final ResourceLocation TEXTURE_SAUROCTONUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sauroctonus.png");
    private final ModelSauroctonus modelSauroctonus;
    private static final ResourceLocation TEXTURE_SCAUMENACIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scaumenacia.png");
    private final ModelScaumenacia modelScaumenacia;
    private static final ResourceLocation TEXTURE_SCUTOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scutosaurus.png");
    private final ModelScutosaurus modelScutosaurus;
    private static final ResourceLocation TEXTURE_SEMIONOTUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/semionotus.png");
    private final ModelSemionotus modelSemionotus;
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
    private static final ResourceLocation TEXTURE_TARTUOSTEUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tartuosteus.png");
    private final ModelTartuosteus modelTartuosteus;
    private static final ResourceLocation TEXTURE_THELODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/thelodus.png");
    private final ModelThelodus modelThelodus;
    private static final ResourceLocation TEXTURE_THRINACODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/thrinacodus.png");
    private final ModelThrinacodus modelThrinacodus;
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
    private static final ResourceLocation TEXTURE_VANCLEAVEA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vancleavea.png");
    private final ModelVancleavea modelVancleavea;
    private static final ResourceLocation TEXTURE_VARIALEPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/varialepis.png");
    private final ModelVarialepis modelVarialepis;
    private static final ResourceLocation TEXTURE_VIVAXOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vivaxosaurus.png");
    private final ModelVivaxosaurus modelVivaxosaurus;
    private static final ResourceLocation TEXTURE_WEIGELTISAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/weigeltisaurus.png");
    private static final ResourceLocation TEXTURE_XENACANTHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/xenacanthus.png");
    private final ModelXenacanthus modelXenacanthus;

    private static final ResourceLocation TEXTURE_YUNGUISAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yunguisaurus.png");
    private final ModelYunguisaurus modelYunguisaurus;


    public RenderDisplayWallMount() {
        this.modelAcanthodes = new ModelAcanthodes();
        this.modelAcrolepis = new ModelAcrolepis();
        this.modelAkmonistion = new ModelAkmonistion();
        this.modelAlbertonia = new ModelAlbertonia();
        this.modelAllenypterus = new ModelAllenypterus();
        this.modelAnteosaurus = new ModelAnteosaurus();
        this.modelAntineosteus = new ModelAntineosteus();
        this.modelArandaspis = new ModelArandaspis();
        this.modelArchosaurus = new ModelArchosaurus();
        this.modelArizonasaurus = new ModelArizonasaurus();
        this.modelAstraspis = new ModelAstraspis();
        this.modelAteleaspis = new ModelAteleaspis();
        this.modelAtopodentatus = new ModelAtopodentatus();
        this.modelBandringa = new ModelBandringa();
        this.modelBarameda = new ModelBarameda();
        this.modelBarbclabornia = new ModelBarbclabornia();
        this.modelBatrachotomus = new ModelBatrachotomus();
        this.modelBeishanichthys = new ModelBeishanichthys();
        this.modelBelantsea = new ModelBelantsea();
        this.modelBirgeria = new ModelBirgeria();
        this.modelBirkenia = new ModelBirkenia();
        this.modelBlourugia = new ModelBlourugia();
        this.modelBobasatrania = new ModelBobasatrania();
        this.modelBoothiaspis = new ModelBoothiaspis();
        this.modelBothriolepis = new ModelBothriolepis();
        this.modelBrembodus = new ModelBrembodus();
        this.modelBrochoadmones = new ModelBrochoadmones();
        this.modelBunostegos = new ModelBunostegos();
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
        this.modelWeigeltisaurid = new ModelWeigeltisaurid();
        this.modelCotylorhynchus = new ModelCotylorhynchus();
        this.modelCrassigyrinus = new ModelCrassigyrinus();
        this.modelCtenospondylus = new ModelCtenospondylus();
        this.modelCynognathus = new ModelCynognathus();
        this.modelDaedalichthys = new ModelDaedalichthys();
        this.modelDiadectes = new ModelDiadectes();
        this.modelDoryaspis = new ModelDoryaspis();
        this.modelDorypterus = new ModelDorypterus();
        this.modelDrepanaspis = new ModelDrepanaspis();
        this.modelEbenaqua = new ModelEbenaqua();
        this.modelEdestus = new ModelEdestus();
        this.modelEglonaspis = new ModelEglonaspis();
        this.modelEusthenopteron = new ModelEusthenopteron();
        this.modelFadenia = new ModelFadenia();
        this.modelFalcatus = new ModelFalcatus();
        this.modelFeroxichthys = new ModelFeroxichthys();
        this.modelFurcacauda = new ModelFurcacauda();
        this.modelGabreyaspis = new ModelGabreyaspis();
        this.modelGantarostrataspis = new ModelGantarostrataspis();
        this.modelGerarus = new ModelGerarus();
        this.modelGnathorhiza = new ModelGnathorhiza();
        this.modelGorgonops = new ModelGorgonops();
        this.modelGroenlandaspis = new ModelGroenlandaspis();
        this.modelGyracanthides = new ModelGyracanthides();
        this.modelHemicyclaspis = new ModelHemicyclaspis();
        this.modelHerrerasaurus = new ModelHerrerasaurus();
        this.modelHeterosteus = new ModelHeterosteus();
        this.modelHibernaspis = new ModelHibernaspis();
        this.modelHolonema = new ModelHolonema();
        this.modelHybodus = new ModelHybodus();
        this.modelHyneria = new ModelHyneria();
        this.modelHyperodapedon = new ModelHyperodapedon();
        this.modelIniopteryx = new ModelIniopteryx();
        this.modelJanassa = new ModelJanassa();
        this.modelJonkeria = new ModelJonkeria();
        this.modelLaccognathus = new ModelLaccognathus();
        this.modelLaminacaris = new ModelLaminacaris();
        this.modelLebachacanthus = new ModelLebachacanthus();
        this.modelLimnoscelis = new ModelLimnoscelis();
        this.modelLisowicia = new ModelLisowicia();
        this.modelListracanthus = new ModelListracanthus();
        this.modelLonchidion = new ModelLonchidion();
        this.modelLotosaurus = new ModelLotosaurus();
        this.modelLunaspis = new ModelLunaspis();
        this.modelLuoxiongichthys = new ModelLuoxiongichthys();
        this.modelLystrosaurus = new ModelLystrosaurus();
        this.modelMastodonsaurus = new ModelMastodonsaurus();
        this.modelMcnamaraspis = new ModelMcnamaraspis();
        this.modelMegactenopetalus = new ModelMegactenopetalus();
        this.modelMelosaurus = new ModelMelosaurus();
        this.modelMetoposaurus = new ModelMetoposaurus();
        this.modelMixopterus = new ModelMixopterus();
        this.modelMoschops = new ModelMoschops();
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
        this.modelPlacodus = new ModelPlacodus();
        this.modelPlateosaurus = new ModelPlateosaurus();
        this.modelPlatycaraspis = new ModelPlatycaraspis();
        this.modelPlatylomaspis = new ModelPlatylomaspis();
        this.modelPlatysomus = new ModelPlatysomus();
        this.modelPoraspis = new ModelPoraspis();
        this.modelPristerognathus = new ModelPristerognathus();
        this.modelPromissum = new ModelPromissum();
        this.modelPsarolepis = new ModelPsarolepis();
        this.modelPteraspis = new ModelPteraspis();
        this.modelRebellatrix = new ModelRebellatrix();
        this.modelRhizodus = new ModelRhizodus();
        this.modelSacabambaspis = new ModelSacabambaspis();
        this.modelSauroctonus = new ModelSauroctonus();
        this.modelSaurichthys = new ModelSaurichthys();
        this.modelScaumenacia = new ModelScaumenacia();
        this.modelScutosaurus = new ModelScutosaurus();
        this.modelSemionotus = new ModelSemionotus();
        this.modelShringasaurus = new ModelShringasaurus();
        this.modelSillosuchus = new ModelSillosuchus();
        this.modelSmilosuchus = new ModelSmilosuchus();
        this.modelSmok = new ModelSmok();
        this.modelSphenacodon = new ModelSphenacodon();
        this.modelSquatinactis = new ModelSquatinactis();
        this.modelStagonolepis = new ModelStagonolepis();
        this.modelStensioella = new ModelStensioella();
        this.modelTanystropheus = new ModelTanystropheus();
        this.modelTartuosteus = new ModelTartuosteus();
        this.modelThelodus = new ModelThelodus();
        this.modelThrinacodus = new ModelThrinacodus();
        this.modelTorpedaspis = new ModelTorpedaspis();
        this.modelTraquairius = new ModelTraquairius();
        this.modelTullimonstrum = new ModelTullimonstrum();
        this.modelTurrisaspis = new ModelTurrisaspis();
        this.modelUranocentrodon = new ModelUranocentrodon();
        this.modelVancleavea = new ModelVancleavea();
        this.modelVarialepis = new ModelVarialepis();
        this.modelVivaxosaurus = new ModelVivaxosaurus();
        this.modelXenacanthus = new ModelXenacanthus();
        this.modelYunguisaurus = new ModelYunguisaurus();

    }

    public void setRotations(EnumFacing facing, double x, double y, double z, double voffset, double offset, double hoffset, float currentRotation) {
        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
            GlStateManager.translate(x + 0.5, y + 0.5, z + 0.5);
            GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
        }
        else if (facing == EnumFacing.NORTH)
        {
            GlStateManager.translate(x + 0.5 - hoffset, y + 0.5 + voffset, z + (1 - offset));
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
        }
        else if (facing == EnumFacing.SOUTH)
        {
            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(180, 0F, 1F, 0F);
            GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
        }
        else if (facing == EnumFacing.WEST)
        {
            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(270, 0F, 1F, 0F);
            GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
        }
        else if (facing == EnumFacing.EAST)
        {
            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(90, 0F, 1F, 0F);
            GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
        }
    }

    @Override
    public void render(BlockDisplayWallMount.TileEntityDisplayWallMount entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        EnumFacing facing;
        boolean itemRender  = true;
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

                    GlStateManager.pushMatrix();
                    GlStateManager.disableCull();
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.enableAlpha();

                    if (itemstack.getItem() == ItemTaxidermyDisplayItem.block) {

                        Class classEntity = getEntityFromNBT(itemstack);
                        if (classEntity != null) {
                            itemRender = false;

                            if (classEntity == EntityPrehistoricFloraAcanthodes.class) {
                                double offset = 0.04;
                                double voffset = 0.25;
                                double hoffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.35, 1.35, 1.35);
                                    this.bindTexture(TEXTURE_ACANTHODES);
                                    modelAcanthodes.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraAcrolepis.class) {
                                double offset = 0.04;
                                double voffset = 0.29;
                                double hoffset = 0.14;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.9, 1.9, 1.9);
                                    this.bindTexture(TEXTURE_ACROLEPIS);
                                    modelAcrolepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            }
                            //else if (classEntity == EntityPrehistoricFloraAetheolepis.class) {
                            //    itemRender = !renderAetheolepis(facing, currentRotation, x, y, z);
                            //}
                            else if (classEntity == EntityPrehistoricFloraAkmonistion.class) {
                                double offset = 0.06;
                                double voffset = 0.47;
                                double hoffset = 0.2;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2.1, 2.1, 2.1);
                                    this.bindTexture(TEXTURE_AKMONISTION);
                                    modelAkmonistion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraAlbertonia.class) {
                                double offset = 0.06;
                                double voffset = 0.07;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1, 1, 1);
                                    this.bindTexture(TEXTURE_ALBERTONIA);
                                    modelAlbertonia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraAllenypterus.class) {
                                double offset = 0.05;
                                double voffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(0.9, 0.9, 0.9);
                                    this.bindTexture(TEXTURE_ALLENYPTERUS);
                                    modelAllenypterus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraAnteosaurus.class) {
                                double offset = -0.5;
                                double voffset = 0.07;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(6.5, 6.5, 6.5);
                                    this.bindTexture(TEXTURE_ANTEOSAURUS);
                                    modelAnteosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }

                            } else if (classEntity == EntityPrehistoricFloraAntineosteus.class) {
                                double offset = 0.1;
                                double voffset = 1;
                                double hoffset = 0.8;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(4.8, 4.8, 4.8);
                                    this.bindTexture(TEXTURE_ANTINEOSTEUS);
                                    modelAntineosteus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }

                            } else if (classEntity == EntityPrehistoricFloraArandaspis.class) {
                                double offset = 0.02;
                                double voffset = 0.07;
                                double hoffset = 0.02;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.5, 1.5, 1.5);
                                    this.bindTexture(TEXTURE_ARANDASPIS);
                                    modelArandaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraArchosaurus.class) {
                                double offset = -0.15;
                                double voffset = 0.07;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.6, 1.6, 1.6);
                                    this.bindTexture(TEXTURE_ARCHOSAURUS);
                                    modelArchosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            }
                            else if (classEntity == EntityPrehistoricFloraArizonasaurus.class) {
                                double offset = -0.28;
                                double voffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3, 3, 3);
                                    this.bindTexture(TEXTURE_ARIZONASAURUS);
                                    modelArizonasaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraAteleaspis.class) {
                                double offset = 0.46;
                                double voffset = 0.03;
                                double hoffset = 0.05;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(1.9, 1.9, 1.9);
                                    this.bindTexture(TEXTURE_ATELEASPIS);
                                    modelAteleaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraAtopodentatus.class) {
                                double offset = -0.5;
                                double voffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2.3, 2.3, 2.3);
                                    this.bindTexture(TEXTURE_ATOPODENTATUS);
                                    modelAtopodentatus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraAstraspis.class) {
                                double offset = 0.24;
                                double voffset = 0;
                                double hoffset = 0.05;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(2, 2, 2);
                                    this.bindTexture(TEXTURE_ASTRASPIS);
                                    modelAstraspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            }
                            else if (classEntity == EntityPrehistoricFloraBandringa.class) {
                                double offset = -0.09;
                                double voffset = 0.54;
                                double hoffset = 0.2;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2.3, 2.3, 2.3);
                                    this.bindTexture(TEXTURE_BANDRINGA);
                                    modelBandringa.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraBarameda.class) {
                                double offset = 0.3;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(4.4, 4.4, 4.4);
                                    this.bindTexture(TEXTURE_BARAMEDA);
                                    modelBarameda.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraBarbclabornia.class) {
                                double offset = -0.76;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(5.3, 5.3, 5.3);
                                    this.bindTexture(TEXTURE_BARBCLABORNIA);
                                    modelBarbclabornia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraBatrachotomus.class) {
                                double offset = -0.68;
                                double voffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(6.1, 6.1, 6.1);
                                    this.bindTexture(TEXTURE_BATRACHOTOMUS);
                                    modelBatrachotomus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraBeishanichthys.class) {
                                double offset = 0.07;
                                //double voffset = 0.7;
                                double voffset = 0;
                                double hoffset = 0.08;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(0.06, 0.06, 0.06);
                                    this.bindTexture(TEXTURE_BEISHANICHTHYS);
                                    modelBeishanichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraBelantsea.class) {
                                double offset = 0.07;
                                double voffset = 0.03;
                                double hoffset = 0.06;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2.1, 2.1, 2.1);
                                    this.bindTexture(TEXTURE_BELANTSEA);
                                    modelBelantsea.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraBirgeria.class) {
                                double offset = -0.12;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3.5, 3.5, 3.5);
                                    this.bindTexture(TEXTURE_BIRGERIA);
                                    modelBirgeria.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraBirkenia.class) {
                                double offset = 0.04;
                                double voffset = 0.21;
                                double hoffset = 0.04;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.2, 1.2, 1.2);
                                    this.bindTexture(TEXTURE_BIRKENIA);
                                    modelBirkenia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraBlourugia.class) {
                                double offset = 0.08;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(0.9, 0.9, 0.9);
                                    this.bindTexture(TEXTURE_BLOURUGIA);
                                    modelBlourugia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraBobasatrania.class) {
                                double offset = 0.23;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(4, 4, 4);
                                    this.bindTexture(TEXTURE_BOBASATRANIA);
                                    modelBobasatrania.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraBoothiaspis.class) {
                                double offset = 0.38;
                                double voffset = 0;
                                double hoffset = 0.05;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(1.6, 1.6, 1.6);
                                    this.bindTexture(TEXTURE_BOOTHIASPIS);
                                    modelBoothiaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraBothriolepis.class) {
                                double offset = 0.56;
                                double voffset = 0.03;
                                double hoffset = 0.22;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(2.4, 2.4, 2.4);
                                    this.bindTexture(TEXTURE_BOTHRIOLEPIS);
                                    modelBothriolepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraBrembodus.class) {
                                double offset = 0.03;
                                double voffset = 0.1;
                                double hoffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1, 1, 1);
                                    this.bindTexture(TEXTURE_BREMBODUS);
                                    modelBrembodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraBrochoadmones.class) {
                                double offset = -0.02;
                                double voffset = 0.1;
                                double hoffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(0.7, 0.7, 0.7);
                                    this.bindTexture(TEXTURE_BROCHOADMONES);
                                    modelBrochoadmones.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraBunostegos.class) {
                                double offset = -0.21;
                                double voffset = 0.2;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(4.8, 4.8, 4.8);
                                    this.bindTexture(TEXTURE_BUNOSTEGOS);
                                    modelBunostegos.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraCarolowilhelmina.class) {
                                double offset = 0.12;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(4.2, 4.2, 4.2);
                                    this.bindTexture(TEXTURE_CAROLOWILHELMINA);
                                    modelCarolowilhelmina.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraCaturus.class) {
                                double offset = -0.03;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2.6, 2.6, 2.6);
                                    this.bindTexture(TEXTURE_CATURUS);
                                    modelCaturus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraCephalaspis.class) {
                                double offset = 0.46;
                                double voffset = 0.03;
                                double hoffset = 0.05;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(1.8, 1.8, 1.8);
                                    this.bindTexture(TEXTURE_CEPHALASPIS);
                                    modelCephalaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraCeratodus.class) {
                                double offset = 0.04;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(4, 4, 4);
                                    this.bindTexture(TEXTURE_CERATODUS);
                                    modelCeratodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraChinlea.class) {
                                double offset = 0.04;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.45, 1.45, 1.45);
                                    this.bindTexture(TEXTURE_CHINLEA);
                                    modelChinlea.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraCladoselache.class) {
                                double offset = -0.4;
                                double voffset = 0.55;
                                double hoffset = 0.9;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3.2, 3.2, 3.2);
                                    this.bindTexture(TEXTURE_CLADOSELACHE);
                                    modelCladoselache.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraClydagnathus.class) {
                                double offset = 0.05;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(0.7, 0.7, 0.7);
                                    this.bindTexture(TEXTURE_CLYDAGNATHUS);
                                    modelClydagnathus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraCobelodus.class) {
                                double offset = 0.17;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3.5, 3.5, 3.5);
                                    this.bindTexture(TEXTURE_COBELODUS);
                                    modelCobelodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraCoccosteus.class) {
                                double offset = -0.02;
                                double voffset = 0.01;
                                double hoffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(0.8, 0.8, 0.8);
                                    this.bindTexture(TEXTURE_COCCOSTEUS);
                                    modelCoccosteus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraCoelacanthus.class) {
                                double offset = 0.03;
                                double voffset = 0.08;
                                double hoffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.8, 1.8, 1.8);
                                    this.bindTexture(TEXTURE_COELACANTHUS);
                                    modelCoelacanthus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            }
                            else if (classEntity == EntityPrehistoricFloraCoelurosauravus.class) {
                                double offset = 0.03;
                                double voffset = 0.03;
                                double hoffset = 0.01;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(0.6, 0.6, 0.6);
                                    this.bindTexture(TEXTURE_COELUROSAURAVUS);
                                    modelWeigeltisaurid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraCotylorhynchus.class) {
                                double offset = -0.55;
                                double voffset = 0.2;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(6.6, 6.6, 6.6);
                                    this.bindTexture(TEXTURE_COTYLORHYNCHUS);
                                    modelCotylorhynchus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraCrassigyrinus.class) {
                                double offset = 0.03;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2.8, 2.8, 2.8);
                                    this.bindTexture(TEXTURE_CRASSIGYRINUS);
                                    modelCrassigyrinus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraCtenospondylus.class) {
                                double offset = -0.22;
                                double voffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3, 3, 3);
                                    this.bindTexture(TEXTURE_CTENOSPONDYLUS);
                                    modelCtenospondylus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraCynognathus.class) {
                                double offset = -0.27;
                                double voffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3.6, 3.6, 3.6);
                                    this.bindTexture(TEXTURE_CYNOGNATHUS);
                                    modelCynognathus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraDaedalichthys.class) {
                                double offset = -0.02;
                                double voffset = 0.2;
                                double hoffset = 0.07;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.1, 1.1, 1.1);
                                    this.bindTexture(TEXTURE_DAEDALICHTHYS);
                                    modelDaedalichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraDiadectes.class) {
                                double offset = -0.39;
                                double voffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(4.3, 4.3, 4.3);
                                    this.bindTexture(TEXTURE_DIADECTES);
                                    modelDiadectes.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraDoryaspis.class) {
                                double offset = 0.23;
                                double voffset = -0.01;
                                double hoffset = 0.02;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(1, 1, 1);
                                    this.bindTexture(TEXTURE_DORYASPIS);
                                    modelDoryaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraDorypterus.class) {
                                double offset = -0.02;
                                double voffset = 0.08;
                                double hoffset = 0.07;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(0.4, 0.4, 0.4);
                                    this.bindTexture(TEXTURE_DORYPTERUS);
                                    modelDorypterus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraDrepanaspis.class) {
                                double offset = 0.58;
                                double voffset = 0.03;
                                double hoffset = 0.02;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(2.4, 2.4, 2.4);
                                    this.bindTexture(TEXTURE_DREPANASPIS);
                                    modelDrepanaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            }  else if (classEntity == EntityPrehistoricFloraEbenaqua.class) {
                                double offset = -0.05;
                                double voffset = 0.05;
                                double hoffset = 0.07;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(0.35, 0.35, 0.35);
                                    this.bindTexture(TEXTURE_EBENAQUA);
                                    modelEbenaqua.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraEdestus.class) {
                                double offset = -1.01;
                                double voffset = 0.3;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(9.3, 9.3, 9.3);
                                    this.bindTexture(TEXTURE_EDESTUS);
                                    modelEdestus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraEglonaspis.class) {
                                double offset = 1.11;
                                double voffset = 0.01;
                                double hoffset = 0.02;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(4.5, 4.5, 4.5);
                                    this.bindTexture(TEXTURE_EGLONASPIS);
                                    modelEglonaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraEosaurichthys.class) {
                                double offset = 0.07;
                                double voffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.2, 1.2, 1.2);
                                    this.bindTexture(TEXTURE_EOSAURICHTHYS);
                                    modelSaurichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraEusthenopteron.class) {
                                double offset = -0.14;
                                double voffset = 0.41;
                                double hoffset = 0.6;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2, 2, 2);
                                    this.bindTexture(TEXTURE_EUSTHENOPTERON);
                                    modelEusthenopteron.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            }  else if (classEntity == EntityPrehistoricFloraFadeniaCarboniferous.class) {
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    itemRender = !renderFadeniaCarboniferous(facing, currentRotation, x, y, z);
                                }
                            } else if (classEntity == EntityPrehistoricFloraFadeniaPermotriassic.class) {
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    itemRender = !renderFadeniaPermotriassic(facing, currentRotation, x, y, z);
                                }
                            } else if (classEntity == EntityPrehistoricFloraFalcatus.class) {
                                double offset = 0.1;
                                //double voffset = 0.41;
                                //double hoffset = 0.6;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.7, 1.7, 1.7);
                                    this.bindTexture(TEXTURE_FALCATUS);
                                    modelFalcatus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraFeroxichthys.class) {
                                double offset = 0.1;
                                //double voffset = 0.41;
                                //double hoffset = 0.6;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1, 1, 1);
                                    this.bindTexture(TEXTURE_FEROXICHTHYS);
                                    modelFeroxichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraFurcacauda.class) {
                                double offset = 0.03;
                                double voffset = 0.23;
                                double hoffset = 0.05;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.2, 1.2, 1.2);
                                    this.bindTexture(TEXTURE_FURCACAUDA);
                                    modelFurcacauda.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraGabreyaspis.class) {
                                double offset = 0.44;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(1.8, 1.8, 1.8);
                                    this.bindTexture(TEXTURE_GABREYASPIS);
                                    modelGabreyaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraGantarostrataspis.class) {
                                double offset = 0.33;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(1.3, 1.3, 1.3);
                                    this.bindTexture(TEXTURE_GANTAROSTRATASPIS);
                                    modelGantarostrataspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            }  else if (classEntity == EntityPrehistoricFloraGlaurung.class) {
                                double offset = 0.03;
                                double voffset = 0.03;
                                double hoffset = 0.01;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(0.8, 0.8, 0.8);
                                    this.bindTexture(TEXTURE_GLAURUNG);
                                    modelWeigeltisaurid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraGnathorhiza.class) {
                                double offset = 0.05;
                                double voffset = 0.03;
                                double hoffset = 0.08;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.4, 1.4, 1.4);
                                    this.bindTexture(TEXTURE_GNATHORHIZA);
                                    modelGnathorhiza.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraGorgonops.class) {
                                double offset = -0.3;
                                double voffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2.9, 2.9, 2.9);
                                    this.bindTexture(TEXTURE_GORGONOPS);
                                    modelGorgonops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraGroenlandaspis.class) {
                                double offset = 0.02;
                                double voffset = 0.39;
                                double hoffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.9, 1.9, 1.9);
                                    this.bindTexture(TEXTURE_GROENLANDASPIS);
                                    modelGroenlandaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraGyracanthides.class) {
                                double offset = 0.65;
                                double voffset = 0.38;
                                double hoffset = 0.6;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(2.6, 2.6, 2.6);
                                    this.bindTexture(TEXTURE_GYRACANTHIDES);
                                    modelGyracanthides.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraHemicyclaspis.class) {
                                double offset = 0.46;
                                double voffset = 0.03;
                                double hoffset = 0.05;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(1.9, 1.9, 1.9);
                                    this.bindTexture(TEXTURE_HEMICYCLASPIS);
                                    modelHemicyclaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraHerrerasaurus.class) {
                                double offset = -0.85;
                                double voffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(4.5, 4.5, 4.5);
                                    this.bindTexture(TEXTURE_HERRERASAURUS);
                                    modelHerrerasaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraHeterosteus.class) {
                                double offset = -0.27;
                                double voffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(180, 0, 1, 0);
                                    GlStateManager.scale(6.5, 6.5, 6.5);
                                    this.bindTexture(TEXTURE_HETEROSTEUS);
                                    modelHeterosteus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraHibernaspis.class) {
                                double offset = 0.1;
                                double voffset = -0.26;
                                double hoffset = 0.05;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(1.8, 1.8, 1.8);
                                    this.bindTexture(TEXTURE_HIBERNASPIS);
                                    modelHibernaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraHolonema.class) {
                                double offset = 0.6;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(2.4, 2.4, 2.4);
                                    this.bindTexture(TEXTURE_HOLONEMA);
                                    modelHolonema.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraHybodus.class) {
                                double offset = 0.09;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3, 3, 3);
                                    this.bindTexture(TEXTURE_HYBODUS);
                                    modelHybodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraHyneria.class) {
                                double offset = -0.03;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(4.4, 4.4, 4.4);
                                    this.bindTexture(TEXTURE_HYNERIA);
                                    modelHyneria.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraHyperodapedon.class) {
                                double offset = -0.1;
                                double voffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(4.8, 4.8, 4.8);
                                    this.bindTexture(TEXTURE_HYPERODAPEDON);
                                    modelHyperodapedon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraIniopteryx.class) {
                                double offset = 0.06;
                                double voffset = 0.06;
                                double hoffset = 0.12;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.4, 1.4, 1.4);
                                    this.bindTexture(TEXTURE_INIOPTERYX);
                                    modelIniopteryx.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraJanassa.class) {
                                double offset = 0.39;
                                double voffset = -0.01;
                                double hoffset = 0.13;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(1.6, 1.6, 1.6);
                                    this.bindTexture(TEXTURE_JANASSA);
                                    modelJanassa.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraJonkeria.class) {
                                double offset = -0.6;
                                double voffset = 0.26;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(5.2, 5.2, 5.2);
                                    this.bindTexture(TEXTURE_JONKERIA);
                                    modelJonkeria.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraLaccognathus.class) {
                                double offset = 0.28;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(6.4, 6.4, 6.4);
                                    this.bindTexture(TEXTURE_LACCOGNATHUS);
                                    modelLaccognathus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraLaminacaris.class) {
                                double offset = 0.96;
                                //double voffset = -0.01;
                                double voffset = -0;
                                //double hoffset = 0.43;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(3.8, 3.8, 3.8);
                                    this.bindTexture(TEXTURE_LAMINACARIS);
                                    modelLaminacaris.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraLebachacanthus.class) {
                                double offset = 0.09;
                                double voffset = 0.7;
                                double hoffset = 0.5;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3.8, 3.8, 3.8);
                                    this.bindTexture(TEXTURE_LEBACHACANTHUS);
                                    modelLebachacanthus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraLimnoscelis.class) {
                                double offset = -0.15;
                                double voffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2, 2, 2);
                                    this.bindTexture(TEXTURE_LIMNOSCELIS);
                                    modelLimnoscelis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraLisowicia.class) {
                                double offset = -0.79;
                                double voffset = 0.5;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(7.6, 7.6, 7.6);
                                    this.bindTexture(TEXTURE_LISOWICIA);
                                    modelLisowicia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraListracanthus.class) {
                                double offset = 0.06;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3.4, 3.4, 3.4);
                                    this.bindTexture(TEXTURE_LISTRACANTHUS);
                                    modelListracanthus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraLonchidion.class) {
                                double offset = -0.02;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.9, 1.9, 1.9);
                                    this.bindTexture(TEXTURE_LONCHIDION);
                                    modelLonchidion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraLotosaurus.class) {
                                double offset = -0.3;
                                double voffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(5.2, 5.2, 5.2);
                                    this.bindTexture(TEXTURE_LOTOSAURUS);
                                    modelLotosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraLunaspis.class) {
                                double offset = 0.45;
                                //double voffset = -0.01;
                                double voffset = 0;
                                //double hoffset = 0.13;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(1.9, 1.9, 1.9);
                                    this.bindTexture(TEXTURE_LUNASPIS);
                                    modelLunaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraLuoxiongichthys.class) {
                                double offset = 0.04;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(0.7, 0.7, 0.7);
                                    this.bindTexture(TEXTURE_LUOXIONGICHTHYS);
                                    modelLuoxiongichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraLystrosaurus.class) {
                                double offset = -0.25;
                                double voffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3.7, 3.7, 3.7);
                                    this.bindTexture(TEXTURE_LYSTROSAURUS);
                                    modelLystrosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraMastodonsaurus.class) {
                                double offset = -0.9;
                                double voffset = 0.15;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(7.1, 7.1, 7.1);
                                    this.bindTexture(TEXTURE_MASTODONSAURUS);
                                    modelMastodonsaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraMcnamaraspis.class) {
                                double offset = 0.04;
                                //double voffset = 0.06;
                                //double hoffset = 0.12;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(0.85, 0.85, 0.85);
                                    this.bindTexture(TEXTURE_MCNAMARASPIS);
                                    modelMcnamaraspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraMegactenopetalus.class) {
                                double offset = -0.04;
                                double voffset = 0.03;
                                double hoffset = 0.06;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(5.4, 5.4, 5.4);
                                    this.bindTexture(TEXTURE_MEGACTENOPETALUS);
                                    modelMegactenopetalus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraMelosaurus.class) {
                                double offset = -0.12;
                                double voffset = 0.04;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3, 3, 3);
                                    this.bindTexture(TEXTURE_MELOSAURUS);
                                    modelMelosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraMetoposaurus.class) {
                                double offset = -0.26;
                                double voffset = 0.04;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(5.4 * 0.8F, 5.4 * 0.8F, 5.4 * 0.8F);
                                    this.bindTexture(TEXTURE_METOPOSAURUS);
                                    modelMetoposaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraMixopterus.class) {
                                double offset = 0.42;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(1.8, 1.8, 1.8);
                                    this.bindTexture(TEXTURE_MIXOPTERUS);
                                    modelMixopterus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraMoschops.class) {
                                double offset = -0.45;
                                double voffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(4.5, 4.5, 4.5);
                                    this.bindTexture(TEXTURE_MOSCHOPS);
                                    modelMoschops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraOnychodus.class) {
                                double offset = 0.06;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(4.8, 4.8, 4.8);
                                    this.bindTexture(TEXTURE_ONYCHODUS);
                                    modelOnychodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraOphiacodon.class) {
                                double offset = -0.15;
                                double voffset = 0.04;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2.5, 2.5, 2.5);
                                    this.bindTexture(TEXTURE_OPHIACODON);
                                    modelOphiacodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            }
                            else if (classEntity == EntityPrehistoricFloraOrodus.class) {
                                double offset = -0.14;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3, 3, 3);
                                    this.bindTexture(TEXTURE_ORODUS);
                                    modelOrodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraOrnithoprion.class) {
                                double offset = 0.04;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1, 1, 1);
                                    this.bindTexture(TEXTURE_ORNITHOPRION);
                                    modelOrnithoprion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraOsteolepis.class) {
                                double offset = -0.04;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.4 * 1.2F, 1.4 * 1.2F, 1.4 * 1.2F);
                                    this.bindTexture(TEXTURE_OSTEOLEPIS);
                                    modelOsteolepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraPalaeoniscum.class) {
                                double offset = 0.02;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(0.9, 0.9, 0.9);
                                    this.bindTexture(TEXTURE_PALAEONISCUM);
                                    modelPalaeoniscum.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraPanderichthys.class) {
                                double offset = 0.73;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(3, 3, 3);
                                    this.bindTexture(TEXTURE_PANDERICHTHYS);
                                    modelPanderichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraPanderodus.class) {
                                double offset = 0.02;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(0.55, 0.55, 0.55);
                                    this.bindTexture(TEXTURE_PANDERODUS);
                                    modelPanderodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraParanaichthys.class) {
                                double offset = 0.02;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.4, 1.4, 1.4);
                                    this.bindTexture(TEXTURE_PARANAICHTHYS);
                                    modelParanaichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraParatarrasius.class) {
                                double offset = -0.01;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(0.8, 0.8, 0.8);
                                    this.bindTexture(TEXTURE_PARATARRASIUS);
                                    modelParatarrasius.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraParexus.class) {
                                double offset = -0.04;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.2, 1.2, 1.2);
                                    this.bindTexture(TEXTURE_PAREXUS);
                                    modelParexus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraParhybodus.class) {
                                double offset = 0.09;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.9, 1.9, 1.9);
                                    this.bindTexture(TEXTURE_PARHYBODUS);
                                    modelHybodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraPelurgaspis.class) {
                                double offset = 0.09;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2.3, 2.3, 2.3);
                                    this.bindTexture(TEXTURE_PELURGASPIS);
                                    modelPelurgaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraPharyngolepis.class) {
                                double offset = -0.06;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.5, 1.5, 1.5);
                                    this.bindTexture(TEXTURE_PHARYNGOLEPIS);
                                    modelPharyngolepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraPholiderpeton.class) {
                                double offset = -0.43;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3.8, 3.8, 3.8);
                                    this.bindTexture(TEXTURE_PHOLIDERPETON);
                                    modelPholiderpeton.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraPlacodus.class) {
                                double offset = -0.26;
                                double voffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2.6 * 1.2F, 2.6 * 1.2F, 2.6 * 1.2F);
                                    this.bindTexture(TEXTURE_PLACODUS);
                                    modelPlacodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraPlateosaurus.class) {
                                double offset = -1.4;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(7, 7, 7);
                                    this.bindTexture(TEXTURE_PLATEOSAURUS);
                                    modelPlateosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraPlatycaraspis.class) {
                                double offset = 0.31;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(1.3, 1.3, 1.3);
                                    this.bindTexture(TEXTURE_PLATYCARASPIS);
                                    modelPlatycaraspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraPlatylomaspis.class) {
                                double offset = 0.24;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(1, 1, 1);
                                    this.bindTexture(TEXTURE_PLATYLOMASPIS);
                                    modelPlatylomaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraPlatysomus.class) {
                                double offset = 0.06;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1, 1, 1);
                                    this.bindTexture(TEXTURE_PLATYSOMUS);
                                    modelPlatysomus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraPoraspis.class) {
                                double offset = 0.13;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2, 2, 2);
                                    this.bindTexture(TEXTURE_PORASPIS);
                                    modelPoraspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            }  else if (classEntity == EntityPrehistoricFloraPristerognathus.class) {
                                double offset = -0.3;
                                double voffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2.6, 2.6, 2.6);
                                    this.bindTexture(TEXTURE_PRISTEROGNATHUS);
                                    modelPristerognathus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraPromissum.class) {
                                double offset = 0.04;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.4, 1.4, 1.4);
                                    this.bindTexture(TEXTURE_PROMISSUM);
                                    modelPromissum.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraPsarolepis.class) {
                                double offset = 0.06;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.3, 1.3, 1.3);
                                    this.bindTexture(TEXTURE_PSAROLEPIS);
                                    modelPsarolepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraPteraspis.class) {
                                double offset = 0.12;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.8, 1.8, 1.8);
                                    this.bindTexture(TEXTURE_PTERASPIS);
                                    modelPteraspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            }  else if (classEntity == EntityPrehistoricFloraRautiania.class) {
                                double offset = 0.03;
                                double voffset = 0.03;
                                double hoffset = 0.01;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(0.8, 0.8, 0.8);
                                    this.bindTexture(TEXTURE_RAUTIANIA);
                                    modelWeigeltisaurid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraRebellatrix.class) {
                                double offset = 0.06;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2.5, 2.5, 2.5);
                                    this.bindTexture(TEXTURE_REBELLATRIX);
                                    modelRebellatrix.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraRhizodus.class) {
                                double offset = -0.7;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(6.5, 6.5, 6.5);
                                    this.bindTexture(TEXTURE_RHIZODUS);
                                    modelRhizodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraSacabambaspis.class) {
                                double offset = 0.12;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.4, 1.4, 1.4);
                                    this.bindTexture(TEXTURE_SACABAMBASPIS);
                                    modelSacabambaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraSaurichthysMarine.class) {
                                double offset = 0.15;
                                double voffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3.1, 3.1, 3.1);
                                    this.bindTexture(TEXTURE_SAURICHTHYS_M);
                                    modelSaurichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraSaurichthysFreshwater.class) {
                                double offset = 0.1;
                                double voffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.2, 1.2, 1.2);
                                    this.bindTexture(TEXTURE_SAURICHTHYS_F);
                                    modelSaurichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraSauroctonus.class) {
                                double offset = -0.3;
                                double voffset = 0.15;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3, 3, 3);
                                    this.bindTexture(TEXTURE_SAUROCTONUS);
                                    modelSauroctonus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraScaumenacia.class) {
                                double offset = 0.18;
                                double voffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2.1, 2.1, 2.1);
                                    this.bindTexture(TEXTURE_SCAUMENACIA);
                                    modelScaumenacia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraScutosaurus.class) {
                                double offset = -0.36;
                                double voffset = 0.15;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(5.2, 5.2, 5.2);
                                    this.bindTexture(TEXTURE_SCUTOSAURUS);
                                    modelScutosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraSemionotus.class) {
                                double offset = 0.13;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.2, 1.2, 1.2);
                                    this.bindTexture(TEXTURE_SEMIONOTUS);
                                    modelSemionotus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraShringasaurus.class) {
                                double offset = -0.45;
                                double voffset = 0.07;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(4.2, 4.2, 4.2);
                                    this.bindTexture(TEXTURE_SHRINGASAURUS);
                                    modelShringasaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraSillosuchus.class) {
                                double offset = -1.2;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(6.8, 6.8, 6.8);
                                    this.bindTexture(TEXTURE_SILLOSUCHUS);
                                    modelSillosuchus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraSmilosuchus.class) {
                                double offset = 0.4;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(4.3, 4.3, 4.3);
                                    this.bindTexture(TEXTURE_SMILOSUCHUS);
                                    modelSmilosuchus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraSmok.class) {
                                itemRender = !renderSmok(facing, currentRotation, x, y, z);
                            } else if (classEntity == EntityPrehistoricFloraSphenacodon.class) {
                                double offset = -0.31;
                                double voffset = 0.15;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3.6, 3.6, 3.6);
                                    this.bindTexture(TEXTURE_SPHENACODON);
                                    modelSphenacodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraSquatinactis.class) {
                                double offset = 0.42;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(1.6, 1.6, 1.6);
                                    this.bindTexture(TEXTURE_SQUATINACTIS);
                                    modelSquatinactis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraStagonolepis.class) {
                                double offset = -0.36;
                                double voffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(4.2, 4.2, 4.2);
                                    this.bindTexture(TEXTURE_STAGONOLEPIS);
                                    modelStagonolepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraStensioella.class) {
                                double offset = 0.03;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(1.2, 1.2, 1.2);
                                    this.bindTexture(TEXTURE_STENSIOELLA);
                                    modelStensioella.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraTanystropheus.class) {
                                double offset = -0.3;
                                double voffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(0.25, 0.25, 0.25);
                                    this.bindTexture(TEXTURE_TANYSTROPHEUS);
                                    modelTanystropheus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraTartuosteus.class) {
                                double offset = 0.13;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3, 3, 3);
                                    this.bindTexture(TEXTURE_TARTUOSTEUS);
                                    modelTartuosteus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraThelodus.class) {
                                double offset = 0.67;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(3, 3, 3);
                                    this.bindTexture(TEXTURE_THELODUS);
                                    modelThelodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraThrinacodus.class) {
                                double offset = 0.19;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(0.7, 0.7, 0.7);
                                    this.bindTexture(TEXTURE_THRINACODUS);
                                    modelThrinacodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraTorpedaspis.class) {
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    itemRender = !renderTorpedaspis(facing, currentRotation, x, y, z);
                                }
                            } else if (classEntity == EntityPrehistoricFloraTraquairius.class) {
                                double offset = 0.13;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1.4, 1.4, 1.4);
                                    this.bindTexture(TEXTURE_TRAQUAIRIUS);
                                    modelTraquairius.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraTullimonstrum.class) {
                                double offset = 0.22;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(2.6, 2.6, 2.6);
                                    this.bindTexture(TEXTURE_TULLIMONSTRUM);
                                    modelTullimonstrum.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraTurrisaspis.class) {
                                double offset = 0.03;
                                //double voffset = 0.06;
                                double voffset = 0;
                                //double hoffset = 0.12;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1, 1, 1);
                                    this.bindTexture(TEXTURE_TURRISASPIS);
                                    modelTurrisaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraUranocentrodon.class) {
                                double offset = -0.3;
                                double voffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3, 3, 3);
                                    this.bindTexture(TEXTURE_URANOCENTRODON);
                                    modelUranocentrodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraVancleavea.class) {
                                double offset = -0.48;
                                double voffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(0.35, 0.35, 0.35);
                                    this.bindTexture(TEXTURE_VANCLEAVEA);
                                    modelVancleavea.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraVarialepis.class) {
                                double offset = 0.14;
                                double voffset = 0;
                                double hoffset = 0;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(1, 1, 1);
                                    this.bindTexture(TEXTURE_VARIALEPIS);
                                    modelVarialepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraVivaxosaurus.class) {
                                double offset = -0.3;
                                double voffset = 0.1;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(4.5, 4.5, 4.5);
                                    this.bindTexture(TEXTURE_VIVAXOSAURUS);
                                    modelVivaxosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraWeigeltisaurus.class) {
                                double offset = 0.03;
                                double voffset = 0.03;
                                double hoffset = 0.01;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1, 0, 0);
                                    GlStateManager.scale(0.8, 0.8, 0.8);
                                    this.bindTexture(TEXTURE_WEIGELTISAURUS);
                                    modelWeigeltisaurid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            } else if (classEntity == EntityPrehistoricFloraXenacanthus.class) {
                                double offset = -0.07;
                                double voffset = 0.7;
                                double hoffset = 0.5;
                                if (facing == EnumFacing.NORTH) {
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
                                if (facing == EnumFacing.UP || facing == EnumFacing.DOWN) {
                                    itemRender = true;
                                }
                                else {
                                    GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                                    GlStateManager.scale(3.2, 3.2, 3.2);
                                    this.bindTexture(TEXTURE_XENACANTHUS);
                                    modelXenacanthus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                }
                            }
                            else {

                                double offsetWall = 0;
                                double upperfrontverticallinedepth = 0;
                                double upperbackverticallinedepth = 0;
                                double upperfrontlineoffset = 0;
                                double upperfrontlineoffsetperpendiular = 0;
                                double upperbacklineoffset = 0;
                                double upperbacklineoffsetperpendiular = 0;
                                double lowerfrontverticallinedepth = 0;
                                double lowerbackverticallinedepth = 0;
                                double lowerfrontlineoffset = 0;
                                double lowerfrontlineoffsetperpendiular = 0;
                                double lowerbacklineoffset = 0;
                                double lowerbacklineoffsetperpendiular = 0F;
                                ResourceLocation textureDisplay = null;
                                ModelBase modelDisplay = null;
                                float getScaler = 0;

                                Method method = testAndGetMethod(classEntity, "offsetWall", new Class[]{});
                                if (method != null) {
                                    try {
                                        offsetWall = (double) method.invoke(null, new Object[]{});
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                } else {
                                    itemRender = true;
                                }
                                method = testAndGetMethod(classEntity, "upperfrontverticallinedepth", new Class[]{});
                                if (method != null) {
                                    try {
                                        upperfrontverticallinedepth = (double) method.invoke(null, new Object[]{});
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                } else {
                                    itemRender = true;
                                }
                                method = testAndGetMethod(classEntity, "upperbackverticallinedepth", new Class[]{});
                                if (method != null) {
                                    try {
                                        upperbackverticallinedepth = (double) method.invoke(null, new Object[]{});
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                } else {
                                    itemRender = true;
                                }
                                method = testAndGetMethod(classEntity, "upperfrontlineoffset", new Class[]{});
                                if (method != null) {
                                    try {
                                        upperfrontlineoffset = (double) method.invoke(null, new Object[]{});
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                } else {
                                    itemRender = true;
                                }
                                method = testAndGetMethod(classEntity, "upperfrontlineoffsetperpendiular", new Class[]{});
                                if (method != null) {
                                    try {
                                        upperfrontlineoffsetperpendiular = (double) method.invoke(null, new Object[]{});
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                } else {
                                    itemRender = true;
                                }
                                method = testAndGetMethod(classEntity, "upperbacklineoffset", new Class[]{});
                                if (method != null) {
                                    try {
                                        upperbacklineoffset = (double) method.invoke(null, new Object[]{});
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                } else {
                                    itemRender = true;
                                }
                                method = testAndGetMethod(classEntity, "upperbacklineoffsetperpendiular", new Class[]{});
                                if (method != null) {
                                    try {
                                        upperbacklineoffsetperpendiular = (double) method.invoke(null, new Object[]{});
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                } else {
                                    itemRender = true;
                                }
                                method = testAndGetMethod(classEntity, "lowerfrontverticallinedepth", new Class[]{});
                                if (method != null) {
                                    try {
                                        lowerfrontverticallinedepth = (double) method.invoke(null, new Object[]{});
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                } else {
                                    itemRender = true;
                                }
                                method = testAndGetMethod(classEntity, "lowerbackverticallinedepth", new Class[]{});
                                if (method != null) {
                                    try {
                                        lowerbackverticallinedepth = (double) method.invoke(null, new Object[]{});
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                } else {
                                    itemRender = true;
                                }
                                method = testAndGetMethod(classEntity, "lowerfrontlineoffset", new Class[]{});
                                if (method != null) {
                                    try {
                                        lowerfrontlineoffset = (double) method.invoke(null, new Object[]{});
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                } else {
                                    itemRender = true;
                                }
                                method = testAndGetMethod(classEntity, "lowerfrontlineoffsetperpendiular", new Class[]{});
                                if (method != null) {
                                    try {
                                        lowerfrontlineoffsetperpendiular = (double) method.invoke(null, new Object[]{});
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                } else {
                                    itemRender = true;
                                }
                                method = testAndGetMethod(classEntity, "lowerbacklineoffset", new Class[]{});
                                if (method != null) {
                                    try {
                                        lowerbacklineoffset = (double) method.invoke(null, new Object[]{});
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                } else {
                                    itemRender = true;
                                }
                                method = testAndGetMethod(classEntity, "lowerbacklineoffsetperpendiular", new Class[]{});
                                if (method != null) {
                                    try {
                                        lowerbacklineoffsetperpendiular = (double) method.invoke(null, new Object[]{});
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                } else {
                                    itemRender = true;
                                }
                                method = testAndGetMethod(classEntity, "textureDisplay", new Class[]{});
                                if (method != null) {
                                    try {
                                        textureDisplay = (ResourceLocation) method.invoke(null, new Object[]{});
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                } else {
                                    itemRender = true;
                                }
                                method = testAndGetMethod(classEntity, "modelDisplay", new Class[]{});
                                if (method != null) {
                                    try {
                                        modelDisplay = (ModelBase) method.invoke(null, new Object[]{});
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                } else {
                                    itemRender = true;
                                }
                                method = testAndGetMethod(classEntity, "getScaler", new Class[]{});
                                if (method != null) {
                                    try {
                                        getScaler = (float) method.invoke(null, new Object[]{});
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                } else {
                                    itemRender = true;
                                }

                                if (!itemRender) {
                                    try {
                                        itemRender = !renderTaxidermy(facing, (float) x, (float) y, (float) z, currentRotation,
                                            textureDisplay, getScaler, modelDisplay,
                                            offsetWall, 0, 0,
                                            upperfrontverticallinedepth, upperbackverticallinedepth, upperfrontlineoffset, upperfrontlineoffsetperpendiular, upperbacklineoffset, upperbacklineoffsetperpendiular,
                                            lowerfrontverticallinedepth, lowerbackverticallinedepth, lowerfrontlineoffset, lowerfrontlineoffsetperpendiular, lowerbacklineoffset, lowerbacklineoffsetperpendiular);
                                    } catch (Exception e) {
                                        itemRender = true;
                                    }
                                }
                            }

                           //else {
                           //     itemRender = true;
                           // }
                        }
                        else {
                            itemRender = true;
                        }
                    }


                    // ********************************************************************
                    if (itemRender) { //standard items
                        itemRender = true;

                        GlStateManager.alphaFunc(516, 0.1F);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        //GlStateManager.pushMatrix();

                        float scale = 0.6666F;
                        if (facing == EnumFacing.UP) {
                            GlStateManager.translate(x + 0.5, y + 0.02, z + 0.5);
                            GlStateManager.scale(scale, scale, scale);
                        }
                        if (facing == EnumFacing.DOWN) {
                            GlStateManager.translate(x + 0.5, y + 0.98, z + 0.5);
                            GlStateManager.scale(scale, scale, scale);
                        }
                        if (facing == EnumFacing.NORTH) {
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
                    } else {
                        GlStateManager.disableAlpha();
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();
                    }

                }
            }
        }
    }

    /*
    public boolean renderAetheolepis(EnumFacing facing, float currentRotation, double x, double y, double z) {
        if (facing == EnumFacing.DOWN || facing == EnumFacing.UP) {
            return false;
        }
        double offset = 0.01;
        double voffset = 0;
        double hoffset = 0;
        setRotations(facing, x, y, z, voffset, offset, hoffset, currentRotation);
        float scalerModel = RenderAetheolepis.getScaler();
        GlStateManager.scale(this.scaler * scalerModel,this.scaler * scalerModel,this.scaler * scalerModel);
        this.bindTexture(TEXTURE_AETHEOLEPIS);
        modelAetheolepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
        return true;
    }
     */



    public boolean renderFadeniaCarboniferous(EnumFacing facing, float currentRotation, double x, double y, double z) {
        if (facing == EnumFacing.DOWN || facing == EnumFacing.UP) {
            return false;
        }
        double offset = 0.1;
        double voffset = 0;
        double hoffset = 0;
        setRotations(facing, x, y, z, voffset, offset, hoffset, currentRotation);
        float scalerModel = RenderFadeniaCarboniferous.getScaler();
        GlStateManager.scale(this.scaler * scalerModel,this.scaler * scalerModel,this.scaler * scalerModel);
        this.bindTexture(TEXTURE_FADENIAC);
        modelFadenia.renderStaticC(Minecraft.getMinecraft().player.ticksExisted);
        return true;
    }

    public boolean renderFadeniaPermotriassic(EnumFacing facing, float currentRotation, double x, double y, double z) {
        if (facing == EnumFacing.DOWN || facing == EnumFacing.UP) {
            return false;
        }
        double offset = 0.05;
        double voffset = 0;
        double hoffset = 0;
        setRotations(facing, x, y, z, voffset, offset, hoffset, currentRotation);
        float scalerModel = RenderFadeniaPermotriassic.getScaler();
        GlStateManager.scale(this.scaler * scalerModel,this.scaler * scalerModel,this.scaler * scalerModel);
        this.bindTexture(TEXTURE_FADENIAPT);
        modelFadenia.renderStaticPT(Minecraft.getMinecraft().player.ticksExisted);
        return true;
    }


/*
    public boolean renderNotidanoides(EnumFacing facing, float currentRotation, double x, double y, double z) {
        if (facing == EnumFacing.DOWN || facing == EnumFacing.UP) {
            return false;
        }
        double offset = 0.59;
        double voffset = 0;
        double hoffset = 0;
        setRotations(facing, x, y, z, voffset, offset, hoffset, currentRotation);
        float scalerModel = RenderNotidanoides.getScaler();
        GlStateManager.scale(this.scaler * scalerModel,this.scaler * scalerModel,this.scaler * scalerModel);
        this.bindTexture(TEXTURE_NOTIDANOIDES);
        modelNotidanoides.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
        return true;
    }
 */

    public boolean renderSmok(EnumFacing facing, float currentRotation, double x, double y, double z) {
        if (facing == EnumFacing.DOWN || facing == EnumFacing.UP) {
            return false;
        }
        double offset = -0.25;
        double voffset = 0.0;
        double hoffset = 0.0;
        setRotations(facing, x, y, z, voffset, offset, hoffset, currentRotation);
        float scalerModel = RenderSmok.getScaler();
        GlStateManager.scale(this.scaler * scalerModel,this.scaler * scalerModel,this.scaler * scalerModel);
        this.bindTexture(TEXTURE_SMOK);
        modelSmok.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
        return true;
    }

    public boolean renderTorpedaspis(EnumFacing facing, float currentRotation, double x, double y, double z) {
        if (facing == EnumFacing.DOWN || facing == EnumFacing.UP) {
            return false;
        }
        double offset = 0.30;
        double voffset = 0;
        double hoffset = 0;
        setRotations(facing, x, y, z, voffset, offset, hoffset, currentRotation);
        GlStateManager.rotate(90, 1, 0, 0);
        float scalerModel = RenderTorpedaspis.getScaler();
        GlStateManager.scale(this.scaler * scalerModel,this.scaler * scalerModel,this.scaler * scalerModel);
        this.bindTexture(TEXTURE_TORPEDASPIS);
        modelTorpedaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
        return true;
    }


    @Nullable
    public Class getEntityFromNBT(ItemStack stack) {
        if (!stack.hasTagCompound()) {
            return null;
        }
        if (!stack.getTagCompound().hasKey("PFMob")) {
            return null;
        }
        Class classOut = null;
        NBTTagCompound blockNBT = (NBTTagCompound) stack.getTagCompound().getTag("PFMob");
        String stringDNA = (blockNBT.getString("id"));
        if (stringDNA != null) {
            classOut = findEntity(stringDNA);
        }
        return classOut;
    }

    @Nullable
    private static Class<? extends Entity> findEntity(String entity) {
        Class<? extends Entity> entityClass;
        EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(entity));
        entityClass = ee == null ? null : ee.getEntityClass();
        if (entityClass == null) {
            return null;
        }
        return entityClass;
    }

    public boolean renderTaxidermy(EnumFacing facing, float x, float y, float z,
           float currentRotation,
           ResourceLocation TEXTURE,
           float scalerModel,
           ModelBase model,
           double offset,
           double voffset,
           double hoffset,
           double upperfrontverticallinedepth,
           double upperbackverticallinedepth,
           double upperfrontlineoffset,
           double upperfrontlineoffsetperpendiular,
           double upperbacklineoffset,
           double upperbacklineoffsetperpendiular,
           double lowerfrontverticallinedepth,
           double lowerbackverticallinedepth,
           double lowerfrontlineoffset,
           double lowerfrontlineoffsetperpendiular,
           double lowerbacklineoffset,
           double lowerbacklineoffsetperpendiular
    ) {
        if (facing == EnumFacing.DOWN) {
            Method renderMethod = testAndGetMethod(model.getClass(), "renderStaticSuspended", new Class[] { float.class });
            if (renderMethod != null) {
                if (upperfrontverticallinedepth > 0) {
                    GL11.glPushMatrix();
                    GL11.glLineWidth(5);
                    GL11.glDisable(GL11.GL_TEXTURE_2D);
                    GL11.glColor3ub((byte) 128, (byte) 128, (byte) 128);
                    GL11.glBegin(GL11.GL_LINES);
                    float xoffsetter = (float) ((upperfrontlineoffset * Math.cos(Math.toRadians(-currentRotation))) + (upperfrontlineoffsetperpendiular * Math.sin(Math.toRadians(currentRotation))));
                    float zoffsetter = (float) ((upperfrontlineoffset * Math.sin(Math.toRadians(-currentRotation))) + (upperfrontlineoffsetperpendiular * Math.cos(Math.toRadians(currentRotation))));
                    GL11.glVertex3f((float) x + 0.5F + xoffsetter, (float) y + 1, (float) z + 0.5F + zoffsetter);
                    GL11.glVertex3f((float) x + 0.5F + xoffsetter, (float) y + 1 - (float) upperfrontverticallinedepth, (float) z + 0.5F + zoffsetter);
                    GL11.glEnd();
                    GL11.glEnable(GL11.GL_TEXTURE_2D);
                    GL11.glPopMatrix();
                }

                if (upperbackverticallinedepth > 0) {
                    GL11.glPushMatrix();
                    GL11.glLineWidth(5);
                    GL11.glDisable(GL11.GL_TEXTURE_2D);
                    GL11.glColor3ub((byte) 128, (byte) 128, (byte) 128);
                    GL11.glBegin(GL11.GL_LINES);
                    float xoffsetter = (float) ((upperbacklineoffset * Math.cos(Math.toRadians(-currentRotation))) - (upperbacklineoffsetperpendiular * Math.sin(Math.toRadians(currentRotation))));
                    float zoffsetter = (float) ((upperbacklineoffset * Math.sin(Math.toRadians(-currentRotation))) - (upperbacklineoffsetperpendiular * Math.cos(Math.toRadians(currentRotation))));
                    GL11.glVertex3f((float) x + 0.5F - (float) xoffsetter, (float) y + 1, (float) z + 0.5F - zoffsetter);
                    GL11.glVertex3f((float) x + 0.5F - (float) xoffsetter, (float) y + 1 - (float) upperbackverticallinedepth, (float) z + 0.5F - zoffsetter);
                    GL11.glEnd();
                    GL11.glEnable(GL11.GL_TEXTURE_2D);
                    GL11.glPopMatrix();
                }

                setRotations(facing, x, y, z, voffset, 0, 0, currentRotation);
                GlStateManager.rotate(180, 0, 0, 1);
                GlStateManager.scale(this.scaler * scalerModel, this.scaler * scalerModel, this.scaler * scalerModel);
                this.bindTexture(TEXTURE);
                GlStateManager.enableLighting();
                GL11.glColor3ub((byte) 255, (byte) 255, (byte) 255);
                if (renderMethod != null) {
                    try {
                        renderMethod.invoke(model, Minecraft.getMinecraft().player.ticksExisted);
                    } catch (Exception e) {
                        return false;
                    }
                    return true;
                } else {
                    return false;
                }
            }
        }
        else if (facing == EnumFacing.UP) {
            //Arrow to show location:
            if (ClientProxyLepidodendronMod.keyB.isKeyDown()) {
                GL11.glPushMatrix();
                GL11.glLineWidth(12);
                GL11.glDisable(GL11.GL_TEXTURE_2D);
                GL11.glColor3ub((byte) 255, (byte) 0, (byte) 0);
                GL11.glBegin(GL11.GL_LINES);
                GL11.glVertex3f((float) x + 0.5F, (float) y + 0.125F, (float) z + 0.5F);
                GL11.glVertex3f((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
                GL11.glEnd();
                GL11.glBegin(GL11.GL_LINES);
                GL11.glVertex3f((float) x + 0.5F, (float) y + 0.125F, (float) z + 0.5F);
                GL11.glVertex3f((float) x + 0.5F + 0.5F, (float) y + 0.5F, (float) z + 0.5F);
                GL11.glEnd();
                GL11.glBegin(GL11.GL_LINES);
                GL11.glVertex3f((float) x + 0.5F, (float) y + 0.125F, (float) z + 0.5F);
                GL11.glVertex3f((float) x + 0.5F - 0.5F, (float) y + 0.5F, (float) z + 0.5F);
                GL11.glEnd();
                GL11.glEnable(GL11.GL_TEXTURE_2D);
                GL11.glPopMatrix();
            }
            Method renderMethod = testAndGetMethod(model.getClass(), "renderStaticFloor", new Class[] { float.class });
            if (renderMethod != null) {
                if (lowerfrontverticallinedepth > 0) {
                    GL11.glPushMatrix();
                    GL11.glLineWidth(5);
                    GL11.glDisable(GL11.GL_TEXTURE_2D);
                    GL11.glColor3ub((byte) 128, (byte) 128, (byte) 128);
                    GL11.glBegin(GL11.GL_LINES);
                    float xoffsetter = (float) ((lowerfrontlineoffset * Math.cos(Math.toRadians(-currentRotation))) + (lowerfrontlineoffsetperpendiular * Math.sin(Math.toRadians(currentRotation))));
                    float zoffsetter = (float) ((lowerfrontlineoffset * Math.sin(Math.toRadians(-currentRotation))) + (lowerfrontlineoffsetperpendiular * Math.cos(Math.toRadians(currentRotation))));
                    GL11.glVertex3f((float) x + 0.5F + (float) xoffsetter, (float) y, (float) z + 0.5F + zoffsetter);
                    GL11.glVertex3f((float) x + 0.5F + (float) xoffsetter, (float) y + (float) lowerfrontverticallinedepth, (float) z + 0.5F + zoffsetter);
                    GL11.glEnd();
                    GL11.glEnable(GL11.GL_TEXTURE_2D);
                    GL11.glPopMatrix();
                }

                if (lowerbackverticallinedepth > 0) {
                    GL11.glPushMatrix();
                    GL11.glLineWidth(5);
                    GL11.glDisable(GL11.GL_TEXTURE_2D);
                    GL11.glColor3ub((byte) 128, (byte) 128, (byte) 128);
                    GL11.glBegin(GL11.GL_LINES);
                    float xoffsetter = (float) ((lowerbacklineoffset * Math.cos(Math.toRadians(-currentRotation))) - (lowerbacklineoffsetperpendiular * Math.sin(Math.toRadians(currentRotation))));
                    float zoffsetter = (float) ((lowerbacklineoffset * Math.sin(Math.toRadians(-currentRotation))) - (lowerbacklineoffsetperpendiular * Math.cos(Math.toRadians(currentRotation))));
                    GL11.glVertex3f((float) x + 0.5F - (float) xoffsetter, (float) y, (float) z + 0.5F - zoffsetter);
                    GL11.glVertex3f((float) x + 0.5F - (float) xoffsetter, (float) y + (float) lowerbackverticallinedepth, (float) z + 0.5F - zoffsetter);
                    GL11.glEnd();
                    GL11.glEnable(GL11.GL_TEXTURE_2D);
                    GL11.glPopMatrix();
                }

                setRotations(facing, x, y, z, voffset, 0, 0, currentRotation);
                GlStateManager.rotate(180, 0, 0, 1);
                GlStateManager.scale(this.scaler * scalerModel, this.scaler * scalerModel, this.scaler * scalerModel);
                this.bindTexture(TEXTURE);
                GlStateManager.enableLighting();
                GL11.glColor3ub((byte) 255, (byte) 255, (byte) 255);
                if (renderMethod != null) {
                    try {
                        renderMethod.invoke(model, Minecraft.getMinecraft().player.ticksExisted);
                    } catch (Exception e) {
                        return false;
                    }
                    return true;
                } else {
                    return false;
                }
            }
        }
        else if (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH || facing == EnumFacing.EAST || facing == EnumFacing.WEST) {
            Method renderMethod = testAndGetMethod(model.getClass(), "renderStaticWall", new Class[] { float.class });
            if (renderMethod != null) {
                setRotations(facing, x, y, z, voffset, offset, hoffset, currentRotation);
                //GlStateManager.rotate(90, 0, 0, 1);
                GlStateManager.scale(this.scaler * scalerModel, this.scaler * scalerModel, this.scaler * scalerModel);
                this.bindTexture(TEXTURE);
                GlStateManager.enableLighting();
                GL11.glColor3ub((byte) 255, (byte) 255, (byte) 255);

                try {
                    renderMethod.invoke(model, Minecraft.getMinecraft().player.ticksExisted);
                } catch (Exception e) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Nullable
    public static Method testAndGetMethod(Class clazz, String methodname, Class[] params) {
        Method methodToFind = null;
        try {
            methodToFind = clazz.getMethod(methodname, params);
        } catch (NoSuchMethodException | SecurityException e) {
        }
        return methodToFind;
    }
}