package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockDisplayCase;
import net.lepidodendron.entity.*;
import net.lepidodendron.entity.model.entity.*;
import net.lepidodendron.entity.render.entity.RenderEryon;
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

import javax.annotation.Nullable;
import java.lang.reflect.Method;

public class RenderDisplayCase extends TileEntitySpecialRenderer<BlockDisplayCase.TileEntityDisplayCase> {

    public final float scaler = 6.0F;

    public static final PropertyDirection FACING = BlockDirectional.FACING;

    private static final ResourceLocation TEXTURE_GERARUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerarus.png");
    private final ModelGerarus modelGerarus;
    private static final ResourceLocation TEXTURE_AEGER = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aeger_red.png");
    private final ModelAeger modelAeger;
    private static final ResourceLocation TEXTURE_AINIKTOZOON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ainiktozoon.png");
    private final ModelAiniktozoon modelAiniktozoon;
    private static final ResourceLocation TEXTURE_ACADOARADOXIDES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acadoaradoxides.png");
    private final ModelAcadoaradoxides modelAcadoaradoxides;
    private static final ResourceLocation TEXTURE_ADELOPHTHALMUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/adelophthalmus.png");
    private final ModelAdelophthalmus modelAdelophthalmus;
    private static final ResourceLocation TEXTURE_ALACARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/alacaris.png");
    private final ModelAlacaris modelAlacaris;
    private static final ResourceLocation TEXTURE_AMPLECTOBELUA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/amplectobelua.png");
    private final ModelAmplectobelua modelAmplectobelua;
    private static final ResourceLocation TEXTURE_AMPYX = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ampyx.png");
    private final ModelAmpyx modelAmpyx;
    private static final ResourceLocation TEXTURE_ANOMALOCARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anomalocaris.png");
    private final ModelAnomalocaris modelAnomalocaris;
    private static final ResourceLocation TEXTURE_ANTARCTICARCINUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/antarcticarcinus.png");
    private final ModelAntarcticarcinus modelAntarcticarcinus;
    private static final ResourceLocation TEXTURE_ARIDROACHOID = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/roachoid_arid.png");
    private static final ResourceLocation TEXTURE_ARCHOBLATTINA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archoblattina.png");
    private final ModelArchoblattina modelArchoblattina;
    private static final ResourceLocation TEXTURE_ARCTINURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/arctinurus.png");
    private final ModelArctinurus modelArctinurus;
    private static final ResourceLocation TEXTURE_ASAPHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/asaphus.png");
    private final ModelAsaphus modelAsaphus;
    private static final ResourceLocation TEXTURE_ATTERCOPUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/attercopus.png");
    private static final ResourceLocation TEXTURE_AULACOCERAS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aulacoceras.png");
    private final ModelAulacoceras modelAulacoceras;
    private static final ResourceLocation TEXTURE_AUSTROLIMULUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/austrolimulus.png");
    private final ModelAustrolimulus modelAustrolimulus;
    private static final ResourceLocation TEXTURE_BANFFIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/banffia.png");
    private final ModelBanffia modelBanffia;
    private static final ResourceLocation TEXTURE_BOHEMOHARPES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bohemoharpes.png");
    private final ModelBohemoharpes modelBohemoharpes;
    private static final ResourceLocation TEXTURE_BUSHIZHEIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bushizheia.png");
    private final ModelBushizheia modelBushizheia;
    private static final ResourceLocation TEXTURE_CALVAPILOSA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/calvapilosa.png");
    private final ModelCalvapilosa modelCalvapilosa;
    private static final ResourceLocation TEXTURE_CAMBRORASTER = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cambroraster.png");
    private final ModelCambroraster modelCambroraster;
    private static final ResourceLocation TEXTURE_CANADASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/canadaspis.png");
    private final ModelCanadaspis modelCanadaspis;
    private static final ResourceLocation TEXTURE_CANADIA_LAYER = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/canadia_transparent.png");
    private static final ResourceLocation TEXTURE_CANADIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/canadia.png");
    private final ModelCanadia modelCanadia;
    private static final ResourceLocation TEXTURE_CHEIRURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cheirurus.png");
    private final ModelCheirurus modelCheirurus;
    private static final ResourceLocation TEXTURE_CHELONIELLON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cheloniellon.png");
    private final ModelCheloniellon modelCheloniellon;
    private static final ResourceLocation TEXTURE_CHOTECOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/chotecops.png");
    private final ModelChotecops modelChotecops;
    private static final ResourceLocation TEXTURE_CLATROTITAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_clatrotitan.png");
    private static final ResourceLocation TEXTURE_CLATROTITAN_WING = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_clatrotitan_wing.png");
    private final ModelTitanoptera modelTitanoptera;
    private static final ResourceLocation TEXTURE_CROTALOCEPHALUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/crotalocephalus.png");
    private final ModelCrotalocephalus modelCrotalocephalus;
    private static final ResourceLocation TEXTURE_CRYPTOMARTUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_5.png");
    private static final ResourceLocation TEXTURE_DALMANITES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dalmanites.png");
    private final ModelDalmanites modelDalmanites;
    private static final ResourceLocation TEXTURE_DELITZSCHALA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/delitzschala.png");
    private final ModelPalaeodictyoptera modelPalaeodictyoptera;
    private static final ResourceLocation TEXTURE_DIANIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diania.png");
    private static final ResourceLocation TEXTURE_DIANIA_NERF = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diania_nerf.png");
    private final ModelDiania modelDiania;
    private static final ResourceLocation TEXTURE_DROTOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/drotops.png");
    private final ModelDrotops modelDrotops;
    private static final ResourceLocation TEXTURE_DUNBARIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dunbaria.png");
    private static final ResourceLocation TEXTURE_ELLIPSOCEPHALUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ellipsocephalus.png");
    private final ModelEllipsocephalus modelEllipsocephalus;
    private static final ResourceLocation TEXTURE_ELRATHIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/elrathia.png");
    private final ModelElrathia modelElrathia;
    private static final ResourceLocation TEXTURE_ENOPLOURA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/enoploura.png");
    private final ModelEnoploura modelEnoploura;
    private static final ResourceLocation TEXTURE_EOARTHROPLEURA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eoarthropleura.png");
    private final ModelEoarthropleura modelEoarthropleura;
    private static final ResourceLocation TEXTURE_EOPHRYNUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_6.png");
    private static final ResourceLocation TEXTURE_EOREDLICHIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eoredlichia.png");
    private final ModelEoredlichia modelEoredlichia;
    private static final ResourceLocation TEXTURE_ERICIXERXES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ericixerxes.png");
    private final ModelEricixerxes modelEricixerxes;
    private static final ResourceLocation TEXTURE_EURYPTERUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eurypterus.png");
    private final ModelEurypterus modelEurypterus;
    private static final ResourceLocation TEXTURE_GONDWANASCORPIO = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_gondwanascorpio.png");
    private static final ResourceLocation TEXTURE_GIGANTOSCORPIO = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_gigantoscorpio.png");
    private final ModelScorpion modelScorpion;
    private static final ResourceLocation TEXTURE_FORESTROACHOID = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/roachoid_forest.png");
    private static final ResourceLocation TEXTURE_GIGATITAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_gigatitan.png");
    private static final ResourceLocation TEXTURE_GIGATITAN_WING = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_gigatitan_wing.png");
    private static final ResourceLocation TEXTURE_HAIKOUICHTHYS_FIN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/haikouichthys_transparent.png");
    private static final ResourceLocation TEXTURE_HAIKOUICHTHYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/haikouichthys.png");
    private final ModelHaikouichthys modelHaikouichthys;
    private static final ResourceLocation TEXTURE_HALLUCIGENIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hallucigenia.png");
    private static final ResourceLocation TEXTURE_HALLUCIGENIA_NERF = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hallucigenia_nerf.png");
    private final ModelHallucigenia modelHallucigenia;
    private static final ResourceLocation TEXTURE_HARPES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/harpes.png");
    private final ModelHarpes modelHarpes;
    private static final ResourceLocation TEXTURE_HARVESTMAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/harvestman.png");
    private final ModelHarvestman modelHarvestman;
    private static final ResourceLocation TEXTURE_HELIOPELTIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/heliopeltis.png");
    private final ModelHeliopeltis modelHeliopeltis;
    private static final ResourceLocation TEXTURE_HELMETIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/helmetia.png");
    private final ModelHelmetia modelHelmetia;
    private static final ResourceLocation TEXTURE_HOMOIOPTERA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/homoioptera.png");
    private static final ResourceLocation TEXTURE_HOMALONEURA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/homaloneura.png");
    private static final ResourceLocation TEXTURE_HUNGIOIDES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hungioides.png");
    private final ModelHungioides modelHungioides;
    private static final ResourceLocation TEXTURE_ISOTELUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/isotelus.png");
    private final ModelIsotelus modelIsotelus;
    private static final ResourceLocation TEXTURE_ITALOPHLEBIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/italophlebia.png");
    private static final ResourceLocation TEXTURE_ITALOPHLEBIA_WING = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/italophlebia_wing.png");
    private final ModelItalophlebia modelItalophlebia;
    private static final ResourceLocation TEXTURE_JIANSHANOPODIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jianshanopodia.png");
    private final ModelJianshanopodia modelJianshanopodia;
    private static final ResourceLocation TEXTURE_KALBARRIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kalbarria.png");
    private final ModelKalbarria modelKalbarria;
    private static final ResourceLocation TEXTURE_KERYGMACHELA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kerygmachela.png");
    private final ModelKerygmachela modelKerygmachela;
    private static final ResourceLocation TEXTURE_KODYMIRUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kodymirus.png");
    private final ModelKodymirus modelKodymirus;
    private static final ResourceLocation TEXTURE_KOKOMOPTERUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kokomopterus.png");
    private final ModelKokomopterus modelKokomopterus;
    private static final ResourceLocation TEXTURE_KREISCHERIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_2.png");
    private static final ResourceLocation TEXTURE_LANCEASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lanceaspis.png");
    private final ModelLanceaspis modelLanceaspis;
    private static final ResourceLocation TEXTURE_LIMULID = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/limulid.png");
    private final ModelLimulid modelLimulid;
    private static final ResourceLocation TEXTURE_LOCHMANOLENELLUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lochmanolenellus.png");
    private final ModelLochmanolenellus modelLochmanolenellus;
    private static final ResourceLocation TEXTURE_LONCHODOMAS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lonchodomas.png");
    private final ModelLonchodomas modelLonchodomas;
    private static final ResourceLocation TEXTURE_LITHOMANTIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lithomantis.png");
    private static final ResourceLocation TEXTURE_LUNATASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lunataspis.png");
    private final ModelLunataspis modelLunataspis;
    private static final ResourceLocation TEXTURE_LYCOCERCUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lycocercus.png");
    private static final ResourceLocation TEXTURE_LYRARAPAX = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lyrarapax.png");
    private final ModelLyrarapax modelLyrarapax;
    private static final ResourceLocation TEXTURE_MARRELLA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/marrella.png");
    private final ModelMarrella modelMarrella;
    private static final ResourceLocation TEXTURE_MEGANEUROPSIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/meganeuropsis.png");
    private static final ResourceLocation TEXTURE_MEGANEUROPSIS_WING = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/meganeuropsis_wing.png");
    private final ModelMeganeuropsis modelMeganeuropsis;
    private static final ResourceLocation TEXTURE_MEGANEURA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/meganeura.png");
    private static final ResourceLocation TEXTURE_MEGANEURA_WING = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/meganeura_wing.png");
    private static final ResourceLocation TEXTURE_MEGARACHNE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megarachne.png");
    private final ModelMegarachne modelMegarachne;
    private static final ResourceLocation TEXTURE_MESOTITAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_mesotitan.png");
    private static final ResourceLocation TEXTURE_MESOTITAN_WING = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/titanoptera_mesotitan_wing.png");
    private static final ResourceLocation TEXTURE_METASPRIGGINA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/metaspriggina.png");
    private final ModelMetaspriggina modelMetaspriggina;
    private static final ResourceLocation TEXTURE_MICRODICTYON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/microdictyon.png");
    private final ModelMicrodictyon modelMicrodictyon;
    private static final ResourceLocation TEXTURE_MIMETASTER = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mimetaster.png");
    private final ModelMimetaster modelMimetaster;
    private static final ResourceLocation TEXTURE_MONTECARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/montecaris.png");
    private final ModelMontecaris modelMontecaris;
    private static final ResourceLocation TEXTURE_NAHECARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nahecaris.png");
    private final ModelNahecaris modelNahecaris;
    private static final ResourceLocation TEXTURE_NECTOCARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nectocaris.png");
    private final ModelNectocaris modelNectocaris;
    private static final ResourceLocation TEXTURE_ODARAIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/odaraia.png");
    private final ModelOdaraia modelOdaraia;
    private static final ResourceLocation TEXTURE_ODONTOGRIPHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/odontogriphus.png");
    private final ModelOdontogriphus modelOdontogriphus;
    private static final ResourceLocation TEXTURE_OGYGINUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ogyginus.png");
    private final ModelOgyginus modelOgyginus;
    private static final ResourceLocation TEXTURE_OPABINIA_NERF =  new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/opabinia_nerf.png");
    private static final ResourceLocation TEXTURE_OPABINIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/opabinia.png");
    private final ModelOpabinia modelOpabinia;
    private static final ResourceLocation TEXTURE_OPOLANKA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/opolanka.png");
    private final ModelOpolanka modelOpolanka;
    private static final ResourceLocation TEXTURE_OPSIEOBUTHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_opsieobuthus.png");
    private static final ResourceLocation TEXTURE_ORTHROZANCLUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/orthrozanclus.png");
    private final ModelOrthrozanclus modelOrthrozanclus;
    private static final ResourceLocation TEXTURE_OTTOIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ottoia.png");
    private final ModelOttoia modelOttoia;
    private static final ResourceLocation TEXTURE_PALAEOCHARINUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_4.png");
    private static final ResourceLocation TEXTURE_PALAEOISOPUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeoisopus.png");
    private final ModelPalaeoisopus modelPalaeoisopus;
    private static final ResourceLocation TEXTURE_PALAEONTINID = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeontinid.png");
    private final ModelPalaeontinid modelPalaeontinid;
    private static final ResourceLocation TEXTURE_PALAEOTARBUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_1.png");
    private static final ResourceLocation TEXTURE_PARADOXIDES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paradoxides.png");
    private final ModelParadoxides modelParadoxides;
    private static final ResourceLocation TEXTURE_PARAPEYTOIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parapeytoia.png");
    private final ModelParapeytoia modelParapeytoia;
    private static final ResourceLocation TEXTURE_PARVANCORINA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parvancorina.png");
    private final ModelParvancorina modelParvancorina;
    private static final ResourceLocation TEXTURE_PAUCIPODIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paucipodia.png");
    private final ModelPaucipodia modelPaucipodia;
    private static final ResourceLocation TEXTURE_PERMOTARBUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_3.png");
    private final ModelTrigonotarbid modelTrigonotarbid;
    private static final ResourceLocation TEXTURE_PHANTASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phantaspis.png");
    private final ModelPhantaspis modelPhantaspis;
    private static final ResourceLocation TEXTURE_PIKAIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pikaia.png");
    private final ModelPikaia modelPikaia;
    private static final ResourceLocation TEXTURE_PNEUMODESMUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pneumodesmus.png");
    private final ModelPneumodesmus modelPneumodesmus;
    private static final ResourceLocation TEXTURE_POMATRUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pomatrum.png");
    private final ModelPomatrum modelPomatrum;
    private static final ResourceLocation TEXTURE_PROFALLOTASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/profallotaspis.png");
    private final ModelProfallotaspis modelProfallotaspis;
    private static final ResourceLocation TEXTURE_PROTOZYGOPTERA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/protozygoptera.png");
    private static final ResourceLocation TEXTURE_PROTOZYGOPTERA_WING = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/protozygoptera_wing.png");
    private final ModelProtozygoptera modelProtozygoptera;
    private static final ResourceLocation TEXTURE_PULMONOSCORPIO = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scorpion_pulmonoscorpius_pp.png");
    private static final ResourceLocation TEXTURE_RETIFACIES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/retifacies.png");
    private final ModelRetifacies modelRetifacies;
    private static final ResourceLocation TEXTURE_SCHINDERHANNES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/schinderhannes.png");
    private final ModelSchinderhannes modelSchinderhannes;
    private static final ResourceLocation TEXTURE_SELENOPELTIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/selenopeltis.png");
    private final ModelSelenopeltis modelSelenopeltis;
    private static final ResourceLocation TEXTURE_SIBERION = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/siberion.png");
    private final ModelSiberion modelSiberion;
    private static final ResourceLocation TEXTURE_SIDNEYIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sidneyia.png");
    private final ModelSidneyia modelSidneyia;
    private static final ResourceLocation TEXTURE_STENODICTYA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/stenodictya.png");
    private static final ResourceLocation TEXTURE_SINODUNBARIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sinodunbaria.png");
    private static final ResourceLocation TEXTURE_SWAMPROACHOID = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/roachoid_swamp.png");
    private final ModelRoachoid modelRoachoid;
    private static final ResourceLocation TEXTURE_SKEEMELLA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/skeemella.png");
    private final ModelSkeemella modelSkeemella;
    private static final ResourceLocation TEXTURE_SYLLIPSIMOPODI = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/syllipsimopodi.png");
    private final ModelSyllipsimopodi modelSyllipsimopodi;
    private static final ResourceLocation TEXTURE_SYNOPHALOS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/synophalos_1.png");
    private final ModelSynophalos modelSynophalos;
    private static final ResourceLocation TEXTURE_TEGOPELTE_LAYER = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tegopelte_shell.png");
    private static final ResourceLocation TEXTURE_TEGOPELTE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tegopelte.png");
    private final ModelTegopelte modelTegopelte;
    private static final ResourceLocation TEXTURE_TERATASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/terataspis.png");
    private final ModelTerataspis modelTerataspis;
    private static final ResourceLocation TEXTURE_TOKUMMIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tokummia.png");
    private static final ResourceLocation TEXTURE_TOKUMMIA_NERF = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tokummia_nerf.png");
    private final ModelTokummia modelTokummia;
    private static final ResourceLocation TEXTURE_TRIMERUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trimerus.png");
    private final ModelTrimerus modelTrimerus;
    private static final ResourceLocation TEXTURE_TYRANNOPHONTES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tyrannophontes.png");
    private final ModelTyrannophontes modelTyrannophontes;
    private static final ResourceLocation TEXTURE_URALICHAS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/uralichas.png");
    private final ModelUralichas modelUralichas;
    private static final ResourceLocation TEXTURE_VETULICOLA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vetulicola.png");
    private final ModelVetulicola modelVetulicola;
    private static final ResourceLocation TEXTURE_WALLISEROPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/walliserops.png");
    private final ModelWalliserops modelWalliserops;
    private static final ResourceLocation TEXTURE_WEINBERGINA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/weinbergina.png");
    private final ModelWeinbergina modelWeinbergina;
    private static final ResourceLocation TEXTURE_WILLWERATHIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/willwerathia.png");
    private final ModelWillwerathia modelWillwerathia;
    private static final ResourceLocation TEXTURE_WINGERTSHELLICUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/wingertshellicus.png");
    private final ModelWingertshellicus modelWingertshellicus;
    private static final ResourceLocation TEXTURE_WIWAXIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/wiwaxia.png");
    private final ModelWiwaxia modelWiwaxia;
    private static final ResourceLocation TEXTURE_XENUSION = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/xenusion.png");
    private final ModelXenusion modelXenusion;
    private static final ResourceLocation TEXTURE_YAWUNIK = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yawunik.png");
    private final ModelYawunik modelYawunik;
    private static final ResourceLocation TEXTURE_YOHOIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yohoia.png");
    private final ModelYohoia modelYohoia;
    private static final ResourceLocation TEXTURE_YUNNANOZOON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/yunnanozoon.png");
    private final ModelYunnanozoon modelYunnanozoon;

    private static final ResourceLocation TEXTURE_ERYON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eryon.png");
    private final ModelEryon modelEryon;

    public RenderDisplayCase() {
        this.modelGerarus = new ModelGerarus();
        this.modelAeger = new ModelAeger();
        this.modelAiniktozoon = new ModelAiniktozoon();
        this.modelAcadoaradoxides = new ModelAcadoaradoxides();
        this.modelAdelophthalmus = new ModelAdelophthalmus();
        this.modelAlacaris = new ModelAlacaris();
        this.modelAmplectobelua = new ModelAmplectobelua();
        this.modelAmpyx = new ModelAmpyx();
        this.modelAnomalocaris = new ModelAnomalocaris();
        this.modelAntarcticarcinus = new ModelAntarcticarcinus();
        this.modelArchoblattina = new ModelArchoblattina();
        this.modelArctinurus = new ModelArctinurus();
        this.modelAsaphus = new ModelAsaphus();
        this.modelAulacoceras = new ModelAulacoceras();
        this.modelAustrolimulus = new ModelAustrolimulus();
        this.modelBanffia = new ModelBanffia();
        this.modelBohemoharpes = new ModelBohemoharpes();
        this.modelBushizheia = new ModelBushizheia();
        this.modelCalvapilosa = new ModelCalvapilosa();
        this.modelCambroraster = new ModelCambroraster();
        this.modelCanadaspis = new ModelCanadaspis();
        this.modelCanadia = new ModelCanadia();
        this.modelCheirurus = new ModelCheirurus();
        this.modelCheloniellon = new ModelCheloniellon();
        this.modelChotecops = new ModelChotecops();
        this.modelCrotalocephalus = new ModelCrotalocephalus();
        this.modelDalmanites = new ModelDalmanites();
        this.modelDiania = new ModelDiania();
        this.modelDrotops = new ModelDrotops();
        this.modelEllipsocephalus= new ModelEllipsocephalus();
        this.modelElrathia= new ModelElrathia();
        this.modelEnoploura= new ModelEnoploura();
        this.modelEoarthropleura= new ModelEoarthropleura();
        this.modelEoredlichia= new ModelEoredlichia();
        this.modelEricixerxes= new ModelEricixerxes();
        this.modelEurypterus= new ModelEurypterus();
        this.modelHaikouichthys= new ModelHaikouichthys();
        this.modelHallucigenia= new ModelHallucigenia();
        this.modelHarpes= new ModelHarpes();
        this.modelHarvestman= new ModelHarvestman();
        this.modelHeliopeltis= new ModelHeliopeltis();
        this.modelHelmetia= new ModelHelmetia();
        this.modelHungioides= new ModelHungioides();
        this.modelIsotelus= new ModelIsotelus();
        this.modelItalophlebia= new ModelItalophlebia();
        this.modelJianshanopodia= new ModelJianshanopodia();
        this.modelKalbarria= new ModelKalbarria();
        this.modelKerygmachela= new ModelKerygmachela();
        this.modelKodymirus= new ModelKodymirus();
        this.modelKokomopterus= new ModelKokomopterus();
        this.modelLanceaspis= new ModelLanceaspis();
        this.modelLimulid= new ModelLimulid();
        this.modelLochmanolenellus= new ModelLochmanolenellus();
        this.modelLonchodomas= new ModelLonchodomas();
        this.modelLunataspis = new ModelLunataspis();
        this.modelLyrarapax = new ModelLyrarapax();
        this.modelMarrella = new ModelMarrella();
        this.modelMeganeuropsis = new ModelMeganeuropsis();
        this.modelMegarachne = new ModelMegarachne();
        this.modelMetaspriggina = new ModelMetaspriggina();
        this.modelMicrodictyon = new ModelMicrodictyon();
        this.modelMimetaster = new ModelMimetaster();
        this.modelMontecaris = new ModelMontecaris();
        this.modelNahecaris = new ModelNahecaris();
        this.modelNectocaris = new ModelNectocaris();
        this.modelOdaraia = new ModelOdaraia();
        this.modelOdontogriphus = new ModelOdontogriphus();
        this.modelOgyginus = new ModelOgyginus();
        this.modelOpabinia = new ModelOpabinia();
        this.modelOpolanka = new ModelOpolanka();
        this.modelOrthrozanclus = new ModelOrthrozanclus();
        this.modelOttoia = new ModelOttoia();
        this.modelPalaeodictyoptera = new ModelPalaeodictyoptera();
        this.modelPalaeoisopus = new ModelPalaeoisopus();
        this.modelPalaeontinid = new ModelPalaeontinid();
        this.modelParadoxides = new ModelParadoxides();
        this.modelParapeytoia = new ModelParapeytoia();
        this.modelParvancorina = new ModelParvancorina();
        this.modelPaucipodia = new ModelPaucipodia();
        this.modelPhantaspis = new ModelPhantaspis();
        this.modelPikaia = new ModelPikaia();
        this.modelPneumodesmus = new ModelPneumodesmus();
        this.modelPomatrum = new ModelPomatrum();
        this.modelProfallotaspis = new ModelProfallotaspis();
        this.modelProtozygoptera = new ModelProtozygoptera();
        this.modelRetifacies = new ModelRetifacies();
        this.modelRoachoid = new ModelRoachoid();
        this.modelSchinderhannes = new ModelSchinderhannes();
        this.modelScorpion= new ModelScorpion();
        this.modelSelenopeltis = new ModelSelenopeltis();
        this.modelSiberion = new ModelSiberion();
        this.modelSidneyia = new ModelSidneyia();
        this.modelSkeemella = new ModelSkeemella();
        this.modelSyllipsimopodi = new ModelSyllipsimopodi();
        this.modelSynophalos = new ModelSynophalos();
        this.modelTegopelte = new ModelTegopelte();
        this.modelTerataspis = new ModelTerataspis();
        this.modelTitanoptera = new ModelTitanoptera();
        this.modelTokummia = new ModelTokummia();
        this.modelTrigonotarbid = new ModelTrigonotarbid();
        this.modelTrimerus = new ModelTrimerus();
        this.modelTyrannophontes = new ModelTyrannophontes();
        this.modelUralichas = new ModelUralichas();
        this.modelVetulicola = new ModelVetulicola();
        this.modelWalliserops = new ModelWalliserops();
        this.modelWeinbergina = new ModelWeinbergina();
        this.modelWillwerathia = new ModelWillwerathia();
        this.modelWingertshellicus = new ModelWingertshellicus();
        this.modelWiwaxia = new ModelWiwaxia();
        this.modelXenusion = new ModelXenusion();
        this.modelYawunik = new ModelYawunik();
        this.modelYohoia = new ModelYohoia();
        this.modelYunnanozoon = new ModelYunnanozoon();

        this.modelEryon = new ModelEryon();
    }

    @Override
    public void render(BlockDisplayCase.TileEntityDisplayCase entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
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
                if (te instanceof BlockDisplayCase.TileEntityDisplayCase) {
                    BlockDisplayCase.TileEntityDisplayCase tee = (BlockDisplayCase.TileEntityDisplayCase) te;
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

                            if (classEntity == EntityPrehistoricFloraGerarusInsect.class) {
                                double offset = 0.12;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_GERARUS);
                                modelGerarus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAcadoaradoxides.class) {
                                double offset = 0.54;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_ACADOARADOXIDES);
                                modelAcadoaradoxides.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAdelophthalmus.class) {
                                double offset = 0.43;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.9F, 0.9F, 0.9F);
                                this.bindTexture(TEXTURE_ADELOPHTHALMUS);
                                modelAdelophthalmus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAeger.class) {
                                double offset = 0.27;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.3, 0.3, 0.3);
                                this.bindTexture(TEXTURE_AEGER);
                                modelAeger.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAiniktozoon.class) {
                                double offset = 0.44;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_AINIKTOZOON);
                                modelAiniktozoon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAlacaris.class) {
                                double offset = 0.35;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.5, 1.5, 1.5);
                                this.bindTexture(TEXTURE_ALACARIS);
                                modelAlacaris.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAmplectobelua.class) {
                                double offset = 0.48;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_AMPLECTOBELUA);
                                modelAmplectobelua.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAmpyx.class) {
                                double offset = 0.19;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.35F, 0.35F, 0.35F);
                                this.bindTexture(TEXTURE_AMPYX);
                                modelAmpyx.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAnomalocaris.class) {
                                double offset = 0.46;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1, 0.85, 1);
                                this.bindTexture(TEXTURE_ANOMALOCARIS);
                                modelAnomalocaris.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAntarcticarcinus.class) {
                                double offset = 0.46;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.8, 1.8, 1.8);
                                this.bindTexture(TEXTURE_ANTARCTICARCINUS);
                                modelAntarcticarcinus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraRoachoidAridInsect.class) {
                                double offset = 0.29;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                this.bindTexture(TEXTURE_ARIDROACHOID);
                                modelRoachoid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraArchoblattinaInsect.class) {
                                double offset = 0.37;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.7F, 0.7F, 0.7F);
                                this.bindTexture(TEXTURE_ARCHOBLATTINA);
                                modelArchoblattina.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraArctinurus.class) {
                                double offset = 0.37;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.4F, 0.4F, 0.4F);
                                this.bindTexture(TEXTURE_ARCTINURUS);
                                modelArctinurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAsaphus.class) {
                                double offset = 0.57;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(2.3, 2.3, 2.3);
                                this.bindTexture(TEXTURE_ASAPHUS);
                                modelAsaphus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAttercopus.class) {
                                double offset = 0.43;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.8F, 0.8F, 0.8F);
                                this.bindTexture(TEXTURE_ATTERCOPUS);
                                modelTrigonotarbid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAulacoceras.class) {
                                double offset = 0.29;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.9F, 0.9F, 0.9F);
                                this.bindTexture(TEXTURE_AULACOCERAS);
                                modelAulacoceras.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAustrolimulus.class) {
                                double offset = 0.26;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.3F, 0.3F, 0.3F);
                                this.bindTexture(TEXTURE_AUSTROLIMULUS);
                                modelAustrolimulus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraBanffia.class) {
                                double offset = 0.37;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.5, 1.5, 1.5);
                                this.bindTexture(TEXTURE_BANFFIA);
                                modelBanffia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraBohemoharpes.class) {
                                double offset = 0.32;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.3F, 1.3F, 1.3F);
                                this.bindTexture(TEXTURE_BOHEMOHARPES);
                                modelBohemoharpes.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraBushizheia.class) {
                                double offset = 0.34;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_BUSHIZHEIA);
                                modelBushizheia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraCalvapilosa.class) {
                                double offset = 0.34;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.4F, 1.4F, 1.4F);
                                this.bindTexture(TEXTURE_CALVAPILOSA);
                                modelCalvapilosa.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraCambroraster.class) {
                                double offset = 0.68;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1F, 0.7F, 1F);
                                this.bindTexture(TEXTURE_CAMBRORASTER);
                                modelCambroraster.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraCanadaspis.class) {
                                double offset = 0.36;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.4, 1.4, 1.4);
                                this.bindTexture(TEXTURE_CANADASPIS);
                                modelCanadaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraCanadia.class) {
                                double offset = 0.17;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.6, 0.6, 0.6);
                                this.bindTexture(TEXTURE_CANADIA);
                                modelCanadia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.pushMatrix();
                                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.9F);
                                GlStateManager.enableNormalize();
                                GlStateManager.enableBlend();
                                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                                this.bindTexture(TEXTURE_CANADIA_LAYER);
                                modelCanadia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.disableBlend();
                                GlStateManager.disableNormalize();
                                GlStateManager.popMatrix();
                            } else if (classEntity == EntityPrehistoricFloraCheirurus.class) {
                                double offset = 0.56;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(2.3, 2.3, 2.3);
                                this.bindTexture(TEXTURE_CHEIRURUS);
                                modelCheirurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraCheloniellon.class) {
                                double offset = 0.48;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_CHELONIELLON);
                                modelCheloniellon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraChotecops.class) {
                                double offset = 0.38;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.7F, 0.7F, 0.7F);
                                this.bindTexture(TEXTURE_CHOTECOPS);
                                modelChotecops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTitanopteraClatrotitan.class) {
                                double offset = 0.49;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(4F, 4F, 4F);
                                this.bindTexture(TEXTURE_CLATROTITAN);
                                modelTitanoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.pushMatrix();
                                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.8F);
                                GlStateManager.enableNormalize();
                                GlStateManager.enableBlend();
                                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                                this.bindTexture(TEXTURE_CLATROTITAN_WING);
                                modelTitanoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.disableBlend();
                                GlStateManager.disableNormalize();
                                GlStateManager.popMatrix();
                            } else if (classEntity == EntityPrehistoricFloraCrotalocephalus.class) {
                                double offset = 0.46;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_CROTALOCEPHALUS);
                                modelCrotalocephalus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTrigonotarbid_Cryptomartus.class) {
                                double offset = 0.43;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.8F, 0.8F, 0.8F);
                                this.bindTexture(TEXTURE_CRYPTOMARTUS);
                                modelTrigonotarbid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraDalmanites.class) {
                                double offset = 0.35;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_DALMANITES);
                                modelDalmanites.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPalaeodictyoptera_Delitzschala.class) {
                                double offset = 0.65;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.2F, 1.2F, 1.2F);
                                this.bindTexture(TEXTURE_DELITZSCHALA);
                                modelPalaeodictyoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraDiania.class) {
                                double offset = 0.12;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                if (LepidodendronConfig.doLowRes) {
                                    this.bindTexture(TEXTURE_DIANIA_NERF);
                                } else {
                                    this.bindTexture(TEXTURE_DIANIA);
                                }
                                modelDiania.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraDrotops.class) {
                                double offset = 0.43;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.8F, 0.8F, 0.8F);
                                this.bindTexture(TEXTURE_DROTOPS);
                                modelDrotops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPalaeodictyoptera_Dunbaria.class) {
                                double offset = 0.65;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.2F, 1.2F, 1.2F);
                                this.bindTexture(TEXTURE_DUNBARIA);
                                modelPalaeodictyoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraEllipsocephalus.class) {
                                double offset = 0.3;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_ELLIPSOCEPHALUS);
                                modelEllipsocephalus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraElrathia.class) {
                                double offset = 0.33;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_ELRATHIA);
                                modelElrathia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraEnoploura.class) {
                                double offset = 0.3;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                this.bindTexture(TEXTURE_ENOPLOURA);
                                modelEnoploura.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraEoarthropleura.class) {
                                double offset = 0.61;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.2F, 1.2F, 1.2F);
                                this.bindTexture(TEXTURE_EOARTHROPLEURA);
                                modelEoarthropleura.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTrigonotarbid_Eophrynus.class) {
                                double offset = 0.43;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.8F, 0.8F, 0.8F);
                                this.bindTexture(TEXTURE_EOPHRYNUS);
                                modelTrigonotarbid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraEoredlichia.class) {
                                double offset = 0.52;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_EOREDLICHIA);
                                modelEoredlichia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraEricixerxes.class) {
                                double offset = 0.65;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.2F, 1.2F, 1.2F);
                                this.bindTexture(TEXTURE_ERICIXERXES);
                                modelEricixerxes.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraEurypterus.class) {
                                double offset = 0.47;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_EURYPTERUS);
                                modelEurypterus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraScorpion_Gigantoscorpio.class) {
                                double offset = 0.2;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.89F, 0.89F, 0.89F);
                                this.bindTexture(TEXTURE_GIGANTOSCORPIO);
                                modelScorpion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraScorpion_Gondwanascorpio.class) {
                                double offset = 0.15;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.61F, 0.61F, 0.61);
                                this.bindTexture(TEXTURE_GONDWANASCORPIO);
                                modelScorpion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraRoachoidForestInsect.class) {
                                double offset = 0.29;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                this.bindTexture(TEXTURE_FORESTROACHOID);
                                modelRoachoid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTitanopteraGigatitan.class) {
                                double offset = 0.49;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(4F, 4F, 4F);
                                this.bindTexture(TEXTURE_GIGATITAN);
                                modelTitanoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.pushMatrix();
                                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.8F);
                                GlStateManager.enableNormalize();
                                GlStateManager.enableBlend();
                                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                                this.bindTexture(TEXTURE_GIGATITAN_WING);
                                modelTitanoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.disableBlend();
                                GlStateManager.disableNormalize();
                                GlStateManager.popMatrix();
                            } else if (classEntity == EntityPrehistoricFloraHaikouichthys.class) {
                                double offset = 0.1;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.4, 0.4, 0.4);
                                this.bindTexture(TEXTURE_HAIKOUICHTHYS);
                                modelHaikouichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.pushMatrix();
                                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.8F);
                                GlStateManager.enableNormalize();
                                GlStateManager.enableBlend();
                                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                                this.bindTexture(TEXTURE_HAIKOUICHTHYS_FIN);
                                modelHaikouichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.disableBlend();
                                GlStateManager.disableNormalize();
                                GlStateManager.popMatrix();
                            } else if (classEntity == EntityPrehistoricFloraHallucigenia.class) {
                                double offset = 0.17;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                if (LepidodendronConfig.doLowRes) {
                                    this.bindTexture(TEXTURE_HALLUCIGENIA_NERF);
                                } else {
                                    this.bindTexture(TEXTURE_HALLUCIGENIA);
                                }
                                modelHallucigenia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraHarpes.class) {
                                double offset = 0.39;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.6F, 1.6F, 1.6F);
                                this.bindTexture(TEXTURE_HARPES);
                                this.modelHarpes.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraHarvestman.class) {
                                double offset = 0.19;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.2F, 0.2F, 0.2F);
                                this.bindTexture(TEXTURE_HARVESTMAN);
                                modelHarvestman.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraHeliopeltis.class) {
                                double offset = 0.21;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.38F, 0.38F, 0.38F);
                                this.bindTexture(TEXTURE_HELIOPELTIS);
                                modelHeliopeltis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraHelmetia.class) {
                                double offset = 0.45;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.85F, 0.85F, 0.85F);
                                this.bindTexture(TEXTURE_HELMETIA);
                                modelHelmetia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPalaeodictyoptera_Homoioptera.class) {
                                double offset = 0.65;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.2F, 1.2F, 1.2F);
                                this.bindTexture(TEXTURE_HOMOIOPTERA);
                                modelPalaeodictyoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPalaeodictyoptera_Homaloneura.class) {
                                double offset = 0.65;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.2F, 1.2F, 1.2F);
                                this.bindTexture(TEXTURE_HOMALONEURA);
                                modelPalaeodictyoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraHungioides.class) {
                                double offset = 0.75;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.85F, 0.85F, 0.85F);
                                this.bindTexture(TEXTURE_HUNGIOIDES);
                                modelHungioides.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraIsotelus.class) {
                                double offset = 0.76;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.8F, 0.8F, 0.8F);
                                this.bindTexture(TEXTURE_ISOTELUS);
                                modelIsotelus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraItalophlebia.class) {
                                double offset = 0.26;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.3F, 0.3F, 0.3F);
                                this.bindTexture(TEXTURE_ITALOPHLEBIA);
                                modelProtozygoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.pushMatrix();
                                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.8F);
                                GlStateManager.enableNormalize();
                                GlStateManager.enableBlend();
                                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                                this.bindTexture(TEXTURE_ITALOPHLEBIA_WING);
                                modelProtozygoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.disableBlend();
                                GlStateManager.disableNormalize();
                                GlStateManager.popMatrix();
                            } else if (classEntity == EntityPrehistoricFloraJianshanopodia.class) {
                                double offset = 0.32;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_JIANSHANOPODIA);
                                modelJianshanopodia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraKalbarria.class) {
                                double offset = 0.5;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_KALBARRIA);
                                modelKalbarria.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraKerygmachela.class) {
                                double offset = 0.32;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.3F, 1.3F, 1.3F);
                                this.bindTexture(TEXTURE_KERYGMACHELA);
                                modelKerygmachela.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraKodymirus.class) {
                                double offset = 0.3;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.2F, 1.2F, 1.2F);
                                this.bindTexture(TEXTURE_KODYMIRUS);
                                modelKodymirus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraKokomopterus.class) {
                                double offset = 0.41;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(2.3F, 1.7F, 2.3F);
                                this.bindTexture(TEXTURE_KOKOMOPTERUS);
                                modelKokomopterus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTrigonotarbid_Kreischeria.class) {
                                double offset = 0.43;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.8F, 0.8F, 0.8F);
                                this.bindTexture(TEXTURE_KREISCHERIA);
                                modelTrigonotarbid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraLanceaspis.class) {
                                double offset = 0.33;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                this.bindTexture(TEXTURE_LANCEASPIS);
                                modelLanceaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraLimulid.class) {
                                double offset = 0.8;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.9F, 0.9F, 0.9F);
                                this.bindTexture(TEXTURE_LIMULID);
                                modelLimulid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraLochmanolenellus.class) {
                                double offset = 0.31;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                this.bindTexture(TEXTURE_LOCHMANOLENELLUS);
                                modelLochmanolenellus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraLonchodomas.class) {
                                double offset = 0.25;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.48F, 0.48F, 0.48F);
                                this.bindTexture(TEXTURE_LONCHODOMAS);
                                this.modelLonchodomas.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPalaeodictyoptera_Lithomantis.class) {
                                double offset = 0.65;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.2F, 1.2F, 1.2F);
                                this.bindTexture(TEXTURE_LITHOMANTIS);
                                modelPalaeodictyoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraLunataspis.class) {
                                double offset = 0.335;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                this.bindTexture(TEXTURE_LUNATASPIS);
                                modelLunataspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPalaeodictyoptera_Lycocercus.class) {
                                double offset = 0.65;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.2F, 1.2F, 1.2F);
                                this.bindTexture(TEXTURE_LYCOCERCUS);
                                modelPalaeodictyoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraLyrarapax.class) {
                                double offset = 0.46;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_LYRARAPAX);
                                modelLyrarapax.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraMarrella.class) {
                                double offset = 0.34;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_MARRELLA);
                                modelMarrella.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraMeganeura.class) {
                                double offset = 0.28;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.77F, 0.77F, 0.77F);
                                this.bindTexture(TEXTURE_MEGANEURA);
                                modelMeganeuropsis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.pushMatrix();
                                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.8F);
                                GlStateManager.enableNormalize();
                                GlStateManager.enableBlend();
                                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                                this.bindTexture(TEXTURE_MEGANEURA_WING);
                                modelMeganeuropsis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.disableBlend();
                                GlStateManager.disableNormalize();
                                GlStateManager.popMatrix();
                            } else if (classEntity == EntityPrehistoricFloraMeganeuropsis.class) {
                                double offset = 0.28;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.77F, 0.77F, 0.77F);
                                this.bindTexture(TEXTURE_MEGANEUROPSIS);
                                modelMeganeuropsis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.pushMatrix();
                                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.8F);
                                GlStateManager.enableNormalize();
                                GlStateManager.enableBlend();
                                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                                this.bindTexture(TEXTURE_MEGANEUROPSIS_WING);
                                modelMeganeuropsis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.disableBlend();
                                GlStateManager.disableNormalize();
                                GlStateManager.popMatrix();
                            } else if (classEntity == EntityPrehistoricFloraMegarachne.class) {
                                double offset = 0.73;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(3F, 3F, 3F);
                                this.bindTexture(TEXTURE_MEGARACHNE);
                                modelMegarachne.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTitanopteraMesotitan.class) {
                                double offset = 0.49;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(4F, 4F, 4F);
                                this.bindTexture(TEXTURE_MESOTITAN);
                                modelTitanoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.pushMatrix();
                                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.8F);
                                GlStateManager.enableNormalize();
                                GlStateManager.enableBlend();
                                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                                this.bindTexture(TEXTURE_MESOTITAN_WING);
                                modelTitanoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.disableBlend();
                                GlStateManager.disableNormalize();
                                GlStateManager.popMatrix();
                            } else if (classEntity == EntityPrehistoricFloraMetaspriggina.class) {
                                double offset = 0.21;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.8F, 0.8F, 0.8F);
                                this.bindTexture(TEXTURE_METASPRIGGINA);
                                modelMetaspriggina.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraMicrodictyon.class) {
                                double offset = 0.17;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.7F, 0.7F, 0.7F);
                                this.bindTexture(TEXTURE_MICRODICTYON);
                                modelMicrodictyon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraMimetaster.class) {
                                double offset = 0.36;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.5F, 1.5F, 1.5F);
                                this.bindTexture(TEXTURE_MIMETASTER);
                                modelMimetaster.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraMontecaris.class) {
                                double offset = 0.29;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(2.1F, 1.3F, 2.1F);
                                this.bindTexture(TEXTURE_MONTECARIS);
                                modelMontecaris.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraNahecaris.class) {
                                double offset = 0.33;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.6F, 1.6F, 1.6F);
                                this.bindTexture(TEXTURE_NAHECARIS);
                                modelNahecaris.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraNectocaris.class) {
                                double offset = 0.18;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.7F, 0.7F, 0.7F);
                                this.bindTexture(TEXTURE_NECTOCARIS);
                                modelNectocaris.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraOdaraia.class) {
                                double offset = 0.23;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.9F, 0.9F, 0.9F);
                                this.bindTexture(TEXTURE_ODARAIA);
                                modelOdaraia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraOdontogriphus.class) {
                                double offset = 0.39;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.6F, 1.6F, 1.6F);
                                this.bindTexture(TEXTURE_ODONTOGRIPHUS);
                                modelOdontogriphus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraOgyginus.class) {
                                double offset = 0.5;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.55F, 0.55F, 0.55F);
                                this.bindTexture(TEXTURE_OGYGINUS);
                                this.modelOgyginus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraOpabinia.class) {
                                double offset = 0.3;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                if (LepidodendronConfig.doLowRes) {
                                    this.bindTexture(TEXTURE_OPABINIA_NERF);
                                } else {
                                    this.bindTexture(TEXTURE_OPABINIA);
                                }
                                modelOpabinia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraOpolanka.class) {
                                double offset = 0.45;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.77F, 0.77F, 0.77F);
                                this.bindTexture(TEXTURE_OPOLANKA);
                                modelOpolanka.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraScorpion_Opsieobuthus.class) {
                                double offset = 0.15;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.61F, 0.61F, 0.61F);
                                this.bindTexture(TEXTURE_OPSIEOBUTHUS);
                                modelScorpion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraOrthrozanclus.class) {
                                double offset = 0.27;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.75F, 0.75F, 0.75F);
                                this.bindTexture(TEXTURE_ORTHROZANCLUS);
                                modelOrthrozanclus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraOttoia.class) {
                                double offset = 0.05;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 1F, 0F, 0F);
                                this.bindTexture(TEXTURE_OTTOIA);
                                modelOttoia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTrigonotarbid_Palaeocharinus.class) {
                                double offset = 0.43;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.8F, 0.8F, 0.8F);
                                this.bindTexture(TEXTURE_PALAEOCHARINUS);
                                modelTrigonotarbid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPalaeoisopus.class) {
                                double offset = 0.6;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_PALAEOISOPUS);
                                modelPalaeoisopus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPalaeontinid.class) {
                                double offset = 0.33;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                this.bindTexture(TEXTURE_PALAEONTINID);
                                modelPalaeontinid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTrigonotarbid_Palaeotarbus.class) {
                                double offset = 0.43;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.8F, 0.8F, 0.8F);
                                this.bindTexture(TEXTURE_PALAEOTARBUS);
                                modelTrigonotarbid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraParadoxides.class) {
                                double offset = 0.57;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(2.3F, 2.3F, 2.3F);
                                this.bindTexture(TEXTURE_PARADOXIDES);
                                modelParadoxides.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraParapeytoia.class) {
                                double offset = 0.3;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.2F, 1.2F, 1.2F);
                                this.bindTexture(TEXTURE_PARAPEYTOIA);
                                modelParapeytoia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraParvancorina.class) {
                                double offset = 0.6;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(2.5F, 2.5F, 2.5F);
                                this.bindTexture(TEXTURE_PARVANCORINA);
                                modelParvancorina.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPaucipodia.class) {
                                double offset = 0.16;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                this.bindTexture(TEXTURE_PAUCIPODIA);
                                modelPaucipodia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTrigonotarbid_Permotarbus.class) {
                                double offset = 0.43;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.8F, 0.8F, 0.8F);
                                this.bindTexture(TEXTURE_PERMOTARBUS);
                                modelTrigonotarbid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPhantaspis.class) {
                                double offset = 0.32;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_PHANTASPIS);
                                modelPhantaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPikaia.class) {
                                double offset = 0.05;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.3F, 0.3F, 0.3F);
                                this.bindTexture(TEXTURE_PIKAIA);
                                modelPikaia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPneumodesmus.class) {
                                double offset = 0.45;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.9F, 0.9F, 0.9F);
                                this.bindTexture(TEXTURE_PNEUMODESMUS);
                                modelPneumodesmus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPomatrum.class) {
                                double offset = 0.42;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.7F, 1.7F, 1.7F);
                                this.bindTexture(TEXTURE_POMATRUM);
                                modelPomatrum.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraProfallotaspis.class) {
                                double offset = 0.33;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.6F, 0.6F, 0.6F);
                                this.bindTexture(TEXTURE_PROFALLOTASPIS);
                                modelProfallotaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraProtozygoptera.class) {
                                double offset = 0.26;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.3F, 0.3F, 0.3F);
                                this.bindTexture(TEXTURE_PROTOZYGOPTERA);
                                modelProtozygoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.pushMatrix();
                                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.8F);
                                GlStateManager.enableNormalize();
                                GlStateManager.enableBlend();
                                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                                this.bindTexture(TEXTURE_PROTOZYGOPTERA_WING);
                                modelProtozygoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.disableBlend();
                                GlStateManager.disableNormalize();
                                GlStateManager.popMatrix();
                            } else if (classEntity == EntityPrehistoricFloraScorpion_Pulmonoscorpius.class) {
                                double offset = 0.24;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.1F, 1.1F, 1.1F);
                                this.bindTexture(TEXTURE_PULMONOSCORPIO);
                                modelScorpion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraRetifacies.class) {
                                double offset = 0.63;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.2F, 1.2F, 1.2F);
                                this.bindTexture(TEXTURE_RETIFACIES);
                                modelRetifacies.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraSchinderhannes.class) {
                                double offset = 0.37;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_SCHINDERHANNES);
                                modelSchinderhannes.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraSelenopeltis.class) {
                                double offset = 0.41;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.6F, 1.6F, 1.6F);
                                this.bindTexture(TEXTURE_SELENOPELTIS);
                                modelSelenopeltis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraSiberion.class) {
                                double offset = 0.2;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.8F, 0.8F, 0.8F);
                                this.bindTexture(TEXTURE_SIBERION);
                                modelSiberion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraSidneyia.class) {
                                double offset = 0.42;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_SIDNEYIA);
                                modelSidneyia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPalaeodictyoptera_Sinodunbaria.class) {
                                double offset = 0.65;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.2F, 1.2F, 1.2F);
                                this.bindTexture(TEXTURE_SINODUNBARIA);
                                modelPalaeodictyoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPalaeodictyoptera_Stenodictya.class) {
                                double offset = 0.65;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.2F, 1.2F, 1.2F);
                                this.bindTexture(TEXTURE_STENODICTYA);
                                modelPalaeodictyoptera.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraRoachoidSwampInsect.class) {
                                double offset = 0.29;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                this.bindTexture(TEXTURE_SWAMPROACHOID);
                                modelRoachoid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraSkeemella.class) {
                                double offset = 0.27;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1F, 1F, 1F);
                                this.bindTexture(TEXTURE_SKEEMELLA);
                                modelSkeemella.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraSyllipsimopodi.class) {
                                double offset = 0.24;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.66F, 0.66F, 0.66F);
                                this.bindTexture(TEXTURE_SYLLIPSIMOPODI);
                                modelSyllipsimopodi.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraSynophalos.class) {
                                double offset = 0.15;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_SYNOPHALOS);
                                modelSynophalos.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTegopelte.class) {
                                double offset = 0.34;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_TEGOPELTE);
                                modelTegopelte.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.pushMatrix();
                                GlStateManager.color(1.0F, 1.0F, 1.0F, 0.8F);
                                GlStateManager.enableNormalize();
                                GlStateManager.enableBlend();
                                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                                this.bindTexture(TEXTURE_TEGOPELTE_LAYER);
                                modelTegopelte.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                                GlStateManager.disableBlend();
                                GlStateManager.disableNormalize();
                                GlStateManager.popMatrix();
                            } else if (classEntity == EntityPrehistoricFloraTerataspis.class) {
                                double offset = 0.57;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(2.3F, 2.3F, 2.3F);
                                this.bindTexture(TEXTURE_TERATASPIS);
                                modelTerataspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTokummia.class) {
                                double offset = 0.4;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                if (LepidodendronConfig.doLowRes) {
                                    this.bindTexture(TEXTURE_TOKUMMIA_NERF);
                                } else {
                                    this.bindTexture(TEXTURE_TOKUMMIA);
                                }
                                modelTokummia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTrimerus.class) {
                                double offset = 0.54;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1F, 1F, 1F);
                                this.bindTexture(TEXTURE_TRIMERUS);
                                modelTrimerus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTyrannophontes.class) {
                                double offset = 0.19;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.78F, 0.78F, 0.78F);
                                this.bindTexture(TEXTURE_TYRANNOPHONTES);
                                modelTyrannophontes.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraUralichas.class) {
                                double offset = 0.45;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                                this.bindTexture(TEXTURE_URALICHAS);
                                modelUralichas.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraVetulicola.class) {
                                double offset = 0.39;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.8F, 1.8F, 1.8F);
                                this.bindTexture(TEXTURE_VETULICOLA);
                                modelVetulicola.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraWalliserops.class) {
                                double offset = 0.55;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_WALLISEROPS);
                                modelWalliserops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraWeinbergina.class) {
                                double offset = 0.47;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.9, 1.9, 1.9);
                                this.bindTexture(TEXTURE_WEINBERGINA);
                                modelWeinbergina.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraWillwerathia.class) {
                                double offset = 0.77;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.4, 1.4, 1.4);
                                this.bindTexture(TEXTURE_WILLWERATHIA);
                                modelWillwerathia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraWingertshellicus.class) {
                                double offset = 0.26;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1, 1, 1);
                                this.bindTexture(TEXTURE_WINGERTSHELLICUS);
                                modelWingertshellicus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraWiwaxia.class) {
                                double offset = 0.25;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_WIWAXIA);
                                modelWiwaxia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraXenusion.class) {
                                double offset = 0.25;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_XENUSION);
                                modelXenusion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraYawunik.class) {
                                double offset = 0.35;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1.5, 1.5, 1.5);
                                this.bindTexture(TEXTURE_YAWUNIK);
                                modelYawunik.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraYohoia.class) {
                                double offset = 0.24;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(1, 1, 1);
                                this.bindTexture(TEXTURE_YOHOIA);
                                modelYohoia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraYunnanozoon.class) {
                                double offset = 0.18;
                                if (facing == EnumFacing.UP) {
                                    GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.DOWN) {
                                    GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
                                }
                                if (facing == EnumFacing.NORTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.SOUTH) {
                                    GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 1F, 0F, 0F);
                                }
                                if (facing == EnumFacing.WEST) {
                                    GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(90, 0F, 0F, 1F);
                                }
                                if (facing == EnumFacing.EAST) {
                                    GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
                                    GlStateManager.rotate(180, 0F, 0F, 1F);
                                    GlStateManager.rotate(270, 0F, 0F, 1F);
                                }
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                GlStateManager.scale(0.7, 0.7, 0.7);
                                this.bindTexture(TEXTURE_YUNNANOZOON);
                                modelYunnanozoon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            }

                            else if (classEntity == EntityPrehistoricFloraEryon.class) {
                                double offset = 0.18;
                                try {
                                    itemRender = !renderTaxidermy(facing, (float) x, (float) y, (float) z, currentRotation,
                                        TEXTURE_ERYON, RenderEryon.getScaler(), modelEryon, offset);
                                } catch (Exception e) {
                                    itemRender = true;
                                }
                            }


                            else {
                                itemRender = true;
                            }
                        }
                    }

                    // ********************************************************************
                    else if (itemRender) { //standard items
                        //itemRender = true;

                        GlStateManager.alphaFunc(516, 0.1F);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        //GlStateManager.pushMatrix();

                        float scale = 0.6666F;
                        if (facing == EnumFacing.UP) {
                            GlStateManager.translate(x + 0.5, y, z + 0.5);
                            GlStateManager.scale(scale, scale, scale);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
                            GlStateManager.rotate(90, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.DOWN) {
                            GlStateManager.translate(x + 0.5, y + 1, z + 0.5);
                            GlStateManager.scale(scale, scale, scale);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
                            GlStateManager.rotate(90, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5, z + 1);
                            GlStateManager.scale(scale, scale, scale);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5, z);
                            GlStateManager.scale(scale, scale, scale);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + 1, y + 0.5, z + 0.5);
                            GlStateManager.scale(scale, scale, scale);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x, y + 0.5, z + 0.5);
                            GlStateManager.scale(scale, scale, scale);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
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
           double offset
    ) {
        if (facing == EnumFacing.UP) {
            GlStateManager.translate(x + 0.5, y + offset, z + 0.5);
            GlStateManager.rotate(180, 0F, 0F, 1F);
        }
        if (facing == EnumFacing.DOWN) {
            GlStateManager.translate(x + 0.5, y + (1 - offset), z + 0.5);
        }
        if (facing == EnumFacing.NORTH) {
            GlStateManager.translate(x + 0.5, y + 0.5, z + (1 - offset));
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(90, 1F, 0F, 0F);
        }
        if (facing == EnumFacing.SOUTH) {
            GlStateManager.translate(x + 0.5, y + 0.5, z + offset);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(270, 1F, 0F, 0F);
        }
        if (facing == EnumFacing.WEST) {
            GlStateManager.translate(x + (1 - offset), y + 0.5, z + 0.5);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(90, 0F, 0F, 1F);
        }
        if (facing == EnumFacing.EAST) {
            GlStateManager.translate(x + offset, y + 0.5, z + 0.5);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(270, 0F, 0F, 1F);
        }
        GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
        GlStateManager.scale(this.scaler * scalerModel, this.scaler * scalerModel, this.scaler * scalerModel);
        this.bindTexture(TEXTURE);
        Method renderMethod = testAndGetMethod(model.getClass(), "renderStaticDisplayCase");
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

    @Nullable
    public Method testAndGetMethod(Class clazz, String methodname) {
        Method methodToFind = null;
        try {
            methodToFind = clazz.getMethod(methodname, new Class[] { float.class });
        } catch (NoSuchMethodException | SecurityException e) {
        }
        return methodToFind;
    }

}