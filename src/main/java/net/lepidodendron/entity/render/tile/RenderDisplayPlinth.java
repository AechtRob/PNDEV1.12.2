package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockDisplayPlinth;
import net.lepidodendron.entity.*;
import net.lepidodendron.entity.model.entity.*;
import net.lepidodendron.item.ItemTaxidermyDisplayItem;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
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

public class RenderDisplayPlinth extends TileEntitySpecialRenderer<BlockDisplayPlinth.TileEntityDisplayPlinth> {

    public static final PropertyDirection FACING = BlockDirectional.FACING;
    private static final ResourceLocation TEXTURE_ACANTHOSTEGA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acanthostega.png");
    private final ModelAcanthostega modelAcanthostega;
    private static final ResourceLocation TEXTURE_ACANTHOSTOMATOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acanthostomatops.png");
    private final ModelAcanthostomatops modelAcanthostomatops;
    private static final ResourceLocation TEXTURE_ACUTIRAMUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acutiramus.png");
    private final ModelAcutiramusPlinth modelAcutiramusPlinth;
    private static final ResourceLocation TEXTURE_AMPHIBAMUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/amphibamus.png");
    private final ModelAmphibamus modelAmphibamus;
    private static final ResourceLocation TEXTURE_ASCENDONANUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ascendonanus.png");
    private final ModelAscendonanus modelAscendonanus;
    private static final ResourceLocation TEXTURE_AULACEPHALODON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aulacephalodon.png");
    private final ModelAulacephalodon modelAulacephalodon;
    private static final ResourceLocation TEXTURE_AUSTRIADACTYLUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/austriadactylus.png");
    private final ModelAustriadactylus modelAustriadactylus;
    private static final ResourceLocation TEXTURE_BALANERPETON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/balanerpeton.png");
    private final ModelBalanerpeton modelBalanerpeton;
    private static final ResourceLocation TEXTURE_BRANCHIOSAUR = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/branchiosaur.png");
    private final ModelBranchiosaur modelBranchiosaur;
    private static final ResourceLocation TEXTURE_CACOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cacops.png");
    private final ModelCacops modelCacops;
    private static final ResourceLocation TEXTURE_CAELESTIVENTUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/caelestiventus.png");
    private final ModelCaelestiventus modelCaelestiventus;
    private static final ResourceLocation TEXTURE_CAPTORHINUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/captorhinus.png");
    private final ModelCaptorhinus modelCaptorhinus;
    private static final ResourceLocation TEXTURE_CARCINOSOMA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/carcinosoma.png");
    private final ModelCarcinosoma modelCarcinosoma;
    private static final ResourceLocation TEXTURE_CARTORHYNCHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cartorhynchus.png");
    private final ModelCartorhynchus modelCartorhynchus;
    private static final ResourceLocation TEXTURE_CASINERIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/casineria.png");
    private final ModelCasineria modelCasineria;
    private static final ResourceLocation TEXTURE_CAVIRAMUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/caviramus.png");
    private final ModelCaviramus modelCaviramus;
    private static final ResourceLocation TEXTURE_CLAUDIOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/claudiosaurus.png");
    private final ModelClaudiosaurus modelClaudiosaurus;
    private static final ResourceLocation TEXTURE_CLEVOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/clevosaurus.png");
    private final ModelClevosaurus modelClevosaurus;
    private static final ResourceLocation TEXTURE_CYAMODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cyamodus.png");
    private final ModelCyamodus modelCyamodus;
    private static final ResourceLocation TEXTURE_DASYCEPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dasyceps.png");
    private final ModelDasyceps modelDasyceps;
    private static final ResourceLocation TEXTURE_DATHEOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/datheosaurus.png");
    private final ModelDatheosaurus modelDatheosaurus;
    private static final ResourceLocation TEXTURE_DIICTODON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diictodon.png");
    private final ModelDiictodon modelDiictodon;
    private static final ResourceLocation TEXTURE_DIPLOCAULUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diplocaulus.png");
    private final ModelDiplocaulus modelDiplocaulus;
    private static final ResourceLocation TEXTURE_DIPLOCERASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diploceraspis.png");
    private final ModelDiploceraspis modelDiploceraspis;
    private static final ResourceLocation TEXTURE_DVINIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dvinia.png");
    private final ModelDvinia modelDvinia;
    private static final ResourceLocation TEXTURE_DVINOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dvinosaurus.png");
    private final ModelDvinosaurus modelDvinosaurus;
    private static final ResourceLocation TEXTURE_EFFIGIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/effigia.png");
    private final ModelEffigia modelEffigia;
    private static final ResourceLocation TEXTURE_ELGINIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/elginia.png");
    private final ModelElginia modelElginia;
    private static final ResourceLocation TEXTURE_EORHYNCHOCHELYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eorhynchochelys.png");
    private final ModelEorhynchochelys modelEorhynchochelys;
    private static final ResourceLocation TEXTURE_ERETMORHIPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eretmorhipis.png");
    private final ModelEretmorhipis modelEretmorhipis;
    private static final ResourceLocation TEXTURE_EOSIMOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eosimops.png");
    private static final ResourceLocation TEXTURE_EUCHAMBERSIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/euchambersia.png");
    private final ModelEuchambersia modelEuchambersia;
    private static final ResourceLocation TEXTURE_EUDIMORPHODON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eudimorphodon.png");
    private final ModelEudimorphodon modelEudimorphodon;
    private static final ResourceLocation TEXTURE_EUPARKERIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/euparkeria.png");
    private final ModelEuparkeria modelEuparkeria;
    private static final ResourceLocation TEXTURE_GERROTHORAX = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerrothorax.png");
    private final ModelGerrothorax modelGerrothorax;
    private static final ResourceLocation TEXTURE_HENODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/henodus.png");
    private final ModelHenodus modelHenodus;
    private static final ResourceLocation TEXTURE_HIBBERTOPTERUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hibbertopterus.png");
    private final ModelHibbertopterus modelHibbertopterus;
    private static final ResourceLocation TEXTURE_HYLONOMUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hylonomus.png");
    private final ModelHylonomus modelHylonomus;
    private static final ResourceLocation TEXTURE_HYPSOGNATHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hypsognathus.png");
    private final ModelHypsognathus modelHypsognathus;
    private static final ResourceLocation TEXTURE_ICHTHYOSTEGA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ichthyostega.png");
    private final ModelIchthyostega modelIchthyostega;
    private static final ResourceLocation TEXTURE_JAEKELOPTERUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/jaekelopterus.png");
    private final ModelJaekelopterus modelJaekelopterus;
    private static final ResourceLocation TEXTURE_KEICHOUSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/keichousaurus.png");
    private final ModelKeichousaurus modelKeichousaurus;
    private static final ResourceLocation TEXTURE_LABIDOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/labidosaurus.png");
    private final ModelLabidosaurus modelLabidosaurus;
    private static final ResourceLocation TEXTURE_MEGALOCEPHALUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megalocephalus.png");
    private final ModelMegalocephalus modelMegalocephalus;
    private static final ResourceLocation TEXTURE_MEGAZOSTRODON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/megazostrodon.png");
    private static final ResourceLocation TEXTURE_MESOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/mesosaurus.png");
    private final ModelMesosaurus modelMesosaurus;
    private static final ResourceLocation TEXTURE_MORGANUCODON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/morganucodon.png");
    private final ModelMorganucodon modelMorganucodon;
    private static final ResourceLocation TEXTURE_OMNIDENS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/omnidens.png");
    private final ModelOmnidens modelOmnidens;
    private static final ResourceLocation TEXTURE_PAGEA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pagea.png");
    private final ModelPagea modelPagea;
    private static final ResourceLocation TEXTURE_PANTYLUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pantylus.png");
    private final ModelPantylus modelPantylus;
    private static final ResourceLocation TEXTURE_PANZHOUSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/panzhousaurus.png");
    private final ModelPanzhousaurus modelPanzhousaurus;
    private static final ResourceLocation TEXTURE_PARMASTEGA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/parmastega.png");
    private final ModelParmastega modelParmastega;
    private static final ResourceLocation TEXTURE_PEDERPES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pederpes.png");
    private final ModelPederpes modelPederpes;
    private static final ResourceLocation TEXTURE_PLATYHYSTRIX = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/platyhystrix.png");
    private final ModelPlatyhystrix modelPlatyhystrix;
    private static final ResourceLocation TEXTURE_PROBURNETIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/proburnetia.png");
    private final ModelProburnetia modelProburnetia;
    private static final ResourceLocation TEXTURE_PROCYNOSUCHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/procynosuchus.png");
    private final ModelProcynosuchus modelProcynosuchus;
    private static final ResourceLocation TEXTURE_PROTEROGYRINUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/proterogyrinus.png");
    private final ModelProterogyrinus modelProterogyrinus;
    private static final ResourceLocation TEXTURE_PROSICTODON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/prosictodon.png");
    private static final ResourceLocation TEXTURE_PSEUDOTHERIUM = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pseudotherium.png");
    private final ModelPseudotherium modelPseudotherium;
    private static final ResourceLocation TEXTURE_PTERYGOTUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/pterygotus.png");
    private final ModelPterygotus modelPterygotus;
    private static final ResourceLocation TEXTURE_PURLOVIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/purlovia.png");
    private final ModelPurlovia modelPurlovia;
    private static final ResourceLocation TEXTURE_REMIGIOMONTANUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/remigiomontanus.png");
    private final ModelRemigiomontanus modelRemigiomontanus;
    private static final ResourceLocation TEXTURE_ROBERTIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/robertia.png");
    private static final ResourceLocation TEXTURE_SCLEROCORMUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sclerocormus.png");
    private final ModelSclerocormus modelSclerocormus;
    private static final ResourceLocation TEXTURE_SCLEROMOCHLUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scleromochlus.png");
    private final ModelScleromochlus modelScleromochlus;
    private static final ResourceLocation TEXTURE_SPATHICEPHALUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/spathicephalus.png");
    private final ModelSpathicephalus modelSpathicephalus;
    private static final ResourceLocation TEXTURE_SPHENOTITAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sphenotitan.png");
    private final ModelSphenotitan modelSphenotitan;
    private static final ResourceLocation TEXTURE_SUMINIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/suminia.png");
    private final ModelSuminia modelSuminia;
    private static final ResourceLocation TEXTURE_TELEOCRATER = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/teleocrater.png");
    private final ModelTeleocrater modelTeleocrater;
    private static final ResourceLocation TEXTURE_TETRACERATOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tetraceratops.png");
    private final ModelTetraceratops modelTetraceratops;
    private static final ResourceLocation TEXTURE_THRINAXODON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/thrinaxodon.png");
    private final ModelThrinaxodon modelThrinaxodon;
    private static final ResourceLocation TEXTURE_TIARAJUDENS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tiarajudens.png");
    private final ModelTiarajudens modelTiarajudens;
    private static final ResourceLocation TEXTURE_TIKTAALIK = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tiktaalik.png");
    private final ModelTiktaalik modelTiktaalik;
    private static final ResourceLocation TEXTURE_UROCORDYLUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/urocordylus.png");
    private final ModelUrocordylus modelUrocordylus;
    private static final ResourceLocation TEXTURE_WHATCHEERIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/whatcheeria.png");
    private final ModelWhatcheeria modelWhatcheeria;
    private static final ResourceLocation TEXTURE_WEBSTEROPRION = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/websteroprion.png");
    private final ModelWebsteroprion modelWebsteroprion;
    private static final ResourceLocation TEXTURE_GERARUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerarus.png");
    private final ModelGerarus modelGerarus;


    public RenderDisplayPlinth() {
        this.modelAcanthostega = new ModelAcanthostega();
        this.modelAcanthostomatops = new ModelAcanthostomatops();
        this.modelAcutiramusPlinth = new ModelAcutiramusPlinth();
        this.modelAmphibamus = new ModelAmphibamus();
        this.modelAscendonanus = new ModelAscendonanus();
        this.modelAulacephalodon = new ModelAulacephalodon();
        this.modelAustriadactylus = new ModelAustriadactylus();
        this.modelBalanerpeton = new ModelBalanerpeton();
        this.modelBranchiosaur = new ModelBranchiosaur();
        this.modelCacops = new ModelCacops();
        this.modelCaelestiventus = new ModelCaelestiventus();
        this.modelCaptorhinus = new ModelCaptorhinus();
        this.modelCarcinosoma = new ModelCarcinosoma();
        this.modelCartorhynchus = new ModelCartorhynchus();
        this.modelCasineria = new ModelCasineria();
        this.modelCaviramus = new ModelCaviramus();
        this.modelClaudiosaurus = new ModelClaudiosaurus();
        this.modelClevosaurus = new ModelClevosaurus();
        this.modelCyamodus = new ModelCyamodus();
        this.modelDasyceps = new ModelDasyceps();
        this.modelDatheosaurus = new ModelDatheosaurus();
        this.modelDiictodon = new ModelDiictodon();
        this.modelDiplocaulus = new ModelDiplocaulus();
        this.modelDiploceraspis = new ModelDiploceraspis();
        this.modelDvinia = new ModelDvinia();
        this.modelDvinosaurus = new ModelDvinosaurus();
        this.modelEffigia = new ModelEffigia();
        this.modelElginia = new ModelElginia();
        this.modelEorhynchochelys = new ModelEorhynchochelys();
        this.modelEretmorhipis = new ModelEretmorhipis();
        this.modelEuchambersia = new ModelEuchambersia();
        this.modelEudimorphodon = new ModelEudimorphodon();
        this.modelEuparkeria = new ModelEuparkeria();
        this.modelGerrothorax = new ModelGerrothorax();
        this.modelHenodus = new ModelHenodus();
        this.modelHibbertopterus = new ModelHibbertopterus();
        this.modelHylonomus = new ModelHylonomus();
        this.modelHypsognathus = new ModelHypsognathus();
        this.modelIchthyostega = new ModelIchthyostega();
        this.modelJaekelopterus = new ModelJaekelopterus();
        this.modelKeichousaurus = new ModelKeichousaurus();
        this.modelLabidosaurus = new ModelLabidosaurus();
        this.modelMegalocephalus = new ModelMegalocephalus();
        this.modelMesosaurus = new ModelMesosaurus();
        this.modelMorganucodon = new ModelMorganucodon();
        this.modelOmnidens = new ModelOmnidens();
        this.modelPagea = new ModelPagea();
        this.modelPantylus = new ModelPantylus();
        this.modelPanzhousaurus = new ModelPanzhousaurus();
        this.modelParmastega = new ModelParmastega();
        this.modelPederpes = new ModelPederpes();
        this.modelPlatyhystrix = new ModelPlatyhystrix();
        this.modelProburnetia = new ModelProburnetia();
        this.modelProcynosuchus = new ModelProcynosuchus();
        this.modelProterogyrinus = new ModelProterogyrinus();
        this.modelPseudotherium = new ModelPseudotherium();
        this.modelPterygotus = new ModelPterygotus();
        this.modelPurlovia = new ModelPurlovia();
        this.modelRemigiomontanus = new ModelRemigiomontanus();
        this.modelSclerocormus = new ModelSclerocormus();
        this.modelScleromochlus = new ModelScleromochlus();
        this.modelSpathicephalus = new ModelSpathicephalus();
        this.modelSphenotitan = new ModelSphenotitan();
        this.modelSuminia = new ModelSuminia();
        this.modelTeleocrater = new ModelTeleocrater();
        this.modelTetraceratops = new ModelTetraceratops();
        this.modelThrinaxodon = new ModelThrinaxodon();
        this.modelTiarajudens = new ModelTiarajudens();
        this.modelTiktaalik = new ModelTiktaalik();
        this.modelUrocordylus = new ModelUrocordylus();
        this.modelWhatcheeria = new ModelWhatcheeria();
        this.modelWebsteroprion = new ModelWebsteroprion();
        this.modelGerarus = new ModelGerarus();

    }

    @Override
    public void render(BlockDisplayPlinth.TileEntityDisplayPlinth entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        EnumFacing facing;
        boolean itemRender  = true;
        int currentRotation = 0;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");

            TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                if (te instanceof BlockDisplayPlinth.TileEntityDisplayPlinth) {
                    BlockDisplayPlinth.TileEntityDisplayPlinth tee = (BlockDisplayPlinth.TileEntityDisplayPlinth) te;
                    ItemStack itemstack = tee.getStackInSlot(0);
                    if (itemstack.isEmpty() || tee.isEmpty()) {
                        //System.err.println("No items1");
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

                            if (classEntity == EntityPrehistoricFloraAcanthostega.class) {
                                double offset = 0.17;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_ACANTHOSTEGA);
                                GlStateManager.scale(0.13F, 0.13F, 0.13F);
                                modelAcanthostega.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAcanthostomatops.class) {
                                double offset = 0.38;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_ACANTHOSTOMATOPS);
                                GlStateManager.scale(0.16F, 0.16F, 0.16F);
                                modelAcanthostomatops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAcutiramus.class) {
                                double offset = 2.3;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_ACUTIRAMUS);
                                GlStateManager.scale(1.1F, 1.1F, 1.1F);
                                modelAcutiramusPlinth.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAmphibamus.class) {
                                double offset = 0.3;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_AMPHIBAMUS);
                                GlStateManager.scale(0.28F, 0.28F, 0.28F);
                                modelAmphibamus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAscendonanus.class) {
                                double offset = 0.15;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_ASCENDONANUS);
                                GlStateManager.scale(0.06F, 0.06F, 0.06F);
                                modelAscendonanus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAulacephalodon.class) {
                                double offset = 0.63;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_AULACEPHALODON);
                                GlStateManager.scale(0.26F, 0.26F, 0.26F);
                                modelAulacephalodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraAustriadactylus.class) {
                                double offset = 0.3;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_AUSTRIADACTYLUS);
                                GlStateManager.scale(0.12F, 0.12F, 0.12F);
                                modelAustriadactylus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraBalanerpeton.class) {
                                double offset = 0.4;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_BALANERPETON);
                                GlStateManager.scale(0.16F, 0.16F, 0.16F);
                                modelBalanerpeton.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraBranchiosaur.class) {
                                double offset = 0.3;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_BRANCHIOSAUR);
                                GlStateManager.scale(0.12F, 0.12F, 0.12F);
                                modelBranchiosaur.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraCacops.class) {
                                double offset = 0.28;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_CACOPS);
                                GlStateManager.scale(0.12F, 0.12F, 0.12F);
                                modelCacops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraCaelestiventus.class) {
                                double offset = 0.44;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_CAELESTIVENTUS);
                                GlStateManager.scale(0.18F, 0.18F, 0.18F);
                                modelCaelestiventus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraCaptorhinus.class) {
                                double offset = 0.32;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_CAPTORHINUS);
                                GlStateManager.scale(0.13F, 0.13F, 0.13F);
                                modelCaptorhinus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraCarcinosoma.class) {
                                double offset = 1.53;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_CARCINOSOMA);
                                GlStateManager.scale(0.51F, 0.51F, 0.51F);
                                modelCarcinosoma.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraCartorhynchus.class) {
                                double offset = 0.167;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_CARTORHYNCHUS);
                                GlStateManager.scale(0.076F, 0.076F, 0.076F);
                                modelCartorhynchus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraCasineria.class) {
                                double offset = 0.35;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_CASINERIA);
                                GlStateManager.scale(0.14F, 0.14F, 0.14F);
                                modelCasineria.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraCaviramus.class) {
                                double offset = 0.34;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_CAVIRAMUS);
                                GlStateManager.scale(0.14F, 0.14F, 0.14F);
                                modelCaviramus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraClaudiosaurus.class) {
                                double offset = 0.23;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_CLAUDIOSAURUS);
                                GlStateManager.scale(0.09F, 0.09F, 0.09F);
                                modelClaudiosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraClevosaurus.class) {
                                double offset = 0.31;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_CLEVOSAURUS);
                                GlStateManager.scale(0.13F, 0.13F, 0.13F);
                                modelClevosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraCyamodus.class) {
                                double offset = 0.67;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_CYAMODUS);
                                GlStateManager.scale(0.261F, 0.261F, 0.261F);
                                modelCyamodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraDasyceps.class) {
                                double offset = 0.42;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_DASYCEPS);
                                GlStateManager.scale(0.18F, 0.18F, 0.18F);
                                modelDasyceps.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraDatheosaurus.class) {
                                double offset = 0.85;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_DATHEOSAURUS);
                                GlStateManager.scale(0.35F, 0.35F, 0.35F);
                                modelDatheosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraEosimops.class) {
                                double offset = 0.16;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_EOSIMOPS);
                                GlStateManager.scale(0.21F, 0.21F, 0.21F);
                                modelDiictodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraDiictodon.class) {
                                double offset = 0.16;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_DIICTODON);
                                GlStateManager.scale(0.2F, 0.2F, 0.2F);
                                modelDiictodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraDiplocaulus.class) {
                                double offset = 0.55;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_DIPLOCAULUS);
                                GlStateManager.scale(0.23F, 0.23F, 0.23F);
                                modelDiplocaulus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraDiploceraspis.class) {
                                double offset = 0.33;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_DIPLOCERASPIS);
                                GlStateManager.scale(0.13F, 0.13F, 0.13F);
                                modelDiploceraspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraDvinia.class) {
                                double offset = 0.41;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_DVINIA);
                                GlStateManager.scale(0.16F, 0.16F, 0.16F);
                                modelDvinia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraDvinosaurus.class) {
                                double offset = 0.73;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_DVINOSAURUS);
                                GlStateManager.scale(0.3F, 0.3F, 0.3F);
                                modelDvinosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraEffigia.class) {
                                double offset = 0.54;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_EFFIGIA);
                                GlStateManager.scale(0.22F, 0.22F, 0.22F);
                                modelEffigia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraElginia.class) {
                                double offset = 0.55;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_ELGINIA);
                                GlStateManager.scale(0.23F, 0.23F, 0.23F);
                                modelElginia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraEorhynchochelys.class) {
                                double offset = 0.62;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_EORHYNCHOCHELYS);
                                GlStateManager.scale(0.26F, 0.26F, 0.26F);
                                modelEorhynchochelys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraEretmorhipis.class) {
                                double offset = 0.33;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_ERETMORHIPIS);
                                GlStateManager.scale(0.14F, 0.14F, 0.14F);
                                modelEretmorhipis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraEuchambersia.class) {
                                double offset = 0.47;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_EUCHAMBERSIA);
                                GlStateManager.scale(0.2F, 0.2F, 0.2F);
                                modelEuchambersia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraEudimorphodon.class) {
                                double offset = 0.28;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_EUDIMORPHODON);
                                GlStateManager.scale(0.12F, 0.12F, 0.12F);
                                modelEudimorphodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraEuparkeria.class) {
                                double offset = 0.33;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_EUPARKERIA);
                                GlStateManager.scale(0.13F, 0.13F, 0.13F);
                                modelEuparkeria.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraGerrothorax.class) {
                                double offset = 0.82;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_GERROTHORAX);
                                GlStateManager.scale(0.34F, 0.34F, 0.34F);
                                modelGerrothorax.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraHenodus.class) {
                                double offset = 0.72;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_HENODUS);
                                GlStateManager.scale(0.3F, 0.3F, 0.3F);
                                modelHenodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraHibbertopterus.class) {
                                double offset = 1.4;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_HIBBERTOPTERUS);
                                GlStateManager.scale(0.64F, 0.64F, 0.64F);
                                modelHibbertopterus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraHylonomus.class) {
                                double offset = 0.06;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_HYLONOMUS);
                                GlStateManager.scale(0.13F, 0.13F, 0.13F);
                                modelHylonomus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraHypsognathus.class) {
                                double offset = 0.365;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_HYPSOGNATHUS);
                                GlStateManager.scale(0.15F, 0.15F, 0.15F);
                                modelHypsognathus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraIchthyostega.class) {
                                double offset = 0.12;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_ICHTHYOSTEGA);
                                GlStateManager.rotate(5, -1, 0, 0);
                                GlStateManager.scale(0.28F, 0.28F, 0.28F);
                                modelIchthyostega.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraJaekelopterus.class) {
                                double offset = 3;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_JAEKELOPTERUS);
                                GlStateManager.scale(1.1F, 1.1F, 1.1F);
                                modelJaekelopterus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraKeichousaurus.class) {
                                double offset = 0.42;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_KEICHOUSAURUS);
                                GlStateManager.scale(0.16F, 0.16F, 0.16F);
                                modelKeichousaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraLabidosaurus.class) {
                                double offset = 0.58;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_LABIDOSAURUS);
                                GlStateManager.scale(0.24F, 0.24F, 0.24F);
                                modelLabidosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraMegalocephalus.class) {
                                double offset = 0.38;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_MEGALOCEPHALUS);
                                GlStateManager.scale(0.16F, 0.16F, 0.16F);
                                modelMegalocephalus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraMegazostrodon.class) {
                                double offset = 0.27;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_MEGAZOSTRODON);
                                GlStateManager.scale(0.11F, 0.11F, 0.11F);
                                modelMorganucodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraMesosaurus.class) {
                                double offset = 0.04;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_MESOSAURUS);
                                GlStateManager.scale(0.07F, 0.07F, 0.07F);
                                modelMesosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraMorganucodon.class) {
                                double offset = 0.27;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_MORGANUCODON);
                                GlStateManager.scale(0.11F, 0.11F, 0.11F);
                                modelMorganucodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraOmnidens.class) {
                                double offset = 0.58;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_OMNIDENS);
                                GlStateManager.scale(0.24F, 0.24F, 0.24F);
                                modelOmnidens.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPagea.class) {
                                double offset = 0.9;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_PAGEA);
                                GlStateManager.scale(1.1F, 1.1F, 1.1F);
                                modelPagea.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPantylus.class) {
                                double offset = 0.43;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_PANTYLUS);
                                GlStateManager.scale(0.18F, 0.18F, 0.18F);
                                modelPantylus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPanzhousaurus.class) {
                                double offset = 0.013;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_PANZHOUSAURUS);
                                GlStateManager.scale(0.08F, 0.08F, 0.08F);
                                modelPanzhousaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraParmastega.class) {
                                double offset = 0.58;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_PARMASTEGA);
                                GlStateManager.scale(0.24F, 0.24F, 0.24F);
                                modelParmastega.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPederpes.class) {
                                double offset = 0.018;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_PEDERPES);
                                GlStateManager.scale(0.16F, 0.16F, 0.16F);
                                modelPederpes.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPlatyhystrix.class) {
                                double offset = 0.57;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_PLATYHYSTRIX);
                                GlStateManager.scale(0.25F, 0.25F, 0.25F);
                                modelPlatyhystrix.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraProburnetia.class) {
                                double offset = 0.49;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_PROBURNETIA);
                                GlStateManager.scale(0.21F, 0.21F, 0.21F);
                                modelProburnetia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraProcynosuchus.class) {
                                double offset = 0.6;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_PROCYNOSUCHUS);
                                GlStateManager.scale(0.25F, 0.25F, 0.25F);
                                modelProcynosuchus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraProterogyrinus.class) {
                                double offset = 0.96;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_PROTEROGYRINUS);
                                GlStateManager.scale(0.4F, 0.4F, 0.4F);
                                modelProterogyrinus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPseudotherium.class) {
                                double offset = 0.22;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_PSEUDOTHERIUM);
                                GlStateManager.scale(0.09F, 0.09F, 0.09F);
                                modelPseudotherium.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPterygotus.class) {
                                double offset = 1.8;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_PTERYGOTUS);
                                GlStateManager.scale(0.7F, 0.7F, 0.7F);
                                modelPterygotus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraPurlovia.class) {
                                double offset = 0.57;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_PURLOVIA);
                                GlStateManager.scale(0.24F, 0.24F, 0.24F);
                                modelPurlovia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraRemigiomontanus.class) {
                                double offset = 0.52;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_REMIGIOMONTANUS);
                                GlStateManager.scale(0.22F, 0.22F, 0.22F);
                                modelRemigiomontanus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraSclerocormus.class) {
                                double offset = 0.43;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_SCLEROCORMUS);
                                GlStateManager.scale(0.18F, 0.18F, 0.18F);
                                modelSclerocormus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraScleromochlus.class) {
                                double offset = 0.23;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_SCLEROMOCHLUS);
                                GlStateManager.scale(0.09F, 0.09F, 0.09F);
                                modelScleromochlus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraSpathicephalus.class) {
                                double offset = 0.37;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_SPATHICEPHALUS);
                                GlStateManager.scale(0.16F, 0.16F, 0.16F);
                                modelSpathicephalus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraSphenotitan.class) {
                                double offset = 0.55;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_SPHENOTITAN);
                                GlStateManager.scale(0.23F, 0.23F, 0.23F);
                                modelSphenotitan.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraSuminia.class) {
                                double offset = 0.21;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_SUMINIA);
                                GlStateManager.scale(0.09F, 0.09F, 0.09F);
                                modelSuminia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTeleocrater.class) {
                                double offset = 0.6;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_TELEOCRATER);
                                GlStateManager.scale(0.25F, 0.25F, 0.25F);
                                modelTeleocrater.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTetraceratops.class) {
                                double offset = 0.43;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_TETRACERATOPS);
                                GlStateManager.scale(0.18F, 0.18F, 0.18F);
                                modelTetraceratops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraThrinaxodon.class) {
                                double offset = 0.34;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_THRINAXODON);
                                GlStateManager.scale(0.14F, 0.14F, 0.14F);
                                modelThrinaxodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTiarajudens.class) {
                                double offset = 0.61;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_TIARAJUDENS);
                                GlStateManager.scale(2.6F, 2.6F, 2.6F);
                                modelTiarajudens.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraTiktaalik.class) {
                                double offset = 0.58;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_TIKTAALIK);
                                GlStateManager.scale(0.22F, 0.22F, 0.22F);
                                modelTiktaalik.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraUrocordylus.class) {
                                double offset = -0.09;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_UROCORDYLUS);
                                GlStateManager.scale(0.49F * 1.4F, 0.49F * 1.4F, 0.49F * 1.4F);
                                modelUrocordylus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraWhatcheeria.class) {
                                double offset = 1;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_WHATCHEERIA);
                                GlStateManager.scale(0.42F, 0.42F, 0.42F);
                                modelWhatcheeria.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraWebsteroprion.class) {
                                double offset = 0.67;
                                //double voffset = -0.15;
                                double voffset = 0;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5 + voffset);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_WEBSTEROPRION);
                                GlStateManager.scale(0.26F, 0.26F, 0.26F);
                                modelWebsteroprion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraProsictodon.class) {
                                double offset = 0.16;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_PROSICTODON);
                                GlStateManager.scale(0.19F, 0.19F, 0.19F);
                                modelDiictodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else if (classEntity == EntityPrehistoricFloraRobertia.class) {
                                double offset = 0.1;
                                GlStateManager.translate(x + 0.5, y + 0.5 + offset, z + 0.5);
                                GlStateManager.rotate(180, 0F, 0F, 1F);
                                GlStateManager.rotate(currentRotation, 0F, 1F, 0F);
                                this.bindTexture(TEXTURE_ROBERTIA);
                                GlStateManager.scale(0.13F, 0.13F, 0.13F);
                                modelDiictodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                            } else {
                                itemRender = true;
                            }
                        }
                    }

                    // ********************************************************************
                    else if (itemRender){ //standard items

                        GlStateManager.alphaFunc(516, 0.1F);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        //GlStateManager.pushMatrix();

                        float scale = 0.6666F;

                        double offset = Math.sin((tee.getWorld().getTotalWorldTime() + partialTicks) / 8) / 32.0;
                        GlStateManager.translate(x + 0.5, y + 0.85 + offset, z + 0.5);
                        GlStateManager.rotate((tee.getWorld().getTotalWorldTime() + partialTicks) * 2, 0, 1, 0);

                        GlStateManager.scale(scale, scale, scale);

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
}