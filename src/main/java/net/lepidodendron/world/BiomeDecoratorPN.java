package net.lepidodendron.world;

import net.lepidodendron.util.*;
import net.lepidodendron.world.biome.cambrian.BiomeCambrian;
import net.lepidodendron.world.biome.carboniferous.BiomeCarboniferous;
import net.lepidodendron.world.biome.cretaceous.BiomeCretaceousEarly;
import net.lepidodendron.world.biome.devonian.BiomeDevonian;
import net.lepidodendron.world.biome.jurassic.BiomeJurassic;
import net.lepidodendron.world.biome.ordovician.BiomeOrdovician;
import net.lepidodendron.world.biome.permian.BiomePermian;
import net.lepidodendron.world.biome.precambrian.BiomePrecambrian;
import net.lepidodendron.world.biome.silurian.BiomeSilurian;
import net.lepidodendron.world.biome.triassic.BiomeTriassic;
import net.lepidodendron.world.gen.*;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockSilverfish;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.feature.WorldGenDeadBush;
import net.minecraft.world.gen.feature.*;

import java.util.Random;

public class BiomeDecoratorPN extends BiomeDecorator {

    private final WorldGenerator silverfishSpawner = new WorldGenMinable(Blocks.MONSTER_EGG.getDefaultState().withProperty(BlockSilverfish.VARIANT, BlockSilverfish.EnumType.STONE), 9);

    protected void genDecorations(Biome biomeIn, World worldIn, Random random)
    {
        net.minecraft.util.math.ChunkPos forgeChunkPos = new net.minecraft.util.math.ChunkPos(chunkPos); // actual ChunkPos instead of BlockPos, used for events
        net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(new net.minecraftforge.event.terraingen.DecorateBiomeEvent.Pre(worldIn, random, forgeChunkPos));
        this.generateOres(worldIn, random);

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, forgeChunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SAND))
            for (int i = 0; i < this.sandPatchesPerChunk; ++i)
            {
                int j = random.nextInt(16) + 8;
                int k = random.nextInt(16) + 8;
                this.sandGen.generate(worldIn, random, worldIn.getTopSolidOrLiquidBlock(this.chunkPos.add(j, 0, k)));
            }

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, forgeChunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.CLAY))
            for (int i1 = 0; i1 < this.clayPerChunk; ++i1)
            {
                int l1 = random.nextInt(16) + 8;
                int i6 = random.nextInt(16) + 8;
                this.clayGen.generate(worldIn, random, worldIn.getTopSolidOrLiquidBlock(this.chunkPos.add(l1, 0, i6)));
            }

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, forgeChunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SAND_PASS2))
            for (int j1 = 0; j1 < this.gravelPatchesPerChunk; ++j1)
            {
                int i2 = random.nextInt(16) + 8;
                int j6 = random.nextInt(16) + 8;
                this.gravelGen.generate(worldIn, random, worldIn.getTopSolidOrLiquidBlock(this.chunkPos.add(i2, 0, j6)));
            }

        int k1 = this.treesPerChunk;

        if (random.nextFloat() < this.extraTreeChance)
        {
            ++k1;
        }

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, forgeChunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.TREE))
            for (int j2 = 0; j2 < k1; ++j2)
            {
                int k6 = random.nextInt(16) + 8;
                int l = random.nextInt(16) + 8;
                WorldGenAbstractTree worldgenabstracttree = biomeIn.getRandomTreeFeature(random);
                //Exceptions for large trees here to help centre them on the chunks and avoid cascading lag:
                if (worldgenabstracttree instanceof WorldGenArchaeopterisTree
                        || worldgenabstracttree instanceof WorldGenArchaeopterisTreeWaterDeep
                        || worldgenabstracttree instanceof WorldGenAraucaritesTree
                        || worldgenabstracttree instanceof WorldGenMonkeyPuzzleAraucariaTree
                        || worldgenabstracttree instanceof WorldGenTietea
                        || worldgenabstracttree instanceof WorldGenPsaronius
                        || worldgenabstracttree instanceof WorldGenAraucarioxylonTree
                        || worldgenabstracttree instanceof WorldGenAraucarioxylonTreeWaterDeep
                        || worldgenabstracttree instanceof WorldGenHoopTree
                        || worldgenabstracttree instanceof WorldGenGinkgoTree
                        || worldgenabstracttree instanceof WorldGenGinkgoitesTree
                        || worldgenabstracttree instanceof WorldGenTallAraucariaTree
                        || worldgenabstracttree instanceof WorldGenYewTree) {
                    k6 = random.nextInt(8) + 12;
                    l = random.nextInt(8) + 12;
                }
                if (worldgenabstracttree instanceof WorldGenPagiophyllumTree
                        || worldgenabstracttree instanceof WorldGenBushyAraucariaTree) {
                    k6 = 16;
                    l = 16;
                }
                worldgenabstracttree.setDecorationDefaults();
                BlockPos blockpos = worldIn.getHeight(this.chunkPos.add(k6, 0, l));

                boolean BandedCheck = true;
                if ((biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_banded_desert")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_banded_desert"))
                    && blockpos.getY() > 68) {
                    BandedCheck = false;
                }

                if (BandedCheck) {
                    if (worldgenabstracttree.generate(worldIn, random, blockpos)) {
                        worldgenabstracttree.generateSaplings(worldIn, random, blockpos);
                    }
                }
            }

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, forgeChunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.BIG_SHROOM))
            for (int k2 = 0; k2 < this.bigMushroomsPerChunk; ++k2)
            {
                int l6 = random.nextInt(16) + 8;
                int k10 = random.nextInt(16) + 8;
                this.bigMushroomGen.generate(worldIn, random, worldIn.getHeight(this.chunkPos.add(l6, 0, k10)));
            }

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, forgeChunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS))
            for (int l2 = 0; l2 < this.flowersPerChunk; ++l2)
            {
                int i7 = random.nextInt(16) + 8;
                int l10 = random.nextInt(16) + 8;
                int j14 = worldIn.getHeight(this.chunkPos.add(i7, 0, l10)).getY() + 32;

                if (j14 > 0)
                {
                    int k17 = random.nextInt(j14);
                    BlockPos blockpos1 = this.chunkPos.add(i7, k17, l10);
                    BlockFlower.EnumFlowerType blockflower$enumflowertype = biomeIn.pickRandomFlower(random, blockpos1);
                    BlockFlower blockflower = blockflower$enumflowertype.getBlockType().getBlock();

                    if (blockflower.getDefaultState().getMaterial() != Material.AIR)
                    {
                        this.flowerGen.setGeneratedBlock(blockflower, blockflower$enumflowertype);
                        this.flowerGen.generate(worldIn, random, blockpos1);
                    }
                }
            }

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, forgeChunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
            for (int i3 = 0; i3 < this.grassPerChunk; ++i3)
            {
                int j7 = random.nextInt(16) + 8;
                int i11 = random.nextInt(16) + 8;
                int k14 = worldIn.getHeight(this.chunkPos.add(j7, 0, i11)).getY() * 2;

                if (k14 > 0)
                {
                    int l17 = random.nextInt(k14);
                    biomeIn.getRandomWorldGenForGrass(random).generate(worldIn, random, this.chunkPos.add(j7, l17, i11));
                }
            }

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, forgeChunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.DEAD_BUSH))
            for (int j3 = 0; j3 < this.deadBushPerChunk; ++j3)
            {
                int k7 = random.nextInt(16) + 8;
                int j11 = random.nextInt(16) + 8;
                int l14 = worldIn.getHeight(this.chunkPos.add(k7, 0, j11)).getY() * 2;

                if (l14 > 0)
                {
                    int i18 = random.nextInt(l14);
                    (new WorldGenDeadBush()).generate(worldIn, random, this.chunkPos.add(k7, i18, j11));
                }
            }

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, forgeChunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.LILYPAD))
            for (int k3 = 0; k3 < this.waterlilyPerChunk; ++k3)
            {
                int l7 = random.nextInt(16) + 8;
                int k11 = random.nextInt(16) + 8;
                int i15 = worldIn.getHeight(this.chunkPos.add(l7, 0, k11)).getY() * 2;

                if (i15 > 0)
                {
                    int j18 = random.nextInt(i15);
                    BlockPos blockpos4;
                    BlockPos blockpos7;

                    for (blockpos4 = this.chunkPos.add(l7, j18, k11); blockpos4.getY() > 0; blockpos4 = blockpos7)
                    {
                        blockpos7 = blockpos4.down();

                        if (!worldIn.isAirBlock(blockpos7))
                        {
                            break;
                        }
                    }

                    this.waterlilyGen.generate(worldIn, random, blockpos4);
                }
            }

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, forgeChunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SHROOM))
        {
            for (int l3 = 0; l3 < this.mushroomsPerChunk; ++l3)
            {
                if (random.nextInt(4) == 0)
                {
                    int i8 = random.nextInt(16) + 8;
                    int l11 = random.nextInt(16) + 8;
                    BlockPos blockpos2 = worldIn.getHeight(this.chunkPos.add(i8, 0, l11));
                    this.mushroomBrownGen.generate(worldIn, random, blockpos2);
                }

                if (random.nextInt(8) == 0)
                {
                    int j8 = random.nextInt(16) + 8;
                    int i12 = random.nextInt(16) + 8;
                    int j15 = worldIn.getHeight(this.chunkPos.add(j8, 0, i12)).getY() * 2;

                    if (j15 > 0)
                    {
                        int k18 = random.nextInt(j15);
                        BlockPos blockpos5 = this.chunkPos.add(j8, k18, i12);
                        this.mushroomRedGen.generate(worldIn, random, blockpos5);
                    }
                }
            }

            if (random.nextInt(4) == 0)
            {
                int i4 = random.nextInt(16) + 8;
                int k8 = random.nextInt(16) + 8;
                int j12 = worldIn.getHeight(this.chunkPos.add(i4, 0, k8)).getY() * 2;

                if (j12 > 0)
                {
                    int k15 = random.nextInt(j12);
                    this.mushroomBrownGen.generate(worldIn, random, this.chunkPos.add(i4, k15, k8));
                }
            }

            if (random.nextInt(8) == 0)
            {
                int j4 = random.nextInt(16) + 8;
                int l8 = random.nextInt(16) + 8;
                int k12 = worldIn.getHeight(this.chunkPos.add(j4, 0, l8)).getY() * 2;

                if (k12 > 0)
                {
                    int l15 = random.nextInt(k12);
                    this.mushroomRedGen.generate(worldIn, random, this.chunkPos.add(j4, l15, l8));
                }
            }
        } // End of Mushroom generation
        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, forgeChunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.REED))
        {
            for (int k4 = 0; k4 < this.reedsPerChunk; ++k4)
            {
                int i9 = random.nextInt(16) + 8;
                int l12 = random.nextInt(16) + 8;
                int i16 = worldIn.getHeight(this.chunkPos.add(i9, 0, l12)).getY() * 2;

                if (i16 > 0)
                {
                    int l18 = random.nextInt(i16);
                    this.reedGen.generate(worldIn, random, this.chunkPos.add(i9, l18, l12));
                }
            }

            for (int l4 = 0; l4 < 10; ++l4)
            {
                int j9 = random.nextInt(16) + 8;
                int i13 = random.nextInt(16) + 8;
                int j16 = worldIn.getHeight(this.chunkPos.add(j9, 0, i13)).getY() * 2;

                if (j16 > 0)
                {
                    int i19 = random.nextInt(j16);
                    this.reedGen.generate(worldIn, random, this.chunkPos.add(j9, i19, i13));
                }
            }
        } // End of Reed generation
        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, forgeChunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.PUMPKIN))
            if (random.nextInt(32) == 0)
            {
                int i5 = random.nextInt(16) + 8;
                int k9 = random.nextInt(16) + 8;
                int j13 = worldIn.getHeight(this.chunkPos.add(i5, 0, k9)).getY() * 2;

                if (j13 > 0)
                {
                    int k16 = random.nextInt(j13);
                    (new WorldGenPumpkin()).generate(worldIn, random, this.chunkPos.add(i5, k16, k9));
                }
            }

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, forgeChunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.CACTUS))
            for (int j5 = 0; j5 < this.cactiPerChunk; ++j5)
            {
                int l9 = random.nextInt(16) + 8;
                int k13 = random.nextInt(16) + 8;
                int l16 = worldIn.getHeight(this.chunkPos.add(l9, 0, k13)).getY() * 2;

                if (l16 > 0)
                {
                    int j19 = random.nextInt(l16);
                    this.cactusGen.generate(worldIn, random, this.chunkPos.add(l9, j19, k13));
                }
            }

        boolean desertBiome = false;
        if (biomeIn instanceof BiomePermian) {
            desertBiome = ((BiomePermian)biomeIn).getBiomeType() == EnumBiomeTypePermian.Desert
                || ((BiomePermian)biomeIn).getBiomeType() == EnumBiomeTypePermian.Stony;
        }
        if (biomeIn instanceof BiomeTriassic) {
            desertBiome = ((BiomeTriassic)biomeIn).getBiomeType() == EnumBiomeTypeTriassic.Desert;
        }
        if (biomeIn instanceof BiomeJurassic) {
            desertBiome = ((BiomeJurassic)biomeIn).getBiomeType() == EnumBiomeTypeJurassic.Desert;
        }
        if (biomeIn instanceof BiomeCretaceousEarly) {
            desertBiome = biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_samerica_sandy_desert")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_samerica_sandy_desert")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_samerica_sandy_desert_spikes")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_samerica_arid")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_south_america_desert")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_samerica_sandy_desert")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_banded_desert")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_creek_banded_desert")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_samerica_arid")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_samerica_arid_spikes")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_samerica_desert_low")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_samerica_desert_spikes");
        }

        boolean hillsBiome = false;
        boolean hillsBiomeSilkverfish = false;
        if (biomeIn instanceof BiomePrecambrian) {
            hillsBiome = ((BiomePrecambrian)biomeIn).getBiomeType() == EnumBiomeTypePrecambrian.Proterozoic_Land;
        }
        if (biomeIn instanceof BiomeCambrian) {
            hillsBiome = ((BiomeCambrian)biomeIn).getBiomeType() == EnumBiomeTypeCambrian.BarrenLand;
        }
        if (biomeIn instanceof BiomeOrdovician) {
            hillsBiome = ((BiomeOrdovician)biomeIn).getBiomeType() == EnumBiomeTypeOrdovician.FrozenLand
                || ((BiomeOrdovician)biomeIn).getBiomeType() == EnumBiomeTypeOrdovician.BarrenLand;
        }
        if (biomeIn instanceof BiomeSilurian) {
            hillsBiome = ((BiomeSilurian)biomeIn).getBiomeType() == EnumBiomeTypeSilurian.BarrenLand;
        }
        if (biomeIn instanceof BiomeDevonian) {
            hillsBiome = ((BiomeDevonian)biomeIn).getBiomeType() == EnumBiomeTypeDevonian.Mountains
                || ((BiomeDevonian)biomeIn).getBiomeType() == EnumBiomeTypeDevonian.MountainsEarly;
            if (hillsBiome) {
                hillsBiomeSilkverfish = true;
            }
        }
        if (biomeIn instanceof BiomeCarboniferous) {
            hillsBiome = ((BiomeCarboniferous)biomeIn).getBiomeType() == EnumBiomeTypeCarboniferous.Hills;
            if (hillsBiome) {
                hillsBiomeSilkverfish = true;
            }
        }
        if (biomeIn instanceof BiomePermian) {
            hillsBiome = ((BiomePermian)biomeIn).getBiomeType() == EnumBiomeTypePermian.Highlands;
            if (hillsBiome) {
                hillsBiomeSilkverfish = true;
            }
        }
        if (biomeIn instanceof BiomeTriassic) {
            hillsBiome = ((BiomeTriassic)biomeIn).getBiomeType() == EnumBiomeTypeTriassic.Mountain;
            if (hillsBiome) {
                hillsBiomeSilkverfish = true;
            }
        }
        if (biomeIn instanceof BiomeJurassic) {
            hillsBiome = ((BiomeJurassic)biomeIn).getBiomeType() == EnumBiomeTypeJurassic.Highlands;
            if (hillsBiome) {
                hillsBiomeSilkverfish = true;
            }
        }
        if (biomeIn instanceof BiomeCretaceousEarly) {
            hillsBiome = biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_peaks")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_pinnacles")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_africa_valley")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_barren_hills")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_highland")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_lakes_a")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_lakes_b")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_lakes_dead")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_yixian_mountains")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_asia_yixian_foothills")
                    || biomeIn.getRegistryName().toString().equalsIgnoreCase("lepidodendron:cretaceous_early_namerica_mountains");
            if (hillsBiome) {
                hillsBiomeSilkverfish = true;
            }
        }

        if (hillsBiome) {
            WorldGenerator emeralds = new EmeraldGenerator();
            if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, random, emeralds, this.chunkPos, net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.EMERALD))
                emeralds.generate(worldIn, random, this.chunkPos);

            if (hillsBiomeSilkverfish) {
                for (int j1 = 0; j1 < 7; ++j1) {
                    int k2 = random.nextInt(16);
                    int l1 = random.nextInt(64);
                    int i2 = random.nextInt(16);
                    if (net.minecraftforge.event.terraingen.TerrainGen.generateOre(worldIn, random, silverfishSpawner, this.chunkPos.add(k2, l1, i2), net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.SILVERFISH))
                        this.silverfishSpawner.generate(worldIn, random, this.chunkPos.add(k2, l1, i2));
                }
            }
        }

        if (this.generateFalls && !desertBiome)
        {
            if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, forgeChunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.LAKE_WATER))
                for (int k5 = 0; k5 < 50; ++k5)
                {
                    int i10 = random.nextInt(16) + 8;
                    int l13 = random.nextInt(16) + 8;
                    int i17 = random.nextInt(248) + 8;

                    if (i17 > 0)
                    {
                        int k19 = random.nextInt(i17);
                        BlockPos blockpos6 = this.chunkPos.add(i10, k19, l13);
                        (new WorldGenLiquids(Blocks.FLOWING_WATER)).generate(worldIn, random, blockpos6);
                    }
                }

            if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, random, forgeChunkPos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.LAKE_LAVA))
                if (!(biomeIn instanceof BiomeCarboniferous)) { //No lava flows in Carboniferous as they burn too quickly!
                    for (int l5 = 0; l5 < 20; ++l5) {
                        int j10 = random.nextInt(16) + 8;
                        int i14 = random.nextInt(16) + 8;
                        int j17 = random.nextInt(random.nextInt(random.nextInt(240) + 8) + 8);
                        BlockPos blockpos3 = this.chunkPos.add(j10, j17, i14);
                        (new WorldGenLiquids(Blocks.FLOWING_LAVA)).generate(worldIn, random, blockpos3);
                    }
                }
        }
        net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(new net.minecraftforge.event.terraingen.DecorateBiomeEvent.Post(worldIn, random, forgeChunkPos));
    }

}
