package net.lepidodendron.pfvillagers.village;

import net.lepidodendron.LepidodendronConfig;
import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.pfvillagers.entity.VillagerPalaeontologist;
import net.minecraft.block.material.Material;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;
import net.minecraft.world.gen.structure.template.TemplateManager;

import java.util.Random;

public class GenPalaeontologistHouse extends WorldGenerator {

    private static final ResourceLocation HOUSE = new ResourceLocation(LepidodendronMod.MODID, "palaeontologisthouse");
    private VillageComponentPalaeontologistHouse component;
    private Rotation rotation;
    private EnumFacing facing;

    public GenPalaeontologistHouse(VillageComponentPalaeontologistHouse component, EnumFacing facing) {
        this.component = component;
        this.facing = facing;
        switch (facing) {
            case SOUTH:
                rotation = Rotation.COUNTERCLOCKWISE_90;
                break;
            case EAST:
                rotation = Rotation.CLOCKWISE_180;
                break;
            case WEST:
                rotation = Rotation.NONE;
                break;
            default:
                rotation = Rotation.CLOCKWISE_90;
                break;
        }
    }

    public static void fillUnderHouse(Biome biome, World world, BlockPos pos, int x, int z) {
        byte xxx = 1;
        byte zzz = 1;
        if (x < 1) {
            xxx = -1;
        }
        if (z < 1) {
            zzz = -1;
        }
        int xx = 0;
        while (xx <= Math.abs(x)) {
            int zz = 0;
            while (zz <= Math.abs(z)) {
                if (world.getBlockState(pos.add(xx * xxx, 0, zz * zzz)) == PalaeontologisthouseBlocks.getBiomeSpecificBlockState(Blocks.COBBLESTONE.getDefaultState(), biome)
                    || world.getBlockState(pos.add(xx * xxx, 0, zz * zzz)) == PalaeontologisthouseBlocks.getBiomeSpecificBlockState(Blocks.PLANKS.getDefaultState(), biome)
                        || world.getBlockState(pos.add(xx * xxx, 0, zz * zzz)) == PalaeontologisthouseBlocks.getBiomeSpecificBlockState(Blocks.OAK_STAIRS.getDefaultState(), biome)
                    || world.getBlockState(pos.add(xx * xxx, 0, zz * zzz)) == PalaeontologisthouseBlocks.getBiomeSpecificBlockState(Blocks.OAK_FENCE.getDefaultState(), biome))
                {
                    int yy = 1;
                    BlockPos pos1 = pos.add(xx * xxx, 0, zz * zzz);
                    while (pos1.getY() - yy > 0
                            && (world.getBlockState(pos1.add(0, -yy, 0)).getMaterial() == Material.WATER
                            || world.getBlockState(pos1.add(0, -yy, 0)).getMaterial() == Material.PLANTS
                            || world.getBlockState(pos1.add(0, -yy, 0)).getMaterial() == Material.LEAVES
                            || world.getBlockState(pos1.add(0, -yy, 0)).getMaterial() == Material.ICE
                            || world.getBlockState(pos1.add(0, -yy, 0)).getMaterial() == Material.PACKED_ICE
                            || world.getBlockState(pos1.add(0, -yy, 0)).getMaterial() == Material.VINE
                            || world.getBlockState(pos1.add(0, -yy, 0)).getMaterial() == Material.CACTUS
                            || world.getBlockState(pos1.add(0, -yy, 0)).getMaterial() == Material.SNOW
                            || world.getBlockState(pos1.add(0, -yy, 0)).getMaterial() == Material.CRAFTED_SNOW
                            || world.getBlockState(pos1.add(0, -yy, 0)).getMaterial() == Material.LAVA
                            || world.getBlockState(pos1.add(0, -yy, 0)).getMaterial() == Material.CORAL
                            || world.getBlockState(pos1.add(0, -yy, 0)).getMaterial() == Material.FIRE
                            || world.getBlockState(pos1.add(0, -yy, 0)).getMaterial() == Material.CAKE
                            || world.getBlockState(pos1.add(0, -yy, 0)).getMaterial() == Material.CARPET
                            || world.getBlockState(pos1.add(0, -yy, 0)).getMaterial() == Material.CLOTH
                            || world.getBlockState(pos1.add(0, -yy, 0)).getMaterial() == Material.WEB
                            || world.isAirBlock(pos1.add(0, -yy, 0)))
                    ) {
                        world.setBlockState(pos1.add(0, -yy, 0), PalaeontologisthouseBlocks.getBiomeSpecificBlockState(Blocks.COBBLESTONE.getDefaultState(), biome));
                        yy ++;
                    }
                }
                //world.setBlockState(pos.add(xx * xxx, -1, zz * zzz), Blocks.OBSIDIAN.getDefaultState());
                zz ++;
            }
            xx ++;
        }
    }

    @Override
    public boolean generate(World worldIn, Random rand, BlockPos position) {
        if (worldIn == null) {
            return false;
        }
        double chance = (double) LepidodendronConfig.genPalaeontologist;
        if (chance < 0) {chance = 0D;}
        if (chance > 100) {chance = 100D;}
        chance = chance/100D;
        if (Math.random() > chance) {
            return true;
        }
        MinecraftServer server = worldIn.getMinecraftServer();
        TemplateManager templateManager = worldIn.getSaveHandler().getStructureTemplateManager();
        PlacementSettings settings = new PlacementSettings().setRotation(rotation).setMirror(Mirror.NONE);
        Template template = templateManager.getTemplate(server, HOUSE);
        Biome biome = worldIn.getBiome(position);

        if (rotation == Rotation.NONE) {
            template.addBlocksToWorld(worldIn, position.up(3).north(template.getSize().getZ() - 1), new PalaeontologisthouseBlocks(position.up(3), settings, LepidodendronMod.PALAEONTOLOGIST_LOOT, biome, facing.getOpposite()), settings, 2);
            fillUnderHouse(biome, worldIn, position.up(3).east(template.getSize().getZ() + 2), -(template.getSize().getX() - 3), -(template.getSize().getZ() - 2));
        }
        if (rotation == Rotation.CLOCKWISE_90) {
            template.addBlocksToWorld(worldIn, position.up(3).east(template.getSize().getZ()), new PalaeontologisthouseBlocks(position.up(3), settings, LepidodendronMod.PALAEONTOLOGIST_LOOT, biome, facing.getOpposite()), settings, 2);
            fillUnderHouse(biome, worldIn, position.up(3).east(template.getSize().getZ() + 2).north(), (template.getSize().getZ() - 2), -(template.getSize().getX() - 3));
        }
        if (rotation == Rotation.CLOCKWISE_180) {
            template.addBlocksToWorld(worldIn, position.up(3).south(template.getSize().getZ()), new PalaeontologisthouseBlocks(position.up(3), settings, LepidodendronMod.PALAEONTOLOGIST_LOOT, biome, facing.getOpposite()), settings, 2);
            fillUnderHouse(biome, worldIn, position.up(3).east(template.getSize().getZ() + 2).north(), (template.getSize().getX() - 3), (template.getSize().getZ() - 2));
        }
        if (rotation == Rotation.COUNTERCLOCKWISE_90) {
            template.addBlocksToWorld(worldIn, position.up(3).west(template.getSize().getZ()-1), new PalaeontologisthouseBlocks(position.up(3), settings, LepidodendronMod.PALAEONTOLOGIST_LOOT, biome, facing.getOpposite()), settings, 2);
            fillUnderHouse(biome, worldIn, position.up(3).north(template.getSize().getX() - 2), -(template.getSize().getZ() - 2), (template.getSize().getX() - 3));
        }

        //System.err.println("Spawn " + rotation + " house at " + position.getX() + " " + position.getZ());

        if (component.villagerCount < 1) {
            EntityVillager villager = new EntityVillager(worldIn);
            villager.setProfession(VillagerPalaeontologist.PALAEONTOLOGIST_PROFESSION);
            BlockPos villagerPos = position;
            if (rotation == Rotation.NONE) {
                villagerPos = position.up(4).north(5).east(4);
            }
            if (rotation == Rotation.CLOCKWISE_90) {
                villagerPos = position.up(4).east(5).south(4);
            }
            if (rotation == Rotation.CLOCKWISE_180) {
                villagerPos = position.up(4).south(5).west(4);
            }
            if (rotation == Rotation.COUNTERCLOCKWISE_90) {
                villagerPos = position.up(4).west(5).north(4);
            }
            villager.setLocationAndAngles(villagerPos.getX() + 0.5D, villagerPos.getY() + 0.5D, villagerPos.getZ() + 0.5D, 0, 0);
            worldIn.spawnEntity(villager);
            component.villagerCount++;
        }
        return true;
    }
}