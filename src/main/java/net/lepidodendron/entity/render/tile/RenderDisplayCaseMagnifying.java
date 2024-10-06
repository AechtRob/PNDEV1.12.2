package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockDisplayCaseMagnifying;
import net.lepidodendron.entity.model.entity.*;
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

public class RenderDisplayCaseMagnifying extends TileEntitySpecialRenderer<BlockDisplayCaseMagnifying.TileEntityDisplayCase> {

    public static final PropertyDirection FACING = BlockDirectional.FACING;

    private static final ResourceLocation TEXTURE_GERARUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerarus.png");
    private final ModelGerarus modelGerarus;
    private static final ResourceLocation TEXTURE_AINIKTOZOON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ainiktozoon.png");
    private final ModelAiniktozoon modelAiniktozoon;
    private static final ResourceLocation TEXTURE_ACADOARADOXIDES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acadoaradoxides.png");
    private final ModelAcadoaradoxides modelAcadoaradoxides;
    private static final ResourceLocation TEXTURE_AMPLECTOBELUA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/amplectobelua.png");
    private final ModelAmplectobelua modelAmplectobelua;
    private static final ResourceLocation TEXTURE_LYRARAPAX = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lyrarapax.png");
    private final ModelLyrarapax modelLyrarapax;
    private static final ResourceLocation TEXTURE_MARRELLA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/marrella.png");
    private final ModelMarrella modelMarrella;
    private static final ResourceLocation TEXTURE_PHANTASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/phantaspis.png");
    private final ModelPhantaspis modelPhantaspis;
    private static final ResourceLocation TEXTURE_SIDNEYIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/sidneyia.png");
    private final ModelSidneyia modelSidneyia;
    private static final ResourceLocation TEXTURE_WALLISEROPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/walliserops.png");
    private final ModelWalliserops modelWalliserops;

    public RenderDisplayCaseMagnifying() {
        this.modelGerarus = new ModelGerarus();
        this.modelAiniktozoon = new ModelAiniktozoon();
        this.modelAcadoaradoxides = new ModelAcadoaradoxides();
        this.modelAmplectobelua = new ModelAmplectobelua();
        this.modelLyrarapax = new ModelLyrarapax();
        this.modelMarrella = new ModelMarrella();
        this.modelPhantaspis = new ModelPhantaspis();
        this.modelSidneyia = new ModelSidneyia();
        this.modelWalliserops = new ModelWalliserops();
    }

    @Override
    public void render(BlockDisplayCaseMagnifying.TileEntityDisplayCase entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        EnumFacing facing;
        boolean itemRender  = false;
        int currentRotation = 0;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
            if (entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockDisplayCaseMagnifying.block) {
                facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);

                TileEntity te = world.getTileEntity(pos);
                if (te != null) {
                    if (te instanceof BlockDisplayCaseMagnifying.TileEntityDisplayCase) {
                        BlockDisplayCaseMagnifying.TileEntityDisplayCase tee = (BlockDisplayCaseMagnifying.TileEntityDisplayCase) te;
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

                    /*
                    if (itemstack.getItem() == ItemAiniktozoonRaw.block) {
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
                        GlStateManager.scale(2.0,2.0,2.0);
                        this.bindTexture(TEXTURE_AINIKTOZOON);
                        modelAiniktozoon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAcadoaradoxidesRaw.block) {
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
                        GlStateManager.scale(2.0,2.0,2.0);
                        this.bindTexture(TEXTURE_ACADOARADOXIDES);
                        modelAcadoaradoxides.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAmplectobeluaRaw.block) {
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
                        GlStateManager.scale(2.0,2.0,2.0);
                        this.bindTexture(TEXTURE_AMPLECTOBELUA);
                        modelAmplectobelua.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLyrarapaxRaw.block) {
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
                        GlStateManager.scale(2.0,2.0,2.0);
                        this.bindTexture(TEXTURE_LYRARAPAX);
                        modelLyrarapax.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMarrellaRaw.block) {
                        double offset = 0.90;
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
                        GlStateManager.scale(2.0,2.0,2.0);
                        this.bindTexture(TEXTURE_MARRELLA);
                        modelMarrella.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
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
                        GlStateManager.scale(2.0,2.0,2.0);
                        this.bindTexture(TEXTURE_PHANTASPIS);
                        modelPhantaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemSidneyiaRaw.block) {
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
                        GlStateManager.scale(2.0,2.0,2.0);
                        this.bindTexture(TEXTURE_SIDNEYIA);
                        modelSidneyia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemWalliseropsRaw.block) {
                        double offset = 1.15;
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
                        GlStateManager.scale(2.0,2.0,2.0);
                        this.bindTexture(TEXTURE_WALLISEROPS);
                        modelWalliserops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }


                     */

                        // ********************************************************************
                        //else { //standard items
                        itemRender = true;

                        GlStateManager.alphaFunc(516, 0.1F);
                        GlStateManager.enableBlend();
                        RenderHelper.enableStandardItemLighting();
                        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
                        //GlStateManager.pushMatrix();

                        float scale = 0.725F;
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
                        model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.FIXED, false);
                        //model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.GROUND, false);
                        Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
                        Minecraft.getMinecraft().getRenderItem().renderItem(itemstack, model);
                        //}

                        if (itemRender) {
                            GlStateManager.disableRescaleNormal();
                            //GlStateManager.disableAlpha();
                            GlStateManager.disableBlend();
                            GlStateManager.enableCull();
                            GlStateManager.disableRescaleNormal();
                            RenderHelper.disableStandardItemLighting();
                            GlStateManager.popMatrix();
                        } else {
                            //GlStateManager.disableAlpha();
                            GlStateManager.disableRescaleNormal();
                            GlStateManager.enableCull();
                            GlStateManager.popMatrix();
                        }

                    }
                }
            }
        }
    }
}