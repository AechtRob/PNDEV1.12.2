package net.lepidodendron.world.structure;


import net.lepidodendron.ElementsLepidodendronMod;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.world.biome.BiomeAppleOrchard;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

import java.util.Random;

@ElementsLepidodendronMod.ModElement.Tag
public class StructureOrchardHouse extends ElementsLepidodendronMod.ModElement {
    public StructureOrchardHouse(ElementsLepidodendronMod instance) {
        super(instance, 7);
    }

    @Override
    public void generateWorld(Random random, int i2, int k2, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
        if (world.isRemote)
            return;

        if (!world.getWorldInfo().isMapFeaturesEnabled()) {
            return;
        }

        if (world.getBiome(new BlockPos(i2, world.getSeaLevel(), k2)) != BiomeAppleOrchard.biome) {
            return;
        }

        boolean dimensionCriteria = false;
        boolean isNetherType = false;
        if (dimID == 0)
            dimensionCriteria = true;
        if (!dimensionCriteria)
            return;
        if ((random.nextInt(1000000) + 1) <= 10000) {
            int count = random.nextInt(1) + 1;
            for (int a = 0; a < count; a++) {
                int i = i2 + random.nextInt(16) + 8;
                int k = k2 + random.nextInt(16) + 8;
                if (world.getBiome(new BlockPos(i, world.getSeaLevel(), k)) != BiomeAppleOrchard.biome) {
                    break;
                }
                int height = 255;
                if (isNetherType) {
                    boolean notpassed = true;
                    while (height > 0) {
                        if (notpassed && (world.isAirBlock(new BlockPos(i, height, k)) || !world.getBlockState(new BlockPos(i, height, k)).getBlock()
                                .getMaterial(world.getBlockState(new BlockPos(i, height, k))).blocksMovement()))
                            notpassed = false;
                        else if (!notpassed && !world.isAirBlock(new BlockPos(i, height, k)) && world.getBlockState(new BlockPos(i, height, k))
                                .getBlock().getMaterial(world.getBlockState(new BlockPos(i, height, k))).blocksMovement())
                            break;
                        height--;
                    }
                } else {
                    while (height > 0) {
                        if (
                                (!world.isAirBlock(new BlockPos(i, height, k)))
                                    && ((world.getBlockState(new BlockPos(i, height, k))).getMaterial() != Material.VINE)
                                    && ((world.getBlockState(new BlockPos(i, height, k))).getMaterial() != Material.LEAVES)
                                    && ((world.getBlockState(new BlockPos(i, height, k))).getMaterial() != Material.WOOD)
                                    && ((world.getBlockState(new BlockPos(i, height, k))).getMaterial() != Material.WEB)
                                    && ((world.getBlockState(new BlockPos(i, height, k))).getMaterial() != Material.PLANTS)
                        )

                            break;
                        height--;
                    }
                }

                //int j = height - 1;
                int j = height;

                boolean blockCriteria = false;
                if ((world.getBlockState(new BlockPos(i, j, k))).getMaterial() == Material.GRASS)
                    blockCriteria = true;
                if (!blockCriteria)
                    continue;

                Template template = ((WorldServer) world).getStructureTemplateManager().getTemplate(world.getMinecraftServer(),
                        new ResourceLocation(LepidodendronMod.MODID, "orchardhouse"));
                if (template == null)
                    return;

                Rotation rotation = Rotation.values()[random.nextInt(3)];
                Mirror mirror = Mirror.values()[random.nextInt(2)];
                BlockPos spawnTo = new BlockPos(i, j, k);
                Biome biome = world.getBiome(spawnTo);
                if (biome != BiomeAppleOrchard.biome) {
                    break;
                }
                IBlockState iblockstate = world.getBlockState(spawnTo);
                world.notifyBlockUpdate(spawnTo, iblockstate, iblockstate, 3);

                PlacementSettings settings = new PlacementSettings().setRotation(rotation).setMirror(mirror).setChunk((ChunkPos) null).setReplacedBlock((Block) null).setIgnoreStructureBlock(true).setIgnoreEntities(false);
                template.addBlocksToWorld(world, spawnTo, new OrchardHouseBlocks(spawnTo, settings, LepidodendronMod.ORCHARD_LOOT, biome, EnumFacing.UP), settings, 2);
            }
        }
    }

}

