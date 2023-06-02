package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockRopeBarrier;
import net.lepidodendron.entity.model.tile.ModelRopePoleRope;
import net.lepidodendron.entity.model.tile.ModelRopePoleRopeEnd;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RenderRopeBarrier extends TileEntitySpecialRenderer<BlockRopeBarrier.TileEntityRopeBarrier> {

    private final ModelRopePoleRope rope;
    private final ModelRopePoleRopeEnd rope_end;

    private static final ResourceLocation TEXTURE_DYE_0 = new ResourceLocation("minecraft:textures/blocks/concrete_powder_black.png");
    private static final ResourceLocation TEXTURE_DYE_1 = new ResourceLocation("minecraft:textures/blocks/concrete_powder_red.png");
    private static final ResourceLocation TEXTURE_DYE_2 = new ResourceLocation("minecraft:textures/blocks/concrete_powder_green.png");
    private static final ResourceLocation TEXTURE_DYE_3 = new ResourceLocation("minecraft:textures/blocks/concrete_powder_brown.png");
    private static final ResourceLocation TEXTURE_DYE_4 = new ResourceLocation("minecraft:textures/blocks/concrete_powder_blue.png");
    private static final ResourceLocation TEXTURE_DYE_5 = new ResourceLocation("minecraft:textures/blocks/concrete_powder_purple.png");
    private static final ResourceLocation TEXTURE_DYE_6 = new ResourceLocation("minecraft:textures/blocks/concrete_powder_cyan.png");
    private static final ResourceLocation TEXTURE_DYE_7 = new ResourceLocation("minecraft:textures/blocks/concrete_powder_silver.png");
    private static final ResourceLocation TEXTURE_DYE_8 = new ResourceLocation("minecraft:textures/blocks/concrete_powder_gray.png");
    private static final ResourceLocation TEXTURE_DYE_9 = new ResourceLocation("minecraft:textures/blocks/concrete_powder_pink.png");
    private static final ResourceLocation TEXTURE_DYE_10 = new ResourceLocation("minecraft:textures/blocks/concrete_powder_lime.png");
    private static final ResourceLocation TEXTURE_DYE_11 = new ResourceLocation("minecraft:textures/blocks/concrete_powder_yellow.png");
    private static final ResourceLocation TEXTURE_DYE_12 = new ResourceLocation("minecraft:textures/blocks/concrete_powder_light_blue.png");
    private static final ResourceLocation TEXTURE_DYE_13 = new ResourceLocation("minecraft:textures/blocks/concrete_powder_magenta.png");
    private static final ResourceLocation TEXTURE_DYE_14 = new ResourceLocation("minecraft:textures/blocks/concrete_powder_orange.png");
    private static final ResourceLocation TEXTURE_DYE_15 = new ResourceLocation("minecraft:textures/blocks/concrete_powder_white.png");
    private static final ResourceLocation TEXTURE_DYE_16 = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/rope.png");

    private static final ResourceLocation TEXTURE_END_0 = new ResourceLocation("minecraft:textures/blocks/anvil_base.png");
    private static final ResourceLocation TEXTURE_END_1 = new ResourceLocation(LepidodendronMod.MODID + ":textures/blocks/iron_bridge.png");
    private static final ResourceLocation TEXTURE_END_2 = new ResourceLocation("minecraft:textures/blocks/gold_block.png");
    private static final ResourceLocation TEXTURE_END_3 = new ResourceLocation(LepidodendronMod.MODID + ":textures/blocks/zircon_block.png");
    private static final ResourceLocation TEXTURE_END_4 = new ResourceLocation("minecraft:textures/blocks/emerald_block.png");
    private static final ResourceLocation TEXTURE_END_5 = new ResourceLocation("minecraft:textures/blocks/diamond_block.png");
    private static final ResourceLocation TEXTURE_END_6 = new ResourceLocation(LepidodendronMod.MODID + ":textures/blocks/baltic_amber.png");
    private static final ResourceLocation TEXTURE_END_7 = new ResourceLocation(LepidodendronMod.MODID + ":textures/blocks/dominican_amber.png");
    private static final ResourceLocation TEXTURE_END_8 = new ResourceLocation("minecraft:textures/blocks/quartz_block_side.png");
    private static final ResourceLocation TEXTURE_END_9 = new ResourceLocation("minecraft:textures/blocks/lapis_block.png");
    private static final ResourceLocation TEXTURE_END_10 = new ResourceLocation("minecraft:textures/blocks/coal_block.png");
    private static final ResourceLocation TEXTURE_END_11 = new ResourceLocation(LepidodendronMod.MODID + ":textures/blocks/araucarioxylon_wood_petrified.png");
    private static final ResourceLocation TEXTURE_END_12 = new ResourceLocation("minecraft:textures/blocks/redstone_block.png");

    private static final ResourceLocation TEXTURE_END_13 = new ResourceLocation(LepidodendronMod.MODID + ":textures/blocks/anthracite_block.png");
    private static final ResourceLocation TEXTURE_END_14 = new ResourceLocation(LepidodendronMod.MODID + ":textures/blocks/salt_block.png");
    private static final ResourceLocation TEXTURE_END_15 = new ResourceLocation(LepidodendronMod.MODID + ":textures/blocks/sulphur_block.png");

    public RenderRopeBarrier() {
        this.rope = new ModelRopePoleRope();
        this.rope_end = new ModelRopePoleRopeEnd();
    }

    @Override
    public void render(BlockRopeBarrier.TileEntityRopeBarrier entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {

        BlockPos pos = entity.getPos();
        World world = entity.getWorld();

        int variant = 0;
        TileEntity tileEntity = entity.getWorld().getTileEntity(pos);
        if (tileEntity != null) {
            if (tileEntity.getTileData().hasKey("variant")) {
                variant = tileEntity.getTileData().getInteger("variant");
            }
        }


        ResourceLocation TEXTURE_END = TEXTURE_END_0;
        switch (variant) {
            case 0: default:
                TEXTURE_END = TEXTURE_END_0;
                break;

            case 1:
                TEXTURE_END = TEXTURE_END_1;
                break;

            case 2:
                TEXTURE_END = TEXTURE_END_2;
                break;

            case 3:
                TEXTURE_END = TEXTURE_END_3;
                break;

            case 4:
                TEXTURE_END = TEXTURE_END_4;
                break;

            case 5:
                TEXTURE_END = TEXTURE_END_5;
                break;

            case 6:
                TEXTURE_END = TEXTURE_END_6;
                break;

            case 7:
                TEXTURE_END = TEXTURE_END_7;
                break;

            case 8:
                TEXTURE_END = TEXTURE_END_8;
                break;

            case 9:
                TEXTURE_END = TEXTURE_END_9;
                break;

            case 10:
                TEXTURE_END = TEXTURE_END_10;
                break;

            case 11:
                TEXTURE_END = TEXTURE_END_11;
                break;

            case 12:
                TEXTURE_END = TEXTURE_END_12;
                break;

            case 13:
                TEXTURE_END = TEXTURE_END_13;
                break;

            case 14:
                TEXTURE_END = TEXTURE_END_14;
                break;

            case 15:
                TEXTURE_END = TEXTURE_END_15;
                break;

        }

        if (entity != null && entity.hasWorld() && world.getBlockState(pos).getBlock() == BlockRopeBarrier.block) {

            boolean north = false;
            boolean south = false;
            boolean east = false;
            boolean west = false;
            if (tileEntity != null) {
                if (tileEntity.getTileData().hasKey("north")) {
                    north = tileEntity.getTileData().getBoolean("north");
                }
                if (tileEntity.getTileData().hasKey("south")) {
                    south = tileEntity.getTileData().getBoolean("south");
                }
                if (tileEntity.getTileData().hasKey("east")) {
                    east = tileEntity.getTileData().getBoolean("east");
                }
                if (tileEntity.getTileData().hasKey("west")) {
                    west = tileEntity.getTileData().getBoolean("west");
                }
            }

            if (north) {
                int dye = 16;
                if (tileEntity != null) {
                    if (tileEntity.getTileData().hasKey("northDye")) {
                        dye = tileEntity.getTileData().getInteger("northDye");
                    }
                }
                ResourceLocation TEXTURE_DYE = TEXTURE_DYE_16;
                switch (dye) {
                    case 16:
                    default:
                        TEXTURE_DYE = TEXTURE_DYE_16;
                        break;

                    case 15:
                        TEXTURE_DYE = TEXTURE_DYE_15;
                        break;

                    case 14:
                        TEXTURE_DYE = TEXTURE_DYE_14;
                        break;

                    case 13:
                        TEXTURE_DYE = TEXTURE_DYE_13;
                        break;

                    case 12:
                        TEXTURE_DYE = TEXTURE_DYE_12;
                        break;

                    case 11:
                        TEXTURE_DYE = TEXTURE_DYE_11;
                        break;

                    case 10:
                        TEXTURE_DYE = TEXTURE_DYE_10;
                        break;

                    case 9:
                        TEXTURE_DYE = TEXTURE_DYE_9;
                        break;

                    case 8:
                        TEXTURE_DYE = TEXTURE_DYE_8;
                        break;

                    case 7:
                        TEXTURE_DYE = TEXTURE_DYE_7;
                        break;

                    case 6:
                        TEXTURE_DYE = TEXTURE_DYE_6;
                        break;

                    case 5:
                        TEXTURE_DYE = TEXTURE_DYE_5;
                        break;

                    case 4:
                        TEXTURE_DYE = TEXTURE_DYE_4;
                        break;

                    case 3:
                        TEXTURE_DYE = TEXTURE_DYE_3;
                        break;

                    case 2:
                        TEXTURE_DYE = TEXTURE_DYE_2;
                        break;

                    case 1:
                        TEXTURE_DYE = TEXTURE_DYE_1;
                        break;

                    case 0:
                        TEXTURE_DYE = TEXTURE_DYE_0;
                        break;

                }

                float yPos = 1.450F;
                float scaler = 0.05F;
                float renderscale = 1.2F;
                float rotation = 90; //North

                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableRescaleNormal();
                GlStateManager.translate(x + 0.5F + 0.0001, y + yPos + 0.0001, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(rotation, 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(scaler, scaler, scaler);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_DYE);
                GlStateManager.enableAlpha();
                this.rope.renderAll(renderscale);
                GlStateManager.disableAlpha();
                GlStateManager.enableCull();
                GlStateManager.popMatrix();

                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableRescaleNormal();
                GlStateManager.translate(x + 0.5F, y + yPos, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(rotation, 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(scaler, scaler, scaler);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_END);
                GlStateManager.enableAlpha();
                this.rope_end.renderAll(renderscale);
                GlStateManager.disableAlpha();
                GlStateManager.enableCull();
                GlStateManager.popMatrix();
            }

            if (south) {
                int dye = 16;
                if (tileEntity != null) {
                    if (tileEntity.getTileData().hasKey("southDye")) {
                        dye = tileEntity.getTileData().getInteger("southDye");
                    }
                }
                ResourceLocation TEXTURE_DYE = TEXTURE_DYE_16;
                switch (dye) {
                    case 16:
                    default:
                        TEXTURE_DYE = TEXTURE_DYE_16;
                        break;

                    case 15:
                        TEXTURE_DYE = TEXTURE_DYE_15;
                        break;

                    case 14:
                        TEXTURE_DYE = TEXTURE_DYE_14;
                        break;

                    case 13:
                        TEXTURE_DYE = TEXTURE_DYE_13;
                        break;

                    case 12:
                        TEXTURE_DYE = TEXTURE_DYE_12;
                        break;

                    case 11:
                        TEXTURE_DYE = TEXTURE_DYE_11;
                        break;

                    case 10:
                        TEXTURE_DYE = TEXTURE_DYE_10;
                        break;

                    case 9:
                        TEXTURE_DYE = TEXTURE_DYE_9;
                        break;

                    case 8:
                        TEXTURE_DYE = TEXTURE_DYE_8;
                        break;

                    case 7:
                        TEXTURE_DYE = TEXTURE_DYE_7;
                        break;

                    case 6:
                        TEXTURE_DYE = TEXTURE_DYE_6;
                        break;

                    case 5:
                        TEXTURE_DYE = TEXTURE_DYE_5;
                        break;

                    case 4:
                        TEXTURE_DYE = TEXTURE_DYE_4;
                        break;

                    case 3:
                        TEXTURE_DYE = TEXTURE_DYE_3;
                        break;

                    case 2:
                        TEXTURE_DYE = TEXTURE_DYE_2;
                        break;

                    case 1:
                        TEXTURE_DYE = TEXTURE_DYE_1;
                        break;

                    case 0:
                        TEXTURE_DYE = TEXTURE_DYE_0;
                        break;

                }

                float yPos = 1.450F;
                float scaler = 0.05F;
                float renderscale = 1.2F;
                float rotation = 270; //North

                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableRescaleNormal();
                GlStateManager.translate(x + 0.5F, y + yPos, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(rotation, 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(scaler, scaler, scaler);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_DYE);
                GlStateManager.enableAlpha();
                this.rope.renderAll(renderscale);
                GlStateManager.disableAlpha();
                GlStateManager.enableCull();
                GlStateManager.popMatrix();

                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableRescaleNormal();
                GlStateManager.translate(x + 0.5F, y + yPos, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(rotation, 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(scaler, scaler, scaler);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_END);
                GlStateManager.enableAlpha();
                this.rope_end.renderAll(renderscale);
                GlStateManager.disableAlpha();
                GlStateManager.enableCull();
                GlStateManager.popMatrix();
            }

            if (east) {
                int dye = 16;
                if (tileEntity != null) {
                    if (tileEntity.getTileData().hasKey("eastDye")) {
                        dye = tileEntity.getTileData().getInteger("eastDye");
                    }
                }
                ResourceLocation TEXTURE_DYE = TEXTURE_DYE_16;
                switch (dye) {
                    case 16:
                    default:
                        TEXTURE_DYE = TEXTURE_DYE_16;
                        break;

                    case 15:
                        TEXTURE_DYE = TEXTURE_DYE_15;
                        break;

                    case 14:
                        TEXTURE_DYE = TEXTURE_DYE_14;
                        break;

                    case 13:
                        TEXTURE_DYE = TEXTURE_DYE_13;
                        break;

                    case 12:
                        TEXTURE_DYE = TEXTURE_DYE_12;
                        break;

                    case 11:
                        TEXTURE_DYE = TEXTURE_DYE_11;
                        break;

                    case 10:
                        TEXTURE_DYE = TEXTURE_DYE_10;
                        break;

                    case 9:
                        TEXTURE_DYE = TEXTURE_DYE_9;
                        break;

                    case 8:
                        TEXTURE_DYE = TEXTURE_DYE_8;
                        break;

                    case 7:
                        TEXTURE_DYE = TEXTURE_DYE_7;
                        break;

                    case 6:
                        TEXTURE_DYE = TEXTURE_DYE_6;
                        break;

                    case 5:
                        TEXTURE_DYE = TEXTURE_DYE_5;
                        break;

                    case 4:
                        TEXTURE_DYE = TEXTURE_DYE_4;
                        break;

                    case 3:
                        TEXTURE_DYE = TEXTURE_DYE_3;
                        break;

                    case 2:
                        TEXTURE_DYE = TEXTURE_DYE_2;
                        break;

                    case 1:
                        TEXTURE_DYE = TEXTURE_DYE_1;
                        break;

                    case 0:
                        TEXTURE_DYE = TEXTURE_DYE_0;
                        break;

                }

                float yPos = 1.450F;
                float scaler = 0.05F;
                float renderscale = 1.2F;
                float rotation = 180; //East

                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableRescaleNormal();
                GlStateManager.translate(x + 0.5F, y + yPos + 0.0001, z + 0.5F + 0.0001);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(rotation, 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(scaler, scaler, scaler);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_DYE);
                GlStateManager.enableAlpha();
                this.rope.renderAll(renderscale);
                GlStateManager.disableAlpha();
                GlStateManager.enableCull();
                GlStateManager.popMatrix();

                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableRescaleNormal();
                GlStateManager.translate(x + 0.5F, y + yPos, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(rotation, 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(scaler, scaler, scaler);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_END);
                GlStateManager.enableAlpha();
                this.rope_end.renderAll(renderscale);
                GlStateManager.disableAlpha();
                GlStateManager.enableCull();
                GlStateManager.popMatrix();
            }


            if (west) {
                int dye = 16;
                if (tileEntity != null) {
                    if (tileEntity.getTileData().hasKey("westDye")) {
                        dye = tileEntity.getTileData().getInteger("westDye");
                    }
                }
                ResourceLocation TEXTURE_DYE = TEXTURE_DYE_16;
                switch (dye) {
                    case 16:
                    default:
                        TEXTURE_DYE = TEXTURE_DYE_16;
                        break;

                    case 15:
                        TEXTURE_DYE = TEXTURE_DYE_15;
                        break;

                    case 14:
                        TEXTURE_DYE = TEXTURE_DYE_14;
                        break;

                    case 13:
                        TEXTURE_DYE = TEXTURE_DYE_13;
                        break;

                    case 12:
                        TEXTURE_DYE = TEXTURE_DYE_12;
                        break;

                    case 11:
                        TEXTURE_DYE = TEXTURE_DYE_11;
                        break;

                    case 10:
                        TEXTURE_DYE = TEXTURE_DYE_10;
                        break;

                    case 9:
                        TEXTURE_DYE = TEXTURE_DYE_9;
                        break;

                    case 8:
                        TEXTURE_DYE = TEXTURE_DYE_8;
                        break;

                    case 7:
                        TEXTURE_DYE = TEXTURE_DYE_7;
                        break;

                    case 6:
                        TEXTURE_DYE = TEXTURE_DYE_6;
                        break;

                    case 5:
                        TEXTURE_DYE = TEXTURE_DYE_5;
                        break;

                    case 4:
                        TEXTURE_DYE = TEXTURE_DYE_4;
                        break;

                    case 3:
                        TEXTURE_DYE = TEXTURE_DYE_3;
                        break;

                    case 2:
                        TEXTURE_DYE = TEXTURE_DYE_2;
                        break;

                    case 1:
                        TEXTURE_DYE = TEXTURE_DYE_1;
                        break;

                    case 0:
                        TEXTURE_DYE = TEXTURE_DYE_0;
                        break;

                }

                float yPos = 1.450F;
                float scaler = 0.05F;
                float renderscale = 1.2F;
                float rotation = 0; //West

                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableRescaleNormal();
                GlStateManager.translate(x + 0.5F, y + yPos, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(rotation, 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(scaler, scaler, scaler);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_DYE);
                GlStateManager.enableAlpha();
                this.rope.renderAll(renderscale);
                GlStateManager.disableAlpha();
                GlStateManager.enableCull();
                GlStateManager.popMatrix();

                GlStateManager.pushMatrix();
                GlStateManager.disableCull();
                GlStateManager.enableRescaleNormal();
                GlStateManager.translate(x + 0.5F, y + yPos, z + 0.5F);
                GlStateManager.rotate(180.0F, 1.0F, 0.0F, 0.0F);
                GlStateManager.rotate(rotation, 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(scaler, scaler, scaler);
                Minecraft.getMinecraft().renderEngine.bindTexture(TEXTURE_END);
                GlStateManager.enableAlpha();
                this.rope_end.renderAll(renderscale);
                GlStateManager.disableAlpha();
                GlStateManager.enableCull();
                GlStateManager.popMatrix();
            }
        }
    }
}