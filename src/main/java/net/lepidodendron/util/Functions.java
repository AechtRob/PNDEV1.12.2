package net.lepidodendron.util;

import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.block.*;
import net.lepidodendron.block.base.BlockLogPF;
import net.lepidodendron.entity.base.EntityPrehistoricFloraCrawlingFlyingInsectBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraInsectFlyingBase;
import net.lepidodendron.entity.base.EntityPrehistoricFloraLandClimbingFlyingWalkingBase;
import net.lepidodendron.world.biome.cretaceous.BiomeCretaceousEarly;
import net.lepidodendron.world.biome.jurassic.BiomeJurassic;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.init.Blocks;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraftforge.fluids.BlockFluidBase;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import javax.annotation.Nullable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Functions {

    public static int getAdjustedSeaLevel(World world, BlockPos pos) {
        Biome biome = world.getBiome(pos);
        if (biome instanceof BiomeJurassic) {
            if (((BiomeJurassic)biome).getBiomeType() == EnumBiomeTypeJurassic.Desert) {
                return 42;
            }
        }
        if (biome instanceof BiomeCretaceousEarly) {
            if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_subalpine_lakes")
                || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_subalpine_lakes_peaks")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_austro_antarctic_subalpine_lakes_rim_inner")) {
                return 87;
            }
            if (biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_lakes_a")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_lakes_b")
                    || biome.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_lakes_dead")) {
                return 140;
            }
        }
        if (world.provider.getDimension() == LepidodendronConfig.dimPrecambrian) {
            return 110;
        }
        if (world.provider.getDimension() == LepidodendronConfig.dimCambrian) {
            return 86;
        }
        return world.getSeaLevel();
    }

    public static IBlockState getPortalBlockState(int lastDimension) {
        IBlockState portalBlockState = null;
        if (lastDimension != 1) {
            portalBlockState = BlockPortalBlockOverworld.block.getDefaultState();
        }
        if (lastDimension == -1) {
            portalBlockState = Blocks.OBSIDIAN.getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimPrecambrian) {
            portalBlockState = BlockPortalBlockPrecambrian.block.getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimCambrian) {
            portalBlockState = BlockPortalBlockCambrian.block.getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimOrdovician) {
            portalBlockState = BlockPortalBlockOrdovician.block.getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimSilurian) {
            portalBlockState = BlockPortalBlockSilurian.block.getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimDevonian) {
            portalBlockState = BlockPortalBlockDevonian.block.getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimCarboniferous) {
            portalBlockState = BlockPortalBlockCarboniferous.block.getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimPermian) {
            portalBlockState = BlockPortalBlockPermian.block.getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimTriassic) {
            portalBlockState = BlockPortalBlockTriassic.block.getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimJurassic) {
            portalBlockState = BlockPortalBlockJurassic.block.getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimCretaceousEarly) {
            portalBlockState = BlockPortalBlockCretaceousEarly.block.getDefaultState();
        }
        return portalBlockState;
    }

    public static IBlockState getPortalState(int lastDimension) {
        IBlockState portalState = null;
        if (lastDimension != 1) {
            portalState = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("lepidodendron:overworld_portal")).getDefaultState();
        }
        if (lastDimension == -1) {
            portalState = Blocks.PORTAL.getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimPrecambrian) {
            portalState = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("lepidodendron:precambrian_portal")).getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimCambrian) {
            portalState = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("lepidodendron:cambrian_portal")).getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimOrdovician) {
            portalState = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("lepidodendron:ordovician_portal")).getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimSilurian) {
            portalState = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("lepidodendron:silurian_portal")).getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimDevonian) {
            portalState = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("lepidodendron:devonian_portal")).getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimCarboniferous) {
            portalState = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("lepidodendron:carboniferous_portal")).getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimPermian) {
            portalState = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("lepidodendron:permian_portal")).getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimTriassic) {
            portalState = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("lepidodendron:triassic_portal")).getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimJurassic) {
            portalState = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("lepidodendron:jurassic_portal")).getDefaultState();
        }
        if (lastDimension == LepidodendronConfig.dimCretaceousEarly) {
            portalState = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("lepidodendron:cretaceous_early_portal")).getDefaultState();
        }
        return portalState;
    }

    public static boolean isWater(World world, BlockPos pos) {
        IBlockState state = world.getBlockState(pos);
        Block block = state.getBlock();
        return ((block instanceof BlockFluidBase || block instanceof BlockLiquid)
           && state.getMaterial() == Material.WATER
        );
    }

    public static Vec3d getEntityCentre(Entity entity) {
        double entityX = entity.getEntityBoundingBox().minX + ((entity.getEntityBoundingBox().maxX - entity.getEntityBoundingBox().minX)/2.0D);
        double entityZ = entity.getEntityBoundingBox().minZ + ((entity.getEntityBoundingBox().maxZ - entity.getEntityBoundingBox().minZ)/2.0D);
        return new Vec3d(entityX, entity.getEntityBoundingBox().minY, entityZ);
    }

    public static BlockPos getEntityBlockPos(Entity entity) {
        return new BlockPos(getEntityCentre(entity));
    }

    /** A function which doesn't use an iterator, to avoid concurrent modification bugs:
     *
     * @param worldIn
     * @param clazz
     * @param aabb
     * @param filter
     * @return
     * @param <T>
     */
    public static <T extends Entity> ObjectList<T> getEntitiesWithinAABBPN(World worldIn, Class <? extends T > clazz, AxisAlignedBB aabb, @Nullable Predicate<? super T > filter)
    {
        int j2 = MathHelper.floor((aabb.minX - World.MAX_ENTITY_RADIUS) / 16.0D);
        int k2 = MathHelper.ceil((aabb.maxX + World.MAX_ENTITY_RADIUS) / 16.0D);
        int l2 = MathHelper.floor((aabb.minZ - World.MAX_ENTITY_RADIUS) / 16.0D);
        int i3 = MathHelper.ceil((aabb.maxZ + World.MAX_ENTITY_RADIUS) / 16.0D);
        ObjectList<T> list = new ObjectArrayList<>();


        for (int j3 = j2; j3 < k2; ++j3)
        {
            for (int k3 = l2; k3 < i3; ++k3)
            {
                if (worldIn.isBlockLoaded(new BlockPos(j3*16, 0, k3*16), true))
                {
                    getEntitiesOfTypeWithinAABBPN(worldIn.getChunk(j3, k3), clazz, aabb, list, filter);
                }
            }
        }

        return list;
    }

    public static <T extends Entity> void getEntitiesOfTypeWithinAABBPN(Chunk chunk, Class <? extends T > entityClass, AxisAlignedBB aabb, ObjectList<T> listToFill, Predicate <? super T > filter)
    {
        int i = MathHelper.floor((aabb.minY - World.MAX_ENTITY_RADIUS) / 16.0D);
        int j = MathHelper.floor((aabb.maxY + World.MAX_ENTITY_RADIUS) / 16.0D);
        i = MathHelper.clamp(i, 0, chunk.getEntityLists().length - 1);
        j = MathHelper.clamp(j, 0, chunk.getEntityLists().length - 1);

        for (int k = i; k <= j; ++k) {
            if (chunk.getEntityLists()[k].getByClass(entityClass) != null) {
                List<T> listEntity = ImmutableList.copyOf(chunk.getEntityLists()[k].getByClass(entityClass));
                for (int ii = 0; ii < listEntity.size(); ii++) {
                    T t = listEntity.get(ii);
                    if (t.getEntityBoundingBox().intersects(aabb) && (filter == null || filter.apply(t))) {
                        listToFill.add(t);
                    }
                }
            }
        }
    }

    public static void setBlockStateAndCheckForDoublePlant(World worldIn, BlockPos pos, IBlockState state, int flags) {
        IBlockState currentState = worldIn.getBlockState(pos);
        Block currentBlock = currentState.getBlock();

        if (currentBlock instanceof BlockDoublePlant) {
            BlockPos upPos = pos.up();
            BlockPos downPos = pos.down();
            IBlockState upState = worldIn.getBlockState(upPos);
            IBlockState downState = worldIn.getBlockState(downPos);

            if (currentState.getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.LOWER) {
                if (upState.getBlock() instanceof BlockDoublePlant && upState.getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.UPPER) {
                    worldIn.setBlockToAir(upPos);
                }
            } else {
                if (downState.getBlock() instanceof BlockDoublePlant && downState.getValue(BlockDoublePlant.HALF) == BlockDoublePlant.EnumBlockHalf.LOWER) {
                    worldIn.setBlockToAir(downPos);
                }
            }
        }

        if (state.causesSuffocation() && state.getMaterial() != Material.WOOD) { //If we are about to place a block that could kill an entity here (but which isn't a tree):
            ObjectList<Entity> getEntities = getEntitiesWithinAABBPN(worldIn, Entity.class, new AxisAlignedBB(pos), EntitySelectors.NOT_SPECTATING);
            if (!getEntities.isEmpty()) {
                int ascendor = 0;
                boolean isMoved = false;
                //Are we replacing water, and is the block above us up to 8 high a suitable water?
                if (worldIn.getBlockState(pos).getMaterial() == Material.WATER) {
                    for (int n = 1; n < 8; n++) {
                        if (worldIn.getBlockState(pos.up(n)).getMaterial() == Material.WATER) {
                            //Move the entity to here:
                            isMoved = true;
                            ascendor = n;
                            break;
                        }
                    }
                }
                else { //Was not water, so check for something that isn't water and which is safe
                    for (int n = 1; n < 8; n++) {
                        if ((!worldIn.getBlockState(pos.up(n)).causesSuffocation()) && worldIn.getBlockState(pos.up(n)).getMaterial() != Material.WATER) {
                            //Move the entity to here:
                            isMoved = true;
                            ascendor = n;
                            break;
                        }
                    }
                }
                for (Entity e : getEntities) {
                    if (!isMoved) {
                        e.setDead(); //Dont entomb entities!
                    } else {
                        e.setPosition(e.posX, pos.up(ascendor).getY(), e.posZ);
                    }
                }
            }
        }

        //Finally, set the blockstate:
        worldIn.setBlockState(pos, state, flags);
    }

    public static void setBlockStateAndCheckForDoublePlant(World worldIn, BlockPos pos, IBlockState state) {
        setBlockStateAndCheckForDoublePlant(worldIn, pos, state, 3);
    }

    public static boolean decoLoaded() {
        if (Loader.isModLoaded("prehistoricnaturedeco")) {
            return true;
        }
        return false;
    }

    public static String convertFromDecimalToBaseX(int num, int newBase) throws IllegalArgumentException {
        if ((newBase < 2 || newBase > 10) && newBase != 16) {
            throw new IllegalArgumentException("New base must be from 2 - 10 or 16");
        }
        String result = "";
        int remainder;
        while (num > 0) {
            remainder = num % newBase;
            if (newBase == 16) {
                if (remainder == 10) {
                    result += 'A';
                } else if (remainder == 11) {
                    result += 'B';
                } else if (remainder == 12) {
                    result += 'C';
                } else if (remainder == 13) {
                    result += 'D';
                } else if (remainder == 14) {
                    result += 'E';
                } else if (remainder == 15) {
                    result += 'F';
                } else {
                    result += remainder;
                }
            } else {
                result += remainder;
            }
            num /= newBase;
        }
        return new StringBuffer(result).reverse().toString();
    }



    public static void restoreLogs(World worldIn, BlockPos position) {
        IBlockState state = null;
        if (worldIn.getBlockState(position.up()).getBlock() instanceof BlockLogPF) {
            IBlockState blocklog = worldIn.getBlockState(position.up());
            if (blocklog.getValue(BlockLogPF.FACING) == EnumFacing.NORTH) {
                state = blocklog.withProperty(BlockLogPF.FACING, EnumFacing.NORTH);
            }
        }
        if (worldIn.getBlockState(position.up()).getBlock() == BlockCycasLog.block) {
            state = BlockCycasLog.block.getDefaultState();
        }
        if (worldIn.getBlockState(position.up()).getBlock() == BlockCycadeoideaLog.block) {
            state = BlockCycadeoideaLog.block.getDefaultState();
        }
        if (state != null && state.getBlock() instanceof BlockLogPF) {
            worldIn.setBlockState(position, state, 16);
            if (!worldIn.getBlockState(position.down()).getMaterial().blocksMovement()) {
                worldIn.setBlockState(position.down(), state, 16);
            }
            if (!worldIn.getBlockState(position.down(2)).getMaterial().blocksMovement()) {
                worldIn.setBlockState(position.down(2), state, 16);
            }
            if (!worldIn.getBlockState(position.down(3)).getMaterial().blocksMovement()) {
                worldIn.setBlockState(position.down(3), state, 16);
            }
            if (!worldIn.getBlockState(position.down(4)).getMaterial().blocksMovement()) {
                worldIn.setBlockState(position.down(4), state, 16);
            }
        }
    }

    @Nullable
    public static Method testAndGetMethod(Class clazz, String methodname, Class[] params) {
        Method methodToFind = null;

        try {
            methodToFind = clazz.getMethod(methodname, params);
        } catch (SecurityException | NoSuchMethodException var5) {
        }

        return methodToFind;
    }

    public static ArrayList<Integer> dimAllowed(String creatureID) {
        //Determine these from the fossil drops configs:
        ArrayList<Integer> tmpArray = new ArrayList<Integer>();

        if (Arrays.stream(AcidBathOutputMobs.getPrecambrianCleanedFossilsMobs()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(1);
        }
        else if (Arrays.stream(AcidBathOutputStatics.getPrecambrianCleanedFossilsStatics()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(1);
        }
        else if (Arrays.stream(AcidBathOutputPlants.getPrecambrianCleanedFossilsPlants()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(1);
        }

        if (Arrays.stream(AcidBathOutputMobs.getCambrianCleanedFossilsMobs()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(2);
        }
        else if (Arrays.stream(AcidBathOutputStatics.getCambrianCleanedFossilsStatics()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(2);
        }
        else if (Arrays.stream(AcidBathOutputPlants.getCambrianCleanedFossilsPlants()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(2);
        }

        if (Arrays.stream(AcidBathOutputMobs.getOrdovicianCleanedFossilsMobs()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(3);
        }
        else if (Arrays.stream(AcidBathOutputStatics.getOrdovicianCleanedFossilsStatics()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(3);
        }
        else if (Arrays.stream(AcidBathOutputPlants.getOrdovicianCleanedFossilsPlants()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(3);
        }

        if (Arrays.stream(AcidBathOutputMobs.getSilurianCleanedFossilsMobs()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(4);
        }
        else if (Arrays.stream(AcidBathOutputStatics.getSilurianCleanedFossilsStatics()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(4);
        }
        else if (Arrays.stream(AcidBathOutputPlants.getSilurianCleanedFossilsPlants()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(4);
        }

        if (Arrays.stream(AcidBathOutputMobs.getDevonianCleanedFossilsMobs()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(5);
        }
        else if (Arrays.stream(AcidBathOutputStatics.getDevonianCleanedFossilsStatics()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(5);
        }
        else if (Arrays.stream(AcidBathOutputPlants.getDevonianCleanedFossilsPlants()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(5);
        }

        if (Arrays.stream(AcidBathOutputMobs.getCarboniferousCleanedFossilsMobs()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(6);
        }
        else if (Arrays.stream(AcidBathOutputStatics.getCarboniferousCleanedFossilsStatics()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(6);
        }
        else if (Arrays.stream(AcidBathOutputPlants.getCarboniferousCleanedFossilsPlants()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(6);
        }

        if (Arrays.stream(AcidBathOutputMobs.getPermianCleanedFossilsMobs()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(7);
        }
        else if (Arrays.stream(AcidBathOutputStatics.getPermianCleanedFossilsStatics()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(7);
        }
        else if (Arrays.stream(AcidBathOutputPlants.getPermianCleanedFossilsPlants()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(7);
        }

        if (Arrays.stream(AcidBathOutputMobs.getTriassicCleanedFossilsMobs()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(8);
        }
        else if (Arrays.stream(AcidBathOutputStatics.getTriassicCleanedFossilsStatics()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(8);
        }
        else if (Arrays.stream(AcidBathOutputPlants.getTriassicCleanedFossilsPlants()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(8);
        }

        if (Arrays.stream(AcidBathOutputMobs.getJurassicCleanedFossilsMobs()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(9);
        }
        else if (Arrays.stream(AcidBathOutputStatics.getJurassicCleanedFossilsStatics()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(9);
        }
        else if (Arrays.stream(AcidBathOutputPlants.getJurassicCleanedFossilsPlants()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(9);
        }

        if (Arrays.stream(AcidBathOutputMobs.getCretaceousCleanedFossilsMobs()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(10);
        }
        else if (Arrays.stream(AcidBathOutputStatics.getCretaceousCleanedFossilsStatics()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(10);
        }
        else if (Arrays.stream(AcidBathOutputPlants.getCretaceousCleanedFossilsPlants()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(10);
        }

        if (Arrays.stream(AcidBathOutputMobs.getPaleogeneCleanedFossilsMobs()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(11);
        }
        else if (Arrays.stream(AcidBathOutputStatics.getPaleogeneCleanedFossilsStatics()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(11);
        }
        else if (Arrays.stream(AcidBathOutputPlants.getPaleogeneCleanedFossilsPlants()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(11);
        }

        if (Arrays.stream(AcidBathOutputMobs.getNeogeneCleanedFossilsMobs()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(12);
        }
        else if (Arrays.stream(AcidBathOutputStatics.getNeogeneCleanedFossilsStatics()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(12);
        }
        else if (Arrays.stream(AcidBathOutputPlants.getNeogeneCleanedFossilsPlants()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(12);
        }

        if (Arrays.stream(AcidBathOutputMobs.getPleistoceneCleanedFossilsMobs()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(13);
        }
        else if (Arrays.stream(AcidBathOutputStatics.getPleistoceneCleanedFossilsStatics()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(13);
        }
        else if (Arrays.stream(AcidBathOutputPlants.getPleistoceneCleanedFossilsPlants()).anyMatch(n
                -> n.equalsIgnoreCase(creatureID))) {
            tmpArray.add(13);
        }

        return tmpArray;
    }

    @Nullable
    public static SoundEvent getDimensionLivingSound(int dim, World worldIn) {
        if (worldIn == null) {
            return null;
        }
        SoundEvent soundEventOut = null;
        for (int i = 0; i <= 2; i++) {
            if (soundEventOut != null) {
                break;
            }
            String resourceLocation = AcidBathOutputMobs.resLocMobs(dim);
            if (resourceLocation != null && !resourceLocation.equalsIgnoreCase("")) {
                if (resourceLocation.contains("@")) {
                    resourceLocation = resourceLocation.substring(0, resourceLocation.indexOf("@"));
                }
                EntityEntry ee = ForgeRegistries.ENTITIES.getValue(new ResourceLocation(resourceLocation));
                if (ee == null) {
                    return null;
                }
                EntityLiving entity = (EntityLiving) ee.newInstance(worldIn);
                if (entity != null) {
                    try { //Uggggh, reflection :(
                        Method method = entity.getClass().getDeclaredMethod("func_184639_G"); //"getAmbientSound"
                        method.setAccessible(true);
                        soundEventOut = (SoundEvent) method.invoke(entity);
                    } catch (Exception err1) {
                        try { //Uggggh, reflection :(
                            Method method = entity.getClass().getDeclaredMethod("getAmbientSound");
                            method.setAccessible(true);
                            soundEventOut = (SoundEvent) method.invoke(entity);
                        } catch (Exception err2) {
                        }
                    }
                    if (soundEventOut == null) {
                        if (entity instanceof EntityPrehistoricFloraInsectFlyingBase) {
                            soundEventOut = ((EntityPrehistoricFloraInsectFlyingBase) entity).getFlightSound();
                        } else if (entity instanceof EntityPrehistoricFloraLandClimbingFlyingWalkingBase) {
                            soundEventOut = ((EntityPrehistoricFloraLandClimbingFlyingWalkingBase) entity).getFlightSound();
                        } else if (entity instanceof EntityPrehistoricFloraCrawlingFlyingInsectBase) {
                            soundEventOut = ((EntityPrehistoricFloraCrawlingFlyingInsectBase) entity).getFlightSound();
                        }
                    }
                    entity.setDead();
                }
            }
        }
        return soundEventOut;
    }

    public static boolean shouldGenerateInDimension(int id, int[] dims) {
        int[] var2 = dims;
        int var3 = dims.length;
        for (int var4 = 0; var4 < var3; ++var4) {
            int dim = var2[var4];
            if (dim == id) {
                return true;
            }
        }
        return false;
    }

    public static boolean matchBiome(Biome biome, String[] biomesList) {

        //String regName = biome.getRegistryName().toString();

        String[] var2 = biomesList;
        int var3 = biomesList.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            String checkBiome = var2[var4];
            if (!checkBiome.contains(":")) {
                //System.err.println("modid test: " + biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":") - 1));
                if (checkBiome.equalsIgnoreCase(
                        biome.getRegistryName().toString().substring(0, biome.getRegistryName().toString().indexOf(":"))
                )) {
                    return true;
                }
            }
            if (checkBiome.equalsIgnoreCase(biome.getRegistryName().toString())) {
                return true;
            }
        }

        return false;
    }

}
