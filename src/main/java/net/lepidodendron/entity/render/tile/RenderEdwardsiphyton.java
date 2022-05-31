package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockEdwardsiphyton;
import net.lepidodendron.entity.model.tile.ModelInsectEggs;
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
import net.minecraft.util.math.BlockPos;

public class RenderEdwardsiphyton extends TileEntitySpecialRenderer<BlockEdwardsiphyton.TileEntityCustom> {

    public static final PropertyDirection FACING = BlockDirectional.FACING;
    private final ModelInsectEggs insect_eggs;
    private static final ResourceLocation TEXTURE_EOARTHROPLEURA_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/insect_eggs_eoarthropleura.png");
    private static final ResourceLocation TEXTURE_PNEUMODESMUS_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/insect_eggs_pneumodesmus.png");
    private static final ResourceLocation TEXTURE_ARCHOBLATTINA_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archoblattina_eggs.png");
    private static final ResourceLocation TEXTURE_ROACHOID_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/roachoid_eggs.png");
    private static final ResourceLocation TEXTURE_GERARUS_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerarus_eggs.png");
    private final ModelTrigonotarbidEggs trigonotarbid_eggs;
    private static final ResourceLocation TEXTURE_TRIGONOTARBID_EGGS_ORDOVICIAN_SILURIAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_os_eggs.png");
    private static final ResourceLocation TEXTURE_TRIGONOTARBID_EGGS_CARBONIFEROUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_carb_eggs.png");
    private static final ResourceLocation TEXTURE_TRIGONOTARBID_EGGS_DEVONIAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_dev_eggs.png");
    private static final ResourceLocation TEXTURE_TRIGONOTARBID_EGGS_PERMIAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/trigonotarbid_perm_eggs.png");
    private static final ResourceLocation TEXTURE_ATTERCOPUS_EGGS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/attercopus_eggs.png");

    public RenderEdwardsiphyton() {

        this.insect_eggs = new ModelInsectEggs();
        this.trigonotarbid_eggs = new ModelTrigonotarbidEggs();
    }

    @Override
    public void render(BlockEdwardsiphyton.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        String eggRenderType = new Object() {
            public String getValue(BlockPos pos, String tag) {
                TileEntity tileEntity = entity.getWorld().getTileEntity(pos);
                if (tileEntity != null)
                    return tileEntity.getTileData().getString(tag);
                return "";
            }
        }.getValue(new BlockPos(entity.getPos()), "egg");

        if (!eggRenderType.equals("")) {

            EnumFacing facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);
            BlockFaceShape faceshape = entity.getWorld().getBlockState(entity.getPos().down()).getBlockFaceShape(entity.getWorld(), entity.getPos().down(), EnumFacing.UP);

            GlStateManager.pushMatrix();
            GlStateManager.translate(x + 0.5F, y + 0.950F, z + 0.5F);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.pushMatrix();

            if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_os")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_TRIGONOTARBID_EGGS_ORDOVICIAN_SILURIAN);
                this.trigonotarbid_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_carb")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_TRIGONOTARBID_EGGS_CARBONIFEROUS);
                this.trigonotarbid_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_dev")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_TRIGONOTARBID_EGGS_DEVONIAN);
                this.trigonotarbid_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_trigonotarbid_perm")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_TRIGONOTARBID_EGGS_PERMIAN);
                this.trigonotarbid_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_eoarthropleura")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_EOARTHROPLEURA_EGGS);
                this.insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_pneumodesmus")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_PNEUMODESMUS_EGGS);
                this.insect_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_attercopus")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_ATTERCOPUS_EGGS);
                this.trigonotarbid_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_archoblattina")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_ARCHOBLATTINA_EGGS);
                this.trigonotarbid_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_roachoid_arid")
                    || eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_roachoid_forest")
                    || eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_roachoid_swamp")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_ROACHOID_EGGS);
                this.trigonotarbid_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            if (eggRenderType.equals(LepidodendronMod.MODID + ":insect_eggs_gerarus")) {
                GlStateManager.pushMatrix();
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_GERARUS_EGGS);
                this.trigonotarbid_eggs.renderAll(0.075F);
                GlStateManager.popMatrix();
            }

            GlStateManager.popMatrix();
            GlStateManager.popMatrix();
        }
    }
}