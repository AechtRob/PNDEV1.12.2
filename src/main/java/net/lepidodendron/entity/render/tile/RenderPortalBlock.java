package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.*;
import net.lepidodendron.entity.model.tile.*;
import net.lepidodendron.tileentity.TileEntityPortalBlock;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

import java.awt.*;

public class RenderPortalBlock extends TileEntitySpecialRenderer<TileEntityPortalBlock> {

    private static final ResourceLocation TEXTURE_OVERWORLD = new ResourceLocation("minecraft:textures/blocks/grass_top.png");
    private static final ResourceLocation TEXTURE_OVERWORLD_ALLIUM = new ResourceLocation("minecraft:textures/blocks/flower_allium.png");
    private static final ResourceLocation TEXTURE_OVERWORLD_DANDELION = new ResourceLocation("minecraft:textures/blocks/flower_dandelion.png");
    private static final ResourceLocation TEXTURE_OVERWORLD_POPPY = new ResourceLocation("minecraft:textures/blocks/flower_rose.png");
    private static final ResourceLocation TEXTURE_OVERWORLD_GRASS = new ResourceLocation("minecraft:textures/blocks/tallgrass.png");
    private static final ResourceLocation TEXTURE_PRECAMBRIAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/portal_block_precambrian.png");
    private static final ResourceLocation TEXTURE_CAMBRIAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/portal_block_cambrian.png");
    private static final ResourceLocation TEXTURE_ORDOVICIAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/portal_block_ordovician.png");
    private static final ResourceLocation TEXTURE_SILURIAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/portal_block_silurian.png");
    private static final ResourceLocation TEXTURE_DEVONIAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/portal_block_devonian.png");
    private static final ResourceLocation TEXTURE_CARBONIFEROUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/portal_block_carboniferous.png");
    private static final ResourceLocation TEXTURE_PERMIAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/portal_block_permian.png");
    private static final ResourceLocation TEXTURE_TRIASSIC = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/portal_block_triassic.png");
    private static final ResourceLocation TEXTURE_JURASSIC = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/portal_block_jurassic.png");
    private final ModelPortalBlockOverworld modelPortalBlockOverworld;
    private final ModelPortalBlockOverworldDecoration modelPortalBlockOverworldDecoration;
    private final ModelPortalBlockPrecambrian modelPortalBlockPrecambrian;
    private final ModelPortalBlockCambrian modelPortalBlockCambrian;
    private final ModelPortalBlockOrdovician modelPortalBlockOrdovician;
    private final ModelPortalBlockSilurian modelPortalBlockSilurian;
    private final ModelPortalBlockDevonian modelPortalBlockDevonian;
    private final ModelPortalBlockCarboniferous modelPortalBlockCarboniferous;
    private final ModelPortalBlockPermian modelPortalBlockPermian;
    private final ModelPortalBlockTriassic modelPortalBlockTriassic;
    private final ModelPortalBlockJurassic modelPortalBlockJurassic;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderPortalBlock() {
        this.modelPortalBlockOverworld = new ModelPortalBlockOverworld();
        this.modelPortalBlockOverworldDecoration = new ModelPortalBlockOverworldDecoration();
        this.modelPortalBlockPrecambrian = new ModelPortalBlockPrecambrian();
        this.modelPortalBlockCambrian = new ModelPortalBlockCambrian();
        this.modelPortalBlockOrdovician = new ModelPortalBlockOrdovician();
        this.modelPortalBlockSilurian = new ModelPortalBlockSilurian();
        this.modelPortalBlockDevonian = new ModelPortalBlockDevonian();
        this.modelPortalBlockCarboniferous = new ModelPortalBlockCarboniferous();
        this.modelPortalBlockPermian = new ModelPortalBlockPermian();
        this.modelPortalBlockTriassic = new ModelPortalBlockTriassic();
        this.modelPortalBlockJurassic = new ModelPortalBlockJurassic();
    }

    public boolean isVar(TileEntityPortalBlock entity) {
        return (double) (entity.getPos().getX() + entity.getPos().getY() + entity.getPos().getZ())/3 == (int) (entity.getPos().getX() + entity.getPos().getY() + entity.getPos().getZ())/3;
    }

    public boolean isVar2(TileEntityPortalBlock entity) {
        return (double) (entity.getPos().getX() + entity.getPos().getY() + entity.getPos().getZ() + 4)/3 == (int) (entity.getPos().getX() + entity.getPos().getY() + entity.getPos().getZ() + 4)/3;
    }

    public boolean isVar3(TileEntityPortalBlock entity) {
        return (double) (entity.getPos().getX() + entity.getPos().getY() + entity.getPos().getZ() + 5)/3 == (int) (entity.getPos().getX() + entity.getPos().getY() + entity.getPos().getZ() + 5)/3;
    }

    public boolean isVar4(TileEntityPortalBlock entity) {
        return (double) (entity.getPos().getX() + entity.getPos().getY() + entity.getPos().getZ())/5 == (int) (entity.getPos().getX() + entity.getPos().getY() + entity.getPos().getZ())/5;
    }

    public boolean isRotated(TileEntityPortalBlock entity) {
        return (double) (entity.getPos().getX() + entity.getPos().getY() + entity.getPos().getZ())/4 == (int) (entity.getPos().getX() + entity.getPos().getY() + entity.getPos().getZ())/4;
    }

    @Override
    public void render(TileEntityPortalBlock entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.NORTH;
        if (!entity.getIsActive()) {
            partialTicks = -partialTicks;
        }
        int animTick = entity.getAnimationTick();
        if (animTick == 90 && entity.getIsActive()) {
            animTick = entity.getAnimationTickAmbient();
        }

        Byte colRed = 0;
        Byte colGreen = 0;
        Byte colBlue = 0;

        float transparency = 1.0F;

        if (entity.hasWorld()) {
            if (entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockPortalBlockOverworld.block) {

                if (entity.getIsActive() && entity.getAnimationTick() >= 89) {
                    transparency = 1F;
                }
                else {
                    transparency = Math.min((float) (entity.getAnimationTick() - 30 + partialTicks) / 60F, 1F);
                }

                ModelPortalBlockOverworld modelPortalBlockOverworld = this.modelPortalBlockOverworld;

                GlStateManager.pushMatrix();
                this.bindTexture(TEXTURE_OVERWORLD);
                GlStateManager.enableRescaleNormal();
                GlStateManager.enableCull();
                Color colorGrass = new Color(getWorld().getBiome(entity.getPos()).getGrassColorAtPos(entity.getPos()));
                GlStateManager.color(colorGrass.getRed()/255F, colorGrass.getGreen()/255F, colorGrass.getBlue()/255F, transparency);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);

                GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
                GlStateManager.rotate(180, 0F, 0F, 1F);
                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
                modelPortalBlockOverworld.renderBase(entity.getAnimationTick(), 1.25f, partialTicks);
                GlStateManager.disableRescaleNormal();

                GlStateManager.disableBlend();
                GlStateManager.disableNormalize();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

                GlStateManager.enableCull();
                GlStateManager.popMatrix();

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.UP)) {
                    GlStateManager.pushMatrix();
                    int ofsetter = 0;
                    if (isVar(entity)) {
                        this.bindTexture(TEXTURE_OVERWORLD_GRASS);
                        GlStateManager.color(colorGrass.getRed()/255F, colorGrass.getGreen()/255F, colorGrass.getBlue()/255F, 1.0F);
                        GlStateManager.enableNormalize();
                        GlStateManager.enableBlend();
                        GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
                    }
                    else {
                        if (isVar2(entity)) {
                            if (isRotated(entity)) {
                                this.bindTexture(TEXTURE_OVERWORLD_ALLIUM);
                                ofsetter = -10;
                            }
                            else {
                                this.bindTexture(TEXTURE_OVERWORLD_POPPY);
                                ofsetter = -15;
                            }
                        }
                        else {
                            this.bindTexture(TEXTURE_OVERWORLD_DANDELION);
                            ofsetter = -25;
                        }
                    }
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.translate(x + 0.50, y + 2.50, z + 0.50);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    modelPortalBlockOverworldDecoration.renderBase(entity.getAnimationTick(), 1.25f, partialTicks, ofsetter);
                    GlStateManager.disableRescaleNormal();
                    if (!isVar(entity)) {
                        GlStateManager.disableBlend();
                        GlStateManager.disableNormalize();
                        GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
                    }
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                colRed = (byte) 255;
                colGreen = (byte) 255;
                colBlue = (byte) 255;
            }
            //PRECAMBRIAN
            //----------
            else if (entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockPortalBlockPrecambrian.block) {

                transparency = Math.min((float) (entity.getAnimationTick() + partialTicks) / 90F, 1F);

                ModelPortalBlockPrecambrian modelPortalBlockPrecambrian = this.modelPortalBlockPrecambrian;

                GlStateManager.pushMatrix();
                this.bindTexture(TEXTURE_PRECAMBRIAN);
                GlStateManager.enableRescaleNormal();
                GlStateManager.disableCull();

                GlStateManager.color(1.0F, 1.0F, 1.0F, transparency);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);

                GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
                GlStateManager.rotate(180, 0F, 0F, 1F);
                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
                modelPortalBlockPrecambrian.renderBase(entity.getAnimationTick(), 1.25f, partialTicks);
                GlStateManager.disableRescaleNormal();

                GlStateManager.disableBlend();
                GlStateManager.disableNormalize();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

                GlStateManager.enableCull();
                GlStateManager.popMatrix();

                colRed = (byte) 255;
                colGreen = (byte) 0;
                colBlue = (byte) 0;
            }
            //CAMBRIAN
            //----------
            else if (entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockPortalBlockCambrian.block) {

                if (entity.getIsActive()) {
                    transparency = Math.min((float) (entity.getAnimationTick() + 55F + partialTicks) / 90F, 1F);
                }
                else {
                    transparency = Math.min((float) (entity.getAnimationTick() + partialTicks) / 90F, 1F);
                }

                ModelPortalBlockCambrian modelPortalBlockCambrian = this.modelPortalBlockCambrian;

                GlStateManager.pushMatrix();
                this.bindTexture(TEXTURE_CAMBRIAN);
                GlStateManager.enableRescaleNormal();
                GlStateManager.disableCull();

                GlStateManager.color(1.0F, 1.0F, 1.0F, transparency);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);

                GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
                GlStateManager.rotate(180, 0F, 0F, 1F);
                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
                modelPortalBlockCambrian.renderBase(entity.getAnimationTick(), 1.25f, partialTicks, entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.UP), entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.NORTH), entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.EAST), entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.SOUTH), entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.WEST));
                GlStateManager.disableRescaleNormal();

                GlStateManager.disableBlend();
                GlStateManager.disableNormalize();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

                GlStateManager.enableCull();
                GlStateManager.popMatrix();

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.UP)) {
                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_CAMBRIAN);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                        } else {
                            GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                        }
                        GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        modelPortalBlockCambrian.renderThing(animTick, 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();
                    }

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CAMBRIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    if (isRotated(entity)) {
                        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                    }
                    else {
                        GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                    }
                    GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (isVar(entity)) {
                        modelPortalBlockCambrian.renderSponge1(entity.getAnimationTick(), 1.25f, partialTicks, 8, ((float) getWorld().getTotalWorldTime() + partialTicks), 8F);
                    }
                    else if (isVar2(entity)) {
                        modelPortalBlockCambrian.renderSponge2(entity.getAnimationTick(), 1.25f, partialTicks, 8, ((float) getWorld().getTotalWorldTime() + partialTicks), 8F);
                    }
                    else {
                        modelPortalBlockCambrian.renderSponge3(entity.getAnimationTick(), 1.25f, partialTicks, 8, ((float) getWorld().getTotalWorldTime() + partialTicks), 8F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.SOUTH)) {
                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_CAMBRIAN);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 0.50, y + 0.50, z + 1.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(270, 1F, 0F, 0F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        else {
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        modelPortalBlockCambrian.renderThing(animTick, 1.25f, partialTicks, 1, ((float) getWorld().getTotalWorldTime() + partialTicks), 1F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();
                    }

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CAMBRIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        if (isVar(entity) || isVar2(entity)) {
                            GlStateManager.translate(x + 0.75, y + 1.50, z + 1.52);
                        }
                        else {
                            GlStateManager.translate(x + 0.75, y + 0.25, z + 1.50);
                        }
                    }
                    else {
                        if (isVar(entity) || isVar2(entity)) {
                            GlStateManager.translate(x + 0.25, y + 1.50, z + 1.52);
                        }
                        else {
                            GlStateManager.translate(x + 0.25, y + 0.25, z + 1.50);
                        }
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    //extra rotations for the side positions for these three:
                    if ((!isVar(entity)) &&  (!isVar2(entity))) {
                        GlStateManager.rotate(-90, 1F, 0F, 0F);
                    }
                    if (isVar(entity)) {
                        modelPortalBlockCambrian.renderSideThing1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else if (isVar2(entity)) {
                        modelPortalBlockCambrian.renderSideThing2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else if (isVar3(entity)) {
                        modelPortalBlockCambrian.renderSponge1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else if (isVar4(entity)) {
                        modelPortalBlockCambrian.renderSponge2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else {
                        modelPortalBlockCambrian.renderSponge3(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.NORTH)) {
                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_CAMBRIAN);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 0.50, y + 0.50, z - 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(90, 1F, 0F, 0F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        else {
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        GlStateManager.rotate(180, 0F, 1F, 0F);
                        modelPortalBlockCambrian.renderThing(animTick, 1.25f, partialTicks, 10, ((float) getWorld().getTotalWorldTime() + partialTicks), 10F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();
                    }

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CAMBRIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        if (isVar(entity) || isVar2(entity)) {
                            GlStateManager.translate(x + 0.25, y + 1.50, z - 0.52);
                        }
                        else {
                            GlStateManager.translate(x + 0.25, y + 0.25, z - 0.50);
                        }
                    }
                    else {
                        if (isVar(entity) || isVar2(entity)) {
                            GlStateManager.translate(x + 0.75, y + 1.50, z - 0.52);
                        }
                        else {
                            GlStateManager.translate(x + 0.75, y + 0.25, z - 0.50);
                        }
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(180, 0F, 1F, 0F);
                    //extra rotations for the side positions for these three:
                    if ((!isVar(entity)) &&  (!isVar2(entity))) {
                        GlStateManager.rotate(-90, 1F, 0F, 0F);
                        //GlStateManager.rotate(-90, 1F, 0F, 0F);
                    }
                    if (isVar(entity)) {
                        modelPortalBlockCambrian.renderSideThing1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else if (isVar2(entity)) {
                        modelPortalBlockCambrian.renderSideThing2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else if (isVar3(entity)) {
                        modelPortalBlockCambrian.renderSponge2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else if (isVar4(entity)) {
                        modelPortalBlockCambrian.renderSponge3(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else {
                        modelPortalBlockCambrian.renderSponge1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.WEST)) {
                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_CAMBRIAN);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x - 0.50, y + 0.50, z + 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(90, 1F, 0F, 0F);
                        GlStateManager.rotate(90, 0F, 0F, 1F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        modelPortalBlockCambrian.renderThing(animTick, 1.25f, partialTicks, 10, ((float) getWorld().getTotalWorldTime() + partialTicks), 10F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();
                    }

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CAMBRIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        if (isVar(entity) || isVar2(entity)) {
                            GlStateManager.translate(x - 0.52, y + 1.25, z + 0.50);
                        }
                        else {
                            GlStateManager.translate(x - 0.50, y + 0.50, z + 0.50);
                        }
                    }
                    else {
                        if (isVar(entity) || isVar2(entity)) {
                            GlStateManager.translate(x - 0.52, y + 1.75, z + 0.50);
                        }
                        else {
                            GlStateManager.translate(x - 0.50, y + 0.00, z + 0.50);
                        }
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(90, 0F, 1F, 0F);
                    //extra rotations for the side positions for these three:
                    if ((!isVar(entity)) &&  (!isVar2(entity))) {
                        GlStateManager.rotate(-90, 1F, 0F, 0F);
                        //GlStateManager.rotate(-90, 1F, 0F, 0F);
                    }
                    if (isVar(entity)) {
                        modelPortalBlockCambrian.renderSideThing1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else if (isVar2(entity)) {
                        modelPortalBlockCambrian.renderSideThing2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else if (isVar3(entity)) {
                        modelPortalBlockCambrian.renderSponge3(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else if (isVar4(entity)) {
                        modelPortalBlockCambrian.renderSponge1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else {
                        modelPortalBlockCambrian.renderSponge2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.EAST)) {
                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_CAMBRIAN);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 1.50, y + 0.50, z + 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(90, 1F, 0F, 0F);
                        GlStateManager.rotate(270, 0F, 0F, 1F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        modelPortalBlockCambrian.renderThing(animTick, 1.25f, partialTicks, 19, ((float) getWorld().getTotalWorldTime() + partialTicks), 19F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();
                    }

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CAMBRIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        if (isVar(entity) || isVar2(entity)) {
                            GlStateManager.translate(x + 1.52, y + 1.75, z + 0.50);
                        }
                        else {
                            GlStateManager.translate(x + 1.50, y + 0.5, z + 0.50);
                        }
                    }
                    else {
                        if (isVar(entity) || isVar2(entity)) {
                            GlStateManager.translate(x + 1.52, y + 1.25, z + 0.50);
                        }
                        else {
                            GlStateManager.translate(x + 1.50, y + 0.00, z + 0.50);
                        }
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(270, 0F, 1F, 0F);
                    //extra rotations for the side positions for these three:
                    if ((!isVar(entity)) &&  (!isVar2(entity))) {
                        GlStateManager.rotate(-90, 1F, 0F, 0F);
                        //GlStateManager.rotate(-90, 1F, 0F, 0F);
                    }
                    if (isVar(entity)) {
                        modelPortalBlockCambrian.renderSideThing1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else if (isVar2(entity)) {
                        modelPortalBlockCambrian.renderSideThing2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else if (isVar3(entity)) {
                        modelPortalBlockCambrian.renderSponge1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else if (isVar4(entity)) {
                        modelPortalBlockCambrian.renderSponge2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else {
                        modelPortalBlockCambrian.renderSponge3(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                colRed = (byte) 65;
                colGreen = (byte) 111;
                colBlue = (byte) 51;
            }
            //ORDOVICIAN
            //----------
            else if (entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockPortalBlockOrdovician.block) {

                if (entity.getIsActive()) {
                    transparency = Math.min((float) (entity.getAnimationTick() + 55F + partialTicks) / 90F, 1F);
                }
                else {
                    transparency = Math.min((float) (entity.getAnimationTick() + partialTicks) / 90F, 1F);
                }

                ModelPortalBlockOrdovician modelPortalBlockOrdovician = this.modelPortalBlockOrdovician;

                GlStateManager.pushMatrix();
                this.bindTexture(TEXTURE_ORDOVICIAN);
                GlStateManager.enableRescaleNormal();
                GlStateManager.disableCull();

                GlStateManager.color(1.0F, 1.0F, 1.0F, transparency);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);

                GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
                GlStateManager.rotate(180, 0F, 0F, 1F);
                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
                modelPortalBlockOrdovician.renderBase(entity.getAnimationTick(), 1.25f, partialTicks);
                GlStateManager.disableRescaleNormal();

                GlStateManager.disableBlend();
                GlStateManager.disableNormalize();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

                GlStateManager.enableCull();
                GlStateManager.popMatrix();

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.UP)) {
                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_ORDOVICIAN);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                        } else {
                            GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                        }
                        GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        modelPortalBlockOrdovician.renderTrilobite1(animTick, 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_ORDOVICIAN);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                            } else {
                                GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                            }
                            GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            modelPortalBlockOrdovician.renderTrilobite2(animTick, 1.25f, partialTicks, 15, ((float) getWorld().getTotalWorldTime() + partialTicks), 15F);
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_ORDOVICIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    if (isRotated(entity)) {
                        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                    }
                    else {
                        GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                    }
                    GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (isVar(entity)) {
                        modelPortalBlockOrdovician.renderSponge1(entity.getAnimationTick(), 1.25f, partialTicks, 8, ((float) getWorld().getTotalWorldTime() + partialTicks), 8F);
                    }
                    else {
                        modelPortalBlockOrdovician.renderSponge2(entity.getAnimationTick(), 1.25f, partialTicks, 8, ((float) getWorld().getTotalWorldTime() + partialTicks), 8F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.SOUTH)) {
                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_ORDOVICIAN);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 0.50, y + 0.50, z + 1.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(270, 1F, 0F, 0F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        else {
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        modelPortalBlockOrdovician.renderTrilobite1(animTick, 1.25f, partialTicks, 1, ((float) getWorld().getTotalWorldTime() + partialTicks), 1F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_ORDOVICIAN);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x + 0.50, y + 0.50, z + 1.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 1F, 0F, 0F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(90, 0F, 1F, 0F);
                            }
                            else {
                                GlStateManager.rotate(270, 0F, 1F, 0F);
                            }
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            modelPortalBlockOrdovician.renderTrilobite2(animTick, 1.25f, partialTicks, 9, ((float) getWorld().getTotalWorldTime() + partialTicks), 9F);
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_ORDOVICIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 1.00, y + 1.50, z + 0.50);
                    }
                    else {
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (isVar(entity)) {
                        modelPortalBlockOrdovician.renderSpongeSide2(entity.getAnimationTick(), 1.25f, partialTicks, 11, ((float) getWorld().getTotalWorldTime() + partialTicks), 11F);
                    } else {
                        modelPortalBlockOrdovician.renderSpongeSide1(entity.getAnimationTick(), 1.25f, partialTicks, 11, ((float) getWorld().getTotalWorldTime() + partialTicks), 11F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.NORTH)) {
                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_ORDOVICIAN);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 0.50, y + 0.50, z - 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(90, 1F, 0F, 0F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        else {
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        GlStateManager.rotate(180, 0F, 1F, 0F);
                        modelPortalBlockOrdovician.renderTrilobite1(animTick, 1.25f, partialTicks, 10, ((float) getWorld().getTotalWorldTime() + partialTicks), 10F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_ORDOVICIAN);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x + 0.50, y + 0.50, z - 0.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(270, 0F, 1F, 0F);
                            }
                            else {
                                GlStateManager.rotate(90, 0F, 1F, 0F);
                            }
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                            modelPortalBlockOrdovician.renderTrilobite2(animTick, 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_ORDOVICIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                    }
                    else {
                        GlStateManager.translate(x + 0.00, y + 1.50, z + 0.50);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(180, 0F, 1F, 0F);
                    if (isVar(entity)) {
                        modelPortalBlockOrdovician.renderSpongeSide2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    } else {
                        modelPortalBlockOrdovician.renderSpongeSide1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.WEST)) {
                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_ORDOVICIAN);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x - 0.50, y + 0.50, z + 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(90, 1F, 0F, 0F);
                        GlStateManager.rotate(90, 0F, 0F, 1F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        modelPortalBlockOrdovician.renderTrilobite1(animTick, 1.25f, partialTicks, 10, ((float) getWorld().getTotalWorldTime() + partialTicks), 10F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_ORDOVICIAN);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x - 0.50, y + 0.50, z + 0.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
                            GlStateManager.rotate(90, 0F, 0F, 1F);
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(180, 0F, 1F, 0F);
                            }
                            modelPortalBlockOrdovician.renderTrilobite2(animTick, 1.25f, partialTicks, 3, ((float) getWorld().getTotalWorldTime() + partialTicks), 3F);
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_ORDOVICIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 0.50, y + 1.75, z + 0.75);
                    }
                    else {
                        GlStateManager.translate(x + 0.50, y + 1.25, z + 0.75);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(90, 0F, 1F, 0F);
                    if (isVar(entity)) {
                        modelPortalBlockOrdovician.renderSpongeSide2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    } else {
                        modelPortalBlockOrdovician.renderSpongeSide1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.EAST)) {
                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_ORDOVICIAN);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 1.50, y + 0.50, z + 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(90, 1F, 0F, 0F);
                        GlStateManager.rotate(270, 0F, 0F, 1F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        modelPortalBlockOrdovician.renderTrilobite1(animTick, 1.25f, partialTicks, 19, ((float) getWorld().getTotalWorldTime() + partialTicks), 19F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_ORDOVICIAN);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x + 1.50, y + 0.50, z + 0.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
                            GlStateManager.rotate(270, 0F, 0F, 1F);
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(180, 0F, 1F, 0F);
                            }
                            modelPortalBlockOrdovician.renderTrilobite2(animTick, 1.25f, partialTicks, 9, ((float) getWorld().getTotalWorldTime() + partialTicks), 9F);
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_ORDOVICIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 0.50, y + 1.75, z + 0.25);
                    }
                    else {
                        GlStateManager.translate(x + 0.50, y + 1.25, z + 0.25);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(270, 0F, 1F, 0F);
                    if (isVar(entity)) {
                        modelPortalBlockOrdovician.renderSpongeSide2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    } else {
                        modelPortalBlockOrdovician.renderSpongeSide1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                colRed = (byte) 26;
                colGreen = (byte) 83;
                colBlue = (byte) 75;
            }
            //SILURIAN
            //----------
            else if (entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockPortalBlockSilurian.block) {

                if (entity.getIsActive()) {
                    transparency = Math.min((float) (entity.getAnimationTick() + 55F + partialTicks) / 90F, 1F);
                }
                else {
                    transparency = Math.min((float) (entity.getAnimationTick() + partialTicks) / 90F, 1F);
                }

                ModelPortalBlockSilurian modelPortalBlockSilurian = this.modelPortalBlockSilurian;

                GlStateManager.pushMatrix();
                this.bindTexture(TEXTURE_SILURIAN);
                GlStateManager.enableRescaleNormal();
                GlStateManager.disableCull();

                GlStateManager.color(1.0F, 1.0F, 1.0F, transparency);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);

                GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
                GlStateManager.rotate(180, 0F, 0F, 1F);
                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
                modelPortalBlockSilurian.renderBase(entity.getAnimationTick(), 1.25f, partialTicks);
                GlStateManager.disableRescaleNormal();

                GlStateManager.disableBlend();
                GlStateManager.disableNormalize();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

                GlStateManager.enableCull();
                GlStateManager.popMatrix();

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.UP)) {
                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_SILURIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.475, y + 1.55, z + 0.525);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (!isVar2(entity)) {
                        if (isVar(entity)) {
                            modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else {
                            modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick(), 1.25f, partialTicks, 2, ((float) getWorld().getTotalWorldTime() + partialTicks), 2F);
                        }
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_SILURIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.525, y + 1.55, z + 0.475);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    //modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick() - 5, 1.25f, partialTicks, 15, ((float) getWorld().getTotalWorldTime() + partialTicks), 0.15F);
                    if (isVar2(entity)) {
                        if (isVar(entity)) {
                            modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else {
                            modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick(), 1.25f, partialTicks, 2, ((float) getWorld().getTotalWorldTime() + partialTicks), 2F);
                        }
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.SOUTH)) {
                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_SILURIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 1.00, y + 0.55, z + 1.55);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.rotate(90, 0.0F, 0.0F, 1.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (!isVar2(entity)) {
                        if (isVar(entity)) {
                            modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else {
                            modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick(), 1.25f, partialTicks, 2, ((float) getWorld().getTotalWorldTime() + partialTicks), 2F);
                        }
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_SILURIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.0, y + 0.52, z + 1.52);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.rotate(90, 0.0F, 0.0F, 1.0F);
                    GlStateManager.rotate(180, 0.0F, 1.0F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (isVar2(entity)) {
                        if (isVar(entity)) {
                            modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else {
                            modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick(), 1.25f, partialTicks, 2, ((float) getWorld().getTotalWorldTime() + partialTicks), 2F);
                        }
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.NORTH)) {
                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_SILURIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 1.00, y + 0.54, z - 0.52);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.rotate(270, 0.0F, 0.0F, 1.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (!isVar2(entity)) {
                        if (isVar(entity)) {
                            modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else {
                            modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick(), 1.25f, partialTicks, 2, ((float) getWorld().getTotalWorldTime() + partialTicks), 2F);
                        }
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_SILURIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.0, y + 0.45, z - 0.51);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.rotate(180, 0.0F, 1.0F, 0.0F);
                    GlStateManager.rotate(90, 0.0F, 0.0F, 1.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (isVar2(entity)) {
                        if (isVar(entity)) {
                            modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else {
                            modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick(), 1.25f, partialTicks, 2, ((float) getWorld().getTotalWorldTime() + partialTicks), 2F);
                        }
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.WEST)) {
                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_SILURIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x - 0.525, y + 0.95, z + 0.525);
                    GlStateManager.rotate(180, 1F, 0F, 0F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.rotate(180, 0.0F, 1.0F, 0.0F);
                    GlStateManager.rotate(90, 1.0F, 0.0F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (!isVar2(entity)) {
                        if (isVar(entity)) {
                            modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else {
                            modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick(), 1.25f, partialTicks, 2, ((float) getWorld().getTotalWorldTime() + partialTicks), 2F);
                        }
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_SILURIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x - 0.53, y + 0.0, z + 0.475);
                    GlStateManager.rotate(180, 1F, 0F, 0F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.rotate(270, 1.0F, 0.0F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (isVar2(entity)) {
                        if (isVar(entity)) {
                            modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else {
                            modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick(), 1.25f, partialTicks, 2, ((float) getWorld().getTotalWorldTime() + partialTicks), 2F);
                        }
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.EAST)) {
                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_SILURIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 1.5, y + 1.05, z + 0.525);
                    GlStateManager.rotate(180, 1F, 0F, 0F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.rotate(0, 0.0F, 1.0F, 0.0F);
                    GlStateManager.rotate(90, 1.0F, 0.0F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (!isVar2(entity)) {
                        if (isVar(entity)) {
                            modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else {
                            modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick(), 1.25f, partialTicks, 2, ((float) getWorld().getTotalWorldTime() + partialTicks), 2F);
                        }
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_SILURIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 1.52, y + 0.0, z + 0.50);
                    GlStateManager.rotate(0, 1F, 0F, 0F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.rotate(90, 1.0F, 0.0F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (isVar2(entity)) {
                        if (isVar(entity)) {
                            modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else {
                            modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick(), 1.25f, partialTicks, 2, ((float) getWorld().getTotalWorldTime() + partialTicks), 2F);
                        }
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.DOWN)) {
                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_SILURIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.52, y - 0.52, z + 0.50);
                    GlStateManager.rotate(90, 0F, 1F, 0F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (!isVar2(entity)) {
                        if (isVar(entity)) {
                            modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else {
                            modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick(), 1.25f, partialTicks, 2, ((float) getWorld().getTotalWorldTime() + partialTicks), 2F);
                        }
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_SILURIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.5, y - 0.5, z + 0.50);
                    GlStateManager.rotate(270, 0F, 1F, 0F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (isVar2(entity)) {
                        if (isVar(entity)) {
                            modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else {
                            modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick(), 1.25f, partialTicks, 2, ((float) getWorld().getTotalWorldTime() + partialTicks), 2F);
                        }
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                colRed = (byte) 69;
                colGreen = (byte) 115;
                colBlue = (byte) 108;
            }
            //DEVONIAN
            //----------
            else if (entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockPortalBlockDevonian.block) {

                if (entity.getIsActive()) {
                    transparency = Math.min((float) (entity.getAnimationTick() + 55F + partialTicks) / 90F, 1F);
                }
                else {
                    transparency = Math.min((float) (entity.getAnimationTick() + partialTicks) / 90F, 1F);
                }

                ModelPortalBlockDevonian modelPortalBlockDevonian = this.modelPortalBlockDevonian;

                GlStateManager.pushMatrix();
                this.bindTexture(TEXTURE_DEVONIAN);
                GlStateManager.enableRescaleNormal();
                GlStateManager.disableCull();

                GlStateManager.color(1.0F, 1.0F, 1.0F, transparency);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);

                GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
                GlStateManager.rotate(180, 0F, 0F, 1F);
                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
                modelPortalBlockDevonian.renderBase(entity.getAnimationTick(), 1.25f, partialTicks);
                GlStateManager.disableRescaleNormal();

                GlStateManager.disableBlend();
                GlStateManager.disableNormalize();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

                GlStateManager.enableCull();
                GlStateManager.popMatrix();

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.UP)) {
                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_DEVONIAN);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                        } else {
                            GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                        }
                        GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        if (isVar(entity)) {
                            modelPortalBlockDevonian.renderCooksonia1(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else {
                            modelPortalBlockDevonian.renderCooksonia2(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_DEVONIAN);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                            } else {
                                GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                            }
                            GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            if (isVar(entity)) {
                                modelPortalBlockDevonian.renderCooksonia2(entity.getAnimationTick(), 1.25f, partialTicks, 15, ((float) getWorld().getTotalWorldTime() + partialTicks), 15F);
                            }
                            else {
                                modelPortalBlockDevonian.renderCooksonia1(entity.getAnimationTick(), 1.25f, partialTicks, 15, ((float) getWorld().getTotalWorldTime() + partialTicks), 15F);
                            }
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_DEVONIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    if (isRotated(entity)) {
                        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                    }
                    else {
                        GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                    }
                    GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (isVar(entity)) {
                        modelPortalBlockDevonian.renderAdoketophyton(entity.getAnimationTick(), 1.25f, partialTicks, 8, ((float) getWorld().getTotalWorldTime() + partialTicks), 8F);
                    }
                    else {
                        modelPortalBlockDevonian.renderPsilophyton(entity.getAnimationTick(), 1.25f, partialTicks, 8, ((float) getWorld().getTotalWorldTime() + partialTicks), 8F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.SOUTH)) {

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_DEVONIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 1.00, y + 1.50, z + 0.50);
                    }
                    else {
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (isVar(entity)) {
                        modelPortalBlockDevonian.renderAdoketophyton(entity.getAnimationTick(), 1.25f, partialTicks, 11, ((float) getWorld().getTotalWorldTime() + partialTicks), 11F);
                    } else {
                        modelPortalBlockDevonian.renderPsilophyton(entity.getAnimationTick(), 1.25f, partialTicks, 11, ((float) getWorld().getTotalWorldTime() + partialTicks), 11F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.NORTH)) {

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_DEVONIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                    }
                    else {
                        GlStateManager.translate(x + 0.00, y + 1.50, z + 0.50);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(180, 0F, 1F, 0F);
                    if (isVar(entity)) {
                        modelPortalBlockDevonian.renderAdoketophyton(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    } else {
                        modelPortalBlockDevonian.renderPsilophyton(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.WEST)) {

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_DEVONIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 0.50, y + 1.75, z + 0.75);
                    }
                    else {
                        GlStateManager.translate(x + 0.50, y + 1.25, z + 0.75);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(90, 0F, 1F, 0F);
                    if (isVar(entity)) {
                        modelPortalBlockDevonian.renderAdoketophyton(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    } else {
                        modelPortalBlockDevonian.renderPsilophyton(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.EAST)) {

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_DEVONIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 0.50, y + 1.75, z + 0.25);
                    }
                    else {
                        GlStateManager.translate(x + 0.50, y + 1.25, z + 0.25);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(270, 0F, 1F, 0F);
                    if (isVar(entity)) {
                        modelPortalBlockDevonian.renderPsilophyton(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    } else {
                        modelPortalBlockDevonian.renderAdoketophyton(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                colRed = (byte) 166;
                colGreen = (byte) 92;
                colBlue = (byte) 26;
            }
            //CARBONIFEROUS
            //----------
            else if (entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockPortalBlockCarboniferous.block) {

                if (entity.getIsActive()) {
                    transparency = Math.min((float) (entity.getAnimationTick() + 55F + partialTicks) / 90F, 1F);
                }
                else {
                    transparency = Math.min((float) (entity.getAnimationTick() + partialTicks) / 90F, 1F);
                }

                ModelPortalBlockCarboniferous modelPortalBlockCarboniferous = this.modelPortalBlockCarboniferous;

                GlStateManager.pushMatrix();
                this.bindTexture(TEXTURE_CARBONIFEROUS);
                GlStateManager.enableRescaleNormal();
                GlStateManager.disableCull();

                GlStateManager.color(1.0F, 1.0F, 1.0F, transparency);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);

                GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
                GlStateManager.rotate(180, 0F, 0F, 1F);
                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
                modelPortalBlockCarboniferous.renderBase(entity.getAnimationTick(), 1.25f, partialTicks);
                GlStateManager.disableRescaleNormal();

                GlStateManager.disableBlend();
                GlStateManager.disableNormalize();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

                GlStateManager.enableCull();
                GlStateManager.popMatrix();

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.UP)) {
                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CARBONIFEROUS);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    modelPortalBlockCarboniferous.renderTentacle(entity.getAnimationTick(), 1.25f, partialTicks);
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CARBONIFEROUS);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    modelPortalBlockCarboniferous.renderTentacle(entity.getAnimationTick() - 5, 1.25f, partialTicks);
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.SOUTH)) {
                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CARBONIFEROUS);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 1.00, y + 0.5, z + 1.50);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.rotate(90, 0.0F, 0.0F, 1.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    modelPortalBlockCarboniferous.renderTentacle(entity.getAnimationTick(), 1.25f, partialTicks);
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CARBONIFEROUS);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.0, y + 0.5, z + 1.50);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.rotate(90, 0.0F, 0.0F, 1.0F);
                    GlStateManager.rotate(180, 0.0F, 1.0F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    modelPortalBlockCarboniferous.renderTentacle(entity.getAnimationTick() - 8, 1.25f, partialTicks);
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.NORTH)) {
                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CARBONIFEROUS);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 1.00, y + 0.5, z - 0.50);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.rotate(270, 0.0F, 0.0F, 1.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    modelPortalBlockCarboniferous.renderTentacle(entity.getAnimationTick(), 1.25f, partialTicks);
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CARBONIFEROUS);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.0, y + 0.5, z - 0.50);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.rotate(180, 0.0F, 1.0F, 0.0F);
                    GlStateManager.rotate(90, 0.0F, 0.0F, 1.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    modelPortalBlockCarboniferous.renderTentacle(entity.getAnimationTick() - 8, 1.25f, partialTicks);
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.WEST)) {
                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CARBONIFEROUS);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x - 0.5, y + 1.0, z + 0.50);
                    GlStateManager.rotate(180, 1F, 0F, 0F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.rotate(180, 0.0F, 1.0F, 0.0F);
                    GlStateManager.rotate(90, 1.0F, 0.0F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    modelPortalBlockCarboniferous.renderTentacle(entity.getAnimationTick() - 1, 1.25f, partialTicks);
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CARBONIFEROUS);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x - 0.5, y + 0.0, z + 0.50);
                    GlStateManager.rotate(180, 1F, 0F, 0F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.rotate(270, 1.0F, 0.0F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    modelPortalBlockCarboniferous.renderTentacle(entity.getAnimationTick() - 1, 1.25f, partialTicks);
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.EAST)) {
                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CARBONIFEROUS);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 1.5, y + 1.0, z + 0.50);
                    GlStateManager.rotate(180, 1F, 0F, 0F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.rotate(0, 0.0F, 1.0F, 0.0F);
                    GlStateManager.rotate(90, 1.0F, 0.0F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    modelPortalBlockCarboniferous.renderTentacle(entity.getAnimationTick() - 1, 1.25f, partialTicks);
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CARBONIFEROUS);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 1.5, y + 0.0, z + 0.50);
                    GlStateManager.rotate(0, 1F, 0F, 0F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.rotate(90, 1.0F, 0.0F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    modelPortalBlockCarboniferous.renderTentacle(entity.getAnimationTick() - 1, 1.25f, partialTicks);
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.DOWN)) {
                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CARBONIFEROUS);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.5, y - 0.5, z + 0.50);
                    GlStateManager.rotate(90, 0F, 1F, 0F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    modelPortalBlockCarboniferous.renderTentacle(entity.getAnimationTick() - 1, 1.25f, partialTicks);
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_CARBONIFEROUS);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.5, y - 0.5, z + 0.50);
                    GlStateManager.rotate(270, 0F, 1F, 0F);
                    GlStateManager.rotate(facing.getHorizontalAngle() + 90, 0.0F, 1.5F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    modelPortalBlockCarboniferous.renderTentacle(entity.getAnimationTick() - 7, 1.25f, partialTicks);
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                colRed = (byte) 77;
                colGreen = (byte) 255;
                colBlue = (byte) 120;
            }
            //PERMIAN
            //----------
            else if (entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockPortalBlockPermian.block) {

                if (entity.getIsActive()) {
                    transparency = Math.min((float) (entity.getAnimationTick() + 55F + partialTicks) / 90F, 1F);
                }
                else {
                    transparency = Math.min((float) (entity.getAnimationTick() + partialTicks) / 90F, 1F);
                }

                ModelPortalBlockPermian modelPortalBlockPermian = this.modelPortalBlockPermian;

                GlStateManager.pushMatrix();
                this.bindTexture(TEXTURE_PERMIAN);
                GlStateManager.enableRescaleNormal();
                GlStateManager.disableCull();

                GlStateManager.color(1.0F, 1.0F, 1.0F, transparency);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);

                GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
                GlStateManager.rotate(180, 0F, 0F, 1F);
                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
                modelPortalBlockPermian.renderBase(entity.getAnimationTick(), 1.25f, partialTicks);
                GlStateManager.disableRescaleNormal();

                GlStateManager.disableBlend();
                GlStateManager.disableNormalize();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

                GlStateManager.enableCull();
                GlStateManager.popMatrix();

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.UP)) {
                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_PERMIAN);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                        } else {
                            GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                        }
                        GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        if (isVar(entity)) {
                            modelPortalBlockPermian.renderDeadBush1(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else {
                            modelPortalBlockPermian.renderDeadBush2(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_PERMIAN);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                            } else {
                                GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                            }
                            GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            if (isVar(entity)) {
                                modelPortalBlockPermian.renderDeadBush2(entity.getAnimationTick(), 1.25f, partialTicks, 15, ((float) getWorld().getTotalWorldTime() + partialTicks), 15F);
                            }
                            else {
                                modelPortalBlockPermian.renderDeadBush1(entity.getAnimationTick(), 1.25f, partialTicks, 15, ((float) getWorld().getTotalWorldTime() + partialTicks), 15F);
                            }
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_PERMIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    if (isRotated(entity)) {
                        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                    }
                    else {
                        GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                    }
                    GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (isVar(entity)) {
                        modelPortalBlockPermian.renderBurnedBranch(entity.getAnimationTick(), 1.25f, partialTicks, 8, ((float) getWorld().getTotalWorldTime() + partialTicks), 8F);
                    }
                    else {
                        modelPortalBlockPermian.renderDroopingBranch(entity.getAnimationTick(), 1.25f, partialTicks, 8, ((float) getWorld().getTotalWorldTime() + partialTicks), 8F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.SOUTH)) {

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_PERMIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 1.00, y + 1.50, z + 0.50);
                    }
                    else {
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (isVar(entity)) {
                        modelPortalBlockPermian.renderBurnedBranch(entity.getAnimationTick(), 1.25f, partialTicks, 11, ((float) getWorld().getTotalWorldTime() + partialTicks), 11F);
                    } else {
                        modelPortalBlockPermian.renderDroopingBranch(entity.getAnimationTick(), 1.25f, partialTicks, 11, ((float) getWorld().getTotalWorldTime() + partialTicks), 11F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.NORTH)) {

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_PERMIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                    }
                    else {
                        GlStateManager.translate(x + 0.00, y + 1.50, z + 0.50);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(180, 0F, 1F, 0F);
                    if (isVar(entity)) {
                        modelPortalBlockPermian.renderBurnedBranch(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    } else {
                        modelPortalBlockPermian.renderDroopingBranch(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.WEST)) {

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_PERMIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 0.50, y + 1.75, z + 0.75);
                    }
                    else {
                        GlStateManager.translate(x + 0.50, y + 1.25, z + 0.75);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(90, 0F, 1F, 0F);
                    if (isVar(entity)) {
                        modelPortalBlockPermian.renderBurnedBranch(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    } else {
                        modelPortalBlockPermian.renderDroopingBranch(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.EAST)) {

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_PERMIAN);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 0.50, y + 1.75, z + 0.25);
                    }
                    else {
                        GlStateManager.translate(x + 0.50, y + 1.25, z + 0.25);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(270, 0F, 1F, 0F);
                    if (isVar(entity)) {
                        modelPortalBlockPermian.renderDroopingBranch(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    } else {
                        modelPortalBlockPermian.renderBurnedBranch(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                colRed = (byte) 153;
                colGreen = (byte) 42;
                colBlue = (byte) 25;
            }
            //TRIASSIC
            //----------
            else if (entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockPortalBlockTriassic.block) {

                if (entity.getIsActive()) {
                    transparency = Math.min((float) (entity.getAnimationTick() + 55F + partialTicks) / 90F, 1F);
                }
                else {
                    transparency = Math.min((float) (entity.getAnimationTick() + partialTicks) / 90F, 1F);
                }

                ModelPortalBlockTriassic modelPortalBlockTriassic = this.modelPortalBlockTriassic;

                GlStateManager.pushMatrix();
                this.bindTexture(TEXTURE_TRIASSIC);
                GlStateManager.enableRescaleNormal();
                GlStateManager.disableCull();

                GlStateManager.color(1.0F, 1.0F, 1.0F, transparency);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);

                GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
                GlStateManager.rotate(180, 0F, 0F, 1F);
                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
                modelPortalBlockTriassic.renderBase(entity.getAnimationTick(), 1.25f, partialTicks);
                GlStateManager.disableRescaleNormal();

                GlStateManager.disableBlend();
                GlStateManager.disableNormalize();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

                GlStateManager.enableCull();
                GlStateManager.popMatrix();

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.UP)) {
                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_TRIASSIC);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                        } else {
                            GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                        }
                        GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        if (isVar(entity)) {
                            modelPortalBlockTriassic.renderPleuromeia1(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else {
                            modelPortalBlockTriassic.renderPleuromeia2(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_TRIASSIC);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                            } else {
                                GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                            }
                            GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            if (isVar(entity)) {
                                modelPortalBlockTriassic.renderPleuromeia2(entity.getAnimationTick(), 1.25f, partialTicks, 15, ((float) getWorld().getTotalWorldTime() + partialTicks), 15F);
                            }
                            else {
                                modelPortalBlockTriassic.renderPleuromeia1(entity.getAnimationTick(), 1.25f, partialTicks, 15, ((float) getWorld().getTotalWorldTime() + partialTicks), 15F);
                            }
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_TRIASSIC);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                        } else {
                            GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                        }
                        GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        modelPortalBlockTriassic.renderLizard1(animTick, 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_TRIASSIC);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                            } else {
                                GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                            }
                            GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            modelPortalBlockTriassic.renderLizard2(animTick, 1.25f, partialTicks, 15, ((float) getWorld().getTotalWorldTime() + partialTicks), 15F);
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_TRIASSIC);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    if (isRotated(entity)) {
                        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                    }
                    else {
                        GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                    }
                    GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (isVar(entity)) {
                        modelPortalBlockTriassic.renderBranch2(entity.getAnimationTick(), 1.25f, partialTicks, 8, ((float) getWorld().getTotalWorldTime() + partialTicks), 8F);
                    }
                    else {
                        modelPortalBlockTriassic.renderBranch1(entity.getAnimationTick(), 1.25f, partialTicks, 8, ((float) getWorld().getTotalWorldTime() + partialTicks), 8F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.SOUTH)) {

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_TRIASSIC);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 1.00, y + 1.50, z + 0.50);
                    }
                    else {
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (isVar(entity)) {
                        modelPortalBlockTriassic.renderBranch2(entity.getAnimationTick(), 1.25f, partialTicks, 11, ((float) getWorld().getTotalWorldTime() + partialTicks), 11F);
                    } else {
                        modelPortalBlockTriassic.renderBranch1(entity.getAnimationTick(), 1.25f, partialTicks, 11, ((float) getWorld().getTotalWorldTime() + partialTicks), 11F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_TRIASSIC);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 0.50, y + 0.50, z + 1.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(270, 1F, 0F, 0F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        else {
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        modelPortalBlockTriassic.renderLizard1(animTick, 1.25f, partialTicks, 1, ((float) getWorld().getTotalWorldTime() + partialTicks), 1F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_TRIASSIC);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x + 0.50, y + 0.50, z + 1.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 1F, 0F, 0F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(90, 0F, 1F, 0F);
                            }
                            else {
                                GlStateManager.rotate(270, 0F, 1F, 0F);
                            }
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            modelPortalBlockTriassic.renderLizard2(animTick, 1.25f, partialTicks, 9, ((float) getWorld().getTotalWorldTime() + partialTicks), 9F);
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.NORTH)) {

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_TRIASSIC);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                    }
                    else {
                        GlStateManager.translate(x + 0.00, y + 1.50, z + 0.50);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(180, 0F, 1F, 0F);
                    if (isVar(entity)) {
                        modelPortalBlockTriassic.renderBranch2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    } else {
                        modelPortalBlockTriassic.renderBranch1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_TRIASSIC);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 0.50, y + 0.50, z - 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(90, 1F, 0F, 0F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        else {
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        GlStateManager.rotate(180, 0F, 1F, 0F);
                        modelPortalBlockTriassic.renderLizard1(animTick, 1.25f, partialTicks, 10, ((float) getWorld().getTotalWorldTime() + partialTicks), 10F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_TRIASSIC);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x + 0.50, y + 0.50, z - 0.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(270, 0F, 1F, 0F);
                            }
                            else {
                                GlStateManager.rotate(90, 0F, 1F, 0F);
                            }
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                            modelPortalBlockTriassic.renderLizard2(animTick, 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.WEST)) {

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_TRIASSIC);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 0.50, y + 1.75, z + 0.75);
                    }
                    else {
                        GlStateManager.translate(x + 0.50, y + 1.25, z + 0.75);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(90, 0F, 1F, 0F);
                    if (isVar(entity)) {
                        modelPortalBlockTriassic.renderBranch2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    } else {
                        modelPortalBlockTriassic.renderBranch1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_TRIASSIC);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x - 0.50, y + 0.50, z + 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(90, 1F, 0F, 0F);
                        GlStateManager.rotate(90, 0F, 0F, 1F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        modelPortalBlockTriassic.renderLizard1(animTick, 1.25f, partialTicks, 10, ((float) getWorld().getTotalWorldTime() + partialTicks), 10F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_TRIASSIC);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x - 0.50, y + 0.50, z + 0.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
                            GlStateManager.rotate(90, 0F, 0F, 1F);
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(180, 0F, 1F, 0F);
                            }
                            modelPortalBlockTriassic.renderLizard2(animTick, 1.25f, partialTicks, 3, ((float) getWorld().getTotalWorldTime() + partialTicks), 3F);
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.EAST)) {

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_TRIASSIC);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 0.50, y + 1.75, z + 0.25);
                    }
                    else {
                        GlStateManager.translate(x + 0.50, y + 1.25, z + 0.25);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(270, 0F, 1F, 0F);
                    if (isVar(entity)) {
                        modelPortalBlockTriassic.renderBranch1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    } else {
                        modelPortalBlockTriassic.renderBranch2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_TRIASSIC);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 1.50, y + 0.50, z + 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(90, 1F, 0F, 0F);
                        GlStateManager.rotate(270, 0F, 0F, 1F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        modelPortalBlockTriassic.renderLizard1(animTick, 1.25f, partialTicks, 19, ((float) getWorld().getTotalWorldTime() + partialTicks), 19F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_TRIASSIC);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x + 1.50, y + 0.50, z + 0.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
                            GlStateManager.rotate(270, 0F, 0F, 1F);
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(180, 0F, 1F, 0F);
                            }
                            modelPortalBlockTriassic.renderLizard2(animTick, 1.25f, partialTicks, 9, ((float) getWorld().getTotalWorldTime() + partialTicks), 9F);
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }
                }

                colRed = (byte) 124;
                colGreen = (byte) 60;
                colBlue = (byte) 136;
            }
            //JURASSIC
            //----------
            else if (entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockPortalBlockJurassic.block) {

                if (entity.getIsActive()) {
                    transparency = Math.min((float) (entity.getAnimationTick() + 55F + partialTicks) / 90F, 1F);
                }
                else {
                    transparency = Math.min((float) (entity.getAnimationTick() + partialTicks) / 90F, 1F);
                }

                ModelPortalBlockJurassic modelPortalBlockJurassic = this.modelPortalBlockJurassic;

                GlStateManager.pushMatrix();
                this.bindTexture(TEXTURE_JURASSIC);
                GlStateManager.enableRescaleNormal();
                GlStateManager.disableCull();

                GlStateManager.color(1.0F, 1.0F, 1.0F, transparency);
                GlStateManager.enableNormalize();
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);

                GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
                GlStateManager.rotate(180, 0F, 0F, 1F);
                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
                modelPortalBlockJurassic.renderBase(entity.getAnimationTick(), 1.25f, partialTicks);
                GlStateManager.disableRescaleNormal();

                GlStateManager.disableBlend();
                GlStateManager.disableNormalize();
                GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);

                GlStateManager.enableCull();
                GlStateManager.popMatrix();

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.UP)) {
                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_JURASSIC);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                        } else {
                            GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                        }
                        GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        if (isVar(entity) && isVar3(entity)) {
                            modelPortalBlockJurassic.renderTopPlant1(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else if (isVar(entity) && (!isVar3(entity))) {
                            modelPortalBlockJurassic.renderTopPlant2(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else if ((!isVar(entity)) && (!isVar3(entity))) {
                            modelPortalBlockJurassic.renderTopPlant3(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        else {
                            modelPortalBlockJurassic.renderTopPlant4(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        }
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_JURASSIC);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                            } else {
                                GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                            }
                            GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            if (isVar(entity) && isVar3(entity)) {
                                modelPortalBlockJurassic.renderTopPlant4(entity.getAnimationTick(), 1.25f, partialTicks, 15, ((float) getWorld().getTotalWorldTime() + partialTicks), 15F);
                            }
                            else if (isVar(entity) && (!isVar3(entity))) {
                                modelPortalBlockJurassic.renderTopPlant3(entity.getAnimationTick(), 1.25f, partialTicks, 15, ((float) getWorld().getTotalWorldTime() + partialTicks), 15F);
                            }
                            else if ((!isVar(entity)) && (!isVar3(entity))) {
                                modelPortalBlockJurassic.renderTopPlant2(entity.getAnimationTick(), 1.25f, partialTicks, 15, ((float) getWorld().getTotalWorldTime() + partialTicks), 15F);
                            }
                            else {
                                modelPortalBlockJurassic.renderTopPlant1(entity.getAnimationTick(), 1.25f, partialTicks, 15, ((float) getWorld().getTotalWorldTime() + partialTicks), 15F);
                            }
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_JURASSIC);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                        } else {
                            GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                        }
                        GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        modelPortalBlockJurassic.renderEyes(animTick, 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_JURASSIC);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                            } else {
                                GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                            }
                            GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            modelPortalBlockJurassic.renderHead(animTick, 1.25f, partialTicks, 15, ((float) getWorld().getTotalWorldTime() + partialTicks), 15F);
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_JURASSIC);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    if (isRotated(entity)) {
                        GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.5F, 0.0F);
                    }
                    else {
                        GlStateManager.rotate(facing.getHorizontalAngle() + 180, 0.0F, 1.5F, 0.0F);
                    }
                    GlStateManager.rotate(180, 0.0F, 1F, 0.0F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (isVar(entity) && isVar4(entity)) {
                        modelPortalBlockJurassic.renderBranch4(entity.getAnimationTick(), 1.25f, partialTicks, 8, ((float) getWorld().getTotalWorldTime() + partialTicks), 8F);
                    }
                    else if (isVar(entity) && (!isVar4(entity))) {
                        modelPortalBlockJurassic.renderBranch3(entity.getAnimationTick(), 1.25f, partialTicks, 8, ((float) getWorld().getTotalWorldTime() + partialTicks), 8F);
                    }
                    else if ((!isVar(entity)) && (!isVar4(entity))) {
                        modelPortalBlockJurassic.renderBranch2(entity.getAnimationTick(), 1.25f, partialTicks, 8, ((float) getWorld().getTotalWorldTime() + partialTicks), 8F);
                    }
                    else {
                        modelPortalBlockJurassic.renderBranch1(entity.getAnimationTick(), 1.25f, partialTicks, 8, ((float) getWorld().getTotalWorldTime() + partialTicks), 8F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.SOUTH)) {

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_JURASSIC);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 1.00, y + 1.50, z + 0.50);
                    }
                    else {
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    if (isVar(entity) && isVar4(entity)) {
                        modelPortalBlockJurassic.renderBranch4(entity.getAnimationTick(), 1.25f, partialTicks, 11, ((float) getWorld().getTotalWorldTime() + partialTicks), 11F);
                    }
                    else if (isVar(entity) && (!isVar4(entity))) {
                        modelPortalBlockJurassic.renderBranch3(entity.getAnimationTick(), 1.25f, partialTicks, 11, ((float) getWorld().getTotalWorldTime() + partialTicks), 11F);
                    }
                    else if ((!isVar(entity)) && (!isVar4(entity))) {
                        modelPortalBlockJurassic.renderBranch2(entity.getAnimationTick(), 1.25f, partialTicks, 11, ((float) getWorld().getTotalWorldTime() + partialTicks), 11F);
                    }
                    else {
                        modelPortalBlockJurassic.renderBranch1(entity.getAnimationTick(), 1.25f, partialTicks, 11, ((float) getWorld().getTotalWorldTime() + partialTicks), 11F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_JURASSIC);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 0.50, y + 0.50, z + 1.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(270, 1F, 0F, 0F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        else {
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        modelPortalBlockJurassic.renderEyes(animTick, 1.25f, partialTicks, 1, ((float) getWorld().getTotalWorldTime() + partialTicks), 1F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_JURASSIC);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x + 0.50, y + 0.50, z + 1.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 1F, 0F, 0F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(90, 0F, 1F, 0F);
                            }
                            else {
                                GlStateManager.rotate(270, 0F, 1F, 0F);
                            }
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            modelPortalBlockJurassic.renderHead(animTick, 1.25f, partialTicks, 9, ((float) getWorld().getTotalWorldTime() + partialTicks), 9F);
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.NORTH)) {

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_JURASSIC);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 0.50, y + 1.50, z + 0.50);
                    }
                    else {
                        GlStateManager.translate(x + 0.00, y + 1.50, z + 0.50);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(180, 0F, 1F, 0F);
                    if (isVar(entity) && isVar4(entity)) {
                        modelPortalBlockJurassic.renderBranch4(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else if (isVar(entity) && (!isVar4(entity))) {
                        modelPortalBlockJurassic.renderBranch3(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else if ((!isVar(entity)) && (!isVar4(entity))) {
                        modelPortalBlockJurassic.renderBranch2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else {
                        modelPortalBlockJurassic.renderBranch1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_JURASSIC);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 0.50, y + 0.50, z - 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(90, 1F, 0F, 0F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        else {
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        GlStateManager.rotate(180, 0F, 1F, 0F);
                        modelPortalBlockJurassic.renderEyes(animTick, 1.25f, partialTicks, 10, ((float) getWorld().getTotalWorldTime() + partialTicks), 10F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_JURASSIC);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x + 0.50, y + 0.50, z - 0.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(270, 0F, 1F, 0F);
                            }
                            else {
                                GlStateManager.rotate(90, 0F, 1F, 0F);
                            }
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                            modelPortalBlockJurassic.renderHead(animTick, 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.WEST)) {

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_JURASSIC);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 0.50, y + 1.75, z + 0.75);
                    }
                    else {
                        GlStateManager.translate(x + 0.50, y + 1.25, z + 0.75);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(90, 0F, 1F, 0F);
                    if (isVar(entity) && isVar4(entity)) {
                        modelPortalBlockJurassic.renderBranch4(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else if (isVar(entity) && (!isVar4(entity))) {
                        modelPortalBlockJurassic.renderBranch3(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else if ((!isVar(entity)) && (!isVar4(entity))) {
                        modelPortalBlockJurassic.renderBranch2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else {
                        modelPortalBlockJurassic.renderBranch1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_JURASSIC);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x - 0.50, y + 0.50, z + 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(90, 1F, 0F, 0F);
                        GlStateManager.rotate(90, 0F, 0F, 1F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        modelPortalBlockJurassic.renderEyes(animTick, 1.25f, partialTicks, 10, ((float) getWorld().getTotalWorldTime() + partialTicks), 10F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_JURASSIC);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x - 0.50, y + 0.50, z + 0.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
                            GlStateManager.rotate(90, 0F, 0F, 1F);
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(180, 0F, 1F, 0F);
                            }
                            modelPortalBlockJurassic.renderHead(animTick, 1.25f, partialTicks, 3, ((float) getWorld().getTotalWorldTime() + partialTicks), 3F);
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }
                }

                if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.EAST)) {

                    GlStateManager.pushMatrix();
                    this.bindTexture(TEXTURE_JURASSIC);
                    GlStateManager.enableRescaleNormal();
                    GlStateManager.disableCull();
                    if (isRotated(entity)) {
                        GlStateManager.translate(x + 0.50, y + 1.75, z + 0.25);
                    }
                    else {
                        GlStateManager.translate(x + 0.50, y + 1.25, z + 0.25);
                    }
                    GlStateManager.rotate(180, 0F, 0F, 1F);
                    GlStateManager.scale(0.05F, 0.05F, 0.05F);
                    GlStateManager.rotate(270, 0F, 1F, 0F);
                    if (isVar(entity) && isVar4(entity)) {
                        modelPortalBlockJurassic.renderBranch1(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    if (isVar(entity) && (!isVar4(entity))) {
                        modelPortalBlockJurassic.renderBranch2(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    if ((!isVar(entity)) && (!isVar4(entity))) {
                        modelPortalBlockJurassic.renderBranch3(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    else {
                        modelPortalBlockJurassic.renderBranch4(entity.getAnimationTick(), 1.25f, partialTicks, 6, ((float) getWorld().getTotalWorldTime() + partialTicks), 6F);
                    }
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();

                    if (entity.getIsActive()) {
                        GlStateManager.pushMatrix();
                        this.bindTexture(TEXTURE_JURASSIC);
                        GlStateManager.enableRescaleNormal();
                        GlStateManager.disableCull();
                        GlStateManager.translate(x + 1.50, y + 0.50, z + 0.50);
                        GlStateManager.rotate(180, 0F, 0F, 1F);
                        GlStateManager.rotate(90, 1F, 0F, 0F);
                        GlStateManager.rotate(270, 0F, 0F, 1F);
                        GlStateManager.scale(0.05F, 0.05F, 0.05F);
                        if (isRotated(entity)) {
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        modelPortalBlockJurassic.renderEyes(animTick, 1.25f, partialTicks, 19, ((float) getWorld().getTotalWorldTime() + partialTicks), 19F);
                        GlStateManager.disableRescaleNormal();
                        GlStateManager.enableCull();
                        GlStateManager.popMatrix();

                        if (isVar2(entity)) {
                            GlStateManager.pushMatrix();
                            this.bindTexture(TEXTURE_JURASSIC);
                            GlStateManager.enableRescaleNormal();
                            GlStateManager.disableCull();
                            GlStateManager.translate(x + 1.50, y + 0.50, z + 0.50);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 1F, 0F, 0F);
                            GlStateManager.rotate(270, 0F, 0F, 1F);
                            GlStateManager.scale(0.05F, 0.05F, 0.05F);
                            if (isRotated(entity)) {
                                GlStateManager.rotate(180, 0F, 1F, 0F);
                            }
                            modelPortalBlockJurassic.renderHead(animTick, 1.25f, partialTicks, 9, ((float) getWorld().getTotalWorldTime() + partialTicks), 9F);
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }
                    }
                }

                colRed = (byte) 56;
                colGreen = (byte) 118;
                colBlue = (byte) 163;
            }
        }

        //Rays of light:
        if (((entity.getAnimationTick() > 1 && entity.getAnimationTick() < 3)
                || (entity.getAnimationTick() > 5 && entity.getAnimationTick() < 7)
                || (entity.getAnimationTick() > 9 && entity.getAnimationTick() < 11)
                )
                && entity.getIsActive()
        ) {
            GlStateManager.pushMatrix();

            GlStateManager.enableBlend();
            GlStateManager.disableAlpha();
            GlStateManager.blendFunc(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE);
            GlStateManager.depthMask(true);

            Minecraft.getMinecraft().entityRenderer.setupFogColor(true);

            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glBegin(GL11.GL_TRIANGLES);
            GL11.glColor3ub(colRed, colGreen, colBlue);

            float width = 0.10F;
            float offsetter = -10F;

            //TOP:
            if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.UP)) {
                //BEAM 1a:
                //face1:
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 64.0F, (float) z + 0.25F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.95F, (float) z + 0.25F + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.95F, (float) z + 0.25F - width / 2);

                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 64.0F, (float) z + 0.25F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 64.0F, (float) z + 0.25F + offsetter + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.95F, (float) z + 0.25F + width / 2);

                //face2:
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 64.0F, (float) z + 0.25F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.95F, (float) z + 0.25F - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.95F, (float) z + 0.25F + width / 2);

                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 64.0F, (float) z + 0.25F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.95F, (float) z + 0.25F + width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 64.0F, (float) z + 0.25F + offsetter + width / 2);

                //face3:
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 64.0F, (float) z + 0.25F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.95F, (float) z + 0.25F - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.95F, (float) z + 0.25F - width / 2);

                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 64.0F, (float) z + 0.25F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 64.0F, (float) z + 0.25F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.95F, (float) z + 0.25F - width / 2);

                //face4:
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.95F, (float) z + 0.25F + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.95F, (float) z + 0.25F + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 64.0F, (float) z + 0.25F + offsetter + width / 2);

                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.95F, (float) z + 0.25F + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 64.0F, (float) z + 0.25F + offsetter + width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 64.0F, (float) z + 0.25F + offsetter + width / 2);

                offsetter = 10F;

                //BEAM 1n:
                //face1:
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 64.0F, (float) z + 0.75F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.95F, (float) z + 0.75F + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.95F, (float) z + 0.75F - width / 2);

                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 64.0F, (float) z + 0.75F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 64.0F, (float) z + 0.75F + offsetter + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.95F, (float) z + 0.75F + width / 2);

                //face2:
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 64.0F, (float) z + 0.75F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.95F, (float) z + 0.75F - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.95F, (float) z + 0.75F + width / 2);

                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 64.0F, (float) z + 0.75F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.95F, (float) z + 0.75F + width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 64.0F, (float) z + 0.75F + offsetter + width / 2);

                //face3:
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 64.0F, (float) z + 0.75F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.95F, (float) z + 0.75F - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.95F, (float) z + 0.75F - width / 2);

                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 64.0F, (float) z + 0.75F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 64.0F, (float) z + 0.75F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.95F, (float) z + 0.75F - width / 2);

                //face4:
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.95F, (float) z + 0.75F + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.95F, (float) z + 0.75F + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 64.0F, (float) z + 0.75F + offsetter + width / 2);

                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.95F, (float) z + 0.75F + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 64.0F, (float) z + 0.75F + offsetter + width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 64.0F, (float) z + 0.75F + offsetter + width / 2);
            }

            //BOTTOM:
            if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.DOWN)) {
                //BEAM 1a:
                //face1:
                offsetter = -10F;
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y - 64.0F, (float) z + 0.25F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.05F, (float) z + 0.25F + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.05F, (float) z + 0.25F - width / 2);

                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y - 64.0F, (float) z + 0.25F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y - 64.0F, (float) z + 0.25F + offsetter + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.05F, (float) z + 0.25F + width / 2);

                //face2:
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y - 64.0F, (float) z + 0.25F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.05F, (float) z + 0.25F - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.05F, (float) z + 0.25F + width / 2);

                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y - 64.0F, (float) z + 0.25F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.05F, (float) z + 0.25F + width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y - 64.0F, (float) z + 0.25F + offsetter + width / 2);

                //face3:
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y - 64.0F, (float) z + 0.25F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.05F, (float) z + 0.25F - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.05F, (float) z + 0.25F - width / 2);

                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y - 64.0F, (float) z + 0.25F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y - 64.0F, (float) z + 0.25F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.05F, (float) z + 0.25F - width / 2);

                //face4:
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.05F, (float) z + 0.25F + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.05F, (float) z + 0.25F + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y - 64.0F, (float) z + 0.25F + offsetter + width / 2);

                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.05F, (float) z + 0.25F + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y - 64.0F, (float) z + 0.25F + offsetter + width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y - 64.0F, (float) z + 0.25F + offsetter + width / 2);

                offsetter = 10F;

                //BEAM 1n:
                //face1:
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y - 64.0F, (float) z + 0.75F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.05F, (float) z + 0.75F + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.05F, (float) z + 0.75F - width / 2);

                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y - 64.0F, (float) z + 0.75F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y - 64.0F, (float) z + 0.75F + offsetter + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.05F, (float) z + 0.75F + width / 2);

                //face2:
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y - 64.0F, (float) z + 0.75F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.05F, (float) z + 0.75F - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.05F, (float) z + 0.75F + width / 2);

                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y - 64.0F, (float) z + 0.75F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.05F, (float) z + 0.75F + width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y - 64.0F, (float) z + 0.75F + offsetter + width / 2);

                //face3:
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y - 64.0F, (float) z + 0.75F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.05F, (float) z + 0.75F - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.05F, (float) z + 0.75F - width / 2);

                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y - 64.0F, (float) z + 0.75F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y - 64.0F, (float) z + 0.75F + offsetter - width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.05F, (float) z + 0.75F - width / 2);

                //face4:
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.05F, (float) z + 0.75F + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y + 0.05F, (float) z + 0.75F + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y - 64.0F, (float) z + 0.75F + offsetter + width / 2);

                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y + 0.05F, (float) z + 0.75F + width / 2);
                GL11.glVertex3f((float) x + 0.5F + width / 2, (float) y - 64.0F, (float) z + 0.75F + offsetter + width / 2);
                GL11.glVertex3f((float) x + 0.5F - width / 2, (float) y - 64.0F, (float) z + 0.75F + offsetter + width / 2);
            }
            
            //NORTH:
            if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.NORTH)) {
                //BEAM 1a:
                //face1:
                offsetter = -10F;
                GL11.glVertex3f((float) x + 0.25F + offsetter + width / 2, (float) y + 0.5F - width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.25F + width / 2, (float) y + 0.5F + width / 2, (float) z + 0.05F);
                GL11.glVertex3f((float) x + 0.25F + width / 2, (float) y + 0.5F - width / 2, (float) z + 0.05F);

                GL11.glVertex3f((float) x + 0.25F + offsetter + width / 2, (float) y + 0.5F - width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.25F + offsetter + width / 2, (float) y + 0.5F + width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.25F + width / 2, (float) y + 0.5F + width / 2, (float) z + 0.05F);

                //face2:
                GL11.glVertex3f((float) x + 0.25F + offsetter - width / 2, (float) y + 0.5F - width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.5F - width / 2, (float) z + 0.05F);
                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.5F + width / 2, (float) z + 0.05F);

                GL11.glVertex3f((float) x + 0.25F + offsetter- width / 2, (float) y + 0.5F - width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.5F + width / 2, (float) z + 0.05F);
                GL11.glVertex3f((float) x + 0.25F + offsetter- width / 2, (float) y + 0.5F + width / 2, (float) z - 64.0F);

                //face3:
                GL11.glVertex3f((float) x + 0.25F + offsetter + width / 2, (float) y + 0.5F - width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.25F + width / 2, (float) y + 0.5F - width / 2, (float) z + 0.05F);
                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.5F - width / 2, (float) z + 0.05F);

                GL11.glVertex3f((float) x + 0.25F + offsetter - width / 2, (float) y + 0.5F - width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.25F + offsetter + width / 2, (float) y + 0.5F - width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.5F - width / 2, (float) z + 0.05F);

                //face4:
                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.5F + width / 2, (float) z + 0.05F);
                GL11.glVertex3f((float) x + 0.25F + width / 2, (float) y + 0.5F + width / 2, (float) z + 0.05F);
                GL11.glVertex3f((float) x + 0.25F+ offsetter + width / 2, (float) y + 0.5F + width / 2, (float) z - 64.0F);

                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.5F + width / 2, (float) z + 0.05F);
                GL11.glVertex3f((float) x + 0.25F + offsetter + width / 2, (float) y + 0.5F + width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.25F + offsetter - width / 2, (float) y + 0.5F + width / 2, (float) z - 64.0F);

                //BEAM 1n:
                //face1:
                offsetter = 10F;
                GL11.glVertex3f((float) x + 0.75F + offsetter + width / 2, (float) y + 0.5F - width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.75F + width / 2, (float) y + 0.5F + width / 2, (float) z + 0.05F);
                GL11.glVertex3f((float) x + 0.75F + width / 2, (float) y + 0.5F - width / 2, (float) z + 0.05F);

                GL11.glVertex3f((float) x + 0.75F + offsetter + width / 2, (float) y + 0.5F - width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.75F + offsetter + width / 2, (float) y + 0.5F + width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.75F + width / 2, (float) y + 0.5F + width / 2, (float) z + 0.05F);

                //face2:
                GL11.glVertex3f((float) x + 0.75F + offsetter - width / 2, (float) y + 0.5F - width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.5F - width / 2, (float) z + 0.05F);
                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.5F + width / 2, (float) z + 0.05F);

                GL11.glVertex3f((float) x + 0.75F + offsetter- width / 2, (float) y + 0.5F - width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.5F + width / 2, (float) z + 0.05F);
                GL11.glVertex3f((float) x + 0.75F + offsetter- width / 2, (float) y + 0.5F + width / 2, (float) z - 64.0F);

                //face3:
                GL11.glVertex3f((float) x + 0.75F + offsetter + width / 2, (float) y + 0.5F - width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.75F + width / 2, (float) y + 0.5F - width / 2, (float) z + 0.05F);
                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.5F - width / 2, (float) z + 0.05F);

                GL11.glVertex3f((float) x + 0.75F + offsetter - width / 2, (float) y + 0.5F - width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.75F + offsetter + width / 2, (float) y + 0.5F - width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.5F - width / 2, (float) z + 0.05F);

                //face4:
                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.5F + width / 2, (float) z + 0.05F);
                GL11.glVertex3f((float) x + 0.75F + width / 2, (float) y + 0.5F + width / 2, (float) z + 0.05F);
                GL11.glVertex3f((float) x + 0.75F+ offsetter + width / 2, (float) y + 0.5F + width / 2, (float) z - 64.0F);

                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.5F + width / 2, (float) z + 0.05F);
                GL11.glVertex3f((float) x + 0.75F + offsetter + width / 2, (float) y + 0.5F + width / 2, (float) z - 64.0F);
                GL11.glVertex3f((float) x + 0.75F + offsetter - width / 2, (float) y + 0.5F + width / 2, (float) z - 64.0F);
            }

            //SOUTH:
            if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.SOUTH)) {
                //BEAM 1a:
                //face1:
                offsetter = -10F;
                GL11.glVertex3f((float) x + 0.25F + offsetter + width / 2, (float) y + 0.5F - width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.25F + width / 2, (float) y + 0.5F + width / 2, (float) z + 0.95F);
                GL11.glVertex3f((float) x + 0.25F + width / 2, (float) y + 0.5F - width / 2, (float) z + 0.95F);

                GL11.glVertex3f((float) x + 0.25F + offsetter + width / 2, (float) y + 0.5F - width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.25F + offsetter + width / 2, (float) y + 0.5F + width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.25F + width / 2, (float) y + 0.5F + width / 2, (float) z + 0.95F);

                //face2:
                GL11.glVertex3f((float) x + 0.25F + offsetter - width / 2, (float) y + 0.5F - width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.5F - width / 2, (float) z + 0.95F);
                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.5F + width / 2, (float) z + 0.95F);

                GL11.glVertex3f((float) x + 0.25F + offsetter- width / 2, (float) y + 0.5F - width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.5F + width / 2, (float) z + 0.95F);
                GL11.glVertex3f((float) x + 0.25F + offsetter- width / 2, (float) y + 0.5F + width / 2, (float) z + 64.0F);

                //face3:
                GL11.glVertex3f((float) x + 0.25F + offsetter + width / 2, (float) y + 0.5F - width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.25F + width / 2, (float) y + 0.5F - width / 2, (float) z + 0.95F);
                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.5F - width / 2, (float) z + 0.95F);

                GL11.glVertex3f((float) x + 0.25F + offsetter - width / 2, (float) y + 0.5F - width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.25F + offsetter + width / 2, (float) y + 0.5F - width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.5F - width / 2, (float) z + 0.95F);

                //face4:
                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.5F + width / 2, (float) z + 0.95F);
                GL11.glVertex3f((float) x + 0.25F + width / 2, (float) y + 0.5F + width / 2, (float) z + 0.95F);
                GL11.glVertex3f((float) x + 0.25F+ offsetter + width / 2, (float) y + 0.5F + width / 2, (float) z + 64.0F);

                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.5F + width / 2, (float) z + 0.95F);
                GL11.glVertex3f((float) x + 0.25F + offsetter + width / 2, (float) y + 0.5F + width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.25F + offsetter - width / 2, (float) y + 0.5F + width / 2, (float) z + 64.0F);

                //BEAM 1n:
                //face1:
                offsetter = 10F;
                GL11.glVertex3f((float) x + 0.75F + offsetter + width / 2, (float) y + 0.5F - width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.75F + width / 2, (float) y + 0.5F + width / 2, (float) z + 0.95F);
                GL11.glVertex3f((float) x + 0.75F + width / 2, (float) y + 0.5F - width / 2, (float) z + 0.95F);

                GL11.glVertex3f((float) x + 0.75F + offsetter + width / 2, (float) y + 0.5F - width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.75F + offsetter + width / 2, (float) y + 0.5F + width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.75F + width / 2, (float) y + 0.5F + width / 2, (float) z + 0.95F);

                //face2:
                GL11.glVertex3f((float) x + 0.75F + offsetter - width / 2, (float) y + 0.5F - width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.5F - width / 2, (float) z + 0.95F);
                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.5F + width / 2, (float) z + 0.95F);

                GL11.glVertex3f((float) x + 0.75F + offsetter- width / 2, (float) y + 0.5F - width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.5F + width / 2, (float) z + 0.95F);
                GL11.glVertex3f((float) x + 0.75F + offsetter- width / 2, (float) y + 0.5F + width / 2, (float) z + 64.0F);

                //face3:
                GL11.glVertex3f((float) x + 0.75F + offsetter + width / 2, (float) y + 0.5F - width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.75F + width / 2, (float) y + 0.5F - width / 2, (float) z + 0.95F);
                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.5F - width / 2, (float) z + 0.95F);

                GL11.glVertex3f((float) x + 0.75F + offsetter - width / 2, (float) y + 0.5F - width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.75F + offsetter + width / 2, (float) y + 0.5F - width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.5F - width / 2, (float) z + 0.95F);

                //face4:
                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.5F + width / 2, (float) z + 0.95F);
                GL11.glVertex3f((float) x + 0.75F + width / 2, (float) y + 0.5F + width / 2, (float) z + 0.95F);
                GL11.glVertex3f((float) x + 0.75F + offsetter + width / 2, (float) y + 0.5F + width / 2, (float) z + 64.0F);

                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.5F + width / 2, (float) z + 0.95F);
                GL11.glVertex3f((float) x + 0.75F + offsetter + width / 2, (float) y + 0.5F + width / 2, (float) z + 64.0F);
                GL11.glVertex3f((float) x + 0.75F + offsetter - width / 2, (float) y + 0.5F + width / 2, (float) z + 64.0F);
            }
            
            //EAST:
            if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.EAST)) {
                //BEAM 1a:
                //face1:
                offsetter = -10F;
                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.25F + offsetter - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.25F + width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.25F - width / 2, (float) z + 0.5F + width / 2);

                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.25F + offsetter - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.25F + offsetter + width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.25F + width / 2, (float) z + 0.5F + width / 2);

                //face2:
                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.25F + offsetter - width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.25F - width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.25F + width / 2, (float) z + 0.5F - width / 2);

                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.25F + offsetter - width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.25F + width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.25F + width / 2, (float) z + 0.5F - width / 2);

                //face3:
                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.25F + offsetter - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.25F - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.25F - width / 2, (float) z + 0.5F - width / 2);

                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.25F + offsetter - width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.25F + offsetter - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.25F - width / 2, (float) z + 0.5F - width / 2);

                //face4:
                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.25F + width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.25F + width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.25F + offsetter + width / 2, (float) z + 0.5F + width / 2);

                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.25F + width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.25F + offsetter + width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.25F + offsetter + width / 2, (float) z + 0.5F - width / 2);

                //BEAM 1n:
                offsetter = 10F;
                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.75F + offsetter - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.75F + width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.75F - width / 2, (float) z + 0.5F + width / 2);

                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.75F + offsetter - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.75F + offsetter + width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.75F + width / 2, (float) z + 0.5F + width / 2);

                //face2:
                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.75F + offsetter - width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.75F - width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.75F + width / 2, (float) z + 0.5F - width / 2);

                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.75F + offsetter - width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.75F + width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.75F + width / 2, (float) z + 0.5F - width / 2);

                //face3:
                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.75F + offsetter - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.75F - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.75F - width / 2, (float) z + 0.5F - width / 2);

                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.75F + offsetter - width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.75F + offsetter - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.75F - width / 2, (float) z + 0.5F - width / 2);

                //face4:
                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.75F + width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.75F + width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.75F + offsetter + width / 2, (float) z + 0.5F + width / 2);

                GL11.glVertex3f((float) x + 0.95F, (float) y + 0.75F + width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.75F + offsetter + width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 64.0F, (float) y + 0.75F + offsetter + width / 2, (float) z + 0.5F - width / 2);
            }

            //WEST:
            if (entity.isFaceActive(getWorld(), entity.getPos(), EnumFacing.WEST)) {
                //BEAM 1a:
                //face1:
                offsetter = -10F;
                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.25F + offsetter - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.25F + width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.25F - width / 2, (float) z + 0.5F + width / 2);

                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.25F + offsetter - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.25F + offsetter + width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.25F + width / 2, (float) z + 0.5F + width / 2);

                //face2:
                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.25F + offsetter - width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.25F - width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.25F + width / 2, (float) z + 0.5F - width / 2);

                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.25F + offsetter - width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.25F + width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.25F + width / 2, (float) z + 0.5F - width / 2);

                //face3:
                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.25F + offsetter - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.25F - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.25F - width / 2, (float) z + 0.5F - width / 2);

                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.25F + offsetter - width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.25F + offsetter - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.25F - width / 2, (float) z + 0.5F - width / 2);

                //face4:
                GL11.glVertex3f((float) x + 0.25F - width / 2, (float) y + 0.25F + width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.25F + width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.25F + offsetter + width / 2, (float) z + 0.5F + width / 2);

                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.25F + width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.25F + offsetter + width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.25F + offsetter + width / 2, (float) z + 0.5F - width / 2);

                //BEAM 1n:
                offsetter = 10F;
                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.75F + offsetter - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.75F + width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.75F - width / 2, (float) z + 0.5F + width / 2);

                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.75F + offsetter - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.75F + offsetter + width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.75F + width / 2, (float) z + 0.5F + width / 2);

                //face2:
                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.75F + offsetter - width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.75F - width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.75F + width / 2, (float) z + 0.5F - width / 2);

                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.75F + offsetter - width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.75F + width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.75F + width / 2, (float) z + 0.5F - width / 2);

                //face3:
                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.75F + offsetter - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.75F - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.75F - width / 2, (float) z + 0.5F - width / 2);

                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.75F + offsetter - width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.75F + offsetter - width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.75F - width / 2, (float) z + 0.5F - width / 2);

                //face4:
                GL11.glVertex3f((float) x + 0.75F - width / 2, (float) y + 0.75F + width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.75F + width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.75F + offsetter + width / 2, (float) z + 0.5F + width / 2);

                GL11.glVertex3f((float) x + 0.05F, (float) y + 0.75F + width / 2, (float) z + 0.5F - width / 2);
                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.75F + offsetter + width / 2, (float) z + 0.5F + width / 2);
                GL11.glVertex3f((float) x - 64.0F, (float) y + 0.75F + offsetter + width / 2, (float) z + 0.5F - width / 2);
            }

            GL11.glEnd();
            GL11.glEnable(GL11.GL_TEXTURE_2D);

            Minecraft.getMinecraft().entityRenderer.setupFogColor(false);

            GlStateManager.disableBlend();
            GlStateManager.enableAlpha();
            GL11.glColor3ub((byte) 255, (byte) 255, (byte) 255);

            GlStateManager.popMatrix();


        }

    }
}