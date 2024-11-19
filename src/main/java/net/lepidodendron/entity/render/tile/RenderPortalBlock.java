package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockPortalBlockCarboniferous;
import net.lepidodendron.block.BlockPortalBlockOrdovician;
import net.lepidodendron.block.BlockPortalBlockPrecambrian;
import net.lepidodendron.block.BlockPortalBlockSilurian;
import net.lepidodendron.entity.model.tile.ModelPortalBlockCarboniferous;
import net.lepidodendron.entity.model.tile.ModelPortalBlockOrdovician;
import net.lepidodendron.entity.model.tile.ModelPortalBlockPrecambrian;
import net.lepidodendron.entity.model.tile.ModelPortalBlockSilurian;
import net.lepidodendron.tileentity.TileEntityPortalBlock;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderPortalBlock extends TileEntitySpecialRenderer<TileEntityPortalBlock> {

    private static final ResourceLocation TEXTURE_PRECAMBRIAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/portal_block_precambrian.png");
    private static final ResourceLocation TEXTURE_ORDOVICIAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/portal_block_ordovician.png");
    private static final ResourceLocation TEXTURE_SILURIAN = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/portal_block_silurian.png");
    private static final ResourceLocation TEXTURE_CARBONIFEROUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/portal_block_carboniferous.png");
    private final ModelPortalBlockPrecambrian modelPortalBlockPrecambrian;
    private final ModelPortalBlockOrdovician modelPortalBlockOrdovician;
    private final ModelPortalBlockSilurian modelPortalBlockSilurian;
    private final ModelPortalBlockCarboniferous modelPortalBlockCarboniferous;
    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public RenderPortalBlock() {
        this.modelPortalBlockPrecambrian = new ModelPortalBlockPrecambrian();
        this.modelPortalBlockOrdovician = new ModelPortalBlockOrdovician();
        this.modelPortalBlockSilurian = new ModelPortalBlockSilurian();
        this.modelPortalBlockCarboniferous = new ModelPortalBlockCarboniferous();
    }

    public boolean isVar(TileEntityPortalBlock entity) {
        return (double) (entity.getPos().getX() + entity.getPos().getY() + entity.getPos().getZ())/3 == (int) (entity.getPos().getX() + entity.getPos().getY() + entity.getPos().getZ())/3;
    }

    public boolean isVar2(TileEntityPortalBlock entity) {
        return (double) (entity.getPos().getX() + entity.getPos().getY() + entity.getPos().getZ() + 4)/3 == (int) (entity.getPos().getX() + entity.getPos().getY() + entity.getPos().getZ() + 4)/3;
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
        Byte colRed = 0;
        Byte colGreen = 0;
        Byte colBlue = 0;

        float transparency = 1.0F;

        if (entity.hasWorld()) {
            if (entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockPortalBlockPrecambrian.block) {

                if (entity.getIsActive()) {
                    transparency = Math.min((float) (entity.getAnimationTick() + 5 + partialTicks) / 60F, 1F);
                }
                else {
                    transparency = Math.min((float) (entity.getAnimationTick() - 30 + partialTicks) / 60F, 1F);
                }

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
            else if (entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockPortalBlockOrdovician.block) {

                if (entity.getIsActive()) {
                    transparency = 1F;
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
                        modelPortalBlockOrdovician.renderTrilobite1(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
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
                            modelPortalBlockOrdovician.renderTrilobite2(entity.getAnimationTick(), 1.25f, partialTicks, 15, ((float) getWorld().getTotalWorldTime() + partialTicks), 15F);
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
                        modelPortalBlockOrdovician.renderTrilobite1(entity.getAnimationTick(), 1.25f, partialTicks, 1, ((float) getWorld().getTotalWorldTime() + partialTicks), 1F);
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
                            modelPortalBlockOrdovician.renderTrilobite2(entity.getAnimationTick(), 1.25f, partialTicks, 9, ((float) getWorld().getTotalWorldTime() + partialTicks), 9F);
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
                        modelPortalBlockOrdovician.renderTrilobite1(entity.getAnimationTick(), 1.25f, partialTicks, 10, ((float) getWorld().getTotalWorldTime() + partialTicks), 10F);
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
                            modelPortalBlockOrdovician.renderTrilobite2(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
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
                        modelPortalBlockOrdovician.renderTrilobite1(entity.getAnimationTick(), 1.25f, partialTicks, 10, ((float) getWorld().getTotalWorldTime() + partialTicks), 10F);
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
                            modelPortalBlockOrdovician.renderTrilobite2(entity.getAnimationTick(), 1.25f, partialTicks, 3, ((float) getWorld().getTotalWorldTime() + partialTicks), 3F);
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
                        modelPortalBlockOrdovician.renderTrilobite1(entity.getAnimationTick(), 1.25f, partialTicks, 19, ((float) getWorld().getTotalWorldTime() + partialTicks), 19F);
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
                            modelPortalBlockOrdovician.renderTrilobite1(entity.getAnimationTick(), 1.25f, partialTicks, 9, ((float) getWorld().getTotalWorldTime() + partialTicks), 9F);
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

            else if (entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockPortalBlockSilurian.block) {

                if (entity.getIsActive()) {
                    transparency = 1F;
                }
                else {
                    transparency = Math.min((float) (entity.getAnimationTick() - 30 + partialTicks) / 60F, 1F);
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
                    modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick(), 1.25f, partialTicks, 5, ((float) getWorld().getTotalWorldTime() + partialTicks), 5F);
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
                    modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick() - 5, 1.25f, partialTicks, 15, ((float) getWorld().getTotalWorldTime() + partialTicks), 0.15F);
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
                    modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick(), 1.25f, partialTicks, 1, ((float) getWorld().getTotalWorldTime() + partialTicks), 1F);
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
                    modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick() - 8, 1.25f, partialTicks, 9, ((float) getWorld().getTotalWorldTime() + partialTicks), 9F);
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
                    modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick(), 1.25f, partialTicks, -13, ((float) getWorld().getTotalWorldTime() + partialTicks), -13F);
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
                    modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick() - 8, 1.25f, partialTicks, -20, ((float) getWorld().getTotalWorldTime() + partialTicks), -20F);
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
                    modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick() - 1, 1.25f, partialTicks, 16, ((float) getWorld().getTotalWorldTime() + partialTicks), 16F);
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
                    modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick() - 1, 1.25f, partialTicks, 28, ((float) getWorld().getTotalWorldTime() + partialTicks), 28F);
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
                    modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick() - 1, 1.25f, partialTicks, 33, ((float) getWorld().getTotalWorldTime() + partialTicks), 33F);
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
                    modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick() - 1, 1.25f, partialTicks, 13, ((float) getWorld().getTotalWorldTime() + partialTicks), 13F);
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
                    modelPortalBlockSilurian.renderTentacle(entity.getAnimationTick() - 1, 1.25f, partialTicks, 4, ((float) getWorld().getTotalWorldTime() + partialTicks), 4F);
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
                    modelPortalBlockSilurian.renderTentacleVar(entity.getAnimationTick() - 7, 1.25f, partialTicks, 1, ((float) getWorld().getTotalWorldTime() + partialTicks), 1F);
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.enableCull();
                    GlStateManager.popMatrix();
                }

                colRed = (byte) 69;
                colGreen = (byte) 115;
                colBlue = (byte) 108;
            }
            else if (entity.getWorld().getBlockState(entity.getPos()).getBlock() == BlockPortalBlockCarboniferous.block) {

                ModelPortalBlockCarboniferous modelPortalBlockCarboniferous = this.modelPortalBlockCarboniferous;

                GlStateManager.pushMatrix();
                this.bindTexture(TEXTURE_CARBONIFEROUS);
                GlStateManager.enableRescaleNormal();
                GlStateManager.disableCull();
                GlStateManager.translate(x + 0.5, y + 1.5, z + 0.5);
                GlStateManager.rotate(180, 0F, 0F, 1F);
                GlStateManager.rotate(facing.getHorizontalAngle(), 0.0F, 1.0F, 0.0F);
                GlStateManager.scale(0.05F, 0.05F, 0.05F);
                modelPortalBlockCarboniferous.renderBase(entity.getAnimationTick(), 1.25f, partialTicks);
                GlStateManager.disableRescaleNormal();
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