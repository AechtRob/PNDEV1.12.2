package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockNest;
import net.lepidodendron.entity.model.tile.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RenderNest extends TileEntitySpecialRenderer<BlockNest.TileEntityCustom> {

    private final ModelEggMedium medium_egg;
    private final ModelEggSmall small_egg;
    private final ModelEggLarge large_egg;
    private final ModelNestSmall nest_small;
    private final ModelNestMound nest_mound;
    private final ModelNestBowlMedium nest_bowl_medium;

    private static final ResourceLocation TEXTURE_ANTEOSAURUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_anteosaurus.png");
    private static final ResourceLocation TEXTURE_AULACEPHALODON_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_aulacephalodon.png");
    private static final ResourceLocation TEXTURE_BUNOSTEGOS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_bunostegos.png");
    private static final ResourceLocation TEXTURE_COELOPHYSIS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_coelophysis.png");
    private static final ResourceLocation TEXTURE_COTYLORHYNCHUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_cotylorhynchus.png");
    private static final ResourceLocation TEXTURE_CTENOSPONDYLUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_ctenospondylus.png");
    private static final ResourceLocation TEXTURE_CYNOGNATHUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_cynognathus.png");
    private static final ResourceLocation TEXTURE_DATHEOSAURUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_datheosaurus.png");
    private static final ResourceLocation TEXTURE_DIADECTES_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_diadectes.png");
    private static final ResourceLocation TEXTURE_DIICTODON_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_diictodon.png");
    private static final ResourceLocation TEXTURE_DIMETRODON_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_dimetrodon.png");
    private static final ResourceLocation TEXTURE_DVINIA_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_dvinia.png");
    private static final ResourceLocation TEXTURE_ELGINIA_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_elginia.png");
    private static final ResourceLocation TEXTURE_EORAPTOR_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_eoraptor.png");
    private static final ResourceLocation TEXTURE_EOSIMOPS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_eosimops.png");
    private static final ResourceLocation TEXTURE_ESTEMMENOSUCHUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_estemmenosuchus.png");
    private static final ResourceLocation TEXTURE_EUCHAMBERSIA_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_euchambersia.png");
    private static final ResourceLocation TEXTURE_GORGONOPS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_gorgonops.png");
    private static final ResourceLocation TEXTURE_HERRERASAURUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_herrerasaurus.png");
    private static final ResourceLocation TEXTURE_INOSTRANCEVIA_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_inostrancevia.png");
    private static final ResourceLocation TEXTURE_JONKERIA_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_jonkeria.png");
    private static final ResourceLocation TEXTURE_LILIENSTERNUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_liliensternus.png");
    private static final ResourceLocation TEXTURE_LISOWICIA_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_lisowicia.png");
    private static final ResourceLocation TEXTURE_LYSTROSAURUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_lystrosaurus.png");
    private static final ResourceLocation TEXTURE_MOSCHOPS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_moschops.png");
    private static final ResourceLocation TEXTURE_PLACERIAS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_placerias.png");
    private static final ResourceLocation TEXTURE_PLATEOSAURUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_plateosaurus.png");
    private static final ResourceLocation TEXTURE_PROCYNOSUCHUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_procynosuchus.png");
    private static final ResourceLocation TEXTURE_PRISTEROGNATHUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_pristerognathus.png");
    private static final ResourceLocation TEXTURE_PROBURNETIA_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_proburnetia.png");
    private static final ResourceLocation TEXTURE_PROSICTODON_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_prosictodon.png");
    private static final ResourceLocation TEXTURE_PURLOVIA_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_purlovia.png");
    private static final ResourceLocation TEXTURE_REMIGIOMONTANUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_remigiomontanus.png");
    private static final ResourceLocation TEXTURE_ROBERTIA_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_robertia.png");
    private static final ResourceLocation TEXTURE_SAUROCTONUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_sauroctonus.png");
    private static final ResourceLocation TEXTURE_SCUTOSAURUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_scutosaurus.png");
    private static final ResourceLocation TEXTURE_SHRINGASAURUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_shringasautus.png");
    private static final ResourceLocation TEXTURE_SPHENACODON_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_sphenacodon.png");
    private static final ResourceLocation TEXTURE_SUMINIA_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_suminia.png");
    private static final ResourceLocation TEXTURE_TAPINOCEPHALUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_tapinocephalus.png");
    private static final ResourceLocation TEXTURE_TETRACERATOPS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_tetraceratops.png");
    private static final ResourceLocation TEXTURE_TITANOSUCHUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_titanosuchus.png");
    private static final ResourceLocation TEXTURE_THRINAXODON_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_thrinaxodon.png");
    private static final ResourceLocation TEXTURE_VIVAXOSAURUS_NEST = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/nest_vivaxosaurus.png");

    //private static final ResourceLocation TEXTURE_MOUND_DIRT = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64sand.png");
    private static final ResourceLocation TEXTURE_MOUND_DIRT = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64dirt.png");
    private static final ResourceLocation TEXTURE_MOUND_GRAVEL = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64gravel.png");
    private static final ResourceLocation TEXTURE_MOUND_SAND = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64sand.png");
    private static final ResourceLocation TEXTURE_MOUND_RED_SAND = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64sand_red.png");
    private static final ResourceLocation TEXTURE_MOUND_PANGAEAN_SAND = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64sand_pangaean.png");
    private static final ResourceLocation TEXTURE_MOUND_CLAY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64clay.png");
    private static final ResourceLocation TEXTURE_MOUND_RED_CLAY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64clay_red.png");
    private static final ResourceLocation TEXTURE_MOUND_SILTY_DIRT = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64silty_dirt.png");
    private static final ResourceLocation TEXTURE_MOUND_BLACK_SAND = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64sand_black.png");
    private static final ResourceLocation TEXTURE_MOUND_SANDY_DIRT = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64sandy_dirt.png");
    private static final ResourceLocation TEXTURE_MOUND_LUSH = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64lush.png");
    private static final ResourceLocation TEXTURE_MOUND_BLACK_SANDY_DIRT = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64sandy_dirt_black.png");
    private static final ResourceLocation TEXTURE_MOUND_PANGAEAN_SANDY_DIRT = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sx64sandy_dirt_pangaeanandx64.png");
    private static final ResourceLocation TEXTURE_MOUND_RED_SANDY_DIRT = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64sandy_dirt_red.png");
    private static final ResourceLocation TEXTURE_MOUND_PREHISTORIC_SANDY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64prehistoric_sandy.png");
    private static final ResourceLocation TEXTURE_MOUND_PREHISTORIC_RED_SANDY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64prehistoric_red.png");
    private static final ResourceLocation TEXTURE_MOUND_PREHISTORIC_PANGAEAN_SANDY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64prehistoric_pangaean.png");
    private static final ResourceLocation TEXTURE_MOUND_PREHISTORIC_BLACK_SANDY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64prehistoric_black.png");
    private static final ResourceLocation TEXTURE_MOUND_PREHISTORIC_FERNY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64fern.png");
    private static final ResourceLocation TEXTURE_MOUND_PREHISTORIC_MOSSY = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64mossy.png");
    private static final ResourceLocation TEXTURE_MOUND_LITTER = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64leaf_litter.png");
    private static final ResourceLocation TEXTURE_MOUND_PODZOL = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64podzol.png");
    private static final ResourceLocation TEXTURE_MOUND_MUD = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64mud.png");
    private static final ResourceLocation TEXTURE_MOUND_PREHISTORIC = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64prehistoric.png");
    private static final ResourceLocation TEXTURE_MOUND_SCORCHED = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/x64scorched_earth.png");

    public RenderNest() {
        this.small_egg = new ModelEggSmall();
        this.medium_egg = new ModelEggMedium();
        this.large_egg = new ModelEggLarge();

        this.nest_small = new ModelNestSmall();
        this.nest_mound = new ModelNestMound();
        this.nest_bowl_medium = new ModelNestBowlMedium();
    }

    @Override
    public void render(BlockNest.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        //EnumFacing facing = EnumFacing.NORTH;
        int eggType = 0;
        int nestType = 0;
        ResourceLocation TEXTURE_EGG = null;
        ResourceLocation TEXTURE_NEST = null;
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        if (entity != null && entity.hasWorld() && world.getBlockState(pos).getBlock() == BlockNest.block) {

            String nestRenderType = new Object() {
                public String getValue(BlockPos pos1, String tag) {
                    TileEntity tileEntity = world.getTileEntity(pos1);
                    if (tileEntity != null)
                        return tileEntity.getTileData().getString(tag);
                    return "";
                }
            }.getValue(pos, "creature");
            if (!nestRenderType.equals("")) {
                if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_anteosaurus")) {
                    TEXTURE_NEST = TEXTURE_ANTEOSAURUS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_archosaurus")) {
                    TEXTURE_NEST = TEXTURE_MOUND_SAND;
                    nestType = 1; //mound
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_aulacephalodon")) {
                    TEXTURE_NEST = TEXTURE_AULACEPHALODON_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_bunostegos")) {
                    TEXTURE_NEST = TEXTURE_BUNOSTEGOS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_claudiosaurus")) {
                    TEXTURE_NEST = TEXTURE_MOUND_SAND;
                    nestType = 1; //mound
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_coelophysis")) {
                    TEXTURE_NEST = TEXTURE_COELOPHYSIS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_coelurosauravus")) {
                    TEXTURE_NEST = TEXTURE_MOUND_SAND;
                    nestType = 1; //mound
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_cotylorhynchus")) {
                    TEXTURE_NEST = TEXTURE_COTYLORHYNCHUS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_ctenospondylus")) {
                    TEXTURE_NEST = TEXTURE_CTENOSPONDYLUS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_cynognathus")) {
                    TEXTURE_NEST = TEXTURE_CYNOGNATHUS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_datheosaurus")) {
                    TEXTURE_NEST = TEXTURE_DATHEOSAURUS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_diadectes")) {
                    TEXTURE_NEST = TEXTURE_DIADECTES_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_diictodon")) {
                    TEXTURE_NEST = TEXTURE_DIICTODON_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_dimetrodon")) {
                    TEXTURE_NEST = TEXTURE_DIMETRODON_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_dvinia")) {
                    TEXTURE_NEST = TEXTURE_DVINIA_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_elginia")) {
                    TEXTURE_NEST = TEXTURE_ELGINIA_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_eoraptor")) {
                    TEXTURE_NEST = TEXTURE_EORAPTOR_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_eosimops")) {
                    TEXTURE_NEST = TEXTURE_EOSIMOPS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_estemmenosuchus")) {
                    TEXTURE_NEST = TEXTURE_ESTEMMENOSUCHUS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_euchambersia")) {
                    TEXTURE_NEST = TEXTURE_EUCHAMBERSIA_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_glaurung")) {
                    TEXTURE_NEST = TEXTURE_MOUND_SAND;
                    nestType = 1; //mound
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_gorgonops")) {
                    TEXTURE_NEST = TEXTURE_GORGONOPS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_herrerasaurus")) {
                    TEXTURE_NEST = TEXTURE_HERRERASAURUS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_inostrancevia")) {
                    TEXTURE_NEST = TEXTURE_INOSTRANCEVIA_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_jonkeria")) {
                    TEXTURE_NEST = TEXTURE_JONKERIA_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_liliensternus")) {
                    TEXTURE_NEST = TEXTURE_LILIENSTERNUS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_lisowicia")) {
                    TEXTURE_NEST = TEXTURE_LISOWICIA_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_lystrosaurus")) {
                    TEXTURE_NEST = TEXTURE_LYSTROSAURUS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_moschops")) {
                    TEXTURE_NEST = TEXTURE_MOSCHOPS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_placerias")) {
                    TEXTURE_NEST = TEXTURE_PLACERIAS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_plateosaurus")) {
                    TEXTURE_NEST = TEXTURE_PLATEOSAURUS_NEST;
                    nestType = 2; //medium bowl
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_pristerognathus")) {
                    TEXTURE_NEST = TEXTURE_PRISTEROGNATHUS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_proburnetia")) {
                    TEXTURE_NEST = TEXTURE_PROBURNETIA_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_procynosuchus")) {
                    TEXTURE_NEST = TEXTURE_PROCYNOSUCHUS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_prosictodon")) {
                    TEXTURE_NEST = TEXTURE_PROSICTODON_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_purlovia")) {
                    TEXTURE_NEST = TEXTURE_PURLOVIA_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_rautiania")) {
                    TEXTURE_NEST = TEXTURE_MOUND_SAND;
                    nestType = 1; //mound
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_remigiomontanus")) {
                    TEXTURE_NEST = TEXTURE_REMIGIOMONTANUS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_robertia")) {
                    TEXTURE_NEST = TEXTURE_ROBERTIA_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_sauroctonus")) {
                    TEXTURE_NEST = TEXTURE_SAUROCTONUS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_scutosaurus")) {
                    TEXTURE_NEST = TEXTURE_SCUTOSAURUS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_shringasaurus")) {
                    TEXTURE_NEST = TEXTURE_SHRINGASAURUS_NEST;
                    nestType = 1; //mound
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_sphenacodon")) {
                    TEXTURE_NEST = TEXTURE_SPHENACODON_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_suminia")) {
                    TEXTURE_NEST = TEXTURE_SUMINIA_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_tapinocephalus")) {
                    TEXTURE_NEST = TEXTURE_TAPINOCEPHALUS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_tetraceratops")) {
                    TEXTURE_NEST = TEXTURE_TETRACERATOPS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_thrinaxodon")) {
                    TEXTURE_NEST = TEXTURE_THRINAXODON_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_titanosuchus")) {
                    TEXTURE_NEST = TEXTURE_TITANOSUCHUS_NEST;
                    nestType = 0; //standard
                }
                else if (nestRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":prehistoric_flora_vivaxosaurus")) {
                    TEXTURE_NEST = TEXTURE_VIVAXOSAURUS_NEST;
                    nestType = 0; //standard
                }

                if (nestType == 1) { //Mounds:
                    switch (world.getBlockState(pos).getActualState(world, pos).getValue(BlockNest.TYPE)) {
                        case 0:
                        default:
                            TEXTURE_NEST = TEXTURE_MOUND_DIRT;
                            break;

                        case 1:
                            TEXTURE_NEST = TEXTURE_MOUND_DIRT;
                            break;

                        case 2:
                            TEXTURE_NEST = TEXTURE_MOUND_GRAVEL;
                            break;

                        case 3:
                            TEXTURE_NEST = TEXTURE_MOUND_SAND;
                            break;

                        case 4:
                            TEXTURE_NEST = TEXTURE_MOUND_RED_SAND;
                            break;

                        case 5:
                            TEXTURE_NEST = TEXTURE_MOUND_PANGAEAN_SAND;
                            break;

                        case 6:
                            TEXTURE_NEST = TEXTURE_MOUND_CLAY;
                            break;

                        case 7:
                            TEXTURE_NEST = TEXTURE_MOUND_RED_CLAY;
                            break;

                        case 8:
                            TEXTURE_NEST = TEXTURE_MOUND_SILTY_DIRT;
                            break;

                        case 9:
                            TEXTURE_NEST = TEXTURE_MOUND_BLACK_SAND;
                            break;

                        case 10:
                            TEXTURE_NEST = TEXTURE_MOUND_SANDY_DIRT;
                            break;

                        case 11:
                            TEXTURE_NEST = TEXTURE_MOUND_LUSH;
                            break;

                        case 12:
                            TEXTURE_NEST = TEXTURE_MOUND_BLACK_SANDY_DIRT;
                            break;

                        case 13:
                            TEXTURE_NEST = TEXTURE_MOUND_PANGAEAN_SANDY_DIRT;
                            break;

                        case 14:
                            TEXTURE_NEST = TEXTURE_MOUND_RED_SANDY_DIRT;
                            break;

                        case 15:
                            TEXTURE_NEST = TEXTURE_MOUND_PREHISTORIC_SANDY;
                            break;

                        case 16:
                            TEXTURE_NEST = TEXTURE_MOUND_PREHISTORIC_RED_SANDY;
                            break;

                        case 17:
                            TEXTURE_NEST = TEXTURE_MOUND_PREHISTORIC_PANGAEAN_SANDY;
                            break;

                        case 18:
                            TEXTURE_NEST = TEXTURE_MOUND_PREHISTORIC_BLACK_SANDY;
                            break;

                        case 19:
                            TEXTURE_NEST = TEXTURE_MOUND_PREHISTORIC_FERNY;
                            break;

                        case 20:
                            TEXTURE_NEST = TEXTURE_MOUND_PREHISTORIC_MOSSY;
                            break;

                        case 21:
                            TEXTURE_NEST = TEXTURE_MOUND_LITTER;
                            break;

                        case 22:
                            TEXTURE_NEST = TEXTURE_MOUND_PODZOL;
                            break;

                        case 23:
                            TEXTURE_NEST = TEXTURE_MOUND_MUD;
                            break;

                        case 24:
                            TEXTURE_NEST = TEXTURE_MOUND_PREHISTORIC;
                            break;

                        case 25:
                            TEXTURE_NEST = TEXTURE_MOUND_SCORCHED;
                            break;

                    }
                }

                GlStateManager.pushMatrix();
                GlStateManager.translate(x + 0.5F, y + 1.450F, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_NEST);
                switch (nestType) {
                    case 0:
                    default:
                        this.nest_small.renderAll(1.2f);
                        break;

                    case 1:
                        this.nest_mound.renderAll(1.2f);
                        //System.err.println("Render mound");
                        break;

                    case 2:
                        this.nest_bowl_medium.renderAll(1.2f);
                        break;
                }
                GlStateManager.popMatrix();
            }

            String eggRenderType = new Object() {
                public String getValue(BlockPos pos1, String tag) {
                    TileEntity tileEntity = world.getTileEntity(pos1);
                    if (tileEntity != null)
                        return tileEntity.getTileData().getString(tag);
                    return "";
                }
            }.getValue(pos, "egg");

            //System.err.println("eggRenderType " + eggRenderType);

            if (!eggRenderType.equals("")) {
                if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_anteosaurus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_ANTEOSAURUS_EGG;
                    eggType = 1; //medium
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_archosaurus")) {
                    eggType = -1; //none
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_aulacephalodon")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_AULACEPHALODON_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_bunostegos")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_BUNOSTEGOS_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_claudiosaurus")) {
                    eggType = -1; //none
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_coelophysis")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_COELOPHYSIS_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_cotylorhynchus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_COTYLORHYNCHUS_EGG;
                    eggType = 1; //medium
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_ctenospondylus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_CTENOSPONDYLUS_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_cynognathus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_CYNOGNATHUS_EGG;
                    eggType = 1; //medium
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_datheosaurus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_DATHEOSAURUS_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_diadectes")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_DIADECTES_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_diictodon")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_DIICTODON_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_dimetrodon")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_DIMETRODON_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_dvinia")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_DVINIA_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_elginia")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_ELGINIA_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_eoraptor")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_EORAPTOR_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_eosimops")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_EOSIMOPS_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_estemmenosuchus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_ESTEMMENOSUCHUS_EGG;
                    eggType = 1; //medium
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_euchambersia")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_EUCHAMBERSIA_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_gorgonops")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_GORGONOPS_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_herrerasaurus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_HERRERASAURUS_EGG;
                    eggType = 2; //large
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_inostrancevia")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_INOSTRANCEVIA_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_jonkeria")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_JONKERIA_EGG;
                    eggType = 2; //large
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_liliensternus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_LILIENSTERNUS_EGG;
                    eggType = 1; //medium
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_lisowicia")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_LISOWICIA_EGG;
                    eggType = 2; //large
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_lystrosaurus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_LYSTROSAURUS_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_moschops")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_MOSCHOPS_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_placerias")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_PLACERIAS_EGG;
                    eggType = 1; //medium
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_plateosauruss")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_PLATEOSAURUS_EGG;
                    eggType = 2; //large
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_pristerognathus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_PRISTEROGNATHUS_EGG;
                    eggType = 1; //medium
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_proburnetia")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_PROBURNETIA_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_procynosuchus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_PROCYNOSUCHUS_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_prosictodon")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_PROSICTODON_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_purlovia")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_PURLOVIA_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_remigiomontanus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_REMIGIOMONTANUS_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_robertia")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_ROBERTIA_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_sauroctonus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_SAUROCTONUS_EGG;
                    eggType = 1; //medium
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_scutosaurus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_SCUTOSAURUS_EGG;
                    eggType = 1; //medium
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_sphenacodon")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_SPHENACODON_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_suminia")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_SUMINIA_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_tapinocephalus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_TAPINOCEPHALUS_EGG;
                    eggType = 1; //medium
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_tetraceratops")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_TETRACERATOPS_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_thrinaxodon")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_THRINAXODON_EGG;
                    eggType = 0; //small
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_titanosuchus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_TITANOSUCHUS_EGG;
                    eggType = 2; //large
                }
                else if (eggRenderType.equalsIgnoreCase(LepidodendronMod.MODID + ":eggs_vivaxosaurus")) {
                    TEXTURE_EGG = RenderEggsLand.TEXTURE_VIVAXOSAURUS_EGG;
                    eggType = 0; //small
                }

                if (eggType != -1) {
                    GlStateManager.pushMatrix();
                    GlStateManager.translate(x + 0.5F, y + 1.500F, z + 0.5F);
                    GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (eggType != -1)
                        Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_EGG);
                    switch (eggType) {
                        case 0:
                        default:
                            this.small_egg.renderAll(1.2f);
                            break;

                        case 1:
                            this.medium_egg.renderAll(1.2f);
                            break;

                        case 2:
                            this.large_egg.renderAll(1.2f);
                            break;
                    }
                    GlStateManager.popMatrix();
                }
            }
        }
    }
}