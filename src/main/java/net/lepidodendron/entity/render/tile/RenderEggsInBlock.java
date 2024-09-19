package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockAncientMoss;
import net.lepidodendron.entity.model.tile.ModelInsectEggs;
import net.lepidodendron.entity.model.tile.ModelRottenLogEggs;
import net.lepidodendron.entity.model.tile.ModelTrigonotarbidEggs;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;

public class RenderEggsInBlock extends TileEntitySpecialRenderer<BlockAncientMoss.TileEntityCustom> {

    public static final PropertyDirection FACING = BlockDirectional.FACING;

    //Lizards etc:
    private static final ModelRottenLogEggs rotten_wood_eggs = new ModelRottenLogEggs();
    private static final ResourceLocation TEXTURE_CASINERIA_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/casineria_eggs.png");
    private static final ResourceLocation TEXTURE_DREPANOSAURUS_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/drepanosaurus_eggs.png");
    private static final ResourceLocation TEXTURE_HYLONOMUS_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hylonomus_eggs.png");
    private static final ResourceLocation TEXTURE_LABIDOSAURUS_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/labidosaurus_eggs.png");
    private static final ResourceLocation TEXTURE_WEIGELTISAURUS_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/weigeltisaurus_eggs.png");
    private static final ResourceLocation TEXTURE_CELTEDENS_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/celtedens_eggs.png");
    private static final ResourceLocation TEXTURE_LONGISQUAMA_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/longisquama_eggs.png");
    private static final ResourceLocation TEXTURE_HYPURONECTOR_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hypuronector_eggs.png");
    private static final ResourceLocation TEXTURE_ARCHAEOTHYRIS_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archaeothyris_eggs.png");

    //Insects etc:
    private static final ModelInsectEggs insect_eggs = new ModelInsectEggs();
    private static final ResourceLocation TEXTURE_ARTHROPLEURA_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/insect_eggs_arthropleura.png");
    private static final ResourceLocation TEXTURE_EOARTHROPLEURA_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/insect_eggs_eoarthropleura.png");
    private static final ResourceLocation TEXTURE_PNEUMODESMUS_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/insect_eggs_pneumodesmus.png");
    private static final ResourceLocation TEXTURE_ARCHOBLATTINA_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archoblattina_eggs.png");
    private static final ResourceLocation TEXTURE_ROACHOID_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/roachoid_eggs.png");
    private static final ResourceLocation TEXTURE_GERARUS_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerarus_eggs.png");
    private static final ResourceLocation TEXTURE_HARVESTMAN_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/insect_eggs_harvestman.png");
    private static final ResourceLocation TEXTURE_PALAEONTINID_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/insect_eggs_palaeontinid.png");
    private static final ResourceLocation TEXTURE_TITANOPTERA_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/insect_eggs_titanoptera.png");
    private static final ResourceLocation TEXTURE_MYRIACANTHERPESTES_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/insect_eggs_myriacantherpestes.png");
    private static final ResourceLocation TEXTURE_ARCHABOILUS_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/insect_eggs_archaboilus.png");
    private static final ResourceLocation TEXTURE_PYCNOPHLEBIA_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/insect_eggs_pycnophlebia.png");
    private static final ResourceLocation TEXTURE_ARCHOCYRTUS_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/insect_eggs_archocyrtus.png");
    private static final ResourceLocation TEXTURE_DAOHUGOUCOSSUS_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/insect_eggs_daohugoucossus.png");

    private static final ModelTrigonotarbidEggs trigonotarbid_eggs = new ModelTrigonotarbidEggs();
    private static final ResourceLocation TEXTURE_TRIGONOTARBID_EGGS_ORDOVICIAN_SILURIAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_os_eggs.png");
    private static final ResourceLocation TEXTURE_TRIGONOTARBID_EGGS_CARBONIFEROUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_carb_eggs.png");
    private static final ResourceLocation TEXTURE_TRIGONOTARBID_EGGS_DEVONIAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_dev_eggs.png");
    private static final ResourceLocation TEXTURE_TRIGONOTARBID_EGGS_PERMIAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_perm_eggs.png");
    private static final ResourceLocation TEXTURE_ATTERCOPUS_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/attercopus_eggs.png");

    public static void renderEggs(TileEntity entity, double x, double y, double z, boolean isLog) {
        String eggRenderType = "";
        TileEntity tileEntity = entity.getWorld().getTileEntity(entity.getPos());
        if (tileEntity != null) {
            if (tileEntity.getTileData().hasKey("egg")) {
                eggRenderType = tileEntity.getTileData().getString("egg");
            }
        }
        if (!eggRenderType.equals("")) {

            EnumFacing facing = EnumFacing.UP;
            try {
                facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
            }
            catch (Exception e) {
                //Do nothing
            }
            BlockFaceShape faceshape = entity.getWorld().getBlockState(entity.getPos().down()).getBlockFaceShape(entity.getWorld(), entity.getPos().down(), EnumFacing.UP);

            if  (isLog && (facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH)
                && faceshape != BlockFaceShape.SOLID
            ) {
                return;
            }

            GlStateManager.pushMatrix();

            if (isLog) {
                GlStateManager.translate(x + 0.5F, y + 0.970F, z + 0.5F);
            }
            else {
                GlStateManager.translate(x + 0.5F, y + 0.950F, z + 0.5F);
            }
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.pushMatrix();

            if (eggRenderType.equals(LepidodendronMod.MODID + ":prehistoric_flora_hylonomus")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_HYLONOMUS_EGGS);
                rotten_wood_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":prehistoric_flora_casineria")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_CASINERIA_EGGS);
                rotten_wood_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":prehistoric_flora_drepanosaurus")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_DREPANOSAURUS_EGGS);
                rotten_wood_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":prehistoric_flora_labidosaurus")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_LABIDOSAURUS_EGGS);
                rotten_wood_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":prehistoric_flora_weigeltisaurus")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_WEIGELTISAURUS_EGGS);
                rotten_wood_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }
            else if (eggRenderType.equals(LepidodendronMod.MODID + ":prehistoric_flora_celtedens")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_CELTEDENS_EGGS);
                rotten_wood_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }
            else if (eggRenderType.equals(LepidodendronMod.MODID + ":prehistoric_flora_longisquama")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_LONGISQUAMA_EGGS);
                rotten_wood_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }
            else if (eggRenderType.equals(LepidodendronMod.MODID + ":prehistoric_flora_hypuronector")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_HYPURONECTOR_EGGS);
                rotten_wood_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }
            else if (eggRenderType.equals(LepidodendronMod.MODID + ":prehistoric_flora_archaeothyris")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_ARCHAEOTHYRIS_EGGS);
                rotten_wood_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_os")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_TRIGONOTARBID_EGGS_ORDOVICIAN_SILURIAN);
                trigonotarbid_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_carb")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_TRIGONOTARBID_EGGS_CARBONIFEROUS);
                trigonotarbid_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_dev")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_TRIGONOTARBID_EGGS_DEVONIAN);
                trigonotarbid_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_perm")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_TRIGONOTARBID_EGGS_PERMIAN);
                trigonotarbid_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_eoarthropleura")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_EOARTHROPLEURA_EGGS);
                insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_arthropleura")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_ARTHROPLEURA_EGGS);
                insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_pneumodesmus")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_PNEUMODESMUS_EGGS);
                insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_attercopus")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_ATTERCOPUS_EGGS);
                trigonotarbid_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_archoblattina")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_ARCHOBLATTINA_EGGS);
                insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_daohugoucossus")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_DAOHUGOUCOSSUS_EGGS);
                insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_roachoid_arid")
                || eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_roachoid_forest")
                || eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_roachoid_swamp")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_ROACHOID_EGGS);
                insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_gerarus")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_GERARUS_EGGS);
                insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_harvestman")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_HARVESTMAN_EGGS);
                insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_palaeontinid")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_PALAEONTINID_EGGS);
                insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_titanoptera")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_TITANOPTERA_EGGS);
                insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_myriacantherpestes")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_MYRIACANTHERPESTES_EGGS);
                insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }
            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_archaboilus")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_ARCHABOILUS_EGGS);
                insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }
            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_pycnophlebia")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_PYCNOPHLEBIA_EGGS);
                insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }
            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_archocyrtus")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_ARCHOCYRTUS_EGGS);
                insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }
            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_archaboilus")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_ARCHOCYRTUS_EGGS);
                insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }
            else if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_pycnophlebia")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_ARCHOCYRTUS_EGGS);
                insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            GlStateManager.popMatrix();
            GlStateManager.popMatrix();
        }
    }
}