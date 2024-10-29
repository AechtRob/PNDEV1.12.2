package net.lepidodendron.util;

import net.lepidodendron.block.BlockEggsWater;
import net.lepidodendron.block.BlockEggsWaterSurface;
import net.lepidodendron.block.BlockRottenLog;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.util.ILayableMoss;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.SoundEvents;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EggLayingConditions {

    public static final PropertyDirection FACING = BlockDirectional.FACING;

    public static void layWaterBottomEggs(EntityPrehistoricFloraAgeableBase entityIn) {
        if ((!entityIn.dropsEggs()) && (!entityIn.laysEggs()) && (entityIn.createPFChild(entityIn) == null)) {
            if (!entityIn.world.isRemote && entityIn.isInWater() && entityIn.isPFAdult() && entityIn.getCanBreed() && entityIn.getLaying() && entityIn.getTicks() > 0
                    && (BlockEggsWater.block.canPlaceBlockAt(entityIn.world, entityIn.getPosition())
                    || BlockEggsWater.block.canPlaceBlockAt(entityIn.world, entityIn.getPosition().down()))
            ) {
                //if (Math.random() > 0.5) {
                entityIn.setTicks(-50); //Flag entityIn as stationary for egg-laying
                //}
            }

            if (!entityIn.world.isRemote && entityIn.isInWater() && entityIn.isPFAdult() && entityIn.getTicks() > -47 && entityIn.getTicks() < 0) {
                //Is stationary for egg-laying:
                //System.err.println("Test2");
                IBlockState eggs = BlockEggsWater.block.getDefaultState();
                if (BlockEggsWater.block.canPlaceBlockAt(entityIn.world, entityIn.getPosition())) {
                    if (!(entityIn.world.isRemote)) {
                        entityIn.world.setBlockState(entityIn.getPosition(), eggs);
                        entityIn.world.setTileEntity(entityIn.getPosition(), new BlockEggsWater.TileEntityCustom());
                        TileEntity te = entityIn.world.getTileEntity(entityIn.getPosition());
                        te.getTileData().setString("creature", entityIn.getEntityId(entityIn));
                        if (entityIn.hasPNVariants() && entityIn.getPNTypeName() != null) {
                            te.getTileData().setString("PNType", entityIn.getPNTypeName());
                        }
                    }
                    entityIn.setLaying(false);
                    entityIn.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (entityIn.world.rand.nextFloat() - entityIn.world.rand.nextFloat()) * 0.2F + 1.0F);
                }
                if (BlockEggsWater.block.canPlaceBlockAt(entityIn.world, entityIn.getPosition().down())) {
                    if (!(entityIn.world.isRemote)) {
                        entityIn.world.setBlockState(entityIn.getPosition().down(), eggs);
                        entityIn.world.setTileEntity(entityIn.getPosition().down(), new BlockEggsWater.TileEntityCustom());
                        TileEntity te = entityIn.world.getTileEntity(entityIn.getPosition().down());
                        te.getTileData().setString("creature", entityIn.getEntityId(entityIn));
                        if (entityIn.hasPNVariants() && entityIn.getPNTypeName() != null) {
                            te.getTileData().setString("PNType", entityIn.getPNTypeName());
                        }
                    }
                    entityIn.setLaying(false);
                    entityIn.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (entityIn.world.rand.nextFloat() - entityIn.world.rand.nextFloat()) * 0.2F + 1.0F);
                }
                entityIn.setTicks(0);
            }
        }
    }

    public static void layWaterBottomEggsNoPause(EntityPrehistoricFloraInsectFlyingBase entityIn) {
        if (!entityIn.world.isRemote && entityIn.laysEggs() && entityIn.getLaying()
        ) {
            IBlockState eggs = BlockEggsWater.block.getDefaultState();
            if (entityIn.isInWater() && entityIn.getCanBreed() && entityIn.getTicks() > 0
                    && (BlockEggsWater.block.canPlaceBlockAt(entityIn.world, entityIn.getPosition()))
            ) {
                entityIn.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (entityIn.world.rand.nextFloat() - entityIn.world.rand.nextFloat()) * 0.2F + 1.0F);
                entityIn.world.setBlockState(entityIn.getPosition(), eggs);
                entityIn.world.setTileEntity(entityIn.getPosition(), new BlockEggsWater.TileEntityCustom());
                TileEntity te = entityIn.world.getTileEntity(entityIn.getPosition());
                te.getTileData().setString("creature", entityIn.getEntityId(entityIn));
                if (entityIn.hasPNVariants() && entityIn.getPNTypeName() != null) {
                    te.getTileData().setString("PNType", entityIn.getPNTypeName());
                }
                entityIn.setLaying(false);
                entityIn.setTicks(0);
            } else {
                if (entityIn.isInWater() && entityIn.getCanBreed() && entityIn.getTicks() > 0
                        && (BlockEggsWater.block.canPlaceBlockAt(entityIn.world, entityIn.getPosition().down()))
                ) {
                    entityIn.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (entityIn.world.rand.nextFloat() - entityIn.world.rand.nextFloat()) * 0.2F + 1.0F);
                    entityIn.world.setBlockState(entityIn.getPosition().down(), eggs);
                    entityIn.world.setTileEntity(entityIn.getPosition().down(), new BlockEggsWater.TileEntityCustom());
                    TileEntity te = entityIn.world.getTileEntity(entityIn.getPosition().down());
                    te.getTileData().setString("creature", entityIn.getEntityId(entityIn));
                    if (entityIn.hasPNVariants() && entityIn.getPNTypeName() != null) {
                        te.getTileData().setString("PNType", entityIn.getPNTypeName());
                    }
                    entityIn.setLaying(false);
                    entityIn.setTicks(0);
                } else {
                    if (BlockEggsWater.block.canPlaceBlockAt(entityIn.world, entityIn.getPosition().down(2))) {
                        entityIn.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (entityIn.world.rand.nextFloat() - entityIn.world.rand.nextFloat()) * 0.2F + 1.0F);
                        entityIn.world.setBlockState(entityIn.getPosition().down(2), eggs);
                        entityIn.world.setTileEntity(entityIn.getPosition().down(2), new BlockEggsWater.TileEntityCustom());
                        TileEntity te = entityIn.world.getTileEntity(entityIn.getPosition().down(2));
                        te.getTileData().setString("creature", entityIn.getEntityId(entityIn));
                        if (entityIn.hasPNVariants() && entityIn.getPNTypeName() != null) {
                            te.getTileData().setString("PNType", entityIn.getPNTypeName());
                        }
                        entityIn.setLaying(false);
                        entityIn.setTicks(0);
                    }
                }
            }
        }
    }
    
    public static void layWaterSurfaceEggs(EntityPrehistoricFloraAgeableBase entityIn) {
        if ((!entityIn.dropsEggs()) && (!entityIn.laysEggs()) && (entityIn.createPFChild(entityIn) == null)) {
            if (!entityIn.world.isRemote && entityIn.isInWater() && entityIn.isPFAdult() && entityIn.getCanBreed() && entityIn.getLaying() && entityIn.getTicks() > 0
                    && (BlockEggsWaterSurface.block.canPlaceBlockAt(entityIn.world, entityIn.getPosition())
                    || BlockEggsWaterSurface.block.canPlaceBlockAt(entityIn.world, entityIn.getPosition().up()))
            ) {
                //if (Math.random() > 0.5) {
                entityIn.setTicks(-50); //Flag this as stationary for egg-laying
                entityIn.setAnimation(entityIn.LAY_ANIMATION);
                //}
            }

            if (!entityIn.world.isRemote && entityIn.isInWater() && entityIn.isPFAdult() && entityIn.getTicks() > -47 && entityIn.getTicks() < 0) {
                //Is stationary for egg-laying:
                //System.err.println("Test2");
                IBlockState eggs = BlockEggsWaterSurface.block.getDefaultState();
                if (BlockEggsWaterSurface.block.canPlaceBlockAt(entityIn.world, entityIn.getPosition())) {
                    if (!(entityIn.world.isRemote)) {
                        entityIn.world.setBlockState(entityIn.getPosition(), eggs);
                        entityIn.world.setTileEntity(entityIn.getPosition(), new BlockEggsWaterSurface.TileEntityCustom());
                        TileEntity te = entityIn.world.getTileEntity(entityIn.getPosition());
                        te.getTileData().setString("creature", entityIn.getEntityId(entityIn));
                        if (entityIn.hasPNVariants() && entityIn.getPNTypeName() != null) {
                            te.getTileData().setString("PNType", entityIn.getPNTypeName());
                        }
                    }
                    entityIn.setLaying(false);
                    entityIn.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (entityIn.world.rand.nextFloat() - entityIn.world.rand.nextFloat()) * 0.2F + 1.0F);
                }
                if (BlockEggsWaterSurface.block.canPlaceBlockAt(entityIn.world, entityIn.getPosition().up())) {
                    if (!(entityIn.world.isRemote)) {
                        entityIn.world.setBlockState(entityIn.getPosition().up(), eggs);
                        entityIn.world.setTileEntity(entityIn.getPosition().up(), new BlockEggsWaterSurface.TileEntityCustom());
                        TileEntity te = entityIn.world.getTileEntity(entityIn.getPosition().up());
                        te.getTileData().setString("creature", entityIn.getEntityId(entityIn));
                        if (entityIn.hasPNVariants() && entityIn.getPNTypeName() != null) {
                            te.getTileData().setString("PNType", entityIn.getPNTypeName());
                        }
                    }
                    entityIn.setLaying(false);
                    entityIn.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (entityIn.world.rand.nextFloat() - entityIn.world.rand.nextFloat()) * 0.2F + 1.0F);
                }
                entityIn.setTicks(0);
            }
        }
    }

    public static void layWaterSurfaceEggsNoPause(EntityPrehistoricFloraInsectFlyingBase entityIn) {
        if (!entityIn.world.isRemote && entityIn.laysEggs() && entityIn.getLaying()
        ) {
            IBlockState eggs = BlockEggsWaterSurface.block.getDefaultState();
            if (BlockEggsWaterSurface.block.canPlaceBlockAt(entityIn.world, entityIn.getPosition())) {
                entityIn.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (entityIn.world.rand.nextFloat() - entityIn.world.rand.nextFloat()) * 0.2F + 1.0F);
                entityIn.world.setBlockState(entityIn.getPosition(), eggs);
                entityIn.world.setTileEntity(entityIn.getPosition(), new BlockEggsWaterSurface.TileEntityCustom());
                TileEntity te = entityIn.world.getTileEntity(entityIn.getPosition());
                te.getTileData().setString("creature", entityIn.getEntityId(entityIn));
                if (entityIn.hasPNVariants() && entityIn.getPNTypeName() != null) {
                    te.getTileData().setString("PNType", entityIn.getPNTypeName());
                }
                entityIn.setLaying(false);
                entityIn.setTicks(0);
            } else {
                if (BlockEggsWaterSurface.block.canPlaceBlockAt(entityIn.world, entityIn.getPosition().down())) {
                    entityIn.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (entityIn.world.rand.nextFloat() - entityIn.world.rand.nextFloat()) * 0.2F + 1.0F);
                    entityIn.world.setBlockState(entityIn.getPosition().down(), eggs);
                    entityIn.world.setTileEntity(entityIn.getPosition().down(), new BlockEggsWaterSurface.TileEntityCustom());
                    TileEntity te = entityIn.world.getTileEntity(entityIn.getPosition().down());
                    te.getTileData().setString("creature", entityIn.getEntityId(entityIn));
                    if (entityIn.hasPNVariants() && entityIn.getPNTypeName() != null) {
                        te.getTileData().setString("PNType", entityIn.getPNTypeName());
                    }
                    entityIn.setLaying(false);
                    entityIn.setTicks(0);
                } else {
                    if (BlockEggsWaterSurface.block.canPlaceBlockAt(entityIn.world, entityIn.getPosition().down(2))) {
                        entityIn.playSound(SoundEvents.ENTITY_CHICKEN_EGG, 1.0F, (entityIn.world.rand.nextFloat() - entityIn.world.rand.nextFloat()) * 0.2F + 1.0F);
                        entityIn.world.setBlockState(entityIn.getPosition().down(2), eggs);
                        entityIn.world.setTileEntity(entityIn.getPosition().down(2), new BlockEggsWaterSurface.TileEntityCustom());
                        TileEntity te = entityIn.world.getTileEntity(entityIn.getPosition().down(2));
                        te.getTileData().setString("creature", entityIn.getEntityId(entityIn));
                        if (entityIn.hasPNVariants() && entityIn.getPNTypeName() != null) {
                            te.getTileData().setString("PNType", entityIn.getPNTypeName());
                        }
                        entityIn.setLaying(false);
                        entityIn.setTicks(0);
                    }
                }
            }
        }
    }

    public static boolean testLayMossAndWood(EntityPrehistoricFloraAgeableBase entityIn, World world, BlockPos pos) {

        if (
                world.getBlockState(pos).getBlock() == BlockRottenLog.block
                        || (world.getBlockState(pos).getBlock() instanceof ILayableMoss)
        ) {
            if (entityIn.noMossEggs() && (world.getBlockState(pos).getBlock() instanceof ILayableMoss)) {
                return false;
            }
            String eggRenderType = new Object() {
                public String getValue(BlockPos pos, String tag) {
                    TileEntity tileEntity = world.getTileEntity(pos);
                    if (tileEntity != null)
                        return tileEntity.getTileData().getString(tag);
                    return "";
                }
            }.getValue(new BlockPos(pos), "egg");
            if (eggRenderType.equals("")) {
                //There is a space, is the orientation correct?
                if (world.getBlockState(pos).getBlock() == BlockRottenLog.block) {
                    EnumFacing facing = EnumFacing.UP;
                    try {
                        facing = world.getBlockState(pos).getValue(FACING);
                    }
                    catch (Exception e) {
                        //Do nothing
                    }
                    BlockFaceShape faceshape = world.getBlockState(pos.down()).getBlockFaceShape(world, pos.down(), EnumFacing.UP);
                    if (!((facing == EnumFacing.NORTH || facing == EnumFacing.SOUTH)
                            && faceshape != BlockFaceShape.SOLID)) {
                        //This is solid for laying:
                        return true;
                    }
                }
                else {
                    //Is it upward-facing?
                    EnumFacing facing = EnumFacing.UP;
                    try {
                        facing = world.getBlockState(pos).getValue(FACING);
                    }
                    catch (Exception e) {
                        //Do nothing
                    }
                    if (facing == EnumFacing.UP) {
                        //This is OK for laying mosses
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
