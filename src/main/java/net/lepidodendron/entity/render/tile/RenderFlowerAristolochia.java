package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockAristolochiaFlower;
import net.lepidodendron.entity.model.tile.ModelFlowerAristolochia;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class RenderFlowerAristolochia extends TileEntitySpecialRenderer<BlockAristolochiaFlower.TileEntityCustom> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/flower_aristolochia.png");
    private final ModelFlowerAristolochia modelFlowerAristolochia;
    public static final PropertyBool UP = PropertyBool.create("up");
    public static final PropertyBool NORTH = PropertyBool.create("north");
    public static final PropertyBool EAST = PropertyBool.create("east");
    public static final PropertyBool SOUTH = PropertyBool.create("south");
    public static final PropertyBool WEST = PropertyBool.create("west");

    public RenderFlowerAristolochia() {
        this.modelFlowerAristolochia = new ModelFlowerAristolochia();
    }

    @Override
    public void render(BlockAristolochiaFlower.TileEntityCustom entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        EnumFacing facing = EnumFacing.UP;
        boolean up = false;
        boolean north = false;
        boolean east = false;
        boolean south = false;
        boolean west = false;
        if (entity != null && entity.hasWorld()) {

            up = entity.getWorld().getBlockState(entity.getPos()).getValue(UP);
            north = entity.getWorld().getBlockState(entity.getPos()).getValue(NORTH);
            east = entity.getWorld().getBlockState(entity.getPos()).getValue(EAST);
            south = entity.getWorld().getBlockState(entity.getPos()).getValue(SOUTH);
            west = entity.getWorld().getBlockState(entity.getPos()).getValue(WEST);

            boolean var = false; //variant checker
            if ((double)(((double)entity.getPos().getX() + (double)entity.getPos().getY() + (double)entity.getPos().getZ()) / 2D)
                    == Math.round((((double)entity.getPos().getX() + (double)entity.getPos().getY() + (double)entity.getPos().getZ()) / 2D))) {
                var = true;
            }

            if (east) {
                if (!north && !south && !west) {
                    facing = EnumFacing.WEST;
                }
                else if (north && !south && !west) {
                    if (var) {
                        facing = EnumFacing.WEST;
                    }
                    else {
                        facing = EnumFacing.SOUTH;
                    }
                }
                else if (south && !north && !west) {
                    if (var) {
                        facing = EnumFacing.WEST;
                    }
                    else {
                        facing = EnumFacing.NORTH;
                    }
                }
                else {
                    facing = EnumFacing.WEST;
                }
            }

            if (west) {
                if (!north && !south && !east) {
                    facing = EnumFacing.EAST;
                }
                else if (north && !south && !east) {
                    if (var) {
                        facing = EnumFacing.EAST;
                    }
                    else {
                        facing = EnumFacing.NORTH;
                    }
                }
                else if (south && !north && !east) {
                    if (var) {
                        facing = EnumFacing.EAST;
                    }
                    else {
                        facing = EnumFacing.NORTH;
                    }
                }
                else {
                    facing = EnumFacing.EAST;
                }
            }

            if (south) {
                if (!east && !west && !north) {
                    facing = EnumFacing.NORTH;
                }
                else if (east && !west && !north) {
                    if (var) {
                        facing = EnumFacing.NORTH;
                    }
                    else {
                        facing = EnumFacing.WEST;
                    }
                }
                else if (west && !east && !north) {
                    if (var) {
                        facing = EnumFacing.EAST;
                    }
                    else {
                        facing = EnumFacing.NORTH;
                    }
                }
                else {
                    facing = EnumFacing.NORTH;
                }
            }

            if (north) {
                if (!east && !west && !south) {
                    facing = EnumFacing.SOUTH;
                }
                else if (east && !west && !south) {
                    if (var) {
                        facing = EnumFacing.SOUTH;
                    }
                    else {
                        facing = EnumFacing.WEST;
                    }
                }
                else if (west && !east && !south) {
                    if (var) {
                        facing = EnumFacing.EAST;
                    }
                    else {
                        facing = EnumFacing.SOUTH;
                    }
                }
                else {
                    facing = EnumFacing.SOUTH;
                }
            }
        }

        long i = MathHelper.getCoordinateRandom(entity.getPos().getX(), entity.getPos().getY(), entity.getPos().getZ());
        Vec3d offsetXZ = new Vec3d(((double)((float)(i >> 16 & 15L) / 15.0F) - 0.5D) * 0.5D, 0.0D, ((double)((float)(i >> 24 & 15L) / 15.0F) - 0.5D) * 0.5D);
        double offsetX = offsetXZ.x;
        double offsetZ = offsetXZ.z;

        //offsetX = 0;
        //offsetZ = 0;

        this.bindTexture(TEXTURE);

        ModelFlowerAristolochia modelFlowerAristolochia = this.modelFlowerAristolochia;

        double scale = 0.05D;
        GlStateManager.enableRescaleNormal();
        GlStateManager.alphaFunc(516, 0.1f);
        GlStateManager.enableBlend();
        GlStateManager.disableCull();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
        GlStateManager.pushMatrix();
        if (facing == EnumFacing.UP) {
            GlStateManager.translate(x + 0.5 + offsetX, y + 1.2, z + 0.5 + offsetZ);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.DOWN) {
            GlStateManager.translate(x + 0.5 + 0.5 + offsetX, y -0.2, z + 0.5 + offsetZ);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.NORTH) {
            GlStateManager.translate(x + 0.5 + offsetX, y - 0.3 + offsetZ, z + 0.55);
            //GlStateManager.rotate(180, 0F, 0F, 1F);
            //GlStateManager.rotate(90, 1F, 0F, 0F);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.EAST) {
            GlStateManager.translate(x + 0.45, y + 1.2 + offsetZ, z + 0.5 + offsetX);
            //GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(90, 0F, 1F, 0F);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.SOUTH) {
            GlStateManager.translate(x + 0.5 + offsetX, y - 0.3 + offsetZ, z + 0.45);
            //GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(180, 1F, 0F, 0F);
            GlStateManager.scale(scale, scale, scale);
        }
        else if (facing == EnumFacing.WEST) {
            GlStateManager.translate(x + 0.55, y - 0.3 + offsetZ, z + 0.5 + offsetX);
            //GlStateManager.rotate(180, 0F, 0F, 1F);
            //GlStateManager.rotate(180, 0F, 0F, 1F);
            GlStateManager.rotate(90, 0F, 1F, 0F);
            GlStateManager.scale(scale, scale, scale);
        }
        modelFlowerAristolochia.renderAll(Minecraft.getMinecraft().player.ticksExisted);

        GlStateManager.popMatrix();
        GlStateManager.disableRescaleNormal();
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
    }
}