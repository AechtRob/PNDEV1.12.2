package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockDisplayCase;
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
import org.lwjgl.opengl.GL11;

public class RenderDisplayCase extends TileEntitySpecialRenderer<BlockDisplayCase.TileEntityDisplayCase> {

    public static final PropertyDirection FACING = BlockDirectional.FACING;

    private static final ResourceLocation TEXTURE_GERARUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerarus.png");
    private final ModelGerarus modelGerarus;
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
    private static final ResourceLocation TEXTURE_ANOMALOCARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anomalocaris.png");
    private final ModelAnomalocaris modelAnomalocaris;
    private static final ResourceLocation TEXTURE_ANTARCTICARCINUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/antarcticarcinus.png");
    private final ModelAntarcticarcinus modelAntarcticarcinus;
    private static final ResourceLocation TEXTURE_ASAPHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/asaphus.png");
    private final ModelAsaphus modelAsaphus;
    private static final ResourceLocation TEXTURE_BANFFIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/banffia.png");
    private final ModelBanffia modelBanffia;
    private static final ResourceLocation TEXTURE_BUSHIZHEIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bushizheia.png");
    private final ModelBushizheia modelBushizheia;
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
    private static final ResourceLocation TEXTURE_CROTALOCEPHALUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/crotalocephalus.png");
    private final ModelCrotalocephalus modelCrotalocephalus;
    private static final ResourceLocation TEXTURE_DALMANITES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dalmanites.png");
    private final ModelDalmanites modelDalmanites;
    private static final ResourceLocation TEXTURE_DIANIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diania.png");
    private static final ResourceLocation TEXTURE_DIANIA_NERF = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diania_nerf.png");
    private final ModelDiania modelDiania;
    private static final ResourceLocation TEXTURE_DROTOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/drotops.png");
    private final ModelDrotops modelDrotops;
    private static final ResourceLocation TEXTURE_ELLIPSOCEPHALUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ellipsocephalus.png");
    private final ModelEllipsocephalus modelEllipsocephalus;
    private static final ResourceLocation TEXTURE_ELRATHIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/elrathia.png");
    private final ModelElrathia modelElrathia;
    private static final ResourceLocation TEXTURE_EOARTHROPLEURA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eoarthropleura.png");
    private final ModelEoarthropleura modelEoarthropleura;
    private static final ResourceLocation TEXTURE_EOREDLICHIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eoredlichia.png");
    private final ModelEoredlichia modelEoredlichia;
    private static final ResourceLocation TEXTURE_ERICIXERXES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ericixerxes.png");
    private final ModelEricixerxes modelEricixerxes;
    private static final ResourceLocation TEXTURE_EURYPTERUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eurypterus.png");
    private final ModelEurypterus modelEurypterus;
    private static final ResourceLocation TEXTURE_HAIKOUICHTHYS_FIN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/haikouichthys_transparent.png");
    private static final ResourceLocation TEXTURE_HAIKOUICHTHYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/haikouichthys.png");
    private final ModelHaikouichthys modelHaikouichthys;
    private static final ResourceLocation TEXTURE_HALLUCIGENIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hallucigenia.png");
    private static final ResourceLocation TEXTURE_HALLUCIGENIA_NERF = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hallucigenia_nerf.png");
    private final ModelHallucigenia modelHallucigenia;
    private static final ResourceLocation TEXTURE_HELIOPELTIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/heliopeltis.png");
    private final ModelHeliopeltis modelHeliopeltis;
    private static final ResourceLocation TEXTURE_HELMETIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/helmetia.png");
    private final ModelHelmetia modelHelmetia;
    private static final ResourceLocation TEXTURE_HUNGIOIDES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hungioides.png");
    private final ModelHungioides modelHungioides;
    private static final ResourceLocation TEXTURE_ISOTELUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/isotelus.png");
    private final ModelIsotelus modelIsotelus;
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
    private static final ResourceLocation TEXTURE_LUNATASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lunataspis.png");
    private final ModelLunataspis modelLunataspis;
    private static final ResourceLocation TEXTURE_LYRARAPAX = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lyrarapax.png");
    private final ModelLyrarapax modelLyrarapax;
    private static final ResourceLocation TEXTURE_MARRELLA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/marrella.png");
    private final ModelMarrella modelMarrella;
    private static final ResourceLocation TEXTURE_MEGARACHNE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megarachne.png");
    private final ModelMegarachne modelMegarachne;
    private static final ResourceLocation TEXTURE_METASPRIGGINA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/metaspriggina.png");
    private final ModelMetaspriggina modelMetaspriggina;
    private static final ResourceLocation TEXTURE_MICRODICTYON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/microdictyon.png");
    private final ModelMicrodictyon modelMicrodictyon;
    private static final ResourceLocation TEXTURE_MIMETASTER = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mimetaster.png");
    private final ModelMimetaster modelMimetaster;
    private static final ResourceLocation TEXTURE_NECTOCARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nectocaris.png");
    private final ModelNectocaris modelNectocaris;
    private static final ResourceLocation TEXTURE_ODARAIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/odaraia.png");
    private final ModelOdaraia modelOdaraia;
    private static final ResourceLocation TEXTURE_ODONTOGRIPHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/odontogriphus.png");
    private final ModelOdontogriphus modelOdontogriphus;
    private static final ResourceLocation TEXTURE_OPABINIA_NERF =  new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/opabinia_nerf.png");
    private static final ResourceLocation TEXTURE_OPABINIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/opabinia.png");
    private final ModelOpabinia modelOpabinia;
    private static final ResourceLocation TEXTURE_ORTHROZANCLUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/orthrozanclus.png");
    private final ModelOrthrozanclus modelOrthrozanclus;
    private static final ResourceLocation TEXTURE_OTTOIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ottoia.png");
    private final ModelOttoia modelOttoia;
    private static final ResourceLocation TEXTURE_PALAEOISOPUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/palaeoisopus.png");
    private final ModelPalaeoisopus modelPalaeoisopus;
    private static final ResourceLocation TEXTURE_PARADOXIDES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paradoxides.png");
    private final ModelParadoxides modelParadoxides;
    private static final ResourceLocation TEXTURE_PARVANCORINA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parvancorina.png");
    private final ModelParvancorina modelParvancorina;
    private static final ResourceLocation TEXTURE_PAUCIPODIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/paucipodia.png");
    private final ModelPaucipodia modelPaucipodia;
    private static final ResourceLocation TEXTURE_PHANTASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phantaspis.png");
    private final ModelPhantaspis modelPhantaspis;
    private static final ResourceLocation TEXTURE_PIKAIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pikaia.png");
    private final ModelPikaia modelPikaia;
    private static final ResourceLocation TEXTURE_POMATRUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pomatrum.png");
    private final ModelPomatrum modelPomatrum;
    private static final ResourceLocation TEXTURE_PROFALLOTASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/profallotaspis.png");
    private final ModelProfallotaspis modelProfallotaspis;
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
    private static final ResourceLocation TEXTURE_WALLISEROPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/walliserops.png");
    private final ModelWalliserops modelWalliserops;
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

    public RenderDisplayCase() {
        this.modelGerarus = new ModelGerarus();
        this.modelAiniktozoon = new ModelAiniktozoon();
        this.modelAcadoaradoxides = new ModelAcadoaradoxides();
        this.modelAdelophthalmus = new ModelAdelophthalmus();
        this.modelAlacaris = new ModelAlacaris();
        this.modelAmplectobelua = new ModelAmplectobelua();
        this.modelAnomalocaris = new ModelAnomalocaris();
        this.modelAntarcticarcinus = new ModelAntarcticarcinus();
        this.modelAsaphus = new ModelAsaphus();
        this.modelBanffia = new ModelBanffia();
        this.modelBushizheia = new ModelBushizheia();
        this.modelCambroraster = new ModelCambroraster();
        this.modelCanadaspis = new ModelCanadaspis();
        this.modelCanadia = new ModelCanadia();
        this.modelCheirurus = new ModelCheirurus();
        this.modelCheloniellon = new ModelCheloniellon();
        this.modelCrotalocephalus = new ModelCrotalocephalus();
        this.modelDalmanites = new ModelDalmanites();
        this.modelDiania = new ModelDiania();
        this.modelDrotops = new ModelDrotops();
        this.modelEllipsocephalus= new ModelEllipsocephalus();
        this.modelElrathia= new ModelElrathia();
        this.modelEoarthropleura= new ModelEoarthropleura();
        this.modelEoredlichia= new ModelEoredlichia();
        this.modelEricixerxes= new ModelEricixerxes();
        this.modelEurypterus= new ModelEurypterus();
        this.modelHaikouichthys= new ModelHaikouichthys();
        this.modelHallucigenia= new ModelHallucigenia();
        this.modelHeliopeltis= new ModelHeliopeltis();
        this.modelHelmetia= new ModelHelmetia();
        this.modelHungioides= new ModelHungioides();
        this.modelIsotelus= new ModelIsotelus();
        this.modelJianshanopodia= new ModelJianshanopodia();
        this.modelKalbarria= new ModelKalbarria();
        this.modelKerygmachela= new ModelKerygmachela();
        this.modelKodymirus= new ModelKodymirus();
        this.modelKokomopterus= new ModelKokomopterus();
        this.modelLunataspis = new ModelLunataspis();
        this.modelLyrarapax = new ModelLyrarapax();
        this.modelMarrella = new ModelMarrella();
        this.modelMegarachne = new ModelMegarachne();
        this.modelMetaspriggina = new ModelMetaspriggina();
        this.modelMicrodictyon = new ModelMicrodictyon();
        this.modelMimetaster = new ModelMimetaster();
        this.modelNectocaris = new ModelNectocaris();
        this.modelOdaraia = new ModelOdaraia();
        this.modelOdontogriphus = new ModelOdontogriphus();
        this.modelOpabinia = new ModelOpabinia();
        this.modelOrthrozanclus = new ModelOrthrozanclus();
        this.modelOttoia = new ModelOttoia();
        this.modelPalaeoisopus = new ModelPalaeoisopus();
        this.modelParadoxides = new ModelParadoxides();
        this.modelParvancorina = new ModelParvancorina();
        this.modelPaucipodia = new ModelPaucipodia();
        this.modelPhantaspis = new ModelPhantaspis();
        this.modelPikaia = new ModelPikaia();
        this.modelPomatrum = new ModelPomatrum();
        this.modelProfallotaspis = new ModelProfallotaspis();
        this.modelRetifacies = new ModelRetifacies();
        this.modelSchinderhannes = new ModelSchinderhannes();
        this.modelSelenopeltis = new ModelSelenopeltis();
        this.modelSiberion = new ModelSiberion();
        this.modelSidneyia = new ModelSidneyia();
        this.modelSynophalos = new ModelSynophalos();
        this.modelTegopelte = new ModelTegopelte();
        this.modelTerataspis = new ModelTerataspis();
        this.modelTokummia = new ModelTokummia();
        this.modelTrimerus = new ModelTrimerus();
        this.modelWalliserops = new ModelWalliserops();
        this.modelWiwaxia = new ModelWiwaxia();
        this.modelXenusion = new ModelXenusion();
        this.modelYawunik = new ModelYawunik();
        this.modelYohoia = new ModelYohoia();
        this.modelYunnanozoon = new ModelYunnanozoon();
    }

    @Override
    public void render(BlockDisplayCase.TileEntityDisplayCase entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        EnumFacing facing;
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

                    GlStateManager.enableRescaleNormal();
                    GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1f);
                    GlStateManager.enableBlend();
                    RenderHelper.enableStandardItemLighting();
                    GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
                    GlStateManager.pushMatrix();

                    if (itemstack.getItem() == ItemRoseFlower.block) {
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
                    }
                    else if (itemstack.getItem() == ItemAcadoaradoxidesRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemAdelophthalmusRaw.block) {
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
                        GlStateManager.scale(0.9F,0.9F,0.9F);
                        this.bindTexture(TEXTURE_ADELOPHTHALMUS);
                        modelAdelophthalmus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAiniktozoonRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemAlacarisRaw.block) {
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
                        GlStateManager.scale(1.5,1.5,1.5);
                        this.bindTexture(TEXTURE_ALACARIS);
                        modelAlacaris.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAmplectobeluaRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemAnomalocarisRaw.block) {
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
                        GlStateManager.scale(1,0.85,1);
                        this.bindTexture(TEXTURE_ANOMALOCARIS);
                        modelAnomalocaris.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAntarcicarcinusRaw.block) {
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
                        GlStateManager.scale(1.8,1.8,1.8);
                        this.bindTexture(TEXTURE_ANTARCTICARCINUS);
                        modelAntarcticarcinus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAsaphusRaw.block) {
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
                        GlStateManager.scale(2.3,2.3,2.3);
                        this.bindTexture(TEXTURE_ASAPHUS);
                        modelAsaphus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBanffiaRaw.block) {
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
                        GlStateManager.scale(1.5,1.5,1.5);
                        this.bindTexture(TEXTURE_BANFFIA);
                        modelBanffia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBushizheiaRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemCambrorasterRaw.block) {
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
                        GlStateManager.scale(1F,0.7F,1F);
                        this.bindTexture(TEXTURE_CAMBRORASTER);
                        modelCambroraster.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCanadaspisRaw.block) {
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
                        GlStateManager.scale(1.4,1.4,1.4);
                        this.bindTexture(TEXTURE_CANADASPIS);
                        modelCanadaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCanadiaRaw.block) {
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
                        GlStateManager.scale(0.6,0.6,0.6);
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
                    }
                    else if (itemstack.getItem() == ItemCheirurusRaw.block) {
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
                        GlStateManager.scale(2.3,2.3,2.3);
                        this.bindTexture(TEXTURE_CHEIRURUS);
                        modelCheirurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCheloniellonRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemCrotalocephalusRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemDalmanitesRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemDianiaRaw.block) {
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
                        }
                        else {
                            this.bindTexture(TEXTURE_DIANIA);
                        }
                        modelDiania.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDrotopsRaw.block) {
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
                        GlStateManager.scale(0.8F,0.8F,0.8F);
                        this.bindTexture(TEXTURE_DROTOPS);
                        modelDrotops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEllipsocephalusRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemElrathiaRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemEoarthropleuraRaw.block) {
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
                        GlStateManager.scale(1.2F,1.2F,1.2F);
                        this.bindTexture(TEXTURE_EOARTHROPLEURA);
                        modelEoarthropleura.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEoredlichiaRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemEricixerxesRaw.block) {
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
                        GlStateManager.scale(1.2F,1.2F,1.2F);
                        this.bindTexture(TEXTURE_ERICIXERXES);
                        modelEricixerxes.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEurypterusRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemHaikouichthysRaw.block) {
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
                        GlStateManager.scale(0.4,0.4,0.4);
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
                    }
                    else if (itemstack.getItem() == ItemHallucigeniaRaw.block) {
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
                        }
                        else {
                            this.bindTexture(TEXTURE_HALLUCIGENIA);
                        }
                        modelHallucigenia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHeliopeltisRaw.block) {
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
                        GlStateManager.scale(0.38F,0.38F,0.38F);
                        this.bindTexture(TEXTURE_HELIOPELTIS);
                        modelHeliopeltis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHelmetiaRaw.block) {
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
                        GlStateManager.scale(0.85F,0.85F,0.85F);
                        this.bindTexture(TEXTURE_HELMETIA);
                        modelHelmetia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHungioidesRaw.block) {
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
                        GlStateManager.scale(0.85F,0.85F,0.85F);
                        this.bindTexture(TEXTURE_HUNGIOIDES);
                        modelHungioides.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemIsotelusRaw.block) {
                        double offset = 0.93;
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
                        this.bindTexture(TEXTURE_ISOTELUS);
                        modelIsotelus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemJianshanopodiaRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemKalbarriaRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemKerygmachelaRaw.block) {
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
                        GlStateManager.scale(1.3F,1.3F,1.3F);
                        this.bindTexture(TEXTURE_KERYGMACHELA);
                        modelKerygmachela.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemKodymirusRaw.block) {
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
                        GlStateManager.scale(1.2F,1.2F,1.2F);
                        this.bindTexture(TEXTURE_KODYMIRUS);
                        modelKodymirus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemKokomopterusRaw.block) {
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
                        GlStateManager.scale(2.3F,1.7F,2.3F);
                        this.bindTexture(TEXTURE_KOKOMOPTERUS);
                        modelKokomopterus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLunataspisRaw.block) {
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
                        this.bindTexture(TEXTURE_LUNATASPIS);
                        modelLunataspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLyrarapaxRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemMarrellaRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemMegarachneRaw.block) {
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
                        GlStateManager.scale(3F,3F,3F);
                        this.bindTexture(TEXTURE_MEGARACHNE);
                        modelMegarachne.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMetasprigginaRaw.block) {
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
                        GlStateManager.scale(0.8F,0.8F,0.8F);
                        this.bindTexture(TEXTURE_METASPRIGGINA);
                        modelMetaspriggina.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMicrodictyonRaw.block) {
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
                        GlStateManager.scale(0.7F,0.7F,0.7F);
                        this.bindTexture(TEXTURE_MICRODICTYON);
                        modelMicrodictyon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMimetasterRaw.block) {
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
                        GlStateManager.scale(1.5F,1.5F,1.5F);
                        this.bindTexture(TEXTURE_MIMETASTER);
                        modelMimetaster.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemNectocarisRaw.block) {
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
                        GlStateManager.scale(0.7F,0.7F,0.7F);
                        this.bindTexture(TEXTURE_NECTOCARIS);
                        modelNectocaris.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemOdaraiaRaw.block) {
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
                        GlStateManager.scale(0.9F,0.9F,0.9F);
                        this.bindTexture(TEXTURE_ODARAIA);
                        modelOdaraia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemOdontogriphusRaw.block) {
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
                        GlStateManager.scale(1.6F,1.6F,1.6F);
                        this.bindTexture(TEXTURE_ODONTOGRIPHUS);
                        modelOdontogriphus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemOpabiniaRaw.block) {
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
                        }
                        else {
                            this.bindTexture(TEXTURE_OPABINIA);
                        }
                        modelOpabinia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemOrthrozanclusRaw.block) {
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
                        GlStateManager.scale(0.75F,0.75F,0.75F);
                        this.bindTexture(TEXTURE_ORTHROZANCLUS);
                        modelOrthrozanclus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemOttoiaRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemPalaeoisopusRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemParadoxidesRaw.block) {
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
                        GlStateManager.scale(2.3F,2.3F,2.3F);
                        this.bindTexture(TEXTURE_PARADOXIDES);
                        modelParadoxides.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemParvancorinaRaw.block) {
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
                        GlStateManager.scale(2.5F,2.5F,2.5F);
                        this.bindTexture(TEXTURE_PARVANCORINA);
                        modelParvancorina.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPaucipodiaRaw.block) {
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
                        GlStateManager.scale(0.6F,0.6F,0.6F);
                        this.bindTexture(TEXTURE_PAUCIPODIA);
                        modelPaucipodia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPhantaspisRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemPikaiaRaw.block) {
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
                        GlStateManager.scale(0.3F,0.3F,0.3F);
                        this.bindTexture(TEXTURE_PIKAIA);
                        modelPikaia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemPomatrumRaw.block) {
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
                        GlStateManager.scale(1.7F,1.7F,1.7F);
                        this.bindTexture(TEXTURE_POMATRUM);
                        modelPomatrum.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemProfallotaspisRaw.block) {
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
                        GlStateManager.scale(0.6F,0.6F,0.6F);
                        this.bindTexture(TEXTURE_PROFALLOTASPIS);
                        modelProfallotaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemRetifaciesRaw.block) {
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
                        GlStateManager.scale(1.2F,1.2F,1.2F);
                        this.bindTexture(TEXTURE_RETIFACIES);
                        modelRetifacies.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemSchinderhannesRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemSelenopeltisRaw.block) {
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
                        GlStateManager.scale(1.6F,1.6F,1.6F);
                        this.bindTexture(TEXTURE_SELENOPELTIS);
                        modelSelenopeltis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemSiberionRaw.block) {
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
                        GlStateManager.scale(0.8F,0.8F,0.8F);
                        this.bindTexture(TEXTURE_SIBERION);
                        modelSiberion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemSidneyiaRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemSynophalosRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemTegopelteRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemTerataspisRaw.block) {
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
                        GlStateManager.scale(2.3F,2.3F,2.3F);
                        this.bindTexture(TEXTURE_TERATASPIS);
                        modelTerataspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemTokummiaRaw.block) {
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
                        }
                        else {
                            this.bindTexture(TEXTURE_TOKUMMIA);
                        }
                        modelTokummia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemTrimerusRaw.block) {
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
                        GlStateManager.scale(1F,1F,1F);
                        this.bindTexture(TEXTURE_TRIMERUS);
                        modelTrimerus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemWalliseropsRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemWiwaxiaRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemXenusionRaw.block) {
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
                    }
                    else if (itemstack.getItem() == ItemYawunikRaw.block) {
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
                        GlStateManager.scale(1.5,1.5,1.5);
                        this.bindTexture(TEXTURE_YAWUNIK);
                        modelYawunik.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemYohoiaRaw.block) {
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
                        GlStateManager.scale(1,1,1);
                        this.bindTexture(TEXTURE_YOHOIA);
                        modelYohoia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemYunnanozoonRaw.block) {
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
                        GlStateManager.scale(0.7,0.7,0.7);
                        this.bindTexture(TEXTURE_YUNNANOZOON);
                        modelYunnanozoon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }

                    // ********************************************************************
                    else { //standard items
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

                    GlStateManager.popMatrix();
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.disableBlend();

                }
            }
        }
    }
}