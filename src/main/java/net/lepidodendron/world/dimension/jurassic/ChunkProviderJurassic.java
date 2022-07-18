package net.lepidodendron.world.dimension.jurassic;

import net.lepidodendron.block.*;
import net.lepidodendron.world.biome.ChunkGenSpawner;
import net.lepidodendron.world.biome.jurassic.*;
import net.lepidodendron.world.gen.WorldGenJurassicVolcanos;
import net.lepidodendron.world.gen.WorldGenPrehistoricLakes;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.*;

import java.util.List;
import java.util.Random;

public class ChunkProviderJurassic implements IChunkGenerator {
    public static final IBlockState STONE = Blocks.STONE.getStateFromMeta(0);
    //public static final IBlockState STONE2 = Blocks.STONE.getStateFromMeta(0);
    public static final IBlockState LAVA = BlockLavaRock.block.getDefaultState();
    //public static final IBlockState FLUID = Blocks.FLOWING_WATER.getDefaultState();

    public static final IBlockState FLUID = Blocks.WATER.getDefaultState();

    public static final IBlockState AIR = Blocks.AIR.getDefaultState();
    public static final IBlockState BEDROCK = Blocks.BEDROCK.getDefaultState();
    public static final int SEALEVEL = 63;
    public final Random random;
    private NoiseGeneratorOctaves perlin1;
    private NoiseGeneratorOctaves perlin2;
    private NoiseGeneratorOctaves perlin;
    private NoiseGeneratorPerlin height;
    private NoiseGeneratorOctaves depth;
    public final World world;
    public final WorldType terrainType;
    public final MapGenBase caveGenerator;
    public final MapGenBase ravineGenerator;
    public Biome[] biomesForGeneration;
    public double[] heightMap;
    public double[] depthbuff = new double[256];
    public double[] noiseRegMain;
    public double[] limitRegMin;
    public double[] limitRegMax;
    public double[] depthReg;
    public float[] biomeWeights;

    public ChunkProviderJurassic(World worldIn, long seed) {
        worldIn.setSeaLevel(SEALEVEL);
        caveGenerator = new MapGenCaves() {
            @Override
            protected boolean canReplaceBlock(IBlockState a, IBlockState b) {
                if (a.getBlock() == STONE.getBlock())
                    return true;
                return super.canReplaceBlock(a, b);
            }
        };
        ravineGenerator = new MapGenRavine() {
            @Override
            protected void digBlock(ChunkPrimer data, int x, int y, int z, int chunkX, int chunkZ, boolean foundTop) {
                Biome biome = world.getBiome(new BlockPos(x + chunkX * 16, 0, z + chunkZ * 16));
                if (biome == BiomeJurassicBeachBlack.biome || biome == BiomeJurassicBeach.biome
                    || biome == BiomeJurassicMudflats.biome || biome == BiomeJurassicMudflatsHelper.biome
                    || biome == BiomeJurassicRiver.biome || biome == BiomeJurassicRiverbank.biome
                    || biome == BiomeJurassicSandbanks.biome || biome == BiomeJurassicSandbanksRaised.biome) {return;}
                IBlockState state = data.getBlockState(x, y, z);
                if (state.getBlock() == STONE.getBlock() || state.getBlock() == biome.topBlock.getBlock()
                        || state.getBlock() == biome.fillerBlock.getBlock()) {
                    if (y - 1 < 10) {
                        data.setBlockState(x, y, z, FLOWING_LAVA);
                    }
                    else {
                        data.setBlockState(x, y, z, AIR);
                        if (foundTop && data.getBlockState(x, y - 1, z).getBlock() == biome.fillerBlock.getBlock()) {
                            data.setBlockState(x, y - 1, z, biome.topBlock.getBlock().getDefaultState());
                        }
                    }
                }
            }
        };
        this.world = worldIn;
        this.terrainType = worldIn.getWorldInfo().getTerrainType();
        this.random = new Random(seed);
        this.perlin1 = new NoiseGeneratorOctaves(this.random, 16);
        this.perlin2 = new NoiseGeneratorOctaves(this.random, 16);
        this.perlin = new NoiseGeneratorOctaves(this.random, 8);
        this.height = new NoiseGeneratorPerlin(this.random, 4);
        this.depth = new NoiseGeneratorOctaves(this.random, 16);
        this.heightMap = new double[825];
        this.biomeWeights = new float[25];
        for (int i = -2; i <= 2; i++)
            for (int j = -2; j <= 2; j++)
                this.biomeWeights[i + 2 + (j + 2) * 5] = 10 / MathHelper.sqrt((float) (i * i + j * j) + 0.2f);
    }

    @Override
    public Chunk generateChunk(int x, int z) {
        this.random.setSeed((long) x * 535358712L + (long) z * 347539041L);
        ChunkPrimer chunkprimer = new ChunkPrimer();
        this.setBlocksInChunk(x, z, chunkprimer);
        //this.biomesForGeneration = this.world.getBiomeProvider().getBiomesForGeneration(this.biomesForGeneration, x * 16, z * 16, 16, 16);
        this.biomesForGeneration = this.world.getBiomeProvider().getBiomes(this.biomesForGeneration, x * 16, z * 16, 16, 16);
        this.replaceBiomeBlocks(x, z, chunkprimer, this.biomesForGeneration);
        this.caveGenerator.generate(this.world, x, z, chunkprimer);
        if (this.world.getBiome(new BlockPos (x, 0, z)) != BiomeJurassicMudflats.biome
            && this.world.getBiome(new BlockPos (x, 0, z)) != BiomeJurassicMudflatsHelper.biome
            && this.world.getBiome(new BlockPos (x, 0, z)) != BiomeJurassicSandbanks.biome) {
            this.ravineGenerator.generate(this.world, x, z, chunkprimer);
        }
        Chunk chunk = new Chunk(this.world, chunkprimer, x, z);
        byte[] abyte = chunk.getBiomeArray();
        for (int i = 0; i < abyte.length; ++i)
            abyte[i] = (byte) Biome.getIdForBiome(this.biomesForGeneration[i]);
        chunk.generateSkylightMap();
        return chunk;
    }

    @Override
    public void populate(int x, int z) {
        BlockFalling.fallInstantly = true;
        int i = x * 16;
        int j = z * 16;
        BlockPos blockpos = new BlockPos(i, 0, j);
        Biome biome = this.world.getBiome(blockpos.add(16, 0, 16));
        this.random.setSeed(this.world.getSeed());
        long k = this.random.nextLong() / 2 * 2 + 1;
        long l = this.random.nextLong() / 2 * 2 + 1;
        this.random.setSeed((long) x * k + (long) z * l ^ this.world.getSeed());
        net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(true, this, this.world, this.random, x, z, false);

        int chanceLake = 4;
        if (world.getBiome(new BlockPos(i, world.getSeaLevel(), j)) == BiomeJurassicSouthernTaigaHills.biome
                || world.getBiome(new BlockPos(i, world.getSeaLevel(), j)) == BiomeJurassicSouthernTaiga.biome) {
            chanceLake = 8;
        }

        if (this.random.nextInt(chanceLake) == 0
                && world.getBiome(new BlockPos(i, world.getSeaLevel(), j)) != BiomeJurassicOceanShore.biome
                && world.getBiome(new BlockPos(i, world.getSeaLevel(), j)) != BiomeJurassicBoulders.biome)
            if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.random, x, z, false,
                    net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAKE)) {
                int i1 = this.random.nextInt(16) + 8;
                int j1 = this.random.nextInt(256);
                int k1 = this.random.nextInt(16) + 8;
                (new WorldGenPrehistoricLakes(FLUID.getBlock())).generate(this.world, this.random, blockpos.add(i1, j1, k1));
            }

        if (this.random.nextInt(350) == 0 &&
                (world.getBiome(new BlockPos(i, world.getSeaLevel(), j)) == BiomeJurassicSouthernTaigaHills.biome
                        || world.getBiome(new BlockPos(i, world.getSeaLevel(), j)) == BiomeJurassicSouthernTaiga.biome)
            )
            if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.random, x, z, false,
                    net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.LAKE)) {
                int i1 = this.random.nextInt(16) + 8;
                int j1 = this.random.nextInt(256);
                int k1 = this.random.nextInt(16) + 8;
                new WorldGenJurassicVolcanos().generate(this.world, this.random, blockpos.add(i1, j1, k1));
            }


        net.minecraftforge.common.MinecraftForge.EVENT_BUS
                .post(new net.minecraftforge.event.terraingen.DecorateBiomeEvent.Pre(this.world, this.random, blockpos));
        biome.decorate(this.world, this.random, new BlockPos(i, 0, j));
        net.minecraftforge.common.MinecraftForge.EVENT_BUS
                .post(new net.minecraftforge.event.terraingen.DecorateBiomeEvent.Post(this.world, this.random, blockpos));

        if (net.minecraftforge.event.terraingen.TerrainGen.populate(this, this.world, this.random, x, z, false,
                net.minecraftforge.event.terraingen.PopulateChunkEvent.Populate.EventType.ANIMALS)) {
            ChunkGenSpawner.executeProcedure(false, this.world, new BlockPos(i, 0, j), this.random, null, true);
        }

        net.minecraftforge.event.ForgeEventFactory.onChunkPopulate(false, this, this.world, this.random, x, z, false);
        BlockFalling.fallInstantly = false;
    }

    @Override
    public List<Biome.SpawnListEntry> getPossibleCreatures(EnumCreatureType creatureType, BlockPos pos) {
        return this.world.getBiome(pos).getSpawnableList(creatureType);
    }

    @Override
    public void recreateStructures(Chunk chunkIn, int x, int z) {
    }

    @Override
    public boolean isInsideStructure(World worldIn, String structureName, BlockPos pos) {
        return false;
    }

    @Override
    public BlockPos getNearestStructurePos(World worldIn, String structureName, BlockPos position, boolean findUnexplored) {
        return null;
    }

    @Override
    public boolean generateStructures(Chunk chunkIn, int x, int z) {
        return false;
    }

    public void setBlocksInChunk(int x, int z, ChunkPrimer primer) {
        this.biomesForGeneration = this.world.getBiomeProvider().getBiomesForGeneration(this.biomesForGeneration, x * 4 - 2, z * 4 - 2, 10, 10);
        this.generateHeightmap(x * 4, 0, z * 4);
        for (int i = 0; i < 4; ++i) {
            int j = i * 5;
            int k = (i + 1) * 5;
            for (int l = 0; l < 4; ++l) {
                int i1 = (j + l) * 33;
                int j1 = (j + l + 1) * 33;
                int k1 = (k + l) * 33;
                int l1 = (k + l + 1) * 33;
                for (int i2 = 0; i2 < 32; ++i2) {
                    double d0 = 0.125D;
                    double d1 = this.heightMap[i1 + i2];
                    double d2 = this.heightMap[j1 + i2];
                    double d3 = this.heightMap[k1 + i2];
                    double d4 = this.heightMap[l1 + i2];
                    double d5 = (this.heightMap[i1 + i2 + 1] - d1) * 0.125D;
                    double d6 = (this.heightMap[j1 + i2 + 1] - d2) * 0.125D;
                    double d7 = (this.heightMap[k1 + i2 + 1] - d3) * 0.125D;
                    double d8 = (this.heightMap[l1 + i2 + 1] - d4) * 0.125D;
                    for (int j2 = 0; j2 < 8; ++j2) {
                        double d9 = 0.25D;
                        double d10 = d1;
                        double d11 = d2;
                        double d12 = (d3 - d1) * 0.25D;
                        double d13 = (d4 - d2) * 0.25D;
                        for (int k2 = 0; k2 < 4; ++k2) {
                            double d14 = 0.25D;
                            double d16 = (d11 - d10) * 0.25D;
                            double lvt_45_1_ = d10 - d16;
                            for (int l2 = 0; l2 < 4; ++l2) {
                                if ((lvt_45_1_ += d16) > 0.0D) {
                                    primer.setBlockState(i * 4 + k2, i2 * 8 + j2, l * 4 + l2, STONE);
                                } else if (i2 * 8 + j2 < SEALEVEL) {
                                    primer.setBlockState(i * 4 + k2, i2 * 8 + j2, l * 4 + l2, FLUID);
                                }
                            }
                            d10 += d12;
                            d11 += d13;
                        }
                        d1 += d5;
                        d2 += d6;
                        d3 += d7;
                        d4 += d8;
                    }
                }
            }
        }
    }

    public void generateHeightmap(int p_185978_1_, int p_185978_2_, int p_185978_3_) {
        this.depthReg = this.depth.generateNoiseOctaves(this.depthReg, p_185978_1_, p_185978_3_, 5, 5, (double) 200, (double) 200, (double) 0.5f);
        float f = 684.412f;
        float f1 = 684.412f;
        this.noiseRegMain = this.perlin.generateNoiseOctaves(this.noiseRegMain, p_185978_1_, p_185978_2_, p_185978_3_, 5, 33, 5,
                (double) (f / 80), (double) (f1 / 160), (double) (f / 80));
        this.limitRegMin = this.perlin1.generateNoiseOctaves(this.limitRegMin, p_185978_1_, p_185978_2_, p_185978_3_, 5, 33, 5, (double) f,
                (double) f1, (double) f);
        this.limitRegMax = this.perlin2.generateNoiseOctaves(this.limitRegMax, p_185978_1_, p_185978_2_, p_185978_3_, 5, 33, 5, (double) f,
                (double) f1, (double) f);
        int i = 0;
        int j = 0;
        for (int k = 0; k < 5; ++k) {
            for (int l = 0; l < 5; ++l) {
                float f2 = 0.0F;
                float f3 = 0.0F;
                float f4 = 0.0F;
                int i1 = 2;
                Biome biome = this.biomesForGeneration[k + 2 + (l + 2) * 10];
                for (int j1 = -2; j1 <= 2; ++j1) {
                    for (int k1 = -2; k1 <= 2; ++k1) {
                        Biome biome1 = this.biomesForGeneration[k + j1 + 2 + (l + k1 + 2) * 10];
                        float f5 = 0 + biome1.getBaseHeight() * 1;
                        float f6 = 0 + biome1.getHeightVariation() * 1;
                        //if (this.terrainType == WorldType.AMPLIFIED && f5 > 0.0F) {
                        //    f5 = 1.0F + f5 * 2.0F;
                        //    f6 = 1.0F + f6 * 4.0F;
                        //}
                        float f7 = this.biomeWeights[j1 + 2 + (k1 + 2) * 5] / (f5 + 2.0F);
                        if (biome1.getBaseHeight() > biome.getBaseHeight()) {
                            f7 /= 2.0F;
                        }
                        f2 += f6 * f7;
                        f3 += f5 * f7;
                        f4 += f7;
                    }
                }
                f2 = f2 / f4;
                f3 = f3 / f4;
                f2 = f2 * 0.9F + 0.1F;
                f3 = (f3 * 4.0F - 1.0F) / 8.0F;
                double d7 = this.depthReg[j] / 8000.0D;
                if (d7 < 0.0D) {
                    d7 = -d7 * 0.3D;
                }
                d7 = d7 * 3.0D - 2.0D;
                if (d7 < 0.0D) {
                    d7 = d7 / 2.0D;
                    if (d7 < -1.0D) {
                        d7 = -1.0D;
                    }
                    d7 = d7 / 1.4D;
                    d7 = d7 / 2.0D;
                } else {
                    if (d7 > 1.0D) {
                        d7 = 1.0D;
                    }
                    d7 = d7 / 8.0D;
                }
                ++j;
                double d8 = (double) f3;
                double d9 = (double) f2;
                d8 = d8 + d7 * 0.2D;
                d8 = d8 * (double) 8.5f / 8.0D;
                double d0 = (double) 8.5f + d8 * 4.0D;
                for (int l1 = 0; l1 < 33; ++l1) {
                    double d1 = ((double) l1 - d0) * (double) 12 * 128.0D / 256.0D / d9;
                    if (d1 < 0.0D) {
                        d1 *= 4.0D;
                    }
                    double d2 = this.limitRegMin[i] / (double) 512;
                    double d3 = this.limitRegMax[i] / (double) 512;
                    double d4 = (this.noiseRegMain[i] / 10.0D + 1.0D) / 2.0D;
                    double d5 = MathHelper.clampedLerp(d2, d3, d4) - d1;
                    if (l1 > 29) {
                        double d6 = (double) ((float) (l1 - 29) / 3.0F);
                        d5 = d5 * (1.0D - d6) + -10.0D * d6;
                    }
                    this.heightMap[i] = d5;
                    ++i;
                }
            }
        }
    }

    public void replaceBiomeBlocks(int x, int z, ChunkPrimer primer, Biome[] biomesIn) {
        this.depthbuff = this.height.getRegion(this.depthbuff, (double) (x * 16), (double) (z * 16), 16, 16, 0.0625, 0.0625, 1);
        for (int i = 0; i < 16; i++)
            for (int j = 0; j < 16; j++)
                generateBiomeTerrain(this.world, this.random, primer, x * 16 + i, z * 16 + j, this.depthbuff[j + i * 16], biomesIn[j + i * 16]);
    }

    /**
     * Given x, z coordinates, we count down all the y positions starting at 255 and
     * working our way down. When we hit a non-air block, we replace it with
     * biome.topBlock (default grass, descendants may set otherwise), and then a
     * relatively shallow layer of blocks of type biome.fillerBlock (default dirt).
     * A random set of blocks below y == 5 (but always including y == 0) is replaced
     * with bedrock. If we don't hit non-air until somewhat below sea level, we top
     * with gravel and fill down with stone. If biome.fillerBlock is red sand, we
     * replace some of that with red sandstone.
     */

    public final void generateBiomeTerrain(World worldIn, Random rand, ChunkPrimer chunkPrimerIn, int x, int z, double noiseVal, Biome biome) {
        int i = SEALEVEL;
        IBlockState iblockstate = biome.topBlock;
        IBlockState iblockstate1 = biome.fillerBlock;
        int j = -1;
        int k = (int) (noiseVal / 3.0D + 3.0D + rand.nextDouble() * 0.25D);
        int l = x & 15;
        int i1 = z & 15;
        BlockPos.MutableBlockPos blockpos$mutableblockpos = new BlockPos.MutableBlockPos();
        for (int j1 = 255; j1 >= 0; --j1) {
            if (j1 <= rand.nextInt(5)) {
                chunkPrimerIn.setBlockState(i1, j1, l, BEDROCK);
            } else {
                IBlockState iblockstate2 = chunkPrimerIn.getBlockState(i1, j1, l);
                if (iblockstate2.getMaterial() == Material.AIR) {
                    j = -1;
                } else if (iblockstate2.getBlock() == STONE.getBlock()) {
                    if (j == -1) {
                        if (k <= 0) {
                            iblockstate = AIR;
                            iblockstate1 = STONE;
                            //} else if (j1 >= i - 4 && j1 <= i + 1) {
                        } else if (j1 <= i - 1) {
                            iblockstate = biome.topBlock;
                            //iblockstate1 = biome.fillerBlock;
                            if (Math.random() > 0.85) {
                                if (Math.random() > 0.3) {
                                    if (biome == BiomeJurassicSouthernTaiga.biome
                                        || biome == BiomeJurassicSouthernTaigaHills.biome
                                        || biome == BiomeJurassicSouthernTaigaBasalt.biome) {
                                        iblockstate1 = BlockCoarseSandyDirtBlack.block.getDefaultState();
                                    }
                                    else {
                                       if (biome == BiomeJurassicBeachBlack.biome) {
                                           iblockstate1 = BlockSandBlack.block.getDefaultState();
                                       }
                                       else {
                                           iblockstate1 = BlockCoarseSandyDirt.block.getDefaultState();
                                       }
                                    }
                                } else {
                                    if (biome == BiomeJurassicSouthernTaiga.biome
                                        || biome == BiomeJurassicSouthernTaigaHills.biome
                                        || biome == BiomeJurassicSouthernTaigaBasalt.biome
                                        || biome == BiomeJurassicBeachBlack.biome) {
                                        iblockstate1 = BlockSandBlack.block.getDefaultState();
                                    }
                                    else {
                                        iblockstate1 = Blocks.SAND.getStateFromMeta(0);
                                    }
                                }
                            } else {
                                if (biome == BiomeJurassicSouthernTaiga.biome
                                    || biome == BiomeJurassicSouthernTaigaHills.biome
                                    || biome == BiomeJurassicSouthernTaigaBasalt.biome) {
                                    iblockstate1 = BlockSandBlackWavy.block.getDefaultState();
                                }
                                else {
                                    iblockstate1 = BlockSandWavy.block.getDefaultState();
                                    if (biome == BiomeJurassicBeachBlack.biome) {
                                        iblockstate1 = BlockSandBlackWavy.block.getDefaultState();
                                    }
                                }
                            }
                        }
                        if (j1 < i && (iblockstate == null || iblockstate.getMaterial() == Material.AIR)) {
                            if (biome.getTemperature(blockpos$mutableblockpos.setPos(x, j1, z)) < 0.15F) {
                                iblockstate = FLUID;
                            } else {
                                iblockstate = FLUID;
                            }
                        }

                        //Mudflats terrain:
                        if (biome == BiomeJurassicMudflats.biome) {
                            if (j1 >= i + 3) { //hilliest bits:
                                if (iblockstate == BlockCoarseSiltyDirt.block.getDefaultState()
                                        && rand.nextInt(17) == 0) {
                                    iblockstate = Blocks.COBBLESTONE.getDefaultState();
                                }
                                else if (iblockstate == BlockCoarseSiltyDirt.block.getDefaultState()
                                        && rand.nextInt(6) != 0) {
                                    iblockstate = BlockBrownstone.block.getDefaultState();
                                }
                                else if (iblockstate == BlockCoarseSiltyDirt.block.getDefaultState()
                                        && rand.nextInt(6) != 0) {
                                    iblockstate = Blocks.DIRT.getStateFromMeta(1);
                                }
                            }
                            else if (j1 >= i) { //smaller hilly bits:
                                if (iblockstate == BlockCoarseSiltyDirt.block.getDefaultState()
                                        && rand.nextInt(4) != 0) {
                                    iblockstate = BlockBrownstone.block.getDefaultState();
                                }
                                else if (iblockstate == BlockCoarseSiltyDirt.block.getDefaultState()
                                        && rand.nextInt(5) != 0) {
                                    iblockstate = Blocks.DIRT.getStateFromMeta(1);
                                }
                            }
                            else { //flats:
                                if (iblockstate == BlockCoarseSiltyDirt.block.getDefaultState()
                                        && rand.nextInt(12) == 0) {
                                    iblockstate = BlockBrownstone.block.getDefaultState();
                                }
                                else if (iblockstate == BlockCoarseSiltyDirt.block.getDefaultState()
                                        && rand.nextInt(8) == 0) {
                                    iblockstate = BlockCarboniferousMud.block.getDefaultState();
                                }
                                else if (iblockstate == BlockCoarseSiltyDirt.block.getDefaultState()
                                        && rand.nextInt(6) == 0) {
                                    iblockstate = BlockDriedMud.block.getDefaultState();
                                }
                                else if (iblockstate == BlockCoarseSiltyDirt.block.getDefaultState()
                                        && rand.nextInt(10) == 0) {
                                    iblockstate = Blocks.DIRT.getStateFromMeta(1);
                                }
                            }
                        }


                        //Sandbanks terrain:
                        if (biome == BiomeJurassicSandbanks.biome) {
                            if (j1 >= i + 1) {
                                iblockstate = BlockPrehistoricGroundBasic.block.getDefaultState();
                                if (rand.nextInt(12) == 0) {
                                    iblockstate = BlockPrehistoricGroundBasic.block.getDefaultState();
                                }
                            }
                            else  if (j1 >= i) {
                                if (rand.nextInt(2) == 0) {
                                    iblockstate = BlockPrehistoricGroundBasic.block.getDefaultState();
                                }
                                else if (rand.nextInt(8) == 0) {
                                    iblockstate = BlockCoarseSandyDirt.block.getDefaultState();
                                }
                            }
                            else  if (j1 >= i - 1) {
                                if (rand.nextInt(8) == 0) {
                                    iblockstate = BlockPrehistoricGroundBasic.block.getDefaultState();
                                }
                                else if (rand.nextInt(8) == 0) {
                                    iblockstate = BlockCoarseSandyDirt.block.getDefaultState();
                                }
                            }
                        }


                        //Add some moss and ferns generally:
                        if (iblockstate == BlockPrehistoricGroundBasic.block.getDefaultState()
                                && biome == BiomeJurassicGinkgoWoodland.biome && rand.nextInt(12) == 0) {
                            iblockstate = BlockPrehistoricGroundMossy.block.getDefaultState();
                        }
                        if (iblockstate == BlockPrehistoricGroundBasic.block.getDefaultState()
                                && biome == BiomeJurassicGinkgoWoodland.biome && rand.nextInt(12) == 0) {
                            iblockstate = BlockPrehistoricGroundFern.block.getDefaultState();
                        }
                        if (iblockstate == BlockPrehistoricGroundBasic.block.getDefaultState()
                                && biome == BiomeJurassicFloodplainForested.biome && rand.nextInt(18) == 0) {
                            iblockstate = BlockPrehistoricGroundMossy.block.getDefaultState();
                        }
                        if (iblockstate == BlockPrehistoricGroundBasic.block.getDefaultState()
                                && biome == BiomeJurassicFloodplain.biome && rand.nextInt(4) == 0) {
                            iblockstate = BlockPrehistoricGroundMossy.block.getDefaultState();
                        }
                        if (iblockstate == BlockPrehistoricGroundBasic.block.getDefaultState()
                                && biome == BiomeJurassicFloodplain.biome && rand.nextInt(6) == 0) {
                            iblockstate = BlockPrehistoricGroundFern.block.getDefaultState();
                        }
                        if (iblockstate == Blocks.DIRT.getStateFromMeta(2)
                                && biome == BiomeJurassicRedwoodForest.biome && rand.nextInt(12) == 0) {
                            iblockstate = BlockPrehistoricGroundMossy.block.getDefaultState();
                        }
                        if (iblockstate == BlockPrehistoricGroundBasic.block.getDefaultState()
                                && biome == BiomeJurassicRiverbank.biome && rand.nextInt(6) == 0) {
                            iblockstate = BlockPrehistoricGroundFern.block.getDefaultState();
                        }
                        if (iblockstate == BlockPrehistoricGroundBasic.block.getDefaultState()
                                && biome == BiomeJurassicRiverbank.biome && rand.nextInt(5) == 0) {
                            iblockstate = BlockPrehistoricGroundMossy.block.getDefaultState();
                        }

                        if (iblockstate == BlockPrehistoricGroundBasic.block.getDefaultState()
                                && biome == BiomeJurassicSandbanks.biome && rand.nextInt(5) == 0) {
                            iblockstate = BlockPrehistoricGroundFern.block.getDefaultState();
                        }
                        if (iblockstate == BlockPrehistoricGroundBasic.block.getDefaultState()
                                && biome == BiomeJurassicSandbanks.biome && rand.nextInt(6) == 0) {
                            iblockstate = BlockPrehistoricGroundMossy.block.getDefaultState();
                        }

                        //For the Boulders  biome, make things craggy:
                        if (biome == BiomeJurassicBoulders.biome
                        ) {
                            //If it's over 63 blocks then start to fill in more as stone
                            //up to 95
                            int minHeight = 63;
                            if (j1 >= minHeight) {
                                int j2 = Math.max(0, 100 - j1);
                                double stoneFactor = (double) j2 / (100D - (double) minHeight);
                                if (Math.random() >= stoneFactor) {
                                    if (Math.random() > 0.32) {
                                        iblockstate = Blocks.STONE.getDefaultState();
                                    } else {
                                        iblockstate = BlockCoarseSandyDirtRed.block.getDefaultState();
                                        if (rand.nextInt(8) == 0) {
                                            iblockstate = Blocks.COBBLESTONE.getDefaultState();
                                        } else if (rand.nextInt(10) == 0) {
                                            iblockstate = Blocks.DIRT.getStateFromMeta(1);
                                        }
                                    }
                                }
                                if (Math.random() >= stoneFactor) {
                                    iblockstate1 = Blocks.STONE.getDefaultState();
                                    if (rand.nextInt(8) == 0) {
                                        iblockstate1 = Blocks.COBBLESTONE.getDefaultState();
                                    } else if (rand.nextInt(8) == 0) {
                                        iblockstate1 = Blocks.DIRT.getStateFromMeta(1);
                                    }
                                }
                            }
                        }

                        //Make hills craggy at the tops and ferny in the valleys:
                        if (biome == BiomeJurassicRoughHills.biome
                        ) {
                            iblockstate = BlockPrehistoricGroundFern.block.getDefaultState();
                            //If it's over 80 blocks then start to fill in more as stone
                            //up to 140
                            int minHeight = 78;
                            if (j1 >= minHeight) {
                                int j2 = Math.max(0, 95 - j1);
                                double stoneFactor = (double) j2 / (95D - (double) minHeight);
                                if (Math.random() >= stoneFactor) {
                                    if (Math.random() > 0.32) {
                                        iblockstate =  BlockPrehistoricGroundBasic.block.getDefaultState();
                                    } else {
                                        iblockstate = BlockPrehistoricGroundMossy.block.getDefaultState();
                                    }
                                }
                                if (Math.random() >= stoneFactor) {
                                    iblockstate1 = BlockPrehistoricGroundBasic.block.getDefaultState();
                                }
                            }

                            //If it's over 80 blocks then start to fill in more as stone
                            //up to 140
                            minHeight = 80;
                            if (j1 >= minHeight) {
                                int j2 = Math.max(0, 125 - j1);
                                double stoneFactor = 2 * (double) j2 / (125D - (double) minHeight);
                                if (Math.random() >= stoneFactor) {
                                    if (Math.random() > 0.32) {
                                        iblockstate = Blocks.STONE.getDefaultState();
                                    } else {
                                        iblockstate = BlockPrehistoricGroundMossy.block.getDefaultState();
                                        if (rand.nextInt(8) == 0) {
                                            iblockstate = Blocks.MOSSY_COBBLESTONE.getDefaultState();
                                        } else if (rand.nextInt(10) == 0) {
                                            iblockstate = BlockPrehistoricGroundBasic.block.getDefaultState();
                                        }
                                    }
                                }
                                if (Math.random() >= stoneFactor) {
                                    iblockstate1 = Blocks.STONE.getDefaultState();
                                    if (rand.nextInt(8) == 0) {
                                        iblockstate1 = Blocks.COBBLESTONE.getDefaultState();
                                    } else if (rand.nextInt(8) == 0) {
                                        iblockstate1 = BlockPrehistoricGroundMossy.block.getDefaultState();
                                    }
                                }
                            }
                        }
                        if (biome == BiomeJurassicOutcrops.biome
                        ) {
                            //If it's over 100 blocks then start to fill in more as stone
                            //up to 200
                            int minHeight = 100;
                            if (j1 >= minHeight) {
                                int j2 = Math.max(0, 180 - j1);
                                double stoneFactor = (double) j2 / (180D - (double) minHeight);
                                if (Math.random() >= stoneFactor) {
                                    if (Math.random() > 0.32) {
                                        iblockstate = Blocks.STONE.getDefaultState();
                                    } else {
                                        if (rand.nextInt(8) == 0) {
                                            iblockstate = Blocks.MOSSY_COBBLESTONE.getDefaultState();
                                        } else if (rand.nextInt(10) == 0) {
                                            iblockstate = Blocks.DIRT.getStateFromMeta(1);
                                        }
                                    }
                                }
                                if (Math.random() >= stoneFactor) {
                                    if (rand.nextInt(8) == 0) {
                                        iblockstate1 = Blocks.COBBLESTONE.getDefaultState();
                                    } else if (rand.nextInt(8) == 0) {
                                        iblockstate1 = Blocks.DIRT.getStateFromMeta(1);
                                    }
                                }
                            }
                        }

                        //Taiga terrain:
                        if (biome == BiomeJurassicSouthernTaiga.biome
                            || biome == BiomeJurassicSouthernTaigaHills.biome) {
                            if (j1 >= i + 1) {
                                iblockstate = Blocks.DIRT.getStateFromMeta(2); //Podzol
                                if (rand.nextInt(3) == 0) {
                                    iblockstate = BlockPrehistoricGroundLush.block.getDefaultState();
                                }
                                else if (rand.nextInt(3) == 0) {
                                    iblockstate = BlockPrehistoricGroundMossy.block.getDefaultState();
                                }
                                else if (rand.nextInt(12) == 0) {
                                    iblockstate = BlockCoarseSandyDirtBlack.block.getDefaultState();
                                }
                            }
                            else if (j1 >= i) {
                                if (rand.nextInt(3) == 0) {
                                    iblockstate = BlockPrehistoricGroundLush.block.getDefaultState();
                                }
                                if (rand.nextInt(3) == 0) {
                                    iblockstate = BlockPrehistoricGroundMossy.block.getDefaultState();
                                }
                                else if (rand.nextInt(6) == 0) {
                                    iblockstate = BlockCoarseSandyDirtBlack.block.getDefaultState();
                                }
                            }
                            else  if (j1 >= i - 1) {
                                if (rand.nextInt(3) == 0) {
                                    iblockstate = BlockPrehistoricGroundLush.block.getDefaultState();
                                }
                                else if (rand.nextInt(2) == 0) {
                                    iblockstate = BlockPrehistoricGroundMossy.block.getDefaultState();
                                }
                                else if (rand.nextInt(4) == 0) {
                                    iblockstate = BlockCoarseSandyDirtBlack.block.getDefaultState();
                                }
                            }
                        }

                        j = k;
                        if (j1 >= i - 1) {
                            chunkPrimerIn.setBlockState(i1, j1, l, iblockstate);
                        }
                        else if (j1 < i - 7 - k) {
                            iblockstate = AIR;
                            iblockstate1 = STONE;
                            if (Math.random() > 0.6 && j1 >= i - 2) {
                                if (biome == BiomeJurassicSouthernTaiga.biome
                                    || biome == BiomeJurassicSouthernTaigaHills.biome
                                    || biome == BiomeJurassicSouthernTaigaBasalt.biome) {
                                    chunkPrimerIn.setBlockState(i1, j1, l, BlockSandyDirtBlack.block.getDefaultState());
                                }
                                else {
                                    chunkPrimerIn.setBlockState(i1, j1, l, Blocks.DIRT.getStateFromMeta(1));
                                }
                            }
                            else {
                                if (Math.random() > 0.95 || (j1 < i - 10 && Math.random() > 0.3)) {
                                    if (biome == BiomeJurassicSouthernTaiga.biome
                                            || biome == BiomeJurassicSouthernTaigaHills.biome
                                            || biome == BiomeJurassicSouthernTaigaBasalt.biome) {
                                        chunkPrimerIn.setBlockState(i1, j1, l, BlockSandBlack.block.getDefaultState());
                                    }
                                    else {
                                        chunkPrimerIn.setBlockState(i1, j1, l, Blocks.SAND.getStateFromMeta(0));
                                    }
                                } else {
                                    if (Math.random() > 0.25) {
                                        if (Math.random() > 0.85) {
                                            if (biome == BiomeJurassicSouthernTaiga.biome
                                                    || biome == BiomeJurassicSouthernTaigaHills.biome
                                                    || biome == BiomeJurassicSouthernTaigaBasalt.biome) {
                                                chunkPrimerIn.setBlockState(i1, j1, l, BlockSandBlack.block.getDefaultState());
                                            }
                                            else {
                                                chunkPrimerIn.setBlockState(i1, j1, l, Blocks.SAND.getStateFromMeta(0));
                                            }
                                        }
                                        else {
                                            if (biome == BiomeJurassicSouthernTaiga.biome
                                                || biome == BiomeJurassicSouthernTaigaHills.biome
                                                || biome == BiomeJurassicSouthernTaigaBasalt.biome) {
                                                chunkPrimerIn.setBlockState(i1, j1, l, BlockSandBlackWavy.block.getDefaultState());
                                            }
                                            else {
                                                chunkPrimerIn.setBlockState(i1, j1, l, BlockSandWavy.block.getDefaultState());
                                                if (biome == BiomeJurassicBeachBlack.biome) {
                                                    chunkPrimerIn.setBlockState(i1, j1, l, BlockSandBlackWavy.block.getDefaultState());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            chunkPrimerIn.setBlockState(i1, j1, l, iblockstate1);
                        }
                    } else if (j > 0) {
                        --j;
                        chunkPrimerIn.setBlockState(i1, j1, l, iblockstate1); //filler
                        if (j == 0 && (iblockstate1.getBlock() == Blocks.SAND.getStateFromMeta(0).getBlock() || iblockstate1.getBlock() == BlockSandWavy.block) && k > 1) {
                            j = rand.nextInt(4) + Math.max(0, j1 - 63);
                            iblockstate1 = Blocks.SANDSTONE.getDefaultState();
                        }
                        else if (j == 0 && (iblockstate1.getBlock() == Blocks.SAND.getStateFromMeta(1).getBlock() || iblockstate1.getBlock() == BlockSandRedWavy.block) && k > 1) {
                            j = rand.nextInt(4) + Math.max(0, j1 - 63);
                            iblockstate1 = Blocks.RED_SANDSTONE.getDefaultState();
                        }
                        else if (j == 0 && (iblockstate1.getBlock() == BlockSandBlack.block || iblockstate1.getBlock() == BlockSandBlackWavy.block) && k > 1) {
                            j = rand.nextInt(4) + Math.max(0, j1 - 63);
                            iblockstate1 = BlockSandstoneBlack.block.getDefaultState();
                        }
                    }
                }
            }
        }
    }
}