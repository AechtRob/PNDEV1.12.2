package net.lepidodendron.world.structure;

import net.lepidodendron.block.*;
import net.minecraft.block.BlockChest;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.template.ITemplateProcessor;
import net.minecraft.world.gen.structure.template.PlacementSettings;
import net.minecraft.world.gen.structure.template.Template;

import javax.annotation.Nullable;
import java.util.Random;

public class StructureDigSiteProcessTents implements ITemplateProcessor {

    public final float chance;
    public final Random random;

    public StructureDigSiteProcessTents(BlockPos pos, PlacementSettings settings) {
        this.chance = settings.getIntegrity();
        this.random = settings.getRandom(pos);
    }

    @Nullable
    public Template.BlockInfo processBlock(World worldIn, BlockPos pos, Template.BlockInfo blockInfoIn) {
        if (blockInfoIn.blockState.getBlock() instanceof BlockChest) {
            Random rand = new Random(worldIn.getSeed() + pos.toLong());
            NBTTagCompound tag = blockInfoIn.tileentityData == null ? new NBTTagCompound() : blockInfoIn.tileentityData;
            tag.setString("LootTable", "lepidodendron:digsite_chest");
            tag.setLong("LootTableSeed", rand.nextLong());
            Template.BlockInfo newInfo = new Template.BlockInfo(pos, blockInfoIn.blockState, tag);
            return newInfo;
        } else if (blockInfoIn.blockState.getBlock() == Blocks.BED) {
            NBTTagCompound tag = blockInfoIn.tileentityData == null ? new NBTTagCompound() : blockInfoIn.tileentityData;
            tag.setInteger("color", 7);
            Template.BlockInfo newInfo = new Template.BlockInfo(pos, blockInfoIn.blockState, tag);
            return newInfo;
        }
        return new Template.BlockInfo(pos, getBiomeSpecificBlockState(blockInfoIn.blockState, worldIn, pos), null);
    }


    protected IBlockState getBiomeSpecificBlockState(IBlockState blockstateIn, World world, BlockPos pos) {

        if (blockstateIn.getBlock() == BlockAnemone1Dead.block) {
            int i = random.nextInt(9);
            switch (i) {
                case 0: default:
                    return BlockAnemone1Dead.block.getDefaultState();

                case 1:
                    return BlockAnemone2Dead.block.getDefaultState();

                case 2:
                    return BlockAnemone3Dead.block.getDefaultState();

                case 3:
                    return BlockAnemone4Dead.block.getDefaultState();

                case 4:
                    return BlockAnemone5Dead.block.getDefaultState();

                case 5:
                    return BlockAnemone6Dead.block.getDefaultState();

                case 6:
                    return BlockAnemone7Dead.block.getDefaultState();

                case 7:
                    return BlockAnemone8Dead.block.getDefaultState();

                case 8:
                    return BlockAnemone9Dead.block.getDefaultState();
            }

        }

        if (blockstateIn.getBlock() == Blocks.WOOL) {
            return Blocks.WOOL.getStateFromMeta(12);
        }

        Biome biome = world.getBiome(pos);
        if (blockstateIn.getBlock() == Blocks.DIRT) {
            if (biome.topBlock.getMaterial() == Material.GRASS
                    || biome.topBlock.getBlock() == Blocks.DIRT) {
                return Blocks.DIRT.getStateFromMeta(1);
            }
            if (biome.topBlock == Blocks.SAND.getStateFromMeta(0)) {
                return Blocks.SANDSTONE.getStateFromMeta(0);
            }
            if (biome.topBlock == Blocks.SAND.getStateFromMeta(1)) {
                return Blocks.RED_SANDSTONE.getStateFromMeta(0);
            }
            if (biome.topBlock == BlockSandBlack.block) {
                return BlockSandstoneBlack.block.getDefaultState();
            }
            if (biome.topBlock == BlockSandPangaean.block) {
                return BlockSandstonePangaean.block.getDefaultState();
            }
            if (biome.topBlock == BlockSandWhite.block) {
                return BlockSandstoneWhite.block.getDefaultState();
            }
            if (biome.topBlock == BlockSandPaleoproterozoic.block) {
                return BlockSandstonePaleoproterozoic.block.getDefaultState();
            }
            return biome.fillerBlock;
        }

        if (blockstateIn.getBlock() == Blocks.STONE) {
            if (biome.topBlock == Blocks.SAND.getStateFromMeta(0)) {
                return Blocks.SANDSTONE.getStateFromMeta(0);
            }
            if (biome.topBlock == Blocks.SAND.getStateFromMeta(1)) {
                return Blocks.RED_SANDSTONE.getStateFromMeta(0);
            }
            if (biome.topBlock == BlockSandBlack.block) {
                return BlockSandstoneBlack.block.getDefaultState();
            }
            if (biome.topBlock == BlockSandPangaean.block) {
                return BlockSandstonePangaean.block.getDefaultState();
            }
            if (biome.topBlock == BlockSandWhite.block) {
                return BlockSandstoneWhite.block.getDefaultState();
            }
            if (biome.topBlock == BlockSandPaleoproterozoic.block) {
                return BlockSandstonePaleoproterozoic.block.getDefaultState();
            }
            return biome.topBlock;
        }

        return blockstateIn;
    }

}