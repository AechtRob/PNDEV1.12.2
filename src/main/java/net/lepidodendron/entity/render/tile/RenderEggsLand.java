package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockEggs;
import net.lepidodendron.entity.model.tile.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RenderEggsLand extends TileEntitySpecialRenderer<BlockEggs.TileEntityCustom> {

    private final ModelEggMedium medium_egg;
    private final ModelEggSmall small_egg;
    private final ModelEggLarge large_egg;
    private final ModelEggHuge huge_egg;
    private final ModelRottenLogEggs rotten_wood_eggs;
    public static final ResourceLocation TEXTURE_ANTEOSAURUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_anteosaurus.png");
    public static final ResourceLocation TEXTURE_ARCHOSAURUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_archosaurus.png");
    public static final ResourceLocation TEXTURE_AULACEPHALODON_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_aulacephalodon.png");
    public static final ResourceLocation TEXTURE_BUNOSTEGOS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_bunostegos.png");
    public static final ResourceLocation TEXTURE_COELOPHYSIS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_coelophysis.png");
    public static final ResourceLocation TEXTURE_COTYLORHYNCHUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_cotylorhynchus.png");
    public static final ResourceLocation TEXTURE_CTENOSPONDYLUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_ctenospondylus.png");
    public static final ResourceLocation TEXTURE_CYNOGNATHUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_cynognathus.png");
    public static final ResourceLocation TEXTURE_DATHEOSAURUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_datheosaurus.png");
    public static final ResourceLocation TEXTURE_DIADECTES_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_diadectes.png");
    public static final ResourceLocation TEXTURE_DIICTODON_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_diictodon.png");
    public static final ResourceLocation TEXTURE_DIMETRODON_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_dimetrodon.png");
    public static final ResourceLocation TEXTURE_DVINIA_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_dvinia.png");
    public static final ResourceLocation TEXTURE_ELGINIA_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_elginia.png");
    public static final ResourceLocation TEXTURE_EORAPTOR_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_eoraptor.png");
    public static final ResourceLocation TEXTURE_EOSIMOPS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_eosimops.png");
    public static final ResourceLocation TEXTURE_ESTEMMENOSUCHUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_estemmenosuchus.png");
    public static final ResourceLocation TEXTURE_EUCHAMBERSIA_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_euchambersia.png");
    public static final ResourceLocation TEXTURE_GORGONOPS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_gorgonops.png");
    public static final ResourceLocation TEXTURE_HERRERASAURUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_herrerasaurus.png");
    public static final ResourceLocation TEXTURE_INOSTRANCEVIA_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_inostrancevia.png");
    public static final ResourceLocation TEXTURE_JONKERIA_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_jonkeria.png");
    public static final ResourceLocation TEXTURE_LILIENSTERNUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_liliensternus.png");
    public static final ResourceLocation TEXTURE_LISOWICIA_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_lisowicia.png");
    public static final ResourceLocation TEXTURE_LYSTROSAURUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_lystrosaurus.png");
    public static final ResourceLocation TEXTURE_MOSCHOPS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_moschops.png");
    public static final ResourceLocation TEXTURE_PLACERIAS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_placerias.png");
    public static final ResourceLocation TEXTURE_PLATEOSAURUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_plateosaurus.png");
    public static final ResourceLocation TEXTURE_PRISTEROGNATHUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_pristerognathus.png");
    public static final ResourceLocation TEXTURE_PROBURNETIA_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_proburnetia.png");
    public static final ResourceLocation TEXTURE_PROCYNOSUCHUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_procynosuchus.png");
    public static final ResourceLocation TEXTURE_PROSICTODON_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_prosictodon.png");
    public static final ResourceLocation TEXTURE_PURLOVIA_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_purlovia.png");
    public static final ResourceLocation TEXTURE_REMIGIOMONTANUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_remigiomontanus.png");
    public static final ResourceLocation TEXTURE_ROBERTIA_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_robertia.png");
    public static final ResourceLocation TEXTURE_SAUROCTONUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_sauroctonus.png");
    public static final ResourceLocation TEXTURE_SCUTOSAURUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_scutosaurus.png");
    public static final ResourceLocation TEXTURE_SHRINGASAURUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_shringasaurus.png");
    public static final ResourceLocation TEXTURE_SPHENACODON_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_sphenacodon.png");
    public static final ResourceLocation TEXTURE_SUMINIA_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_suminia.png");
    public static final ResourceLocation TEXTURE_TAPINOCEPHALUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_tapinocephalus.png");
    public static final ResourceLocation TEXTURE_TETRACERATOPS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_tetraceratops.png");
    public static final ResourceLocation TEXTURE_TITANOSUCHUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_titanosuchus.png");
    public static final ResourceLocation TEXTURE_THRINAXODON_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_thrinaxodon.png");
    public static final ResourceLocation TEXTURE_VIVAXOSAURUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eggs_vivaxosaurus.png");

    public static final ResourceLocation TEXTURE_CLAUDIOSAURUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/claudiosaurus_eggs.png");
    public static final ResourceLocation TEXTURE_COELUROSAURAVUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/coelurosauravus_eggs.png");
    public static final ResourceLocation TEXTURE_GLAURUNG_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/glaurung_eggs.png");
    public static final ResourceLocation TEXTURE_RAUTIANIA_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rautiania_eggs.png");
    public static final ResourceLocation TEXTURE_WEIGELTISAURUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/weigeltisaurus_eggs.png");
    public static final ResourceLocation TEXTURE_HYLONOMUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hylonomus_eggs.png");
    public static final ResourceLocation TEXTURE_OPHIACODON_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ophiacodon_eggs.png");
    public static final ResourceLocation TEXTURE_LABIDOSAURUS_EGG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/labidosaurus_eggs.png");

    public RenderEggsLand() {
        this.small_egg = new ModelEggSmall();
        this.medium_egg = new ModelEggMedium();
        this.large_egg = new ModelEggLarge();
        this.huge_egg = new ModelEggHuge();
        this.rotten_wood_eggs = new ModelRottenLogEggs();
    }

    @Override
    public void render(BlockEggs.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        //EnumFacing facing = EnumFacing.NORTH;
        int eggType = 0;
        ResourceLocation TEXTURE_EGG = null;
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        if (entity != null && entity.hasWorld()) {
            String creatureType = new Object() {
                public String getValue(BlockPos pos1, String tag) {
                    TileEntity tileEntity = world.getTileEntity(pos1);
                    if (tileEntity != null)
                        return tileEntity.getTileData().getString(tag);
                    return "";
                }
            }.getValue(pos, "creature");
            if (!creatureType.equals("")) {
                if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_anteosaurus")) {
                    TEXTURE_EGG = TEXTURE_ANTEOSAURUS_EGG;
                    eggType = 1; //medium
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_archosaurus")) {
                    TEXTURE_EGG = TEXTURE_ARCHOSAURUS_EGG;
                    eggType = 1; //medium
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_aulacephalodon")) {
                    TEXTURE_EGG = TEXTURE_AULACEPHALODON_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_bunostegos")) {
                    TEXTURE_EGG = TEXTURE_BUNOSTEGOS_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_claudiosaurus")) {
                    TEXTURE_EGG = TEXTURE_CLAUDIOSAURUS_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_coelophysis")) {
                    TEXTURE_EGG = TEXTURE_COELOPHYSIS_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_coelurosauravus")) {
                    TEXTURE_EGG = TEXTURE_COELUROSAURAVUS_EGG;
                    eggType = 4; //rotten wood
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_coelophysis")) {
                    TEXTURE_EGG = TEXTURE_COTYLORHYNCHUS_EGG;
                    eggType = 1; //medium
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ctenospondylus")) {
                    TEXTURE_EGG = TEXTURE_CTENOSPONDYLUS_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_cynognathus")) {
                    TEXTURE_EGG = TEXTURE_CYNOGNATHUS_EGG;
                    eggType = 1; //medium
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_datheosaurus")) {
                    TEXTURE_EGG = TEXTURE_DATHEOSAURUS_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_diadectes")) {
                    TEXTURE_EGG = TEXTURE_DIADECTES_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_diictodon")) {
                    TEXTURE_EGG = TEXTURE_DIICTODON_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_dimetrodon")) {
                    TEXTURE_EGG = TEXTURE_DIMETRODON_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_dvinia")) {
                    TEXTURE_EGG = TEXTURE_DVINIA_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_elginia")) {
                    TEXTURE_EGG = TEXTURE_ELGINIA_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_eoraptor")) {
                    TEXTURE_EGG = TEXTURE_EORAPTOR_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_eosimops")) {
                    TEXTURE_EGG = TEXTURE_EOSIMOPS_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_estemmenosuchus")) {
                    TEXTURE_EGG = TEXTURE_ESTEMMENOSUCHUS_EGG;
                    eggType = 1; //medium
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_euchambersia")) {
                    TEXTURE_EGG = TEXTURE_EUCHAMBERSIA_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_glaurung")) {
                    TEXTURE_EGG = TEXTURE_GLAURUNG_EGG;
                    eggType = 4; //rotten wood
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_gorgonops")) {
                    TEXTURE_EGG = TEXTURE_GORGONOPS_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_herrerasaurus")) {
                    TEXTURE_EGG = TEXTURE_HERRERASAURUS_EGG;
                    eggType = 2; //large
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_hylonomus")) {
                    TEXTURE_EGG = TEXTURE_HYLONOMUS_EGG;
                    eggType = 4; //rotten wood
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_inostrancevia")) {
                    TEXTURE_EGG = TEXTURE_INOSTRANCEVIA_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_jonkeria")) {
                    TEXTURE_EGG = TEXTURE_JONKERIA_EGG;
                    eggType = 2; //large
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_labidosaurus")) {
                    TEXTURE_EGG = TEXTURE_LABIDOSAURUS_EGG;
                    eggType = 4; //rotten wood
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_liliensternus")) {
                    TEXTURE_EGG = TEXTURE_LILIENSTERNUS_EGG;
                    eggType = 1; //medium
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_lisowicia")) {
                    TEXTURE_EGG = TEXTURE_LISOWICIA_EGG;
                    eggType = 2; //large
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_lystrosaurus")) {
                    TEXTURE_EGG = TEXTURE_LYSTROSAURUS_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_moschops")) {
                    TEXTURE_EGG = TEXTURE_MOSCHOPS_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ophiacodon")) {
                    TEXTURE_EGG = TEXTURE_OPHIACODON_EGG;
                    eggType = 4; //rotten wood
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_placerias")) {
                    TEXTURE_EGG = TEXTURE_PLACERIAS_EGG;
                    eggType = 1; //medium
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_plateosaurus")) {
                    TEXTURE_EGG = TEXTURE_PLATEOSAURUS_EGG;
                    eggType = 2; //large
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_pristerognathus")) {
                    TEXTURE_EGG = TEXTURE_PRISTEROGNATHUS_EGG;
                    eggType = 1; //medium
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_proburnetia")) {
                    TEXTURE_EGG = TEXTURE_PROBURNETIA_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_procynosuchus")) {
                    TEXTURE_EGG = TEXTURE_PROCYNOSUCHUS_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_prosictodon")) {
                    TEXTURE_EGG = TEXTURE_PROSICTODON_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_purlovia")) {
                    TEXTURE_EGG = TEXTURE_PURLOVIA_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_rautiania")) {
                    TEXTURE_EGG = TEXTURE_RAUTIANIA_EGG;
                    eggType = 4; //rotten wood
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_remigiomontanus")) {
                    TEXTURE_EGG = TEXTURE_REMIGIOMONTANUS_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_robertia")) {
                    TEXTURE_EGG = TEXTURE_ROBERTIA_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_sauroctonus")) {
                    TEXTURE_EGG = TEXTURE_SAUROCTONUS_EGG;
                    eggType = 1; //medium
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_scutosaurus")) {
                    TEXTURE_EGG = TEXTURE_SCUTOSAURUS_EGG;
                    eggType = 1; //medium
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_shringasaurus")) {
                    TEXTURE_EGG = TEXTURE_SHRINGASAURUS_EGG;
                    eggType = 1; //medium
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_sphenacodon")) {
                    TEXTURE_EGG = TEXTURE_SPHENACODON_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_suminia")) {
                    TEXTURE_EGG = TEXTURE_SUMINIA_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_tapinocephalus")) {
                    TEXTURE_EGG = TEXTURE_TAPINOCEPHALUS_EGG;
                    eggType = 1; //medium
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_teraceratops")) {
                    TEXTURE_EGG = TEXTURE_TETRACERATOPS_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_thrinaxodon")) {
                    TEXTURE_EGG = TEXTURE_THRINAXODON_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_titanosuchus")) {
                    TEXTURE_EGG = TEXTURE_TITANOSUCHUS_EGG;
                    eggType = 2; //large
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_vivaxosaurus")) {
                    TEXTURE_EGG = TEXTURE_VIVAXOSAURUS_EGG;
                    eggType = 0; //small
                }
                else if (creatureType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_weigeltisaurus")) {
                    TEXTURE_EGG = TEXTURE_WEIGELTISAURUS_EGG;
                    eggType = 4; //rotten wood
                }
            }
            //Render any eggs:
            GlStateManager.pushMatrix();
            if (eggType == 4) {
                GlStateManager.translate(x + 0.5F, y + 1.0F, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.scale(0.50F, 0.50F, 0.50F);
            }
            else {
                GlStateManager.translate(x + 0.5F, y + 1.500F, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
            }
            Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_EGG);
            switch (eggType) {
                case 0: default:
                    this.small_egg.renderAll(1.2f);
                    break;

                case 1:
                    this.medium_egg.renderAll(1.2f);
                    break;

                case 2:
                    this.large_egg.renderAll(1.2f);
                    break;

                case 3:
                    this.huge_egg.renderAll(1.2f);
                    break;

                case 4:
                    this.rotten_wood_eggs.renderAll(0.075F);
                    break;
            }
            GlStateManager.popMatrix();
        }
    }
}